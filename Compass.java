/*
 * Compass Class
 * Final Project
 * @author Leah Marville
 * @ version 9 December 2022
 */

public class Compass {
    String coords;

    public Compass() {

    }

    public String getOrientation(){
        coords = Player.getxCoord().toString() + Player.getyCoord().toString;
    }

}
