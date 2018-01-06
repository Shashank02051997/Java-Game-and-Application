//Snake Game
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;
/*<applet code="Snake_Game" width=420 height=420>
</applet>*/
public class Snake_Game extends JApplet implements KeyListener,MouseListener
{       int x=200,y=250,x1,y1,a=0,b=0,c=0,k,d=0,i=0,f=1,f1=260,f2=350,flag=0;
        int p[]=new int[1000];
        int q[]=new int[1000];
        private JPanel panel;
        public void paint(Graphics g)
        { super.paint(g);
          setSize(420,420);
        }
        public void init()
        { addKeyListener(this);
          addMouseListener(this);
          requestFocus();
          p[0]=195;
          q[0]=250;
          panel = new JPanel()
          { protected void paintComponent(Graphics g)
            { super.paintComponent(g);
              if(flag==0)
              { Color cobj=new Color(142,236,253);
                g.setColor(cobj);
                g.fillRect(20,20,390,390);
                g.setColor(Color.BLACK);
                g.drawRect(20,20,390,390);
                Color c1=new Color(10,240,10);
                try
                { if(k==37)
                  { x=x+c;
                    for(i=f;i>0;i--)
                    { p[i]=p[i-1];
                      q[i]=q[i-1];
                    }
                    p[0]=x-c;
                    q[0]=y;
                  }
                  else if(k==38)
                  { y=y-b;
                    for(i=f;i>0;i--)
                    { p[i]=p[i-1];
                      q[i]=q[i-1];
                    }
                    p[0]=x;
                    q[0]=y+b;
                  }
                  else if(k==39)
                  { x=x+a;
                    for(i=f;i>0;i--)
                    { p[i]=p[i-1];
                      q[i]=q[i-1];
                    }
                    p[0]=x-a;
                    q[0]=y;
                  }
                  else if(k==40)
                  { y=y-d;
                    for(i=f;i>0;i--)
                    { p[i]=p[i-1];
                      q[i]=q[i-1];
                    }
                    p[0]=x;
                    q[0]=y+d;
                  }
                  if(x>395)
                  { flag=1;
                    x1=10;
                    y1=10;
                    repaint();
                  }
                  if(y<25)
                  { flag=1;
                    x1=10;
                    y1=10;
                    repaint();
                  }
                  if(x<25)
                  { flag=1;
                    x1=10;
                    y1=10;
                    repaint();
                  }
                  if(y>395)
                  { flag=1;
                    x1=10;
                    y1=10;
                    repaint();
                  }
                  showStatus("            SCORE="+(f-1)*8);
                  Font fobj=new Font("Arial",Font.BOLD,15);
                  g.setFont(fobj);
                  g.setColor(Color.BLUE);
                  g.drawString("SNAKE GAME",180,14);
                  g.setColor(c1);
                  g.fillOval(x,y,10,10);
                  for(i=0;i<f;i++)
                  g.fillRect(p[i],q[i],10,10);
                  g.setColor(Color.RED);
                  for(i=0;i<f;i++)
                  g .fillRect(p[i]+3,q[i]+3,4,4);
                  g.fillRect(f1,f2,10,10);
                  Thread.sleep(50);
                  if(x==f1&&y==f2||x==f1&&y==f2-5||x==f1&&y==f2+5||x==f1-5&&y==f2||x==f1+5&&y==f2)
                  { f++;
                    Random r1=new Random();
                    Random r2=new Random();
                    f1=20+r1.nextInt(380);
                    f2=20+r2.nextInt(380);
                    if(f1%5==1)
                    f1=f1+4;
                    else if(f1%5==2)
                    f1=f1+3;
                    else if(f1%5==3)
                    f1=f1+2;
                    else if(f1%5==4)
                    f1=f1+1;
                    else if(f1%5==0)
                    f1=f1+0;
                    if(f2%5==1)
                    f2=f2+4;
                    else if(f2%5==2)
                    f2=f2+3;
                    else if(f2%5==3)
                    f2=f2+2;
                    else if(f2%5==4)
                    f2=f2+1;
                    else if(f2%5==0)
                    f2=f2+0;
                  }
                  for(i=0;i<f;i++)
                  { if(x==p[i]&&y==q[i])
                    flag=1;
                    x1=10;
                    y1=10;
                  }
                  repaint();
                }
                catch(Exception e)
                {}
              }
              else if(flag==1)
              { Color cobj=new Color(142,236,253);
                g.setColor(cobj);
                g.fillRect(20,20,390,390);
                g.setColor(Color.BLACK);
                g.drawRect(20,20,390,390);
                Color c11=new Color(10,240,10);
                g.setColor(c11);
                g.fillOval(x,y,10,10);
                for(i=0;i<f;i++)
                g.fillRect(p[i],q[i],10,10);
                g.setColor(Color.RED);
                for(i=0;i<f;i++)
                g.fillRect(p[i]+3,q[i]+3,4,4);
                Font fobj=new Font("Arial",Font.BOLD,15);
                g.setFont(fobj);
                g.setColor(Color.BLUE);
                g.drawString("SNAKE GAME",180,14);
                g.setColor(Color.BLUE);
                g.drawString("GAME OVER",162,150);
                g.drawString("CLICK ON BOX",162,170);
                g.drawString("FOR RELOAD",162,190);
                g.setColor(Color.MAGENTA);
                g.fillRect(190,200,20,20);
                g.setColor(Color.WHITE);
                g.drawArc(195,205,10,10,90,270);
                g.drawLine(193,205,199,205);
                g.drawLine(199,205,199,212);
                if(x1>=190&&x1<=210&&y1>=200&&y1<=220)
                { flag=0;
                  p[0]=195;q[0]=250;
                  x=200;y=250;a=0;b=0;c=0;k=41;d=0;i=0;f=1;f1=260;f2=350;
                  repaint();
                }
                else
                flag=1;
              }
            }
          };
         add(panel);
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
          if(k==37)
          { if(a>0)
            { k=39;
              b=0;
              d=0;
              repaint();
            }
            else
            { c=-5;
              b=0;
              d=0;
              repaint();
            }
          }
          if(k==38)
          { if(d<0)
            { k=40;
              a=0;
              c=0;
              repaint();
            }
            else
            { b=5;
              a=0;
              c=0;
              repaint();
            }
          }
          if(k==39)
          { if(c<0)
            { k=37;
              b=0;
              d=0;
              repaint();
            }
            else
            { a=5;
              b=0;
              d=0;
              repaint();
            }
          }
          if(k==40)
          { if(b>0)
            { k=38;
              a=0;
              c=0;
              repaint();
            }
            else
            { d=-5;
              a=0;
              c=0;
              repaint();
            }
          }
        }
        public void keyReleased(KeyEvent ke)
        {}
        public void keyTyped(KeyEvent ke)
        {}
}


