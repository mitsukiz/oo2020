package app;

public class Board {

    String[] area;

    String winner;

    public void GameOver() {
        System.out.println();
        System.out.println("---END---");
    }
    
    public Board() {
        area = new String[9];

        for (int i = 0; i < area.length; i++) {
            area[i] = String.valueOf(i + 1);
        }
    }

    public boolean Turn(String _marker, int _slot) {
        if (Available(_slot - 1)) {
            area[_slot - 1] = _marker;
            return true;
        } else {
            System.out.println("This place is used! Try something else.");
            return false;
        }
    }

    public boolean Available(int _slot) {
        if (area[_slot] == "X" || area[_slot] == "O") {
            return false;
        } else {
            return true;
        }
    }

    public boolean IsWinner(String _marker) {
        for (int i = 0; i < 8; i++) {
            String line = null;
            switch (i) {
                case 0:
                    line = area[0] + area[1] + area[2];
                    break;
                case 1:
                    line = area[3] + area[4] + area[5];
                    break;
                case 2:
                    line = area[6] + area[7] + area[8];
                    break;
                case 3:
                    line = area[0] + area[3] + area[6];
                    break;
                case 4:
                    line = area[1] + area[4] + area[7];
                    break;
                case 5:
                    line = area[2] + area[5] + area[8];
                    break;
                case 6:
                    line = area[0] + area[4] + area[8];
                    break;
                case 7:
                    line = area[2] + area[4] + area[6];
                    break;
            }

            if (line.equals(_marker + _marker + _marker)) {
                winner = _marker;
                return true;
            }
        }

        int nOfFreeSlots = 8;
        for (int i = 0; i < 8; i++) {
            if (!Available(i)) {
                nOfFreeSlots--;
            }
        }

        if (nOfFreeSlots <= 0 && winner == null) {
            winner = "Tie";
            return true;
        } else {
            return false;
        }
    }

    public void PrintArea() {
        System.out.println();
        System.out.println(); 

        
        System.out.println(" | " + area[0] + " | " + area[1] + " | " + area[2] + " | ");
        System.out.println();
        System.out.println(" | " + area[3] + " | " + area[4] + " | " + area[5] + " | ");
        System.out.println();
        System.out.println(" | " + area[6] + " | " + area[7] + " | " + area[8] + " | ");
        
    }

    
}
