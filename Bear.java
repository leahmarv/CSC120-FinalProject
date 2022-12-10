/*
 * Bear Class
 * Final Project
 * @author Leah Marville
 * @ version 9 December 2022
 */

//import java.util.ArrayList;

public class Bear {

    boolean hungry;
    String species;
    int xcoord;
    int ycoord;

    public Bear(boolean hungry, String species, int x, int y) {
        this.hungry = hungry;
        this.species = species;
        this.xcoord = x;
        this.ycoord = y;
    }

    public void moveBear(int x, int y) {
        this.xcoord = x;
        this.ycoord = y;
    }

}