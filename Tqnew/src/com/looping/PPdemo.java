package com.looping;
import com.tqbasic.*;
public class PPdemo extends PP {
public void show() {
i = i + 1;
j = j + 2;
System.out.println("i = " + i + " j= " + j);
}
public static void main(String[] args) {
PPdemo p = new PPdemo();
p.show();
}
}

