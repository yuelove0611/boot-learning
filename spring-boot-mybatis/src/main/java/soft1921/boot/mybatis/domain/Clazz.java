package soft1921.boot.mybatis.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Clazz {
    /**
    * 班级id
    */
    private Integer clazzId;

    /**
    * 班级姓名
    */
    private String clazzName;

    /**
    * 班级管理老师的id
    */
    private Integer teacherId;
}