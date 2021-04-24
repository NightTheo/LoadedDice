package src;

import java.util.ArrayList;

public abstract class Throwable {
    private int nbFaces;
    private ArrayList<Integer> faces;

    public int getNbFaces() {
        return nbFaces;
    }

    public ArrayList<Integer> getFaces() {
        return faces;
    }

    public void setNbFaces(int nbFaces) {
        this.nbFaces = nbFaces;
    }

    public void setFaces(ArrayList<Integer> faces) {
        this.faces = faces;
    }
}
