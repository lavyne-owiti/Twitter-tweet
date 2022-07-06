package dev.lavyne.twittertimelineapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dev.lavyne.twittertimelineapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        displayViews()
    }
    fun displayViews(){
        var tweet=Tweets("Lavyn","@lavyn_pip","3h","Things aren’t perfect right now but,I’m grateful for what I have now",375,69,245)
        var tweets=Tweets("mani","@mani_pilution","2h","I know that more good is on its way; patience is a virtue",75,47,45)
        var tweet1=Tweets("locat","@locat_adldja","20min","Programming is like a spiral.You will eventually go back to where you started and learn it better. ",22,35,25)
        var tweet2=Tweets("popa","@popa_dbam","3h","This is a key to learning programming,try and try again",12,3,2)
        var tweet3=Tweets("helta","@helta_andl","4h","Yep.Nothing is impossible.I have the express way view.Tandragee code sawasawa",4,5,5)
        var tweet4=Tweets("fasde","fasde_bdsk@","45min","When I pack too much for a short trip.",5,30,20)
        var tweet5=Tweets("fjlaw","@law_fjioa","30min","anyone else pack pants and underwear as if they plan on shitting themselves 3 times a day?",29,37,200)
        var tweet6=Tweets("zinc","@zinc_nimds","1d","what’s everyone’s favorite disturbing yet hilarious subtitle from stranger things season 4 mines",7,55,10)
        var tweet7=Tweets("Lavyn","@lavyn_pip","3h","Things aren’t perfect right now but,I’m grateful for what I have now",375,69,245)
        var tweet8=Tweets("mani","@mani_pilution","2h","I know that more good is on its way; patience is a virtue",75,47,45)
        var tweet9=Tweets("locat","@locat_adldja","20min","Programming is like a spiral.You will eventually go back to where you started and learn it better. ",22,35,25)
        var tweet10=Tweets("popa","@popa_dbam","3h","This is a key to learning programming,try and try again",12,3,2)
        var tweet11=Tweets("helta","@helta_andl","4h","Yep.Nothing is impossible.I have the express way view.Tandragee code sawasawa",4,5,5)
        var tweet12=Tweets("fasde","fasde_bdsk@","45min","When I pack too much for a short trip.",5,30,20)
        var tweet13=Tweets("fjlaw","@law_fjioa","30min","anyone else pack pants and underwear as if they plan on shitting themselves 3 times a day?",29,37,200)
        var tweet14=Tweets("zinc","@zinc_nimds","1d","what’s everyone’s favorite disturbing yet hilarious subtitle from stranger things season 4 mines",7,55,10)
        var tweetList= listOf(tweet,tweet1,tweet2,tweet3,tweet4,tweet5,tweet6,tweets,tweet8,tweet7,tweet9,tweet10,tweet11,tweet12,tweet13,tweet14)
        binding.rvTweets.layoutManager=LinearLayoutManager(this)
        binding.rvTweets.adapter=Tweets_RecyclerView_Adapter(tweetList)
    }
}