import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Component;

public class ChemComp  {

  private String name;
  private String chemical;
  private double molar;
  private double melting;
  private double boiling;
  private double mass;

  public ChemComp(String name, String chemical, double molar, double melting, double boling, double mass) {

    this.name = name;
    this.chemical = chemical;
    this.molar = molar;
    this.melting = melting;
    this.boiling = boling;
    this.mass = mass;

  }

  public JButton getButton(JTextArea text) {

    ChemComp c = this;
    ActionListener al = new ActionListener() {
      @Override public void actionPerformed(ActionEvent evt) {
        text.setText(c.getProperties());
      }
    };

    JButton b = new JButton(this.name);
    b.addActionListener(al);
    return b;
  }

  public String getProperties() {
    return "Handelsnavn\t"+this.name+"\n"+
           "Kemisk navn\t"+this.chemical+"\n\n"+
           "Molærmasse \t"+this.molar+" mol\n"+
           "Kogepunkt  \t"+this.melting+" *C\n"+
           "Smeltepunkt\t"+this.boiling+" *C\n"+
           "Massefylde \t"+this.mass+" kg/L\n";
  }

}
