package fr.boucles;

public class ExerciceBoucleBase {
    public static void main(String[] args){
        //Affiche de 1 à 10
        for(int i = 0; i < 10; i++){
            System.out.println(i + 1);
        }

        //Affiche une string 20 fois
        for(int i = 0; i<20; i++){
            System.out.println("Axel");
        }

        //nombres pair
        for(int i = 0; i<101; i++){
            if((i & 1) == 0 ){
                System.out.println(i);
            }
        }

        //nombres impair
        for(int i = 0; i<100; i++){
            if((i & 1) != 0 ){
                System.out.println(i);
            }
        }
    }
}
