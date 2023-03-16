package cn.lins.demo2023.stream;

import org.junit.Before;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTest {

    public static List<Grade> grades;

    @Before
    public void before(){
        Grade g1 = new Grade("202201", "aaa", "101", 90.0, 85.0, 75.0);
        Grade g2 = new Grade("202202", "bbb", "101", 41.0, 25.0, 55.0);
        Grade g3 = new Grade("202203", "ccc", "102", 60.0, 55.0, 45.0);
        Grade g4 = new Grade("202201", "aaa", "101", 77.0, 83.0, 72.0);
        Grade g5 = new Grade("202201", "aaa", "101", 66.0, 13.0, 67.0);
        Grade g6 = new Grade("202201", "aaa", "101", 60.0, 75.0, 53.0);
        Grade g7 = new Grade("202201", "aaa", "101", 76.0, 74.0, 71.0);
        Grade g8 = new Grade("202201", "aaa", "101", 44.0, 22.0, 55.0);
        Grade g9 = new Grade("202201", "aaa", "101", 36.0, 77.0, 88.0);

        grades = new ArrayList();
        Collections.addAll(grades,g1,g2,g3,g4,g5,g6,g7,g8,g9,null);

    }

    @Test
    public void cs1(){
        //总分
        double sum = grades.stream().filter(Objects::nonNull).mapToDouble(Grade::getChineseScore).reduce(0,Double::sum);
        System.out.println(sum);
    }
}
