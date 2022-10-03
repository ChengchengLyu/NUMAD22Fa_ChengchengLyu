package edu.northeastern.numad22fa_chengchenglyu;

public class Generator {
    private final String name;
    private final int value;
    public Generator(String name, int value){
        this.name = name;
        this.value = value;
    }
    public String getName(){return this.name;}
    public int getValue(){return this.value;}
}
