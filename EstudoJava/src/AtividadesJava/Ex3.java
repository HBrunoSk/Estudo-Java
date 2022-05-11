package AtividadesJava;
/*
programa pra ver a diferencia entre numeros INTEIROS e DOUBLE
*/
public class Ex3 {
    public static void main(String[] args) {
        int var; //esse codigo declara uma variavel e o tipo dela (Inteiro)
        double var2; // esse codigo declara uma variavel e o tipo dela (double)

        var = 10; // dando valor a variavel "var" 10, tipo da variavel (INTEIRO)
        var2 =  10.0; // dando valor a variavel "var2" do tipo (double)

        System.out.println("variavel do tipo INT, amarzena valor sem ponto-flutuante: "+var);
        System.out.println("variavel do tipo DOUBLE, armazena valor com ponto-flutuante: "+var2);
        System.out.println();

        //Divindo o valor das variaveis em 4

        var = var / 4; // dividindo o valor da armazenado na variavel "var"
        var2 = var2 / 4; // Dividindo o valor armazenado na variavel "var2"

        // Imprimindo os resultado

        System.out.println("valor da variavel 'var' dividido por 4: "+ var); // resultado da "var"
        System.out.println("valor da variavel 'var2' dividido por 4: "+ var2); // resultado da "var2"

    }
}
