package hu.bme.aut.lifecycledemo

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    companion object {
        const val TAG_LIFE = "TAG_LIFE"
    }

    var score = 5


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG_LIFE, "onCreate called")

        if (savedInstanceState != null) {
            score = savedInstanceState.getInt("KEY_SCORE")
        }

        enableEdgeToEdge()

        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("KEY_SCORE", score)
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG_LIFE, "onStart called")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG_LIFE, "onResume called")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG_LIFE, "onPause called")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG_LIFE, "onStop called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG_LIFE, "onDestroy called")
    }
}