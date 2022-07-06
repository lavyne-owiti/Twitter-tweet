package dev.lavyne.twittertimelineapplication

data class Tweets(var name:String,
                  var handler:String,
                  var time:String,
                  var tweet:String,
                  var messageCount:Int,
                  var retweetNum:Int,
                  var likeNum:Int,
                  )
