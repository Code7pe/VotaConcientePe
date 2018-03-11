package com.sdkpalestra.votainformadope

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.orm.SugarContext
import org.jetbrains.anko.intentFor

class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        SugarContext.init(this)
    }

    fun login(view: View) {
        startActivity(intentFor<DistritosActivity>())
//        startActivity<DistritosActivity>
    }

    override fun onDestroy() {
        super.onDestroy()
        SugarContext.terminate()
    }
}
