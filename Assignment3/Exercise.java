public class Exercise {
    public static void main(String[] args) throws Exception {

        char [][] mdArray = {{'1','1','1'},{'1','1','1'},{'1','1','1'}, {'1', '1', '1'}};
    
        // PATTERN 1
        System.out.println("1. PATTERN 1");

            // outer loop
            for (int row = 0; row < mdArray.length; row++) {
                System.out.println("");

                // inner loop
                for (int column = 0; column < 3; column++) {

                    if (row %2 != 0){
                        System.out.print(mdArray[row][column]);
                    }

                }

            }

        // PATTERN 2
        System.out.println("");
        System.out.println("2. PATTERN 2");

            // outer loop
            for (int row = 0; row < mdArray.length; row++) {
                System.out.println("");

                // inner loop
                for (int column = 0; column < 3; column++) {

                    if (row %2 == 0){
                        System.out.print(mdArray[row][column]);
                    } else if (row %2 != 0){
                        System.out.print("x");
                    }

                }

            }

        // PATTERN 3
        System.out.println("");
        System.out.println("3. PATTERN 3");

        // outer loop
        for (int row = 0; row < mdArray.length; row++) {
            System.out.println("");

            // inner loop
            for (int column = 0; column < 3; column++) {

                if (row == 0 || row == 3){
                    System.out.print(mdArray[row][column]);
                }
                    if (row == 1 || row == 2){
                        if (column == 0 || column == 2){
                            System.out.print(" ");
                        } else {
                            System.out.print(mdArray[row][column]);
                        }
                    }
                
            }

        }

        // // PATTERN 4
        System.out.println("");
        System.out.println("4. PATTERN 4");

        // outer loop
        for (int row = 0; row < mdArray.length; row++) {
            System.out.println("");

            // inner loop
            for (int column = 0; column < 3; column++) {

                if (row == 1 || row == 3){
                    System.out.print(mdArray[row][column]);
                }
                    if (row == 0 || row == 2){
                        if (column == 0 || column == 2){
                            System.out.print(" ");
                        } else {
                            System.out.print(mdArray[row][column]);
                        }
                    }
                
            }

        }

        // // PATTERN 5
        // System.out.println("");
        // System.out.println("5. PATTERN 5");

        // // Get the SUM
        System.out.println("");
        System.out.println("6. SUM");


        int totalSum = 0;

        int [][] sumArray = {{1, 1, 1},{1, 1, 1},{1, 1, 1}, {1, 1, 1}};

         // outer loop
         for (int row = 0; row < mdArray.length; row++) {

            // inner loop
            for (int column = 0; column < 3; column++) {

                totalSum += sumArray[row][column];
            }

        }

        System.out.println("The sum is: " + totalSum);
        
    }

}
