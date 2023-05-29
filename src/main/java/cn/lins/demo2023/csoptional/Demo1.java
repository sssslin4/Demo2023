package cn.lins.demo2023.csoptional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo1 {
    public static void main(String[] args) {
        String str = null;
        Optional<String> o1 = Optional.ofNullable(str);

        o1.ifPresent((x)->{
            System.out.println(x);
        });

    }

}
