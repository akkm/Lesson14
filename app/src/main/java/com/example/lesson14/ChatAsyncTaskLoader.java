package com.example.lesson14;

import android.content.Context;
import android.support.v4.content.AsyncTaskLoader;

import java.util.List;

/**
 * Created by akkuma on 2015/09/15.
 */
public class ChatAsyncTaskLoader extends AsyncTaskLoader<List<ChatItem>> {
    public ChatAsyncTaskLoader(Context context) {
        super(context);
    }

    @Override
    protected void onStartLoading() {
        super.onStartLoading();
        forceLoad();
    }

    @Override
    public List<ChatItem> loadInBackground() {
        List<ChatItem> result = new ChatFetcher().fetch();

        return result;
    }
}
