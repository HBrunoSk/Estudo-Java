package ProjetoJava;

public class GalaoeLitros {
    public static void main(String[] args) {

        double galao; // variavel galão, para guarda a quantidade de galão.
        double litros; // variavel litros, para guarda a quantidade de litros.
        double total; // armazena a quantidade total de litros dos 10 galões

        galao = 10; // contem 10 galão.
        litros = 3.7854;// cada galão contem 3.7854 litros.
        total = galao * litros; // multiplicando as variavel ( galao e litros) e guardando o resultado na variavel (total)

        System.out.println("cada galão contem " + litros + " você tem " + galao + ", no total você tem " + total + " litros");
    }
}
