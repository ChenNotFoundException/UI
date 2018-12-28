/*
 * Created by JFormDesigner on Fri Dec 28 10:46:20 CST 2018
 */

package com.cc.UI.cols;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.border.*;
import javax.swing.event.*;

/**
 * @author ccc
 */
public class Property extends JDialog {
    private final String D_R = "50";
    private final String D_B = "50";

  public static void main(String[] args) {
    Property property = new Property();
  }

    public Property(Frame owner) {
        super(owner);
        initComponents();
    }

    public Property() {
        super();
        initComponents();
        myInit();

    }

    public Property(Dialog owner) {
        super(owner);
        initComponents();
    }

    private void slider1StateChanged(ChangeEvent e) {
        label4.setText(String.valueOf(slider1.getValue()));
    }

    private void slider2StateChanged(ChangeEvent e) {
        label6.setText(String.valueOf(slider2.getValue()));
    }

    private void button1ActionPerformed(ActionEvent e) {
        label4.setText(D_R);
        slider1.setValue(Integer.valueOf(D_R));
        label6.setText(D_B);
        slider2.setValue(Integer.valueOf(D_B));
    }

    private void myInit() {
      ButtonGroup buttonGroup = new ButtonGroup();
      buttonGroup.add(radioButton1);
      buttonGroup.add(radioButton2);
        label9.setText(String.valueOf(slider3.getValue()));
        label6.setText(String.valueOf(slider2.getValue()));
        label4.setText(String.valueOf(slider1.getValue()));

    }

    private void cancelButtonActionPerformed(ActionEvent e) {
        this.dispose();
    }

