package md.endava.internship.kotlinpractice

import android.animation.ObjectAnimator
import android.animation.PropertyValuesHolder
import android.animation.ValueAnimator
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.animation.doOnEnd
import com.google.android.material.snackbar.Snackbar
import java.lang.Thread.currentThread
import java.lang.Thread.sleep


class MainActivity : AppCompatActivity(), MainActivityProvider.View {

    private lateinit var tvMessage : TextView
    private lateinit var ivLemons : ImageView

    private var provider : MainActivityProvider = MainActivityProvider(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvMessage = findViewById(R.id.tvMessage)
        ivLemons = findViewById(R.id.ivLemons)

        ivLemons.setOnClickListener{
            if(provider.canGoNext())
                update(provider.nextStage())
        }

        update(provider.nextStage())
    }


    override fun update(stage: Int) {
        when(stage) {
            1 -> {
                updateData(getString(R.string.select_lemon), R.drawable.lemon_tree)
            }
            2 -> {
                updateData(getString(R.string.juice_the_lemon), R.drawable.lemon_squeeze)
            }
            3 -> {
                updateData(getString(R.string.drink_lemon), R.drawable.lemon_drink)
            }
            4 -> {
                updateData(getString(R.string.start_again), R.drawable.lemon_restart)
            }

        }
    }

    override fun updateData(message : String, id : Int){
        tvMessage.text = message
        ivLemons.setImageResource(id)
    }

    override fun showSnackBar(count : Int) {
        Snackbar.make(
            findViewById(R.id.parent),
            getString(R.string.squeeze_count, count),
            Snackbar.LENGTH_SHORT
        ).show()
    }

    override fun scaleAnimation() {
        provider.updateGoNextState(false)

        val scalex = PropertyValuesHolder.ofFloat(View.SCALE_X, 1.1f)
        val scaley = PropertyValuesHolder.ofFloat(View.SCALE_Y, 1.1f)
        val anim: ObjectAnimator = ObjectAnimator.ofPropertyValuesHolder(ivLemons, scalex, scaley)
        anim.repeatCount = 1
        anim.repeatMode = ValueAnimator.REVERSE
        anim.duration = 300

        anim.start()

        anim.doOnEnd {
            provider.updateGoNextState(true)
        }
    }


}


