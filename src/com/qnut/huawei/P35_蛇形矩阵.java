package com.qnut.huawei;

import java.util.Scanner;

/**
 * @Description
 * @Author QNut
 * @Date
 * @Version 1.0
 **/
public class P35_蛇形矩阵 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int num = sc.nextInt();
            int first = 1;
            for (int i = 1; i <= num; i++) {
                System.out.print(first);
                int tmp = first;
                for (int j = i + 1; j <= num; j++) {
                    tmp += j;
                    System.out.print(" " + tmp);
                }
                System.out.println();
                first += i;
            }
        }
    }
}
