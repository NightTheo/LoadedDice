package src;

import java.util.ArrayList;

public class Dice extends Throwable {
    public Dice(int value) {
        super();
        if( 4 < value || value > 20 ) {
            super.setNbFaces(value);

            ArrayList<Integer> faces = new ArrayList<>();
            for(int i = 1; i <= value; i++)
                faces.add(i);
            super.setFaces(faces);
        }else{
            super.setNbFaces(0);
        }
    }
}