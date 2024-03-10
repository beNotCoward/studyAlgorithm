package com.lentouqin.lettcode2023;

public class Lt684 {

    public static void main(String[] args) {
        int[][] ints ={{1,2},{1,3},{2,3}};
        findRedundantConnection(ints);
    }

    public static int[] fun = new int[1004];

    public static void init(){
        int n = 1003;
        for (int i = 0; i < n; i++) {
            fun[i] = i;
        }
    }


    public static int[] findRedundantConnection(int[][] edges) {
        init();
        for (int i = 0; i < edges.length; i++) {
            if (same(edges[i][0], edges[i][1])) {
                return edges[i];
            } else {
                join(edges[i][0],edges[i][1]);
            }
        }
        return new int[1];
    }

    public static boolean same(int k, int v) {
        k = getRoot(k);
        v = getRoot(v);
        return k == v;
    }

    public static void join(int k, int v) {
        k = getRoot(k);
        v = getRoot(v);
        fun[k] = v;
    }

    public static int getRoot(int v) {
        if (v == fun[v]) {
            return v;
        }
        v = fun[v];
        fun[v] = getRoot(v);
        return fun[v];
    }



}
