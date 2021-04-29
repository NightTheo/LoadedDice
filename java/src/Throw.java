package src;

import Random.RNG;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Throw {

    private int nbDiceFaces[];
    private int nbCoin;
    private int nbKnucklebone;
    private int[][] loadedDices;
    private ArrayList<Integer> lastThrow;
    private int breakUp = 0;

    public Throw(int nbDiceFaces[], int nbCoin, int nbKnucklebone,int[][] loadedDices) {
        this.nbDiceFaces = nbDiceFaces;
        this.nbCoin = nbCoin;
        this.nbKnucklebone =  nbKnucklebone;
        this.lastThrow = new ArrayList<>();
        this.loadedDices = loadedDices;
        this.lastThrow.add(-1);
    }

    public Throw(int nbDiceFaces[], int nbCoin, int nbKnucklebone,int[][] loadedDices, int breakUp) {
        this.nbDiceFaces = nbDiceFaces;
        this.nbCoin = nbCoin;
        this.nbKnucklebone =  nbKnucklebone;
        this.lastThrow = new ArrayList<>();
        this.loadedDices = loadedDices;
        this.lastThrow.add(-1);
        this.breakUp = breakUp;
    }

    public ArrayList<Integer> run() {
        int i ;
        double random;
        ArrayList<Integer> results = new ArrayList<>();
        for(i = 0; i < nbDiceFaces.length; i++){
            if (breakUp == 1 ){
                random = RNG.randomBreak(100);
            }else {
                random = 20;
            }

            if(nbDiceFaces[i] <= 4 || nbDiceFaces[i] >= 20 || random <= 10){
                results.add(-1);
                continue;
            }
            Dice d = new Dice(nbDiceFaces[i]);
            results.add(d.roll());
        }

        for(i = 0; i < loadedDices.length; i++){
            if(loadedDices[i][0] <= 4 || loadedDices[i][0] >= 20){
                results.add(-1);
                continue;
            }
            LoadedDice ld = new LoadedDice(loadedDices[i][0], loadedDices[i][1], loadedDices[i][2]);
            results.add(ld.roll());
        }

        Knucklebone k = new Knucklebone();
        for (i = 0 ; i < this.nbKnucklebone ; ++i)
            results.add(k.roll());


        Coin c = new Coin();
        for (i = 0 ; i < this.nbCoin ; ++i)
            results.add(c.roll());

        Collections.sort(results);
        Collections.reverse(results);

        this.lastThrow.clear();
        for(i = 0; i < results.size(); i++)
            lastThrow.add(results.get(i));
        return results;
    }

    public ArrayList<Integer> getLastThrow() {
        return this.lastThrow;
    }
}

