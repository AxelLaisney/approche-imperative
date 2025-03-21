package fr.tableaux;

import java.lang.reflect.Array;

public class ExerciceDeclarationTab {
    public static void main ( String[] args){
        int[] numbers = {8, -7, 12, 1, -2, -14};

        System.out.println(numbers[0]);

        for(int num: numbers){
            System.out.println(num);
        }

        System.out.println(numbers.length);
        System.out.println(numbers[1]);
        System.out.println(numbers[10]);
        //l'instruction du dessus échoue car le tableau n'a été défini que avec une taille de 6 élements
    }
}
