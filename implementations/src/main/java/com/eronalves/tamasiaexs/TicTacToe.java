package com.eronalves.tamasiaexs;

import java.util.Arrays;

/**
 * TicTacToe
 */
public class TicTacToe {

  public static final int X = 1, O = -1, EMPTY = 0;
  private int board[][] = new int[3][3];
  private int player;

  public TicTacToe() {
    clearBoard();
  }

  public void clearBoard() {
    for (int i = 0; i < 3; i++)
      for (int j = 0; j < 3; j++)
        board[i][j] = EMPTY;
    player = X;
  }

  public void putMark(int i, int j) throws IllegalArgumentException {
    if ((i < 0) || (i > 2) || (j < 0) || (j > 2))
      throw new IllegalArgumentException(("Invalid board position"));
    if (board[i][j] != EMPTY)
      throw new IllegalArgumentException(("Board position occupied"));
    if (winner() != 0)
      throw new IllegalArgumentException("Game already has winner");
    board[i][j] = player;
    player = -player;
  }

  public boolean isWin(int mark) {
    return ((board[0][0] + board[0][1] + board[0][2] == mark * 3))
        || ((board[1][0] + board[1][1] + board[1][2] == mark * 3))
        || ((board[2][0] + board[2][1] + board[2][2] == mark * 3))
        || ((board[0][0] + board[1][0] + board[2][0] == mark * 3))
        || ((board[0][1] + board[1][1] + board[2][1] == mark * 3))
        || ((board[0][2] + board[1][2] + board[2][2] == mark * 3))
        || ((board[0][0] + board[1][1] + board[2][2] == mark * 3))
        || ((board[2][0] + board[1][1] + board[0][2] == mark * 3));
  }

  public int winner() {
    if (isWin(X))
      return (X);
    else if (isWin(O))
      return (O);
    else
      return (0);
  }

  @Override
  public String toString() {
    return "TicTacToe1{board=" + Arrays.toString(board) + "}";
  }

}
