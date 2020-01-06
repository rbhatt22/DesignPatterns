package com.practice.bhpatterns.strategy;

/**
 * Created by rbhatt22 on 11/21/19.
 * Context class
 */
public class Dragon {

    private String name;
    private Integer level;
    private Integer health;

    //Getters and Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getLevel() {
        return level;
    }
    public void setLevel(Integer level) {
        this.level = level;
    }
    public Integer getHealth() {
        return health;
    }
    public void setHealth(Integer health) {
        this.health = health;
    }

    //Strategy
    public Attack attackType;

    protected void setAttackType(Attack attackType) {
        this.attackType = attackType;
    }



}
