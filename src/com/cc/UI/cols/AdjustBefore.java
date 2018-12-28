/*
 * Created by JFormDesigner on Fri Dec 28 09:46:46 CST 2018
 */

package com.cc.UI.cols;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;

/**
 * @author ccc
 */
public class AdjustBefore extends JDialog {
  public static void main(String[] args) {
        AdjustBefore adjustBefore = new AdjustBefore();
  }

    public AdjustBefore() {
      initComponents();
        MyInit();
    }

    private void button1ActionPerformed(ActionEvent e) {
        this.dispose();
    }

    private void slider4StateChanged(ChangeEvent e) {
        label2.setText(String.valueOf(slider4.getValue()));
    }

    private void slider5StateChanged(ChangeEvent e) {
        label4.setText(String.valueOf(slider5.getValue()));
    }

    private void slider6StateChanged(ChangeEvent e) {
        label6.setText(String.valueOf(slider6.getValue()));
    }

    private void slider7StateChanged(ChangeEvent e) {
        label8.setText(String.valueOf(slider7.getValue()));
    }

    private void MyInit() {
        label2.setText(String.valueOf(slider4.getValue()));
        label4.setText(String.valueOf(slider5.getValue()));
        label6.setText(String.valueOf(slider6.getValue()));
        label8.setText(String.valueOf(slider7.getValue()));
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        slider4 = new JSlider();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        slider5 = new JSlider();
        label4 = new JLabel();
        label5 = new JLabel();
        slider6 = new JSlider();
        label6 = new JLabel();
        label7 = new JLabel();
        slider7 = new JSlider();
        label8 = new JLabel();
        button1 = new JButton();

        //======== this ========
        setTitle("\u91c7\u96c6\u8bbe\u7f6e\u5bf9\u8bdd\u6846");
        setResizable(false);
        setVisible(true);
        Container contentPane = getContentPane();

        //---- slider4 ----
        slider4.addChangeListener(e -> slider4StateChanged(e));

        //---- label1 ----
        label1.setText("\u589e\u76ca");
        label1.setHorizontalAlignment(SwingConstants.CENTER);

        //---- label2 ----
        label2.setText("0");
        label2.setHorizontalAlignment(SwingConstants.CENTER);
        label2.setBorder(new EtchedBorder(Color.gray, null));

        //---- label3 ----
        label3.setText("\u66dd\u5149");
        label3.setHorizontalAlignment(SwingConstants.CENTER);

        //---- slider5 ----
        slider5.addChangeListener(e -> slider5StateChanged(e));

        //---- label4 ----
        label4.setText("0");
        label4.setHorizontalAlignment(SwingConstants.CENTER);
        label4.setBorder(new EtchedBorder(Color.gray, null));

        //---- label5 ----
        label5.setText("\u4f3d\u9a6c\u503c");
        label5.setHorizontalAlignment(SwingConstants.CENTER);

        //---- slider6 ----
        slider6.addChangeListener(e -> slider6StateChanged(e));

        //---- label6 ----
        label6.setText("0");
        label6.setHorizontalAlignment(SwingConstants.CENTER);
        label6.setBorder(new EtchedBorder(Color.gray, null));

        //---- label7 ----
        label7.setText("\u504f\u79fb");
        label7.setHorizontalAlignment(SwingConstants.CENTER);

        //---- slider7 ----
        slider7.addChangeListener(e -> slider7StateChanged(e));

        //---- label8 ----
        label8.setText("0");
        label8.setHorizontalAlignment(SwingConstants.CENTER);
        label8.setBorder(new EtchedBorder(Color.gray, null));

        //---- button1 ----
        button1.setText("\u5173\u95ed");
        button1.addActionListener(e -> button1ActionPerformed(e));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addGroup(contentPaneLayout.createSequentialGroup()
                                        .addComponent(label1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(slider4, GroupLayout.PREFERRED_SIZE, 188, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(contentPaneLayout.createSequentialGroup()
                                        .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                            .addComponent(label3, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(label5))
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                            .addComponent(slider6, GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                                            .addComponent(slider5, GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE))))
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addComponent(label7, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(slider7, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE)))
                            .addGap(18, 18, 18)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(label2, GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                                .addComponent(label4, GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                                .addComponent(label6, GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                                .addComponent(label8, GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(115, 115, 115)
                            .addComponent(button1)))
                    .addContainerGap(2, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(7, 7, 7)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(label2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(slider4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(10, 10, 10)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(slider5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(10, 10, 10)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(slider6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(10, 10, 10)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(label8, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(slider7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(button1)
                    .addContainerGap())
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JSlider slider4;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JSlider slider5;
    private JLabel label4;
    private JLabel label5;
    private JSlider slider6;
    private JLabel label6;
    private JLabel label7;
    private JSlider slider7;
    private JLabel label8;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
