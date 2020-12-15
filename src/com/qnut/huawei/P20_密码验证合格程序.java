package com.qnut.huawei;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @Description
 * 密码要求:
 *
 * 1.长度超过8位
 *
 * 2.包括大小写字母.数字.其它符号,以上四种至少三种
 *
 * 3.不能有相同长度大于2的子串重复
 *
 * @Author QNut
 * @Date
 * @Version 1.0
 **/
public class P20_密码验证合格程序 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String pwd = sc.nextLine();
            if (pwd.length() < 9) {
                System.out.println("NG");
                continue;
            }

            int[] count = new int[4];
            for (int i = 0; i < 4; i++) {
                count[i] = 0;
            }
            for (int i = 0; i < pwd.length(); i++) {
                if (pwd.charAt(i) >= 'a' && pwd.charAt(i) <= 'z') {
                    count[0]+=1;
                } else if (pwd.charAt(i) >= 'A' && pwd.charAt(i) <= 'Z') {
                    count[1]+=1;
                } else if (pwd.charAt(i) >= '0' && pwd.charAt(i) <= '9') {
                    count[2]+=1;
                } else {
                    count[3]+=1;
                }
            }

            int total = 0;
            for (int i = 0; i < 4; i++) {
                if (count[i] > 0) {
                    total++;
                }
            }

            if (total < 3) {
                System.out.println("NG");
                continue;
            }
            if (judgeStr(pwd)) {
                System.out.println("NG");
                continue;
            }

            System.out.println("OK");

        }
    }

    private static List getSbStr(String pwd) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < pwd.length() - 2; i++) {
            list.add(pwd.substring(i, i + 3));
        }
        return list;
    }

    private static boolean judgeStr(String pwd) {
        List<String> subString = getSbStr(pwd);
        int len = subString.size();
        if (len == subString.stream().distinct().collect(Collectors.toList()).size()) {
            return false;
        }
        return true;
    }
}
