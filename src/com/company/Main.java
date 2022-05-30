package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a=0;
        int b=0;

        //怨꾩궛湲� 留뚮뱾湲� 肄붾뱶
        System.out.println("숫자 a와 b를 입력하시오");
        Scanner scanner=new Scanner(System.in);
        a= scanner.nextInt();
        b=scanner.nextInt();

        String sign=""; //遺��샇
        System.out.println("부호를 입력하세요");
        sign=scanner.next();

        int result=0;
        if (sign.equals("+")){

        }else if(sign.equals("-")){
        	Minus.minus(a, b);
        	}else if(sign.equals("*")){
            //Multi.multi(a,b);
        }
    }
}
