package com.lw.service;

import com.lw.dao.StudentDao;
import com.lw.enetity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("studentService")
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;

    @Override
    @Transactional(readOnly = true)
    public List<Student> getLis() {
        return this.studentDao.findByParams();
    }
}
