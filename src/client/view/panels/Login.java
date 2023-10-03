package client.view.panels;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import client.view.interfaces.ILogin;

public class Login extends JPanel implements ILogin {
    JTextField userField = new JTextField(20);
    JPasswordField passwordField = new JPasswordField(20);
    JButton loginButton = new JButton("Iniciar Sesión");

    public Login() {
        setLayout(new GridBagLayout());
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); // Márgenes más grandes

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5); // Márgenes entre componentes

        JLabel userLabel = new JLabel("Usuario:");
        add(userLabel, gbc);

        gbc.gridy = 1;
        userField.setPreferredSize(new Dimension(200, 30));
        add(userField, gbc);

        gbc.gridy = 2;
        JLabel passwordLabel = new JLabel("Contraseña:");
        add(passwordLabel, gbc);

        gbc.gridy = 3;
        passwordField.setPreferredSize(new Dimension(200, 30));
        add(passwordField, gbc);

        gbc.gridy = 4;
        gbc.gridwidth = 2; // Hacer que el botón ocupe dos columnas
        gbc.anchor = GridBagConstraints.CENTER;
        add(loginButton, gbc);
    }

    @Override
    public void TextArea() {
        repaint();
    }
}
