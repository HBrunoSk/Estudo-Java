package AtividadesJava;
/*
 Demostração a instrução if
 */
public class Ex5 {
    public static void main(String[] args) {
        int a,b,c;

        a = 2;
        b = 3;

        if (a < b) System.out.println("A é menor que B?"); // esse code n executara nada
        System.out.println();

        if (a == b) System.out.println("A é igual a B?");
        System.out.println();

        c = a - b; // C contem o valor -1

        System.out.println("Valor de C");
        if (c >= 0) System.out.println("C é maior ou igual a zero");
        if (c < 0) System.out.println("C contem um numero negativo");
        System.out.println();

        c = b - a; // C contem 1

        System.out.println("Valor de C");
        if (c >= 0) System.out.println("C é maior ou igual a zero");
        if (c < 0) System.out.println(" C contem um numero negativo");


    }
}
