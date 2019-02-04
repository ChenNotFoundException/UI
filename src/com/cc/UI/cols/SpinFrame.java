/*
 * Created by JFormDesigner on Mon Feb 04 14:02:29 CST 2019
 */

package com.cc.UI.cols;

import javax.swing.border.*;
import com.cc.UI.utils.ImageUtils;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.util.Stack;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author cc
 */
public class SpinFrame extends JFrame {
    public static void main(String[] args) {
        SpinFrame s = new SpinFrame();
        s.setVisible(true);
    }

    private Stack <BufferedImage> stack;
    private BufferedImage bufferedImage;
    private JLabel piclabel;

    public SpinFrame(Stack <BufferedImage> stack, BufferedImage bufferedImage,JLabel label) throws HeadlessException {
        this();
        this.stack = stack;
        this.bufferedImage = bufferedImage;
        this.piclabel = label;
        this.setLocation(piclabel.getLocation());
        this.setVisible(true);
    }

    public SpinFrame() {
        initComponents();
    }

    /**
     * 旋转任意角度
     * @param e
     */
    private void FreeSpinActionPerformed(ActionEvent e) {
        panel1.setVisible(true);
        int degree = Integer.valueOf(textField1.getText());
        stack.push(ImageUtils.Rotate(stack.peek(),degree));
        setPic(stack.peek());
        System.out.println(stack.size());
    }


    /**
     * 上下翻转
     * @param e
     */
    private void romateVerActionPerformed(ActionEvent e) {
        stack.push(ImageUtils.rotateVertical(stack.peek()));
        setPic(stack.peek());
        System.out.println(stack.size());
    }

    /**
     *左右翻转
     * @param e
     */
    private void romateHorActionPerformed(ActionEvent e) {
        stack.push(ImageUtils.rotateHorizon(stack.peek()));
        setPic(stack.peek());
        System.out.println(stack.size());

    }

    /**
     * 顺时针旋转90度
     * @param e
     */
    private void L90ActionPerformed(ActionEvent e) {
        stack.push(ImageUtils.Rotate(stack.peek(),270));
        setPic(stack.peek());
        System.out.println(stack.size());

    }

    /**
     * 逆时针旋转90度
     * @param e
     */
    private void R90ActionPerformed(ActionEvent e) {
        stack.push(ImageUtils.Rotate(stack.peek(),90));
        setPic(stack.peek());
        System.out.println(stack.size());

    }

    /**
     * 旋转180度
     * @param e
     */
    private void romate180ActionPerformed(ActionEvent e) {
        stack.push(ImageUtils.rotate180(stack.peek()));
        setPic(stack.peek());
        System.out.println(stack.size());

    }
    /**
     * 设置显示图片
     *
     * @param image
     */
    private void setPic(BufferedImage image) {
//        Image image2 = image;
        piclabel.setIcon(null);
        ImageIcon icon = new ImageIcon(image);
        // icon.setImage(icon.getImage().getScaledInstance(icon.getIconWidth(), icon.getIconHeight(), Image.SCALE_DEFAULT));
        piclabel.setIcon(icon);
    }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        button6 = new JButton();
        panel1 = new JPanel();
        label1 = new JLabel();
        textField1 = new JTextField();

        //======== this ========
        setTitle("\u65cb\u8f6c");
        Container contentPane = getContentPane();

        //---- button1 ----
        button1.setIcon(new ImageIcon(getClass().getResource("/UCC-\u4e0a\u4e0b copy.jpg")));
        button1.addActionListener(e -> romateVerActionPerformed(e));

        //---- button2 ----
        button2.setIcon(new ImageIcon(getClass().getResource("/\u955c\u50cf.jpg")));
        button2.addActionListener(e -> romateHorActionPerformed(e));

        //---- button3 ----
        button3.setIcon(new ImageIcon(getClass().getResource("/\u5411\u5de690\u5ea6.jpg")));
        button3.addActionListener(e -> L90ActionPerformed(e));

        //---- button4 ----
        button4.setIcon(new ImageIcon(getClass().getResource("/\u5411\u53f390\u5ea6.jpg")));
        button4.addActionListener(e -> R90ActionPerformed(e));

        //---- button5 ----
        button5.setIcon(new ImageIcon(getClass().getResource("/\u65cb\u8f6c180\u5ea6.jpg")));
        button5.addActionListener(e -> romate180ActionPerformed(e));

        //---- button6 ----
        button6.setIcon(new ImageIcon(getClass().getResource("/\u65cb\u8f6c.jpg")));
        button6.addActionListener(e -> FreeSpinActionPerformed(e));

        //======== panel1 ========
        {
            panel1.setBorder(new TitledBorder("\u81ea\u5b9a\u4e49\u89d2\u5ea6"));

            //---- label1 ----
            label1.setText("\u89d2\u5ea6\uff1a");

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(label1)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label1)
                            .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(29, Short.MAX_VALUE))
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(button5)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(button6))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(button1)
                                .addComponent(button3))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(button4)
                                .addComponent(button2)))
                        .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 11, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(button2)
                        .addComponent(button1))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(button3)
                        .addComponent(button4))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(button5)
                        .addComponent(button6))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(16, Short.MAX_VALUE))
        );
        setSize(135, 245);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JPanel panel1;
    private JLabel label1;
    private JTextField textField1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
