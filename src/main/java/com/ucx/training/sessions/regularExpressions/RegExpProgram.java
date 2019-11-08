package com.ucx.training.sessions.regularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpProgram {
    public static void main(String[] args) {
        String sentence = "Java is object oriented language.";
        String regExp = "\\bJava\\b";

        Pattern pattern = Pattern.compile(regExp);
        Matcher matcher = pattern.matcher(sentence);

        while (matcher.find()){
            System.out.print("Start index: " + matcher.start());
            System.out.print("End index: " + matcher.end());
            System.out.println(matcher.group());
        }
        System.out.println(Pattern.matches("[abc]\\w+","australia" ));
        System.out.println(Pattern.matches("[abc]\\w+","zaustralia" ));
        System.out.println(Pattern.matches("\\w+a","012a" ));
        System.out.println(Pattern.matches("\\(\\+383\\)-\\d{3}-\\d{3}-\\d{3}","(+383)-044-110-771" ));
        System.out.println(Pattern.matches("[a-zA-Z0-9]+\\.[a-zA-Z0-9]+\\@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}","flake.sadiku@ucxchange.com" ));
    }
}
