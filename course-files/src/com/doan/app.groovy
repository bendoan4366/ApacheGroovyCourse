package com.doan
import com.doan.Developer
import com.doan.Tweet

import java.time.LocalDateTime
import java.util.regex.*


class app extends Script {

    def run() {

        Tweet t = new Tweet(userName: "kndoan211", id: 1094, messageText: "yeeeet yuh")
        t.dateSent= Date.parse("MM/DD/YYYY","10/24/1994")
        t.sendTweet()
        t.likeTweet()
        t.likeTweet()
        t.retweet()


        Tweet t2 = new Tweet(userName: "abc123", id: 1111, messageText: "yeeeee")
        t2.dateSent = LocalDateTime.now().toDate()

        for(int i=0; i<200; i++){
            t2.likeTweet()
            t2.retweet()
        }

        println t
        println t2

        t.checkPopularity()
        t2.checkPopularity()
        
    }

}
