package com.qnut.huawei;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Description
 *   这题直接使用Integer.toBinaryString()转化为2进制，用例通过数为60%
 * @Author QNut
 * @Date
 * @Version 1.0
 **/
public class P18_识别有效的IP地址和掩码并进行分类统计 {
    private static final String  NUM_FORMAT = "^(\\d+)\\.(\\d+)\\.(\\d+)\\.(\\d+)$";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int typeA = 0;
        int typeB = 0;
        int typeC = 0;
        int typeD = 0;
        int typeE = 0;
        int errorIpOrMaskCode = 0;
        int privIp = 0;
        while (sc.hasNext()) {
            String ipt = sc.nextLine();
            String[] arr = ipt.split("~");
            String ipStr = arr[0];
            String maskCode = arr[1];
            // 判断格式
            if (!isValidFormat(ipStr) || !isValidFormat(maskCode)) {
                errorIpOrMaskCode++;
                continue;
            }

            // 判断掩码是否错误
            if (!validMaskCode(maskCode)) {
                errorIpOrMaskCode++;
                continue;
            }
            // 判断ip
            String[] ip = ipStr.split("\\.");

            int ipFirst = Integer.valueOf(ip[0]);
            int ipSecond = Integer.valueOf(ip[1]);
            if (ipFirst == 0 || ipFirst == 127) {
                continue;
            }
            if (ipFirst == 10 || (ipFirst == 172 && ipSecond >= 16 && ipSecond <= 31) || (ipFirst == 192 && ipSecond == 168)) {
                privIp++;
            }
            if (ipFirst < 127 && ipFirst > 0) {
                typeA++;
            } else if (ipFirst > 127 && ipFirst < 192) {
                typeB++;
            } else if (ipFirst >= 192 && ipFirst < 224) {
                typeC++;
            } else if (ipFirst >= 224 && ipFirst < 240) {
                typeD++;
            } else if (ipFirst >= 240 && ipFirst < 256) {
                typeE++;
            }
        }
        sc.close();
        System.out.println(typeA + " " + typeB + " " + typeC + " " + typeD + " " + typeE + " " + errorIpOrMaskCode + " " + privIp);
    }

    /**
     * 判断ip和掩码是否是xxx.xxx.xxx.xxx格式Ø
     *
     * @param ip
     * @return
     */
    private static boolean isValidFormat(String ip) {
        boolean res = true;
        if (ip == null || "".equals(ip)) {
            return false;
        }
        Pattern pa = Pattern.compile(NUM_FORMAT);
        Matcher matcher = pa.matcher(ip);

        if (matcher.matches()) {
            String[] nums = ip.split("\\.");
            for (String num : nums) {
                int n = Integer.valueOf(num);
                if (n < 0 || n > 255) {
                    res = false;
                    break;
                }
            }
        } else {
            res = false;
        }

        return res;
    }

    /**
     * 判断掩码是否是前面全为1后面全为0 的格式
     *
     * @param maskCode
     * @return
     */
    private static boolean validMaskCode(String maskCode) {
        boolean res = true;
        String[] nums = maskCode.split("\\.");
        StringBuilder sb = new StringBuilder();
        for (String num : nums) {
            int n = Integer.valueOf(num);
            sb.append(Integer.toBinaryString(n));
//            sb.append(binaryString(n));
        }
        int firstIndexOf0 = sb.indexOf("0");
        int lastIndexOf1 = sb.lastIndexOf("1");
        if (firstIndexOf0 < lastIndexOf1) {
            res = false;
        }
        return res;
    }

    /**
     * 将整数转成对应的八位二进制字符串
     * @param num
     * @return
     */
    private static String binaryString(int num) {
        StringBuilder result = new StringBuilder();
        int flag = 1 << 7;
        for (int i = 0; i < 8; i++) {
            int val = (flag & num) == 0 ? 0 : 1;
            result.append(val);
            num <<= 1;
        }
        return result.toString();
    }
}
