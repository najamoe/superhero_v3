package com.example.superheltev3.model;

public class Superhelt {

    private String realname;
    private String superheroname;
    private String superpower;
    private boolean human;
    private double power;

    public Superhelt(String realname, String superheroname, String superpower, boolean human, double power) {
        this.realname = realname;
        this.superheroname = superheroname;
        this.superpower = superpower;
        this.human = human;
        this.power = power;
    }

    public String getRealname() {
        return realname;
    }

    public String getSuperheroname() {
        return superheroname;
    }

    public String getSuperpower() {
        return superpower;
    }

    public boolean isHuman() {
        return human;
    }

    public double getPower() {
        return power;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public void setSuperheroname(String superheroname) {
        this.superheroname = superheroname;
    }

    public void setSuperpower(String superpower) {
        this.superpower = superpower;
    }

    public void setHuman(boolean human) {
        this.human = human;
    }

    public void setPower(double power) {
        this.power = power;
    }

}
