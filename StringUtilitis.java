package week05;

import java.util.Arrays;
public class StringUtilitis{
    public static String reverse(String s){
        StringBuilder sb= new StringBuilder();
        for (int i =s.length()-1;i>=0;i--) {
            char c=s.charAt(i);
            sb.append(c);
        }
        return sb.toString();
    }

    public static String exploded(String s){
        StringBuilder sb= new StringBuilder();
        for (int i =0;i<s.length();i++) {
            char c=s.charAt(i);
            sb=sb.append(s.substring(0, i+1));
        }
        return sb.toString();
    }

    public static String sorted(String s){
        char[]c=s.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }
    public static boolean  anagram(String s,String s2){
        s=sorted(s);
        s2=sorted(s2);
        return s.equals(s2);
    }

    public static String mixed(String s) {
    StringBuilder sb = new StringBuilder();
    String[] s_array =s.split(" ");
    for(int i =0;i<s_array.length;i++){
        char[]c_array=s_array[i].toCharArray();
        char temp=c_array[0];
        c_array[0]=c_array[c_array.length-1];
        c_array[c_array.length-1]=temp;
        sb.append(c_array);
        sb.append(" ");
    }

    return sb.toString();
}


    public static void main(String[] args) {
        String s1="bcad";
        String s2="dabc";
        System.out.println(anagram(s1,s2));
        // System.out.println(reverse(s1));
        // System.err.println(exploded(s1));
        // System.err.println(sorted(s1));
        String sentence="This is PP2 Fall 2021";
        System.out.println(mixed(sentence));

    }
}