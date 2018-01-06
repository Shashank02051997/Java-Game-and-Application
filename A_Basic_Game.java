//A Basic Game
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;
/*<applet code="A_Basic_Game" width=400 height=400>
</applet>*/
public class A_Basic_Game extends JApplet implements KeyListener
{       int k,x,i,j,z,z1,z2,c,k1,f,l,t;
        int xb[]=new int[10000];
        int yb[]=new int[10000];
        int xb1[]=new int[10000];
        int yb1[]=new int[10000];
        int x1[]=new int[35];
        int y1[]=new int[35];
        int a[]=new int[35];
        int b[]=new int[10000];
        private JPanel panel;
        public void init()
        { addKeyListener(this);
          requestFocus();
          x=300;
          x1[0]=10;
          y1[0]=20;
          for(j=0;j<35;j++)
          a[j]=1;
          panel = new JPanel()
          { protected void paintComponent(Graphics g)
            { super.paintComponent(g);
              try
              { setBackground(Color.BLACK);
                if(t<480)
                z=20;
                if(t>=480&&t<600)
                z=50;
                if(t>=600&&t<800)
                z=80;
                if(t>=800)
                z=110;
                if(f==0)
                { g.setColor(Color.RED);
                  g.fillRect(x,400,30,30);
                  if(x<=0)
                  x=0;
                  if(x>=570)
                  x=570;
                  for(j=0;j<i;j++)
                  { g.setColor(Color.CYAN);
                    g.fillRect(xb[j],yb[j],5,10);
                    yb[j]=yb[j]-5;
                  }
                }
                for(j=0;j<33;j++)
                { x1[j+1]=x1[j]+25;
                  y1[j]=z;
                  if(j==10||j==21)
                  { x1[j+1]=x1[0];
                    z=z+25;
                  }
                  if(x1[0]==10)
                  z1=2;
                  else if(x1[0]==324)
                  z1=-2;
                  x1[j]=x1[j]+z1;
                }
                g.setColor(Color.GREEN);
                for(j=0;j<33;j++)
                { if(a[j]==1)
                  g.fillOval(x1[j],y1[j],20,20);
                }
                if(c==25)
                { Random r=new Random();
                  for(j=0;j<10000;j++)
                  { z2=r.nextInt(33);
                    if(a[z2]==1)
                    { xb1[k1]=x1[z2];
                      yb1[k1]=y1[z2];
                      j=10000;
                    }
                  }
                  k1++;
                  c=0;
                }
                for(j=0;j<k1;j++)
                { g.setColor(Color.ORANGE);
                  g.fillRect(xb1[j],yb1[j],5,10);
                  yb1[j]=yb1[j]+5;
                }
                for(j=0;j<k1;j++)
                { if(xb1[j]>=x&&xb1[j]<=x+30&&yb1[j]>=400&&yb1[j]<=430)
                  f=1;
                }
                for(j=0;j<33;j++)
                { for(l=0;l<i;l++)
                  { if(xb[l]>=x1[j]&&xb[l]<=x1[j]+20&&yb[l]>=y1[j]&&yb[l]<=y1[j]+20&&a[j]==1)
                    { a[j]=0;
                      yb[l]=-20;
                    }
                  }
                }
                c++;
                t++;
                Thread.sleep(40);
                repaint();
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
          x=x-5;
          if(k==39)
          x=x+5;
          repaint();
        }
        public void keyReleased(KeyEvent ke)
        { if(k==32&&f==0)
          { xb[i]=x+13;
            yb[i]=400;
            i++;
          }
          repaint();
        }
        public void keyTyped(KeyEvent ke)
        {}
        public void paint(Graphics g)
        { setSize(600,430);
          super.paint(g);
        }
}
