package com.company;
public class Main {

    public static void main(String[] args) {
        // write your code here
        Animal[] animal = {new Shark(), new Turtle(), new Eagle()};
        Animal[] animals = {animal[0], animal[1], animal[2]};
        for (Animal a : animal) {
            if (a instanceof Shark) {
                ((Shark) a).attack();
            }

            if (a.getClass().getName().equals("com.company.Turtle")) {
                assert a instanceof Turtle;
                ((Turtle) a).swim();
            }

            if (a instanceof Eagle){
                ((Eagle)a).fly();
            }
        }
    }
}




//    Animal деген класс тузунуз жана бир метод кошунуз.
//        Анын 3 наследнигин тузунуз.
//
//        Shark деген класска attack(), Turtle деген класска swim() жана Eagle деген класска fly() методторун тузосуз.
//        Animal тибин колдонуп массив тузунуз жана ал жакка анын наследниктерин
//        кошунуз.
//        instanceOf жана getClass()-ты колдонуп Animal массивиндеги жаныбарлардын оздорунун методдорун
//        чыгарыныз.
//        Ар бир объект учун оз озунчо массив тузуп Animal массивиндеги жаныбарларды
//        болуп оз озунун массивине салыныз