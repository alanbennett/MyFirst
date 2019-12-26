package com.alan;

import jdk.jfr.internal.settings.PeriodSetting;

//類別
public class Hello {
    //程式主要執行入口
    public static void main(String[] args) {    //縮寫：psvm+TAB
        //方法一
        //new Person().hello();

        //方法二
        Person p=new Person();
        p.weight=66.5f;
        p.height=1.75f;
        System.out.println( p.bmi() );

        //方法三
        Person p2=new Person(66.5f,1.75f);
        System.out.println(p2.bmi());
    }
}
