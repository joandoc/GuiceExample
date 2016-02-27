package com.ar.dummy;

/**
 * Created by Joan do Carmo on 09/11/15.
 */

import com.ar.Student;
import com.ar.StudentStore;

import javax.inject.Singleton;
import java.util.HashMap;
import java.util.Map;



//This is a hint to Guice that there should only be one instance of the DummyStudentStore
@Singleton
public class DummyStudentStore implements StudentStore {

    private final Map<Integer,Student> studentMap;

    public DummyStudentStore() {
        studentMap = new HashMap<Integer, Student>();
    }

    public boolean exists(Integer id) {
        return studentMap.containsKey( id );
    }

    public Student load(Integer id) {
        Student s = studentMap.get(id);
        return s;
    }

    public Student save(Student p) {
        if( p.getId() == null ) {
            p.setId( studentMap.size() + 1 );
        }
        studentMap.put( p.getId(), p );
        return p;
    }

}
