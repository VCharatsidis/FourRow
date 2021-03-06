package ai.game_abstractions;


/** Abstraction of a game state for a 2-player zero-sum game */
public abstract class GameState {

  // TODO Consider to implement a choice between providing a copy method and reversing the last move
  /** Clones the state, required by search techniques */
  public abstract <S extends GameState> S copy();

}
