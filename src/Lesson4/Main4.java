package Lesson4;

import java.util.Random;
import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {

        String[][] finish = initField(3);
        printField(finish);

        while (true) {

            step1(finish);
            printField(finish);

            stepComp(finish);
            printField(finish);

        }
    }

    public static String[][] initField(int size) {

        String[][] finish = new String[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                finish[i][j] = "*";
            }
        }
        return finish;
    }

    public static void printField(String[][] finish) {

        for (int i = 0; i < finish.length; i++) {
            for (int j = 0; j < finish[0].length; j++) {
                System.out.print(finish[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("-----");
    }

    public static void step1(String[][] finish) {
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("Ykajite kletky Po x u y: ");
            int x = scanner.nextInt() - 1;
            int y = scanner.nextInt() - 1;
            int size = finish.length;
            if (x < size && y < size && x >= 0 && y >= 0) {


                if (finish[x][y].equals("*")) {
                    finish[x][y] = "X";
                    break;
                } else {
                    System.out.println("MIMO");
                }
            } else {
                System.out.println(" Ne v pole ");
            }

        }
    }
    public static void stepComp(String[][] finish) {
        Scanner scanner = new Scanner(System.in);


        while (true) {
            Random random = new Random();
            int x = random.nextInt(finish.length);
            int y = random.nextInt(finish.length);
            int size = finish.length;

            if (finish[x][y].equals("*")) {
                finish[x][y] = "0";
                break;
            }
        }
        System.out.println("Comp sxodil");
    }

     public static boolean isDraw(String[][] finish){
        for (int i = 0; i < finish.length; i++){
            for (int j = 0; j < finish[0].length; j++){
                if (finish[i][j].equals("*")){
                    return false;
                }
            }
        }
        return true;
     }

   public static boolean isWinner(String[] finish, String turn, int turnToWin){

        // горизонталь

       for (int i =0; i < finish.length; i++){
           int isWin = 0;
           for (int j = 0; j < finish[i].length(); j++){
               if (finish[i][j].equals)(turn)){
               isWin++;
                if (isWin == turnToWin){
                    return  true;
    }
               }
               else {
                   isWin = 0;
               }
           }
       }

       // вертикаль
        for (int i = 0; i < finish.length; i++) {
            int isWin = 0;
            for (int j = 0; j < finish[i].length(); j++){
                if (finish[i][j].equals)(turn)){
                    isWin++;
                    if (isWin == turnToWin) {
                        return true;
                    }
        }

       else {
           isWin = 0;
                }
   }
     }

 // диагональ
       int isWin = 0;
        for (int i =0; i < finish.length; i++){
            if (finish[i][i].equals(turn)){
                isWin++;
                if(isWin == turnToWin){
                    return true;
                }
            }
            else  {
                isWin = 0;
            }
        }

        // обраная диагональ

       int isWin = 0;
       for (int i =0; i < finish.length; i++){
           if (finish[i][(finish.length) - 1) - i].equals(turn)){
               isWin++;
               if(isWin == turnToWin){
                   return true;
               }
           }
      else {
          isWin = 0;
           }

   }
       return false;
   }
}
















