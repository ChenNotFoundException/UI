package com.cc.UI;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.*;

import com.cc.UI.utils.FileUtils;
import com.eltima.components.ui.DatePicker;
import com.jgoodies.forms.factories.*;

/*
 * Created by JFormDesigner on Wed Dec 26 19:45:52 CST 2018
 */
/**
 * @author ccc
 */
public class MainUI extends JFrame {
    private EditLabel editLabel;
    public MainUI() {
        initComponents();
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    private boolean isCameraOn = false;
    private boolean isChilled = false;
    private String url = null;
    private boolean cutPart = false;
    BufferedImage bufferedImage = null;
    int x,y,xEnd, yEnd;

    /**
     * 设置显示图片
     * @param image
     */
    private void setPic(BufferedImage image) {
//        Image image2 = image;
        piclabel.setIcon(null);
        ImageIcon icon = new ImageIcon(image);
       // icon.setImage(icon.getImage().getScaledInstance(icon.getIconWidth(), icon.getIconHeight(), Image.SCALE_DEFAULT));
        piclabel.setIcon(icon);
    }

    /**
     * 打开、加载图片
     * @param e
     */
    private void button1ActionPerformed(ActionEvent e) {
        url = FileUtils.openFile();
        ImageIcon background = new ImageIcon(url);
        try {
            bufferedImage = ImageIO.read(new File(url));
        } catch (IOException e1) {
            e1.printStackTrace();
        }finally {
           //
            piclabel.setIcon(background);
//            setPic(bufferedImage);
            if (!url.equals(""))
            {new EditLabel();

            }
        }
    }

    /**
     * 关闭图片页面
     * @param e
     */
    private void closePicActionPerformed(ActionEvent e) {
        piclabel.setIcon(null);
        bufferedImage = null;
        editLabel.dispose();
    }

    /**
     * 退出程序
     * @param e
     */
    private void menuItem8ActionPerformed(ActionEvent e) {
        System.exit(0);
    }

    /**
     * 工具栏是否隐藏
     * @param e
     */
    private void checkBoxMenuItem1ItemStateChanged(ItemEvent e) {
        toolBar1.setVisible(!toolBar1.isVisible());
    }

    /**
     * 摄像头打开/关闭功能
     * @param e
     */
    private void button4ActionPerformed(ActionEvent e) {

        if (!isCameraOn) {
            button4.setIcon(new ImageIcon(getClass().getResource("/\u6444\u50cf\u5934_\u5f00\u542f\u72b6\u6001.jpg")));
            isCameraOn = true;
        } else {
            button4.setIcon(new ImageIcon(getClass().getResource("/\u6444\u50cf\u5934-\u5173\u95ed.jpg")));
            isCameraOn = false;
        }
        //todo 开启摄像头部分
    }

    /**
     * 冻结/解冻状态
     * @param e
     */
    private void button5ActionPerformed(ActionEvent e) {
        if (!isChilled) {
            button5.setIcon(new ImageIcon(getClass().getResource("/\u89e3\u51bb.jpg")));

            isChilled = true;
        } else {
            button5.setIcon(new ImageIcon(getClass().getResource("/\u51bb\u7ed3.jpg")));//冻
            isChilled = false;
            System.out.println("冻结状态");
            //todo 冻结图片
        }

    }

    /**
     * 底部备注栏是否打开
     * @param e
     */
    private void checkBoxMenuItem2ActionPerformed(ActionEvent e) {
        label19.setVisible(!label19.isVisible());
    }

    /**
     * 帮助页面
     * @param e
     */
    private void menuItem58ActionPerformed(ActionEvent e) {
        //todo 帮助说明
        System.out.println("这里是帮助说明");
        System.out.println(datePicker1.getText().substring(0,11));
    }

    /**
     * 分析栏打开/关闭
     * @param e
     */
    private void checkBoxMenuItem5ActionPerformed(ActionEvent e) {
        panel1.setVisible(!panel1.isVisible());
    }


    /**
     * 关闭图片页面
     * @param e
     */
    private void button3ActionPerformed(ActionEvent e) {
        piclabel.setIcon(null);
        editLabel.dispose();
        bufferedImage = null;
    }

    /**
     * 处理完保存图片
     * @param e
     */
    private void button2ActionPerformed(ActionEvent e) {
        try {
            ImageIO.write(bufferedImage, "PNG", new File(url.substring(0,url.length()-4)+".png"));
            cutPart = false;
            button16.setBackground(null);
//            temp = bufferedImage;
            System.out.println("success saved");
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }

    /**
     * 裁剪图片部分
     * @param e
     */
    private void piclabelMousePressed(MouseEvent e) {
        System.out.print("是否有图片?");
        System.out.println(url==(null));
        System.out.println("按下鼠标");
        piclabel.repaint(piclabel.getBounds());
        x = e.getX();
        y = e.getY();
        System.out.println("拖拽前" + "x:" + x + "y:" + y);
    }


    private void piclabelMouseReleased(MouseEvent e) {
        /*
        画出选中矩形区域
         */
        if (cutPart) {
            if (xEnd <= bufferedImage.getWidth() && yEnd <= bufferedImage.getHeight()) {

                xEnd = e.getX();
                yEnd = e.getY();
                paintComponents(piclabel.getGraphics());
            } else {
//                xEnd = bufferedImage.getWidth()-x;
//                yEnd = bufferedImage.getHeight() - y;
                JOptionPane.showMessageDialog(null, "请在图片内框选", "警告", JOptionPane.ERROR_MESSAGE);
            }
            //repaint();
        }
        System.out.println("拖拽后" + "x:" + e.getX() + "y:" + e.getY());
    }

    private void piclabelMouseDragged(MouseEvent e) {
        if (cutPart) {
            repaint();
            //drawLine(piclabel.getGraphics(),x,y,e.getX(),e.getY());
            xEnd = e.getX();
            yEnd = e.getY();
            if (xEnd <= bufferedImage.getWidth() && yEnd <= bufferedImage.getHeight()) {
                paintComponents(piclabel.getGraphics());
            }

        }
    }

    @Override
    public void paintComponents(Graphics g) {
      //  super.paintComponents(g);
        drawRect(g, x, y, xEnd, yEnd);
    }

    private void drawRect(Graphics g, int x, int y, int xEnd, int yEnd) {
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setColor(Color.RED);
        float[] dash = new float[] { 5, 10 };
        BasicStroke bs2 = new BasicStroke(
                2,                      // 画笔宽度/线宽
                BasicStroke.CAP_SQUARE,
                BasicStroke.JOIN_MITER,
                10.0f,
                dash,                   // 虚线模式数组
                0.0f
        );
        g2d.setStroke(bs2);
        // 1. 绘制一个矩形:
        g2d.drawRect(x, y, Math.abs(xEnd - x), Math.abs(yEnd - y));
        g2d.dispose();
    }

    /**
     * 设置裁剪区域
     * @param e
     */
    private void setCutActionPerformed(ActionEvent e) {
        cutPart = true;
        button16.setBackground(Color.RED);
    }

    /**
     * 显示裁剪区域图片
     * @param e
     */
    private void cutAreaActionPerformed(ActionEvent e) {
        bufferedImage = bufferedImage.getSubimage(x, y, Math.abs(xEnd - x), Math.abs(yEnd - y));
        setPic(bufferedImage);
    }

    /**
     * 图片另存为
     * @param e
     */
    private void saveAsActionPerformed(ActionEvent e) {
        try {
            String url2 = FileUtils.openFile();
            ImageIO.write(bufferedImage, "PNG", new File(url2+".png"));
            System.out.println("saveAs SUCCESS");
        } catch (IOException e1) {
            e1.printStackTrace();
        }

    }

    /**
     * 撤销操作
     * @param e
     */
    private void withdrawActionPerformed(ActionEvent e) {
//todo 撤销 初步考虑使用stack
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        DefaultComponentFactory compFactory = DefaultComponentFactory.getInstance();
        menuBar1 = new JMenuBar();
        menu1 = new JMenu();
        menuItem1 = new JMenuItem();
        menuItem2 = new JMenuItem();
        menuItem3 = new JMenuItem();
        menuItem4 = new JMenuItem();
        menuItem5 = new JMenuItem();
        menuItem6 = new JMenuItem();
        menuItem7 = new JMenuItem();
        menuItem8 = new JMenuItem();
        menu8 = new JMenu();
        menuItem10 = new JMenuItem();
        menuItem11 = new JMenuItem();
        menuItem12 = new JMenuItem();
        menuItem13 = new JMenuItem();
        menu2 = new JMenu();
        menuItem14 = new JMenuItem();
        menuItem15 = new JMenuItem();
        menuItem16 = new JMenuItem();
        menuItem17 = new JMenuItem();
        menuItem18 = new JMenuItem();
        menuItem19 = new JMenuItem();
        menu9 = new JMenu();
        radioButtonMenuItem1 = new JRadioButtonMenuItem();
        radioButtonMenuItem2 = new JRadioButtonMenuItem();
        radioButtonMenuItem3 = new JRadioButtonMenuItem();
        menuItem23 = new JMenuItem();
        menuItem24 = new JMenuItem();
        menuItem25 = new JMenuItem();
        menuItem26 = new JMenuItem();
        menu3 = new JMenu();
        menuItem27 = new JMenuItem();
        menuItem28 = new JMenuItem();
        menuItem29 = new JMenuItem();
        menuItem30 = new JMenuItem();
        menu10 = new JMenu();
        menuItem31 = new JMenuItem();
        menuItem32 = new JMenuItem();
        menuItem33 = new JMenuItem();
        menuItem34 = new JMenuItem();
        menu4 = new JMenu();
        menuItem35 = new JMenuItem();
        menuItem36 = new JMenuItem();
        menuItem37 = new JMenuItem();
        menuItem38 = new JMenuItem();
        menuItem39 = new JMenuItem();
        menuItem40 = new JMenuItem();
        menuItem41 = new JMenuItem();
        menuItem42 = new JMenuItem();
        menuItem43 = new JMenuItem();
        menuItem44 = new JMenuItem();
        menuItem45 = new JMenuItem();
        menuItem46 = new JMenuItem();
        menu5 = new JMenu();
        checkBoxMenuItem1 = new JCheckBoxMenuItem();
        checkBoxMenuItem2 = new JCheckBoxMenuItem();
        checkBoxMenuItem3 = new JCheckBoxMenuItem();
        checkBoxMenuItem4 = new JCheckBoxMenuItem();
        checkBoxMenuItem5 = new JCheckBoxMenuItem();
        checkBoxMenuItem6 = new JCheckBoxMenuItem();
        checkBoxMenuItem7 = new JCheckBoxMenuItem();
        checkBoxMenuItem8 = new JCheckBoxMenuItem();
        checkBoxMenuItem9 = new JCheckBoxMenuItem();
        checkBoxMenuItem10 = new JCheckBoxMenuItem();
        menuItem56 = new JMenuItem();
        menu6 = new JMenu();
        menuItem57 = new JMenuItem();
        menu7 = new JMenu();
        menuItem58 = new JMenuItem();
        menuItem59 = new JMenuItem();
        toolBar1 = new JToolBar();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        button6 = new JButton();
        button7 = new JButton();
        button8 = new JButton();
        button9 = new JButton();
        button10 = new JButton();
        button11 = new JButton();
        button12 = new JButton();
        button13 = new JButton();
        button14 = new JButton();
        button15 = new JButton();
        button16 = new JButton();
        button17 = new JButton();
        button18 = new JButton();
        button19 = new JButton();
        button20 = new JButton();
        button21 = new JButton();
        button22 = new JButton();
        button23 = new JButton();
        button24 = new JButton();
        button25 = new JButton();
        panel1 = new JPanel();
        label2 = new JLabel();
        comboBox1 = new JComboBox<>();
        label3 = new JLabel();
        label1 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        label6 = new JLabel();
        label7 = new JLabel();
        label8 = new JLabel();
        label9 = new JLabel();
        label10 = new JLabel();
        label11 = new JLabel();
        label12 = new JLabel();
        label13 = new JLabel();
        label14 = new JLabel();
        separator6 = compFactory.createSeparator("");
        panel2 = new JPanel();
        label16 = compFactory.createLabel("\u6c34\u5e73");
        label17 = compFactory.createLabel("\u5782\u76f4");
        spinner1 = new JSpinner();
        spinner2 = new JSpinner();
        panel3 = new JPanel();
        radioButton1 = new JRadioButton();
        radioButton2 = new JRadioButton();
        panel4 = new JPanel();
        label15 = new JLabel();
        comboBox2 = new JComboBox();
        label18 = new JLabel();
        datePicker1 = new DatePicker();
        imagePanel = new JPanel();
        piclabel = new JLabel();
        label19 = new JLabel();

        //======== this ========
        setTitle("Tocan\u51dd\u80f6\u5206\u6790\u7cfb\u7edf");
        setResizable(false);
        Container contentPane = getContentPane();

        //======== menuBar1 ========
        {

            //======== menu1 ========
            {
                menu1.setText("\u6587\u4ef6(F)");
                menu1.setMnemonic('F');

                //---- menuItem1 ----
                menuItem1.setText("\u6253\u5f00");
                menuItem1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, KeyEvent.CTRL_MASK));
                menuItem1.addActionListener(e -> button1ActionPerformed(e));
                menu1.add(menuItem1);

                //---- menuItem2 ----
                menuItem2.setText("\u4fdd\u5b58");
                menuItem2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.CTRL_MASK));
                menu1.add(menuItem2);

                //---- menuItem3 ----
                menuItem3.setText("\u53e6\u5b58\u4e3a");
                menuItem3.addActionListener(e -> saveAsActionPerformed(e));
                menu1.add(menuItem3);

                //---- menuItem4 ----
                menuItem4.setText("\u5173\u95ed");
                menuItem4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_MASK));
                menuItem4.addActionListener(e -> closePicActionPerformed(e));
                menu1.add(menuItem4);

                //---- menuItem5 ----
                menuItem5.setText("\u6253\u5370");
                menuItem5.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, KeyEvent.CTRL_MASK));
                menu1.add(menuItem5);

                //---- menuItem6 ----
                menuItem6.setText("\u6253\u5370\u9884\u89c8");
                menu1.add(menuItem6);

                //---- menuItem7 ----
                menuItem7.setText("\u6253\u5370\u8bbe\u7f6e");
                menu1.add(menuItem7);

                //---- menuItem8 ----
                menuItem8.setText("\u9000\u51fa");
                menuItem8.addActionListener(e -> menuItem8ActionPerformed(e));
                menu1.add(menuItem8);

                //======== menu8 ========
                {
                    menu8.setText("\u65b0\u5efa\u534f\u8bae");

                    //---- menuItem10 ----
                    menuItem10.setText("\u51dd\u80f6\u6210\u50cf");
                    menu8.add(menuItem10);

                    //---- menuItem11 ----
                    menuItem11.setText("\u5316\u5b66\u53d1\u5149\u6210\u50cf");
                    menu8.add(menuItem11);

                    //---- menuItem12 ----
                    menuItem12.setText("\u8367\u5149\u53d1\u5149\u6210\u50cf");
                    menu8.add(menuItem12);
                }
                menu1.add(menu8);

                //---- menuItem13 ----
                menuItem13.setText("\u9ed8\u8ba4\u534f\u8bae");
                menu1.add(menuItem13);
            }
            menuBar1.add(menu1);

            //======== menu2 ========
            {
                menu2.setText("\u7f16\u8f91\u6807\u6ce8(E)");
                menu2.setMnemonic('E');

                //---- menuItem14 ----
                menuItem14.setText("\u526a\u5207");
                menuItem14.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, KeyEvent.CTRL_MASK));
                menu2.add(menuItem14);

                //---- menuItem15 ----
                menuItem15.setText("\u590d\u5236");
                menuItem15.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, KeyEvent.CTRL_MASK));
                menu2.add(menuItem15);

                //---- menuItem16 ----
                menuItem16.setText("\u7c98\u8d34");
                menuItem16.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, KeyEvent.CTRL_MASK));
                menu2.add(menuItem16);

                //---- menuItem17 ----
                menuItem17.setText("\u5220\u9664");
                menuItem17.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_DELETE, 0));
                menu2.add(menuItem17);

                //---- menuItem18 ----
                menuItem18.setText("\u63d2\u5165\u6807\u6ce8");
                menu2.add(menuItem18);

                //---- menuItem19 ----
                menuItem19.setText("\u64a4\u9500");
                menuItem19.addActionListener(e -> withdrawActionPerformed(e));
                menu2.add(menuItem19);
            }
            menuBar1.add(menu2);

            //======== menu9 ========
            {
                menu9.setText("\u56fe\u50cf\u91c7\u96c6");

                //---- radioButtonMenuItem1 ----
                radioButtonMenuItem1.setText("\u7cfb\u7edf\u542f\u52a8/\u5173\u95ed");
                menu9.add(radioButtonMenuItem1);

                //---- radioButtonMenuItem2 ----
                radioButtonMenuItem2.setText("\u56fe\u50cf\u542f\u52a8/\u5173\u95ed");
                menu9.add(radioButtonMenuItem2);

                //---- radioButtonMenuItem3 ----
                radioButtonMenuItem3.setText("\u51bb\u7ed3/\u89e3\u51bb");
                menu9.add(radioButtonMenuItem3);

                //---- menuItem23 ----
                menuItem23.setText("\u6293\u53d6\u56fe\u50cf");
                menu9.add(menuItem23);

                //---- menuItem24 ----
                menuItem24.setText("\u91c7\u96c6\u524d\u56fe\u50cf\u8c03\u8282");
                menu9.add(menuItem24);

                //---- menuItem25 ----
                menuItem25.setText("\u91c7\u96c6\u8bbe\u7f6e");
                menu9.add(menuItem25);

                //---- menuItem26 ----
                menuItem26.setText("\u89c6\u9891\u6e90\u8bbe\u7f6e");
                menu9.add(menuItem26);
            }
            menuBar1.add(menu9);

            //======== menu3 ========
            {
                menu3.setText("\u56fe\u50cf\u5904\u7406(P)");
                menu3.setMnemonic('P');

                //---- menuItem27 ----
                menuItem27.setText("\u56fe\u50cf\u65cb\u8f6c");
                menu3.add(menuItem27);

                //---- menuItem28 ----
                menuItem28.setText("\u56fe\u50cf\u5e73\u6ed1");
                menu3.add(menuItem28);

                //---- menuItem29 ----
                menuItem29.setText("\u4e2d\u503c\u6ee4\u6ce2");
                menu3.add(menuItem29);

                //---- menuItem30 ----
                menuItem30.setText("\u4eae\u5ea6/\u5bf9\u6bd4\u5ea6");
                menu3.add(menuItem30);

                //======== menu10 ========
                {
                    menu10.setText("\u56fe\u50cf\u7f29\u653e");

                    //---- menuItem31 ----
                    menuItem31.setText("\u539f\u59cb\u5927\u5c0f");
                    menu10.add(menuItem31);

                    //---- menuItem32 ----
                    menuItem32.setText("\u653e\u5927");
                    menu10.add(menuItem32);

                    //---- menuItem33 ----
                    menuItem33.setText("\u7f29\u5c0f");
                    menu10.add(menuItem33);

                    //---- menuItem34 ----
                    menuItem34.setText("\u9002\u5e94\u7a97\u53e3\u5927\u5c0f");
                    menu10.add(menuItem34);
                }
                menu3.add(menu10);
            }
            menuBar1.add(menu3);

            //======== menu4 ========
            {
                menu4.setText("\u5206\u6790(A)");
                menu4.setMnemonic('A');

                //---- menuItem35 ----
                menuItem35.setText("\u526a\u5207\u533a\u57df");
                menu4.add(menuItem35);

                //---- menuItem36 ----
                menuItem36.setText("\u8bbe\u7f6e\u533a\u57df");
                menu4.add(menuItem36);

                //---- menuItem37 ----
                menuItem37.setText("\u8bbe\u7f6e\u672c\u5e95");
                menu4.add(menuItem37);

                //---- menuItem38 ----
                menuItem38.setText("\u63d0\u53d6\u6761\u5e26");
                menu4.add(menuItem38);

                //---- menuItem39 ----
                menuItem39.setText("\u9009\u62e9\u7269\u4f53");
                menu4.add(menuItem39);

                //---- menuItem40 ----
                menuItem40.setText("\u6dfb\u52a0\u6761\u5e26");
                menu4.add(menuItem40);

                //---- menuItem41 ----
                menuItem41.setText("\u4fee\u6b63\u6761\u5e26");
                menu4.add(menuItem41);

                //---- menuItem42 ----
                menuItem42.setText("\u8ba1\u7b97");
                menu4.add(menuItem42);

                //---- menuItem43 ----
                menuItem43.setText("\u5168\u90e8\u5220\u9664");
                menu4.add(menuItem43);

                //---- menuItem44 ----
                menuItem44.setText("\u5220\u9664\u8ba1\u7b97\u7ed3\u679c");
                menu4.add(menuItem44);

                //---- menuItem45 ----
                menuItem45.setText("\u53c2\u6570\u5217\u8868");
                menu4.add(menuItem45);

                //---- menuItem46 ----
                menuItem46.setText("\u7279\u5b9a\u6761\u5e26\u53c2\u6570\u663e\u793a");
                menu4.add(menuItem46);
            }
            menuBar1.add(menu4);

            //======== menu5 ========
            {
                menu5.setText("\u663e\u793a(V)");
                menu5.setMnemonic('V');

                //---- checkBoxMenuItem1 ----
                checkBoxMenuItem1.setText("\u5de5\u5177\u680f");
                checkBoxMenuItem1.setSelected(true);
                checkBoxMenuItem1.addItemListener(e -> checkBoxMenuItem1ItemStateChanged(e));
                menu5.add(checkBoxMenuItem1);

                //---- checkBoxMenuItem2 ----
                checkBoxMenuItem2.setText("\u72b6\u6001\u680f");
                checkBoxMenuItem2.addActionListener(e -> checkBoxMenuItem2ActionPerformed(e));
                menu5.add(checkBoxMenuItem2);

                //---- checkBoxMenuItem3 ----
                checkBoxMenuItem3.setText("\u6807\u6ce8\u680f");
                menu5.add(checkBoxMenuItem3);

                //---- checkBoxMenuItem4 ----
                checkBoxMenuItem4.setText("OLE\u6807\u6ce8\u680f");
                menu5.add(checkBoxMenuItem4);

                //---- checkBoxMenuItem5 ----
                checkBoxMenuItem5.setText("\u5206\u6790\u680f");
                checkBoxMenuItem5.setSelected(true);
                checkBoxMenuItem5.addActionListener(e -> checkBoxMenuItem5ActionPerformed(e));
                menu5.add(checkBoxMenuItem5);

                //---- checkBoxMenuItem6 ----
                checkBoxMenuItem6.setText("\u663e\u793a\u5bf9\u8c61\u8fb9\u754c");
                menu5.add(checkBoxMenuItem6);

                //---- checkBoxMenuItem7 ----
                checkBoxMenuItem7.setText("\u663e\u793a\u6807\u6ce8");
                menu5.add(checkBoxMenuItem7);

                //---- checkBoxMenuItem8 ----
                checkBoxMenuItem8.setText("\u663e\u793a\u6cf3\u9053");
                menu5.add(checkBoxMenuItem8);

                //---- checkBoxMenuItem9 ----
                checkBoxMenuItem9.setText("\u663e\u793a\u6761\u5e26");
                menu5.add(checkBoxMenuItem9);

                //---- checkBoxMenuItem10 ----
                checkBoxMenuItem10.setText("\u663e\u793a\u6761\u5e26\u8fb9\u754c");
                menu5.add(checkBoxMenuItem10);

                //---- menuItem56 ----
                menuItem56.setText("\u5237\u65b0\u7a97\u53e3");
                menu5.add(menuItem56);
            }
            menuBar1.add(menu5);

            //======== menu6 ========
            {
                menu6.setText("\u8bbe\u7f6e(S)");
                menu6.setMnemonic('S');

                //---- menuItem57 ----
                menuItem57.setText("\u64cd\u4f5c\u5458\u8bbe\u7f6e");
                menu6.add(menuItem57);
            }
            menuBar1.add(menu6);

            //======== menu7 ========
            {
                menu7.setText("\u5e2e\u52a9(H)");
                menu7.setMnemonic('H');

                //---- menuItem58 ----
                menuItem58.setText("\u5e2e\u52a9\u4e3b\u9898");
                menuItem58.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F1, 0));
                menuItem58.addActionListener(e -> menuItem58ActionPerformed(e));
                menu7.add(menuItem58);

                //---- menuItem59 ----
                menuItem59.setText("\u5173\u4e8e\u51dd\u80f6\u5206\u6790\u7cfb\u7edf");
                menu7.add(menuItem59);
            }
            menuBar1.add(menu7);
        }
        setJMenuBar(menuBar1);

        //======== toolBar1 ========
        {
            toolBar1.setAlignmentY(1.0F);
            toolBar1.setAlignmentX(1.0F);
            toolBar1.setFloatable(false);

            //---- button1 ----
            button1.setIcon(new ImageIcon(getClass().getResource("/\u6587\u4ef6\u6253\u5f00.jpg")));
            button1.addActionListener(e -> button1ActionPerformed(e));
            toolBar1.add(button1);

            //---- button2 ----
            button2.setIcon(new ImageIcon(getClass().getResource("/\u6587\u4ef6\u4fdd\u5b58.jpg")));
            button2.addActionListener(e -> button2ActionPerformed(e));
            toolBar1.add(button2);

            //---- button3 ----
            button3.setIcon(new ImageIcon(getClass().getResource("/\u6587\u4ef6\u6253\u5f00\uff0d\u5173\u95ed\uff0d24x24.jpg")));
            button3.addActionListener(e -> button3ActionPerformed(e));
            toolBar1.add(button3);
            toolBar1.addSeparator();

            //---- button4 ----
            button4.setIcon(new ImageIcon(getClass().getResource("/\u6444\u50cf\u5934-\u5173\u95ed.jpg")));
            button4.addActionListener(e -> button4ActionPerformed(e));
            toolBar1.add(button4);

            //---- button5 ----
            button5.setIcon(new ImageIcon(getClass().getResource("/\u51bb\u7ed3.jpg")));
            button5.addActionListener(e -> button5ActionPerformed(e));
            toolBar1.add(button5);

            //---- button6 ----
            button6.setIcon(new ImageIcon(getClass().getResource("/\u7f51\u7edc\u6293\u53d6.jpg")));
            toolBar1.add(button6);
            toolBar1.addSeparator();

            //---- button7 ----
            button7.setIcon(new ImageIcon(getClass().getResource("/\u526a\u5207.jpg")));
            toolBar1.add(button7);

            //---- button8 ----
            button8.setIcon(new ImageIcon(getClass().getResource("/\u590d\u5236.jpg")));
            toolBar1.add(button8);

            //---- button9 ----
            button9.setIcon(new ImageIcon(getClass().getResource("/\u9ecf\u8d34.jpg")));
            toolBar1.add(button9);
            toolBar1.addSeparator();

            //---- button10 ----
            button10.setIcon(new ImageIcon(getClass().getResource("/\u6253\u5370.jpg")));
            toolBar1.add(button10);

            //---- button11 ----
            button11.setIcon(new ImageIcon(getClass().getResource("/\u6253\u5370\u9884\u89c8.jpg")));
            toolBar1.add(button11);

            //---- button12 ----
            button12.setText("text");
            toolBar1.add(button12);
            toolBar1.addSeparator();

            //---- button13 ----
            button13.setIcon(new ImageIcon(getClass().getResource("/\u653e\u5927.jpg")));
            toolBar1.add(button13);

            //---- button14 ----
            button14.setIcon(new ImageIcon(getClass().getResource("/\u7f29\u5c0f.jpg")));
            toolBar1.add(button14);
            toolBar1.addSeparator();

            //---- button15 ----
            button15.setIcon(new ImageIcon(getClass().getResource("/\u526a\u5207\u533a\u57df.jpg")));
            button15.addActionListener(e -> cutAreaActionPerformed(e));
            toolBar1.add(button15);

            //---- button16 ----
            button16.setIcon(new ImageIcon(getClass().getResource("/\u6846\u9009.jpg")));
            button16.addActionListener(e -> setCutActionPerformed(e));
            toolBar1.add(button16);

            //---- button17 ----
            button17.setIcon(new ImageIcon(getClass().getResource("/\u53c2\u6570\u5217\u8868.jpg")));
            toolBar1.add(button17);

            //---- button18 ----
            button18.setIcon(new ImageIcon(getClass().getResource("/\u63d0\u53d6\u6761\u5e26.jpg")));
            toolBar1.add(button18);

            //---- button19 ----
            button19.setIcon(new ImageIcon(getClass().getResource("/\u6570\u636e\u4fee\u6b63.jpg")));
            toolBar1.add(button19);

            //---- button20 ----
            button20.setIcon(new ImageIcon(getClass().getResource("/icon-\u9f20\u6807\u7bad\u5934-01.jpg")));
            toolBar1.add(button20);
            toolBar1.addSeparator();

            //---- button21 ----
            button21.setIcon(new ImageIcon(getClass().getResource("/\u5c3a\u5b50.jpg")));
            toolBar1.add(button21);

            //---- button22 ----
            button22.setIcon(new ImageIcon(getClass().getResource("/\u5220\u9664\u7ed3\u679c.jpg")));
            toolBar1.add(button22);

            //---- button23 ----
            button23.setIcon(new ImageIcon(getClass().getResource("/\u5168\u90e8\u5220\u9664.jpg")));
            toolBar1.add(button23);

            //---- button24 ----
            button24.setIcon(new ImageIcon(getClass().getResource("/\u53c2\u6570\u5217\u8868.jpg")));
            toolBar1.add(button24);
            toolBar1.addSeparator();

            //---- button25 ----
            button25.setIcon(new ImageIcon(getClass().getResource("/\u5e2e\u52a9.jpg")));
            toolBar1.add(button25);
        }

        //======== panel1 ========
        {
            panel1.setBackground(new Color(204, 204, 204));
            panel1.setBorder(new LineBorder(Color.gray, 3, true));

            //---- label2 ----
            label2.setText(" \u521d\u59cb\u6cf3\u9053\u6570\uff1a");

            //---- comboBox1 ----
            comboBox1.setPrototypeDisplayValue("4");
            comboBox1.setModel(new DefaultComboBoxModel<>(new String[] {
                "1",
                "2",
                "3",
                "4",
                "5",
                "6",
                "7",
                "8"
            }));

            //---- label3 ----
            label3.setText(" \u5206\u6790\u6cf3\u9053\u6570\uff1a");

            //---- label1 ----
            label1.setText(" \u672c \u5e95 \u503c\uff1a");

            //---- label4 ----
            label4.setText("1");

            //---- label5 ----
            label5.setText(" \u5206\u6790\u6761\u5e26\u6570\uff1a");

            //---- label6 ----
            label6.setText("0");

            //---- label7 ----
            label7.setText(" \u653e\u5927\u500d\u6570\uff1a");

            //---- label8 ----
            label8.setText("1.00");

            //---- label9 ----
            label9.setText("x");

            //---- label10 ----
            label10.setText(" \u7070\u5ea6\u503c\uff1a");

            //---- label11 ----
            label11.setText(" \u76f8\u5bf9\u6d53\u5ea6\uff1a");

            //---- label12 ----
            label12.setText("48");

            //---- label13 ----
            label13.setText("18.82");

            //---- label14 ----
            label14.setText("%");

            //======== panel2 ========
            {
                panel2.setBorder(new CompoundBorder(
                    new TitledBorder("\u5206\u5272\u7cbe\u5ea6"),
                    new EmptyBorder(5, 5, 5, 5)));
                panel2.setBackground(new Color(204, 204, 204));

                //---- spinner1 ----
                spinner1.setModel(new SpinnerNumberModel(0, 0, null, 1));

                //---- spinner2 ----
                spinner2.setModel(new SpinnerNumberModel(0, 0, null, 1));

                GroupLayout panel2Layout = new GroupLayout(panel2);
                panel2.setLayout(panel2Layout);
                panel2Layout.setHorizontalGroup(
                    panel2Layout.createParallelGroup()
                        .addGroup(panel2Layout.createSequentialGroup()
                            .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(label16, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(label17, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(panel2Layout.createParallelGroup()
                                .addComponent(spinner1)
                                .addComponent(spinner2))
                            .addContainerGap())
                );
                panel2Layout.setVerticalGroup(
                    panel2Layout.createParallelGroup()
                        .addGroup(panel2Layout.createSequentialGroup()
                            .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label16, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(spinner1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label17, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(spinner2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addContainerGap())
                );
            }

            //======== panel3 ========
            {
                panel3.setBorder(new TitledBorder("\u81ea\u52a8\u63d0\u53d6"));
                panel3.setBackground(new Color(204, 204, 204));

                //---- radioButton1 ----
                radioButton1.setText("DNA");
                radioButton1.setBackground(new Color(204, 204, 204));

                //---- radioButton2 ----
                radioButton2.setText("Protein");
                radioButton2.setBackground(new Color(204, 204, 204));

                GroupLayout panel3Layout = new GroupLayout(panel3);
                panel3.setLayout(panel3Layout);
                panel3Layout.setHorizontalGroup(
                    panel3Layout.createParallelGroup()
                        .addGroup(panel3Layout.createSequentialGroup()
                            .addGroup(panel3Layout.createParallelGroup()
                                .addComponent(radioButton1, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                .addComponent(radioButton2))
                            .addContainerGap(105, Short.MAX_VALUE))
                );
                panel3Layout.setVerticalGroup(
                    panel3Layout.createParallelGroup()
                        .addGroup(panel3Layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(radioButton1)
                            .addGap(2, 2, 2)
                            .addComponent(radioButton2)
                            .addGap(92, 92, 92))
                );
            }

            //======== panel4 ========
            {
                panel4.setBackground(new Color(204, 204, 204));
                panel4.setBorder(new TitledBorder("\u56fe\u50cf\u4fe1\u606f"));

                //---- label15 ----
                label15.setText("\u64cd\u4f5c\u4eba\u5458\uff1a");

                //---- label18 ----
                label18.setText("\u64cd\u4f5c\u65e5\u671f\uff1a");

                GroupLayout panel4Layout = new GroupLayout(panel4);
                panel4.setLayout(panel4Layout);
                panel4Layout.setHorizontalGroup(
                    panel4Layout.createParallelGroup()
                        .addGroup(panel4Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(panel4Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addComponent(datePicker1, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label15, GroupLayout.Alignment.LEADING)
                                .addComponent(label18, GroupLayout.Alignment.LEADING)
                                .addComponent(comboBox2, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE))
                            .addContainerGap(59, Short.MAX_VALUE))
                );
                panel4Layout.setVerticalGroup(
                    panel4Layout.createParallelGroup()
                        .addGroup(panel4Layout.createSequentialGroup()
                            .addComponent(label15)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(comboBox2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(label18)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(datePicker1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                );
            }

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup()
                            .addComponent(label10, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label11, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup()
                            .addComponent(label12, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(label13, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                                .addComponent(label14, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup()
                            .addComponent(label2, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                .addComponent(panel2, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(panel3, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(panel4, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(label3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(label5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(GroupLayout.Alignment.LEADING, panel1Layout.createSequentialGroup()
                                        .addComponent(label7)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(panel1Layout.createParallelGroup()
                                    .addComponent(label4, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label6, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addComponent(label8)
                                        .addGap(0, 0, 0)
                                        .addComponent(label9, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGap(1, 1, 1))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(separator6, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label1)
                        .addGap(75, 75, 75))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(label1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label2)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label3, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label4))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label5, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label6))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label8)
                            .addComponent(label9)
                            .addComponent(label7, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label12)
                            .addComponent(label10))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label13)
                            .addComponent(label14, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label11))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(separator6, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panel2, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(panel3, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
            );
        }

        //======== imagePanel ========
        {
            imagePanel.setBackground(Color.white);
            imagePanel.setBorder(new LineBorder(Color.gray, 3, true));

            //---- piclabel ----
            piclabel.setBackground(new Color(204, 204, 204));
            piclabel.setBorder(null);
            piclabel.addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    piclabelMousePressed(e);
                }
                @Override
                public void mouseReleased(MouseEvent e) {
                    piclabelMouseReleased(e);
                }
            });
            piclabel.addMouseMotionListener(new MouseMotionAdapter() {
                @Override
                public void mouseDragged(MouseEvent e) {
                    piclabelMouseDragged(e);
                }
            });

            GroupLayout imagePanelLayout = new GroupLayout(imagePanel);
            imagePanel.setLayout(imagePanelLayout);
            imagePanelLayout.setHorizontalGroup(
                imagePanelLayout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, imagePanelLayout.createSequentialGroup()
                        .addGap(0, 97, Short.MAX_VALUE)
                        .addComponent(piclabel, GroupLayout.PREFERRED_SIZE, 664, GroupLayout.PREFERRED_SIZE))
            );
            imagePanelLayout.setVerticalGroup(
                imagePanelLayout.createParallelGroup()
                    .addGroup(imagePanelLayout.createSequentialGroup()
                        .addComponent(piclabel, GroupLayout.PREFERRED_SIZE, 485, GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
            );
        }

        //---- label19 ----
        label19.setText("\u5982\u9700\u5e2e\u52a9\uff0c\u8bf7\u6309F1");
        label19.setBackground(new Color(153, 153, 153));
        label19.setBorder(new TitledBorder(""));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(toolBar1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(imagePanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(label19, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addContainerGap())
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addComponent(toolBar1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(imagePanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(label19, GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                    .addGap(12, 12, 12))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JMenuBar menuBar1;
    private JMenu menu1;
    private JMenuItem menuItem1;
    private JMenuItem menuItem2;
    private JMenuItem menuItem3;
    private JMenuItem menuItem4;
    private JMenuItem menuItem5;
    private JMenuItem menuItem6;
    private JMenuItem menuItem7;
    private JMenuItem menuItem8;
    private JMenu menu8;
    private JMenuItem menuItem10;
    private JMenuItem menuItem11;
    private JMenuItem menuItem12;
    private JMenuItem menuItem13;
    private JMenu menu2;
    private JMenuItem menuItem14;
    private JMenuItem menuItem15;
    private JMenuItem menuItem16;
    private JMenuItem menuItem17;
    private JMenuItem menuItem18;
    private JMenuItem menuItem19;
    private JMenu menu9;
    private JRadioButtonMenuItem radioButtonMenuItem1;
    private JRadioButtonMenuItem radioButtonMenuItem2;
    private JRadioButtonMenuItem radioButtonMenuItem3;
    private JMenuItem menuItem23;
    private JMenuItem menuItem24;
    private JMenuItem menuItem25;
    private JMenuItem menuItem26;
    private JMenu menu3;
    private JMenuItem menuItem27;
    private JMenuItem menuItem28;
    private JMenuItem menuItem29;
    private JMenuItem menuItem30;
    private JMenu menu10;
    private JMenuItem menuItem31;
    private JMenuItem menuItem32;
    private JMenuItem menuItem33;
    private JMenuItem menuItem34;
    private JMenu menu4;
    private JMenuItem menuItem35;
    private JMenuItem menuItem36;
    private JMenuItem menuItem37;
    private JMenuItem menuItem38;
    private JMenuItem menuItem39;
    private JMenuItem menuItem40;
    private JMenuItem menuItem41;
    private JMenuItem menuItem42;
    private JMenuItem menuItem43;
    private JMenuItem menuItem44;
    private JMenuItem menuItem45;
    private JMenuItem menuItem46;
    private JMenu menu5;
    private JCheckBoxMenuItem checkBoxMenuItem1;
    private JCheckBoxMenuItem checkBoxMenuItem2;
    private JCheckBoxMenuItem checkBoxMenuItem3;
    private JCheckBoxMenuItem checkBoxMenuItem4;
    private JCheckBoxMenuItem checkBoxMenuItem5;
    private JCheckBoxMenuItem checkBoxMenuItem6;
    private JCheckBoxMenuItem checkBoxMenuItem7;
    private JCheckBoxMenuItem checkBoxMenuItem8;
    private JCheckBoxMenuItem checkBoxMenuItem9;
    private JCheckBoxMenuItem checkBoxMenuItem10;
    private JMenuItem menuItem56;
    private JMenu menu6;
    private JMenuItem menuItem57;
    private JMenu menu7;
    private JMenuItem menuItem58;
    private JMenuItem menuItem59;
    private JToolBar toolBar1;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button10;
    private JButton button11;
    private JButton button12;
    private JButton button13;
    private JButton button14;
    private JButton button15;
    private JButton button16;
    private JButton button17;
    private JButton button18;
    private JButton button19;
    private JButton button20;
    private JButton button21;
    private JButton button22;
    private JButton button23;
    private JButton button24;
    private JButton button25;
    private JPanel panel1;
    private JLabel label2;
    private JComboBox<String> comboBox1;
    private JLabel label3;
    private JLabel label1;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JLabel label7;
    private JLabel label8;
    private JLabel label9;
    private JLabel label10;
    private JLabel label11;
    private JLabel label12;
    private JLabel label13;
    private JLabel label14;
    private JComponent separator6;
    private JPanel panel2;
    private JLabel label16;
    private JLabel label17;
    private JSpinner spinner1;
    private JSpinner spinner2;
    private JPanel panel3;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JPanel panel4;
    private JLabel label15;
    private JComboBox comboBox2;
    private JLabel label18;
    private DatePicker datePicker1;
    private JPanel imagePanel;
    private JLabel piclabel;
    private JLabel label19;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}