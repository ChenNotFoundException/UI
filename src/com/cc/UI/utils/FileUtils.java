package com.cc.UI.utils;

import com.cc.UI.MainUI;

import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;

public class FileUtils extends JFrame {
  public static String openFile() {
      JFileChooser chooser = new JFileChooser();//java提供的文件选择器

      chooser.setCurrentDirectory(new File("."));//设置当前浏览路径
      FileNameExtensionFilter filter = new FileNameExtensionFilter(
              "图片文件(*.bmp,*.jpg)", "jpg","bmp");
      chooser.setFileFilter(filter);

      int result = chooser.showOpenDialog(null);//弹出文件选择对话框
      if(result==JFileChooser.APPROVE_OPTION){
           return chooser.getSelectedFile().getPath();

      }else
          return "";
  }
}
