package java.src;

import java.util.ArrayList;

public abstract class Throwable {

    protected int nbFaces;
    protected ArrayList<Integer> faces;

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
