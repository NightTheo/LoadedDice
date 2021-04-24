package java.src;

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

    public static int throwCoin () {
        return 1;
    }
}