package ccc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//INCOMPLETE
public class ccc06s3 {
    public static void main(String[] args) throws NumberFormatException, IOException {

        // initializing input reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // initializing variables
        int xR = Integer.parseInt(st.nextToken());
        int yR = Integer.parseInt(st.nextToken());
        int xJ = Integer.parseInt(st.nextToken());
        int yJ = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int block = 0;

        int[][] numBuildings = new int[N+1][64];
        numBuildings[0][0] = xR;
        numBuildings[0][1] = yR;
        numBuildings[0][2] = xJ;
        numBuildings[0][3] = yJ;
        double mBase = slope(numBuildings, 0, 0, 100);
        double bBase = yInt(numBuildings, 0, 0, mBase);

        for (int i = 1; i < N+1; i++) {
            st = new StringTokenizer(br.readLine());
            int numCorners = Integer.parseInt(st.nextToken());
            for (int j = 0; j < numCorners*2; j++) {
                numBuildings[i][j] = Integer.parseInt(st.nextToken());
            }

            for (int j = 0; j < numCorners*2+2; j+=2) {
                double m = slope(numBuildings, i, j, numCorners);
                double b = yInt(numBuildings, i, j%((numCorners*2)-2), m);
                double x = x(mBase, bBase, m, b);

                if (x == 1001) {
                    x = numBuildings[i][j];
                }
                if (x == Integer.MAX_VALUE) {
                    x = numBuildings[0][j];
                }
                double y = y(m, x, b);

                if (Math.min(numBuildings[i][j], numBuildings[i][j+2]) <= x && x <= Math.max(numBuildings[i][j], numBuildings[i][j+2])) {
                    if (Math.min(numBuildings[i][j+1], numBuildings[i][j+3]) <= y && y <= Math.max(numBuildings[i][j+1], numBuildings[i][j+3])) {
                        if (Math.min(numBuildings[0][j], numBuildings[0][j+2]) <= x && x <= Math.max(numBuildings[0][j], numBuildings[0][j+2])) {
                            if (Math.min(numBuildings[0][j+1], numBuildings[0][j+3]) <= y && y <= Math.max(numBuildings[0][j+1], numBuildings[0][j+3])) {
                                block++;
                                break;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(block);
    }

    public static double slope(int[][] numBuildings, int i, int j, int numCorners) {
        double m;
        int x1 = numBuildings[i][j%(numCorners*2)];
        int y1 = numBuildings[i][(j+1)%(numCorners*2)];
        int x2 = numBuildings[i][(j+2)%(numCorners*2)];
        int y2 = numBuildings[i][(j+3)%(numCorners*2)];

        if (x2 - x1 == 0) {
            m = 1001;
        } else if (y2 - y1 == 0) {
            m = 0;
        } else {
            m = (y2 - y1) / (x2 - x1);
        }
        return m;
    }

    public static double yInt(int[][] numBuildings, int i, int j, double m) {
        int x1 = numBuildings[i][j];
        int y1 = numBuildings[i][j+1];

        if (m == 1001) {
            return 0;
        } else if (m == 0) {
            return y1;
        }
        return y1 - (m * x1);
    }

    public static double x(double mBase, double bBase, double m, double b) {
        if (m == 1001) {
            return 1001;
        }
        if (mBase - m == 0) {
            return Integer.MAX_VALUE;
        }
        return (bBase - b) / (m - mBase);
    }

    public static double y(double m, double x, double b) {
        return (m * x) + b;
    }

}
