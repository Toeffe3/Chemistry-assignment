import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import java.awt.Component;

/**
 * Chemistry is build using NaIDE
 *
 * @author Victor
 * @version 1.0
 */
public class Chemistry extends javax.swing.JFrame {

  ChemComp[] c = new ChemComp[10];
  JTextArea text = new JTextArea();

  public Chemistry() {
    initUI();

    c[0] = new ChemComp("Alkohol",    "Ethyl-alkohol",      46.05,    -117,   78.5,   0.789);
    c[1] = new ChemComp("Køkkensalt", "Natriumklorid",      58.44,    801,    1413,   2.165);
    c[2] = new ChemComp("Formalin",   "Formaldehys",        30.031,   -116.9, -19,    1.13);
    c[3] = new ChemComp("Druesukker", "Glukose",            180.156,  146,    000,    1.56);
    c[4] = new ChemComp("Træsprit",   "Metyl-acetat",       32.04,    000,    64.7,   0.7918);
    c[5] = new ChemComp("Sumpgas",    "Metan",              16.04246, -182.5, -161.5, 0.656);
    c[6] = new ChemComp("Kloroform",  "Triklormetan",       119.38,   -63.5,  61.2,   1.49);
    c[7] = new ChemComp("Aspirin",    "Acetyl-salicylsyre", 180.158,  135,    140,    1.4);
    c[8] = new ChemComp("Eddike",     "Eddikesyre",         60.052,   16.5,   118.1,  1.05);
    c[9] = new ChemComp("Glycerin",   "Glycerol",           992.0776, 18.1,   290,    1.2613);

    text.setBounds(23, 90, 540, 250);
    add(text);

    int i = 0;
    for (ChemComp component : c) {
      JButton button = component.getButton(text);
      button.setBounds(23+110*(i%5), 10+35*((int) (i/5)), 100, 25);
      add(button);
      i++;
    }

  }

	private void initUI() {
    setTitle("Chemistry");
    setSize(600, 400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    setLayout(null);
	}

	public static void main(String args[]) {

    SwingUtilities.invokeLater(new Runnable(){
      @Override public void run() {
        new Chemistry().setVisible(true);
      }
    });

	}
}
