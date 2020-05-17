package app;

import java.util.Scanner;

public class Piece {
    private String marker;

    Scanner in = new Scanner(System.in);

    public Piece(String _marker) {
        if (_marker != "X" && _marker != "O") {
            marker = "X";
        } else {
            marker = _marker;
        }
    }

    public String GetMarker() {
        return marker;
    }

    public int GetMove() {
        int move;
        do {
            System.out.println(); 
            System.out.println(marker + "'s turn! Type number from 1 to 10.");
            try {
                move = Integer.parseInt(in.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("It's not correct number!");
                move = 0; // kordab kuni sobiva sisendini
            }
        } while (move < 1 || move > 9);

        return move;
    }
    

    
}