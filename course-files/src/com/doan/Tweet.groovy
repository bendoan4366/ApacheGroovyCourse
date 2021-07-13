package com.doan

import groovy.transform.Immutable
import groovy.transform.ToString

@ToString
class Tweet {

    int id
    String userName
    String messageText
    Date dateSent
    int likes
    int retweets

    void sendTweet() {
        println "$userName sent tweet id $id at" + this.dateSent.toString() + ". The message was $messageText"
    }

    void likeTweet() {
        this.likes++

    }

    void retweet() {
        this.retweets++
    }

    void checkPopularity() {

        def total_activity = this.likes + this.retweets
        if (total_activity < 10) {
            println "not popular"
        } else if (total_activity < 100) {
            println "moderately popular"
        } else {
            println "super popular"
        }
        switch (total_activity) {
            case 10:
                println "twitter bronze"
            case 100:
                println "twitter silver"
            case 1000:
                println "twitter platinum"
            default:
                println "no plaque"
        }

    }

}

@Immutable
class ArchivedTweet {

    int id
    String userName
    String messageText
    Date dateSent
    int likes
    int retweets

}

