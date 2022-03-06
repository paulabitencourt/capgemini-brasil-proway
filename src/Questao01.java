import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;

public class Questao01 {
    public static void main(String[] args) {
        ArrayList<Integer> numerosArrayList = new ArrayList();

        int contador = 0, loopingArrayList = 0;

        while (loopingArrayList == 0) {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para adicionar a lista:"));

            numerosArrayList.add(numero);


            contador++;

            loopingArrayList = Integer.parseInt(JOptionPane.showInputDialog("Para sair digite 1"));
        }
        Collections.sort(numerosArrayList);

        System.out.println("AGORA" + numerosArrayList);

        if (numerosArrayList.size() % 2 == 0) {

            int valorDoCentro = numerosArrayList.size() / 2;
            int valorProximoAoCentro = valorDoCentro + 1;
            float somaValoresDoCentro = numerosArrayList.get(valorDoCentro  - 1) + numerosArrayList.get(valorProximoAoCentro  - 1 );
            float valorMediana =  somaValoresDoCentro / 2;

            System.out.println("Valor da mediana par é " + valorMediana);
        } else {

            int valorDoCentro = numerosArrayList.size() / 2;
            int valorMediana = numerosArrayList.get(valorDoCentro);

            System.out.println("Valor da mediana impar é " + valorMediana);
        }


    }
    }