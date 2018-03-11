package com.sdkpalestra.votainformadope

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.sdkpalestra.votainformadope.distrito.Distrito
import com.sdkpalestra.votainformadope.distrito.DistritoRecyclerViewAdapter
import kotlinx.android.synthetic.main.activity_distritos.*

class DistritosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_distritos)

        val mRecyclerView = recycler_view
        mRecyclerView.setHasFixedSize(true) // Evitar errores

        mRecyclerView.layoutManager = LinearLayoutManager(this)
        var distritos: MutableList<Distrito> = mutableListOf()
        distritos.add(Distrito("SJL"))
        distritos.add(Distrito("Rimac"))
        distritos.add(Distrito("Independencia"))
        distritos.add(Distrito("Comas"))

        var distritoRecyclerView = DistritoRecyclerViewAdapter(this, distritos)
        mRecyclerView.adapter = distritoRecyclerView

//        mRecyclerView.addOnItemTouchListener()

    }
}
