public class FindNearestCosine {
    public static void main(String[] args) {
        double[][] point = {{-1, 3}, {-1, -1}, {1, 1}, {2, 0.5}, {2, -1}, {3, 3}, {4, 2}, {4, -0.5}};

        double[] cosine = new double[28];
        int[][] index = new int[28][2];

        int idx = 0;
        for ( int i = 0; i < 7; i++ ) {
            for ( int j = i+1; j < 8; j++ ) {
                cosine[idx] = (point[i][0]*point[j][0] + point[i][1]*point[j][1])
                        / ( Math.sqrt(point[i][0]*point[i][0] + point[i][1]*point[i][1]) *
                        Math.sqrt(point[j][0]*point[j][0] + point[j][1]*point[j][1]) );
                index[idx][0] = i;
                index[idx][1] = j;
                idx++;
            }
        }

        double max = cosine[0];
        int k = 0;
        for ( int i = 1; i < 28; i++ ) {
            if ( max < cosine[i] ) {
                 max = cosine[i];
                k = i;
            }
        }

        System.out.println("(" + point[index[k][0]][0] + ", " + point[index[k][0]][1] +
                ") (" + point[index[k][1]][0] + " " + point[index[k][1]][1] + ")"
        );
    }
}
