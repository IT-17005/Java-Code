package ICE31;

public class Array {

    public static void main(String[] args) {
        int ar[] = {2,1,2,4,374,5435,21,14};

        for(int i=0; i < ar.length;i++){
        System.out.println(ar[i]);
        }

//            int twoD[][] = new int[4][4];
//            int i, j, k = 0;
//            for(i=0; i<4; i++)
//                for(j=0; j<4; j++) {
//                    twoD[i][j] = k;
//                    k++;
//                }
        int twoD[][] = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
            for(int i=0; i<4; i++) {
                for(int j=0; j<4; j++)
                    System.out.print(twoD[i][j] + " ");
                System.out.println();
            }
        }

    }
