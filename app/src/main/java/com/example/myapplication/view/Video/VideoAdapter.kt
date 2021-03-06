package com.example.workshopwithyotubeapi.view.Video

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.workshopwithyotubeapi.model.Item
import com.squareup.picasso.Picasso
import com.example.myapplication.R
import com.example.myapplication.databinding.ActivityDetailBinding

lateinit var name:String

class VideoAdapter (private val videoList: List<Item>,private val listener: ClickListener) :
    RecyclerView.Adapter<VideoAdapter.VideoViewHolder>() {
    interface ClickListener {
        fun onClickListener(item: String)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VideoViewHolder {
        val inf = LayoutInflater.from(parent.context)
        val binding: ActivityDetailBinding = DataBindingUtil.inflate(inf, R.layout.activity_detail,parent,false )
        return VideoViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return videoList.size
    }

    override fun onBindViewHolder(holder: VideoViewHolder, position: Int) {
        holder.bind(videoList[position])
    }

    inner class VideoViewHolder( binding: ActivityDetailBinding) : RecyclerView.ViewHolder(binding.root) {


        init {
            binding.root.setOnClickListener {
                listener.onClickListener(videoList[adapterPosition].id.videoId)
                //videoList[adapterPosition].id.videoId

            }
        }

        val videoImage = binding.videoPhoto
        val videoText = binding.videoName

         fun bind(youtubeItem: Item) {
            Picasso.get().load(youtubeItem.snippet.thumbnails.high.url).into(videoImage)
            videoText.text = youtubeItem.snippet.title

        }
    }

}


