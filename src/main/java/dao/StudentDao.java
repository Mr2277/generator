package dao;

import entity.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Author unknown
 * Date  2020-02-19
 */
@Mapper
public interface StudentDao {

    public Student get(String id);

    public List<Student> findList(Student student);

    public List<Student> findAllList();

    public int insert(Student student);

    public int insertBatch(List<Student> students);

    public int update(Student student);

    public int delete(Student student);

}