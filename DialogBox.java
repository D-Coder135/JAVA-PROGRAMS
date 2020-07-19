/* Created By InteliJ IDEA
 *  Author: Devansh Shukla (191500255))
 *  Date: 19-07-2020
 *  Time: 07:30 PM
 */
import javax.swing.JOptionPane;
public class DialogBox {
    public static void main(String[] args) {
        //1.Plain message (-1)
        JOptionPane.showMessageDialog(null, "dialogs are fun!", "Dialog Window Title",
                JOptionPane.PLAIN_MESSAGE);
        //2.Error Message (0)
        JOptionPane.showMessageDialog(null, "This is an error dialog! ", "Error Dialog",
                JOptionPane.ERROR_MESSAGE);
        //3.Information Message(1)
        JOptionPane.showMessageDialog(null, "This is an information Dialog!", "Info Dialog",
                JOptionPane.INFORMATION_MESSAGE);
        //4.Warning Message (2)
        JOptionPane.showMessageDialog(null, "This is a warning dialog!", "Warning Dialog",
                JOptionPane.WARNING_MESSAGE);
        //5.Question Message (3)
        JOptionPane.showMessageDialog(null, "This is a question dialog!", "Question Dialog",
                JOptionPane.QUESTION_MESSAGE);
    }
}
