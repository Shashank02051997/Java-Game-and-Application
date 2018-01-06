import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class Find_Sum_and_Reverse_of_the_Number extends Applet implements ActionListener
{ Label l1,l2,l3,l4;
  Button b1,b2,b3;
  TextField t1,t2,t3;
  int n,s,r,t,t11,n1,s1,r1,t12,t111;
  String str;
  public void init()
  { setLayout(null);
    l1=new Label("Sum and Reverse of the Number");
    l2=new Label("Number");
    l3=new Label("Reverse");
    l4=new Label("Sum of Digits");
    b1=new Button("Reverse");
    b2=new Button("Sum of Digits");
    b3=new Button("Clear");
    t1=new TextField();
    t2=new TextField();
    t3=new TextField();
    add(t1);add(t2);add(t3);
    add(b1);add(b2);add(b3);
    add(l1);add(l2);add(l3);add(l4);
    t2.setEditable(false);
    t3.setEditable(false);
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    l1.setBounds(150,20,250,30);
    l2.setBounds(30,80,100,20);
    l3.setBounds(30,140,100,20);
    l4.setBounds(230,140,100,20);
    b1.setBounds(100,200,100,30);
    b2.setBounds(220,200,100,30);
    b3.setBounds(340,200,100,30);
    t1.setBounds(100,80,100,20);
    t2.setBounds(100,140,100,20);
    t3.setBounds(320,140,100,20);
  }
  public void actionPerformed(ActionEvent ae)
  { try
    { str=ae.getActionCommand();
      if(str.equals("Reverse"))
      { n=Integer.parseInt(t1.getText());
        s=n;
        while(s!=0)
        { t=s%10;
          s=s/10;
          t11=t11*10+t;
        }
        t2.setText(""+t11);
      }
      if(str.equals("Sum of Digits"))
      { n1=Integer.parseInt(t1.getText());
        s1=n1;
        while(s1!=0)
        { t12=s1%10;
          s1=s1/10;
          t111=t111+t12;
        }
        t3.setText(""+t111);
      }
      if(str.equals("Clear"))
      { t1.setText("");
        t2.setText("");
        t3.setText("");
      }
      n=0;
      s=0;
      r=0;
      t=0;
      t11=0;
      n1=0;
      s1=0;
      r1=0;
      t12=0;
      t111=0;
    }
    catch(Exception e)
    {}
  }
  public void paint(Graphics g)
  { setSize(500,250);
  }
}

    