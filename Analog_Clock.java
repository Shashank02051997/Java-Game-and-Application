//Analog Clock
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.awt.geom.Line2D;
import java.util.*;
import javax.swing.*;
public class Analog_Clock extends JApplet
{ double x,y,i,x1,y1,x3,y3,x4,y4,x5,y5,i1,i2;
  int c,x2,y2,j;
  private JPanel panel;
  public void init()
  { x=140;
    y=140;
    x1=140;
    y1=140;
    x3=140;
    y3=140;
    x4=140;
    y4=140;
    x5=140;
    y5=140;
    c=3;
    panel = new JPanel()
    { protected void paintComponent(Graphics g)
      { super.paintComponent(g);
        try
        { Calendar cal = new GregorianCalendar();
          GregorianCalendar date = new GregorianCalendar();
          int hour=cal.get(Calendar.HOUR);
          int minute =cal.get(Calendar.MINUTE);
          int second =cal.get(Calendar.SECOND);
          if(second<=15)
          { i=95;
            for(int k=0;k<16;k++)
            { if(second==k)
              break;
              else
              i=i-6;
            }
          }
          else
          { i=360;
            for(int k=16;k<60;k++)
            { if(second==k)
              break;
              else
              i=i-6;
            }
          }
          if(minute<=15)
          { i1=90;
            for(int k=0;k<16;k++)
            { if(minute==k)
              break;
              else
              i1=i1-6;
            }
          }
          else
          { i1=354;
            for(int k=16;k<60;k++)
            { if(minute==k)
               break;
               else
               i1=i1-6;
            }
          }
          if(hour<=3)
          { i2=84;
            for(int k=0;k<4;k++)
            { if(hour==k)
              break;
              else
              i2=i2-30;
            }
          }
          else
          { i2=334;
            for(int k=4;k<12;k++)
            { if(hour==k)
              break;
              else
              i2=i2-30;
            }
            if(minute>15&&minute<=30)
            i2=i2-18;
            else if(minute>30&&minute<=45)
            i2=i2-24;
            else if(minute>45&&minute<=59)
            i2=i2-30;
          }
          Graphics2D g2 = (Graphics2D) g;
          g.drawOval(10,10,260,260);
          g.fillOval(134,134,10,10);
          for(j=354;j>=0;j=j-30)
          { x1=x1+110*Math.cos((j*Math.PI)/180);
            y1=y1-110*Math.sin((j*Math.PI)/180);
            x2=(int)x1;
            y2=(int)y1;
            Font fo=new Font("Arial",Font.BOLD,24);
            g.setFont(fo);
            g.drawString(""+c,x2-10,y2+5);
            c=c+1;
            if(c==13)
            c=1;
            x1=140;
            y1=140;
          }
          for(j=354;j>=0;j=j-6)
          { x1=x1+130*Math.cos((j*Math.PI)/180);
            y1=y1-130*Math.sin((j*Math.PI)/180);
            if(j==0||j==30||j==60||j==90||j==120||j==150||j==180||j==210||j==240||j==270||j==300||j==330)
            { x3=x3+110*Math.cos((j*Math.PI)/180);
              y3=y3-110*Math.sin((j*Math.PI)/180);
            }
            else
            { x3=x3+120*Math.cos((j*Math.PI)/180);
              y3=y3-120*Math.sin((j*Math.PI)/180);
            }
            g2.draw(new Line2D.Double(x3,y3,x1,y1));
            x1=140;
            y1=140;
            x3=140;
            y3=140;
          }
          x=x+90*Math.cos((i*Math.PI)/180);
          y=y-90*Math.sin((i*Math.PI)/180);
          x4=x4+80*Math.cos((i1*Math.PI)/180);
          y4=y4-80*Math.sin((i1*Math.PI)/180);
          x5=x5+70*Math.cos((i2*Math.PI)/180);
          y5=y5-70*Math.sin((i2*Math.PI)/180);
          g2.draw(new Line2D.Double(140,140,x,y));
          g2.draw(new Line2D.Double(140,140,x4,y4));
          g2.draw(new Line2D.Double(140,140,x5,y5));
          Thread.sleep(900);
          repaint();
          x=140;
          y=140;
          x4=140;
          y4=140;
          x5=140;
          y5=140;
          showStatus(" hour="+hour+" minute="+minute+" second="+second);
        }
        catch(Exception e)
        {}
      }
    };
    add(panel);
  }
  public void paint(Graphics g)
  { super.paint(g);
    setSize(300,300);
  }
}

       