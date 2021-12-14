package com.example.englishassistant2;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button hello, bye, goodbye, listen, look, no, please, sorry, thank, yes;
    private MediaPlayer helloSound, byeSound, goodbyeSound, listenSound, lookSound, noSound, pleaseSound, sorrySound, thankSound, yesSound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hello = (Button) findViewById (R.id.buttonhelllo);
        bye = (Button) findViewById (R.id.buttonbye);
        goodbye = (Button) findViewById (R.id.buttongood);
        listen = (Button) findViewById (R.id.buttonlisten);
        look = (Button) findViewById (R.id.buttonlook);
        no = (Button) findViewById (R.id.buttonno);
        please = (Button) findViewById (R.id.buttonplease);
        sorry = (Button) findViewById (R.id.buttonsorry);
        thank = (Button) findViewById (R.id.buttonthank);
        yes = (Button) findViewById (R.id.buttonyes);

        helloSound = MediaPlayer.create(this, R.raw.hello);
        byeSound = MediaPlayer.create(this, R.raw.bye);
        goodbyeSound = MediaPlayer.create(this, R.raw.goodbye);
        listenSound = MediaPlayer.create(this, R.raw.listen);
        lookSound = MediaPlayer.create(this, R.raw.look);
        noSound = MediaPlayer.create(this, R.raw.no);
        pleaseSound = MediaPlayer.create(this, R.raw.please);
        sorrySound = MediaPlayer.create(this, R.raw.sorry);
        thankSound = MediaPlayer.create(this, R.raw.thankyou);
        yesSound = MediaPlayer.create(this, R.raw.yes);

        Sound();
    }
    public void Sound()
    {
        hello.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        soundPlay (helloSound);
                    }
                }
        );
        bye.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        soundPlay (byeSound);
                    }
                }
        );
        goodbye.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        soundPlay (goodbyeSound);
                    }
                }
        );
        listen.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        soundPlay (listenSound);
                    }
                }
        );
        look.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        soundPlay (lookSound);
                    }
                }
        );
        no.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        soundPlay (noSound);
                    }
                }
        );
        please.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        soundPlay (pleaseSound);
                    }
                }
        );
        sorry.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        soundPlay (sorrySound);
                    }
                }
        );
        thank.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        soundPlay (thankSound);
                    }
                }
        );
        yes.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        soundPlay (yesSound);
                    }
                }
        );

    }
    public void soundPlay(MediaPlayer sound){
        sound.start();
    }
}