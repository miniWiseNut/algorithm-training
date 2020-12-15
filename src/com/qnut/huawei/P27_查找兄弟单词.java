package com.qnut.huawei;

import java.util.*;

/**
 * @Description
 * @Author QNut
 * @Date
 * @Version 1.0
 **/
public class P27_查找兄弟单词 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String string = sc.nextLine();
            String[] array = string.split(" ");
            int brotherNum = Integer.parseInt(array[0]);
            int K = Integer.parseInt(array[array.length - 1]);
            String brotherStr = array[array.length - 2];
            String[] brotherArray =  new String[array.length - 3];
            for (int i = 0; i < array.length - 3; i++) {
                brotherArray[i] = array[i + 1];
            }

            // 找出所有兄弟数组
            List<String> resultList = new ArrayList<>();
            int total = 0;
            for (int i = 0; i < brotherNum; i++) {
                if(brotherArray[i].length() == brotherStr.length() && !brotherStr.equals(brotherArray[i])) {
                    if (isBrother(brotherArray[i], brotherStr)) {
                        resultList.add(brotherArray[i]);
                        total++;
                    }
                }
            }
            Collections.sort(resultList);
            System.out.println(total);
            if (K < total && resultList.get(K - 1) != null) {
                System.out.println(resultList.get(K - 1));
            }
        }
    }

    private static boolean isBrother(String s1, String s2){
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        return Arrays.equals(c1, c2);
    }
}
