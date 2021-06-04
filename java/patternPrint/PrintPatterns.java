package patternPrint;

public class PrintPatterns {

    /*
     *
     * *
     * * *
     * * * *
     * * * * *
     */
    public static void printPyramid(int noOfRowns) {
        for (int i = 0; i < noOfRowns; i++) {

            //print the the spaces
            for (int j = noOfRowns - i; j > 1; j--) {
                System.out.print(" ");
            }
            //print the stars
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    /*
     *
     * *
     * * *
     * * * *
     * * * * *
     */
    public static void printSimpleTriangle(int noOfRows) {
        for (int i = 0; i < noOfRows; i++) {
            //print the stars
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            //print the the spaces
            for (int j = noOfRows - i; j > 1; j--) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    /*
     *
     * *
     * * *
     * * * *
     * * * * *
     */
    public static void printReverseSimpleTriangle(int noOfRows) {
        for (int i = 0; i < noOfRows; i++) {
            //print the stars
            for (int j = 0; j <= noOfRows - i; j++) {
                System.out.print(" ");
            }
            //print the the spaces
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*

    1 2 3 4 5
      1 2 3 4
       1 2 3
        1 2
         1

     */
    public static void reverseNoTriangle(int noOfRows) {
        for (int i = 0; i <= noOfRows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= noOfRows - i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }

    public static void InvertedTriangle(int rows) {

        //Printing the pattern
        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j < i; j++)
            {
                System.out.print(" ");
            }
            for (int j = i; j <= rows; j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }


        //Printing the reverse pattern
        for (int i = rows-1; i >= 1; i--)
        {
            for (int j = 1; j < i; j++)
            {
                System.out.print(" ");
            }
            for (int j = i; j <= rows; j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }

       /* for (int i = 0; i <= noOfRows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= noOfRows - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for (int i = 1; i <= noOfRows; i++) {
            for (int j = 1; j <= noOfRows - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }


            System.out.println();
        }*/
    }
}
