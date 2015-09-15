package com.example.lesson14;

/**
 * Created by akkuma on 2015/09/15.
 */
public class ChatItem {

    private String userName;
    private String messageBody;

    public ChatItem(String userName, String messageBody) {
        this.userName = userName;
        this.messageBody = messageBody;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMessageBody() {
        return messageBody;
    }

    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody;
    }
}
