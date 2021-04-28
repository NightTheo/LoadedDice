package src;


import Random.RNG;
import Random.RNGMock;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Knucklebone extends Throwable {
    public Knucklebone() {
        super();
        super.setNbFaces(4);

        ArrayList<Integer> faces = new ArrayList<>();
        faces.add(1);
        faces.add(3);
        faces.add(4);
        faces.add(6);
        super.setFaces(faces);
    }

}