package com.jump.kaikebacrown.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Admin
 */
public class AsciiConvertUtil {
    public static char ascii2Char(int ascii) {
        return (char) ascii;
    }

    public static int char2Ascii(char c) {
        return c;
    }

    public static String ascii2String(int[] asciis) {
        StringBuilder sb = new StringBuilder();
        for (int ascii : asciis) {
            sb.append(ascii2Char(ascii));
        }
        return sb.toString();
    }

    public static String ascii2String(String asciiStr) {
        String[] asciiArr = asciiStr.split(",");
        StringBuilder sb = new StringBuilder();
        for (String ascii : asciiArr) {
            sb.append(ascii2Char(Integer.parseInt(ascii)));
        }
        return sb.toString();
    }

    /**
     * 字符串转换为ASCII码
     *
     * @param str 字符串
     * @return int[]
     */
    public static int[] char2Ascii(String str) {
        if (str == null || "".equals(str)) {
            return null;
        }

        char[] chars = str.toCharArray();
        int[] asciiArray = new int[chars.length];

        for (int i = 0; i < chars.length; i++) {
            asciiArray[i] = char2Ascii(chars[i]);
        }
        return asciiArray;
    }

    public static String getIntArrayString(int[] intArray) {
        return getIntArrayString(intArray, ",");
    }

    public static String getIntArrayString(int[] intArray, String delimiter) {
        StringBuilder sb = new StringBuilder();
        for (int value : intArray) {
            sb.append(value).append(delimiter);
        }
        return sb.toString();
    }

    public static String getAscii(int begin, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = begin; i < end; i++) {
            sb.append(i).append(":").append((char) i).append("/t");
            if (i % 10 == 0) {
                sb.append("/n");
            }
        }
        return sb.toString();
    }

    public static String getCharAscii(int begin, int end) {
        return getAscii(19968, 40869);
    }

    public static void showAsCii(int begin, int end) {
        for (int i = begin; i < end; i++) {
            System.out.print((char) i + "/t");
            if (i % 10 == 0) {
                System.out.println();
            }
        }
    }

    public static void showAsCii() {
        showAsCii(19968, 40869);
    }

    public static void showIntArray(int[] intArray) {
        showIntArray(intArray, ",");
    }

    public static void showIntArray(int[] intArray, String delimiter) {
        for (int value : intArray) {
            System.out.print(value + delimiter);
        }
    }


    public static String convertStringToHex(String str) {

        char[] chars = str.toCharArray();

        StringBuilder hex = new StringBuilder();
        for (char aChar : chars) {
            hex.append(Integer.toHexString(aChar));
        }

        return hex.toString();
    }

    public static String convertHexToString(String hex) {

        StringBuilder sb = new StringBuilder();
        StringBuilder temp = new StringBuilder();

        //49204c6f7665204a617661 split into two characters 49, 20, 4c...
        for (int i = 0; i < hex.length() - 1; i += 2) {

            //grab the hex in pairs
            String output = hex.substring(i, (i + 2));
            //convert hex to decimal
            int decimal = Integer.parseInt(output, 16);
            //convert the decimal to character
            sb.append((char) decimal);
            temp.append(decimal);
        }

        return sb.toString();
    }

    public static boolean containsNumOrLetter(String str) {
        String patt = "[0-9|a-z|A-Z]";
        Pattern r = Pattern.compile(patt);
        Matcher matcher = r.matcher(str);
        return matcher.find();
    }

    public static void main(String[] args) {

        String str = "\u30102023\u8003\u7814\u516c\u5171\u8bfe\u3011\u82f1\u8bed\uff08\u4e8c\uff09";
        System.out.println(str);
    }
}
