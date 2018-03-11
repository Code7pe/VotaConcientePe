package com.sdkpalestra.votainformadope.sugar;

import com.orm.SugarRecord;
import com.orm.dsl.Unique;

/**
 * Created by Paul on 11/03/2018.
 */

public class DistritoJ extends SugarRecord {

    @Unique
    Long id;
    String Nombre;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }
}
