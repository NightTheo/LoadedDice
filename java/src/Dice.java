package java.src;

public class Dice extends Throwable {
    public Dice(int value) {
        super();
        if( 4 < value || value > 20 ) {
            super.nbFaces = value;
            for(int i = 1; i <= value; i++)
                super.faces.add(i);
        }else{
            super.nbFaces = 0;
        }
    }
}