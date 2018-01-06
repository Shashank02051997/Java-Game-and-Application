//Rapid Roll Game 
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*<applet code="Rapid_Roll_Game" width=200 height=350>
</applet>*/
public class Rapid_Roll_Game extends JApplet implements KeyListener
{       int k,a=0,f=0,z=0,s=0,x=100,y=200,x1=90,y1=200,x2=130,y2=250,x3=50,y3=300,x4=110,y4=350,x5=70,y5=400,x6=30,y6=450,x7=150,y7=500;
        private JPanel panel;
        public void init()
        { addKeyListener(this);
          requestFocus();
          panel = new JPanel()
          { protected void paintComponent(Graphics g)
            { super.paintComponent(g);
              setBackground(Color.CYAN);
              try
              { Font fobj=new Font("Arial",Font.BOLD,26);
                Font fobj1=new Font("Arial",Font.ITALIC,20);
                if(f==1)
                { g.setFont(fobj);
                  g.drawString("out!",80,170);
                }
                else
                { g.setColor(Color.RED);
                  g.fillOval(x,y,10,10);
                  g.setColor(Color.GRAY);
                  g.fillRect(x1,y1+10,20,5);
                  g.fillRect(x2,y2+10,20,5);
                  g.fillRect(x3,y3+10,20,5);
                  g.fillRect(x4,y4+10,20,5);
                  g.fillRect(x5,y5+10,20,5);
                  g.fillRect(x6,y6+10,20,5);
                  g.fillRect(x7,y7+10,20,5);
                  if(z==0)
                  { g.setFont(fobj1);
                    g.setColor(Color.MAGENTA);
                    g.drawString("RAPIDROLL GAME",10,60);
                  }
                  else
                  { if(x>=80&&x<=110&&y==y1)
                    { y=y1;
                      y=y-1;
                      repaint();
                      Thread.sleep(15);
                    }
                    else if(x>=120&&x<=150&&y==y2)
                    { y=y2;
                      y=y-1;
                      repaint();
                      Thread.sleep(15);
                    }
                    else if(x>=40&&x<=70&&y==y3)
                    { y=y3;
                      y=y-1;
                      repaint();
                      Thread.sleep(15);
                    }
                    else if(x>=100&&x<=130&&y==y4)
                    { y=y4;
                      y=y-1;
                      repaint();
                      Thread.sleep(15);
                    }
                    else if(x>=60&&x<=90&&y==y5)
                    { y=y5;
                      y=y-1;
                      repaint();
                      Thread.sleep(15);
                    }
                    else if(x>=20&&x<=50&&y==y6)
                    { y=y6;
                      y=y-1;
                      repaint();
                      Thread.sleep(15);
                    }
                    else if(x>=140&&x<=170&&y==y7)
                    { y=y7;
                      y=y-1;
                      repaint();
                      Thread.sleep(15);
                    }
                    else
                    { y=y+1;
                      a=0;
                      Thread.sleep(15);
                      repaint();
                    }
                    y1=y1-1;
                    y2=y2-1;
                    y3=y3-1;
                    y4=y4-1;
                    y5=y5-1;
                    y6=y6-1;
                    y7=y7-1;
                    if(y1==-10)
                    y1=400;
                    if(y2==-10)
                    y2=450;
                    if(y3==-10)
                    y3=500;
                    if(y4==-10)
                    y4=550;
                    if(y5==-10)
                    y5=600;
                    if(y6==-10)
                    y6=650;
                    if(y7==-10)
                    y7=700;
                    if(y==0||y==355)
                    f=1;
                    s++;
                    showStatus(          "SCORE = "+s);
                  }
                }
              }
              catch(Exception e)
              {}
            }
          };
          add(panel);
        }
        public void keyPressed(KeyEvent ke)
        { k=ke.getKeyCode();
          if(k==37)
          { x=x-2;
            z=1;
          }
          else if(k==39)
          { x=x+2;
            z=1;          
          }
          repaint();
        }
        public void keyReleased(KeyEvent ke)
        {}
        public void keyTyped(KeyEvent ke)
        {}
        public void paint(Graphics g)
        { super.paint(g);
          setSize(200,350);
        }
}
