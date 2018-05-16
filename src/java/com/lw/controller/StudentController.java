package com.lw.controller;

import com.lw.enetity.Student;
import com.lw.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping("/getList")
    public String getList() {
        List<Student> studentList = this.studentService.getLis();
        return "";
    }
}
