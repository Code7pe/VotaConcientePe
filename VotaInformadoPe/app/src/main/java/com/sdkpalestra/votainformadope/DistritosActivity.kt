package com.sdkpalestra.votainformadope

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.sdkpalestra.votainformadope.distrito.Distrito
import com.sdkpalestra.votainformadope.distrito.DistritoRecyclerViewAdapter
import com.sdkpalestra.votainformadope.sugar.DistritoJ
import kotlinx.android.synthetic.main.activity_distritos.*

class DistritosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_distritos)

        // TOOLS: http://vysor.io/

        val mRecyclerView = recycler_view
        mRecyclerView.setHasFixedSize(true) // Evitar errores

        mRecyclerView.layoutManager = LinearLayoutManager(this)

        var distritoj = DistritoJ()
        distritoj.nombre = "SJL"
        distritoj.save()
        distritoj = DistritoJ()
        distritoj.nombre = "RIMAC"
        distritoj.save()
        distritoj = DistritoJ()
        distritoj.nombre = "INDEPENDENCIA"
        distritoj.save()
        distritoj = DistritoJ()
        distritoj.nombre = "COMAS"
        distritoj.save()

        var distritos: MutableList<Distrito> = mutableListOf()

        distritos.add(Distrito("SJL"))
        distritos.add(Distrito("Rimac"))
        distritos.add(Distrito("Independencia"))
        distritos.add(Distrito("Comas"))

        var distritoRecyclerView = DistritoRecyclerViewAdapter(this, distritos)
        mRecyclerView.adapter = distritoRecyclerView

        //TODO::https://www.youtube.com/watch?v=k6GSQRnDGog   Pasar todo a Kotlin
        //TODO::Buscar como se implementa mRecyclerView.addOnItemTouchListener (la mejor forma)
    }

}

