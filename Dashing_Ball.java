//Dashing Ball
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*<applet code="Dashing_Ball" width=600 height=600>
 </applet>*/
public class Dashing_Ball extends JApplet implements KeyListener
{ int k,l=0,l1,l2,z=0,s=0;
  int x[]=new int[6];
  int y[]=new int[6];
  int a[]=new int[6];
  int b[]=new int[6];
  int c[]=new int[6];
  int d[]=new int[6];
  int e[]=new int[6];
  int f[]=new int[6];
  private JPanel panel;
  public void init()
  { addKeyListener(this);
    requestFocus();
    l1=280;
    l2=340;
    x[0]=200;
    y[0]=480;
    x[1]=280;
    y[1]=360;
    e[1]=5;
    f[1]=5;
    x[2]=70;
    y[2]=390;
    e[2]=-5;
    f[2]=5;
    x[3]=80;
    y[3]=360;
    e[3]=5;
    f[3]=-5;
    x[4]=710;
    y[4]=170;
    e[4]=-5;
    f[4]=5;
    x[5]=170;
    y[5]=290;
    e[5]=5;
    f[5]=5;
    panel = new JPanel()
    { protected void paintComponent(Graphics g)
      { super.paintComponent(g);
        try
        { if(s==0)
          repaint();
          Thread.sleep(10);
          if(z==1)
          { l1=l1+l;
            l2=l2+l;
            z=0;
          }
          if(l2<=0)
          { l1=-60;
            l2=0;
          }
          else if(l1>=500)
          { l1=500;
            l2=560;
          }
          setBackground(Color.BLACK);
          g.setColor(Color.white);
          g.fillRect(400,0,10,l1);
          g.fillRect(400,l2,10,500);
          g.setColor(Color.red);
          g.drawString("RED BALL",180,20);
          g.fillOval(x[0],y[0],20,20);
          g.setColor(Color.red);
          g.fillOval(x[1],y[1],20,20);
          g.setColor(Color.red);
          g.fillOval(x[2],y[2],20,20);
          g.setColor(Color.CYAN);
          g.drawString("BLUE BALL",560,20);
          g.fillOval(x[3],y[3],20,20);
          g.setColor(Color.cyan);
          g.fillOval(x[4],y[4],20,20);
          g.setColor(Color.cyan);
          g.fillOval(x[5],y[5],20,20);
          for(int i=0;i<=5;i++)
          { if(y[i]==480)
            { if(a[i]==0&&b[i]==0&&c[i]==0&&d[i]==0)
              { e[i]=5;
                f[i]=-5;
               a[i]=1;
              }
              else if(a[i]==1&&b[i]==0&&c[i]==0&&d[i]==0)
              { e[i]=-5;
                f[i]=-5;
                b[i]=1;
              }
              else if(a[i]==1&&b[i]==1&&c[i]==1&&d[i]==1)
              { e[i]=5;
                f[i]=-5;
                b[i]=0;
                c[i]=0;
                d[i]=0;
              }
              else if(a[i]==1&&b[i]==1&&c[i]==1&&d[i]==0)
              { e[i]=-5;
                f[i]=-5;
                c[i]=0;
                d[i]=0;
              }
            }
            else if(x[i]==380||x[i]==780)
            { if(a[i]==1&&b[i]==0&&c[i]==0&&d[i]==0)
              { e[i]=-5;
                f[i]=-5;
                b[i]=1;
              }
              else if(a[i]==1&&b[i]==1&&c[i]==1&&d[i]==1)
              { e[i]=-5;
                f[i]=5;
                d[i]=0;
                b[i]=0;
                c[i]=0;
              }
              else if(a[i]==0&&b[i]==0&&c[i]==0&&d[i]==0)
              { e[i]=-5;
                f[i]=5;
                a[i]=1;
              }
              else if(a[i]==1&&b[i]==0&&c[i]==1&&d[i]==1)
              { e[i]=-5;
                f[i]=5;
                d[i]=0;
                c[i]=0;
              }
              else if(a[i]==1&&b[i]==0&&c[i]==0&&d[i]==1)
              { e[i]=-5;
                f[i]=-5;
                d[i]=0;
              }
              else if(a[i]==1&&b[i]==1&&c[i]==0&&d[i]==1)
              { e[i]=-5;
                f[i]=-5;
                d[i]=0;
              }
            }
            else if(y[i]==0)
            { if(a[i]==1&&b[i]==1&&c[i]==0&&d[i]==0)
              { e[i]=-5;
                f[i]=5;
                c[i]=1;
              }
              else if(a[i]==1&&b[i]==1&&c[i]==0&&d[i]==1)
              { e[i]=5;
                f[i]=5;
                c[i]=1;
              }
              else if(a[i]==1&&b[i]==0&&c[i]==0&&d[i]==0)
              { e[i]=5;
                f[i]=5;
                c[i]=1;
                d[i]=1;
              }
            }
            else if(x[i]==0||x[i]==400)
            { if(a[i]==1&&b[i]==1&&c[i]==1&&d[i]==0)
              { e[i]=5;
                f[i]=5;
                a[i]=0;
                b[i]=0;
                c[i]=0;
              }
              else if(a[i]==1&&b[i]==1&&c[i]==0&&d[i]==0)
              { e[i]=5;
                f[i]=-5;
                d[i]=1;
              }
              else if(a[i]==1&&b[i]==0&&c[i]==1&&d[i]==0)
              { e[i]=-5;
                f[i]=5;
                b[i]=1;
                d[i]=1;
              }
              else if(a[i]==1&&b[i]==0&&c[i]==0&&d[i]==0)
              { e[i]=5;
                f[i]=5;
                a[i]=0;
              }
            }
            if(y[i]==5&&x[i]==5)
            { y[i]=10;
              x[i]=5;
            }
            if(y[i]==5&&x[i]==775)
            { y[i]=10;
              x[i]=775;
            }
            if(y[i]==475&&x[i]==5)
            { y[i]=470;
              x[i]=5;
            }
            if(y[i]==475&&x[i]==775)
            { y[i]=470;
              x[i]=775;
            }
            if(x[i]==405&&y[i]==475)
            { x[i]=405;
              y[i]=470;
            }
            if(x[i]==375&&y[i]==475)
            { x[i]=375;
              y[i]=470;
            }
            if(x[i]==405&&y[i]==5)
            { x[i]=405;
              y[i]=10;
            }
            if(x[i]==375&&y[i]==5)
            { x[i]=375;
              y[i]=10;
            }
            x[i]=x[i]+e[i];
            y[i]=y[i]+f[i];
            if(l1<y[i]&&l2>y[i]&&x[i]==380)
            { x[i]=x[i]+e[i];
              y[i]=y[i]+f[i];
            }
            else if(l1<y[i]&&l2>y[i]&&x[i]==400)
            { x[i]=x[i]+e[i];
              y[i]=y[i]+f[i];
            }
          }
          if(x[0]<390&&x[1]<390&&x[2]<390&&x[3]>390&&x[4]>390&&x[5]>390)
          { s=1;
            Thread.sleep(10000);
          }
         }
         catch (Exception e)
         {}
      }
    };
    add(panel);
  }
  public void keyPressed(KeyEvent ke)
  { k=ke.getKeyCode();
    if(k==38)
    { l=-10;
      z=1;
    }
    else if(k==40)
    { l=10;
      z=1;
    }
    repaint();
  }
  public void keyReleased(KeyEvent e)
  {}
  public void keyTyped(KeyEvent ke)
  {}
  public void paint(Graphics g)
  { super.paint(g);
    setSize(800, 500);
  }

}
