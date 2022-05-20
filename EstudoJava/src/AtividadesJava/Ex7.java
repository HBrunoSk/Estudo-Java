package AtividadesJava;
/*
Demonstração de um bloco de codigo
 */
public class Ex7 {
    public static void main(String[] args) {

        double i, j, d;

        i = 5;
        j = 10;

        //o alvo desta instrução if é um bloco de codigo

        if (i != 0){ // inicio do bloco de codigo
            System.out.println("i naõ é igual a zero");// se a condição for verdadeira,ira executar esse bloco de codigo
            d = j / i;
            System.out.println("J divido por I = " + d);
        }// fim do bloco de codigo
    }
}
