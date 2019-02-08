/*
 * Created by JFormDesigner on Fri Feb 08 21:56:50 CST 2019
 */

package com.cc.UI.cols;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.border.*;
import javax.swing.event.*;

/**
 * @author cc
 */
public class BrightnessContrastForm extends JDialog {
    private BufferedImage image;
    private BufferedImage temp;

    public BrightnessContrastForm(Frame owner, BufferedImage image) {
        super(owner);
        initComponents();
        this.image = image;
        temp = image;
        setPic(image);
        this.setLocation(owner.getLocationOnScreen());
    }
    /**
     * 设置显示图片
     *
     * @param
     */
    private void setPic(BufferedImage image) {
//        Image image2 = image;
        label8.setIcon(null);
        ImageIcon icon =new ImageIcon() ;
        icon.setImage(image.getScaledInstance(label8.getWidth(), label8.getHeight(), Image.SCALE_DEFAULT));
        label8.setIcon(icon);
    }
    public BrightnessContrastForm(Dialog owner, BufferedImage image) {
        super(owner);
        initComponents();
        this.image = image;
        temp = image;
        setPic(image);
        this.setLocation(owner.getLocationOnScreen());
    }

    private void slider1StateChanged(ChangeEvent e) {
        label3.setText(String.valueOf(slider1.getValue()));
    }

    private void slider2StateChanged(ChangeEvent e) {
        label5.setText(String.valueOf(slider2.getValue()));
    }

    private void button4ActionPerformed(ActionEvent e) {
        this.dispose();
    }

    private void button3ActionPerformed(ActionEvent e) {
        // TODO 回传亮度/对比度参数
        System.out.println("回传亮度/对比度参数");
        this.dispose();
    }

