package com.githup.anhduyqh123;

import java.util.Random;

public class Util {
    private static Random random = new Random();
    public static int RandomInt(int start, int end)
    {
        int del = end-start+1;
        return start+random.nextInt(del);
    }
    public static long RandomLong(long start, long end)
    {
        long del = end-start+1;
        long l = Math.abs(random.nextLong());
        return start+l%del;
    }

    public static float RandomFloat(float start, float end)
    {
        float del = end - start;
        return start+random.nextFloat()*del;
    }
}
