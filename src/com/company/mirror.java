package com.company;
/* This is the program that will print a mirror
  6/4/2020
  Christine Yan */

public class mirror {
    public static void main(String[] args){
        Line();
        Top();
        Bottom();
        Line();
    }
    public static void Line(){
        System.out.print("#");
        for(int dash=0; dash<16; dash++){
            System.out.print("=");
    }
        System.out.println("#");
    }
    public static void Top(){
        System.out.println("|      <><>      |");
        System.out.println("|    <>....<>    |");
        System.out.println("|  <>........<>  |");
        System.out.println("|<>............<>|");
    }
    public static void Bottom(){
        System.out.println("|<>............<>|");
        System.out.println("|  <>........<>  |");
        System.out.println("|    <>....<>    |");
        System.out.println("|      <><>      |");
    }
}

