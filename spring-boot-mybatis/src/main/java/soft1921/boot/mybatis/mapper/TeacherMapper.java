package soft1921.boot.mybatis.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import soft1921.boot.mybatis.domain.Teacher;

import java.util.List;


public interface TeacherMapper {
    /**
     * 返回所有的teacher:用注解实现
     * @return  List<Teacher>
     */
    @Select("SELECT *FROM t_teacher")
  List<Teacher> selectAll();

    /**
     * 返回所有的teacher:用xml实现
     * @return  List<Teacher>
     */
    List <Teacher> findAll();


    void insertTeacher (Teacher teacher);
}