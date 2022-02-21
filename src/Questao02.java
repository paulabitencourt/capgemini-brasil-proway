import javax.swing.*;

public class Questao02 {
    public static void main(String[] args) {
        boolean segura = false;
        while (segura == false){
            String senha = JOptionPane.showInputDialog("Digite sua senha:");
            if (senha.length() < 6){
                System.out.println("Digite mais " + (6 - senha.length()) + " caractere para sua senha se tornar segura");
                segura = false;
            }
            else{
                System.out.println("Sua senha é segura!");
                segura = true;
            }
        }

    }
}
