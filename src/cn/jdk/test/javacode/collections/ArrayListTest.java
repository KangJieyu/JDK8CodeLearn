package cn.jdk.test.javacode.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * @Date: 2023/3/15 18:47
 * @Author: KangJieyu
 */
public class ArrayListTest {
    public static void main(String[] args) {
//        List<String> stringList = new ArrayList<>();
        List<String> stringList = new ArrayList<>(0);
        stringList.add("a1");
        stringList.add("a2");
//        stringList.add(null);
        stringList.add("a3");
        stringList.add("a4");
//        stringList.add(null);
        stringList.add("a1");
        stringList.add("a5");
        stringList.remove("a4");
    }
}
