package com.kodilla.rps;

import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class RPSTestSuite {

    private Player player = mock(Player.class);
    private Computer computer = mock(Computer.class);
    private GameOutcome gameOutcome = new GameOutcome(player,computer,1);

    @Test
    public void player1Wins() {
        when(player.makeMove()).thenReturn("2");
        when(computer.makeMove()).thenReturn("1");

        int result = gameOutcome.play().getPlayer1Points();

        Assert.assertEquals(1, result);
    }

    @Test
    public  void player2Wins() {
        when(player.makeMove()).thenReturn("1");
        when(computer.makeMove()).thenReturn("2");

        int result = gameOutcome.play().getPlayer1Points();

        Assert.assertEquals(0, result);
    }

    @Test
    public  void playerEndsGame() {
        when(player.makeMove()).thenReturn("x");
        when(computer.makeMove()).thenReturn("2");

        int result = gameOutcome.play().getPlayer1Points();

        Assert.assertEquals(0, result);
    }
}