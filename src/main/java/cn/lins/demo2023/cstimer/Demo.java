package cn.lins.demo2023.cstimer;

import org.apache.logging.log4j.util.Strings;

import java.util.*;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;


public class Demo {
    public static void main(String[] args) {

        StringJoiner sj = new StringJoiner(",","(",")");
        sj.setEmptyValue("xxx");
        //IntStream.range(1,10).forEach(i->sj.add(i+""));

        System.out.println(sj.toString());
    }
}
