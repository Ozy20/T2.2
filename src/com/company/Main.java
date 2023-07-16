package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      System.out.println("Enter the radius and length of a cylinder:");
      double radius= input.nextDouble();
      double length=input.nextDouble();
      double area=radius*radius*Math.PI;
      double volume=radius*length;
      System.out.println("The area is "+area+"\n"+"The volume is "+volume);
     }
}
