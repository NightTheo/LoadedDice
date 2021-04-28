package src;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Throw {

    private int nbDiceFaces[];
    private int nbCoin;
    private int nbKnucklebone;
    private ArrayList<Integer> lastThrow;

    public Throw(int nbDiceFaces[], int nbCoin, int nbKnucklebone) {
        this.nbDiceFaces = nbDiceFaces;
        this.nbCoin = nbCoin;
        this.nbKnucklebone =  nbKnucklebone;
        this.lastThrow = new ArrayList<>();
        this.lastThrow.add(-1);
    }

    public ArrayList<Integer> run() {
        ArrayList<Integer> results = new ArrayList<>();
        for(int i = 0; i < nbDiceFaces.length; i++){
            Dice d = new Dice(nbDiceFaces[i]);
            results.add(d.roll());
        }

        Collections.sort(results);
        Collections.reverse(results);

        this.lastThrow.clear();
        for(int i = 0; i < results.size(); i++)
            lastThrow.add(results.get(i));
        return results;
    }

    @Override
    public String toString() {
        return this.lastThrow.toString();
    }
}
