package src;

import Random.RNG;

import java.util.ArrayList;
import java.util.List;

public abstract class Throwable {

    protected int nbFaces;
    protected List<Integer> faces;
    public Boolean breakable;

    public Throwable(int nbFaces, List<Integer> faces, Boolean breakable){
        this.nbFaces = nbFaces;
        this.faces = faces;
        this.breakable = breakable;
    }

    public int roll(){
        return this.getFace(RNG.random(this.getNbFaces()));
    }

    protected int getNbFaces() {
        return nbFaces;
    }

    protected int getFace(int position) {
        return faces.get(position);
    }



    protected List<Integer> getFaces() {
        return faces;
    }

    static List<Integer> initFaces(int value) {
        List<Integer> faces = new ArrayList<>();
        for(int i = 1; i <= value; i++)
            faces.add(i);
        return faces;
    }

}
