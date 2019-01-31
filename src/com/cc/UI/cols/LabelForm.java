/*
 * Created by JFormDesigner on Thu Dec 27 19:05:55 CST 2018
 */

package com.cc.UI.cols;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import info.clearthought.layout.*;
import org.jdesktop.swingx.*;


/**
 * @author chenchen
 */
public class LabelForm extends JDialog {
  public static void main(String[] args) {
    LabelForm labelForm = new LabelForm();
    //
  }

    public LabelForm() {
        initComponents();
        myInit();
    }

    private void myInit() {
        //this.setIconImage(null);
        Icon icon = new ImageIcon("com/cc/UI/icons/choose.png");
        //button1.setIcon(icon);
    }

    private void label1MouseClicked(MouseEvent e) {
    // TODO add your code here
    System.out.println("1111");
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();

        //======== this ========
        setAlwaysOnTop(true);
        setVisible(true);
        setResizable(false);
        setBackground(Color.white);
        Container contentPane = getContentPane();
        contentPane.setLayout(new VerticalLayout(2));

        //---- button1 ----
        button1.setIcon(new ImageIcon(getClass().getResource("/icon-\u9f20\u6807\u7bad\u5934-01.jpg")));
        button1.setBorder(null);
        button1.setBorderPainted(false);
        button1.setMinimumSize(null);
        button1.setPreferredSize(null);
        button1.setMargin(new Insets(1, 0, 1, 0));
        button1.setOpaque(false);
        contentPane.add(button1);

        //---- button2 ----
        button2.setIcon(new ImageIcon(getClass().getResource("/\u5927\u5199.png")));
        button2.setBorder(null);
        button2.setBorderPainted(false);
        button2.setMinimumSize(null);
        button2.setPreferredSize(null);
        button2.setMargin(new Insets(1, 0, 1, 0));
        button2.setOpaque(false);
        contentPane.add(button2);

        //---- button3 ----
        button3.setIcon(new ImageIcon(getClass().getResource("/\u659c\u7ebf.png")));
        button3.setBorder(null);
        button3.setBorderPainted(false);
        button3.setPreferredSize(null);
        button3.setMinimumSize(null);
        button3.setMargin(new Insets(1, 0, 1, 0));
        button3.setOpaque(false);
        contentPane.add(button3);

        //---- button4 ----
        button4.setIcon(new ImageIcon(getClass().getResource("/\u4e0b.png")));
        button4.setBorder(null);
        button4.setBorderPainted(false);
        button4.setIconTextGap(0);
        button4.setMinimumSize(null);
        button4.setPreferredSize(null);
        button4.setMargin(new Insets(1, 0, 1, 0));
        button4.setOpaque(false);
        contentPane.add(button4);
        setSize(35, 130);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
