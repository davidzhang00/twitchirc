package com.cavariux.twitchirc.Core;

public class Main {

    public static void main(String[] args) {

        /**
         * Use the joinChannel method to join a channel.
         * #channelname where channel name is in all lower case.
         */

        DZBot bot = new DZBot();
        bot.connect();
        bot.joinChannel("#dansgaming");
//        bot.joinChannel("#lirik");
//        bot.joinChannel("cohhcarnage");
        bot.start();
    }
}
