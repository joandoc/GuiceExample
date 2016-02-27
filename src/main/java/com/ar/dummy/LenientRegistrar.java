package com.ar.dummy;

/**
 * Created by Joan do Carmo on 09/11/15.
 */

import com.ar.Registrar;
import com.ar.Student;
import com.ar.StudentStore;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class LenientRegistrar implements Registrar {

    private final StudentStore studentStore;


    //When Guice creates this object, it will note the arguments to this constructor and attempt to supply
    // components which have the same type. Next, we’ll see how this binding is configured.

    @Inject
    public LenientRegistrar(StudentStore studentStore) {
        this.studentStore = studentStore;
    }

    public boolean checkStudentStatus(Integer studentId) {
        boolean status = false;

        Student student = studentStore.load( studentId );

        if( student != null && student.getCredits() != null ) {
            status = student.getCredits() >= 10.0;
        }
        return status;

    }

    public Student registerStudent(String name, Integer credits) {
        Student s = new Student();
        s.setName( name );
        s.setCredits( credits );
        return studentStore.save( s );
    }

}
