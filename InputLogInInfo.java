/* Created By IntelliJ IDEA
 *  Author: Devansh Shukla (Devansh1352000)
 *  Date: 26-07-2020
 *  Time: 10:03 PM
 */

import javax.swing.JOptionPane;


public class InputLogInInfo {
    public static void main(String[] args) {
        String username = JOptionPane.showInputDialog(null, "username", "Log In : Username", JOptionPane.PLAIN_MESSAGE);

        String password = JOptionPane.showInputDialog(null, "password", "Log In : Password", JOptionPane.PLAIN_MESSAGE);

        if (username.isEmpty() || username.isBlank()) {
            JOptionPane.showMessageDialog(null, "Usename Cannot be Blank or Empty!", "wrong Username", JOptionPane.ERROR_MESSAGE);

        }

        if (password.isEmpty() || password.isBlank()) {
            JOptionPane.showMessageDialog(null, "Password cannot be empty or blank!", "Wrong Password", JOptionPane.ERROR_MESSAGE);

        }

        if (!username.isEmpty() && !password.isEmpty()) {
            if ("Devansh1352000".equals(username) && "DevanshShukla".equals(password)) {
                JOptionPane.showMessageDialog(null, "Logged In Successfully", "Welcome," + username, JOptionPane.INFORMATION_MESSAGE);

            } else {
                JOptionPane.showMessageDialog(null, "Username Or Password Not correct!", "Invalid Credentials", JOptionPane.ERROR_MESSAGE);
            }

        }
    }
}
