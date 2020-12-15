package com.qnut.huawei;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @Description
 * @Author QNut
 * @Date
 * @Version 1.0
 **/
public class P38_求小球落地5次后所经历的路程和第5次反弹的高度 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int start = sc.nextInt();
            BigDecimal mile = new BigDecimal(start);
            BigDecimal total = new BigDecimal(start);
            for (int i = 0; i < 5; i++) {
                mile = mile.divide(new BigDecimal(2));
                if (i < 4) {
                    total = total.add(mile.multiply(new BigDecimal(2)));
                }
            }
            System.out.println(total);
            System.out.println(mile);
        }
    }
}
