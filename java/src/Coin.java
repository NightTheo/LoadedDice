package src;

import Random.RNG;
import Random.RNGMock;
import java.util.ArrayList;

public class Coin extends Throwable{
    public Coin() {
        super();
        super.setNbFaces(2);
        ArrayList<Integer> faces = new ArrayList<Integer>();
        faces.add(1);
        faces.add(2);
        super.setFaces(faces);
    }

    public int throwCoin () {
        return this.getFace(RNG.random(this.getNbFaces()));
    }
}