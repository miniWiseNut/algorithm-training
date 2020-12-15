package com.qnut.huawei;

import java.util.*;

/**
 * @Description
 *     测试用例只通过50%的情况：
 *     因为把map的记录移除了违背了：
 *      4. 循环记录时，只以第一次出现的顺序为准，后面重复的不会更新它的出现时间，仍以第一次为准
 * @Author QNut
 * @Date
 * @Version 1.0
 **/
public class P19_简单错误记录 {
    public static void main(String[] args) {
        Queue<String> queKey = new LinkedList<>();
        Map<String, Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            String[] nameAndNum = str.split(" ");
            String fileName = nameAndNum[0].substring(str.lastIndexOf("\\") + 1);
            if (fileName.length() > 16) {
                fileName = fileName.substring(fileName.length() - 16);
            }
            String keyName = fileName + " " + nameAndNum[1];
            if (map.containsKey(keyName)) {
                map.put(keyName, map.get(keyName) + 1);
            } else {
                if (map.size() < 8) {
                    queKey.offer(keyName);
                    map.put(keyName, 1);
                } else {
                    queKey.poll();
                    queKey.offer(keyName);
                    map.put(keyName, 1);
                }
            }
        }
        queKey.forEach(s -> System.out.println(s + " " + map.get(s)));
    }
}
