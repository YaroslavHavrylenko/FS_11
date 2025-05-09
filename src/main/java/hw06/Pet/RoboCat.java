package hw06.Pet;

import hw06.Pet;

public class RoboCat extends Pet {

    @Override
    public void respond(){
        System.out.printf("Привіт, хазяїн. Я - %s, кіт-робот. Мя-у, мя-у!!!\n", this.getNickname());
    };
}
