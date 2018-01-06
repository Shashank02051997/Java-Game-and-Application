import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class Calculate_the_purchase_amount extends Applet implements ItemListener
{ Label l1,l2,l3,l4;
  TextField t1;
  Checkbox c1,c2,c3,c4;
  CheckboxGroup cbg1,cbg2;
  public void init()
  { setLayout(null);
    l1=new Label("Calculate The Purchase Amount");
    l2=new Label("Cloth");
    l3=new Label("Cloth Material");
    l4=new Label("Purchase Amount");
    t1=new TextField();
    cbg1=new CheckboxGroup();
    cbg2=new CheckboxGroup();
    c1=new Checkbox("Trouser",false,cbg1);
    c2=new Checkbox("Shirt",false,cbg1);
    c3=new Checkbox("Silk",false,cbg2);
    c4=new Checkbox("Non-Silk",false,cbg2);
    add(c1);add(c2);add(c3);add(c4);
    add(t1);
    add(l1);add(l2);add(l3);add(l4);
    l1.setBounds(200,10,200,30);
    l2.setBounds(100,60,100,20);
    l3.setBounds(350,60,100,20);
    l4.setBounds(100,200,200,20);
    c1.setBounds(100,100,150,20);
    c2.setBounds(100,140,150,20);
    c3.setBounds(350,100,150,20);
    c4.setBounds(350,140,150,20);
    t1.setBounds(220,200,120,20);
    c1.addItemListener(this);
    c2.addItemListener(this);
    c3.addItemListener(this);
    c4.addItemListener(this);
  }
  public void itemStateChanged(ItemEvent ie)
  { try
    { if(c1.getState()==true&&c3.getState()==true)
      t1.setText("1800");
      else if(c1.getState() == true && c4.getState() == true)
      t1.setText("1500");
      else if(c2.getState() == true && c3.getState() == true)
      t1.setText("1200");
      else if(c2.getState() == true && c4.getState() == true)
      t1.setText("1000");
    }
    catch(Exception e)
    {}
  }
  public void paint(Graphics g)
  { setSize(500,250);
  }
}

    