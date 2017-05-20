package edu.fameg.android.chatbotnews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import ai.api.android.AIService;

public class ChatActivity extends AppCompatActivity {

    private AIService aiService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
    }


    
}
