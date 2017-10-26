package com.kaishengit.mappers;

import com.kaishengit.entity.Student;

import java.util.List;

/**
 * Created by Administrator on 2017/10/25.
 */
public interface StudentMapper {

   Student findByIdWithDept(Integer id);

   List<Student> findALL();
}
