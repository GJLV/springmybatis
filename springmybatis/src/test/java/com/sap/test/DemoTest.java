package com.sap.test;

import com.sap.dao.Student;
import com.sap.dao.mapper.StudentMapper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoTest {
    @Test
    public void testGet(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("/applicationContext.xml");

        StudentMapper studentMapper = context.getBean("studentMapper", StudentMapper.class);

        Student studentById = studentMapper.findStudentById(2);
        System.out.println(studentById.getUsername());
        System.out.println(studentById.getEmail());
        System.out.println(studentById.getPassword());

    }
}
