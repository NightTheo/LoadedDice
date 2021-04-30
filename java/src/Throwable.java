package src;

import Random.RNG;

import java.util.ArrayList;

public abstract class Throwable {

    protected int nbFaces;
    protected ArrayList<Integer> faces;
    public Boolean breakable;

    public Throwable(int nbFaces, ArrayList<Integer> faces, Boolean breakable){
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



    protected ArrayList<Integer> getFaces() {
        return faces;
    }

    static ArrayList<Integer> initFaces(int value) {
        ArrayList<Integer> faces = new ArrayList<>();
        for(int i = 1; i <= value; i++)
            faces.add(i);
        return faces;
    }

}
