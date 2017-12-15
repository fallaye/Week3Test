package mobileappscompany.week3test;

import android.icu.text.SymbolTable;
import android.os.health.SystemHealthManager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * Created by fallaye on 12/15/17.
 */

public class Test1 {

    public static void main(String []args){
        Test1 test1 = new Test1();
        System.out.println( test1.permuteStrings("frog"));
        test1.countFrequency("Hello there! Apple!");
        test1.encodeString("acp");
    }

    private void countFrequency(String str) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            Integer val = map.get(c);
            if (val != null) {
                map.put(c, new Integer(val + 1));
            } else {
                map.put(c, 1);
            }
        }
        for (Character name: map.keySet()){
            String key =name.toString();
            String value = map.get(name).toString();
            System.out.println(key + " " + value);
        }
    }

    private void encodeString(String str){
        String string = "abcdefghijklmnopqrstuvwxyz";
        String strToPrint = "";
        int index;
        char[] ch  = str.toCharArray();
        for(char c : ch)
        {
            int temp = (int)c;
            int temp_integer = 96; //for lower case
            if(temp<=122 & temp>=97) {
                index = 26 - (temp - temp_integer);
                System.out.print(string.charAt(index));
            }
        }
    }

    private List<List<String>> permuteStrings(String input) {
        if (input.length() == 1)
            return Collections.singletonList(Collections.singletonList(input));
        List<List<String>> result = new ArrayList<>();
        for (List<String> subresult : permuteStrings(input.substring(1))) {
            List<String> l2 = new ArrayList<>(subresult);
            l2.set(0, input.charAt(0) + l2.get(0));
            result.add(l2);
            List<String> l = new ArrayList<>(subresult);
            result.add(l);
        }
        return result;
    }


}
