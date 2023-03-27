package com.nativegame.match3game.game.algorithm.target;

import com.nativegame.match3game.game.layer.tile.Tile;
import com.nativegame.match3game.game.layer.tile.type.CakeTile;

/**
 * Created by Oscar Liang on 2022/02/23
 */

public class CakeTargetHandler implements TargetHandler {

    //--------------------------------------------------------
    // Overriding methods
    //--------------------------------------------------------
    @Override
    public boolean checkTarget(Tile tile) {
        if (tile instanceof CakeTile) {
            return ((CakeTile) tile).getObstacleLayer() == 1;
        } else {
            return false;
        }
    }
    //========================================================

}
