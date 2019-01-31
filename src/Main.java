import com.cc.UI.MainUI;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
       // System.out.println("Hello World!");

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                //LoginDia loginDia = new LoginDia();
//                loginDia.setVisible(true);
               // nm.setBounds(10,10,1000,1000);
                MainUI mainUI = new MainUI();
                mainUI.setVisible(true);
            }
        });
    }
}
