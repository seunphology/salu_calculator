



public class Calculator {
  /* This program is a calculator that adds,subtracts,
  multiplies and divides*/

  private static final double PI = 3.142; // constants are always written in this format and variable name capital 

    public Calculator() {


    }

    public int add(int a, int b){


        int c = a+b;
        return c;


    }

    public int subtract(int a, int b){

        int d = a-b;

        return d;
    }

    public int multiply(int a, int b){

        int e = a*b;

        return e;

    }

    public int divide(int a, int b){
        int f = a/b;
        if(b==0){
            return 0;
        }else{
            return f;

        }



    }

    public int modulo(int a, int b){
        int g = a/b;
        if(b==0){
            return 0;
        }else{
            return g;

        }

    }

    public static void main(String[]args){

        Calculator myCalculator = new Calculator();

        System.out.println(myCalculator.add(5,7));

        System.out.println(myCalculator.subtract(45,11));

        System.out.println(myCalculator.divide(20,4));

        double k = PI*3;
        System.out.println(k);

        double g = k+=2; //k+=2 is same as typing k=k+2 only in a shorter way. k++ is same as k+=1
        System.out.println(g);



    }





}


    

