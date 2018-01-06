import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class Day_of_the_Week extends Applet implements ActionListener
{ Label l1,l2,l3,l4,l5;
  Button b1,b2;
  TextField t1,t2,t3,t4;
  int d1;
  String n1,str;
  public void init()
  { setLayout(null);
    l1=new Label("Week Day and its Name");
    l2=new Label("Day of the Week");
    l3=new Label("Name of the Day");
    l4=new Label("Name of the Day");
    l5=new Label("Day of the Week");
    b1=new Button("Find Name");
    b2=new Button("Find Day");
    t1=new TextField();
    t2=new TextField();
    t3=new TextField();
    t4=new TextField();
    add(t1);add(t2);add(t3);add(t4);
    add(b1);add(b2);
    add(l1);add(l2);add(l3);add(l4);add(l5);
    t3.setEditable(false);
    t4.setEditable(false);
    b1.addActionListener(this);
    b2.addActionListener(this);
    l1.setBounds(270,20,250,30);
    l2.setBounds(30,80,100,20);
    l3.setBounds(30,160,100,20);
    l4.setBounds(430,80,100,20);
    l5.setBounds(430,160,100,20);
    b1.setBounds(270,80,130,30);
    b2.setBounds(270,160,130,30);
    t1.setBounds(150,80,100,20);
    t2.setBounds(150,160,100,20);
    t3.setBounds(550,80,100,20);
    t4.setBounds(550,160,100,20);
  }
  public void actionPerformed(ActionEvent ae)
  { try
    { str=ae.getActionCommand();
      if(str.equals("Find Name"))
      { d1=Integer.parseInt(t1.getText());
        if(d1==1)
        t3.setText("Sunday");
        else if(d1==2)
        t3.setText("Monday");
        else if(d1==3)
        t3.setText("Tuesday");
        else if(d1==4)
        t3.setText("Wednesday");
        else if(d1==5)
        t3.setText("Thrusday");
        else if(d1==6)
        t3.setText("Friday");
        else if(d1==7)
        t3.setText("Saturday");
        else
        t3.setText("Wrong Input");
      }
      if(str.equals("Find Day"))
      { n1=t2.getText();
        n1=n1.toLowerCase();
        if(n1.equals("sunday"))
        t4.setText("1");
        else if(n1.equals("monday"))
        t4.setText("2");
        else if(n1.equals("tuesday"))
        t4.setText("3");
        else if(n1.equals("wednesday"))
        t4.setText("4");
        else if(n1.equals("thrusday"))
        t4.setText("5");
        else if(n1.equals("friday"))
        t4.setText("6");
        else if(n1.equals("saturday"))
        t4.setText("7");
        else
        t4.setText("Wrong Input");
      }
    }
    catch(Exception e)
    {}
  }
  public void paint(Graphics g)
  { setSize(700,250);
  }
}

    