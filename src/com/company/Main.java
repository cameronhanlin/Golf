package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random rand = new Random();
        GolfCourse shadyGreens = new GolfCourse();
        int[] score = new int[18];

        shadyGreens.buildPar();

        for(int i=0; i<score.length; i++){ // build number of strokes of player
            score[i] = rand.nextInt(7)+1;
        }

        for(int i=0; i<score.length; i++){
            int x;
            x = shadyGreens.compareScore(i+1,score[i]);
            System.out.println("On hole "+(i+1)+", par was "+shadyGreens.getPar(i+1)+", you were "+
                    x+" away from par."+" "+shadyGreens.getTerm(i+1, x));
        }

        System.out.println("You hit a "+shadyGreens.getTotal(score)+" on a par of 72");

    }
}
