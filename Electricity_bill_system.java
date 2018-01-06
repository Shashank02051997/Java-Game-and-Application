import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class Electricity_bill_system extends Applet implements ActionListener
{ Label l1,l2,l3;
  Button b1,b2;
  TextField t1,t2;
  Checkbox c1,c2,c3,c4,c5,c6;
  CheckboxGroup cbg,cbg1;
  String str;
  int u,b;
  public void init()
  { setLayout(null);
    l1=new Label("Electricity Billing System");
    l2=new Label("Unit Consumed");
    l3=new Label("Billing amount");
    b1=new Button("Generate Bill");
    b2=new Button("Exit");
    t1=new TextField();
    t2=new TextField();
    cbg=new CheckboxGroup();
    cbg1=new CheckboxGroup();
    c1=new Checkbox("Up to KW",true,cbg1);
    c2=new Checkbox("Above 10 KW",false,cbg1);
    c3=new Checkbox("Domestic Light",true,cbg);
    c4=new Checkbox("Non-Domestic Light",false,cbg);
    c5=new Checkbox("Agricultural",false,cbg);
    c6=new Checkbox("Industrial Power",false,cbg);
    add(c1);add(c2);add(c3);add(c4);add(c5);add(c6);
    add(t1);add(t2);
    add(b1);add(b2);
    add(l1);add(l2);add(l3);
    t2.setEditable(false);
    b1.addActionListener(this);
    b2.addActionListener(this);
    l1.setBounds(150,30,200,20);
    l2.setBounds(30,80,100,20);
    l3.setBounds(300,250,100,20);
    t1.setBounds(150,80,170,20);
    t2.setBounds(300,280,170,20);
    c1.setBounds(300,140,150,20);
    c2.setBounds(300,180,150,20);
    c3.setBounds(30,140,150,20);
    c4.setBounds(30,180,150,20);
    c5.setBounds(30,220,150,20);
    c6.setBounds(30,260,150,20);
    b1.setBounds(100,330,100,30);
    b2.setBounds(240,330,100,30);
  }
  public void actionPerformed(ActionEvent ae)
  { try
    { str=ae.getActionCommand();
      if(str.equals("Generate Bill"))
      { u=Integer.parseInt(t1.getText());
        if(c1.getState()==true&&c3.getState()==true)
        b=u*5;
        else if(c1.getState() == true && c4.getState() == true)
        b=u*7;
        else if(c1.getState() == true && c5.getState() == true)
        b=u*6;
        else if(c1.getState() == true && c6.getState() == true)
        b=u*15;
        else if(c2.getState() == true && c3.getState() == true)
        b=u*8;
        else if(c2.getState() == true && c4.getState() == true)
        b=u*11;
        else if(c2.getState() == true && c5.getState() == true)
        b=u*10;
        else if(c2.getState() == true && c6.getState() == true)
        b=u*20;

        t2.setText(""+b);
      }
      else if(str.equals("Exit"))
      System.exit(0);
    }
    catch(Exception e)
    {}
  }
  public void paint(Graphics g)
  { setSize(500,400);
  }
}

    