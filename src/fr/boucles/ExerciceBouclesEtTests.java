package fr.boucles;

public class ExerciceBouclesEtTests {
    public static void main(String[] args){
        int[] numbers = {1, 15, -3, 0, 8, 7, 4 ,-2, 28, 7, -1, 17, 2 ,3 ,0, 14, -4};

        for(int n: numbers){
            System.out.println(n);
        }

        for(int i = -1; (i + numbers.length) >= 0; i--){
            System.out.println(numbers[numbers.length + i]);
        }

        for(int n: numbers){
            if(n > 3){
                System.out.println(n);
            }
        }

        for(int n: numbers){
            if((n & 1) == 0 ){
                System.out.println(n);
            }
        }

        for(int i = 0; i < numbers.length; i++){
            if((i & 1) != 0){
                System.out.println(i);
            }
        }

        for(int n: numbers){
            if((n & 1) != 0){
                System.out.println(n);
            }
        }
    }
}
