package app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;


import org.junit.Test;

public class Tests {

    Piece Player_X = new Piece("X");
    Piece Player_O = new Piece("O");
    Game GameObject = new Game();
    Board BoardObject = new Board();
    
    @Test
    public void test1() {
        assertEquals(10, 5+5);
    }

    @Test
    public void test2() {
        assertEquals(10, 5+6);
    }

    @Test
    public void test3() {
        assertEquals(Player_X.GetMarker(), "X");
    }

    @Test
    public void test4() {
        assertEquals(Player_O.GetMarker(), "O");
    }

    @Test
    public void test5() {
        assertNotSame(Player_X, Player_O);
    }

    @Test
    public void test6() {
        assertTrue(BoardObject.Turn(null, 1));
        assertTrue(BoardObject.Turn(null, 2));
        assertTrue(BoardObject.Turn(null, 3));
        assertTrue(BoardObject.Turn(null, 4));
        assertTrue(BoardObject.Turn(null, 5));
        assertTrue(BoardObject.Turn(null, 6));
        assertTrue(BoardObject.Turn(null, 7));
        assertTrue(BoardObject.Turn(null, 8));
        assertTrue(BoardObject.Turn(null, 9));
    }

    @Test
    public void test7() {
        assertFalse(BoardObject.IsWinner(null));
    }


}