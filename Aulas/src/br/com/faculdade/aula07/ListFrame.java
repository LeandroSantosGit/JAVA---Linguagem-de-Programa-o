
package br.com.faculdade.aula07;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 * Date 17/11/2019
 * @author Leandro
 */
public class ListFrame extends JFrame {
    private JList<String> colorJlist;
    
    private static final String[] colorNames = {
        "Black",
        "Blue",
        "Cyan",
        "Dark Gray",
        "Gray",
        "Green",
        "Light Gray",
        "Magenta",
        "Orange",
        "Pink",
        "Red",
        "White",
        "Yellow"
    };
    
    private static final Color[] colors = {
        Color.BLACK,
        Color.BLUE,
        Color.CYAN,
        Color.DARK_GRAY,
        Color.GRAY,
        Color.GREEN,
        Color.LIGHT_GRAY,
        Color.MAGENTA,
        Color.ORANGE,
        Color.PINK,
        Color.RED,
        Color.WHITE,
        Color.YELLOW
    };
    
    public ListFrame() {
        super("JList");
        setLayout(new FlowLayout());
        
        colorJlist = new JList<>(colorNames);
        colorJlist.setVisibleRowCount(5);
        colorJlist.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        add(new JScrollPane(colorJlist));
        
        colorJlist.addListSelectionListener(
                new ListSelectionListener() {
                    public void valueChanged(ListSelectionEvent event) {
                        getContentPane().setBackground(
                                colors[colorJlist.getSelectedIndex()]);
                    }
                }
        );
    }
    
    public static void main(String[] args) {
        ListFrame janela = new ListFrame();
        janela.setSize(300, 200);
        janela.setVisible(true);
    }
    
}
