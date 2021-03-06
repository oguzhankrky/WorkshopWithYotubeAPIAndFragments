package com.example.myapplication.view

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.myapplication.Extensions.hideKeyboard
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentListBinding
import com.example.workshopwithyotubeapi.view.Video.VideoAdapter
import com.example.workshopwithyotubeapi.viewmodel.ListVideoViewModel
import com.bumptech.glide.load.engine.executor.GlideExecutor.UncaughtThrowableStrategy.LOG
import com.example.myapplication.Extensions.focusChange


class ListFragment : Fragment() , VideoAdapter.ClickListener {


    private  var GET: SharedPreferences?= null
    private  var SET: SharedPreferences.Editor?= null
    private lateinit var viewModel: ListVideoViewModel
    private var _binding: FragmentListBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle? ): View?
    {
        _binding = FragmentListBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        GET = context?.getSharedPreferences("com.example.myapplication", Context.MODE_PRIVATE)
        SET= GET?.edit()
        viewModel = ViewModelProvider(this).get(ListVideoViewModel::class.java)
        focusSearchbar()
        firstInitialviewModel()
        getLiveData()
        RefreshPage()
        whenPushSearchButton()




/*
        arguments?.let {

        }

        binding.buttonFirst.setOnClickListener {
            val bundle = bundleOf("nameArg" to   "arabac??")
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment,bundle)
        }*/
    }

    override fun onClickListener(item: String) {
        val bundle = bundleOf("LinkName" to   item)

        findNavController().navigate(R.id.action_ListFragment_to_VideoPlayFragment,bundle)
    }
    fun focusSearchbar()
    {
        binding.editVideoName.focusChange {
            if(!it) binding.editVideoName.hideKeyboard()
        }
    }
    fun firstInitialviewModel(){


        var SearchWord=GET?.getString("q","Popular videos in turkey")
        binding.editVideoName.setText(SearchWord)
        if(SearchWord!=null) {
            viewModel.refreshData(SearchWord)
        }
    }
    private fun getLiveData(){
        viewModel.wmDataKeeper.observe(viewLifecycleOwner, { data ->
            data?.let {
                binding.recyclerview1.adapter = VideoAdapter(data.items,this)
            }
        })

    }
    private fun RefreshPage(){
        binding.refreshLayout.setOnRefreshListener {
            var SearchWord=GET?.getString("q","Popular videos in turkey")
            binding.editVideoName.setText(SearchWord)
            if(SearchWord!=null) {
                viewModel.refreshData(SearchWord)
            }

            binding.refreshLayout.isRefreshing=false
        }
    }
    private fun whenPushSearchButton()
    {
        binding.searchButton.setOnClickListener{
            var editVideoName = binding.editVideoName.text.toString()
            SET?.putString("q",editVideoName)
            SET?.apply()
            binding.editVideoName.hideKeyboard() //For close keyboard after searching.
            if(editVideoName!=null) {
                viewModel.refreshData(editVideoName)
            }
            getLiveData()
        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}