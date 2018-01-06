import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class Find_Greatest_Number extends Applet implements ActionListener
{ Label l1,l2,l3,l4,l5;
  Button b1;
  TextField t1,t2,t3,t4;
  int a,b,c;
  public void init()
  { setLayout(null);
    l1=new Label("Greatest Number Among Three Numbers");
    l2=new Label("First Number");
    l3=new Label("Second Number");
    l4=new Label("Third Number");
    l5=new Label("Greatest Number is");
    b1=new Button("Find the Greatest");
    t1=new TextField();
    t2=new TextField();
    t3=new TextField();
    t4=new TextField();
    add(t1);add(t2);add(t3);add(t4);
    add(b1);
    add(l1);add(l2);add(l3);add(l4);add(l5);
    t4.setEditable(false);
    b1.addActionListener(this);
    l1.setBounds(150,20,250,30);
    l2.setBounds(30,80,100,20);
    l3.setBounds(30,130,100,20);
    l4.setBounds(30,180,100,20);
    l5.setBounds(430,100,100,20);
    b1.setBounds(270,130,130,30);
    t1.setBounds(150,80,100,20);
    t2.setBounds(150,130,100,20);
    t3.setBounds(150,180,100,20);
    t4.setBounds(430,130,100,20);
  }
  public void actionPerformed(ActionEvent ae)
  { try
    { a=Integer.parseInt(t1.getText());
      b=Integer.parseInt(t2.getText());
      c=Integer.parseInt(t3.getText());
      if(a>b&&a>c)
      t4.setText(""+a);
      else if(b>a&&b>c)
      t4.setText(""+b);
      else if(c>a&&c>b)
      t4.setText(""+c);
    }
    catch(Exception e)
    {}
  }
  public void paint(Graphics g)
  { setSize(600,250);
  }
}

    