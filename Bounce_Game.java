//Bounce Game
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;
/*<applet code="Bounce_Game" width=500 height=500>
</applet>*/
public class Bounce_Game extends JApplet implements MouseListener
{       int i,y,a,x1,y1,x2,y2,x3,y3,rand,c,s,f,l;
        private JPanel panel;
        public void init()
        { addMouseListener(this);
          i=255;
          y=270;
          x1=250;
          y1=250;
          x2=350;
          y2=200;
          x3=280;
          y3=300;
          panel = new JPanel()
          { protected void paintComponent(Graphics g)
            { try
              { super.paintComponent(g);
                if(f==0)
                { Random r=new Random();
                  rand=r.nextInt(40);
                  Color cobj=new Color(153,204,204);
                  Color cobj1=new Color(55+rand,55+rand,55+rand);
                  Color cobj2=new Color(90+rand,90+rand,90+rand);
                  Color cobj3=new Color(130+rand,130+rand,130+rand);
                  Color cobj4=new Color(170+rand,170+rand,170+rand);
                  Color cobj5=new Color(195,0,0);
                  setBackground(cobj);
                  g.setColor(Color.white);
                  g.fillRect(0,0,500,20);
                  g.fillRect(0,480,500,20);
                  g.setColor(Color.black);
                  g.fillOval(50,y,50,50);
                  l=0;
                  for(i=0;i<24;i++)
                  { if(c%2==0)
                    { g.drawLine(20+l,5,20+l,18);
                      g.drawLine(16+l,13,20+l,18);
                      g.drawLine(24+l,13,20+l,18);
                      g.drawLine(20+l,485,20+l,500);
                      g.drawLine(16+l,493,20+l,500);
                      g.drawLine(24+l,493,20+l,500);
                    }
                    if(c%2==1)
                    { g.drawLine(20+l,5,20+l,18);
                      g.drawLine(20+l,5,16+l,10);
                      g.drawLine(20+l,5,24+l,10);
                      g.drawLine(20+l,485,20+l,508);
                      g.drawLine(20+l,485,16+l,490);
                      g.drawLine(20+l,485,24+l,490);
                    }
                    l=l+20;
                  }
                  y=y+a;
                  if((y==20||y==25)&&c%2==1)
                  a=5;
                  if((y==175||y==180)&&c%2==1)
                  a=-5;
                  if((y==270||y==275)&&c%2==0)
                  a=5;
                  if((y==425||y==430)&&c%2==0)
                  a=-5;
                  if(x1>=50&&x1<=100&&y1>=y&&y1<=y+50)
                  { f=1;
                    Thread.sleep(1000);
                  }
                  else if(x2>=50&&x2<=100&&y2>=y&&y2<=y+50)
                  { f=1;
                    Thread.sleep(1000);
                  }
                  else if(x3>=50&&x3<=100&&y3>=y&&y3<=y+50)
                  { f=1;
                    Thread.sleep(1000);
                  }
                  g.setColor(cobj5);
                  g.fillRoundRect(x1,y1,35,35,5,5);
                  g.setColor(cobj1);
                  g.fillOval(x1+40,y1+5,27,27);
                  g.setColor(cobj2);
                  g.fillOval(x1+80,y1+5,27,27);
                  g.setColor(cobj3);
                  g.fillOval(x1+120,y1+5,27,27);
                  g.setColor(cobj4);
                  g.fillOval(x1+160,y1+5,27,27);
                  x1=x1-4;
                  if(x1<-200)
                  { x1=530;
                    y1=50+r.nextInt(380);
                  }
                  g.setColor(cobj5);
                  g.fillRoundRect(x2,y2,35,35,5,5);
                  g.setColor(cobj1);
                  g.fillOval(x2+40,y2+5,27,27);
                  g.setColor(cobj2);
                  g.fillOval(x2+80,y2+5,27,27);
                  g.setColor(cobj3);
                  g.fillOval(x2+120,y2+5,27,27);
                  g.setColor(cobj4);
                  g.fillOval(x2+160,y2+5,27,27);
                  x2=x2-5;
                  if(x2<-200)
                  { x2=530;
                    y2=50+r.nextInt(380);
                  }
                  g.setColor(cobj5);
                  g.fillRoundRect(x3,y3,35,35,5,5);
                  g.setColor(cobj1);
                  g.fillOval(x3+40,y3+5,27,27);
                  g.setColor(cobj2);
                  g.fillOval(x3+80,y3+5,27,27);
                  g.setColor(cobj3);
                  g.fillOval(x3+120,y3+5,27,27);
                  g.setColor(cobj4);
                  g.fillOval(x3+160,y3+5,27,27);
                  x3=x3-6;
                  if(x3<-200)
                  { x3=530;
                    y3=50+r.nextInt(380);
                  }
                  Thread.sleep(22);
                  repaint();
                  s++;
                }
                if(f==1)
                { Color cobj=new Color(153,204,204);
                  setBackground(cobj);
                  g.setColor(Color.red);
                  Font fobj=new Font("Arial",Font.BOLD,24);
                  g.setFont(fobj);
                  g.drawString("GAME OVER",200,250);
                }
                showStatus(" SCORE="+s);
              }
              catch(Exception e)
              {}
            }
          };
          add(panel);
        }
        public void mouseClicked(MouseEvent me) 
        { c++;
          if(c%2==1)
          a=-10;
          if(c%2==0)
          a=10;
          repaint();
        }
        public void mousePressed(MouseEvent me)
        {}
        public void mouseReleased(MouseEvent me)
        {}
        public void mouseEntered(MouseEvent me)
        {}
        public void mouseExited(MouseEvent me)
        {}
        public void paint(Graphics g)
        { setSize(500,500);
          super.paint(g);
        }
}