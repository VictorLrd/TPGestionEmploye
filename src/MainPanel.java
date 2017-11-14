import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

 
public class MainPanel extends JPanel {
	
	 private JButton boutonAjout = new JButton("Ajouter salarié");
	 private JButton boutonAfficher = new JButton("Afficher salarié");
	 
  public MainPanel(ViewControleur controleur){
	
    this.setSize(500, 500);
    boutonAfficher.addActionListener(controleur);;
    boutonAjout.addActionListener(controleur);;
    this.add(boutonAjout);
    this.add(boutonAfficher);
    this.setVisible(true);
    //jframe.add(panel);
    
   
  }
  
  /*public void ajouteSalarie(Personnel p,String type,String nom,String prenom,String age,String entree,String salaire) {
	  if(nom == "" || prenom == "" || entree=="" || !isInteger(age) || !isInteger(salaire)) {
		  JOptionPane.showMessageDialog(this, "Entrer toutes les valeurs");}
	  else {
	  if(type=="Vendeur")
		  p.ajouterEmploye(new Vendeur(nom,prenom,Integer.parseInt(age),entree,(double)Integer.parseInt(salaire)));
	  if(type=="Representant")
		  p.ajouterEmploye(new Representant(nom,prenom,Integer.parseInt(age),entree,(double)Integer.parseInt(salaire)));
	  if(type=="Technicien")
		  p.ajouterEmploye(new Technicien(nom,prenom,Integer.parseInt(age),entree,Integer.parseInt(salaire)));
	  if(type=="Manutentionnaire")
		  p.ajouterEmploye(new Manutentionnaire(nom,prenom,Integer.parseInt(age),entree,Integer.parseInt(salaire)));
	  if(type=="TechnARisque")
		  p.ajouterEmploye(new TechnARisque(nom,prenom,Integer.parseInt(age),entree,Integer.parseInt(salaire)));
	  if(type=="ManutARisque")
		  p.ajouterEmploye(new ManutARisque(nom,prenom,Integer.parseInt(age),entree,Integer.parseInt(salaire)));
  }
  }*/
  
  public static boolean isInteger(String s) {
      try {
          Integer.parseInt(s);
      } catch(NumberFormatException e) {
          return false;
      }
      return true;
  }
  
  
}