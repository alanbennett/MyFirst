package com.alan;

public class Person {
    //屬性(Field)
    String name;
    float weight;
    float height;

    //建構子 (不需要傳入值)
    public Person(){

    }

    //建構子的多載 (需要傳入值)
    public Person(float weight, float height){
        this.weight=weight;
        this.height=height;
    }

    //建構子的多載 (更多的傳入值)
    public Person(float weight, float height, String name){
        //使用this()建構子時，一定要放在建構子的第一行，不然程式會出錯
        this(weight,height); //當建構子的功能重覆時，可以拿來重覆利用，節省開發
        /*
        上面一行也等於下面的兩行
        this.weight=weight;
        this.height=height;
        * */
        this.name=name;
    }



    //函式
    public void hello(){
        System.out.println("Hello JAVA");
    }

    //函式
    public float bmi(){
        return weight/(height*height);
    }
}
