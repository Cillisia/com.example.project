public class Main {
    public static void main(String[] args) {


//        System.out.println(calc(2, 4, 6, 2));
//        System.out.println(chek(10, 5));
//        isPosOrNeg(20);
//        System.out.println(isNeg(-10));
//        name("Вася");

    }
   public static float calc(int a, int b, int c, int d) {
       return (a * (b + (c / d)));
   }

    public static boolean chek (int a, int b){
        boolean result=false;
        if (a+b>10 && a+b<20) {result=true;
        }
        return result;
    }

    public static void isPosOrNeg(int a) {
        if (a<0){
            System.out.println("Negative");
        }
        else System.out.println("Positive");

    }

    public static boolean isNeg(int a) {
        boolean result = false;
        if(a<0){
            result = true;
        }
        return result;
    }

    public static void name (String s) {
        System.out.println("Привет," + s + "!");
    }




}