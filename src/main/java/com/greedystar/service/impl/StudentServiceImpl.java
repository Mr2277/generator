package com.greedystar.service.impl;

import com.greedystar.dao.StudentDao;
import com.greedystar.entity.Student;
import com.greedystar.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author unknown
 * Date  2020-02-20
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;
    
    @Override
    public Student get(String id){
        return studentDao.get(id);
    }
    
    @Override
    public List<Student> findList(Student student) {
        return studentDao.findList(student);
    }
    
    @Override
    public List<Student> findAllList() {
        return studentDao.findAllList();
    }
    
    @Override
    public int insert(Student student) {
        return studentDao.insert(student);
    }
    
    @Override
    public int insertBatch(List<Student> students){
        return studentDao.insertBatch(students);
    }
    
    @Override
    public int update(Student student) {
        return studentDao.update(student);
    }
    
    @Override
    public int delete(Student student) {
        return studentDao.delete(student);
    }

}
