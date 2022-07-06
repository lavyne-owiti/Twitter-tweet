package dev.lavyne.twittertimelineapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Tweets_RecyclerView_Adapter(var tweetList:List<Tweets>)
    :RecyclerView.Adapter<TweetRecylerView>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TweetRecylerView {
        var itemView=LayoutInflater.from(parent.context)
            .inflate(R.layout.tweet_list_item,parent,false)
        return TweetRecylerView(itemView)
    }

    override fun onBindViewHolder(holder: TweetRecylerView, position: Int) {
        var currentTweets=tweetList.get(position)
        holder.tvName.text=currentTweets.name
        holder.tvHandle.text=currentTweets.handler
        holder.tvTime.text=currentTweets.time
        holder.tvTweets.text=currentTweets.tweet
        holder.tvCount.text=currentTweets.messageCount.toString()
        holder.tvRetweets.text=currentTweets.retweetNum.toString()
        holder.tvLikes.text=currentTweets.likeNum.toString()

    }

    override fun getItemCount(): Int {
        return tweetList.size
    }
}
class TweetRecylerView(itemView:View):RecyclerView.ViewHolder(itemView){
    var tvTweets=itemView.findViewById<TextView>(R.id.tvTweet)
    var tvName=itemView.findViewById<TextView>(R.id.tvName)
    var tvHandle=itemView.findViewById<TextView>(R.id.tvHandle)
    var tvTime=itemView.findViewById<TextView>(R.id.tvTime)
    var tvCount=itemView.findViewById<TextView>(R.id.tvCount)
    var tvRetweets=itemView.findViewById<TextView>(R.id.tvTweetCount)
    var tvLikes=itemView.findViewById<TextView>(R.id.tvLikes)
    var imgMessage=itemView.findViewById<ImageView>(R.id.imgMessage)
    var imgLikes=itemView.findViewById<ImageView>(R.id.imgLikes)
    var imgUpload=itemView.findViewById<ImageView>(R.id.imgUpload)
    var imgRetweets=itemView.findViewById<ImageView>(R.id.imgRetweet)
    var imgPerson=itemView.findViewById<ImageView>(R.id.imgPerson)



}