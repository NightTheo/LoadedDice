package src;

import Random.RNG;

import java.util.ArrayList;
import java.util.Collections;

public class Throw {

    private int nbDiceFaces[];
    private int nbCoin;
    private int nbKnucklebone;
    private int[][] loadedDices;
    private ArrayList<Integer> results;
    private ArrayList<Integer> lastThrow;

    public Throw(int nbDiceFaces[], int nbCoin, int nbKnucklebone,int[][] loadedDices) {
        if( nbDiceFaces.length + nbCoin + nbKnucklebone + loadedDices.length > 5 )
            throw new IllegalArgumentException("Maximum five");
        this.nbDiceFaces = nbDiceFaces;
        this.nbCoin = nbCoin;
        this.nbKnucklebone =  nbKnucklebone;
        this.lastThrow = new ArrayList<>();
        this.loadedDices = loadedDices;
        this.lastThrow.add(-1);

    }

    public ArrayList<Integer> run() {
        int i;
        results = new ArrayList<>();

        runDices();
        runLoadedDices();
        runKnucklebones();
        runCoins();

        Collections.sort(results);
        Collections.reverse(results);

        this.lastThrow.clear();
        for(i = 0; i < results.size(); i++)
            lastThrow.add(results.get(i));
        return results;
    }

    private void runDices() {
        int i, random;
        for(i = 0; i < nbDiceFaces.length; i++){
            random = RNG.random(100);
            if(nbDiceFaces[i] <= 4 || nbDiceFaces[i] >= 20 || random <= 10){
                this.results.add(-1);
                continue;
            }
            Dice d = new Dice(nbDiceFaces[i]);
            this.results.add(d.roll());
        }
    }

    private void runLoadedDices() {
        for(int i = 0; i < loadedDices.length; i++){
            if(loadedDices[i][0] <= 4 || loadedDices[i][0] >= 20){
                results.add(-1);
                continue;
            }
            LoadedDice ld = new LoadedDice(loadedDices[i][0], loadedDices[i][1], loadedDices[i][2]);
            results.add(ld.roll());
        }
    }

    private void runKnucklebones() {
        Knucklebone k = new Knucklebone();
        for (int i = 0 ; i < this.nbKnucklebone ; ++i)
            results.add(k.roll());
    }

    private void runCoins() {
        int i, random;
        Coin c = new Coin();
        for (i = 0 ; i < this.nbCoin ; ++i) {
            random = RNG.random(100);
            if(random <= 5){
                results.add(-1);
                continue;
            }
            results.add(c.roll());
        }
    }

    public ArrayList<Integer> getLastThrow() {
        return this.lastThrow;
    }
}