    /**
     * 恢复
     * @param e
     */
    private void resetActionPerformed(ActionEvent e) {
        label8.setIcon(null);
        setPic(temp);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel1 = new JPanel();
        label1 = new JLabel();
        panel2 = new JPanel();
        label2 = new JLabel();
        label3 = new JLabel();
        slider1 = new JSlider();
        label4 = new JLabel();
        label5 = new JLabel();
        slider2 = new JSlider();
        checkBox1 = new JCheckBox();
        panel3 = new JPanel();
        button1 = new JButton();
        button2 = new JButton();
        panel4 = new JPanel();
        label6 = new JLabel();
        label7 = new JLabel();
        formattedTextField1 = new JFormattedTextField();
        formattedTextField2 = new JFormattedTextField();
        panel5 = new JPanel();
        label8 = new JLabel();
        button3 = new JButton();
        button4 = new JButton();

        //======== this ========
        setVisible(true);
        Container contentPane = getContentPane();

        //======== panel1 ========
        {

            //---- label1 ----
            label1.setText("\u7070\u5ea6\u76f4\u65b9\u56fe\uff1a");

            //======== panel2 ========
            {
                panel2.setBorder(LineBorder.createBlackLineBorder());

                GroupLayout panel2Layout = new GroupLayout(panel2);
                panel2.setLayout(panel2Layout);
                panel2Layout.setHorizontalGroup(
                    panel2Layout.createParallelGroup()
                        .addGap(0, 258, Short.MAX_VALUE)
                );
                panel2Layout.setVerticalGroup(
                    panel2Layout.createParallelGroup()
                        .addGap(0, 95, Short.MAX_VALUE)
                );
            }

            //---- label2 ----
            label2.setText("\u4e0a\u9650\uff1a");

            //---- label3 ----
            label3.setText("50");
            label3.setBorder(new EtchedBorder());

            //---- slider1 ----
            slider1.addChangeListener(e -> slider1StateChanged(e));

            //---- label4 ----
            label4.setText("\u4e0b\u9650\uff1a");

            //---- label5 ----
            label5.setText("50");
            label5.setBorder(new EtchedBorder());

            //---- slider2 ----
            slider2.addChangeListener(e -> slider2StateChanged(e));

            //---- checkBox1 ----
            checkBox1.setText("\u53cd\u8272");

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(panel1Layout.createParallelGroup()
                            .addComponent(checkBox1)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(label4)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label5))
                            .addComponent(panel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label1)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(label2)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label3)))
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panel1Layout.createParallelGroup()
                            .addComponent(slider1, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 260, GroupLayout.PREFERRED_SIZE)
                            .addComponent(slider2, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 260, GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label1)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label2, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label3))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(slider1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label4, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label5))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(slider2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkBox1)
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
        }

        //======== panel3 ========
        {
            panel3.setBorder(LineBorder.createBlackLineBorder());

            //---- button1 ----
            button1.setText("\u81ea\u52a8\u8c03\u6574");

            //---- button2 ----
            button2.setText("\u6062\u590d");
            button2.addActionListener(e -> resetActionPerformed(e));

            GroupLayout panel3Layout = new GroupLayout(panel3);
            panel3.setLayout(panel3Layout);
            panel3Layout.setHorizontalGroup(
                panel3Layout.createParallelGroup()
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(button1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(26, Short.MAX_VALUE))
            );
            panel3Layout.setVerticalGroup(
                panel3Layout.createParallelGroup()
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(button1)
                        .addGap(18, 18, 18)
                        .addComponent(button2)
                        .addContainerGap(26, Short.MAX_VALUE))
            );
        }

        //======== panel4 ========
        {
            panel4.setBorder(new TitledBorder(new EtchedBorder(), "\u56fe\u50cf\u4fe1\u606f"));

            //---- label6 ----
            label6.setText("\u6700\u5927\u503c\uff1a");

            //---- label7 ----
            label7.setText("\u6700\u5c0f\u503c\uff1a");

            //---- formattedTextField1 ----
            formattedTextField1.setEnabled(false);

            //---- formattedTextField2 ----
            formattedTextField2.setEnabled(false);

            GroupLayout panel4Layout = new GroupLayout(panel4);
            panel4.setLayout(panel4Layout);
            panel4Layout.setHorizontalGroup(
                panel4Layout.createParallelGroup()
                    .addGroup(panel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel4Layout.createParallelGroup()
                            .addGroup(panel4Layout.createSequentialGroup()
                                .addComponent(label6)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(formattedTextField1, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel4Layout.createSequentialGroup()
                                .addComponent(label7)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(formattedTextField2, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            panel4Layout.setVerticalGroup(
                panel4Layout.createParallelGroup()
                    .addGroup(panel4Layout.createSequentialGroup()
                        .addGroup(panel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label6, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
                            .addComponent(formattedTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(panel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label7, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
                            .addComponent(formattedTextField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 20, Short.MAX_VALUE))
            );
        }

        //======== panel5 ========
        {
            panel5.setBorder(LineBorder.createBlackLineBorder());

            //---- label8 ----
            label8.setBorder(LineBorder.createGrayLineBorder());

            GroupLayout panel5Layout = new GroupLayout(panel5);
            panel5.setLayout(panel5Layout);
            panel5Layout.setHorizontalGroup(
                panel5Layout.createParallelGroup()
                    .addComponent(label8, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
            );
            panel5Layout.setVerticalGroup(
                panel5Layout.createParallelGroup()
                    .addGroup(panel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label8, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
            );
        }

        //---- button3 ----
        button3.setText("\u786e\u5b9a");
        button3.addActionListener(e -> button3ActionPerformed(e));

        //---- button4 ----
        button4.setText("\u53d6\u6d88");
        button4.addActionListener(e -> button4ActionPerformed(e));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(15, 15, 15)
                            .addComponent(panel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addGap(26, 26, 26)
                            .addComponent(panel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(panel5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(89, 89, 89)
                            .addComponent(button3, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(button4, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(16, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panel5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(7, 7, 7)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addComponent(panel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(panel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(button3, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
                                .addComponent(button4, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap())
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel panel1;
    private JLabel label1;
    private JPanel panel2;
    private JLabel label2;
    private JLabel label3;
    private JSlider slider1;
    private JLabel label4;
    private JLabel label5;
    private JSlider slider2;
    private JCheckBox checkBox1;
    private JPanel panel3;
    private JButton button1;
    private JButton button2;
    private JPanel panel4;
    private JLabel label6;
    private JLabel label7;
    private JFormattedTextField formattedTextField1;
    private JFormattedTextField formattedTextField2;
    private JPanel panel5;
    private JLabel label8;
    private JButton button3;
    private JButton button4;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
