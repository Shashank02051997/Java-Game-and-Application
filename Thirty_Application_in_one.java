//30 Application in one
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code="Thirty_Application_in_one" width=500 height=500>
 </applet>*/
class MyFrame1 extends Frame implements WindowListener,ActionListener
{ double weight,height,BMI;
  String means;
  TextField t1,t2,t3,t4;
  MyFrame1()
  { addWindowListener(this);
    setLayout(null);
    Label l1=new Label("Body Mass Index Calculator");
    Label l2=new Label("Your Weight (kg) : ");
    Label l3=new Label("Your Height (m) : ");
    Label l4=new Label("Your BMI : ");
    Label l5=new Label("This Means : ");
    t1=new TextField();
    t2=new TextField();
    t3=new TextField();
    t4=new TextField();
    Button b1=new Button("Calculate BMI");
    Button b2=new Button("Reset");
    add(l1);add(l2);add(l3);add(l4);add(l5);
    add(t1);add(t2);add(t3);add(t4);
    add(b1);add(b2);
    l1.setBounds(150,50,200,30);
    l2.setBounds(50,100,150,20);
    l3.setBounds(50,150,150,20);
    l4.setBounds(50,200,150,20);
    l5.setBounds(50,250,150,20);
    t1.setBounds(210,100,200,20);
    t2.setBounds(210,150,200,20);
    t3.setBounds(210,200,200,20);
    t4.setBounds(210,250,200,20);
    t3.setEditable(false);
    t4.setEditable(false);
    b1.setBounds(100,330,100,30);
    b2.setBounds(250,330,100,30);
    b1.addActionListener(this);
    b2.addActionListener(this);
  }
  public void actionPerformed(ActionEvent ae)
  { String S=ae.getActionCommand();
    if(S.equals("Calculate BMI"))
    { weight=Double.parseDouble(t1.getText());
      height=Double.parseDouble(t2.getText());
      BMI=weight/(height*height);
      if(BMI<16)
      means="That you have Severe Thinness";
      else if(BMI>=16&&BMI<17)
      means="That you have Moderate Thinness";
      else if(BMI>=17&&BMI<18.5)
      means="That you have Mild Thinness";
      else if(BMI>=18.5&&BMI<25)
      means="That you have Normal";
      else if(BMI>=25&&BMI<30)
      means="That you have Overweight";
      else if(BMI>=30)
      means="That you have Obese Class I";
      t3.setText(""+BMI);
      t4.setText(""+means);
    }
    else
    { t1.setText("");
      t2.setText("");
      t3.setText("");
      t4.setText("");
    }
    repaint();
  }
  public void windowClosing(WindowEvent we)
  { setVisible(false);
  }
  public void windowActivated(WindowEvent we)
  {}
  public void windowDeactivated(WindowEvent we)
  {}
  public void windowOpened(WindowEvent we)
  {}
  public void windowClosed(WindowEvent we)
  {}
  public void windowIconified(WindowEvent we)
  {}
  public void windowDeiconified(WindowEvent we)
  {}
  public void paint(Graphics g)
  { setSize(450,450);
    setTitle("Body Mass Index Calculator");
  }
}
class MyFrame2 extends Frame implements WindowListener,ActionListener
{ double adjacent,opposite,hypotenuse;
  TextField t1,t2,t3;
  MyFrame2()
  { addWindowListener(this);
    setLayout(null);
    Label l1=new Label("Pythagoras Theorem Calculator");
    Label l2=new Label("Adjacent : ");
    Label l3=new Label("Opposite : ");
    Label l4=new Label("Hypotenuse : ");
    t1=new TextField();
    t2=new TextField();
    t3=new TextField();
    Button b1=new Button("Calculate");
    Button b2=new Button("Reset");
    add(l1);add(l2);add(l3);add(l4);
    add(t1);add(t2);add(t3);
    add(b1);add(b2);
    l1.setBounds(150,50,200,30);
    l2.setBounds(50,100,150,20);
    l3.setBounds(50,150,150,20);
    l4.setBounds(50,200,150,20);
    t1.setBounds(210,100,200,20);
    t2.setBounds(210,150,200,20);
    t3.setBounds(210,200,200,20);
    t3.setEditable(false);
    b1.setBounds(100,330,100,30);
    b2.setBounds(250,330,100,30);
    b1.addActionListener(this);
    b2.addActionListener(this);
  }
  public void actionPerformed(ActionEvent ae)
  { String S=ae.getActionCommand();
    if(S.equals("Calculate"))
    { adjacent=Double.parseDouble(t1.getText());
      opposite=Double.parseDouble(t2.getText());
      hypotenuse=Math.sqrt(adjacent*adjacent+opposite*opposite);
      t3.setText(""+hypotenuse);
    }
    else
    { t1.setText("");
      t2.setText("");
      t3.setText("");
    }
    repaint();
  }
  public void windowClosing(WindowEvent we)
  { setVisible(false);
  }
  public void windowActivated(WindowEvent we)
  {}
  public void windowDeactivated(WindowEvent we)
  {}
  public void windowOpened(WindowEvent we)
  {}
  public void windowClosed(WindowEvent we)
  {}
  public void windowIconified(WindowEvent we)
  {}
  public void windowDeiconified(WindowEvent we)
  {}
  public void paint(Graphics g)
  { setSize(450,450);
    setTitle("Pythagoras Theorem Calculator");
  }
}
class MyFrame3 extends Frame implements WindowListener,ActionListener
{ double sine,opposite,hypotenuse;
  TextField t1,t2,t3;
  MyFrame3()
  { addWindowListener(this);
    setLayout(null);
    Label l1=new Label("Sine Calculator");
    Label l2=new Label("Opposite Angle : ");
    Label l3=new Label("Hypotenuse Angle : ");
    Label l4=new Label("Sine Angle : ");
    t1=new TextField();
    t2=new TextField();
    t3=new TextField();
    Button b1=new Button("Calculate");
    Button b2=new Button("Reset");
    add(l1);add(l2);add(l3);add(l4);
    add(t1);add(t2);add(t3);
    add(b1);add(b2);
    l1.setBounds(150,50,200,30);
    l2.setBounds(50,100,150,20);
    l3.setBounds(50,150,150,20);
    l4.setBounds(50,200,150,20);
    t1.setBounds(210,100,200,20);
    t2.setBounds(210,150,200,20);
    t3.setBounds(210,200,200,20);
    t3.setEditable(false);
    b1.setBounds(100,330,100,30);
    b2.setBounds(250,330,100,30);
    b1.addActionListener(this);
    b2.addActionListener(this);
  }
  public void actionPerformed(ActionEvent ae)
  { String S=ae.getActionCommand();
    if(S.equals("Calculate"))
    { opposite=Double.parseDouble(t1.getText());
      hypotenuse=Double.parseDouble(t2.getText());
      sine=Math.sin(opposite/hypotenuse);
      t3.setText(""+sine);
    }
    else
    { t1.setText("");
      t2.setText("");
      t3.setText("");
    }
    repaint();
  }
  public void windowClosing(WindowEvent we)
  { setVisible(false);
  }
  public void windowActivated(WindowEvent we)
  {}
  public void windowDeactivated(WindowEvent we)
  {}
  public void windowOpened(WindowEvent we)
  {}
  public void windowClosed(WindowEvent we)
  {}
  public void windowIconified(WindowEvent we)
  {}
  public void windowDeiconified(WindowEvent we)
  {}
  public void paint(Graphics g)
  { setSize(450,450);
    setTitle("Sine Calculator");
  }
}
class MyFrame4 extends Frame implements WindowListener,ActionListener
{ double cosine,opposite,hypotenuse;
  TextField t1,t2,t3;
  MyFrame4()
  { addWindowListener(this);
    setLayout(null);
    Label l1=new Label("Cosine Calculator");
    Label l2=new Label("Opposite Angle : ");
    Label l3=new Label("Hypotenuse Angle : ");
    Label l4=new Label("Cosine Angle : ");
    t1=new TextField();
    t2=new TextField();
    t3=new TextField();
    Button b1=new Button("Calculate");
    Button b2=new Button("Reset");
    add(l1);add(l2);add(l3);add(l4);
    add(t1);add(t2);add(t3);
    add(b1);add(b2);
    l1.setBounds(150,50,200,30);
    l2.setBounds(50,100,150,20);
    l3.setBounds(50,150,150,20);
    l4.setBounds(50,200,150,20);
    t1.setBounds(210,100,200,20);
    t2.setBounds(210,150,200,20);
    t3.setBounds(210,200,200,20);
    t3.setEditable(false);
    b1.setBounds(100,330,100,30);
    b2.setBounds(250,330,100,30);
    b1.addActionListener(this);
    b2.addActionListener(this);
  }
  public void actionPerformed(ActionEvent ae)
  { String S=ae.getActionCommand();
    if(S.equals("Calculate"))
    { opposite=Double.parseDouble(t1.getText());
      hypotenuse=Double.parseDouble(t2.getText());
      cosine=Math.cos(opposite/hypotenuse);
      t3.setText(""+cosine);
      }
    else
    { t1.setText("");
      t2.setText("");
      t3.setText("");
    }
    repaint();
  }
  public void windowClosing(WindowEvent we)
  { setVisible(false);
  }
  public void windowActivated(WindowEvent we)
  {}
  public void windowDeactivated(WindowEvent we)
  {}
  public void windowOpened(WindowEvent we)
  {}
  public void windowClosed(WindowEvent we)
  {}
  public void windowIconified(WindowEvent we)
  {}
  public void windowDeiconified(WindowEvent we)
  {}
  public void paint(Graphics g)
  { setSize(450,450);
    setTitle("Cosine Calculator");
  }
}
class MyFrame5 extends Frame implements WindowListener,ActionListener
{ double tangent,opposite,hypotenuse;
  TextField t1,t2,t3;
  MyFrame5()
  { addWindowListener(this);
    setLayout(null);
    Label l1=new Label("Tan Angle Calculator");
    Label l2=new Label("Opposite Angle : ");
    Label l3=new Label("Hypotenuse Angle : ");
    Label l4=new Label("Tangent Angle : ");
    t1=new TextField();
    t2=new TextField();
    t3=new TextField();
    Button b1=new Button("Calculate");
    Button b2=new Button("Reset");
    add(l1);add(l2);add(l3);add(l4);
    add(t1);add(t2);add(t3);
    add(b1);add(b2);
    l1.setBounds(150,50,200,30);
    l2.setBounds(50,100,150,20);
    l3.setBounds(50,150,150,20);
    l4.setBounds(50,200,150,20);
    t1.setBounds(210,100,200,20);
    t2.setBounds(210,150,200,20);
    t3.setBounds(210,200,200,20);
    t3.setEditable(false);
    b1.setBounds(100,330,100,30);
    b2.setBounds(250,330,100,30);
    b1.addActionListener(this);
    b2.addActionListener(this);
  }
  public void actionPerformed(ActionEvent ae)
  { String S=ae.getActionCommand();
    if(S.equals("Calculate"))
    { opposite=Double.parseDouble(t1.getText());
      hypotenuse=Double.parseDouble(t2.getText());
      tangent=Math.tan(opposite/hypotenuse);
      t3.setText(""+tangent);
      }
    else
    { t1.setText("");
      t2.setText("");
      t3.setText("");
    }
    repaint();
  }
  public void windowClosing(WindowEvent we)
  { setVisible(false);
  }
  public void windowActivated(WindowEvent we)
  {}
  public void windowDeactivated(WindowEvent we)
  {}
  public void windowOpened(WindowEvent we)
  {}
  public void windowClosed(WindowEvent we)
  {}
  public void windowIconified(WindowEvent we)
  {}
  public void windowDeiconified(WindowEvent we)
  {}
  public void paint(Graphics g)
  { setSize(450,450);
    setTitle("Tan Angle Calculator");
  }
}
class MyFrame6 extends Frame implements WindowListener,ActionListener
{ double a,b,c,d,x1,x2;
  TextField t1,t2,t3,t4,t5,t6,t7;
  String m;
  MyFrame6()
  { addWindowListener(this);
    setLayout(null);
    Label l1=new Label("Quadratic Formula Calculator");
    Label l2=new Label("Enter A : ");
    Label l3=new Label("Enter B : ");
    Label l4=new Label("Enter C : ");
    Label l5=new Label("Discriminant : ");
    Label l6=new Label("The value of X1 : ");
    Label l7=new Label("The value of X2 : ");
    Label l8=new Label("This Means : ");
    t1=new TextField();
    t2=new TextField();
    t3=new TextField();
    t4=new TextField();
    t5=new TextField();
    t6=new TextField();
    t7=new TextField();
    Button b1=new Button("Calculate");
    Button b2=new Button("Reset");
    add(l1);add(l2);add(l3);add(l4);add(l5);add(l6);add(l7);add(l8);
    add(t1);add(t2);add(t3);add(t4);add(t5);add(t6);add(t7);
    add(b1);add(b2);
    l1.setBounds(150,50,200,30);
    l2.setBounds(50,100,150,20);
    l3.setBounds(50,150,150,20);
    l4.setBounds(50,200,150,20);
    l5.setBounds(50,250,150,20);
    l6.setBounds(50,300,150,20);
    l7.setBounds(50,350,150,20);
    l8.setBounds(50,400,150,20);
    t1.setBounds(210,100,200,20);
    t2.setBounds(210,150,200,20);
    t3.setBounds(210,200,200,20);
    t4.setBounds(210,250,200,20);
    t5.setBounds(210,300,200,20);
    t6.setBounds(210,350,200,20);
    t7.setBounds(210,400,200,20);
    t4.setEditable(false);t5.setEditable(false);t6.setEditable(false);t7.setEditable(false);
    b1.setBounds(100,480,100,30);
    b2.setBounds(250,480,100,30);
    b1.addActionListener(this);
    b2.addActionListener(this);
  }
  public void actionPerformed(ActionEvent ae)
  { String S=ae.getActionCommand();
    if(S.equals("Calculate"))
    { a=Double.parseDouble(t1.getText());
      b=Double.parseDouble(t2.getText());
      c=Double.parseDouble(t3.getText());
      d=b*b-4*a*c;
      if(d==0)
      { x1=(-b+Math.sqrt(d))/(2*a);
        x2=(-b-Math.sqrt(d))/(2*a);
        m="Equal roots";
      }
      else if(d>0)
      { x1=(-b+Math.sqrt(d))/(2*a);
        x2=(-b-Math.sqrt(d))/(2*a);
        m="Unequal roots";
      }
      else if(d<0)
      m="Imaginary roots";
      t4.setText(""+d);
      t5.setText(""+x1);
      t6.setText(""+x2);
      t7.setText(""+m);
      }
    else
    { t1.setText("");
      t2.setText("");
      t3.setText("");
      t4.setText("");
      t5.setText("");
      t6.setText("");
      t7.setText("");
    }
    repaint();
  }
  public void windowClosing(WindowEvent we)
  { setVisible(false);
  }
  public void windowActivated(WindowEvent we)
  {}
  public void windowDeactivated(WindowEvent we)
  {}
  public void windowOpened(WindowEvent we)
  {}
  public void windowClosed(WindowEvent we)
  {}
  public void windowIconified(WindowEvent we)
  {}
  public void windowDeiconified(WindowEvent we)
  {}
  public void paint(Graphics g)
  { setSize(450,550);
    setTitle("Qudratic Formula Calculator");
  }
}
class MyFrame7 extends Frame implements WindowListener,ActionListener
{ int n,i,a;
  String p,txt;
  TextField t1;
  TextArea t;
  MyFrame7()
  { addWindowListener(this);
    setLayout(null);
    Label l1=new Label("Prime Number Calculator");
    Label l2=new Label("Enter a number : ");
    Label l3=new Label("Result : ");
    t1=new TextField();
    t=new TextArea();
    Button b1=new Button("Calculate");
    Button b2=new Button("Reset");
    add(l1);add(l2);add(l3);
    add(t1);add(t);
    add(b1);add(b2);
    l1.setBounds(150,50,200,30);
    l2.setBounds(50,100,150,20);
    l3.setBounds(50,150,150,20);
    t1.setBounds(210,100,200,20);
    t.setBounds(210,150,200,200);
    b1.setBounds(100,380,100,30);
    b2.setBounds(250,380,100,30);
    b1.addActionListener(this);
    b2.addActionListener(this);
  }
  public void actionPerformed(ActionEvent ae)
  { String S=ae.getActionCommand();
    if(S.equals("Calculate"))
    { n=Integer.parseInt(t1.getText());
      txt="";
      for(i=1;i<=n;i++)
      { if(n%i==0)
        { a++;
          txt=txt+"Divisible by "+i+"\n";
        }
      }
      if(a==2)
      p=""+n+" is Prime number";
      else
      p=""+n+" is not a Prime number";
      t.setText(""+p+"\n\n"+txt);
    }
    else
    { t1.setText("");
      t.setText(""); 
    }
    repaint();
  }
  public void windowClosing(WindowEvent we)
  { setVisible(false);
  }
  public void windowActivated(WindowEvent we)
  {}
  public void windowDeactivated(WindowEvent we)
  {}
  public void windowOpened(WindowEvent we)
  {}
  public void windowClosed(WindowEvent we)
  {}
  public void windowIconified(WindowEvent we)
  {}
  public void windowDeiconified(WindowEvent we)
  {}
  public void paint(Graphics g)
  { setSize(450,450);
    setTitle("Prime Number Calculator");
  }
}
class MyFrame8 extends Frame implements WindowListener,ActionListener
{ double first,common,nth,gp;
  TextField t1,t2,t3,t4;
  MyFrame8()
  { addWindowListener(this);
    setLayout(null);
    Label l1=new Label("Geometric Progression Calculator");
    Label l2=new Label("Enter first term : ");
    Label l3=new Label("Enter common difference : ");
    Label l4=new Label("Enter nth term : ");
    Label l5=new Label("Geometric Progression : ");
    t1=new TextField();
    t2=new TextField();
    t3=new TextField();
    t4=new TextField();
    Button b1=new Button("Calculate");
    Button b2=new Button("Reset");
    add(l1);add(l2);add(l3);add(l4);add(l5);
    add(t1);add(t2);add(t3);add(t4);
    add(b1);add(b2);
    l1.setBounds(150,50,200,30);
    l2.setBounds(50,100,150,20);
    l3.setBounds(50,150,150,20);
    l4.setBounds(50,200,150,20);
    l5.setBounds(50,250,150,20);
    t1.setBounds(210,100,200,20);
    t2.setBounds(210,150,200,20);
    t3.setBounds(210,200,200,20);
    t4.setBounds(210,250,200,20);
    t4.setEditable(false);
    b1.setBounds(100,330,100,30);
    b2.setBounds(250,330,100,30);
    b1.addActionListener(this);
    b2.addActionListener(this);
  }
  public void actionPerformed(ActionEvent ae)
  { String S=ae.getActionCommand();
    if(S.equals("Calculate"))
    { first=Double.parseDouble(t1.getText());
      common=Double.parseDouble(t2.getText());
      nth=Double.parseDouble(t3.getText());
      gp=first*Math.pow(common,nth-1);
      t4.setText(""+gp);
    }
    else
    { t1.setText("");
      t2.setText("");
      t3.setText("");
      t4.setText("");
    }
    repaint();
  }
  public void windowClosing(WindowEvent we)
  { setVisible(false);
  }
  public void windowActivated(WindowEvent we)
  {}
  public void windowDeactivated(WindowEvent we)
  {}
  public void windowOpened(WindowEvent we)
  {}
  public void windowClosed(WindowEvent we)
  {}
  public void windowIconified(WindowEvent we)
  {}
  public void windowDeiconified(WindowEvent we)
  {}
  public void paint(Graphics g)
  { setSize(450,450);
    setTitle("Geometric Progression Calculator");
  }
}
class MyFrame9 extends Frame implements WindowListener,ActionListener
{ double nth,c;
  TextField t1,t2;
  MyFrame9()
  { addWindowListener(this);
    setLayout(null);
    Label l1=new Label("Sum of Consecutive Square Calculator");
    Label l2=new Label("Enter the Nth term : ");
    Label l3=new Label("Sum of consecutive square : ");
    t1=new TextField();
    t2=new TextField();
    Button b1=new Button("Calculate");
    Button b2=new Button("Reset");
    add(l1);add(l2);add(l3);
    add(t1);add(t2);
    add(b1);add(b2);
    l1.setBounds(150,50,200,30);
    l2.setBounds(50,100,150,20);
    l3.setBounds(50,150,150,20);
    t1.setBounds(210,100,200,20);
    t2.setBounds(210,150,200,20);
    t2.setEditable(false);
    b1.setBounds(100,330,100,30);
    b2.setBounds(250,330,100,30);
    b1.addActionListener(this);
    b2.addActionListener(this);
  }
  public void actionPerformed(ActionEvent ae)
  { String S=ae.getActionCommand();
    if(S.equals("Calculate"))
    { nth=Double.parseDouble(t1.getText());
      c=((nth*(nth+1)*(2*nth+1))/6);
      t2.setText(""+c);
    }
    else
    { t1.setText("");
      t2.setText("");
    }
    repaint();
  }
  public void windowClosing(WindowEvent we)
  { setVisible(false);
  }
  public void windowActivated(WindowEvent we)
  {}
  public void windowDeactivated(WindowEvent we)
  {}
  public void windowOpened(WindowEvent we)
  {}
  public void windowClosed(WindowEvent we)
  {}
  public void windowIconified(WindowEvent we)
  {}
  public void windowDeiconified(WindowEvent we)
  {}
  public void paint(Graphics g)
  { setSize(450,450);
    setTitle("Sum of Consecutive Square");
  }
}
class MyFrame10 extends Frame implements WindowListener,ActionListener
{ double nth,cb;
  TextField t1,t2;
  MyFrame10()
  { addWindowListener(this);
    setLayout(null);
    Label l1=new Label("Sum of Consecutive Cubes Calculator");
    Label l2=new Label("Enter the Nth term : ");
    Label l3=new Label("Sum of consecutive cubes : ");
    t1=new TextField();
    t2=new TextField();
    Button b1=new Button("Calculate");
    Button b2=new Button("Reset");
    add(l1);add(l2);add(l3);
    add(t1);add(t2);
    add(b1);add(b2);
    l1.setBounds(150,50,200,30);
    l2.setBounds(50,100,150,20);
    l3.setBounds(50,150,150,20);
    t1.setBounds(210,100,200,20);
    t2.setBounds(210,150,200,20);
    t2.setEditable(false);
    b1.setBounds(100,330,100,30);
    b2.setBounds(250,330,100,30);
    b1.addActionListener(this);
    b2.addActionListener(this);
  }
  public void actionPerformed(ActionEvent ae)
  { String S=ae.getActionCommand();
    if(S.equals("Calculate"))
    { nth=Double.parseDouble(t1.getText());
      cb=((nth*nth*(nth+1)*(nth+1))/4);
      t2.setText(""+cb);
    }
    else
    { t1.setText("");
      t2.setText("");
    }
    repaint();
  }
  public void windowClosing(WindowEvent we)
  { setVisible(false);
  }
  public void windowActivated(WindowEvent we)
  {}
  public void windowDeactivated(WindowEvent we)
  {}
  public void windowOpened(WindowEvent we)
  {}
  public void windowClosed(WindowEvent we)
  {}
  public void windowIconified(WindowEvent we)
  {}
  public void windowDeiconified(WindowEvent we)
  {}
  public void paint(Graphics g)
  { setSize(450,450);
    setTitle("Sum of Consecutive Cubes");
  }
}
class MyFrame11 extends Frame implements WindowListener,ActionListener
{ double first,common,nth,gp;
  TextField t1,t2,t3,t4;
  MyFrame11()
  { addWindowListener(this);
    setLayout(null);
    Label l1=new Label("Geometric Progression Calculator");
    Label l2=new Label("Enter first term : ");
    Label l3=new Label("Enter common difference : ");
    Label l4=new Label("Enter nth term : ");
    Label l5=new Label("Geometric Progression : ");
    t1=new TextField();
    t2=new TextField();
    t3=new TextField();
    t4=new TextField();
    Button b1=new Button("Calculate");
    Button b2=new Button("Reset");
    add(l1);add(l2);add(l3);add(l4);add(l5);
    add(t1);add(t2);add(t3);add(t4);
    add(b1);add(b2);
    l1.setBounds(150,50,200,30);
    l2.setBounds(50,100,150,20);
    l3.setBounds(50,150,150,20);
    l4.setBounds(50,200,150,20);
    l5.setBounds(50,250,150,20);
    t1.setBounds(210,100,200,20);
    t2.setBounds(210,150,200,20);
    t3.setBounds(210,200,200,20);
    t4.setBounds(210,250,200,20);
    t4.setEditable(false);
    b1.setBounds(100,330,100,30);
    b2.setBounds(250,330,100,30);
    b1.addActionListener(this);
    b2.addActionListener(this);
  }
  public void actionPerformed(ActionEvent ae)
  { String S=ae.getActionCommand();
    if(S.equals("Calculate"))
    { first=Double.parseDouble(t1.getText());
      common=Double.parseDouble(t2.getText());
      nth=Double.parseDouble(t3.getText());
      gp=first*Math.pow(common,nth-1);
      t4.setText(""+gp);
      }
    else
    { t1.setText("");
      t2.setText("");
      t3.setText("");
      t4.setText("");
    }
    repaint();
  }
  public void windowClosing(WindowEvent we)
  { setVisible(false);
  }
  public void windowActivated(WindowEvent we)
  {}
  public void windowDeactivated(WindowEvent we)
  {}
  public void windowOpened(WindowEvent we)
  {}
  public void windowClosed(WindowEvent we)
  {}
  public void windowIconified(WindowEvent we)
  {}
  public void windowDeiconified(WindowEvent we)
  {}
  public void paint(Graphics g)
  { setSize(450,450);
    setTitle("Complex Number Calculator");
  }
}
class MyFrame12 extends Frame implements WindowListener,ActionListener
{ double a,d,n,s,ap;
  TextField t1,t2,t3,t4,t5;
  MyFrame12()
  { addWindowListener(this);
    setLayout(null);
    Label l1=new Label("Arithmetic Progression Calculator");
    Label l2=new Label("Enter first term : ");
    Label l3=new Label("Enter common difference : ");
    Label l4=new Label("Enter nth term : ");
    Label l5=new Label("Arithmetic Progression : ");
    Label l6=new Label("Sum of first n terms : ");
    t1=new TextField();
    t2=new TextField();
    t3=new TextField();
    t4=new TextField();
    t5=new TextField();
    Button b1=new Button("Calculate");
    Button b2=new Button("Reset");
    add(l1);add(l2);add(l3);add(l4);add(l5);add(l6);
    add(t1);add(t2);add(t3);add(t4);add(t5);
    add(b1);add(b2);
    l1.setBounds(150,50,200,30);
    l2.setBounds(50,100,150,20);
    l3.setBounds(50,150,150,20);
    l4.setBounds(50,200,150,20);
    l5.setBounds(50,250,150,20);
    l6.setBounds(50,300,150,20);
    t1.setBounds(210,100,200,20);
    t2.setBounds(210,150,200,20);
    t3.setBounds(210,200,200,20);
    t4.setBounds(210,250,200,20);
    t5.setBounds(210,300,200,20);
    t4.setEditable(false);t5.setEditable(false);
    b1.setBounds(100,380,100,30);
    b2.setBounds(250,380,100,30);
    b1.addActionListener(this);
    b2.addActionListener(this);
  }
  public void actionPerformed(ActionEvent ae)
  { String S=ae.getActionCommand();
    if(S.equals("Calculate"))
    { a=Double.parseDouble(t1.getText());
      d=Double.parseDouble(t2.getText());
      n=Double.parseDouble(t3.getText());
      ap=a+(n-1)*d;
      s=(n/2)*(2*a+(n-1)*d);
      t4.setText(""+ap);
      t5.setText(""+s);
      }
    else
    { t1.setText("");
      t2.setText("");
      t3.setText("");
      t4.setText("");
      t5.setText("");
    }
    repaint();
  }
  public void windowClosing(WindowEvent we)
  { setVisible(false);
  }
  public void windowActivated(WindowEvent we)
  {}
  public void windowDeactivated(WindowEvent we)
  {}
  public void windowOpened(WindowEvent we)
  {}
  public void windowClosed(WindowEvent we)
  {}
  public void windowIconified(WindowEvent we)
  {}
  public void windowDeiconified(WindowEvent we)
  {}
  public void paint(Graphics g)
  { setSize(450,450);
    setTitle("Arithmetic Progression Calculator");
  }
}
class MyFrame13 extends Frame implements WindowListener,ActionListener
{ double a1,b1,c1,a2,b2,c2,x,y;
  TextField t1,t2,t3,t4,t5,t6,t7,t8,t9;
  String m;
  MyFrame13()
  { addWindowListener(this);
    setLayout(null);
    Label l1=new Label("Linear Equation Calculator");
    Label l2=new Label("A1 : ");
    Label l3=new Label("B1 : ");
    Label l4=new Label("C1 : ");
    Label l5=new Label("A2 : ");
    Label l6=new Label("B2 : ");
    Label l7=new Label("C2 : ");
    Label l8=new Label("The value of X : ");
    Label l9=new Label("The value of Y : ");
    Label l10=new Label("This Means : ");
    t1=new TextField();
    t2=new TextField();
    t3=new TextField();
    t4=new TextField();
    t5=new TextField();
    t6=new TextField();
    t7=new TextField();
    t8=new TextField();
    t9=new TextField();
    Button b1=new Button("Calculate");
    Button b2=new Button("Reset");
    add(l1);add(l2);add(l3);add(l4);add(l5);add(l6);add(l7);add(l8);add(l9);add(l10);
    add(t1);add(t2);add(t3);add(t4);add(t5);add(t6);add(t7);add(t8);add(t9);
    add(b1);add(b2);
    l1.setBounds(150,50,200,30);
    l2.setBounds(50,100,150,20);
    l3.setBounds(50,150,150,20);
    l4.setBounds(50,200,150,20);
    l5.setBounds(50,250,150,20);
    l6.setBounds(50,300,150,20);
    l7.setBounds(50,350,150,20);
    l8.setBounds(50,400,150,20);
    l9.setBounds(50,450,150,20);
    l10.setBounds(50,500,150,20);
    t1.setBounds(210,100,200,20);
    t2.setBounds(210,150,200,20);
    t3.setBounds(210,200,200,20);
    t4.setBounds(210,250,200,20);
    t5.setBounds(210,300,200,20);
    t6.setBounds(210,350,200,20);
    t7.setBounds(210,400,200,20);
    t8.setBounds(210,450,200,20);
    t9.setBounds(210,500,200,20);
    t7.setEditable(false);t8.setEditable(false);t9.setEditable(false);
    b1.setBounds(100,580,100,30);
    b2.setBounds(250,580,100,30);
    b1.addActionListener(this);
    b2.addActionListener(this);
  }
  public void actionPerformed(ActionEvent ae)
  { String S=ae.getActionCommand();
    if(S.equals("Calculate"))
    { a1=Double.parseDouble(t1.getText());
      b1=Double.parseDouble(t2.getText());
      c1=Double.parseDouble(t3.getText());
      a2=Double.parseDouble(t4.getText());
      b2=Double.parseDouble(t5.getText());
      c2=Double.parseDouble(t6.getText());
      if(a1/a2!=b1/b2)
      { x=((b1*c2-b2*c1)/(a1*b2-a2*b1));
        y=((c1*a2-c2*a1)/(a1*b2-a2*b1));
        m="Unique solution and Intersect at a point";
      }
      else if(a1/a2==b1/b2&&b1/b2==c1/c2)
      m="Infinite number of solution and Coincident";
      else if(a1/a2==b1/b2&&b1/b2!=c1/c2)
      m="No solution and Parallel";
      t7.setText(""+x);
      t8.setText(""+y);
      t9.setText(""+m);
    }
    else
    { t1.setText("");
      t2.setText("");
      t3.setText("");
      t4.setText("");
      t5.setText("");
      t6.setText("");
      t7.setText("");
      t8.setText("");
      t9.setText("");
    }
    repaint();
  }
  public void windowClosing(WindowEvent we)
  { setVisible(false);
  }
  public void windowActivated(WindowEvent we)
  {}
  public void windowDeactivated(WindowEvent we)
  {}
  public void windowOpened(WindowEvent we)
  {}
  public void windowClosed(WindowEvent we)
  {}
  public void windowIconified(WindowEvent we)
  {}
  public void windowDeiconified(WindowEvent we)
  {}
  public void paint(Graphics g)
  { setSize(450,650);
    setTitle("Linear Equation Calculator");
  }
}
class MyFrame14 extends Frame implements WindowListener,ActionListener
{ int a,b,c;
  TextField t1,t2,t3;
  MyFrame14()
  { addWindowListener(this);
    setLayout(null);
    Label l1=new Label("Find Reminder Calculator");
    Label l2=new Label("Enter the number (a) : ");
    Label l3=new Label("Enter the number (b) : ");
    Label l4=new Label("Mod value of (a%b) : ");
    t1=new TextField();
    t2=new TextField();
    t3=new TextField();
    Button b1=new Button("Calculate");
    Button b2=new Button("Reset");
    add(l1);add(l2);add(l3);add(l4);
    add(t1);add(t2);add(t3);
    add(b1);add(b2);
    l1.setBounds(150,50,200,30);
    l2.setBounds(50,100,150,20);
    l3.setBounds(50,150,150,20);
    l4.setBounds(50,200,150,20);
    t1.setBounds(210,100,200,20);
    t2.setBounds(210,150,200,20);
    t3.setBounds(210,200,200,20);
    t3.setEditable(false);
    b1.setBounds(100,330,100,30);
    b2.setBounds(250,330,100,30);
    b1.addActionListener(this);
    b2.addActionListener(this);
  }
  public void actionPerformed(ActionEvent ae)
  { String S=ae.getActionCommand();
    if(S.equals("Calculate"))
    { a=Integer.parseInt(t1.getText());
      b=Integer.parseInt(t2.getText());
      c=a%b;
      t3.setText(""+c);
      }
    else
    { t1.setText("");
      t2.setText("");
      t3.setText("");
    }
    repaint();
  }
  public void windowClosing(WindowEvent we)
  { setVisible(false);
  }
  public void windowActivated(WindowEvent we)
  {}
  public void windowDeactivated(WindowEvent we)
  {}
  public void windowOpened(WindowEvent we)
  {}
  public void windowClosed(WindowEvent we)
  {}
  public void windowIconified(WindowEvent we)
  {}
  public void windowDeiconified(WindowEvent we)
  {}
  public void paint(Graphics g)
  { setSize(450,450);
    setTitle("Mod Calculator");
  }
}
class MyFrame15 extends Frame implements WindowListener,ActionListener
{ double a,b;
  TextField t1,t2;
  MyFrame15()
  { addWindowListener(this);
    setLayout(null);
    Label l1=new Label("Square root Calculator");
    Label l2=new Label("Enter the number (a) : ");
    Label l3=new Label("Square Root of (a) : ");
    t1=new TextField();
    t2=new TextField();
    Button b1=new Button("Calculate");
    Button b2=new Button("Reset");
    add(l1);add(l2);add(l3);
    add(t1);add(t2);
    add(b1);add(b2);
    l1.setBounds(150,50,200,30);
    l2.setBounds(50,100,150,20);
    l3.setBounds(50,150,150,20);
    t1.setBounds(210,100,200,20);
    t2.setBounds(210,150,200,20);
    t2.setEditable(false);
    b1.setBounds(100,330,100,30);
    b2.setBounds(250,330,100,30);
    b1.addActionListener(this);
    b2.addActionListener(this);
  }
  public void actionPerformed(ActionEvent ae)
  { String S=ae.getActionCommand();
    if(S.equals("Calculate"))
    { a=Double.parseDouble(t1.getText());
      b=Math.sqrt(a);
      t2.setText(""+b);
    }
    else
    { t1.setText("");
      t2.setText("");
    }
    repaint();
  }
  public void windowClosing(WindowEvent we)
  { setVisible(false);
  }
  public void windowActivated(WindowEvent we)
  {}
  public void windowDeactivated(WindowEvent we)
  {}
  public void windowOpened(WindowEvent we)
  {}
  public void windowClosed(WindowEvent we)
  {}
  public void windowIconified(WindowEvent we)
  {}
  public void windowDeiconified(WindowEvent we)
  {}
  public void paint(Graphics g)
  { setSize(450,450);
    setTitle("Square Root Calculator");
  }
}
class MyFrame16 extends Frame implements WindowListener,ActionListener
{ double a,b;
  TextField t1,t2;
  MyFrame16()
  { addWindowListener(this);
    setLayout(null);
    Label l1=new Label("Cube root Calculator");
    Label l2=new Label("Enter the number (a) : ");
    Label l3=new Label("Cube Root of (a) : ");
    t1=new TextField();
    t2=new TextField();
    Button b1=new Button("Calculate");
    Button b2=new Button("Reset");
    add(l1);add(l2);add(l3);
    add(t1);add(t2);
    add(b1);add(b2);
    l1.setBounds(150,50,200,30);
    l2.setBounds(50,100,150,20);
    l3.setBounds(50,150,150,20);
    t1.setBounds(210,100,200,20);
    t2.setBounds(210,150,200,20);
    t2.setEditable(false);
    b1.setBounds(100,330,100,30);
    b2.setBounds(250,330,100,30);
    b1.addActionListener(this);
    b2.addActionListener(this);
  }
  public void actionPerformed(ActionEvent ae)
  { String S=ae.getActionCommand();
    if(S.equals("Calculate"))
    { a=Double.parseDouble(t1.getText());
      b=Math.cbrt(a);
      t2.setText(""+b);
    }
    else
    { t1.setText("");
      t2.setText("");
    }
    repaint();
  }
  public void windowClosing(WindowEvent we)
  { setVisible(false);
  }
  public void windowActivated(WindowEvent we)
  {}
  public void windowDeactivated(WindowEvent we)
  {}
  public void windowOpened(WindowEvent we)
  {}
  public void windowClosed(WindowEvent we)
  {}
  public void windowIconified(WindowEvent we)
  {}
  public void windowDeiconified(WindowEvent we)
  {}
  public void paint(Graphics g)
  { setSize(450,450);
    setTitle("Cube Root Calculator");
  }
}
class MyFrame17 extends Frame implements WindowListener,ActionListener
{ int a,r,p,q,i;
  TextField t1,t2;
  MyFrame17()
  { addWindowListener(this);
    setLayout(null);
    Label l1=new Label("Armstrong Number Calculator");
    Label l2=new Label("Enter the number : ");
    Label l3=new Label("Result : ");
    t1=new TextField();
    t2=new TextField();
    Button b1=new Button("Calculate");
    Button b2=new Button("Reset");
    add(l1);add(l2);add(l3);
    add(t1);add(t2);
    add(b1);add(b2);
    l1.setBounds(150,50,200,30);
    l2.setBounds(50,100,150,20);
    l3.setBounds(50,150,150,20);
    t1.setBounds(210,100,200,20);
    t2.setBounds(210,150,200,20);
    t2.setEditable(false);
    b1.setBounds(100,330,100,30);
    b2.setBounds(250,330,100,30);
    b1.addActionListener(this);
    b2.addActionListener(this);
  }
  public void actionPerformed(ActionEvent ae)
  { String S=ae.getActionCommand();
    if(S.equals("Calculate"))
    { a=Integer.parseInt(t1.getText());
      q=a;
      p=0;
      if(a>=10&&a<100)
      i=2;
      if(a>=100&&a<1000)
      i=3;
      if(a>=1000&&a<10000)
      i=4;
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
    else
    { t1.setText("");
      t2.setText("");
    }
    repaint();
  }
  public void windowClosing(WindowEvent we)
  { setVisible(false);
  }
  public void windowActivated(WindowEvent we)
  {}
  public void windowDeactivated(WindowEvent we)
  {}
  public void windowOpened(WindowEvent we)
  {}
  public void windowClosed(WindowEvent we)
  {}
  public void windowIconified(WindowEvent we)
  {}
  public void windowDeiconified(WindowEvent we)
  {}
  public void paint(Graphics g)
  { setSize(450,450);
    setTitle("Armstrong Number Calculator");
  }
}
class MyFrame18 extends Frame implements WindowListener,ActionListener
{ int a,b,c,d,f1,f2;
  TextField t1,t2,t3,t4,t5;
  MyFrame18()
  { addWindowListener(this);
    setLayout(null);
    Label l1=new Label("Fraction Calculator(Addition)");
    Label l2=new Label("A : ");
    Label l3=new Label("B : ");
    Label l4=new Label("C : ");
    Label l5=new Label("D : ");
    Label l6=new Label("Addition : ");
    t1=new TextField();
    t2=new TextField();
    t3=new TextField();
    t4=new TextField();
    t5=new TextField();
    Button b1=new Button("Calculate");
    Button b2=new Button("Reset");
    add(l1);add(l2);add(l3);add(l4);add(l5);add(l6);
    add(t1);add(t2);add(t3);add(t4);add(t5);
    add(b1);add(b2);
    l1.setBounds(150,50,200,30);
    l2.setBounds(50,100,150,20);
    l3.setBounds(50,150,150,20);
    l4.setBounds(50,200,150,20);
    l5.setBounds(50,250,150,20);
    l6.setBounds(50,300,150,20);
    t1.setBounds(210,100,200,20);
    t2.setBounds(210,150,200,20);
    t3.setBounds(210,200,200,20);
    t4.setBounds(210,250,200,20);
    t5.setBounds(210,300,200,20);
    t5.setEditable(false);
    b1.setBounds(100,380,100,30);
    b2.setBounds(250,380,100,30);
    b1.addActionListener(this);
    b2.addActionListener(this);
  }
  public void actionPerformed(ActionEvent ae)
  { String S=ae.getActionCommand();
    if(S.equals("Calculate"))
    { a=Integer.parseInt(t1.getText());
      b=Integer.parseInt(t2.getText());
      c=Integer.parseInt(t3.getText());
      d=Integer.parseInt(t4.getText());
      f1=a*d+b*c;
      f2=b*d;
      t5.setText(""+f1+"/"+f2);
    }
    else
    { t1.setText("");
      t2.setText("");
      t3.setText("");
      t4.setText("");
      t5.setText("");
    }
    repaint();
  }
  public void windowClosing(WindowEvent we)
  { setVisible(false);
  }
  public void windowActivated(WindowEvent we)
  {}
  public void windowDeactivated(WindowEvent we)
  {}
  public void windowOpened(WindowEvent we)
  {}
  public void windowClosed(WindowEvent we)
  {}
  public void windowIconified(WindowEvent we)
  {}
  public void windowDeiconified(WindowEvent we)
  {}
  public void paint(Graphics g)
  { setSize(450,500);
    setTitle("Fraction Calculator");
  }
}
class MyFrame19 extends Frame implements WindowListener,ActionListener
{ int n,r=1,i;
  TextField t1,t2;
  MyFrame19()
  { addWindowListener(this);
    setLayout(null);
    Label l1=new Label("Factorial Calculator");
    Label l2=new Label("Enter value of n : ");
    Label l3=new Label("Result : ");
    t1=new TextField();
    t2=new TextField();
    Button b1=new Button("Calculate");
    Button b2=new Button("Reset");
    add(l1);add(l2);add(l3);
    add(t1);add(t2);
    add(b1);add(b2);
    l1.setBounds(150,50,200,30);
    l2.setBounds(50,100,150,20);
    l3.setBounds(50,150,150,20);
    t1.setBounds(210,100,200,20);
    t2.setBounds(210,150,200,20);
    t2.setEditable(false);
    b1.setBounds(100,330,100,30);
    b2.setBounds(250,330,100,30);
    b1.addActionListener(this);
    b2.addActionListener(this);
  }
  public void actionPerformed(ActionEvent ae)
  { String S=ae.getActionCommand();
    if(S.equals("Calculate"))
    { n=Integer.parseInt(t1.getText());
      for(i=1;i<=n;i++)
      r=r*i;
      t2.setText(""+r);
    }
    else
    { t1.setText("");
      t2.setText("");
    }
    repaint();
  }
  public void windowClosing(WindowEvent we)
  { setVisible(false);
  }
  public void windowActivated(WindowEvent we)
  {}
  public void windowDeactivated(WindowEvent we)
  {}
  public void windowOpened(WindowEvent we)
  {}
  public void windowClosed(WindowEvent we)
  {}
  public void windowIconified(WindowEvent we)
  {}
  public void windowDeiconified(WindowEvent we)
  {}
  public void paint(Graphics g)
  { setSize(450,450);
    setTitle("Factorial Calculator");
  }
}
class MyFrame20 extends Frame implements WindowListener,ActionListener
{ double p,r,t,s;
  TextField t1,t2,t3,t4;
  MyFrame20()
  { addWindowListener(this);
    setLayout(null);
    Label l1=new Label("Simple Interest Calculator");
    Label l2=new Label("Enter Amount : ");
    Label l3=new Label("Enter Rate : ");
    Label l4=new Label("Enter Time : ");
    Label l5=new Label("Simple Interest : ");
    t1=new TextField();
    t2=new TextField();
    t3=new TextField();
    t4=new TextField();
    Button b1=new Button("Calculate");
    Button b2=new Button("Reset");
    add(l1);add(l2);add(l3);add(l4);add(l5);
    add(t1);add(t2);add(t3);add(t4);
    add(b1);add(b2);
    l1.setBounds(150,50,200,30);
    l2.setBounds(50,100,150,20);
    l3.setBounds(50,150,150,20);
    l4.setBounds(50,200,150,20);
    l5.setBounds(50,250,150,20);
    t1.setBounds(210,100,200,20);
    t2.setBounds(210,150,200,20);
    t3.setBounds(210,200,200,20);
    t4.setBounds(210,250,200,20);
    t4.setEditable(false);
    b1.setBounds(100,330,100,30);
    b2.setBounds(250,330,100,30);
    b1.addActionListener(this);
    b2.addActionListener(this);
  }
  public void actionPerformed(ActionEvent ae)
  { String S=ae.getActionCommand();
    if(S.equals("Calculate"))
    { p=Double.parseDouble(t1.getText());
      r=Double.parseDouble(t2.getText());
      t=Double.parseDouble(t3.getText());
      if(p>=0&&r>=0&&t>=0)
      s=(p*r*t)/100;
      t4.setText(""+s);
    }
    else
    { t1.setText("");
      t2.setText("");
      t3.setText("");
      t4.setText("");
    }
    repaint();
  }
  public void windowClosing(WindowEvent we)
  { setVisible(false);
  }
  public void windowActivated(WindowEvent we)
  {}
  public void windowDeactivated(WindowEvent we)
  {}
  public void windowOpened(WindowEvent we)
  {}
  public void windowClosed(WindowEvent we)
  {}
  public void windowIconified(WindowEvent we)
  {}
  public void windowDeiconified(WindowEvent we)
  {}
  public void paint(Graphics g)
  { setSize(450,450);
    setTitle("Simple Interest Calculator");
  }
}
class MyFrame21 extends Frame implements WindowListener,ActionListener
{ double n,l;
  TextField t1,t2;
  MyFrame21()
  { addWindowListener(this);
    setLayout(null);
    Label l1=new Label("Logarithm Calculator");
    Label l2=new Label("Enter the number : ");
    Label l4=new Label("Log Value(Base 10) : ");
    t1=new TextField();
    t2=new TextField();
    Button b1=new Button("Calculate");
    Button b2=new Button("Reset");
    add(l1);add(l2);add(l4);
    add(t1);add(t2);
    add(b1);add(b2);
    l1.setBounds(150,50,200,30);
    l2.setBounds(50,100,150,20);
    l4.setBounds(50,200,150,20);
    t1.setBounds(210,100,200,20);
    t2.setBounds(210,200,200,20);
    t2.setEditable(false);
    b1.setBounds(100,330,100,30);
    b2.setBounds(250,330,100,30);
    b1.addActionListener(this);
    b2.addActionListener(this);
  }
  public void actionPerformed(ActionEvent ae)
  { String S=ae.getActionCommand();
    if(S.equals("Calculate"))
    { n=Double.parseDouble(t1.getText());
      if(n>0)
      l=Math.log10(n);
      t2.setText(""+l);
    }
    else
    { t1.setText("");
      t2.setText("");
    }
    repaint();
  }
  public void windowClosing(WindowEvent we)
  { setVisible(false);
  }
  public void windowActivated(WindowEvent we)
  {}
  public void windowDeactivated(WindowEvent we)
  {}
  public void windowOpened(WindowEvent we)
  {}
  public void windowClosed(WindowEvent we)
  {}
  public void windowIconified(WindowEvent we)
  {}
  public void windowDeiconified(WindowEvent we)
  {}
  public void paint(Graphics g)
  {  setSize(450,450);
    setTitle("Log Calculator");
  }
}
class MyFrame22 extends Frame implements WindowListener,ActionListener
{ int n,r,p,f,i,q;
  TextField t1,t2;
  MyFrame22()
  { addWindowListener(this);
    setLayout(null);
    Label l1=new Label("Strong Number Calculator");
    Label l2=new Label("Enter the number : ");
    Label l3=new Label("Result : ");
    t1=new TextField();
    t2=new TextField();
    Button b1=new Button("Calculate");
    Button b2=new Button("Reset");
    add(l1);add(l2);add(l3);
    add(t1);add(t2);
    add(b1);add(b2);
    l1.setBounds(150,50,200,30);
    l2.setBounds(50,100,150,20);
    l3.setBounds(50,150,150,20);
    t1.setBounds(210,100,200,20);
    t2.setBounds(210,150,200,20);
    t2.setEditable(false);
    b1.setBounds(100,330,100,30);
    b2.setBounds(250,330,100,30);
    b1.addActionListener(this);
    b2.addActionListener(this);
  }
  public void actionPerformed(ActionEvent ae)
  { String S=ae.getActionCommand();
    if(S.equals("Calculate"))
    { n=Integer.parseInt(t1.getText());
      p=n;
      q=0;
      while(n!=0)
      { f=1;
        r=n%10;
        for(i=1;i<=r;i++)
        f=f*i;
        q=q+f;
        n=n/10;
      }
      if(p==q)
      t2.setText(""+p+" is a Strong number");
      else
      t2.setText(""+p+" is not a Strong number");
    }
    else
    { t1.setText("");
      t2.setText("");
    }
    repaint();
  }
  public void windowClosing(WindowEvent we)
  { setVisible(false);
  }
  public void windowActivated(WindowEvent we)
  {}
  public void windowDeactivated(WindowEvent we)
  {}
  public void windowOpened(WindowEvent we)
  {}
  public void windowClosed(WindowEvent we)
  {}
  public void windowIconified(WindowEvent we)
  {}
  public void windowDeiconified(WindowEvent we)
  {}
  public void paint(Graphics g)
  { setSize(450,450);
    setTitle("Strong Number Calculator");
  }
}
class MyFrame23 extends Frame implements WindowListener,ActionListener
{ int n,i,s;
  TextField t1,t2;
  MyFrame23()
  { addWindowListener(this);
    setLayout(null);
    Label l1=new Label("Perfect Number Calculator");
    Label l2=new Label("Enter the number : ");
    Label l3=new Label("Result : ");
    t1=new TextField();
    t2=new TextField();
    Button b1=new Button("Calculate");
    Button b2=new Button("Reset");
    add(l1);add(l2);add(l3);
    add(t1);add(t2);
    add(b1);add(b2);
    l1.setBounds(150,50,200,30);
    l2.setBounds(50,100,150,20);
    l3.setBounds(50,150,150,20);
    t1.setBounds(210,100,200,20);
    t2.setBounds(210,150,200,20);
    t2.setEditable(false);
    b1.setBounds(100,330,100,30);
    b2.setBounds(250,330,100,30);
    b1.addActionListener(this);
    b2.addActionListener(this);
  }
  public void actionPerformed(ActionEvent ae)
  { String S=ae.getActionCommand();
    if(S.equals("Calculate"))
    { n=Integer.parseInt(t1.getText());
      for(i=1;i<=n/2;i++)
      { if(n%i==0)
        s=s+i;
      }
      if(s==n)
      t2.setText(""+n+" is a Perfect number");
      else
      t2.setText(""+n+" is not a Perfect number");
    }
    else
    { t1.setText("");
      t2.setText("");
    }
    repaint();
  }
  public void windowClosing(WindowEvent we)
  { setVisible(false);
  }
  public void windowActivated(WindowEvent we)
  {}
  public void windowDeactivated(WindowEvent we)
  {}
  public void windowOpened(WindowEvent we)
  {}
  public void windowClosed(WindowEvent we)
  {}
  public void windowIconified(WindowEvent we)
  {}
  public void windowDeiconified(WindowEvent we)
  {}
  public void paint(Graphics g)
  { setSize(450,450);
    setTitle("Perfect Number Calculator");
  }
}
class MyFrame24 extends Frame implements WindowListener,ActionListener
{ double a,b,c,p,ar,s;
  TextField t1,t2,t3,t4,t5;
  MyFrame24()
  { addWindowListener(this);
    setLayout(null);
    Label l1=new Label("Area & Perimeter of Triangle");
    Label l2=new Label("Enter a : ");
    Label l3=new Label("Enter b : ");
    Label l4=new Label("Enter c : ");
    Label l5=new Label("Perimeter of Triangle : ");
    Label l6=new Label("Area of Triangle : ");
    t1=new TextField();
    t2=new TextField();
    t3=new TextField();
    t4=new TextField();
    t5=new TextField();
    Button b1=new Button("Calculate");
    Button b2=new Button("Reset");
    add(l1);add(l2);add(l3);add(l4);add(l5);add(l6);
    add(t1);add(t2);add(t3);add(t4);add(t5);
    add(b1);add(b2);
    l1.setBounds(150,50,200,30);
    l2.setBounds(50,100,150,20);
    l3.setBounds(50,150,150,20);
    l4.setBounds(50,200,150,30);
    l5.setBounds(50,250,150,20);
    l6.setBounds(50,300,150,20);
    t1.setBounds(210,100,200,20);
    t2.setBounds(210,150,200,20);
    t3.setBounds(210,200,200,20);
    t4.setBounds(210,250,200,20);
    t5.setBounds(210,300,200,20);
    t4.setEditable(false);t5.setEditable(false);
    b1.setBounds(100,330,100,30);
    b2.setBounds(250,330,100,30);
    b1.addActionListener(this);
    b2.addActionListener(this);
  }
  public void actionPerformed(ActionEvent ae)
  { String S=ae.getActionCommand();
    if(S.equals("Calculate"))
    { a=Double.parseDouble(t1.getText());
      b=Double.parseDouble(t2.getText());
      c=Double.parseDouble(t3.getText());
      p=0;
      ar=0;
      if(a>=0&&b>=0&&c>=0)
      { p=a+b+c;
        s=(a+b+c)/2;
        ar=Math.sqrt(s*(s-a)*(s-b)*(s-c));
      }
      t4.setText(""+p);
      t5.setText(""+ar);
    }
    else
    { t1.setText("");
      t2.setText("");
      t3.setText("");
      t4.setText("");
      t5.setText("");
    }
    repaint();
  }
  public void windowClosing(WindowEvent we)
  { setVisible(false);
  }
  public void windowActivated(WindowEvent we)
  {}
  public void windowDeactivated(WindowEvent we)
  {}
  public void windowOpened(WindowEvent we)
  {}
  public void windowClosed(WindowEvent we)
  {}
  public void windowIconified(WindowEvent we)
  {}
  public void windowDeiconified(WindowEvent we)
  {}
  public void paint(Graphics g)
  { setSize(450,450);
    setTitle("Area & Perimeter of Triangle");
  }
}
class MyFrame25 extends Frame implements WindowListener,ActionListener
{ double l,b,p,ar;
  TextField t1,t2,t3,t4;
  MyFrame25()
  { addWindowListener(this);
    setLayout(null);
    Label l1=new Label("Area & Perimeter of Rectangle");
    Label l2=new Label("Enter Length(l) : ");
    Label l3=new Label("Enter Base(b) : ");
    Label l4=new Label("Perimeter of Rectangle : ");
    Label l5=new Label("Area of Rectangle : ");
    t1=new TextField();
    t2=new TextField();
    t3=new TextField();
    t4=new TextField();
    Button b1=new Button("Calculate");
    Button b2=new Button("Reset");
    add(l1);add(l2);add(l3);add(l4);add(l5);
    add(t1);add(t2);add(t3);add(t4);
    add(b1);add(b2);
    l1.setBounds(150,50,200,30);
    l2.setBounds(50,100,150,20);
    l3.setBounds(50,150,150,20);
    l4.setBounds(50,200,150,30);
    l5.setBounds(50,250,150,20);
    t1.setBounds(210,100,200,20);
    t2.setBounds(210,150,200,20);
    t3.setBounds(210,200,200,20);
    t4.setBounds(210,250,200,20);
    t4.setEditable(false);t3.setEditable(false);
    b1.setBounds(100,330,100,30);
    b2.setBounds(250,330,100,30);
    b1.addActionListener(this);
    b2.addActionListener(this);
  }
  public void actionPerformed(ActionEvent ae)
  { String S=ae.getActionCommand();
    if(S.equals("Calculate"))
    { l=Double.parseDouble(t1.getText());
      b=Double.parseDouble(t2.getText());
      p=0;
      ar=0;
      if(l>=0&&b>=0)
      { p=2*(l+b);
        ar=l*b;
      }
      t3.setText(""+p);
      t4.setText(""+ar);
    }
    else
    { t1.setText("");
      t2.setText("");
      t3.setText("");
      t4.setText("");
    }
    repaint();
  }
  public void windowClosing(WindowEvent we)
  { setVisible(false);
  }
  public void windowActivated(WindowEvent we)
  {}
  public void windowDeactivated(WindowEvent we)
  {}
  public void windowOpened(WindowEvent we)
  {}
  public void windowClosed(WindowEvent we)
  {}
  public void windowIconified(WindowEvent we)
  {}
  public void windowDeiconified(WindowEvent we)
  {}
  public void paint(Graphics g)
  { setSize(450,450);
    setTitle("Area & Perimeter of Rectangle");
  }
}
class MyFrame26 extends Frame implements WindowListener,ActionListener
{ double a,p,ar;
  TextField t1,t2,t3;
  MyFrame26()
  { addWindowListener(this);
    setLayout(null);
    Label l1=new Label("Area & Perimeter of Square");
    Label l2=new Label("Enter Side (a) : ");
    Label l3=new Label("Perimeter of Square : ");
    Label l4=new Label("Area of Square : ");
    t1=new TextField();
    t2=new TextField();
    t3=new TextField();
    Button b1=new Button("Calculate");
    Button b2=new Button("Reset");
    add(l1);add(l2);add(l3);add(l4);
    add(t1);add(t2);add(t3);
    add(b1);add(b2);
    l1.setBounds(150,50,200,30);
    l2.setBounds(50,100,150,20);
    l3.setBounds(50,150,150,20);
    l4.setBounds(50,200,150,30);
    t1.setBounds(210,100,200,20);
    t2.setBounds(210,150,200,20);
    t3.setBounds(210,200,200,20);
    t2.setEditable(false);t3.setEditable(false);
    b1.setBounds(100,330,100,30);
    b2.setBounds(250,330,100,30);
    b1.addActionListener(this);
    b2.addActionListener(this);
  }
  public void actionPerformed(ActionEvent ae)
  { String S=ae.getActionCommand();
    if(S.equals("Calculate"))
    { a=Double.parseDouble(t1.getText());
      p=0;
      ar=0;
      if(a>=0)
      { p=4*a;
        ar=a*a;
      }
      t2.setText(""+p);
      t3.setText(""+ar);
    }
    else
    { t1.setText("");
      t2.setText("");
      t3.setText("");
    }
    repaint();
  }
  public void windowClosing(WindowEvent we)
  { setVisible(false);
  }
  public void windowActivated(WindowEvent we)
  {}
  public void windowDeactivated(WindowEvent we)
  {}
  public void windowOpened(WindowEvent we)
  {}
  public void windowClosed(WindowEvent we)
  {}
  public void windowIconified(WindowEvent we)
  {}
  public void windowDeiconified(WindowEvent we)
  {}
  public void paint(Graphics g)
  { setSize(450,450);
    setTitle("Area & Perimeter of Square");
  }
}
class MyFrame27 extends Frame implements WindowListener,ActionListener
{ double d1,d2,ar;
  TextField t1,t2,t3;
  MyFrame27()
  { addWindowListener(this);
    setLayout(null);
    Label l1=new Label("Area of Rhombus");
    Label l2=new Label("Enter Diagonal (d1) : ");
    Label l3=new Label("Enter Diagonal (d2) : ");
    Label l4=new Label("Area of Rhombus : ");
    t1=new TextField();
    t2=new TextField();
    t3=new TextField();
    Button b1=new Button("Calculate");
    Button b2=new Button("Reset");
    add(l1);add(l2);add(l3);add(l4);
    add(t1);add(t2);add(t3);
    add(b1);add(b2);
    l1.setBounds(150,50,200,30);
    l2.setBounds(50,100,150,20);
    l3.setBounds(50,150,150,20);
    l4.setBounds(50,200,150,30);
    t1.setBounds(210,100,200,20);
    t2.setBounds(210,150,200,20);
    t3.setBounds(210,200,200,20);
    t3.setEditable(false);
    b1.setBounds(100,330,100,30);
    b2.setBounds(250,330,100,30);
    b1.addActionListener(this);
    b2.addActionListener(this);
  }
  public void actionPerformed(ActionEvent ae)
  { String S=ae.getActionCommand();
    if(S.equals("Calculate"))
    { d1=Double.parseDouble(t1.getText());
      d2=Double.parseDouble(t2.getText());
      ar=0;
      if(d1>=0&&d2>=0)
      { ar=d1*d2/2;
      }
      t3.setText(""+ar);
    }
    else
    { t1.setText("");
      t2.setText("");
      t3.setText("");
    }
    repaint();
  }
  public void windowClosing(WindowEvent we)
  { setVisible(false);
  }
  public void windowActivated(WindowEvent we)
  {}
  public void windowDeactivated(WindowEvent we)
  {}
  public void windowOpened(WindowEvent we)
  {}
  public void windowClosed(WindowEvent we)
  {}
  public void windowIconified(WindowEvent we)
  {}
  public void windowDeiconified(WindowEvent we)
  {}
  public void paint(Graphics g)
  { setSize(450,450);
    setTitle("Area & Perimeter of Rhombus");
  }
}
class MyFrame28 extends Frame implements WindowListener,ActionListener
{ double a,b,h,ar;
  TextField t1,t2,t3,t4;
  MyFrame28()
  { addWindowListener(this);
    setLayout(null);
    Label l1=new Label("Area of Trapezium");
    Label l2=new Label("Enter Parallel side (a) : ");
    Label l3=new Label("Enter Parallel side (b) : ");
    Label l4=new Label("Enter height (h) : ");
    Label l5=new Label("Area of Rhombus : ");
    t1=new TextField();
    t2=new TextField();
    t3=new TextField();
    t4=new TextField();
    Button b1=new Button("Calculate");
    Button b2=new Button("Reset");
    add(l1);add(l2);add(l3);add(l4);add(l5);
    add(t1);add(t2);add(t3);add(t4);
    add(b1);add(b2);
    l1.setBounds(150,50,200,30);
    l2.setBounds(50,100,150,20);
    l3.setBounds(50,150,150,20);
    l4.setBounds(50,200,150,30);
    l5.setBounds(50,250,150,30);
    t1.setBounds(210,100,200,20);
    t2.setBounds(210,150,200,20);
    t3.setBounds(210,200,200,20);
    t4.setBounds(210,250,200,20);
    t4.setEditable(false);
    b1.setBounds(100,330,100,30);
    b2.setBounds(250,330,100,30);
    b1.addActionListener(this);
    b2.addActionListener(this);
  }
  public void actionPerformed(ActionEvent ae)
  { String S=ae.getActionCommand();
    if(S.equals("Calculate"))
    { a=Double.parseDouble(t1.getText());
      b=Double.parseDouble(t2.getText());
      h=Double.parseDouble(t3.getText());
      ar=0;
      if(a>=0&&b>=0&&h>=0)
      { ar=(a+b/2)*h;
      }
      t4.setText(""+ar);
    }
    else
    { t1.setText("");
      t2.setText("");
      t3.setText("");
      t4.setText("");
    }
    repaint();
  }
  public void windowClosing(WindowEvent we)
  { setVisible(false);
  }
  public void windowActivated(WindowEvent we)
  {}
  public void windowDeactivated(WindowEvent we)
  {}
  public void windowOpened(WindowEvent we)
  {}
  public void windowClosed(WindowEvent we)
  {}
  public void windowIconified(WindowEvent we)
  {}
  public void windowDeiconified(WindowEvent we)
  {}
  public void paint(Graphics g)
  { setSize(450,450);
    setTitle("Area & Perimeter of Trapezium");
  }
}
class MyFrame29 extends Frame implements WindowListener,ActionListener
{ double r,c,ar   ;
  TextField t1,t2,t3;
  MyFrame29()
  { addWindowListener(this);
    setLayout(null);
    Label l1=new Label("Area & Circumference of Circle");
    Label l2=new Label("Enter Radius (r) : ");
    Label l3=new Label("Circumference of Circle : ");
    Label l4=new Label("Area of Circle : ");
    t1=new TextField();
    t2=new TextField();
    t3=new TextField();
    Button b1=new Button("Calculate");
    Button b2=new Button("Reset");
    add(l1);add(l2);add(l3);add(l4);
    add(t1);add(t2);add(t3);
    add(b1);add(b2);
    l1.setBounds(150,50,200,30);
    l2.setBounds(50,100,150,20);
    l3.setBounds(50,150,150,20);
    l4.setBounds(50,200,150,30);
    t1.setBounds(210,100,200,20);
    t2.setBounds(210,150,200,20);
    t3.setBounds(210,200,200,20);
    t2.setEditable(false);t3.setEditable(false);
    b1.setBounds(100,330,100,30);
    b2.setBounds(250,330,100,30);
    b1.addActionListener(this);
    b2.addActionListener(this);
  }
  public void actionPerformed(ActionEvent ae)
  { String S=ae.getActionCommand();
    if(S.equals("Calculate"))
    { r=Double.parseDouble(t1.getText());
      if(r>=0)
      { ar=3.14*r*r;
        c=2*3.14*r;
      }
      t2.setText(""+c);
      t3.setText(""+ar);
    }
    else
    { t1.setText("");
      t2.setText("");
      t3.setText("");
    }
    repaint();
  }
  public void windowClosing(WindowEvent we)
  { setVisible(false);
  }
  public void windowActivated(WindowEvent we)
  {}
  public void windowDeactivated(WindowEvent we)
  {}
  public void windowOpened(WindowEvent we)
  {}
  public void windowClosed(WindowEvent we)
  {}
  public void windowIconified(WindowEvent we)
  {}
  public void windowDeiconified(WindowEvent we)
  {}
  public void paint(Graphics g)
  { setSize(450,450);
    setTitle("Area & Perimeter of Circle");
  }
}
class MyFrame30 extends Frame implements WindowListener,ActionListener
{ double l,b,h,v,ar;
  TextField t1,t2,t3,t4,t5;
  MyFrame30()
  { addWindowListener(this);
    setLayout(null);
    Label l1=new Label("Area & Volume of Cuboid");
    Label l2=new Label("Enter Length (l) : ");
    Label l3=new Label("Enter Base (b) : ");
    Label l4=new Label("Enter Height (h) : ");
    Label l5=new Label("Volume of Cuboid : ");
    Label l6=new Label("Total Surface Area of Cuboid : ");
    t1=new TextField();
    t2=new TextField();
    t3=new TextField();
    t4=new TextField();
    t5=new TextField();
    Button b1=new Button("Calculate");
    Button b2=new Button("Reset");
    add(l1);add(l2);add(l3);add(l4);add(l5);add(l6);
    add(t1);add(t2);add(t3);add(t4);add(t5);
    add(b1);add(b2);
    l1.setBounds(150,50,200,30);
    l2.setBounds(50,100,150,20);
    l3.setBounds(50,150,150,20);
    l4.setBounds(50,200,150,30);
    l5.setBounds(50,250,150,20);
    l6.setBounds(50,300,150,30);
    t1.setBounds(210,100,200,20);
    t2.setBounds(210,150,200,20);
    t3.setBounds(210,200,200,20);
    t4.setBounds(210,250,200,20);
    t5.setBounds(210,300,200,20);
    t4.setEditable(false);t5.setEditable(false);
    b1.setBounds(100,360,100,30);
    b2.setBounds(250,360,100,30);
    b1.addActionListener(this);
    b2.addActionListener(this);
  }
  public void actionPerformed(ActionEvent ae)
  { String S=ae.getActionCommand();
    if(S.equals("Calculate"))
    { l=Double.parseDouble(t1.getText());
      b=Double.parseDouble(t2.getText());
      h=Double.parseDouble(t3.getText());
      if(l>=0&&b>=0&&h>=0)
      { v=l*b*h;
        ar=2*(l*b+b*h+h*l);
      }
      t4.setText(""+v);
      t5.setText(""+ar);
    }
    else
    { t1.setText("");
      t2.setText("");
      t3.setText("");
      t4.setText("");
      t5.setText("");
    }
    repaint();
  }
  public void windowClosing(WindowEvent we)
  { setVisible(false);
  }
  public void windowActivated(WindowEvent we)
  {}
  public void windowDeactivated(WindowEvent we)
  {}
  public void windowOpened(WindowEvent we)
  {}
  public void windowClosed(WindowEvent we)
  {}
  public void windowIconified(WindowEvent we)
  {}
  public void windowDeiconified(WindowEvent we)
  {}
  public void paint(Graphics g)
  { setSize(450,450);
    setTitle("Area & Volume of Cuboid");
  }
}
public class Thirty_Application_in_one extends Applet implements AdjustmentListener,ItemListener,ActionListener
{ MyFrame1 mf1;
  MyFrame2 mf2;
  MyFrame3 mf3;
  MyFrame4 mf4;
  MyFrame5 mf5;
  MyFrame6 mf6;
  MyFrame7 mf7;
  MyFrame8 mf8;
  MyFrame9 mf9;
  MyFrame10 mf10;
  MyFrame11 mf11;
  MyFrame12 mf12;
  MyFrame13 mf13;
  MyFrame14 mf14;
  MyFrame15 mf15;
  MyFrame16 mf16;
  MyFrame17 mf17;
  MyFrame18 mf18;
  MyFrame19 mf19;
  MyFrame20 mf20;
  MyFrame21 mf21;
  MyFrame22 mf22;
  MyFrame23 mf23;
  MyFrame24 mf24;
  MyFrame25 mf25;
  MyFrame26 mf26;
  MyFrame27 mf27;
  MyFrame28 mf28;
  MyFrame29 mf29;
  MyFrame30 mf30;
  Scrollbar vsb;
  Checkbox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20,c21,c22,c23,c24,c25,c26,c27,c28,c29,c30;
  String s,S;
  CheckboxGroup cbg;
  Button b1,b2;
  public void init()
  { mf1=new MyFrame1();
    mf2=new MyFrame2();
    mf3=new MyFrame3();
    mf4=new MyFrame4();
    mf5=new MyFrame5();
    mf6=new MyFrame6();
    mf7=new MyFrame7();
    mf8=new MyFrame8();
    mf9=new MyFrame9();
    mf10=new MyFrame10();
    mf11=new MyFrame11();
    mf12=new MyFrame12();
    mf13=new MyFrame13();
    mf14=new MyFrame14();
    mf15=new MyFrame15();
    mf16=new MyFrame16();
    mf17=new MyFrame17();
    mf18=new MyFrame18();
    mf19=new MyFrame19();
    mf20=new MyFrame20();
    mf21=new MyFrame21();
    mf22=new MyFrame22();
    mf23=new MyFrame23();
    mf24=new MyFrame24();
    mf25=new MyFrame25();
    mf26=new MyFrame26();
    mf27=new MyFrame27();
    mf28=new MyFrame28();
    mf29=new MyFrame29();
    mf30=new MyFrame30();
    setLayout(null);
    vsb=new Scrollbar(Scrollbar.VERTICAL,0,130,0,200);
    cbg=new CheckboxGroup();
    c1=new Checkbox("Body Mass Index Calculator",true,cbg);
    c2=new Checkbox("Pythagoras Theorem Calculator",false,cbg);
    c3=new Checkbox("Sine Calculator",false,cbg);
    c4=new Checkbox("Cosine Calculator",false,cbg);
    c5=new Checkbox("Tan Angle Calculator",false,cbg);
    c6=new Checkbox("Qudratic Formula Calculator",false,cbg);
    c7=new Checkbox("Prime Number Calculator",false,cbg);
    c8=new Checkbox("Geometric Progression Calculator",false,cbg);
    c9=new Checkbox("Sum of Consecutive Square",false,cbg);
    c10=new Checkbox("Sum of Consecutive Cubes",false,cbg);
    c11=new Checkbox("Complex Number Calculator",false,cbg);
    c12=new Checkbox("Arithmetic Progression Calculator",false,cbg);
    c13=new Checkbox("Linear Equation Calculator",false,cbg);
    c14=new Checkbox("Mod Calculator",false,cbg);
    c15=new Checkbox("Square Root Calculator",false,cbg);
    c16=new Checkbox("Cube Root Calculator",false,cbg);
    c17=new Checkbox("Armstrong Number Calculator",false,cbg);
    c18=new Checkbox("Fraction Calculator",false,cbg);
    c19=new Checkbox("Factorial Calulator",false,cbg);
    c20=new Checkbox("Simple Interest Calculator",false,cbg);
    c21=new Checkbox("Log Calculator",false,cbg);
    c22=new Checkbox("Strong Number Calculator",false,cbg);
    c23=new Checkbox("Perfect Number Calculator",false,cbg);
    c24=new Checkbox("Area & Perimeter of Triangle",false,cbg);
    c25=new Checkbox("Area & Perimeter of Rectangle",false,cbg);
    c26=new Checkbox("Area & Perimeter of Square",false,cbg);
    c27=new Checkbox("Area & Perimeter of Rhombus",false,cbg);
    c28=new Checkbox("Area & Perimeter of Trapezium",false,cbg);
    c29=new Checkbox("Area & Perimeter of Circle",false,cbg);
    c30=new Checkbox("Area & Volume of Cube",false,cbg);
    b1=new Button("GO");
    b2=new Button("BACK");
    add(b1);
    add(b2);
    b1.addActionListener(this);
    b2.addActionListener(this);
    add(vsb);
    add(c1);add(c2);add(c3);add(c4);add(c5);add(c6);add(c7);add(c8);add(c9);add(c10);add(c10);add(c11);add(c12);add(c13);add(c14);add(c15);add(c16);add(c17);
    add(c18);add(c19);add(c20);add(c21);add(c22);add(c23);add(c24);add(c25);add(c26);add(c27);add(c28);add(c29);add(c30);
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
    c21.addItemListener(this);
    c22.addItemListener(this);
    c23.addItemListener(this);
    c24.addItemListener(this);
    c25.addItemListener(this);
    c26.addItemListener(this);
    c27.addItemListener(this);
    c28.addItemListener(this);
    c29.addItemListener(this);
    c30.addItemListener(this);
    vsb.addAdjustmentListener(this);
    vsb.setBounds(1085,0,15,500);
  }
  public void adjustmentValueChanged(AdjustmentEvent ae)
  { repaint();
  }
  public void itemStateChanged(ItemEvent e)
  { repaint();
  }
  public void actionPerformed(ActionEvent ae)
  { S=ae.getActionCommand();
    if(S.equals("GO"))
    { if(c1.getState()==true)
      mf1.setVisible(true);
      else if(c2.getState()==true)
      mf2.setVisible(true);
      else if(c3.getState()==true)
      mf3.setVisible(true);
      else if(c4.getState()==true)
      mf4.setVisible(true);
      else if(c5.getState()==true)
      mf5.setVisible(true);
      else if(c6.getState()==true)
      mf6.setVisible(true);
      else if(c7.getState()==true)
      mf7.setVisible(true);
      else if(c8.getState()==true)
      mf8.setVisible(true);
      else if(c9.getState()==true)
      mf9.setVisible(true);
      else if(c10.getState()==true)
      mf10.setVisible(true);
      else if(c11.getState()==true)
      mf11.setVisible(true);
      else if(c12.getState()==true)
      mf12.setVisible(true);
      else if(c13.getState()==true)
      mf13.setVisible(true);
      else if(c14.getState()==true)
      mf14.setVisible(true);
      else if(c15.getState()==true)
      mf15.setVisible(true);
      else if(c16.getState()==true)
      mf16.setVisible(true);
      else if(c17.getState()==true)
      mf17.setVisible(true);
      else if(c18.getState()==true)
      mf18.setVisible(true);
      else if(c19.getState()==true)
      mf19.setVisible(true);
      else if(c20.getState()==true)
      mf20.setVisible(true);
      else if(c21.getState()==true)
      mf21.setVisible(true);
      else if(c22.getState()==true)
      mf22.setVisible(true);
      else if(c23.getState()==true)
      mf23.setVisible(true);
      else if(c24.getState()==true)
      mf24.setVisible(true);
      else if(c25.getState()==true)
      mf25.setVisible(true);
      else if(c26.getState()==true)
      mf26.setVisible(true);
      else if(c27.getState()==true)
      mf27.setVisible(true);
      else if(c28.getState()==true)
      mf28.setVisible(true);
      else if(c29.getState()==true)
      mf29.setVisible(true);
      else if(c30.getState()==true)
      mf30.setVisible(true);
    }
  }
  public void paint(Graphics g)
  { setSize(1100,500);
    c1.setBounds(30,80-vsb.getValue()*2,250,20);
    c2.setBounds(300,80-vsb.getValue()*2,250,20);
    c3.setBounds(570,80-vsb.getValue()*2,250,20);
    c4.setBounds(840,80-vsb.getValue()*2,250,20);
    c5.setBounds(30,120-vsb.getValue()*2,250,20);
    c6.setBounds(300,120-vsb.getValue()*2,250,20);
    c7.setBounds(570,120-vsb.getValue()*2,250,20);
    c8.setBounds(840,120-vsb.getValue()*2,250,20);
    c9.setBounds(30,160-vsb.getValue()*2,250,20);
    c10.setBounds(300,160-vsb.getValue()*2,250,20);
    c11.setBounds(570,160-vsb.getValue()*2,250,20);
    c12.setBounds(840,160-vsb.getValue()*2,250,20);
    c13.setBounds(30,200-vsb.getValue()*2,250,20);
    c14.setBounds(300,200-vsb.getValue()*2,250,20);
    c15.setBounds(570,200-vsb.getValue()*2,250,20);
    c16.setBounds(840,200-vsb.getValue()*2,250,20);
    c17.setBounds(30,240-vsb.getValue()*2,250,20);
    c18.setBounds(300,240-vsb.getValue()*2,250,20);
    c19.setBounds(570,240-vsb.getValue()*2,250,20);
    c20.setBounds(840,240-vsb.getValue()*2,250,20);
    c21.setBounds(30,280-vsb.getValue()*2,250,20);
    c22.setBounds(300,280-vsb.getValue()*2,250,20);
    c23.setBounds(570,280-vsb.getValue()*2,250,20);
    c24.setBounds(840,280-vsb.getValue()*2,250,20);
    c25.setBounds(30,320-vsb.getValue()*2,250,20);
    c26.setBounds(300,320-vsb.getValue()*2,250,20);
    c27.setBounds(570,320-vsb.getValue()*2,250,20);
    c28.setBounds(840,320-vsb.getValue()*2,250,20);
    c29.setBounds(30,360-vsb.getValue()*2,250,20);
    c30.setBounds(300,360-vsb.getValue()*2,250,20);
    b1.setBounds(570,560-vsb.getValue()*2,50,25);
    showStatus("");
  }
}
