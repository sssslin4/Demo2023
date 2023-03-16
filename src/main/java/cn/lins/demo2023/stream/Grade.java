package cn.lins.demo2023.stream;

import lombok.AllArgsConstructor;
import lombok.Data;

/*
 * 成绩实体类
 * */
@Data
@AllArgsConstructor
public class Grade {
    //学号
    private String stuNo;
    //学生名
    private String stuName;
    //班级
    private String stuClass;
    //语文成绩
    private Double chineseScore;
    //数学成绩
    private Double mathScore;
    //英语成绩
    private Double englishScore;
}
