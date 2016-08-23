package net.archeryc.multivideodemo;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import net.archeryc.multivideodemo.video.TextureVideoView;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    private TextureVideoView videoView1;
    private TextureVideoView videoView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        videoView1 = (TextureVideoView) findViewById(R.id.videoview_1);
        videoView2 = (TextureVideoView) findViewById(R.id.videoview_2);
        String filePath1= Environment.getExternalStorageDirectory()+File.separator+"VideoDemo"+File.separator+"video1.mp4";
        String filePath2= Environment.getExternalStorageDirectory()+File.separator+"VideoDemo"+File.separator+"video2.mp4";

        videoView1.setVideoPath(filePath1);
        videoView2.setVideoPath(filePath2);

        videoView1.start();
        videoView2.start();

    }
}
