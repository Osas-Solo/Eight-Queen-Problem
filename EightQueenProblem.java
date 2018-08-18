public class EightQueenProblem {
    public static void main(String[] args) {
        int[] qr = new int[8];
        int[] qc = new int[8];
        boolean constraintMet = false;
        
        while (constraintMet == false) {
            for(int n = 0; n < 8; n++) {
                qr[n] = 1 + ((int) (Math.random() * 8));
                qc[n] = 1 + ((int) (Math.random() * 8));
            }
            
            if ( qr[0] != qr[1] && qr[0] != qr[2] && qr[0] != qr[3] && qr[0] != qr[4] && qr[0] != qr[5] && qr[0] != qr[6] && qr[0] != qr[7]
                && qr[1] != qr[2] && qr[1] != qr[3] && qr[1] != qr[4] && qr[1] != qr[5] && qr[1] != qr[6] && qr[1] != qr[7]
                && qr[2] != qr[3] && qr[2] != qr[4] && qr[2] != qr[5] && qr[2] != qr[6] && qr[2] != qr[7]
                && qr[3] != qr[4] && qr[3] != qr[5] && qr[3] != qr[6] && qr[3] != qr[7]
                && qr[4] != qr[5] && qr[4] != qr[6] && qr[4] != qr[7]
                && qr[5] != qr[6] && qr[5] != qr[7]
                && qr[6] != qr[7]) {

                if ( qc[0] != qc[1] && qc[0] != qc[2] && qc[0] != qc[3] && qc[0] != qc[4] && qc[0] != qc[5] && qc[0] != qc[6] && qc[0] != qc[7]
                    && qc[1] != qc[2] && qc[1] != qc[3] && qc[1] != qc[4] && qc[1] != qc[5] && qc[1] != qc[6] && qc[1] != qc[7]
                    && qc[2] != qc[3] && qc[2] != qc[4] && qc[2] != qc[5] && qc[2] != qc[6] && qc[2] != qc[7]
                    && qc[3] != qc[4] && qc[3] != qc[5] && qc[3] != qc[6] && qc[3] != qc[7]
                    && qc[4] != qc[5] && qc[4] != qc[6] && qc[4] != qc[7]
                    && qc[5] != qc[6] && qc[5] != qc[7]
                    && qc[6] != qc[7] ) {
                    
                    if ( Math.abs(qr[0] - qr[1]) != Math.abs(qc[0] - qc[1]) && Math.abs(qr[0] - qr[2]) != Math.abs(qc[0] - qc[2]) && Math.abs(qr[0] - qr[3]) != Math.abs(qc[0] - qc[3]) && Math.abs(qr[0] - qr[4]) != Math.abs(qc[0] - qc[4]) && Math.abs(qr[0] - qr[5]) != Math.abs(qc[0] - qc[5]) && Math.abs(qr[0] - qr[6]) != Math.abs(qc[0] - qc[6]) && Math.abs(qr[0] - qr[7]) != Math.abs(qc[0] - qc[7])
                       && Math.abs(qr[1] - qr[2]) != Math.abs(qc[1] - qc[2]) && Math.abs(qr[1] - qr[3]) != Math.abs(qc[1] - qc[3]) && Math.abs(qr[1] - qr[4]) != Math.abs(qc[1] - qc[4]) && Math.abs(qr[1] - qr[5]) != Math.abs(qc[1] - qc[5]) && Math.abs(qr[1] - qr[6]) != Math.abs(qc[1] - qc[6]) && Math.abs(qr[1] - qr[7]) != Math.abs(qc[1] - qc[7])
                       && Math.abs(qr[2] - qr[3]) != Math.abs(qc[2] - qc[3]) && Math.abs(qr[2] - qr[4]) != Math.abs(qc[2] - qc[4]) && Math.abs(qr[2] - qr[5]) != Math.abs(qc[2] - qc[5]) && Math.abs(qr[2] - qr[6]) != Math.abs(qc[2] - qc[6]) && Math.abs(qr[2] - qr[7]) != Math.abs(qc[2] - qc[7])
                       && Math.abs(qr[3] - qr[4]) != Math.abs(qc[3] - qc[4]) && Math.abs(qr[3] - qr[5]) != Math.abs(qc[3] - qc[5]) && Math.abs(qr[3] - qr[6]) != Math.abs(qc[3] - qc[6]) && Math.abs(qr[3] - qr[7]) != Math.abs(qc[3] - qc[7])
                       && Math.abs(qr[4] - qr[5]) != Math.abs(qc[4] - qc[5]) && Math.abs(qr[4] - qr[6]) != Math.abs(qc[4] - qc[6]) && Math.abs(qr[4] - qr[7]) != Math.abs(qc[4] - qc[7])
                       && Math.abs(qr[5] - qr[6]) != Math.abs(qc[5] - qc[6]) && Math.abs(qr[5] - qr[7]) != Math.abs(qc[5] - qc[7])
                       && Math.abs(qr[6] - qr[7]) != Math.abs(qc[6] - qc[7]) ) {
                           constraintMet = true;
                    }  // end of diagonal constraint
                    
                    else {
                        constraintMet = false;
                    }
                }  // end of column constraint

            }  // end of row constraint
            
            else {
                constraintMet = false;
            }
        }  // end of while loop
        
        System.out.println("Position of queen 1 is row " + qr[0] + ", column " + qc[0]);
        System.out.println("Position of queen 2 is row " + qr[1] + ", column " + qc[1]);
        System.out.println("Position of queen 3 is row " + qr[2] + ", column " + qc[2]);
        System.out.println("Position of queen 4 is row " + qr[3] + ", column " + qc[3]);
        System.out.println("Position of queen 5 is row " + qr[4] + ", column " + qc[4]);
        System.out.println("Position of queen 6 is row " + qr[5] + ", column " + qc[5]);
        System.out.println("Position of queen 7 is row " + qr[6] + ", column " + qc[6]);
        System.out.println("Position of queen 8 is row " + qr[7] + ", column " + qc[7]);        
    }
}