import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class Workers_payment_calculator extends Applet implements ActionListener
{ Label l1,l2,l3,l4,l5,l6,l7;
  Button b1;
  TextField t1,t2,t3,t4,t5;
  int days,wage,ded,pay,netpay;
  public void init()
  { setLayout(null);
    l1=new Label("Worker's Payment Calculator");
    l2=new Label("Days Worked");
    l3=new Label("Wage Rate(Rs.)");
    l4=new Label("Deduction(Rs.)");
    l5=new Label("Payment");
    l6=new Label("Net Payment");
    l7=new Label("");
    b1=new Button("Get Payment");
    t1=new TextField();
    t2=new TextField();
    t3=new TextField();
    t4=new TextField();
    t5=new TextField();
    add(t1);add(t2);add(t3);add(t4);add(t5);
    add(b1);
    add(l1);add(l2);add(l3);add(l4);add(l5);add(l6);add(l7);
    t4.setEditable(false);
    t5.setEditable(false);
    b1.addActionListener(this);
    l1.setBounds(150,20,200,30);
    l2.setBounds(30,80,100,20);
    l3.setBounds(30,130,100,20);
    l4.setBounds(30,180,100,20);
    l5.setBounds(300,130,100,20);
    l6.setBounds(300,180,100,20);
    l7.setBounds(230,230,200,20);
    b1.setBounds(300,80,100,20);
    t1.setBounds(150,80,100,20);
    t2.setBounds(150,130,100,20);
    t3.setBounds(150,180,100,20);
    t4.setBounds(450,130,100,20);
    t5.setBounds(450,180,100,20);
  }
  public void actionPerformed(ActionEvent ae)
  { try
    { days=Integer.parseInt(t1.getText());
      wage=Integer.parseInt(t2.getText());
      ded=Integer.parseInt(t3.getText());
      pay=days*wage;
      netpay=pay-ded;
      if(pay>=ded)
      { l7.setText("");
        t4.setText(""+pay);
        t5.setText(""+netpay);
      }
      else
      { l7.setText("There is recovery of Rs = " + -1*netpay);
        t4.setText("");
        t5.setText("");
      }

    }
    catch(Exception e)
    {}
  }
  public void paint(Graphics g)
  { setSize(600,250);
  }
}

    