package cn.lins.demo2023.stream;

import org.junit.Before;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        Grade g1 = new Grade("202201", "aaa", "101", 90.0, 85.0, 75.0);
        Grade g2 = (Grade) g1.clone();
        System.out.println(g1.toString());
        System.out.println(g2.toString());

    }
}
