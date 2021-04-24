package src;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Knucklebone extends Throwable {
    public Knucklebone() {
        super();
        super.nbFaces = 4;
        super.faces.add(1);
        super.faces.add(3);
        super.faces.add(4);
        super.faces.add(6);
    }
}