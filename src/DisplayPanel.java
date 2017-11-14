import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class DisplayPanel extends JPanel {

	private JButton boutonRetour = new JButton("Retour Menu");
	 private JLabel labelTextSalaireMoyen = new JLabel("Le salaire moyen est de ");
	 private JLabel labelSalaireMoyen = new JLabel();

	public DisplayPanel(Personnel p,ViewControleur controleur){
    this.setSize(500, 500);
    Object[][] data1 = new Object[p.getEmployees().size()][6];
   for(int i=0;i<p.getEmployees().size();i++) {
	   data1[i][0]=p.getEmployees().get(i).getFirstname();
	   data1[i][1]=p.getEmployees().get(i).getLastname();
	   data1[i][2]=p.getEmployees().get(i).getAge();
	   data1[i][3]=p.getEmployees().get(i).getEntryYear();
	   data1[i][4]=p.getEmployees().get(i).calculerSalaire();
	   data1[i][5]=p.getEmployees().get(i).getClass().getSimpleName();

  }
   JTable table = new JTable(data1,new String[] {"Nom","Prenom","Age","Date entree","Salaire","Type"});
    table.setPreferredSize(new Dimension(500, 500));
    this.add(new JScrollPane(table));
    String salaireMoyen = String.valueOf(p.salaireMoyen());
    labelSalaireMoyen.setText(salaireMoyen);
    this.add(labelTextSalaireMoyen);
    this.add(labelSalaireMoyen);
    
    this.add(boutonRetour);
    
    this.boutonRetour.addActionListener(e -> this.hide());;
    this.setVisible(true);
  }
}