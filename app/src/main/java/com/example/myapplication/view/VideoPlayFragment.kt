package com.example.myapplication.view

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.myapplication.R
import com.example.myapplication.databinding.ActivityDetayBinding.inflate
import com.example.myapplication.databinding.FragmentListBinding
import com.example.myapplication.databinding.FragmentVideoplayBinding
import com.google.android.youtube.player.*


class VideoPlayFragment : Fragment()  {

    private var _binding: FragmentVideoplayBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View?
    {

        _binding = FragmentVideoplayBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //getYoutubeVideoIdFromUrlLiveData()

        var videoId= arguments?.getString("LinkName")
        //  initilizePlayer("https://www.youtube.com/watch?v=F9UC9DY-vIU")
        print(videoId)

        binding.ButtonComeBack.setOnClickListener {

            findNavController().navigate(R.id.action_SecondFragment_to_FirstFragment)

        }


    }

    /*private fun getYoutubeVideoIdFromUrlLiveData()
    {

        var videoId= arguments?.getString("LinkName")


        getYoutubeVideoIdFromUrl("https://www.youtube.com/watch?v=$videoId")?.let {
            initilizePlayer(it)
        }
    }

    private fun initilizePlayer(videoId:String){
        binding.youtubeplayer.initialize(getString(R.string.api_key),
            @SuppressLint("ValidFragment")
            object : YouTubePlayerFragment.OnInitializedListener
        {
            override fun onInitializationSuccess(
                p0: YouTubePlayer.Provider?,
                p1: YouTubePlayer?,
                p2: Boolean
            ) {
                if (p1 != null) {
                    p1.loadVideo(videoId)
                }
                if (p1 != null) {
                    p1.play()
                }
            }

            override fun onInitializationFailure(
                p0: YouTubePlayer.Provider?,
                p1: YouTubeInitializationResult?
            ) {
               // Toast.makeText(applicationContext,"error", Toast.LENGTH_LONG).show()
            }

        })
    }
    */
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}