package com.example.lesson14;

import android.os.Bundle;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements LoaderManager.LoaderCallbacks<List<ChatItem>> {

    private static final int LOADER_ID = 1;
    private List<ChatItem> mChatItems;
    private ChatListAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mChatItems = new ArrayList<>();

        ChatItem item = new ChatItem("Atsuto Yamada", "こんばんは、みなさん！");

        mChatItems.add(item);

        item = new ChatItem("Keishin Yokomaku", "こんはんは！Atsuto！");

        mChatItems.add(item);

        mChatItems.add(new ChatItem("Takafumi Nanao", "みなさんよろしく"));

        mChatItems.add(new ChatItem("Hideyuki Kikuma", "こちらこそ〜"));


        mAdapter = new ChatListAdapter(this, mChatItems);

        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(mAdapter);

    }

    @Override
    protected void onStart() {
        super.onStart();
        // TODO 1
        getSupportLoaderManager().initLoader(LOADER_ID, null, this);
    }

    @Override
    public Loader<List<ChatItem>> onCreateLoader(int id, Bundle args) {
        // TODO 2
        ChatAsyncTaskLoader loader = new ChatAsyncTaskLoader(this);
        return loader;
    }

    @Override
    public void onLoadFinished(Loader<List<ChatItem>> loader, List<ChatItem> data) {
        // TODO 3

        mChatItems.addAll(data);

        mAdapter.notifyDataSetChanged();
    }

    @Override
    public void onLoaderReset(Loader<List<ChatItem>> loader) {

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
