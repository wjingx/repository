package com.kaishengit.mappers;

import com.kaishengit.com.kaishengit.util.MybatisUtil;
import com.kaishengit.entity.Dept;
import com.kaishengit.entity.Student;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * Created by Administrator on 2017/10/25.
 */
public class StudentMapperTest {
    private SqlSession sqlSession;
    private StudentMapper studentMapper;
    @Before
    public void init(){
        sqlSession = MybatisUtil.getSqlSession();
        studentMapper = sqlSession.getMapper(StudentMapper.class);
    }
    @After
    public void after(){
        sqlSession.close();
    }


    @Test
    public void findByIdWithDeptTest(){
        Student student = studentMapper.findByIdWithDept(2);
//        List<Student> studentList = studentMapper.findByIdWithDept(3);
//        for (Student student : studentList){
//            System.out.println(student);
//        }
        System.out.println(student);
        System.out.println(student.getDeptList().size());
        List<Dept> deptList = student.getDeptList();
        for (Dept dept : deptList){
         System.out.println(dept);
        }
    }


}
