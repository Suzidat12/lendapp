package com.lendapp.tomiwa;

public class ThirdClass {
  public   int sum(int a, int b){

        return a + b;
    }
    public void info(){
        System.out.println("Welcome");
    }
    private String test(String firstName,String lastName){
        return firstName + lastName;
    }
    private Double salary(Double bonus, Double net){
      return bonus + net;
    }
    private Double tax(Double amount){
      return amount;
    }


    public static void main(String[] args) {
        int count = 10;
        ThirdClass thirdClass = new ThirdClass();
        thirdClass.info();
        Double total = thirdClass.salary(100.00,1000.00) - thirdClass.tax(200.00);
        System.out.println(total);
       String result2 = thirdClass.test("Balogun ", "Funmbi");
       Double result3 = thirdClass.salary(200.00,10000.00);
        System.out.println(result3);
        System.out.println(result2);
        int result = thirdClass.sum(3,4);
        System.out.println(result);


//        do {
//            System.out.println(count);
//            count++;
//        }while (count<5);
//    }
//        for (int i = 1; i <= count; i++) {
//            System.out.println(i);
//        }
//        for(int i=1;i<count;i++){
//            if(i==4){
//                break;
//            }
//            System.out.println(i);
//        }
//        for(int i=0; i<count;i++){
//            if(i%2 != 0){
//                continue;
//            }
//            System.out.println(i);
//        }
    }
}
