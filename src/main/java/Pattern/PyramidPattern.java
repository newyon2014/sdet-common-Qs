package Pattern;

public class PyramidPattern {
    /*
            *
           * *
          * * *
         * * * *
     */

    public static void main(String[] args) {

        for(int i=1 ; i<=4;i++){
            for (int j = 3; j >= i; j--) { // --> J to track the spaces ( this number can be any )
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) { // --> k to track the stars
                System.out.print(" *"); // Added a space here
            }

            System.out.println();



        }
    }
}
