/*
 * Created by JFormDesigner on Thu Dec 27 15:41:06 CST 2018
 */

package com.cc.UI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.event.*;
import info.clearthought.layout.*;


/**
 * @author chenchen
 */
public class EditLabel extends JFrame {
    public EditLabel() {
        initComponents();
        myInit();
    }

    private void button7MousePressed(MouseEvent e) {
        label5.setText(String.valueOf((Integer.valueOf(label5.getText()) + 4)));
    }

    private void button8ActionPerformed(ActionEvent e) {
        if (Integer.valueOf(label5.getText()) <= 0) {
            label5.setText("0");

        }else
        label5.setText(String.valueOf((Integer.valueOf(label5.getText()) - 4)));
    }

    private void spinner4StateChanged(ChangeEvent e) {
        label5.setText(spinner4.getValue().toString());
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel1 = new JPanel();
        radioButton3 = new JRadioButton();
        panel2 = new JPanel();
        radioButton4 = new JRadioButton();
        panel3 = new JPanel();
        radioButton5 = new JRadioButton();
        panel4 = new JPanel();
        radioButton6 = new JRadioButton();
        panel5 = new JPanel();
        label1 = new JLabel();
        panel6 = new JPanel();
        label2 = new JLabel();
        panel7 = new JPanel();
        label3 = new JLabel();
        panel8 = new JPanel();
        radioButton1 = new JRadioButton();
        label4 = new JLabel();
        label5 = new JLabel();
        panel9 = new JPanel();
        spinner1 = new JSpinner();
        spinner2 = new JSpinner();
        spinner3 = new JSpinner();
        spinner4 = new JSpinner();

        //======== this ========
        setVisible(true);
        setBackground(new Color(204, 255, 204));
        setTitle("\u63a7\u5236\u9762\u677f");
        setResizable(false);
        Container contentPane = getContentPane();

        //======== panel1 ========
        {
            panel1.setBackground(new Color(51, 153, 255));

            //---- radioButton3 ----
            radioButton3.setText("\u603b\u7535\u6e90");
            radioButton3.setBackground(new Color(51, 153, 255));
            radioButton3.setForeground(Color.white);
            radioButton3.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 16));

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(radioButton3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(radioButton3)
                        .addContainerGap(12, Short.MAX_VALUE))
            );
        }

        //======== panel2 ========
        {
            panel2.setBackground(new Color(51, 153, 255));

            //---- radioButton4 ----
            radioButton4.setText("UV - 1");
            radioButton4.setForeground(Color.white);
            radioButton4.setBackground(new Color(51, 153, 255));
            radioButton4.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 16));

            GroupLayout panel2Layout = new GroupLayout(panel2);
            panel2.setLayout(panel2Layout);
            panel2Layout.setHorizontalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(radioButton4)
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            panel2Layout.setVerticalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                        .addContainerGap(17, Short.MAX_VALUE)
                        .addComponent(radioButton4)
                        .addGap(12, 12, 12))
            );
        }

        //======== panel3 ========
        {
            panel3.setBackground(new Color(51, 153, 255));

            //---- radioButton5 ----
            radioButton5.setText("\u53cd\u5c04");
            radioButton5.setBackground(new Color(51, 153, 255));
            radioButton5.setForeground(Color.white);
            radioButton5.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 16));

            GroupLayout panel3Layout = new GroupLayout(panel3);
            panel3.setLayout(panel3Layout);
            panel3Layout.setHorizontalGroup(
                panel3Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(radioButton5, GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                        .addContainerGap())
            );
            panel3Layout.setVerticalGroup(
                panel3Layout.createParallelGroup()
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(radioButton5)
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
        }

        //======== panel4 ========
        {
            panel4.setBackground(new Color(51, 153, 255));

            //---- radioButton6 ----
            radioButton6.setText("UV - 2");
            radioButton6.setForeground(Color.white);
            radioButton6.setBackground(new Color(51, 153, 255));
            radioButton6.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 16));

            GroupLayout panel4Layout = new GroupLayout(panel4);
            panel4.setLayout(panel4Layout);
            panel4Layout.setHorizontalGroup(
                panel4Layout.createParallelGroup()
                    .addGroup(panel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(radioButton6)
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            panel4Layout.setVerticalGroup(
                panel4Layout.createParallelGroup()
                    .addGroup(panel4Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(radioButton6)
                        .addContainerGap(14, Short.MAX_VALUE))
            );
        }

        //======== panel5 ========
        {
            panel5.setBackground(new Color(51, 153, 255));

            //---- label1 ----
            label1.setText("\u7126\u8ddd");
            label1.setForeground(Color.white);
            label1.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 16));
            label1.setHorizontalAlignment(SwingConstants.CENTER);

            GroupLayout panel5Layout = new GroupLayout(panel5);
            panel5.setLayout(panel5Layout);
            panel5Layout.setHorizontalGroup(
                panel5Layout.createParallelGroup()
                    .addComponent(label1, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
            );
            panel5Layout.setVerticalGroup(
                panel5Layout.createParallelGroup()
                    .addGroup(panel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label1, GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                        .addContainerGap())
            );
        }

        //======== panel6 ========
        {
            panel6.setBackground(new Color(51, 153, 255));

            //---- label2 ----
            label2.setText("\u666f\u6df1");
            label2.setForeground(Color.white);
            label2.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 16));
            label2.setHorizontalAlignment(SwingConstants.CENTER);

            GroupLayout panel6Layout = new GroupLayout(panel6);
            panel6.setLayout(panel6Layout);
            panel6Layout.setHorizontalGroup(
                panel6Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panel6Layout.createSequentialGroup()
                        .addGap(0, 0, 0)
                        .addComponent(label2, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE))
            );
            panel6Layout.setVerticalGroup(
                panel6Layout.createParallelGroup()
                    .addGroup(panel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label2)
                        .addContainerGap(20, Short.MAX_VALUE))
            );
        }

        //======== panel7 ========
        {
            panel7.setBackground(new Color(51, 153, 255));
            panel7.setForeground(Color.white);

            //---- label3 ----
            label3.setText("\u5149\u5708");
            label3.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 16));
            label3.setForeground(Color.white);
            label3.setHorizontalAlignment(SwingConstants.CENTER);

            GroupLayout panel7Layout = new GroupLayout(panel7);
            panel7.setLayout(panel7Layout);
            panel7Layout.setHorizontalGroup(
                panel7Layout.createParallelGroup()
                    .addComponent(label3, GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
            );
            panel7Layout.setVerticalGroup(
                panel7Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panel7Layout.createSequentialGroup()
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label3)
                        .addContainerGap())
            );
        }

        //======== panel8 ========
        {
            panel8.setBackground(new Color(51, 153, 255));

            //---- radioButton1 ----
            radioButton1.setText("\u6b65\u8fdb");
            radioButton1.setBackground(new Color(51, 153, 255));
            radioButton1.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 16));
            radioButton1.setForeground(Color.white);
            radioButton1.setHorizontalAlignment(SwingConstants.CENTER);

            GroupLayout panel8Layout = new GroupLayout(panel8);
            panel8.setLayout(panel8Layout);
            panel8Layout.setHorizontalGroup(
                panel8Layout.createParallelGroup()
                    .addComponent(radioButton1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
            );
            panel8Layout.setVerticalGroup(
                panel8Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panel8Layout.createSequentialGroup()
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(radioButton1)
                        .addGap(15, 15, 15))
            );
        }

        //---- label4 ----
        label4.setText(" \u6b65\u8fdb\u503c\u4e3a\uff1a");
        label4.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 16));

        //---- label5 ----
        label5.setText("0");
        label5.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 16));
        label5.setHorizontalAlignment(SwingConstants.CENTER);

        //======== panel9 ========
        {
            panel9.setLayout(new TableLayout(new double[][] {
                {TableLayout.FILL},
                {TableLayout.FILL, TableLayout.FILL}}));
            ((TableLayout)panel9.getLayout()).setHGap(3);
        }

        //---- spinner4 ----
        spinner4.setModel(new SpinnerNumberModel(0, 0, null, 4));
        spinner4.addChangeListener(e -> spinner4StateChanged(e));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGroup(contentPaneLayout.createParallelGroup()
                                        .addComponent(panel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                                    .addGroup(contentPaneLayout.createParallelGroup()
                                        .addComponent(panel2, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(panel4, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                .addGroup(GroupLayout.Alignment.LEADING, contentPaneLayout.createSequentialGroup()
                                    .addGroup(contentPaneLayout.createParallelGroup()
                                        .addComponent(panel5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(panel7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(panel8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(panel6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                    .addGap(43, 43, 43)
                                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(spinner4, GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                        .addComponent(spinner3, GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                        .addComponent(spinner2, GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                        .addComponent(spinner1, GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                                    .addGap(18, 18, 18)
                                    .addComponent(panel9, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGap(15, 15, 15))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(label4, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(label5, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(49, Short.MAX_VALUE))))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(panel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(7, 7, 7)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(panel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(panel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(panel9, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(219, 219, 219))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(panel5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(spinner1))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(spinner2, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                                .addComponent(panel6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(panel7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(spinner3))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(panel8, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addComponent(spinner4))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label4)
                                .addComponent(label5, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
                            .addGap(29, 29, 29))))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

  private void myInit() {
      ButtonGroup buttonGroup = new ButtonGroup();
      buttonGroup.add(radioButton6);
      buttonGroup.add(radioButton4);

  }
    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel panel1;
    private JRadioButton radioButton3;
    private JPanel panel2;
    private JRadioButton radioButton4;
    private JPanel panel3;
    private JRadioButton radioButton5;
    private JPanel panel4;
    private JRadioButton radioButton6;
    private JPanel panel5;
    private JLabel label1;
    private JPanel panel6;
    private JLabel label2;
    private JPanel panel7;
    private JLabel label3;
    private JPanel panel8;
    private JRadioButton radioButton1;
    private JLabel label4;
    private JLabel label5;
    private JPanel panel9;
    private JSpinner spinner1;
    private JSpinner spinner2;
    private JSpinner spinner3;
    private JSpinner spinner4;
  // JFormDesigner - End of variables declaration  //GEN-END:variables
  public static void main(String[] args) {
    EditLabel editLabel = new EditLabel();
  }
}
