package me.yeojoy.livebarn.detail

import android.content.res.Configuration
import android.media.MediaPlayer
import android.os.Bundle
import android.view.SurfaceHolder
import android.view.WindowManager
import android.widget.ImageButton
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity
import me.yeojoy.livebarn.R
import me.yeojoy.livebarn.app.Constants
import me.yeojoy.livebarn.network.NetworkConstants

class VideoActivity : AppCompatActivity(), VideoContact.View {

    private lateinit var presenter: VideoContact.Presenter

    private lateinit var videoView: VideoView
    private var mediaPlayer: MediaPlayer? = MediaPlayer()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video)
        window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)

        setPresenter(VideoPresenter(this))
        presenter.onViewCreated()

        val imageButtonClose: ImageButton = findViewById(R.id.imageButtonClose)
        imageButtonClose.setOnClickListener {
            presenter.closeButtonClicked()
        }
        videoView = findViewById(R.id.videoView)
        val videoUrl: String = intent?.getStringExtra(Constants.KEY_VIDEO_URL) ?: NetworkConstants.VIDEO_URL

        initVideo(videoUrl)

    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)

        // Checks the orientation of the screen
//        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
//            Toast.makeText(this, "landscape", Toast.LENGTH_SHORT).show()
//        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT){
//            Toast.makeText(this, "portrait", Toast.LENGTH_SHORT).show()
//        }
    }

    override fun onDestroy() {
        presenter.onViewDestroyed()
        releaseMediaPlayer()
        super.onDestroy()
    }

    private fun initVideo(videoUrl: String) {
        mediaPlayer?.setOnPreparedListener {
            it.start()
        }

        videoView.holder.addCallback(object: SurfaceHolder.Callback {
            override fun surfaceCreated(holder: SurfaceHolder) {
                mediaPlayer.apply {
                    this?.setDataSource(videoUrl)
                    this?.setDisplay(holder)
                    this?.prepareAsync()
                }
            }

            override fun surfaceChanged(
                holder: SurfaceHolder,
                format: Int,
                width: Int,
                height: Int
            ) {

            }

            override fun surfaceDestroyed(holder: SurfaceHolder) {

            }
        })
    }

    private fun releaseMediaPlayer() {
        mediaPlayer?.stop()
        mediaPlayer?.release()
        mediaPlayer = null
    }

    override fun onClose() {
        releaseMediaPlayer()
        finish()
    }

    override fun setPresenter(presenter: VideoContact.Presenter) {
        this.presenter = presenter
    }
}
