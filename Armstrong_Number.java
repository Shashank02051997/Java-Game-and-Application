import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class Armstrong_Number extends Applet implements ActionListener
{ Label l1,l2;
  Button b1;
  TextField t1,t2;
  int a,q,p,i,r;
  String str,s;
  public void init()
  { setLayout(null);
    l1=new Label("Enter Integer");
    l2=new Label("Armstrong or Not");
    b1=new Button("Check");
    t1=new TextField();
    t2=new TextField();
    add(t1);add(t2);
    add(b1);
    add(l1);add(l2);
    t2.setEditable(false);
    b1.addActionListener(this);
    l1.setBounds(30,50,100,20);
    l2.setBounds(30,90,100,20);
    t1.setBounds(150,50,70,20);
    t2.setBounds(150,90,270,20);
    b1.setBounds(160,140,70,30);
  }
  public void actionPerformed(ActionEvent ae)
  { try
    { a=Integer.parseInt(t1.getText());
      q=a;
      p=0;
      i=t1.getText().length();
      while(a!=0)
      { r=a%10;
        p=p+(int)Math.pow(r,i);
        a=a/10;
      }
      if(p==q)
      t2.setText(""+q+" is a Armstrong Number");
      else if(p!=q)
      t2.setText(""+q+" is not a Armstrong Number");
    }
    catch(Exception e)
    {}
  }
  public void paint(Graphics g)
  { setSize(450,200);
  }
}

    