package com.helloworld.java.conditionalstements.loops;

public class NestedLoop {
    public static void main(String[] args) {
        for (int i = 1;i<=3;i++){
            for(int j=1;j<=3;j++){
                if (i==j){
                    break;
                }
                System.out.println(i+" "+j);
            }
        }
    }
}
