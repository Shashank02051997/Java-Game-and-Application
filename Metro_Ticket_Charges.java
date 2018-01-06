import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class Metro_Ticket_Charges extends Applet implements ActionListener
{ Label l1,l2,l3,l4,l5;
  Button b1,b2,b3;
  TextField t1,t2,t3,t4;
  int a,b,c,f;
  String str;
  public void init()
  { setLayout(null);
    l1=new Label("Metro Ticket Charges");
    l2=new Label("No. of passengers aged 18 and above");
    l3=new Label("No. of passengers b/w 5 and 18");
    l4=new Label("No. of passengers below 5");
    l5=new Label("Total Fare");
    b1=new Button("Fare");
    b2=new Button("Clear");
    b3=new Button("Exit");
    t1=new TextField();
    t2=new TextField();
    t3=new TextField();
    t4=new TextField();
    add(t1);add(t2);add(t3);add(t4);
    add(b1);add(b2);add(b3);
    add(l1);add(l2);add(l3);add(l4);add(l5);
    t4.setEditable(false);
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    l1.setBounds(250,20,200,30);
    l2.setBounds(20,80,300,20);
    l3.setBounds(20,120,300,20);
    l4.setBounds(20,160,300,20);
    l5.setBounds(450,80,100,20);
    b1.setBounds(360,80,70,30);
    b2.setBounds(360,120,70,30);
    b3.setBounds(360,160,70,30);
    t1.setBounds(250,80,70,20);
    t2.setBounds(250,120,70,20);
    t3.setBounds(250,160,70,20);
    t4.setBounds(530,80,70,20);
  }
  public void actionPerformed(ActionEvent ae)
  { try
    { str=ae.getActionCommand();
      if(str.equals("Fare"))
      { a=Integer.parseInt(t1.getText());
        b=Integer.parseInt(t2.getText());
        c=Integer.parseInt(t3.getText());
        f=a*15+b*10+c*5;
        t4.setText(""+f);
      }
      else if(str.equals("Clear"))
      { t1.setText("");
        t2.setText("");
        t3.setText("");
        t4.setText("");
      }
      else if(str.equals("Exit"))
      System.exit(0);
    }
    catch(Exception e)
    {}
  }
  public void paint(Graphics g)
  { setSize(650,200);
  }
}

    