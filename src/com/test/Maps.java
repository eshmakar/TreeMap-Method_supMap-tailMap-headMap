package com.test;

import java.util.TreeMap;

public class Maps {
    private static TreeMap<String, Byte> mapList = new TreeMap<>(); //хранит упорядочанные ключи, значения

    public static void main(String[] args) {
        mapList.put("a", (byte) 1);
        mapList.put("d", (byte) 4);
        mapList.put("c", (byte) 3);
        mapList.put("b", (byte) 2);
        System.out.println(mapList.subMap("a", "c"));//subMap - получение списка от первого ключа до второго, не включая второй элемент (то есть "с")
        System.out.println(mapList.tailMap("b"));//tailMap - получение списка включая первого ключа (то есть "b")
        System.out.println(mapList.headMap("c")); //headMap - получение списка не включая этот элемент (то есть без самого ключа "с")
        System.out.println(mapList.headMap("c").lastKey()); //последнее значение этого списка (выводит b)

 /*      OUTPUT: 
        {a=1, b=2}
        {b=2, c=3, d=4}
        {a=1, b=2}
        b*/


    }
}