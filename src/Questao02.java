import javax.swing.*;
import java.util.ArrayList;

public class Questao02 {
    public static void main(String[] args) {

        ArrayList<Integer> arrayListNumeros = new ArrayList();

        int contador = 0, loopingArrayList = 0, valorDiferenca, valorTotalDeNumerosDiferentes = 0, numeroArrayList = 0;

        while (loopingArrayList == 0) {

            numeroArrayList = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para adicionar a lista:"));

            arrayListNumeros.add(numeroArrayList);
            contador++;

            loopingArrayList = Integer.parseInt(JOptionPane.showInputDialog("Para parar de inserir dados na lista, digite 1"));
        }

        valorDiferenca = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para saber a diferença comparado aos valores anteriores: "));

        for (int c = 0; c < arrayListNumeros.size(); c++) {

            int valor = arrayListNumeros.get(c);

            for (Integer array1 : arrayListNumeros) {

                if (valor == (array1 - valorDiferenca)) {
                    valorTotalDeNumerosDiferentes++;
                    System.out.println("VALORES QUE TEM COMO DIFERENÇA " + valorDiferenca + " são " + array1 + " e " + valor);
                }
            }
        }

        System.out.println("O total de valores que são da diferença é " + valorTotalDeNumerosDiferentes);

    }

    }

