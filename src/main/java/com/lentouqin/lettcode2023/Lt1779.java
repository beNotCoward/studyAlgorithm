package com.lentouqin.lettcode2023;

public class Lt1779 {
    public static void main(String[] args) {
        int x= 3;
        int y =4;
        int[][] point={{3,4}};
        nearestValidPoint(x,y,point);
    }

    public static int nearestValidPoint(int x, int y, int[][] points) {
        int n = points.length;
        int best = Integer.MAX_VALUE, bestid = -1;
        for (int i = 0; i < n; ++i) {
            int px = points[i][0], py = points[i][1];
            if (x == px) {
                int dist = Math.abs(y - py);
                if (dist < best) {
                    best = dist;
                    bestid = i;
                }
            } else if (y == py) {
                int dist = Math.abs(x - px);
                if (dist < best) {
                    best = dist;
                    bestid = i;
                }
            }
        }
        return bestid;
    }

    public static int mine(int x,int y, int[][] points){

        int index=-1;
        int max=Integer.MAX_VALUE;
        for (int i = 0; i < points.length; i++) {
            int tempX = points[i][0];
            int tempY = points[i][1];
            if (tempX == x) {
                int tempSum = Math.abs(y - tempY);
                if (tempSum < max) {
                    max = tempSum;
                    index = i;
                }
            }else if(tempY == y) {
                int tempSum = Math.abs(x - tempX);
                if (tempSum < max) {
                    max = tempSum;
                    index = i;
                }
            }
        }

        return index;
    }
}
