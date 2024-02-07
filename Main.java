  import javax.swing.*;
  import java.awt.*;
  public class Main {
    public static void main(String[] args) {
      int x = 0;

      //Frame
      JFrame listMaker = new JFrame("Lists");
      listMaker.setSize(750, 750);

      //Panel
      JPanel forListMaker = new JPanel();
      forListMaker.setLayout(new GridLayout(10, 11));

      //Components(a button, label, textfield, and image)
      JButton item = new JButton("Enter");
      JLabel hello = new JLabel("Hello");
      JTextField list = new JTextField(10);

      ImageIcon groceries = new ImageIcon("Images/81psZXhulFL._AC_UF894,1000_QL80_.jpg");
      groceries.setImage(groceries.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
      JLabel inception = new JLabel(groceries);

      //components > panel
      forListMaker.add(item);
      forListMaker.add(hello);
      forListMaker.add(list);
      forListMaker.add(inception);

      //Panel > frame
      listMaker.add(forListMaker);

      //Visible
      listMaker.setVisible(true);

      String mattMaltese = "";
      Boolean  x = item.isDefaultButton();
      while (x) {
        try {
          mattMaltese = list.getText();
          hello.setText(mattMaltese);
         
        } catch (Exception e) {

          hello.setText("Maybe next time then");
          
        }
         x = item.isDefaultButton();
      }
    }
  }