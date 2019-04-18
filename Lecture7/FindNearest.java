public class FindNearest {
    public static void main(String[] args) {
        double[][] point = {{-1, 3}, {-1, -1}, {1, 1}, {2, 0.5}, {2, -1}, {3, 3}, {4, 2}, {4, -0.5}};

        double[] distance = new double[28];
        int[][] dindex = new int[28][2];

        int idx = 0;
        for ( int i = 0; i < 7; i++ ) {
            for ( int j = i+1; j < 8; j++ ) {
                distance[idx] = (point[i][0] - point[j][0])*(point[i][0] - point[j][0])
                        + (point[i][1] - point[j][1])*(point[i][1] - point[j][1]);
                dindex[idx][0] = i;
                dindex[idx][1] = j;
                idx++;
            }
        }

        double min = distance[0];
        int k = 0;
        for ( int i = 1; i < 28; i++ ) {
            if ( min > distance[i] ) {
                min = distance[i];
                k = i;
            }
        }

        System.out.println("(" + point[dindex[k][0]][0] + ", " + point[dindex[k][0]][1] +
                "), (" + point[dindex[k][1]][0] + ", " + point[dindex[k][1]][1] + ")"
        );
    }
}
