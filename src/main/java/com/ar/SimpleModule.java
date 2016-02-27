package com.ar;

/**
 * Created by Joan do Carmo on 09/11/15.
 */

import com.ar.dummy.DummyStudentStore;
import com.ar.dummy.LenientRegistrar;
import com.ar.dummy.LenientRegistrarChild;
import com.google.inject.AbstractModule;

public class SimpleModule extends AbstractModule {

    @Override
    protected void configure() {

        bind(StudentStore.class).to(DummyStudentStore.class);
        bind(Registrar.class).to(LenientRegistrar.class);
        bind(LenientRegistrar.class).to(LenientRegistrarChild.class);
    }

}