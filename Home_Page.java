import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home_Page extends JFrame implements ActionListener {
    static JButton bt_user_hp,bt_logout_hp,bt_acc_dtl,bt_dp_cash,bt_wd_cash,bt_trf_mny,bt_trns_hs;

    static JLabel lbl_menubar_hp,lbl_bname_hp,lbl_uimg_hp,lbl_choose_hp;
    static  JPanel pnl_hp, pnl_hp_1;

    static    JComboBox cb_acc;
    

    public  Home_Page(){
        super("USER");
        setBounds(50, 60, 1000, 900);
        getContentPane().setBackground(Color.darkGray);
        setLayout(null);

        ImageIcon img_hp = new ImageIcon("C:\\Users\\admin\\Pictures\\bankicon1.png");
        lbl_menubar_hp = new JLabel(img_hp);
        lbl_menubar_hp.setBounds(5,5,100,70);
        add(lbl_menubar_hp);

        lbl_bname_hp = new JLabel("Tcg_Bank");
        lbl_bname_hp.setBounds(107,5,100,70);
        lbl_bname_hp.setFont(new Font("Arial",Font.BOLD,20));
        lbl_bname_hp.setForeground(Color.white);
        add(lbl_bname_hp);

        ImageIcon img_usr= new ImageIcon("C:\\Users\\admin\\Pictures\\admin30.png");
        bt_user_hp=new JButton("chang kang chung",img_usr);
        bt_user_hp.setBounds(600,25,150,35);
        bt_user_hp.setBackground(Color.white);
        bt_user_hp.addActionListener(this);
        bt_user_hp.setFocusable(true);
        add(bt_user_hp);

        ImageIcon img_logout= new ImageIcon("C:\\Users\\admin\\Pictures\\logout30.png");
        bt_logout_hp=new JButton("   [LogOut]",img_logout);
        bt_logout_hp.setBounds(800,25,150,35);
        bt_logout_hp.setBackground(Color.white);
      bt_logout_hp.addActionListener(this);
        // bt_logout_hp.setFocusable(true);
      add(bt_logout_hp);

      pnl_hp=new JPanel();
      pnl_hp.setBounds(60,100,850,700);
      pnl_hp.setBackground(Color.gray);
      pnl_hp.setLayout(null);
      add(pnl_hp);

      pnl_hp_1=new JPanel();
      pnl_hp_1.setBounds(30,100,250,280);
      pnl_hp_1.setBackground(Color.white);
      pnl_hp_1.setLayout(new GridLayout(5,1));
      pnl_hp.add(pnl_hp_1);

      String cb[]={"CHOOSE ACCOUNT","100001","100002"};

       cb_acc = new JComboBox(cb);
       cb_acc.setBounds(30,30,200,30);
       cb_acc.setBackground(Color.black);
       cb_acc.setForeground(Color.white);
       pnl_hp.add(cb_acc);



      ImageIcon img_acc = new ImageIcon("C:\\Users\\admin\\Pictures\\details25.png");
      bt_acc_dtl= new JButton("  ACCOUNT DETAILS",img_acc);
      pnl_hp_1.add(bt_acc_dtl);
      bt_acc_dtl.setBackground(Color.white);

      ImageIcon img_dp_cash = new ImageIcon("C:\\Users\\admin\\Pictures\\deposite30.png");
      bt_dp_cash = new JButton("  DEPOSIT CASH",img_dp_cash);
      pnl_hp_1.add(bt_dp_cash);
      bt_dp_cash.setBackground(Color.white);

      ImageIcon img_wd_cash = new ImageIcon("C:\\Users\\admin\\Pictures\\withdraw30.png");
      bt_wd_cash = new JButton("  WITHDRAW CASH",img_wd_cash);
      pnl_hp_1.add(bt_wd_cash);
      bt_wd_cash.setBackground(Color.white);

      ImageIcon img_trf_mny = new ImageIcon("C:\\Users\\admin\\Pictures\\transfer30.png");
      bt_trf_mny = new JButton("  TRANSFER MONEY",img_trf_mny);
      pnl_hp_1.add(bt_trf_mny);
      bt_trf_mny.setBackground(Color.white);

      ImageIcon img_trns_hs = new ImageIcon("C:\\Users\\admin\\Pictures\\history25.png");
      bt_trns_hs = new JButton("  TRANSACTION HISTORY",img_trns_hs);
      pnl_hp_1.add(bt_trns_hs);
      bt_trns_hs.setBackground(Color.white);

      lbl_choose_hp = new JLabel("Please Choose Your Account First.");
      lbl_choose_hp.setBounds(380,90,600,30);
      lbl_choose_hp.setForeground(Color.CYAN);
      pnl_hp.add(lbl_choose_hp);





        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
      if(e.getSource()==bt_user_hp)
      {
          //here call userdetails methods
      }
    }

}
