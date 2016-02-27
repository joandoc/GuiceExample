package com.ar;

/**
 * Created by Joan do Carmo on 09/11/15.
 */
public interface StudentStore {
    public boolean exists(Integer id);
    public Student load(Integer id);
    public Student save(Student p);
}