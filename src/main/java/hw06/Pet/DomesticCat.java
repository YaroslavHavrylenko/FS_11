package hw06.Pet;

import hw06.Pet;

public class DomesticCat extends Pet implements Foul {
    @Override
    public void respond(){
        System.out.printf("Привіт, хазяїн. Я - %s, Домашній кіт. Мяу!!!\n", this.getNickname());
    };
    @Override
    public void foul () {
        System.out.println("Потрібно добре замести сліди...)");
    };

};
