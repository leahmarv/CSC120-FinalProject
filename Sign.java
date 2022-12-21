/*
 * Sign Class
 * Final Project
 * @author Leah Marville
 * @ version 9 December 2022
 */

public class Sign {
    
    String message;
    int xcoord;
    int ycoord;

    public Sign(String message, int x, int y) {
        this.message = message;
        this.xcoord = x;
        this.ycoord = y;
    }

    public String readSign() {
        return message;
    }

}