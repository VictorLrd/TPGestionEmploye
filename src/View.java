import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class View extends JFrame {

    public JPanel panel;
    public ViewControleur controleur;

    public View(){

        this.setTitle("Gestion Employe");
        this.controleur = new ViewControleur(this);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel = new MainPanel(this.controleur);
        this.getContentPane().add(panel);
        this.pack();
        this.setSize(400,600);
        this.setVisible(true);
    }

}