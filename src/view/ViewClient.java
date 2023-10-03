package view;

import javax.swing.JFrame;
import javax.swing.JPanel;

import view.interfaces.IViewClient;
import view.panels.Login;

public class ViewClient extends JFrame implements IViewClient {
    JPanel login = new Login();

    public ViewClient (){
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        login();
    }

    @Override
    public void login() {
        add(login);
        repaint();
    }
    
}