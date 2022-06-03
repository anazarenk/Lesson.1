package Lesson2;

public class Main {

    public  static void main(String[] args){
        System.out.println(p1(12, 13));
        System.out.println(p1(4, 4));
        System.out.println();

        p2(40);
        p2(-20);
        System.out.println();

        System.out.println(p3(-10));
        System.out.println(p3(10));
        System.out.println();

        p4("Hola", 5);
        System.out.println();

    }




    public static boolean p1(int num1,int num2){

        if (num1 + num2 >= 10 && num1 + num2 <= 20) {
            return true;
        }  else {
                return false;
            }
        }

        public static void p2(int num) {

            if (num >= 0) {
                System.out.println("+");
            } else {
                System.out.println("-");
            }
        }

                public static boolean p3(int num){

                    if (num < 0) {
                        return true;
                    } else{
                            return false;
                        }
                    }

                    public static void p4 (String text,int num){
                        for (int a = 0; a < num; a++) {
                            System.out.println(text);
                        }
                    }


                }





