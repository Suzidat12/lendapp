package com.lendapp.tomiwa;

public class FirstClass {
    public static void main(String[] args) {
        int x = 20;
        int y = 10;
        int result = x+y;
        String name = "Tomiwa";
        String name2 = "Sunkanmi";
        boolean result2 = (x>y); // relational expression
        boolean result3 = (x==y) || (x!=y); // logical expression
        int result4 = (x<y)?x:y;
        String result5 = (name==name2)?"Fine":"Good";
//        int increase= result--;
//        System.out.println(result);
//        System.out.println(increase);
//        if(x>y){
//            System.out.println("Correct");
//        }else {
//            System.out.println("Not Correct");
//        }
        System.out.println(result5);

    }
}
