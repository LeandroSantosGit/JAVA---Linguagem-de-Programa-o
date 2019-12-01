
import javax.swing.*;

/**
 * Exercício 2
 * Criando primeira interface gráfica com Swing, tela simples com título
 * 
 * Date    14/09/2019  
 * @author Leandro
 */
public class Formulario1 {
    
    public void criarTela() {
        JFrame f = new JFrame();
        f.setSize(800, 500);
        f.setTitle("Cadastro");
        f.setLocation(300, 100);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        Formulario1 tela = new Formulario1();
        tela.criarTela();
    }
    
}
