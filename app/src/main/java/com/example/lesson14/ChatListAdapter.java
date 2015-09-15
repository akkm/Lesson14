package com.example.lesson14;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by akkuma on 2015/09/15.
 */
public class ChatListAdapter extends ArrayAdapter<ChatItem> {

    public ChatListAdapter(Context context, List<ChatItem> objects) {
        super(context, R.layout.example_list_item, R.id.userName, objects);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = super.getView(position, convertView, parent);
        ChatItem item = getItem(position);
        TextView userName = (TextView) view.findViewById(R.id.userName);
        userName.setText(item.getUserName());
        TextView messageBody = (TextView) view.findViewById(R.id.messageBody);
        messageBody.setText(item.getMessageBody());
        return view;
    }
}
