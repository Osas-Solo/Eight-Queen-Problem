public class EightQueenSolution {

    public static void main(String[] args) {

        int queenRows[] = new int[8];  //  queen row
        int queenColumns[] = new int[8];  //  queen column

        boolean constraintMet = false;

        System.out.println("\nPlease wait...\n");

        while (!constraintMet) {
            guessPositions(queenRows, queenColumns);
            constraintMet = checkPositions(queenRows, queenColumns);
        }

        printPositions(queenRows, queenColumns);


    }  // end of main

    public static void guessPositions(int qr[], int qc[]) {

        for (int i = 0; i < 8; i++) {
            qr[i] = 1 + (int)(Math.random() * 8);
            qc[i] = 1 + (int)(Math.random() * 8);
        }

    }  //  end of guessPositions

    public static boolean checkPositions(int qr[], int qc[]) {

        boolean constraintMet = checkRows(qr) && checkCols(qc) && checkDiagonals(qr, qc);

        return constraintMet;

    }  //  end of checkPositions

    public static boolean checkRows(int qr[]) {
        boolean rowConstraint = false;

        for (int i = 0; i < 7; i++) {
            for (int j = i + 1; j < 8; j++) {
                if (qr[i] == qr[j]) {
                    rowConstraint = false;
                    break;
                }

                else {
                    rowConstraint = true;
                }
            }  //  end of inner for

            if (!rowConstraint) {
                break;
            }
        }  //  end of outer for

        return rowConstraint;
    }  //  end of checkRows

    public static boolean checkCols(int qc[]) {
        boolean colConstraint = false;

        for (int i = 0; i < 7; i++) {
            for (int j = i + 1; j < 8; j++) {
                if (qc[i] == qc[j]) {
                    colConstraint = false;
                    break;
                }

                else {
                    colConstraint = true;
                }
            }  //  end of inner for

            if (!colConstraint) {
                break;
            }
        }  //  end of outer for

        return colConstraint;
    }  //  end of checkCols

    public static boolean checkDiagonals(int qr[], int qc[]) {
        boolean diagonalConstraint = false;

        for (int i = 0; i < 7; i++) {
            for (int j = i + 1; j < 8; j++) {
                if (Math.abs(qr[i] - qr[j]) == Math.abs(qc[i] - qc[j])) {
                    diagonalConstraint = false;
                    break;
                }

                else {
                    diagonalConstraint = true;
                }
            }  //  end of inner for

            if (!diagonalConstraint) {
                break;
            }
        }  //  end of outer for

        return diagonalConstraint;
    }  //  end of checkDiagonals

    public static void printPositions(int qr[], int qc[]) {
        System.out.println("Position of queen 1 is row " + qr[0] + ", column " + qc[0]);
        System.out.println("Position of queen 2 is row " + qr[1] + ", column " + qc[1]);
        System.out.println("Position of queen 3 is row " + qr[2] + ", column " + qc[2]);
        System.out.println("Position of queen 4 is row " + qr[3] + ", column " + qc[3]);
        System.out.println("Position of queen 5 is row " + qr[4] + ", column " + qc[4]);
        System.out.println("Position of queen 6 is row " + qr[5] + ", column " + qc[5]);
        System.out.println("Position of queen 7 is row " + qr[6] + ", column " + qc[6]);
        System.out.println("Position of queen 8 is row " + qr[7] + ", column " + qc[7]);
    }  //  end of printPositions

}  // end of class
