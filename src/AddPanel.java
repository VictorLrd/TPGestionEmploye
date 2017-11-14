import javax.swing.*;
import java.awt.*;

public class AddPanel extends JPanel {

	 private JButton boutonAjout = new JButton("Ajouter salarié et quitter");
	 private JButton boutonRetour = new JButton("Retour");
	 private JPanel panel = new JPanel();
	 public JTextField nom = new JTextField("");
	 public JLabel labelNom = new JLabel("Nom");
	 public JTextField prenom = new JTextField("");
	 public JLabel labelPrenom = new JLabel("Prenom");
	 public JTextField age = new JTextField("");
	 public JLabel labelAge = new JLabel("Age");
	 public JTextField type = new JTextField("");
	 public JLabel labelEntree = new JLabel("Date Entree");
	 public JTextField entree = new JTextField("");
	 public JLabel labelSalaire = new JLabel("Salaire");
	 public JTextField salaire = new JTextField("");
	 public JComboBox<String> comboBox = new JComboBox<>();
	 public String types;

    public AddPanel(ViewControleur controleur){

        this.setLayout(new GridLayout(7,2));

        boutonAjout.addActionListener(controleur);
        boutonRetour.addActionListener(controleur);
        
        
        this.add(labelNom);
        this.add(nom);
        this.add(labelPrenom);
        this.add(prenom);
        this.add(labelAge);
        this.add(age);
        this.add(labelSalaire);
        this.add(salaire);
        this.add(labelEntree);
        this.add(entree);
        comboBox.addItem("Vendeur");
        comboBox.addItem("Representant");
        comboBox.addItem("Technicien");
        comboBox.addItem("Manutentionnaire");
        comboBox.addItem("TechnARisque");
        comboBox.addItem("ManutARisque");
        this.add(comboBox);
        this.add(boutonAjout);
        this.add(boutonRetour);



        
    }

}

