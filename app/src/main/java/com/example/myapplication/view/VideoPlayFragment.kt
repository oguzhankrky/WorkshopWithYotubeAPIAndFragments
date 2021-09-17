package com.example.myapplication.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentVideoplayBinding
import com.google.android.youtube.player.YouTubeInitializationResult
import com.google.android.youtube.player.YouTubePlayer


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

        /*binding.textviewSecond.text = arguments?.getString("nameArg")


        binding.buttonSecond.setOnClickListener {

            findNavController().navigate(R.id.action_SecondFragment_to_FirstFragment)

        }*/

    }

    /*private fun getYoutubeVideoIdFromUrlLiveData()
    {
        //var videoId= intent.getStringExtra("videoId")
        getYoutubeVideoIdFromUrl("https://www.youtube.com/watch?v=$videoId")?.let {
            initilizePlayer(it)
        }
    }*/

    private fun initilizePlayer(videoId:String){
        binding.youtubeplayer.initialize(getString(R.string.api_key),object : YouTubePlayer.OnInitializedListener
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

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}