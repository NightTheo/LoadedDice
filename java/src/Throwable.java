package src;

import Random.RNG;

import java.util.ArrayList;

public abstract class Throwable {

    protected int nbFaces;
    protected ArrayList<Integer> faces;
    public Boolean breakable = true;

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

    protected void setNbFaces(int nbFaces) {
        this.nbFaces = nbFaces;
    }

    protected void setFaces(ArrayList<Integer> faces) {
        this.faces = faces;
    }

}
