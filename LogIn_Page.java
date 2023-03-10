import javax.swing.*;
import java.awt.*;

import java.awt.event.*;

public class LogIn_Page extends JFrame implements ActionListener {
    static JTextField txt1,txt2;
    static JButton bt_submit,bt_user_hp,bt_logout_hp;

    static JLabel lbl_menubar_hp,lbl_bname_hp,lbl_uimg_hp;




   public LogIn_Page(){
        setTitle("TCG_Bank");
        setBounds(50, 60, 1000, 1000);
        getContentPane().setBackground(Color.gray);
        setLayout(null);

        JPanel pnl = new JPanel();
        pnl.setBounds(200, 100, 500, 400);
        pnl.setBackground(Color.white);
        add(pnl);
        pnl.setLayout(null);

        ImageIcon img = new ImageIcon("C:\\Users\\admin\\Pictures\\bankicon70.png");
        JLabel lbl_im = new JLabel(img);
        lbl_im.setBounds(170, 50, 100, 100);
        pnl.add(lbl_im);

        txt1=new JTextField("USERNAME");
        txt1.setBounds(70,180,300,30);
        pnl.add(txt1);

        txt2=new JTextField("PASSWORD");
        txt2.setBounds(70,250,300,30);
        pnl.add(txt2);

        bt_submit=new JButton("LOG IN");
        bt_submit.setBounds(70,300,100,30);
        bt_submit.addActionListener(this);
        pnl.add(bt_submit);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==bt_submit){
            Home_Page hp = new Home_Page();
        }
   }



    public static void main(String[] args) {
       LogIn_Page lp = new LogIn_Page();

    }

}
