import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Cordonnee a=new Cordonnee();
        a.setX(78);
        a.afficher();
        a.somme();
        System.out.println("Somme="+a.somme());

        Cordonnee b=new Cordonnee(10,5,7);
        b.afficher();
        System.out.println(b.getX()+"+"+b.getY()+"+"+b.getZ()+"="+b.somme());

        //System.out.println("This is my first java project");
    }
}