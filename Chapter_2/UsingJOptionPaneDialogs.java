import javax.swing.JOptionPane;

public class UsingJOptionPaneDialogs {
   public static void main(String[] args){
      while (true) {
         String name = JOptionPane.showInputDialog(null, "Enter your name:");
         
         if (name == null) {
            continue;
         }
         
         int choice = JOptionPane.showConfirmDialog(null, "Do you want your name to be shown?",
         "Confirmation",
         JOptionPane.YES_NO_CANCEL_OPTION);
         
         if (choice == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Your name is: " + name);
            break;
         } else if (choice == JOptionPane.NO_OPTION || choice == JOptionPane.CANCEL_OPTION) {
            continue;
         } else {
            continue;
         }
      }
   }
}