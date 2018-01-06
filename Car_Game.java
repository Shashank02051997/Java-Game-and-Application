//Car Game
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code="vyon94" width=400 height=350>
</applet>*/
public class Car_Game extends Applet implements KeyListener,MouseListener
{       int x=225,y=250,x1,y1,u=180,v=100,p=225,q=150,a=0,z=0,b,k,e=180,f=250,i=225,h=295,flag=0;
        int m1[]=new int[4];
        int m2[]=new int[4];
        public void init()
        { addMouseListener(this);
          addKeyListener(this);
          requestFocus();
          m1[0]=205;
          m2[0]=80;
          m1[1]=205;
          m2[1]=135;
          m1[2]=205;
          m2[2]=200;
          m1[3]=205;
          m2[3]=265;
        }
        public void mouseClicked(MouseEvent me)
        {}
        public void mouseEntered(MouseEvent me)
        {}
        public void mouseExited(MouseEvent me)
        {}
        public void mousePressed(MouseEvent me)
        { x1=me.getX();
          y1=me.getY();
          repaint();
        }
        public void mouseReleased(MouseEvent me)
        {}
        public void keyPressed(KeyEvent ke)
        { k=ke.getKeyCode();
          if(k==37&&z==5)
          a=-5;
          if(k==39&&z==5)
          a=+5;
          if(k==38)
          { b=5;
            z=5;
          }
          repaint();
        }
        public void keyReleased(KeyEvent ke)
        {}
        public void keyTyped(KeyEvent ke)
        {}
        public void paint(Graphics g)
        { try
          { Font fobj=new Font("Arial",Font.BOLD,14);
            g.setColor(Color.LIGHT_GRAY);
            g.fillRect(175,45,60,260);
            g.setColor(Color.white);
            g.fillRect(m1[0],m2[0],5,20);
            g.fillRect(m1[1],m2[1],5,20);
            g.fillRect(m1[2],m2[2],5,20);
            g.fillRect(m1[3],m2[3],5,20);
            if(flag==0)
            { Color c1=new Color(10,240,10);
              Color c2=new Color(240,10,10);
              Color c3=new Color(10,10,240);
              setBackground(Color.white);
              g.setFont(fobj);
              g.setColor(Color.ORANGE);
              g.drawString("CAR GAME",170,20);
              if(x==180&&k==39)
              x=x+a;
              if(x==225&&k==37)
              x=x+a;
              g.setColor(c1);
              g.fillRect(x,y,5,5);
              g.setColor(c2);
              g.fillRect(u,v,5,5);
              g.fillRect(p,q,5,5);
              g.fillRect(e,f,5,5);
              g.fillRect(i,h,5,5);
              g.setColor(c3);
              g.drawLine(170,45,170,305);
              g.drawLine(240,45,240,305);
              g.drawLine(175,45,175,305);
              g.drawLine(235,45,235,305);
              Thread.sleep(80);
              if(x>181&&x<221)
              { x=x+a; 
                repaint();
              }
              v=v+b;
              q=q+b;
              f=f+b;
              h=h+b;
              m2[0]=m2[0]+z;
              m2[1]=m2[1]+z;
              m2[2]=m2[2]+z;
              m2[3]=m2[3]+z;
              repaint(); 
              if(q==300)
              { q=50;
                repaint();
              }
              if(v==300)
              { v=50;
                repaint();
              }
              if(f==300)
              { f=50;
                repaint();
              }
              if(h==300)
              { h=50;
                repaint();
              }
              if(m2[0]==300)
              { m2[0]=50;
                repaint();
              }
              if(m2[1]==300)
              { m2[1]=50;
                repaint();
              }
              if(m2[2]==300)
              { m2[2]=50;
                repaint();
              }
              if(m2[3]==300)
              { m2[3]=50;
                repaint();
              }
              if(x==180&&y==250&&u==180&&v==250)
              { flag=1;
                x1=10;
                y1=10;
                repaint();
              }
              else if(x==225&&y==250&&p==225&&q==250)
              { flag=1;
                x1=10;
                y1=10;
                repaint();
              }
              else if(x==180&&y==250&&e==180&&f==250)
              { flag=1;
                x1=10;
                y1=10;
                repaint();
              }
              else if(x==225&&y==250&&i==225&&h==250)
              { flag=1;
                x1=10;
                y1=10;
                repaint();
              }
            }
            else if(flag==1)
            { Color c11=new Color(10,240,10);
              Color c21=new Color(240,10,10);
              Color c31=new Color(10,10,240);
              setBackground(Color.white);
              g.setFont(fobj);
              g.setColor(Color.ORANGE);
              g.drawString("CAR GAME",170,20);
              g.setColor(c11);
              g.fillRect(x,y+5,5,5);
              g.setColor(c21);
              g.fillRect(u,v,5,5);
              g.fillRect(p,q,5,5);
              g.fillRect(e,f,5,5);
              g.fillRect(i,h,5,5);
              g.setColor(c31);
              g.drawLine(170,45,170,305);
              g.drawLine(240,45,240,305);
              g.drawLine(175,45,175,305);
              g.drawLine(235,45,235,305);
              g.setFont(fobj);
              g.drawString("GAME OVER",65,150);
              g.drawString("CLICK ON BOX",65,170);
              g.drawString("FOR RELOAD",65,190);
              g.setColor(Color.MAGENTA);
              g.fillRect(80,200,20,20);
              g.setColor(Color.WHITE);
              g.drawArc(85,205,10,10,90,270);
              g.drawLine(83,205,89,205);
              g.drawLine(89,205,89,212);
              if(x1>=80&&x1<=100&&y1>=200&&y1<=220)
              { flag=0;
                x=225;
                y=250;
                u=180;
                v=100;
                p=225;
                q=150;
                a=0;
                b=0;
                k=40;
                e=180;
                f=250;
                i=225;
                h=295;
                z=0;
                repaint();
              }
              else
              flag=1;
            }
            setSize(400,350);
          }
          catch(Exception e)
          {}
        }
}


