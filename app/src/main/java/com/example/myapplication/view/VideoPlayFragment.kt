package com.example.myapplication.view


import android.graphics.Color
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.myapplication.R
import com.example.myapplication.data.FavouriteVideo
import com.example.myapplication.databinding.FragmentVideoplayBinding
import com.example.myapplication.viewmodel.FavouriteVideoViewModel


class VideoPlayFragment : Fragment()  {

    private var _binding: FragmentVideoplayBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    private lateinit var mFavouriteVideoViewModel: FavouriteVideoViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View?
    {

        _binding = FragmentVideoplayBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //getYoutubeVideoIdFromUrlLiveData()
        //  initilizePlayer("https://www.youtube.com/watch?v=F9UC9DY-vIU")

        mFavouriteVideoViewModel=ViewModelProvider(this).get(FavouriteVideoViewModel::class.java)
        val videolinkV= arguments?.getString("LinkName")
        binding.addFavouriteButton.setOnClickListener{

            if(videolinkV!=null) {
                if (mFavouriteVideoViewModel.isRowIsExist(videolinkV)) {
                    removeDataToDatabase(videolinkV)
                }
                else
                    insertDataToDatabase(videolinkV)
            }
        }

        binding.ButtonComeBack.setOnClickListener {
            findNavController().navigate(R.id.action_SecondFragment_to_FirstFragment)

        }

    }
    private fun insertDataToDatabase(videolinkV:String) {
        if(videolinkV!=null) {
            val favourvideo = FavouriteVideo(0, videolinkV)
                binding.addFavouriteButton.setBackgroundColor(Color.parseColor("#FFE800"))
                mFavouriteVideoViewModel.addfavouriteVideo(favourvideo)
                Toast.makeText(requireContext(),"Added Fav List ",Toast.LENGTH_LONG).show()
        }
    }
    private fun removeDataToDatabase(videolinkV: String) {
        mFavouriteVideoViewModel.deletefavouriteVideo(videolinkV)
        Toast.makeText(requireContext(), "Removed Favourite List ", Toast.LENGTH_LONG).show()
        binding.addFavouriteButton.setBackgroundColor(Color.parseColor("#FFFFFF"))

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