import javax.swing.border.*;
import com.cc.UI.MainUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;
/*
 * Created by JFormDesigner on Fri Jan 11 19:51:21 CST 2019
 */



/**
 * @author cc
 */
public class LoginDia extends JFrame {

    public LoginDia() {
        initComponents();
        MyInit();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void MyInit() {
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButton3);
        buttonGroup.add(radioButton4);
        buttonGroup.add(radioButton5);
    }

    private void login_btActionPerformed(ActionEvent e) {
      //  System.out.println(passwordField1.getPassword());

            MainUI mainUI = new MainUI();
            mainUI.setVisible(true);
            mainUI.setAlwaysOnTop(false);
           this.dispose();
    }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel1 = new JPanel();
        login_bt = new JButton();
        panel2 = new JPanel();
        radioButton3 = new JRadioButton();
        radioButton4 = new JRadioButton();
        radioButton5 = new JRadioButton();

        //======== this ========
        Container contentPane = getContentPane();

        //======== panel1 ========
        {

            //---- login_bt ----
            login_bt.setText("\u5f00\u59cb");
            login_bt.addActionListener(e -> login_btActionPerformed(e));

            //======== panel2 ========
            {
                panel2.setBorder(new TitledBorder(UIManager.getBorder("DesktopIcon.border"), "\u8bf7\u9009\u62e9\u79cd\u7c7b", TitledBorder.LEADING, TitledBorder.DEFAULT_POSITION,
                    new Font("\u5b8b\u4f53", Font.BOLD, 16)));

                //---- radioButton3 ----
                radioButton3.setText("\u7c7b\u578b1");
                radioButton3.setSelected(true);

                //---- radioButton4 ----
                radioButton4.setText("\u7c7b\u578b2");

                //---- radioButton5 ----
                radioButton5.setText("\u7c7b\u578b3");

                GroupLayout panel2Layout = new GroupLayout(panel2);
                panel2.setLayout(panel2Layout);
                panel2Layout.setHorizontalGroup(
                    panel2Layout.createParallelGroup()
                        .addGroup(panel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(panel2Layout.createParallelGroup()
                                .addComponent(radioButton3)
                                .addComponent(radioButton4)
                                .addComponent(radioButton5))
                            .addContainerGap(193, Short.MAX_VALUE))
                );
                panel2Layout.setVerticalGroup(
                    panel2Layout.createParallelGroup()
                        .addGroup(panel2Layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addComponent(radioButton3)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(radioButton4)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(radioButton5)
                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
            }

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addContainerGap(29, Short.MAX_VALUE)
                        .addComponent(panel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(login_bt, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(95, Short.MAX_VALUE))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(panel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(login_bt, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap())
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap())
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }
    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel panel1;
    private JButton login_bt;
    private JPanel panel2;
    private JRadioButton radioButton3;
    private JRadioButton radioButton4;
    private JRadioButton radioButton5;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
