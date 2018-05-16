package com.lw.dao;

import com.lw.enetity.Student;

import java.util.List;

public interface StudentDao {
    List<Student> findByParams();
}
