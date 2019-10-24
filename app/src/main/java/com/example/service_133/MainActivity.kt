package com.example.service_133

import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_fb.setOnClickListener({
            val i = Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.facebook.com/ langitinspirasi"))
                startActivity(i)
        })

        btn_ig.setOnClickListener({
            val i = Intent(Intent.ACTION_VIEW,
                Uri.parse("http//www.instagram.com/ langitinspirasi.co.id"))
            startActivity(i)
        })

        var MediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.adele)

        btn_p.setOnClickListener{
            MediaPlayer?.start()
        }

        btn_ps.setOnClickListener{
            MediaPlayer?.pause()
        }

        btn_stp.setOnClickListener{
            MediaPlayer?.pause()
            MediaPlayer?.seekTo(0)
        }
    }
}
