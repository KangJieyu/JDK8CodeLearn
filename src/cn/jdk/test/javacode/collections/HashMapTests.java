package cn.jdk.test.javacode.collections;

import java.util.HashMap;
import java.util.Map;

/**
 * HashMap 测试
 * @Date: 2023/3/13 11:39
 * @Author: KangJieyu
 */
public class HashMapTests {
    public static void main(String[] args) {
        // 创建初始容量为 16 的 HashMap
//        Map<String, String> map = new HashMap<>();
        Map<String, String> map = new HashMap<>(16);
        // hash(key)    index
        // 3056         0
        map.put("a1", "a-1");
        // 3057         1
        map.put("a2", "a-2");
        // 3058         2
        map.put("a3", "a-3");
        // 3059         3
        map.put("a4", "a-4");
        // 3060         4
        map.put("a5", "a-5");
        // 3061         5
        map.put("a6", "a-6");
        // 3062         6
        map.put("a7", "a-7");
        // 3063         7
        map.put("a8", "a-8");
        // 存入相同的key，不同的value
        map.put("a8", "a-8-1");
        // 3064         8
        map.put("a9", "a-9");
        // 94785        1(发生了hash冲突)
        map.put("a10", "a-10");
        // 94784        0
        map.put("a11", "a-11");
        // 94787        3
        map.put("a12", "a-12");
        // 94786        2
        map.put("a13", "a-13");
        // 94789
        map.put("a14", "a-14");
        // 94788
        map.put("a15", "a-15");
        // hash("a7")=3062
        String a7 = map.get("a7");
        String a11 = map.get("a11");
        String a1 = map.get("a1");


    }

}
