package com.liaoye.demo_04;

/*
 * 获取功能：
 * 获取下面这个字符串中由三个字符组成的单词
 * da jia ting wo shuo,jin tian yao xia yu,bu shang wan zi xi,gao xing bu?
 *
 * m.find() 尝试查找与该模式匹配的输入序列的下一个子序列
 * m.group() 返回由以前匹配操作所匹配的输入子序列。
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo8 {
    public static void main(String[] args){
        String s = "da jia ting wo shuo,jin tian yao xia yu,bu shang wan zi xi,gao xing bu?";
        // 规则
        String regex = "\\b\\w{3}\\b";

        // 把规则编译成模式对象
        Pattern p = Pattern.compile(regex);
        // 通过模式对象得到匹配器对象
        Matcher m = p.matcher(s);

        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
