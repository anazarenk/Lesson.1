public class Main3 {

    public static void main(String[] args) {
        // 1
        int[] massiv = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1};
        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i] == 1) {
                massiv[i] = 0;
            } else {
                massiv[1] = 1;
            }
        }
        for (int i = 0; i < massiv.length; i++) {
            System.out.print(massiv[i] + " ");
        }
        System.out.println();


        // 2
        int[] massiv2 = new int[100];
        for (int i = 0; i < massiv2.length; i++) {
            massiv2[i] = i + 1;
        }
        for (int i = 0; i < massiv2.length; i++) {
            System.out.print(massiv2[i] + " ");
        }
        System.out.println();


        // 3 Не выполнилась команда, когда прописала if [massiv3] < 6 { massiv3 *= 2;}

        int[] massiv3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < massiv3.length; i++) {
            if (massiv3[i] < 6) massiv3[i] = massiv3[i] * 2;

        }
        for (int i = 0; i < massiv3.length; i++) {

            System.out.print(massiv3[i] + " ");
        }
        System.out.println();


        // 4
        int[][] massiv4 = new int[5][5];

        // или massiv4 [i][i] = 1;
        //     massiv4[i][massiv4.length - 1 - i] = 1;

        for (int i = 0; i < massiv4.length; i++) {
            for (int j = 0; j < massiv4.length; j++) {

                if (i == j) {
                    massiv4[i][j] = 1;
                }
                if (i + j == massiv4.length - 1) {
                    massiv4[i][j] = 1;
                }
            }

        }

        for (int i = 0; i < massiv4.length; i++) {
            for (int j = 0; j < massiv4.length; j++) {
                System.out.print(massiv4[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        // 5

        int[] massiv5 = away(10, 5);
        for(int i = 0; i<massiv5.length; i++) {


            System.out.print(massiv5[i] + " ");
        }

        System.out.println();


    }

    // 5

    public static int[] away(int len, int initialValue) {
        int[] result = new int[len];
        for (int i = 0; i < result.length; i++) {
            result[i] = initialValue;
        }
        return result;
    }
}









