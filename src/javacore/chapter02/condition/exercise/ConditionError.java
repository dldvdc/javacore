package javacore.chapter02.condition.exercise;

public class ConditionError {
    public static void main(String[] args) {

        int age = 80;

        if(age <= 16) {
            System.out.println("Vous êtes mineur.");
        }
        else if(age == 17) {
            System.out.println("Vous êtes bientôt majeur !");
        }
        else if(age == 18) {
            System.out.println("Vous êtes majeur.");
        }

        // Ce bloc de code doit poursuivre la logique des blocs précédents, et opérer comme un filtre via les mêmes opérateurs logiques "==" ou "<".
        // Donc si d'autres bloc de code sont attendus, il faut limiter par le haut ce bloc-ci avec "<" et non ">" qui condamnerait les blocs suivants à ne jamais être exécutés.

        else if(age < 60) {
            System.out.println("Vous êtes un adulte.");
        }

        // Idem pour ce bloc, autant le simplifier car la fourchette recherchée est précisée par le bas, par le bloc de code précédent, et par le haut par la condition
        else if(age < 100) {
            System.out.println("Vous n'êtes plus tout jeune.");
        }
        else {
            System.out.println("Vous êtes une exception dans ce monde !");
        }

    }
}
