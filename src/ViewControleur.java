import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewControleur implements ActionListener {

    private View vue;
    public Personnel p;

    public ViewControleur(View vue) {

        this.p = new Personnel();
        this.vue = vue;

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        JButton source = (JButton) e.getSource();
        JPanel newPanel;

        switch (source.getText()){

            case ("Ajouter salarié"):
            	changerView(new AddPanel(this));
                break;

            case ("Afficher salarié"):
            	changerView(new DisplayPanel(p,this));
                break;

            case ("Retour"):
            	changerView(new MainPanel(this));
                break;
            case("Retour Menu"):
            	changerView(new MainPanel(this));
            	break;            
            case ("Ajouter salarié et quitter"):
                if (addEmploye()){
                	changerView(new MainPanel(this));
                }
                break;
            default :
                break;
        }
    }

    public void changerView(JPanel newPanel){
        this.vue.getContentPane().removeAll();
        this.vue.getContentPane().add(newPanel);
        this.vue.panel = newPanel;
        this.vue.revalidate();
        this.vue.repaint();
    }

    public boolean addEmploye(){
        AddPanel content = (AddPanel) this.vue.panel;


        String nom = content.nom.getText();
        String prenom= content.prenom.getText();
        int age = Integer.parseInt(content.age.getText());
        String entree = content.entree.getText();
        int salaire = Integer.parseInt(content.salaire.getText());
        String type = (String) (content.comboBox.getSelectedItem());
        Employee e;
        System.out.println("role = "+type);
        switch (type) {
        	case ("Vendeur"):
        		e = new Vendeur(prenom,nom,age,entree,salaire);
            case ("Manutentionnaire"):
                e = new Manutentionnaire(prenom,nom,age,entree,salaire);
                break;
            case ("ManutARisque"):
                e = new ManutARisque(prenom,nom,age,entree,salaire);
                break;
            case ("Technicien"):
                e = new Technicien(prenom,nom,age,entree,salaire);
                break;
            case ("TechnARisque"):
                e = new TechnARisque(prenom,nom,age,entree,salaire);
                break;
            case ("Representant"):
                e = new Representant(prenom,nom,age,entree,salaire);
                break;
            default:
                return false;
        }
        p.ajouterEmploye(e);
        return true;
    };
}
