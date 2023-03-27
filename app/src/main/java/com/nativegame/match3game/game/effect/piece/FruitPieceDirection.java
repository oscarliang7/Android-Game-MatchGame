package com.nativegame.match3game.game.effect.piece;

/**
 * Created by Oscar Liang on 2022/02/23
 */

public enum FruitPieceDirection {
    LEFT,
    RIGHT;

    //--------------------------------------------------------
    // Getter and Setter
    //--------------------------------------------------------
    public int getIndex() {
        switch (this) {
            case LEFT:
                return 0;
            case RIGHT:
                return 1;
            default:
                throw new IllegalArgumentException("FruitPiece not found!");
        }
    }

    public int getDirection() {
        switch (this) {
            case LEFT:
                return -1;
            case RIGHT:
                return 1;
            default:
                throw new IllegalArgumentException("FruitPiece not found!");
        }
    }
    //========================================================

}