    private void slider3StateChanged(ChangeEvent e) {
        label9.setText(String.valueOf(slider3.getValue()));
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        tabbedPane1 = new JTabbedPane();
        panel1 = new JPanel();
        label1 = new JLabel();
        radioButton1 = new JRadioButton();
        radioButton2 = new JRadioButton();
        label2 = new JLabel();
        comboBox1 = new JComboBox();
        checkBox1 = new JCheckBox();
        checkBox2 = new JCheckBox();
        checkBox3 = new JCheckBox();
        panel2 = new JPanel();
        label3 = new JLabel();
        slider1 = new JSlider();
        label4 = new JLabel();
        label5 = new JLabel();
        slider2 = new JSlider();
        label6 = new JLabel();
        checkBox4 = new JCheckBox();
        button1 = new JButton();
        panel3 = new JPanel();
        slider3 = new JSlider();
        label7 = new JLabel();
        label8 = new JLabel();
        label9 = new JLabel();
        checkBox5 = new JCheckBox();
        checkBox6 = new JCheckBox();
        buttonBar = new JPanel();
        okButton = new JButton();
        cancelButton = new JButton();

        //======== this ========
        setTitle("\u5c5e\u6027");
        setResizable(false);
        setVisible(true);
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane.setLayout(new BorderLayout());

            //======== contentPanel ========
            {

                //======== tabbedPane1 ========
                {

                    //======== panel1 ========
                    {

                        //---- label1 ----
                        label1.setText("\u663e\u793a\u5668");

                        //---- radioButton1 ----
                        radioButton1.setText("CRT");

                        //---- radioButton2 ----
                        radioButton2.setText("LCD");

                        //---- label2 ----
                        label2.setText("\u5149 \u6e90");

                        //---- checkBox1 ----
                        checkBox1.setText("USB2 i2");
                        checkBox1.setSelected(true);
                        checkBox1.setEnabled(false);

                        //---- checkBox2 ----
                        checkBox2.setText("\u6c34\u5e73\u65cb\u8f6c");

                        //---- checkBox3 ----
                        checkBox3.setText("\u5782\u76f4\u65cb\u8f6c");

                        //======== panel2 ========
                        {
                            panel2.setBorder(new TitledBorder(new EtchedBorder(), "\u767d\u5e73\u8861"));

                            //---- label3 ----
                            label3.setText("R");
                            label3.setHorizontalAlignment(SwingConstants.CENTER);

                            //---- slider1 ----
                            slider1.addChangeListener(e -> slider1StateChanged(e));

                            //---- label4 ----
                            label4.setText("0");
                            label4.setHorizontalAlignment(SwingConstants.CENTER);

                            //---- label5 ----
                            label5.setText("B");
                            label5.setHorizontalAlignment(SwingConstants.CENTER);

                            //---- slider2 ----
                            slider2.addChangeListener(e -> slider2StateChanged(e));

                            //---- label6 ----
                            label6.setText("0");
                            label6.setHorizontalAlignment(SwingConstants.CENTER);

                            //---- checkBox4 ----
                            checkBox4.setText("\u81ea\u52a8");
                            checkBox4.setHorizontalAlignment(SwingConstants.CENTER);

                            //---- button1 ----
                            button1.setText("\u9ed8\u8ba4\u503c");
                            button1.addActionListener(e -> button1ActionPerformed(e));

                            GroupLayout panel2Layout = new GroupLayout(panel2);
                            panel2.setLayout(panel2Layout);
                            panel2Layout.setHorizontalGroup(
                                panel2Layout.createParallelGroup()
                                    .addGroup(panel2Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(label5, GroupLayout.DEFAULT_SIZE, 15, Short.MAX_VALUE)
                                            .addComponent(label3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                            .addComponent(slider1, GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                                            .addComponent(slider2, GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE))
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                            .addComponent(label4, GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                                            .addComponent(label6, GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE))
                                        .addGap(32, 32, 32)
                                        .addGroup(panel2Layout.createParallelGroup()
                                            .addComponent(checkBox4, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
                                            .addGroup(panel2Layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(button1)))
                                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            );
                            panel2Layout.setVerticalGroup(
                                panel2Layout.createParallelGroup()
                                    .addGroup(panel2Layout.createSequentialGroup()
                                        .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                            .addComponent(slider1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(label3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(checkBox4)
                                                .addComponent(label4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(panel2Layout.createParallelGroup()
                                            .addComponent(label5)
                                            .addComponent(slider2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                            .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(button1, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(label6)))
                                        .addGap(0, 58, Short.MAX_VALUE))
                            );
                        }

                        //======== panel3 ========
                        {
                            panel3.setBorder(new TitledBorder(new EtchedBorder(), "\u66dd\u5149"));

                            //---- slider3 ----
                            slider3.addChangeListener(e -> slider3StateChanged(e));

                            //---- label7 ----
                            label7.setText("\u6697");
                            label7.setHorizontalAlignment(SwingConstants.CENTER);

                            //---- label8 ----
                            label8.setText("\u4eae");
                            label8.setHorizontalAlignment(SwingConstants.CENTER);

                            //---- label9 ----
                            label9.setText("0");

                            //---- checkBox5 ----
                            checkBox5.setText("\u81ea\u52a8");

                            //---- checkBox6 ----
                            checkBox6.setText("\u6697\u5904\u8865\u507f");
                            checkBox6.setEnabled(false);

                            GroupLayout panel3Layout = new GroupLayout(panel3);
                            panel3.setLayout(panel3Layout);
                            panel3Layout.setHorizontalGroup(
                                panel3Layout.createParallelGroup()
                                    .addGroup(panel3Layout.createSequentialGroup()
                                        .addGroup(panel3Layout.createParallelGroup()
                                            .addGroup(panel3Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(label7, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(slider3, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(label8)
                                                .addGap(18, 18, 18)
                                                .addComponent(checkBox5)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(checkBox6))
                                            .addGroup(panel3Layout.createSequentialGroup()
                                                .addGap(114, 114, 114)
                                                .addComponent(label9)))
                                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            );
                            panel3Layout.setVerticalGroup(
                                panel3Layout.createParallelGroup()
                                    .addGroup(panel3Layout.createSequentialGroup()
                                        .addGroup(panel3Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                            .addComponent(label7, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(slider3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                            .addGroup(panel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(label8, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(checkBox5)
                                                .addComponent(checkBox6)))
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(label9))
                            );
                        }

                        GroupLayout panel1Layout = new GroupLayout(panel1);
                        panel1.setLayout(panel1Layout);
                        panel1Layout.setHorizontalGroup(
                            panel1Layout.createParallelGroup()
                                .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                    .addGap(29, 29, 29)
                                    .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(panel2, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(GroupLayout.Alignment.LEADING, panel1Layout.createSequentialGroup()
                                            .addGroup(panel1Layout.createParallelGroup()
                                                .addGroup(panel1Layout.createSequentialGroup()
                                                    .addComponent(label1)
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(radioButton1)
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(radioButton2))
                                                .addGroup(panel1Layout.createSequentialGroup()
                                                    .addComponent(label2)
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)))
                                            .addGap(52, 52, 52)
                                            .addGroup(panel1Layout.createParallelGroup()
                                                .addGroup(panel1Layout.createSequentialGroup()
                                                    .addComponent(checkBox2)
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(checkBox3))
                                                .addComponent(checkBox1))
                                            .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(panel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addContainerGap())
                        );
                        panel1Layout.setVerticalGroup(
                            panel1Layout.createParallelGroup()
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(label1)
                                        .addComponent(radioButton1)
                                        .addComponent(radioButton2)
                                        .addComponent(checkBox1))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(panel1Layout.createParallelGroup()
                                        .addComponent(label2)
                                        .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                            .addComponent(checkBox2)
                                            .addComponent(checkBox3)))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(panel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(panel3, GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                                    .addContainerGap())
                        );
                    }
                    tabbedPane1.addTab("Video Image", panel1);
                }

                GroupLayout contentPanelLayout = new GroupLayout(contentPanel);
                contentPanel.setLayout(contentPanelLayout);
                contentPanelLayout.setHorizontalGroup(
                    contentPanelLayout.createParallelGroup()
                        .addComponent(tabbedPane1)
                );
                contentPanelLayout.setVerticalGroup(
                    contentPanelLayout.createParallelGroup()
                        .addComponent(tabbedPane1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                );
            }
            dialogPane.add(contentPanel, BorderLayout.CENTER);

            //======== buttonBar ========
            {
                buttonBar.setBorder(new EmptyBorder(12, 0, 0, 0));
                buttonBar.setLayout(new GridBagLayout());
                ((GridBagLayout)buttonBar.getLayout()).columnWidths = new int[] {0, 85, 80};
                ((GridBagLayout)buttonBar.getLayout()).columnWeights = new double[] {1.0, 0.0, 0.0};

                //---- okButton ----
                okButton.setText("\u786e\u5b9a");
                buttonBar.add(okButton, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 5), 0, 0));

                //---- cancelButton ----
                cancelButton.setText("\u53d6\u6d88");
                cancelButton.addActionListener(e -> cancelButtonActionPerformed(e));
                buttonBar.add(cancelButton, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 0), 0, 0));
            }
            dialogPane.add(buttonBar, BorderLayout.SOUTH);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel dialogPane;
    private JPanel contentPanel;
    private JTabbedPane tabbedPane1;
    private JPanel panel1;
    private JLabel label1;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JLabel label2;
    private JComboBox comboBox1;
    private JCheckBox checkBox1;
    private JCheckBox checkBox2;
    private JCheckBox checkBox3;
    private JPanel panel2;
    private JLabel label3;
    private JSlider slider1;
    private JLabel label4;
    private JLabel label5;
    private JSlider slider2;
    private JLabel label6;
    private JCheckBox checkBox4;
    private JButton button1;
    private JPanel panel3;
    private JSlider slider3;
    private JLabel label7;
    private JLabel label8;
    private JLabel label9;
    private JCheckBox checkBox5;
    private JCheckBox checkBox6;
    private JPanel buttonBar;
    private JButton okButton;
    private JButton cancelButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
