package com.bwh.game.unit;

import com.bwh.game.effect.Effect;

/**
 * @author Benjamin Hetherington
 * @since 11/10/2016
 */
public class Ability {
    private int cost;
    private Effect effect;

    public Ability(int cost, Effect effect) {
        this.cost = cost;
        this.effect = effect;
    }

    public int getCost() {
        return cost;
    }

    public Effect getEffect() {
        return effect;
    }

    public boolean execute() {
        effect.execute();
        return true;
    }
}
