/**
 * Tehtävä 4 – Rectangle
 *
 * MITÄ TEET TÄHÄN TIEDOSTOON:
 *  1. Kentät: width, height.
 *  2. Konstruktori.
 *  3. Ylikirjoita area(), toString(), equals().
 *
 * VINKIT:
 *  - Muista @Override.
 *
 * HUOM:
 *  - Älä käytä ArrayListiä tai muita kokoelmia.
 *  - Ei käyttäjän syötteitä metodeissa; testaa `main()`ista.
 */

package fi.viikko2.task04;

public class Rectangle extends Shape {
private double width;
private double height;

public Rectangle(double width, double height){
    super();
    this.height=height;
    this.width=width;
}

    @Override
    public double area(){ 
        return height*width;
    }

    @Override
    public String toString(){ 
        return "leveys: "+width+", korkeus: "+ height;
    }

    @Override
    public boolean equals(Object o){ 
        if(this == o)return true;
        if(!(o instanceof Rectangle))return false;

        Rectangle other = (Rectangle)o;
        return this.height==other.height && this.width == other.width;
    }
}