package com.example.gittest;

/**
 * @Package: com.example.gittest
 * @ClassName: TestController
 * @Author: DuYae
 * @Description: //TODO
 * @Date: 2023.3.30 11:11
 * @Version: 1.0
 */
public class TestController {
  public static void main(String[] args) {
    System.out.println("test01");
    System.out.println("test02");
  }

  private int getCount(){
    int count = 0;
    return count;
  }

  private void getName(){
    System.out.println("This is my name.");
  }

  private void setName(String name){
    System.out.println("My name is " +name);
  }
}
