package com.ar;

/**
 * Created by Joan do Carmo on 09/11/15.
 */

public interface Registrar {
    public boolean checkStudentStatus( Integer studentId );
    public Student registerStudent( String name, Integer credits );
}