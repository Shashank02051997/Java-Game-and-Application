//Bouncing Balls
import java.awt.*;
import java.applet.*;
import java.util.Random;
import javax.swing.*;
public class Bouncing_Balls extends JApplet
{ int c1,c2,i,rand1,rand2,rand3;
  int x[]=new int[200];
  int y[]=new int[200];
  int a[]=new int[200];
  int b[]=new int[200];
  int c[]=new int[200];
  int d[]=new int[200];
  int e[]=new int[200];
  int f[]=new int[200];
  int r1[]=new int[200];
  int g1[]=new int[200];
  int b1[]=new int[200];
  int bw[]=new int[200];
  int bh[]=new int[200];
  private JPanel panel;
  public void init()
  { x[0]=50;
    y[0]=380;
    bw[0]=20;
    bh[0]=20;
    for(i=1;i<199;i++)
    x[i]=-50;
    for(i=0;i<199;i++)
    { Random r=new Random();
      rand1=r.nextInt(255);
      rand2=r.nextInt(255);
      rand3=r.nextInt(255);
      r1[i]=rand1;
      g1[i]=rand2;
      b1[i]=rand3;
    }
    panel = new JPanel()
    { protected void paintComponent(Graphics g)
      { super.paintComponent(g);
        try
        { for(i=0;i<199;i++)
          { Color col=new Color(r1[i],g1[i],b1[i]);
            g.setColor(col);
            g.fillOval(x[i],y[i],bw[i],bh[i]);
            if(y[i]==380)
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
              else if(a[i]==1&&b[i]==0&&c[i]==1&&d[i]==1)
              { e[i]=5;
                f[i]=-5;
                c[i]=0;
                d[i]=0;
              }
            }
            else if(x[i]==1080)
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
            else if(x[i]==0)
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
            x[i]=x[i]+e[i];
            y[i]=y[i]+f[i];
            if(y[i]==380&&x[i]==380)
            x[i]=385;
            if(y[i]==0&&x[i]==700)
            x[i]=705;
            if(y[i]==0&&x[i]==380)
            x[i]=385;
            if(y[i]==380&&x[i]==700)
            x[i]=705;
          }
          showStatus("BALL COUNT="+c2);
          Thread.sleep(7);
          repaint();
          c1++;
          if(c1==250)
          { c1=0;
            c2++;
            x[c2]=x[c2-1]-20;
            y[c2]=y[c2-1]+20;
            e[c2]=5;
            f[c2]=5;
            bw[c2]=20;
            bh[c2]=20;
            if(c2==6||c2==12||c2==18||c2==24||c2==30||c2==36||c2==42||c2==48||c2==54||c2==60)
            { bw[c2]=15;
              bh[c2]=15;
            }
            if(c2==9||c2==18||c2==27||c2==37||c2==45||c2==53||c2==63||c2==72||c2==81||c2==90)
            { bw[c2]=25;
              bh[c2]=25;
            }
            if(c2==11||c2==22||c2==33||c2==44||c2==55||c2==66||c2==77||c2==88||c2==99||c2==110)
            { bw[c2]=10;
              bh[c2]=10;
            }
          }
        }
        catch(Exception e)
        {}
      }
    };
    add(panel);
  }
  public void paint(Graphics g)
  { setSize(1120,400);
    super.paint(g);
  }
}
       