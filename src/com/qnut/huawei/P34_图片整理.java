package com.qnut.huawei;


import java.util.Arrays;
import java.util.Scanner;

/**
 * @Description
 * @Author QNut
 * @Date
 * @Version 1.0
 **/
public class P34_图片整理 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            System.out.println(new String(arr));
        }
    }
}
