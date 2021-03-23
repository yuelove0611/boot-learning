package soft1921.boot.mybatis.mapper;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import soft1921.boot.mybatis.domain.Teacher;


import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
@ExtendWith(SpringExtension.class)


class TeacherMapperTest {
    @Resource
    private TeacherMapper teacherMapper;
    @Test
    void selectAll(){
        List<Teacher> teacherList=teacherMapper.selectAll();
        System.out.println(teacherList);
    }
    @Test
    void findAll(){
        List<Teacher> teacherList=teacherMapper.findAll();
        System.out.println(teacherList);
    }
  @Test
    void insertTeacher(){
        Teacher teacher=Teacher.builder().teacherName("杨老师").clazzId(1).build();
        teacherMapper.insertTeacher(teacher);
  }
}