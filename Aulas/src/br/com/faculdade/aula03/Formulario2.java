
import javax.swing.*;

/**
 * Exercício 3
 * Interface gráfica de cadastro de funcionário
 * 
 * Date    14/09/2019
 * @author Leandro
 */
public class Formulario2 {
    
    public void criarTela() {
        // criando o frame
        JFrame f = new JFrame();
        f.setSize(300, 230);
        f.setTitle("Cadastro de Funcionário");
        f.setLocation(150, 200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //criando o painel
        JPanel pl = new JPanel();
        pl.setLayout(null); // gerenciador de layout
        
        // Criando os componentes
        // Label
        JLabel jlCodigo = new JLabel("Código:");
        jlCodigo.setBounds(10, 10, 60, 20);
        JLabel jlNome = new JLabel("Nome:");
        jlNome.setBounds(10, 40, 60, 20);
        JLabel jlSobrNome = new JLabel("Sobrenome:");
        jlSobrNome.setBounds(10, 70, 72, 20);
        JLabel jlSetor = new JLabel("Setor:");
        jlSetor.setBounds(10, 104, 60, 20);
        
        // Campo de texto
        JTextField textCodigo = new JTextField(" ");
        textCodigo.setBounds(90, 10, 170, 20);
        JTextField textNome = new JTextField(" ");
        textNome.setBounds(90, 40, 170, 20);
        JTextField textSbrNome = new JTextField(" ");
        textSbrNome.setBounds(90, 72, 170, 20);
        JTextField textSetor = new JTextField(" ");
        textSetor.setBounds(90, 104, 170, 20);
        
        // Botão
        JButton btnSalvar = new JButton("Salvar");
        btnSalvar.setBounds(170, 150, 80, 25);
        
        // Adicionar componentes no Painel
        pl.add(jlCodigo);
        pl.add(jlNome);
        pl.add(jlSobrNome);
        pl.add(jlSetor);
        pl.add(textCodigo);
        pl.add(textNome);
        pl.add(textSbrNome);
        pl.add(textSetor);
        pl.add(btnSalvar);
        
        // Adicionar painel no Frame
        f.add(pl);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        Formulario2 tela = new Formulario2();
        tela.criarTela();
    }
    
}
