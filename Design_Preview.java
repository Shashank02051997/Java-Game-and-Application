import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class Design_Preview extends Applet implements ActionListener
{ Label l1,l2,l3,l4,l5,l6;
  Button b1;
  TextField t1,t2,t3,t4,t5;
  Checkbox c1;
  double q,r,p,d,np;
  String n1,str;
  public void init()
  { setLayout(null);
    l1=new Label("BILLING-SYSTEM");
    l2=new Label("Quantity");
    l3=new Label("Rate/Unit");
    l4=new Label("Payment");
    l5=new Label("Discount");
    l6=new Label("Net Payment");
    b1=new Button("Calculate Bill");
    t1=new TextField();
    t2=new TextField();
    t3=new TextField();
    t4=new TextField();
    t5=new TextField();
    c1=new Checkbox("Regular Customer");
    add(c1);
    add(t1);add(t2);add(t3);add(t4);add(t5);
    add(b1);
    add(l1);add(l2);add(l3);add(l4);add(l5);add(l6);
    t3.setEditable(false);
    t4.setEditable(false);
    t5.setEditable(false);
    b1.addActionListener(this);
    l1.setBounds(230,20,250,30);
    l2.setBounds(30,80,100,20);
    l3.setBounds(30,120,100,20);
    l4.setBounds(30,160,100,20);
    l5.setBounds(30,200,100,20);
    l6.setBounds(30,240,100,20);
    b1.setBounds(340,80,100,30);
    t1.setBounds(150,80,100,20);
    t2.setBounds(150,120,100,20);
    t3.setBounds(150,160,100,20);
    t4.setBounds(150,200,100,20);
    t5.setBounds(150,240,100,20);
    c1.setBounds(340,130,130,20);

  }
  public void actionPerformed(ActionEvent ae)
  { try
    { q=Double.parseDouble(t1.getText());
      r=Double.parseDouble(t2.getText());
      p=q*r;
      if(c1.getState()==true)
      { if(p>=0&&p<400)
        d=p*0.02;
        else if(p>=400&&p<800)
        d=p*0.04;
        else if(p>=800&&p<1500)
        d=p*0.08;
        else if(p>=1500)
        d=p*0.1;
      }
      else
      d=0;
      np=p-d;
      t3.setText(""+p);
      t4.setText(""+d);
      t5.setText(""+np);
    }
    catch(Exception e)
    {}
  }
  public void paint(Graphics g)
  { setSize(500,290);
  }
}

    