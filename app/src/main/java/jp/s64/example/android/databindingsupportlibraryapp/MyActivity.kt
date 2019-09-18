package jp.s64.example.android.databindingsupportlibraryapp

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import jp.s64.example.android.databindingsupportlibraryapp.databinding.MyActivityBinding

class MyActivity : AppCompatActivity() {

    private lateinit var binding: MyActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.my_activity)

        binding.mainText = "Hello World!"
    }

}
