package com.qnut.huawei;

import java.util.Scanner;

/**
 * @Description
 * @Author QNut
 * @Date
 * @Version 1.0
 **/
public class P13_句子逆序 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            String[] arrStr = str.split(" ");
            StringBuilder sb = new StringBuilder();
            for (int i = arrStr.length - 1; i >= 0; i--) {
                sb.append(arrStr[i] + " ");
            }
            System.out.println(sb.toString().trim());
        }
    }
}
