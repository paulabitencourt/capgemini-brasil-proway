import javax.swing.*;

public class Questao03 {
    public static void main(String[] args) {
        String palavra, palavraSemEspacos;
        int tamanhoPalavraSemEspacos;
        double raizDotamanhoPalavraSemEspacos;
        double conversaoParaInteiro;
        int tamanhoMatriz;

        char caracterePalavra;


        palavra = JOptionPane.showInputDialog("Escreva uma palavra para o programa: ");

        palavraSemEspacos = palavra.replaceAll("\\s+", "");

        tamanhoPalavraSemEspacos = palavraSemEspacos.length();

        raizDotamanhoPalavraSemEspacos = Math.sqrt(tamanhoPalavraSemEspacos);
        conversaoParaInteiro = Math.ceil(raizDotamanhoPalavraSemEspacos);
        tamanhoMatriz = (int) conversaoParaInteiro;

        char matrizPalavra[][] = new char[tamanhoMatriz][tamanhoMatriz];

        for (int i = 0; i < palavraSemEspacos.length(); i++) {
            caracterePalavra = palavraSemEspacos.charAt(i);
            System.out.println("CARACTERE PALAVRA" + caracterePalavra);
        }

        for (int a = 1; a <= tamanhoMatriz; a++) {
            for (int b = 1; b <= tamanhoMatriz; b++) {
                System.out.println("A" + a);
                System.out.println("B" + b);
            }
        }
    }
}

