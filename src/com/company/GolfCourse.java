package com.company;

import java.util.Random;

public class GolfCourse {

    public Random rand = new Random();
    private int[] par = new int[18];


    public void buildPar(){ //builds Par Array with random numbers
        int x;
        for(int i=0; i<par.length/2; i++){
            x = rand.nextInt(3)-1;
            par[i]=x;
            par[i+9]=x*-1;
        }
        for(int i=0; i<par.length; i++) {
            par[i] = par[i]+4;
        }
    }

    public int getPar(int hole){ //returns par at a certain hole
        return par[hole-1];
    }

    public int compareScore(int hole, int shots){ // returns number away from par
        return shots - par[hole-1];
    }

    public int getTotal(int [] strokes){ // receives array of strokes player made, and returns total
        int total = 0;
        for(int i=0; i< strokes.length; i++){
            total = total+strokes[i];
        }
        return total;
    }

    public String getTerm(int hole, int offPar){ //Returns a string for the golf term away from par
        if(par[hole-1]+offPar == 1)
            return "An Ace";
        else if(offPar == -3)
            return "A Double Eagle";
        else if(offPar == -2)
            return "An Eagle";
        else if(offPar == -1)
            return "A Birdie";
        else if(offPar == 0)
            return "A Par";
        else if(offPar == 1)
            return "A Bogey";
        else if(offPar == 2)
            return "A Double Bogey";
        else if(offPar == 3)
            return "A Triple Bogey";
        else if(offPar == 4)
            return "A Quadruple Bogey";
        else
            return "XXXXXX";
    }
}
