package com.example.lesson14;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by akkuma on 2015/09/15.
 */
public class ChatFetcher {

    private static final int JAPAN_WOEID = 23424856;

    public List<ChatItem> fetch() {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // do nothing
        }

        List<ChatItem> chatItems = new ArrayList<>();

        chatItems.add(new ChatItem("Atsuto Yamada", "遅れて出てくるエントリー"));

        return chatItems;
    }

}
