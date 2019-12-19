package com.example.karan.videoplayer;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
VideoView v;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        v=findViewById(R.id.videoView);
        v.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.video));
        v.setMediaController(new MediaController(this));
        v.start();
    }
}
