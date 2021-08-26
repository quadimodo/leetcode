package com.quadimodo.algorithm.algorithm.four;

import java.util.Arrays;

/**
 * 给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
 * <p>
 *  
 * <p>
 * 示例：
 * <p>
 * 输入："Let's take LeetCode contest"
 * 输出："s'teL ekat edoCteeL tsetnoc"
 *  
 * <p>
 * 提示：
 * <p>
 * 在字符串中，每个单词由单个空格分隔，并且字符串中不会有任何额外的空格。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-words-in-a-string-iii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class ReverseWordsInAStringiii {
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        String[] s1 = s.split(" ");
        for (String s2 : s1) {
            result.append(reverse(s2));
            result.append(" ");
        }
        return result.toString().trim();
    }

    private String reverse(String subStr) {
        char[] r = new char[subStr.length()];
        int last = subStr.length() - 1;
        for (int i = 0; i < subStr.length(); i++) {
            r[last - i] = subStr.charAt(i);
        }
        return String.valueOf(r);
    }

    public static void main(String[] args) {
        ReverseWordsInAStringiii words = new ReverseWordsInAStringiii();
        System.out.println(words.reverseWords("Let's take LeetCode contest"));
    }
}
