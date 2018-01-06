//Battle City
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;
/*<applet code="Battle_City" width=500 height=500>
</applet>*/
public class Battle_City extends JApplet implements KeyListener
{ int k,x,y,x1,y1,x2,y2,x3,y3,x4,y4,a,b,a1,b1,a2,b2,a3,b3,a4,b4,i,i1,i2,i3,i4,j,kc,kc1,kc2,kc3,f1,f2,f3,f4,f5,rand,rand1,rand2,rand3;
  int xb[]=new int[1000];
  int yb[]=new int[1000];
  int ab[]=new int[1000];
  int xb1[]=new int[1000];
  int yb1[]=new int[1000];
  int ab1[]=new int[1000];
  int xb2[]=new int[1000];
  int yb2[]=new int[1000];
  int ab2[]=new int[1000];
  int xb3[]=new int[1000];
  int yb3[]=new int[1000];
  int ab3[]=new int[1000];
  int xb4[]=new int[1000];
  int yb4[]=new int[1000];
  int ab4[]=new int[1000];
  private JPanel panel;
  public void init()
  { addKeyListener(this);
    requestFocus();
    a=1;
    x=250;
    y=250;
    x1=150;
    y1=150;
    x2=50;
    y2=50;
    x3=350;
    y3=350;
    x4=450;
    y4=450;
    i=-1;
    i1=-1;
    i2=-1;
    i3=-1;
    i4=-1;
    kc=150;
    rand=150;
    kc1=150;
    rand1=150;
    kc2=150;
    rand2=150;
    kc3=150;
    rand3=150;
    panel = new JPanel()
    { protected void paintComponent(Graphics g)
      { super.paintComponent(g);
     try
     { Color cobj1=new Color(149,175,146);
       Color cobj2=new Color(149,0,0);
       setBackground(cobj1);
       Color cobj=new Color(27,140,60);
       if(f5==0)
       { if(a==1)
         { g.fillRect(x,y,10,40);
           g.fillRect(x+30,y,10,40);
           g.setColor(cobj);
           g.fillRect(x+5,y+5,30,30);
           g.setColor(Color.BLACK);
           g.fillOval(x+10,y+10,20,20);
           g.setColor(Color.GRAY);
           g.fillRect(x+17,y+2,6,8);
           g.setColor(Color.BLACK);
           g.fillRect(x+18,y-5,4,7);
           y=y-2;
           if(y<=5)
           y=5;
         }
         else if(a==2)
         { g.fillRect(x,y,10,40);
           g.fillRect(x+30,y,10,40);
           g.setColor(cobj);
           g.fillRect(x+5,y+5,30,30);
           g.setColor(Color.BLACK);
           g.fillOval(x+10,y+10,20,20);
           g.setColor(Color.GRAY);
           g.fillRect(x+17,y+30,6,8);
           g.setColor(Color.BLACK);
           g.fillRect(x+18,y+37,4,7);
           y=y+2;
           if(y>=450)
           y=450;
         }
         else if(a==3)
         { g.fillRect(x,y,40,10);
           g.fillRect(x,y+30,40,10);
           g.setColor(cobj);
           g.fillRect(x+5,y+5,30,30);
           g.setColor(Color.BLACK);
           g.fillOval(x+10,y+10,20,20);
           g.setColor(Color.GRAY);
           g.fillRect(x+2,y+17,8,6);
           g.setColor(Color.BLACK);
           g.fillRect(x-4,y+18,7,4);
           x=x-2;
           if(x<=5)
           x=5;
         }
         else if(a==4)
         { g.fillRect(x,y,40,10);
           g.fillRect(x,y+30,40,10);
           g.setColor(cobj);
           g.fillRect(x+5,y+5,30,30);
           g.setColor(Color.BLACK);
           g.fillOval(x+10,y+10,20,20);
           g.setColor(Color.GRAY);
           g.fillRect(x+30,y+17,8,6);
           g.setColor(Color.BLACK);
           g.fillRect(x+37,y+18,7,4);
           x=x+2;
           if(x>=450)
           x=450;
         }
         if(b==1)
         { g.setColor(Color.YELLOW);
           for(j=0;j<=i;j++)
           { if(ab[j]==1)
             yb[j]=yb[j]-10;
           }
           for(j=0;j<=i;j++)
           { if(ab[j]==2)
             yb[j]=yb[j]+10;
           }
           for(j=0;j<=i;j++)
           { if(ab[j]==3)
             xb[j]=xb[j]-10;
           }
           for(j=0;j<=i;j++)
           { if(ab[j]==4)
             xb[j]=xb[j]+10;
           }
           for(j=0;j<1000;j++)
           { if(ab[j]==1||ab[j]==2)
             g.fillOval(xb[j],yb[j],4,8);
             else if(ab[j]==3||ab[j]==4)
             g.fillOval(xb[j],yb[j],8,4);
           }
         }
       }
       if(f1==0)
       { if(kc==rand)
         { Random r=new Random();
           a1=1+r.nextInt(4);
           rand=r.nextInt(150);
           kc=0;
         }
         if(a1==1)
         { g.setColor(Color.BLACK);
           g.fillRect(x1,y1,10,40);
           g.fillRect(x1+30,y1,10,40);
           g.setColor(cobj2);
           g.fillRect(x1+5,y1+5,30,30);
           g.setColor(Color.BLACK);
           g.fillOval(x1+10,y1+10,20,20);
           g.setColor(Color.GRAY);
           g.fillRect(x1+17,y1+2,6,8);
           g.setColor(Color.BLACK);
           g.fillRect(x1+18,y1-5,4,7);
           y1--;
           if(y1<=5)
           { y1=5;
             a1=2;
           }
         }
         else if(a1==2)
         { g.setColor(Color.BLACK);
           g.fillRect(x1,y1,10,40);
           g.fillRect(x1+30,y1,10,40);
           g.setColor(cobj2);
           g.fillRect(x1+5,y1+5,30,30);
           g.setColor(Color.BLACK);
           g.fillOval(x1+10,y1+10,20,20);
           g.setColor(Color.GRAY);
           g.fillRect(x1+17,y1+30,6,8);
           g.setColor(Color.BLACK);
           g.fillRect(x1+18,y1+37,4,7);
           y1++;
           if(y1>=450)
           { y1=450;
             a1=1;
           }
         }
         else if(a1==3)
         { g.setColor(Color.BLACK);
           g.fillRect(x1,y1,40,10);
           g.fillRect(x1,y1+30,40,10);
           g.setColor(cobj2);
           g.fillRect(x1+5,y1+5,30,30);
           g.setColor(Color.BLACK);
           g.fillOval(x1+10,y1+10,20,20);
           g.setColor(Color.GRAY);
           g.fillRect(x1+2,y1+17,8,6);
           g.setColor(Color.BLACK);
           g.fillRect(x1-4,y1+18,7,4);
           x1--;
           if(x1<=5)
           { x1=5;
             a1=4;
           }
         }
         else if(a1==4)
         { g.setColor(Color.BLACK);
           g.fillRect(x1,y1,40,10);
           g.fillRect(x1,y1+30,40,10);
           g.setColor(cobj2);
           g.fillRect(x1+5,y1+5,30,30);
           g.setColor(Color.BLACK);
           g.fillOval(x1+10,y1+10,20,20);
           g.setColor(Color.GRAY);
           g.fillRect(x1+30,y1+17,8,6);
           g.setColor(Color.BLACK);
           g.fillRect(x1+37,y1+18,7,4);
           x1++;
           if(x1>=450)
           { x1=450;
             a1=3;
           }
         }
         if(kc==30||kc==60||kc==90||kc==120||kc==149)
         { b1=1;
           i1++;
           if(a1==1)
           { xb1[i1]=x1+18;
             yb1[i1]=y1-5;
             ab1[i1]=a1;
           }
           else if(a1==2)
           { xb1[i1]=x1+18;
             yb1[i1]=y1+37;
             ab1[i1]=a1;
           }
           else if(a1==3)
           { xb1[i1]=x1-4;
             yb1[i1]=y1+18;
             ab1[i1]=a1;
           }
           else if(a1==4)
           { xb1[i1]=x1+37;
             yb1[i1]=y1+18;
             ab1[i1]=a1;
           }
         }
         if(b1==1)
         { g.setColor(Color.ORANGE);
           for(j=0;j<=i1;j++)
           { if(ab1[j]==1)
             yb1[j]=yb1[j]-10;
           }
           for(j=0;j<=i1;j++)
           { if(ab1[j]==2)
             yb1[j]=yb1[j]+10;
           }
           for(j=0;j<=i1;j++)
           { if(ab1[j]==3)
             xb1[j]=xb1[j]-10;
           }
           for(j=0;j<=i1;j++)
           { if(ab1[j]==4)
             xb1[j]=xb1[j]+10;
           }
           for(j=0;j<1000;j++)
           { if(ab1[j]==1||ab1[j]==2)
             g.fillOval(xb1[j],yb1[j],4,8);
             else if(ab1[j]==3||ab1[j]==4)
             g.fillOval(xb1[j],yb1[j],8,4);
           }
         }
       }
       if(f2==0)
       { if(kc1==rand1)
         { Random r=new Random();
           a2=1+r.nextInt(4);
           rand1=r.nextInt(150);
           kc1=0;
         }
         if(a2==1)
         { g.setColor(Color.BLACK);
           g.fillRect(x2,y2,10,40);
           g.fillRect(x2+30,y2,10,40);
           g.setColor(cobj2);
           g.fillRect(x2+5,y2+5,30,30);
           g.setColor(Color.BLACK);
           g.fillOval(x2+10,y2+10,20,20);
           g.setColor(Color.GRAY);
           g.fillRect(x2+17,y2+2,6,8);
           g.setColor(Color.BLACK);
           g.fillRect(x2+18,y2-5,4,7);
           y2--;
           if(y2<=5)
           { y2=5;
             a2=2;
           }
         }
         else if(a2==2)
         { g.setColor(Color.BLACK);
           g.fillRect(x2,y2,10,40);
           g.fillRect(x2+30,y2,10,40);
           g.setColor(cobj2);
           g.fillRect(x2+5,y2+5,30,30);
           g.setColor(Color.BLACK);
           g.fillOval(x2+10,y2+10,20,20);
           g.setColor(Color.GRAY);
           g.fillRect(x2+17,y2+30,6,8);
           g.setColor(Color.BLACK);
           g.fillRect(x2+18,y2+37,4,7);
           y2++;
           if(y2>=450)
           { y2=450;
             a2=1;
           }
         }
        else if(a2==3)
         { g.setColor(Color.BLACK);
           g.fillRect(x2,y2,40,10);
           g.fillRect(x2,y2+30,40,10);
           g.setColor(cobj2);
           g.fillRect(x2+5,y2+5,30,30);
           g.setColor(Color.BLACK);
           g.fillOval(x2+10,y2+10,20,20);
           g.setColor(Color.GRAY);
           g.fillRect(x2+2,y2+17,8,6);
           g.setColor(Color.BLACK);
           g.fillRect(x2-4,y2+18,7,4);
           x2--;
           if(x2<=5)
           { x2=5;
             a2=4;
           }
         }
         else if(a2==4)
         { g.setColor(Color.BLACK);
           g.fillRect(x2,y2,40,10);
           g.fillRect(x2,y2+30,40,10);
           g.setColor(cobj2);
           g.fillRect(x2+5,y2+5,30,30);
           g.setColor(Color.BLACK);
           g.fillOval(x2+10,y2+10,20,20);
           g.setColor(Color.GRAY);
           g.fillRect(x2+30,y2+17,8,6);
           g.setColor(Color.BLACK);
           g.fillRect(x2+37,y2+18,7,4);
           x2++;
           if(x2>=450)
           { x2=450;
             a2=3;
           }
         }
         if(kc1==30||kc1==60||kc1==90||kc1==120||kc1==149)
         { b2=1;
           i2++;
           if(a2==1)
           { xb2[i2]=x2+18;
             yb2[i2]=y2-5;
             ab2[i2]=a2;
           }
           else if(a2==2)
           { xb2[i2]=x2+18;
             yb2[i2]=y2+37;
             ab2[i2]=a2;
           }
           else if(a2==3)
           { xb2[i2]=x2-4;
             yb2[i2]=y2+18;
             ab2[i2]=a2;
           }
           else if(a2==4)
           { xb2[i2]=x2+37;
             yb2[i2]=y2+18;
             ab2[i2]=a2;
           }
         }
         if(b2==1)
         { g.setColor(Color.ORANGE);
           for(j=0;j<=i2;j++)
           { if(ab2[j]==1)
             yb2[j]=yb2[j]-10;
           }
           for(j=0;j<=i2;j++)
           { if(ab2[j]==2)
             yb2[j]=yb2[j]+10;
           }
           for(j=0;j<=i2;j++)
           { if(ab2[j]==3)
             xb2[j]=xb2[j]-10;
           }
           for(j=0;j<=i2;j++)
           { if(ab2[j]==4)
             xb2[j]=xb2[j]+10;
           }
           for(j=0;j<1000;j++)
           { if(ab2[j]==1||ab2[j]==2)
             g.fillOval(xb2[j],yb2[j],4,8);
             else if(ab2[j]==3||ab2[j]==4)
             g.fillOval(xb2[j],yb2[j],8,4);
           }
         }
       }
       if(f3==0)
       { if(kc2==rand2)
         { Random r=new Random();
           a3=1+r.nextInt(4);
           rand2=r.nextInt(150);
           kc2=0;
        }
        if(a3==1)
        { g.setColor(Color.BLACK);
          g.fillRect(x3,y3,10,40);
          g.fillRect(x3+30,y3,10,40);
          g.setColor(cobj2);
          g.fillRect(x3+5,y3+5,30,30);
          g.setColor(Color.BLACK);
          g.fillOval(x3+10,y3+10,20,20);
          g.setColor(Color.GRAY);
          g.fillRect(x3+17,y3+2,6,8);
          g.setColor(Color.BLACK);
          g.fillRect(x3+18,y3-5,4,7);
          y3--;
          if(y3<=5)
          { y3=5;
            a3=2;
          }
        }
        else if(a3==2)
        { g.setColor(Color.BLACK);
          g.fillRect(x3,y3,10,40);
          g.fillRect(x3+30,y3,10,40);
          g.setColor(cobj2);
          g.fillRect(x3+5,y3+5,30,30);
          g.setColor(Color.BLACK);
          g.fillOval(x3+10,y3+10,20,20);
          g.setColor(Color.GRAY);
          g.fillRect(x3+17,y3+30,6,8);
          g.setColor(Color.BLACK);
          g.fillRect(x3+18,y3+37,4,7);
          y3++;
          if(y3>=450)
          { y3=450;
            a3=1;
          }
       }
       else if(a3==3)
       { g.setColor(Color.BLACK);
         g.fillRect(x3,y3,40,10);
         g.fillRect(x3,y3+30,40,10);
         g.setColor(cobj2);
         g.fillRect(x3+5,y3+5,30,30);
         g.setColor(Color.BLACK);
         g.fillOval(x3+10,y3+10,20,20);
         g.setColor(Color.GRAY);
         g.fillRect(x3+2,y3+17,8,6);
         g.setColor(Color.BLACK);
         g.fillRect(x3-4,y3+18,7,4);
         x3--;
         if(x3<=5)
         { x3=5;
           a3=4;
         }
       }
       else if(a3==4)
       { g.setColor(Color.BLACK);
         g.fillRect(x3,y3,40,10);
         g.fillRect(x3,y3+30,40,10);
         g.setColor(cobj2);
         g.fillRect(x3+5,y3+5,30,30);
         g.setColor(Color.BLACK);
         g.fillOval(x3+10,y3+10,20,20);
         g.setColor(Color.GRAY);
         g.fillRect(x3+30,y3+17,8,6);
         g.setColor(Color.BLACK);
         g.fillRect(x3+37,y3+18,7,4);
         x3++;
         if(x3>=450)
         { x3=450;
           a3=3;
         }
       }
       if(kc2==30||kc2==60||kc2==90||kc2==120||kc2==149)
       { b3=1;
         i3++;
         if(a3==1)
         { xb3[i3]=x3+18;
           yb3[i3]=y3-5;
           ab3[i3]=a3;
         }
         else if(a3==2)
         { xb3[i3]=x3+18;
           yb3[i3]=y3+37;
           ab3[i3]=a3;
         }
         else if(a3==3)
         { xb3[i3]=x3-4;
           yb3[i3]=y3+18;
           ab3[i3]=a3;
         }
         else if(a3==4)
         { xb3[i3]=x3+37;
           yb3[i3]=y3+18;
           ab3[i3]=a3;
         }
       }
       if(b3==1)
       { g.setColor(Color.ORANGE);
         for(j=0;j<=i3;j++)
         { if(ab3[j]==1)
           { yb3[j]=yb3[j]-10;
           }
         }
         for(j=0;j<=i3;j++)
         { if(ab3[j]==2)
           { yb3[j]=yb3[j]+10;
           }
         }
         for(j=0;j<=i3;j++)
         { if(ab3[j]==3)
           { xb3[j]=xb3[j]-10;
           }
         }
         for(j=0;j<=i3;j++)
         { if(ab3[j]==4)
           { xb3[j]=xb3[j]+10;
           }
         }
         for(j=0;j<1000;j++)
         { if(ab3[j]==1||ab3[j]==2)
           g.fillOval(xb3[j],yb3[j],4,8);
           else if(ab3[j]==3||ab3[j]==4)
           g.fillOval(xb3[j],yb3[j],8,4);
         }
       }
       }
       if(f4==0)
       { if(kc3==rand3)
         { Random r=new Random();
           a4=1+r.nextInt(4);
           rand3=r.nextInt(150);
           kc3=0;
         }
         if(a4==1)
         { g.setColor(Color.BLACK);
           g.fillRect(x4,y4,10,40);
           g.fillRect(x4+30,y4,10,40);
           g.setColor(cobj2);
           g.fillRect(x4+5,y4+5,30,30);
           g.setColor(Color.BLACK);
           g.fillOval(x4+10,y4+10,20,20);
           g.setColor(Color.GRAY);
           g.fillRect(x4+17,y4+2,6,8);
           g.setColor(Color.BLACK);
           g.fillRect(x4+18,y4-5,4,7);
           y4--;
           if(y4<=5)
           { y4=5;
             a4=2;
           }
         }
         else if(a4==2)
         { g.setColor(Color.BLACK);
           g.fillRect(x4,y4,10,40);
           g.fillRect(x4+30,y4,10,40);
           g.setColor(cobj2);
           g.fillRect(x4+5,y4+5,30,30);
           g.setColor(Color.BLACK);
           g.fillOval(x4+10,y4+10,20,20);
           g.setColor(Color.GRAY);
           g.fillRect(x4+17,y4+30,6,8);
           g.setColor(Color.BLACK);
           g.fillRect(x4+18,y4+37,4,7);
           y4++;
           if(y4>=450)
           { y4=450;
             a4=1;
           }
         }
         else if(a4==3)
         { g.setColor(Color.BLACK);
           g.fillRect(x4,y4,40,10);
           g.fillRect(x4,y4+30,40,10);
           g.setColor(cobj2);
           g.fillRect(x4+5,y4+5,30,30);
           g.setColor(Color.BLACK);
           g.fillOval(x4+10,y4+10,20,20);
           g.setColor(Color.GRAY);
           g.fillRect(x4+2,y4+17,8,6);
           g.setColor(Color.BLACK);
           g.fillRect(x4-4,y4+18,7,4);
           x4--;
           if(x4<=5)
           { x4=5;
             a4=4;
           }
         }
         else if(a4==4)
         { g.setColor(Color.BLACK);
           g.fillRect(x4,y4,40,10);
           g.fillRect(x4,y4+30,40,10);
           g.setColor(cobj2);
           g.fillRect(x4+5,y4+5,30,30);
           g.setColor(Color.BLACK);
           g.fillOval(x4+10,y4+10,20,20);
           g.setColor(Color.GRAY);
           g.fillRect(x4+30,y4+17,8,6);
           g.setColor(Color.BLACK);
           g.fillRect(x4+37,y4+18,7,4);
           x4++;
           if(x4>=450)
           { x4=450;
             a4=3;
           }
         }
         if(kc3==30||kc3==60||kc3==90||kc3==120||kc3==149)
         { b4=1;
           i4++;
           if(a4==1)
           { xb4[i4]=x4+18;
             yb4[i4]=y4-5;
             ab4[i4]=a4;
           }
           else if(a4==2)
           { xb4[i4]=x4+18;
             yb4[i4]=y4+37;
             ab4[i4]=a4;
           }
           else if(a4==3)
           { xb4[i4]=x4-4;
             yb4[i4]=y4+18;
             ab4[i4]=a4;
           }
           else if(a4==4)
           { xb4[i4]=x4+37;
             yb4[i4]=y4+18;
             ab4[i4]=a4;
           }
         }
         if(b4==1)
         { g.setColor(Color.ORANGE);
           for(j=0;j<=i4;j++)
           { if(ab4[j]==1)
             yb4[j]=yb4[j]-10;
           }
           for(j=0;j<=i4;j++)
           { if(ab4[j]==2)
             yb4[j]=yb4[j]+10;
           }
           for(j=0;j<=i4;j++)
           { if(ab4[j]==3)
             xb4[j]=xb4[j]-10;
           }
           for(j=0;j<=i4;j++)
           { if(ab4[j]==4)
             xb4[j]=xb4[j]+10;
           }
           for(j=0;j<1000;j++)
           { if(ab4[j]==1||ab4[j]==2)
             g.fillOval(xb4[j],yb4[j],4,8);
             else if(ab4[j]==3||ab4[j]==4)
             g.fillOval(xb4[j],yb4[j],8,4);
           }
         }
       }
       if(i!=-1)
       { for(j=0;j<1000;j++)
         { if(xb[j]>=x1&&xb[j]<=x1+40&&yb[j]>=y1&&yb[j]<=y1+40)
           { f1=1;
             break;
           }
           if(xb[j]>=x2&&xb[j]<=x2+40&&yb[j]>=y2&&yb[j]<=y2+40)
           { f2=1;
             break;
           }
           if(xb[j]>=x3&&xb[j]<=x3+40&&yb[j]>=y3&&yb[j]<=y3+40)
           { f3=1;
             break;
           }
           if(xb[j]>=x4&&xb[j]<=x4+40&&yb[j]>=y4&&yb[j]<=y4+40)
           { f4=1;
             break;
           }
         }
       }
       if(i1!=-1&&i2!=-1&&i3!=-1&&i4!=-1)
       { for(j=0;j<1000;j++)
         { if(xb1[j]>=x&&xb1[j]<=x+40&&yb1[j]>=y&&yb1[j]<=y+40)
           { f5=1;
             break;
           }
           if(xb2[j]>=x&&xb2[j]<=x+40&&yb2[j]>=y&&yb2[j]<=y+40)
           { f5=1;
             break;
           }
           if(xb3[j]>=x&&xb3[j]<=x+40&&yb3[j]>=y&&yb3[j]<=y+40)
           { f5=1;
             break;
           }
           if(xb4[j]>=x&&xb4[j]<=x+40&&yb4[j]>=y&&yb4[j]<=y+40)
           { f5=1;
             break;
           }
         }
       }
       if(f1==0)
       kc++;
       if(f2==0)
       kc1++;
       if(f3==0)
       kc2++;
       if(f4==0)
       kc3++;
       Thread.sleep(70);
       repaint();
       //showStatus(" x="+x+" y="+y);
     }
     catch(Exception e)
     {}
      }
    };
    add(panel);
  }
  public void keyPressed(KeyEvent ke)
  {}
  public void keyReleased(KeyEvent ke)
  { if(f5==0)
    { k=ke.getKeyCode();
      if(k==38)
      a=1;
      else if(k==40)
      a=2;
      else if(k==37)
      a=3;
      else if(k==39)
      a=4;
      if(k==32)
      { b=1;
        i++;
        if(a==1)
        { xb[i]=x+18;
          yb[i]=y-5;
          ab[i]=a;
        }
        else if(a==2)
        { xb[i]=x+18;
          yb[i]=y+37;
          ab[i]=a;
        }
        else if(a==3)
        { xb[i]=x-4;
          yb[i]=y+18;
          ab[i]=a;
        }
        else if(a==4)
        { xb[i]=x+37;
          yb[i]=y+18;
          ab[i]=a;
        }
      }
      repaint();
    }
  }
  public void keyTyped(KeyEvent ke)
  {}
  public void paint(Graphics g)
  {  setSize(500,500);
     super.paint(g);

  }
}
