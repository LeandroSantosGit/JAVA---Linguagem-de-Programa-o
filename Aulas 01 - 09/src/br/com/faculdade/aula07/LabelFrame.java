
package br.com.faculdade.aula07;

import java.awt.FlowLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 * Date 17/11/2019
 * @author Leandro
 */
public class LabelFrame extends JFrame {
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    
    public LabelFrame() {
        super("JLabel");
        setLayout(new FlowLayout());
        
        label1 = new JLabel("Label com texto");
        label1.setToolTipText("Este é label1");
        add(label1);
        
        Icon img = new ImageIcon(getClass().getResource("img.png"));
        label2 = new JLabel("Label com texto e icone", img, SwingConstants.LEFT);
        label2.setToolTipText("Este é o label2");
        add(label2);
        
        label3 = new JLabel();
        label3.setText("Label com icone e texto embaixo");
        label3.setToolTipText("Este é o label3");
        label3.setIcon(img);
        label3.setHorizontalTextPosition(SwingConstants.CENTER);
        label3.setVerticalTextPosition(SwingConstants.BOTTOM);
        label3.setToolTipText("Este é o lebal3");
        add(label3);
    }
    
    public static void main(String[] args) {
        LabelFrame janela = new LabelFrame();
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(250, 180);
        janela.setVisible(true);
    }
    
}
