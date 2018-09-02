package com.kotlin.tutorial.coroutines.activity

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.kotlin.tutorial.coroutines.R
import kotlinx.android.synthetic.main.activity_main.*

/**
 *
 * @FileName:
 *          com.kotlin.tutorial.coroutines.activity.MainActivity.kt
 * @author: Tony Shen
 * @date: 2018-09-02 14:13
 * @version: V1.0 <描述当前版本功能>
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        text1.setOnClickListener {

            val intent = Intent(this,Demo4OnClickActivity::class.java)
            startActivity(intent)
        }
    }
}