package fr.tableaux;

public class ExerciceTableauChaines {
    public static void main(String[] args){
        String[] villes = {"Sete", "Balaruc", "Frontignan", "nîmes", "Montpellier"};
        for(String v: villes){
            System.out.println(v);
        }

        System.out.println(villes.length);
        villes[3] = "Rems";

        for(String v: villes){
            System.out.println(v);
        }
    }
}
