//Quiz
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*<applet code="vyon98" width=1000 height=1000>
 </applet>
 */
public class Quiz extends Applet implements ActionListener,ItemListener
{   String msg="",s1="",ans="";
    int c=0,q1,q2,q3,q4,q5,t=0;
    Label l1,l2,l3,l4,l5;
    Checkbox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20;
    CheckboxGroup cbg,cbg1,cbg2,cbg3,cbg4;
    public void init()
    {  setLayout(null);
       Button b1=new Button("Submit");
       add(b1);
       b1.addActionListener(this);
       l1=new Label("What is output of 5*1=?");
       l2=new Label("What is output of 5*2=?");
       l3=new Label("What is output of 5*3=?");
       l4=new Label("What is output of 5*4=?");
       l5=new Label("What is output of 5*5=?");
       cbg=new CheckboxGroup();
       cbg1=new CheckboxGroup();
       cbg2=new CheckboxGroup();
       cbg3=new CheckboxGroup();
       cbg4=new CheckboxGroup();
       c1=new Checkbox("5",false,cbg);
       c2=new Checkbox("10",false,cbg);
       c3=new Checkbox("15",false,cbg);
       c4=new Checkbox("20",false,cbg);
       c5=new Checkbox("10",false,cbg1);
       c6=new Checkbox("5",false,cbg1);
       c7=new Checkbox("15",false,cbg1);
       c8=new Checkbox("20",false,cbg1);
       c9=new Checkbox("15",false,cbg2);
       c10=new Checkbox("5",false,cbg2);
       c11=new Checkbox("15",false,cbg2);
       c12=new Checkbox("20",false,cbg2);
       c13=new Checkbox("20",false,cbg3);
       c14=new Checkbox("5",false,cbg3);
       c15=new Checkbox("15",false,cbg3);
       c16=new Checkbox("20",false,cbg3);
       c17=new Checkbox("25",false,cbg4);
       c18=new Checkbox("10",false,cbg4);
       c19=new Checkbox("15",false,cbg4);
       c20=new Checkbox("20",false,cbg4);
       add(c1);add(c2);add(c3);add(c4);add(c5);add(c6);add(c7);add(c8);add(c9);add(c10);add(c11);add(c12);add(c13);add(c14);add(c15);add(c16);
       add(c17);add(c18);add(c19);add(c20);
       c1.addItemListener(this);
       c2.addItemListener(this);
       c3.addItemListener(this);
       c4.addItemListener(this);
       c5.addItemListener(this);
       c6.addItemListener(this);
       c7.addItemListener(this);
       c8.addItemListener(this);
       c9.addItemListener(this);
       c10.addItemListener(this);
       c11.addItemListener(this);
       c12.addItemListener(this);
       c13.addItemListener(this);
       c14.addItemListener(this);
       c15.addItemListener(this);
       c16.addItemListener(this);
       c17.addItemListener(this);
       c18.addItemListener(this);
       c19.addItemListener(this);
       c20.addItemListener(this);
       b1.setBounds(200,400,80,20);
       c1.setBounds(50,70,100,20);
       c2.setBounds(150,70,100,20);
       c3.setBounds(250,70,100,20);
       c4.setBounds(350,70,100,20);
       c5.setBounds(50,120,100,20);
       c6.setBounds(150,120,100,20);
       c7.setBounds(250,120,100,20);
       c8.setBounds(350,120,100,20);
       c9.setBounds(50,170,100,20);
       c10.setBounds(150,170,100,20);
       c11.setBounds(250,170,100,20);
       c12.setBounds(350,170,100,20);
       c13.setBounds(50,220,100,20);
       c14.setBounds(150,220,100,20);
       c15.setBounds(250,220,100,20);
       c16.setBounds(350,220,100,20);
       c17.setBounds(50,270,100,20);
       c18.setBounds(150,270,100,20);
       c19.setBounds(250,270,100,20);
       c20.setBounds(350,270,100,20);
    }
    public void itemStateChanged(ItemEvent ie)
    {
        repaint();
        c=1;
    }
    public void actionPerformed(ActionEvent ae)
    {
        String s=ae.getActionCommand();
        if(s.equals("Submit"))
        { t = q1 + q2 + q3 + q4 + q5;
        }
        repaint();
    }
    public void paint(Graphics g)
    {   g.drawString(l1.getText(),50,60);
        g.drawString(l2.getText(),50,110);
        g.drawString(l3.getText(),50,160);
        g.drawString(l4.getText(),50,210);
        g.drawString(l5.getText(),50,260);
        g.drawString("Total Score = "+t,550,50);
        if(c==1)
        { if(cbg.getSelectedCheckbox().getLabel()=="5")
          q1=1;
          else
          q1=0;
          if(cbg1.getSelectedCheckbox().getLabel()=="10")
          q2=1;
          else
          q2=0;
          if(cbg2.getSelectedCheckbox().getLabel()=="15")
          q3=1;
          else
          q3=0;
          if(cbg3.getSelectedCheckbox().getLabel()=="20")
          q4=1;
          else
          q4=0;
          if(cbg4.getSelectedCheckbox().getLabel()=="25")
          q5=1;
          else
          q5=0;

        }
        showStatus(" "+q1+""+q2+" "+q3+""+q4+""+q5);
    }
}