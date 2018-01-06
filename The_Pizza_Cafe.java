import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class The_Pizza_Cafe extends Applet implements ActionListener
{ Label l1,l2,l3,l4,l5,l6,l7,l8;
  Button b1,b2;
  TextField t1,t2,t3,t4,t5;
  Checkbox c1,c2,c3;
  Checkbox c4,c5;
  String str;
  int q,r,costoftoppings,amt,a,b,c;
  CheckboxGroup cbg;
  public void init()
  { setLayout(null);
    l1=new Label("Cafe Coffee Day");
    l2=new Label("Customer Name");
    l3=new Label("Quantity");
    l4=new Label("Rate");
    l5=new Label("Cost of Toppings");
    l6=new Label("Amount");
    l7=new Label("Pizza Type");
    l8=new Label("Toppings");
    b1=new Button("Calculate Rate");
    b2=new Button("Calculate Amount");
    t1=new TextField();
    t2=new TextField();
    t3=new TextField();
    t4=new TextField();
    t5=new TextField();
    c1=new Checkbox("Cheese");
    c2=new Checkbox("Capsicum");
    c3=new Checkbox("Pepperoni");
    cbg=new CheckboxGroup();
    c4=new Checkbox("Regular",true,cbg);
    c5=new Checkbox("Plain",false,cbg);
    add(c1);add(c2);add(c3);add(c4);add(c5);
    add(t1);add(t2);add(t3);add(t4);add(t5);
    add(b1);add(b2);
    add(l1);add(l2);add(l3);add(l4);add(l5);add(l6);add(l7);add(l8);
    t3.setEditable(false);
    t4.setEditable(false);
    t5.setEditable(false);
    b1.addActionListener(this);
    b2.addActionListener(this);
    l1.setBounds(250,20,200,30);
    l2.setBounds(30,80,100,20);
    l3.setBounds(30,130,100,20);
    l4.setBounds(30,180,100,20);
    l5.setBounds(30,230,100,20);
    l6.setBounds(30,280,100,20);
    l7.setBounds(300,80,100,20);
    l8.setBounds(330,150,100,20);
    b1.setBounds(100,330,130,30);
    b2.setBounds(300,330,130,30);
    t1.setBounds(150,80,100,20);
    t2.setBounds(150,130,100,20);
    t3.setBounds(150,180,100,20);
    t4.setBounds(150,230,100,20);
    t5.setBounds(150,280,100,20);
    c1.setBounds(330,180,120,20);
    c2.setBounds(330,210,120,20);
    c3.setBounds(330,240,120,20);
    c4.setBounds(370,80,100,20);
    c5.setBounds(370,100,100,20);

  }
  public void actionPerformed(ActionEvent ae)
  { try
    { str=ae.getActionCommand();
      if(str.equals("Calculate Rate"))
      { if(c4.getState()==true)
        t3.setText("90 Rs");
        else if(c5.getState()==true)
        t3.setText("120 Rs");
      }
      if(str.equals("Calculate Amount"))
      { a=0;b=0;c=0;
        q=Integer.parseInt(t2.getText());
        if(c4.getState()==true)
        { t3.setText("90 Rs");
          r=90;
        }    
        else if(c5.getState()==true)
        { t3.setText("120 Rs");
          r=120;
        }
        if(c1.getState()==true)
        a=20;
        if(c2.getState()==true)
        b=20;
        if(c3.getState()==true)
        c=20;
        costoftoppings=a+b+c;
        t4.setText(""+costoftoppings);
        amt=q*r+costoftoppings;
        t5.setText(""+amt);
      }
    }
    catch(Exception e)
    {}
  }
  public void paint(Graphics g)
  { setSize(500,400);
  }
}

    