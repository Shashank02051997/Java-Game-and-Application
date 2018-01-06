//Digital Clock 2
import java.awt.*;
import java.applet.*;
import java.util.*;
/*<applet code="vyon95" width=750 height=200>
</applet>*/
public class Digital_Clock_2 extends Applet
{ int a,j,temp;
  int t[]=new int[6];
  public void paint(Graphics g)
  { setSize(750,200);
    Calendar cal = new GregorianCalendar();
    GregorianCalendar date = new GregorianCalendar();
    int hour=cal.get(Calendar.HOUR);
    int minute =cal.get(Calendar.MINUTE);
    int second =cal.get(Calendar.SECOND);
    j=0;
    if(hour<10)
    { t[0]=0;
      t[1]=hour;
      j=2;
    }
    else
    { while(hour>0)
      { t[j]=hour%10;
        hour=hour/10;
        j++;
      }
    }
    if(minute<10)
    { t[2]=0;
      t[3]=minute;
      j=4;
    }
    else
    { while(minute>0)
      { t[j]=minute%10;
        minute=minute/10;
        j++;
        if(minute==0)
        { temp=t[2];
          t[2]=t[3];
          t[3]=temp;
        }
      }
    }
    if(second<10)
    { t[4]=0;
      t[5]=second;
      j=6;
    }
    else
    { while(second>0)
      { t[j]=second%10;
        second=second/10;
        j++;
        if(second==0)
        { temp=t[4];
          t[4]=t[5];
          t[5]=temp;
        }
      }
    }
    for(int i=0;i<6;i++)
    { if(i==0)
      a=0;
      else if(i==1)
      a=100;
      else if(i==2)
      a=250;
      else if(i==3)
      a=350;
      else if(i==4)
      a=500;
      else if(i==5)
      a=600;
      int x1[]={10+a,90+a,80+a,20+a};
      int y1[]={10,10,20,20};
      int x2[]={20+a,80+a,90+a,10+a};
      int y2[]={160,160,170,170};
      int x3[]={85+a,95+a,95+a,85+a};
      int y3[]={20,10,90,80};
      int x4[]={85+a,95+a,95+a,85+a};
      int y4[]={100,90,170,160};
      int x5[]={5+a,15+a,15+a,5+a};
      int y5[]={10,20,80,90};
      int x6[]={5+a,15+a,15+a,5+a};
      int y6[]={90,100,160,170};
      int x7[]={10+a,20+a,80+a,90+a,80+a,20+a};
      int y7[]={90,85,85,90,95,95};
      if(t[i]==0)
      { g.fillPolygon(x1,y1,4);
        g.fillPolygon(x2,y2,4);
        g.fillPolygon(x3,y3,4);
        g.fillPolygon(x4,y4,4);
        g.fillPolygon(x5,y5,4);
        g.fillPolygon(x6,y6,4);
      }
      else if(t[i]==1)
      { g.fillPolygon(x3,y3,4);
        g.fillPolygon(x4,y4,4);
      }
      else if(t[i]==2)
      { g.fillPolygon(x1,y1,4);
        g.fillPolygon(x2,y2,4);
        g.fillPolygon(x3,y3,4);
        g.fillPolygon(x6,y6,4);
        g.fillPolygon(x7,y7,6);
      }
      else if(t[i]==3)
      { g.fillPolygon(x1,y1,4);
        g.fillPolygon(x2,y2,4);
        g.fillPolygon(x3,y3,4);
        g.fillPolygon(x4,y4,4);
        g.fillPolygon(x7,y7,6);
      }
      else if(t[i]==4)
      { g.fillPolygon(x3,y3,4);
        g.fillPolygon(x4,y4,4);
        g.fillPolygon(x5,y5,4);
        g.fillPolygon(x7,y7,6);
      }
      else if(t[i]==5)
      { g.fillPolygon(x1,y1,4);
        g.fillPolygon(x2,y2,4);
        g.fillPolygon(x4,y4,4);
        g.fillPolygon(x5,y5,4);
        g.fillPolygon(x7,y7,6);
      }
      else if(t[i]==6)
      { g.fillPolygon(x1,y1,4);
        g.fillPolygon(x2,y2,4);
        g.fillPolygon(x4,y4,4);
        g.fillPolygon(x5,y5,4);
        g.fillPolygon(x6,y6,4);
        g.fillPolygon(x7,y7,6);
      }
      else if(t[i]==7)
      { g.fillPolygon(x1,y1,4);
        g.fillPolygon(x3,y3,4);
        g.fillPolygon(x4,y4,4);
      }
      else if(t[i]==8)
      { g.fillPolygon(x1,y1,4);
        g.fillPolygon(x2,y2,4);
        g.fillPolygon(x3,y3,4);
        g.fillPolygon(x4,y4,4);
        g.fillPolygon(x5,y5,4);
        g.fillPolygon(x6,y6,4);
        g.fillPolygon(x7,y7,6);
      }
      else if(t[i]==9)
      { g.fillPolygon(x1,y1,4);
        g.fillPolygon(x2,y2,4);
        g.fillPolygon(x3,y3,4);
        g.fillPolygon(x4,y4,4);
        g.fillPolygon(x5,y5,4);
        g.fillPolygon(x7,y7,6);
      }
    }
    g.fillRect(220,30,15,15);
    g.fillRect(220,130,15,15);
    g.fillRect(470,30,15,15);
    g.fillRect(470,130,15,15);
    try{
      Thread.sleep(500);
    }
    catch(Exception e)
    {}
    repaint();
  }
}