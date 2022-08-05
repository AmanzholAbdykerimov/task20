package com.company;

public class Car extends Exception{
    public  void Close() throws RuntimeException{
        System.out.println("Mashina jabylyp jatat");
        throw new RuntimeException();
        }
        public void Drive(){
        System.out.println("mashina jurup jatat");
    }
}
 
