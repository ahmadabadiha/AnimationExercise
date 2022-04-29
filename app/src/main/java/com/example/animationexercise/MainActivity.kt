package com.example.animationexercise

import android.animation.AnimatorSet
import android.animation.LayoutTransition
import android.animation.ObjectAnimator
import android.animation.ValueAnimator
import android.graphics.Color
import android.graphics.drawable.Animatable
import android.graphics.drawable.AnimatedVectorDrawable
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.animation.*
import android.widget.Toast
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat
import com.example.animationexercise.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!
    private lateinit var forwardAnimation: AnimationDrawable
    private lateinit var vectorAnimation: AnimatedVectorDrawable
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            // binding.root.layoutTransition.enableTransitionType(LayoutTransition.DISAPPEARING)

            fab.setOnClickListener {
                Toast.makeText(this@MainActivity, "Hello world", Toast.LENGTH_SHORT).show()

                button.visibility = View.VISIBLE
            }
/*

            val anim1 = ValueAnimator.ofFloat(-500f).apply {
                duration = 2000

                addUpdateListener {
                    fab.translationX = (this.animatedValue as Float)
                }
            }
            val anim2 = ObjectAnimator.ofFloat(fab, "translationY", 1000f).apply {
                duration = 2000
                interpolator = DecelerateInterpolator()

            }
             val anim3 = ObjectAnimator.ofFloat(fab, "alpha", 0f, 1f).apply {
                 duration = 2000

             }
            AnimatorSet().apply {
                play(anim1).before(anim2)
                start()
            }*/

            /*     iv.apply {
                     setBackgroundResource(R.drawable.animated_drawable)
                     forwardAnimation = background as AnimationDrawable
                     setOnClickListener {
                         forwardAnimation.start()
                     }
                 }
    */

        }
        /*     val icon = AnimatedVectorDrawableCompat.create(this,R.drawable.vectoranimator)!!
             binding.iv.setImageDrawable(icon)
             binding.iv.setOnClickListener {
                 icon.start()
             }*/

        /*
        val rotate = RotateAnimation(0f, 360f, Animation.RELATIVE_TO_PARENT, 0.5f, Animation.RELATIVE_TO_PARENT, 0.5f)
        rotate.duration = 5000
        rotate.interpolator = LinearInterpolator()
        rotate.repeatCount = Animation.INFINITE
        binding.fab.startAnimation(rotate)*/
        val anim2 = ObjectAnimator.ofArgb(binding.iv, "backgroundColor", Color.RED, Color.BLACK).apply {
            duration = 2000
            interpolator = DecelerateInterpolator()
            start()
        }


    }
}
