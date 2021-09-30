/*
 * Created by JFormDesigner on Mon Dec 30 09:09:23 IRST 2019
 */

package com.company.view;

import com.company.controller.LoginController;

import java.awt.*;
import java.awt.event.*;
import javax.security.auth.login.LoginException;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author sara
 */
public class LoginWindow extends JFrame {
    public LoginWindow()  {
        initComponents();
        setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    private void button1MouseClicked(MouseEvent e) {
        // TODO add your code here
      //  LoginController l1=new LoginController();
        int state = 0;
        try {
            LoginController.getInstance().navigator(usernamefield.getText(),passwordfield.getText());
        } catch (LoginException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", 0);
            state++;
        } catch (Exception e1) {
            e1.printStackTrace();
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        usernamefield = new JTextField();
        passwordfield = new JPasswordField();
        label2 = new JLabel();
        label3 = new JLabel();
        button1 = new JButton();

        //======== this ========
        Container contentPane = getContentPane();

        //---- label2 ----
        label2.setText("username");

        //---- label3 ----
        label3.setText("password");

        //---- button1 ----
        button1.setText("login");
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button1MouseClicked(e);
            }
        });

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(124, 124, 124)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(passwordfield, GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                                .addComponent(usernamefield, GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE))
                            .addGap(18, 18, 18)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(label2)
                                .addComponent(label3)))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(145, 145, 145)
                            .addComponent(button1)))
                    .addContainerGap(119, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(78, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(usernamefield, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label2, GroupLayout.Alignment.TRAILING))
                    .addGap(12, 12, 12)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(passwordfield, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label3))
                    .addGap(27, 27, 27)
                    .addComponent(button1)
                    .addGap(70, 70, 70))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JTextField usernamefield;
    private JPasswordField passwordfield;
    private JLabel label2;
    private JLabel label3;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
