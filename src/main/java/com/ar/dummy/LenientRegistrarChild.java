package com.ar.dummy;

import com.ar.StudentStore;
import com.google.inject.Singleton;

import javax.inject.Inject;

/**
 * Created by Joan do Carmo on 09/11/15.
 */

@Singleton
public class LenientRegistrarChild extends LenientRegistrar {


    @Inject
    public LenientRegistrarChild(StudentStore studentStore) {
        super(studentStore);
        System.out.println("");
        System.out.println("en el hijo");


    }


}
