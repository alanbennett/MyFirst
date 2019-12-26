package com.alan

import java.util.*

//不用使用類別呼叫，直接fun main即可使用 或 main+TAB
fun main() {
    //方法一
    //Human().hello()

    //方法二
    //val h = Human();//不需要使用new即可建立物件
    //h.hello();

    //方法三
    val h = Human(66.5f,1.75f)
    println(h.bmi())
}

