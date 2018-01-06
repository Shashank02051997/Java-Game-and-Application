import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class String_Converter extends Applet implements ActionListener
{ Label l1,l2,l3,l4;
  Button b1,b2;
  TextField t1,t2,t3;
  String str;
  public void init()
  { setLayout(null);
    l1=new Label("Conversion of String in Upper and Lower Case");
    l2=new Label("Enter any string in any case(lower or upper or mixed case)");
    l3=new Label("Lower Case");
    l4=new Label("Upper Case");
    b1=new Button("Change the Case");
    b2=new Button("Clear Entries");
    t1=new TextField();
    t2=new TextField();
    t3=new TextField();
    add(t1);add(t2);add(t3);
    add(b1);add(b2);
    add(l1);add(l2);add(l3);add(l4);
    t2.setEditable(false);
    t3.setEditable(false);
    b1.addActionListener(this);
    b2.addActionListener(this);
    l1.setBounds(150,20,400,30);
    l2.setBounds(100,80,400,20);
    l3.setBounds(30,200,100,20);
    l4.setBounds(30,240,100,20);
    b1.setBounds(120,150,120,30);
    b2.setBounds(270,150,120,30);
    t1.setBounds(100,110,300,20);
    t2.setBounds(130,200,300,20);
    t3.setBounds(130,240,300,20);
  }
  public void actionPerformed(ActionEvent ae)
  { try
    { str=ae.getActionCommand();
      if(str.equals("Change the Case"))
      { t2.setText(t1.getText().toLowerCase());
        t3.setText(t1.getText().toUpperCase());
      }
      if(str.equals("Clear Entries"))
      { t1.setText("");
        t2.setText("");
        t3.setText("");
      }
      
    }
    catch(Exception e)
    {}
  }
  public void paint(Graphics g)
  { setSize(500,300);
  }
}

    