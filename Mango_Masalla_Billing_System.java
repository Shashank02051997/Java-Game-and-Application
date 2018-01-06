import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class Mango_Masalla_Billing_System extends Applet implements ActionListener
{ Label l1,l2,l3,l4,l5,l6,l7,l8,l9;
  Button b1,b2;
  TextField t1,t2,t3,t4,t5,t6,t7,t8,t9;
  Checkbox c1;
  Checkbox c2,c3;
  CheckboxGroup cbg;
  double p,d,ch,a,b,c,tm,dis,np;
  String str;
  public void init()
  { setLayout(null);
    l1=new Label("MANGO MASALLA BILLING-SYSTEM");
    l2=new Label("Quantity");
    l3=new Label("Pizza(@60)");
    l4=new Label("Dossa(@50)");
    l5=new Label("Chowmein(@40)");
    l6=new Label("Amount (Rs.)");
    l7=new Label("Total Amount");
    l8=new Label("Discount");
    l9=new Label("Net Payment");
    b1=new Button("Calculate Bill");
    b2=new Button("Clear Entries");
    t1=new TextField();
    t2=new TextField();
    t3=new TextField();
    t4=new TextField();
    t5=new TextField();
    t6=new TextField();
    t7=new TextField();
    t8=new TextField();
    t9=new TextField();
    c1=new Checkbox("Owner");
    cbg=new CheckboxGroup();
    c2=new Checkbox("Regular",true,cbg);
    c3=new Checkbox("Staff",false,cbg);
    add(c1);add(c2);add(c3);
    add(t1);add(t2);add(t3);add(t4);add(t5);add(t6);add(t7);add(t8);add(t9);
    add(b1);add(b2);
    add(l1);add(l2);add(l3);add(l4);add(l5);add(l6);add(l7);add(l8);add(l9);
    t4.setEditable(false);
    t5.setEditable(false);
    t6.setEditable(false);
    t7.setEditable(false);
    t8.setEditable(false);
    t9.setEditable(false);
    b1.addActionListener(this);
    b2.addActionListener(this);
    l1.setBounds(200,10,250,30);
    l2.setBounds(150,50,100,20);
    l3.setBounds(30,80,100,20);
    l4.setBounds(30,120,100,20);
    l5.setBounds(30,160,100,20);
    l6.setBounds(420,50,100,20);
    l7.setBounds(300,200,100,20);
    l8.setBounds(300,240,100,20);
    l9.setBounds(300,280,100,20);
    b1.setBounds(100,340,100,30);
    b2.setBounds(290,340,100,30);
    t1.setBounds(150,80,100,20);
    t2.setBounds(150,120,100,20);
    t3.setBounds(150,160,100,20);
    t4.setBounds(420,80,100,20);
    t5.setBounds(420,120,100,20);
    t6.setBounds(420,160,100,20);
    t7.setBounds(420,200,100,20);
    t8.setBounds(420,240,100,20);
    t9.setBounds(420,280,100,20);
    c1.setBounds(150,200,130,20);
    c2.setBounds(150,240,130,20);
    c3.setBounds(150,280,130,20);
  }
  public void actionPerformed(ActionEvent ae)
  { try
    { str=ae.getActionCommand();
      if(str.equals("Calculate Bill"))
      { p=Double.parseDouble(t1.getText());
        d=Double.parseDouble(t2.getText());
        ch=Double.parseDouble(t3.getText());
        a=p*60;
        b=d*50;
        c=ch*40;
        tm=a+b+c;
        if(c1.getState()==true)
        { t4.setText(""+a);
          t5.setText(""+b);
          t6.setText(""+c);
          t7.setText(""+tm);
          t8.setText(""+tm);
          t9.setText("0");
        }
        else
        { if(c2.getState()==true)
          dis=tm*0.05;
          else if(c3.getState()==true)
          dis=tm*0.07;
          np=tm-dis;
          t4.setText(""+a);
          t5.setText(""+b);
          t6.setText(""+c);
          t7.setText(""+tm);
          t8.setText(""+dis);
          t9.setText(""+np);
        }
      }
      else if(str.equals("Clear Entries"))
      { t1.setText("");
        t2.setText("");
        t3.setText("");
        t4.setText("");
        t5.setText("");
        t6.setText("");
        t7.setText("");
        t8.setText("");
        t9.setText("");
      }
    }
    catch(Exception e)
    {}
  }
  public void paint(Graphics g)
  { setSize(550,400);
  }
}

    