package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int a = 0;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        while(true) {
            list.add(reader.readLine());
            a++;
            if(a == 5) {
                break;
            }
        }

        Collections.sort(list, new Comparator<String>() {          //сортировка строк по длине
            @Override
            public int compare(String o1, String o2) {
                return (o1.length() - o2.length());
            }
        });

        for(int i = list.size() - 1; i >= 0; i--) {               //удаление строк которые длиннее
            if(list.get(i).length() > list.get(0).length()) {
                list.remove(i);
            }
        }

        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        //напишите тут ваш код
    }
}
