package app;

public class Game {
    public void actualGame() {

        Board Barea = new Board();
        Piece Player_X = new Piece("X");
        Piece Player_O = new Piece("O");       

        while (Barea.winner == null) {
            Barea.PrintArea();

            while (Barea.Turn(Player_X.GetMarker(), Player_X.GetMove()) == false) {
                Barea.PrintArea();
            }

            Barea.IsWinner(Player_X.GetMarker());
            if (Barea.winner != null) {
                break;
            }

            Barea.PrintArea();

            while (Barea.Turn(Player_O.GetMarker(), Player_O.GetMove()) == false) {
                Barea.PrintArea();
            }
            Barea.IsWinner(Player_O.GetMarker());
            if (Barea.winner != null) {
                break;
            }

        }
        
        Barea.PrintArea();
        System.out.println();     
        System.out.println("Player " + Barea.winner + " Won!");

        Barea.GameOver();
        
    }

    
}
