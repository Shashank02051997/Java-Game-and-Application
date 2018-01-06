//Squash Square Game
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*<applet code="Squash_Square_Game
" width=500 height=500>
</applet>*/
public class Squash_Square_Game extends JApplet implements KeyListener
{       int k,x,y,bx,by,x1,y1,e1,e2,c,f,v1,v2,v3,v4,v5,v6,v7,v8,v9,v10,a,b,a1,b1,a2,b2,a3,b3,z;
        boolean k1,k2,k3,k4;
        private JPanel panel;
        public void init()
        { addKeyListener(this);
          requestFocus();
          x=200;
          y=420;
          x1=50;
          y1=50;
          panel = new JPanel()
          { protected void paintComponent(Graphics g)
            { super.paintComponent(g);
              try
              { setBackground(Color.white);
                Color cobj=new Color(153,253,170);
                if(f==0)
                { g.setColor(cobj);
                  g.fillRect(x1,y1,30,30);
                  if(x>=x1-40&&x<=x1+30&&y>=y1-40&&y<=y1+30)
                  { f=1;
                    x1=400;
                    y1=400;
                    x=0;
                    y=0;
                  }
                  if(x<0)
                  x=0;
                  if(y<0)
                  y=0;
                  if(x>460)
                  x=460;
                  if(y>400)
                  y=400;
                }
                if(f==1)
                { g.setColor(Color.black);
                  g.fillRect(0,100,400,50);
                  g.setColor(Color.red);
                  g.fillRect(100,300,400,50);
                  g.setColor(cobj);
                  g.fillRect(x1,y1,30,30);
                  if(x>=x1-40&&x<=x1+30&&y>=y1-40&&y<=y1+30)
                  { f=2;
                    x1=235;
                    y1=0;
                    x=200;
                    y=450;
                  }
                  if(x<0)
                  x=0;
                  if(y<0)
                  y=0;
                  if(x>460)
                  x=460;
                  if(y>400)
                  y=400;
                  if(x>=0&&x<=400&&y>=60&&y<=150)
                  { y=by;
                    x=bx;
                  }
                  if(x>=60&&x<=500&&y>=260&&y<=350)
                  { y=0;
                    x=0;
                  }
                }
                if(f==2)
                { g.setColor(Color.red);
                  g.fillRect(0,0,220,50);
                  g.fillRect(280,0,220,50);
                  g.fillRect(60,130,380,50);
                  g.fillRect(v1,250,40,40);
                  v1=v1+a;
                  if(v1>=460)
                  a=-1;
                  else if(v1<=0)
                  a=1;
                  g.setColor(cobj);
                  g.fillRect(x1,y1,30,30);
                  if(x>=x1-40&&x<=x1+30&&y>=y1-40&&y<=y1+30)
                  { f=3;
                    x1=50;
                    y1=50;
                    x=200;
                    y=450;
                    v1=250;
                    v2=100;
                  }
                  if(x<0)
                  x=0;
                  if(y<0)
                  y=0;
                  if(x>460)
                  x=460;
                  if(y>400)
                  y=400;
                  if(x>=0&&x<=220&&y>=0&&y<=50)
                  { x=200;
                    y=450;
                  }
                  if(x>=240&&x<=500&&y>=0&&y<=50)
                  { x=200;
                    y=450;
                  }
                  if(x>=20&&x<=440&&y>=92&&y<=180)
                  { x=200;
                    y=450;
                  }
                  if(x>=v1-40&&x<=v1+40&&y>=210&&y<=290)
                  { x=200;
                    y=450;
                  }
                  Thread.sleep(4);
                }
                if(f==3)
                { g.setColor(Color.red);
                  g.fillRect(v1,v2,40,40);
                  v1=v1+a;
                  v2=v2+b;
                  if(v1>x)
                  a=-1;
                  else if(v1<x)
                  a=1;    
                  else if(x==v1)
                  a=0;
                  if(v2>y)
                  b=-1;    
                  else if(v2<y)
                  b=1;    
                  else if(y==v2)
                  b=0;
                  g.setColor(cobj);
                  g.fillRect(x1,y1,30,30);
                  if(x>=x1-40&&x<=x1+30&&y>=y1-40&&y<=y1+30)
                  { f=4;
                    x1=400;
                    y1=400;
                    x=0;
                    y=0;
                  }
                  if(x<0)
                  x=0;
                  if(y<0)
                  y=0;
                  if(x>460)
                  x=460;
                  if(y>400)
                  y=400;
                  if(x>=v1-40&&x<=v1+40&&y>=v2-40&&y<=v2+40)
                  { x=200;
                    y=450;
                    v1=250;
                    v2=100;
                  }
                  Thread.sleep(12);
                }
                if(f==4)
                { g.fillRect(160,0,40,200);
                  g.fillRect(0,160,160,40);
                  g.setColor(Color.CYAN);
                  g.fillRect(110,110,50,50);
                  g.fillRect(110,350,50,50);
                  g.setColor(cobj);
                  g.fillRect(x1,y1,30,30);
                  if(x>=x1-40&&x<=x1+30&&y>=y1-40&&y<=y1+30)
                  { f=5;
                    x1=250;
                    y1=50;
                    x=250;
                    y=450;
                    v1=50;
                    v2=400;
                    v3=420;
                    v4=400;
                  }
                  if(x<0)
                  x=0;
                  if(y<0)
                  y=0;
                  if(x>460)
                  x=460;
                  if(y>400)
                  y=400;
                  if(x>=120&&x<=200&&y>=0&&y<=200)
                  { y=by;
                    x=bx;
                  }
                  if(x>=0&&x<=160&&y>=120&&y<=200)
                  { y=by;
                    x=bx;
                  }
                  if(x>=70&&x<=160&&y>=70&&y<=160)
                  { x=140;
                    y=380;
                  }
                }
                if(f==5)
                { g.setColor(Color.red);
                  g.fillRect(v1,v2,40,40);
                  v1=v1+a;
                  v2=v2+b;
                  if(v1>x)
                  a=-1;
                  else if(v1<x)
                  a=1;
                  else if(x==v1)
                  a=0;
                  if(v2>y)
                  b=-1;
                  else if(v2<y)
                  b=1;
                  else if(y==v2)
                  b=0;
                  g.fillRect(v3,v4,40,40);
                  v3=v3+a1;
                  v4=v4+b1;
                  if(v3>x)
                  a1=-1;
                  else if(v3<x)
                  a1=1;
                  else if(x==v3)
                  a1=0;
                  if(v4>y)
                  b1=-1;
                  else if(v4<y)
                  b1=1;
                  else if(y==v4)
                  b1=0;
                  g.setColor(cobj);
                  g.fillRect(x1,y1,30,30);
                  if(x>=x1-40&&x<=x1+30&&y>=y1-40&&y<=y1+30)
                  { f=6;
                    x1=400;
                    y1=220;
                    x=0;
                    y=0;
                  }
                  if(x<0)
                  x=0;
                  if(y<0)
                  y=0;
                  if(x>460)
                  x=460;
                  if(y>400)
                  y=400;
                  if(x>=v1-40&&x<=v1+40&&y>=v2-40&&y<=v2+40||x>=v3-40&&x<=v3+40&&y>=v4-40&&y<=v4+40)
                  { x=250;
                    y=450;
                    v1=50;
                    v2=400;
                    v3=420;
                    v4=400;
                  }
                  Thread.sleep(10);
                }
                if(f==6)
                { g.setColor(Color.red);
                  g.fillRect(0,150,500,40);
                  g.fillRect(0,300,500,40);
                  g.setColor(Color.CYAN);
                  g.fillRect(50,100,50,50);
                  g.fillRect(160,100,50,50);
                  g.fillRect(270,100,50,50);
                  g.fillRect(380,100,50,50);
                  g.fillRect(50,220,50,50);
                  g.fillRect(50,340,50,50);
                  g.fillRect(220,340,50,50);
                  g.fillRect(380,340,50,50);
                  g.setColor(cobj);
                  g.fillRect(x1,y1,30,30);
                  if(x>=x1-40&&x<=x1+30&&y>=y1-40&&y<=y1+30)
                  { f=7;
                    x1=400;
                    y1=400;
                    x=50;
                    y=0;
                  }
                  if(x<0)
                  x=0;
                  if(y<0)
                  y=0;
                  if(x>460)
                  x=460;
                  if(y>400)
                  y=400;
                  if(x>=0&&x<=500&&y>=110&&y<=190)
                  { x=0;
                    y=0;
                  }
                  if(x>=0&&x<=500&&y>=260&&y<=340)
                  { x=0;
                    y=0;
                  }
                  if(x>=10&&x<=100&&y>=60&&y<=150)
                  { x=340;
                    y=360;
                  }
                  if(x>=120&&x<=210&&y>=60&&y<=150)
                  { x=70;
                    y=240;
                  }
                  if(x>=230&&x<=320&&y>=60&&y<=150)
                  { x=240;
                    y=360;
                  }
                  if(x>=340&&x<=430&&y>=60&&y<=150)
                  { x=70;
                    y=360;
                  }
                }
                if(f==7)
                { g.fillRect(160,0,40,200);
                  g.fillRect(0,160,160,40);
                  g.setColor(Color.CYAN);
                  g.fillRect(0,0,10,50);
                  g.fillRect(110,350,50,50);
                  g.setColor(cobj);
                  g.fillRect(x1,y1,30,30);
                  if(x>=x1-40&&x<=x1+30&&y>=y1-40&&y<=y1+30)
                  { f=8;
                    x1=250;
                    y1=100;
                    x=250;
                    y=340;
                  }
                  if(x<0)
                  x=0;
                  if(y<0)
                  y=0;
                  if(x>460)
                  x=460;
                  if(y>400)
                  y=400;
                  if(x>=120&&x<=200&&y>=0&&y<=200)
                  { y=by;
                    x=bx;
                  }
                  if(x>=0&&x<=160&&y>=120&&y<=200)
                  { y=by;
                    x=bx;
                  }
                  if(x>=0&&x<=10&&y>=0&&y<=50)
                  { x=140;
                    y=380;
                  }
                }
                if(f==8)
                { setBackground(Color.red);
                  g.setColor(Color.white);
                  g.fillRect(50,50,400,350);
                  g.setColor(cobj);
                  g.fillRect(x1,y1,30,30);
                  if(x<=50||x>=412||y<=48||y>=360)
                  { x=250;
                    y=340;
                  }
                  if(x>=x1-40&&x<=x1+30&&y>=y1-40&&y<=y1+30)
                  { f=9;
                    x1=448;
                    y1=356;
                    x=48;
                    y=348;
                    v1=210;
                    v2=210;
                    a=1;
                    b=-1;
                  }
                  if(x<0)
                  x=0;
                  if(y<0)
                  y=0;
                  if(x>460)
                  x=460;
                  if(y>400)
                  y=400;
                }
                if(f==9)
                { setBackground(Color.red);
                  g.setColor(Color.white);
                  g.fillRect(40,40,60,360);
                  g.fillRect(100,40,50,50);
                  g.fillRect(150,40,60,360);
                  g.fillRect(210,350,50,50);
                  g.fillRect(260,40,50,360);
                  g.fillRect(310,40,60,50);
                  g.fillRect(370,40,60,360);
                  g.fillRect(430,350,70,50);
                  g.setColor(Color.red);
                  g.fillRect(v1,130,40,40);
                  g.fillRect(v2,270,40,40);
                  v1=v1+a;
                  v2=v2+b;
                  if(v1>460)
                  a=-1;
                  else if(v1<0)
                  a=1;
                  if(v2>460)
                  b=-1;
                  else if(v2<0)
                  b=1;
                  g.setColor(cobj);
                  g.fillRect(x1,y1,30,30);
                  if(x>=x1-40&&x<=x1+30&&y>=y1-40&&y<=y1+30)
                  { f=10;
                    x1=450;
                    y1=50;
                    x=50;
                    y=350;
                    v1=150;
                    v2=100;
                    v3=250;
                    v4=100;
                    v5=450;
                    v6=200;
                    v7=450;
                    v8=300;
                  }
                  if(x>=v1-40&&x<=v1+40&&y>=90&&y<=170)
                  { x=48;
                    y=348;
                  }
                  if(x>=v2-40&&x<=v2+40&&y>=230&&y<=310)
                  { x=48;
                    y=348;
                  }
                  if(x>=40&&x<=60&&y>=40&&y<=360)
                  {}
                  else if(x>=60&&x<=112&&y>=40&&y<=52)
                  {}
                  else if(x>=112&&x<=172&&y>=40&&y<=360)
                  {}
                  else if(x>=172&&x<=224&&y>=350&&y<=360)
                  {}
                  else if(x>=224&&x<=272&&y>=40&&y<=360)
                  {}
                  else if(x>=272&&x<=332&&y>=40&&y<=52)
                  {}
                  else if(x>=332&&x<=392&&y>=40&&y<=360)
                  {}
                  else if(x>=392&&x<=420&&y>=350&&y<=360)
                  {}
                  else
                  { x=48;
                    y=348;
                  }
                  Thread.sleep(8);
                }
                if(f==10)
                { g.setColor(Color.red);
                  g.fillRect(v1,v2,40,40);
                  v1=v1+a;
                  v2=v2+b;
                  if(v1>x)
                  a=-1;
                  else if(v1<x)
                  a=1;
                  else if(x==v1)
                  a=0;
                  if(v2>y)
                  b=-1;
                  else if(v2<y)
                  b=1;
                  else if(y==v2)
                  b=0;
                  g.fillRect(v3,v4,40,40);
                  v3=v3+a1;
                  v4=v4+b1;
                  if(v3>x)
                  a1=-1;
                  else if(v3<x)
                  a1=1;
                  else if(x==v3)
                  a1=0;
                  if(v4>y)
                  b1=-1;
                  else if(v4<y)
                  b1=1;
                  else if(y==v4)
                  b1=0;
                  g.fillRect(v5,v6,40,40);
                  v5=v5+a2;
                  v6=v6+b2;
                  if(v5>x)
                  a2=-1;
                  else if(v5<x)
                  a2=1;
                  else if(x==v5)
                  a2=0;
                  if(v6>y)
                  b2=-1;
                  else if(v6<y)
                  b2=1;
                  else if(y==v6)
                  b2=0;
                  g.fillRect(v7,v8,40,40);
                  v7=v7+a3;
                  v8=v8+b3;
                  if(v7>x)
                  a3=-1;
                  else if(v7<x)
                  a3=1;
                  else if(x==v7)
                  a3=0;
                  if(v8>y)
                  b3=-1;
                  else if(v8<y)
                  b3=1;
                  else if(y==v8)
                  b3=0;
                  g.setColor(cobj);
                  g.fillRect(x1,y1,30,30);
                  if(x>=x1-40&&x<=x1+30&&y>=y1-40&&y<=y1+30)
                  { f=11;
                    x1=50;
                    y1=400;
                    x=450;
                    y=50;
                    v1=0;
                    v2=0;
                    v3=394;
                    v4=394;
                    v5=140;
                    v6=140;
                    v7=180;
                    v8=180;
                    a2=-1;
                    a3=1;
                  }
                  if(x<0)
                  x=0;
                  if(y<0)
                  y=0;
                  if(x>460)
                  x=460;
                  if(y>400)
                  y=400;
                  if(x>=v1-40&&x<=v1+40&&y>=v2-40&&y<=v2+40||x>=v3-40&&x<=v3+40&&y>=v4-40&&y<=v4+40||x>=v5-40&&x<=v5+40&&y>=v6-40&&y<=v6+40||x>=v7-40&&x<=v7+40&&y>=v8-40&&y<=v8+40)
                  { x=50;
                    y=350;
                    v1=100;
                    v2=100;
                    v3=250;
                    v4=100;
                    v5=450;
                    v6=200;
                    v7=450;
                    v8=320;
                  }
                  Thread.sleep(16);
                }
                if(f==11)
                { z=1;
                  Color cb=new Color(195,234,243);
                  g.setColor(cb);
                  g.fillRect(108,108,240,240);
                  g.setColor(Color.red);
                  g.fillRect(v1,v2,50,50);
                  v1=v1+a;
                  v2=v2+a;
                  if(v1>400)
                  a=-1;
                  else if(v1<0)
                  a=1;
                  g.fillRect(v3,v4,50,50);
                  v3=v3+a1;
                  v4=v4+a1;
                  if(v3>400)
                  a1=-1;
                  else if(v3<0)
                  a1=1;
                  g.fillRect(v5,v6,50,50);
                  v5=v5+a2;
                  v6=v6+a2;
                  if(v5>400)
                  a2=-1;
                  else if(v5<0)
                  a2=1;
                  g.fillRect(v7,v8,50,50);
                  v7=v7+a3;
                  v8=v8+a3;
                  if(v7>400)
                  a3=-1;
                  else if(v7<0)
                  a3=1;
                  g.setColor(cobj);
                  g.fillRect(x1,y1,30,30);
                  if(x>=x1-40&&x<=x1+30&&y>=y1-40&&y<=y1+30)
                  { f=12;
                    z=0;
                    x1=240;
                    y1=40;
                    x=240;
                    y=390;
                    v1=0;
                    v2=460;
                    v3=220;
                    v4=260;
                  }
                  if(x<0)
                  x=0;
                  if(y<0)
                  y=0;
                  if(x>460)
                  x=460;
                  if(y>400)
                  y=400;
                  if(x>=v1-50&&x<=v1+50&&y>=v2-50&&y<=v2+50||x>=v3-50&&x<=v3+50&&y>=v4-50&&y<=v4+50||x>=v5-50&&x<=v5+50&&y>=v6-50&&y<=v6+50||x>=v7-50&&x<=v7+50&&y>=v8-50&&y<=v8+50)
                  { x=450;
                    y=50;
                  }
                  Thread.sleep(6);
                }         
                if(f==12)
                { g.setColor(Color.red);
                  g.fillRect(v1,90,40,40);
                  g.fillRect(v3,140,40,40);
                  g.fillRect(v1,190,40,40);
                  g.fillRect(v3,240,40,40);
                  g.fillRect(v1,290,40,40);
                  g.fillRect(v2,90,40,40);
                  g.fillRect(v4,140,40,40);
                  g.fillRect(v2,190,40,40);
                  g.fillRect(v4,240,40,40);
                  g.fillRect(v2,290,40,40);
                  if(v1==0)
                  a=1;
                  if(v1==460)
                  a=-1;
                  if(v2==0)
                  a1=1;
                  if(v2==460)
                  a1=-1; 
                  if(v3==0)
                  a2=1;
                  if(v3==460)
                  a2=-1;
                  if(v4==0)
                  a3=1;
                  if(v4==460)
                  a3=-1;
                  v1=v1+a;
                  v2=v2+a1;
                  v3=v3+a2;
                  v4=v4+a3;
                  g.setColor(cobj);
                  g.fillRect(x1,y1,30,30);
                  if(x>=x1-40&&x<=x1+30&&y>=y1-40&&y<=y1+30)
                  { f=13;
                  }
                  if(x<0)
                  x=0;
                  if(y<0)
                  y=0;
                  if(x>460)
                  x=460;
                  if(y>400)
                  y=400;
                  if(x>=v1-40&&x<=v1+40&&y>=250&&y<=330||x>=v1-40&&x<=v1+40&&y>=150&&y<=230||x>=v1-40&&x<=v1+40&&y>=40&&y<=130||x>=v2-40&&x<=v2+40&&y>=240&&y<=330||x>=v2-40&&x<=v2+40&&y>=150&&y<=240||x>=v2-40&&x<=v2+40&&y>=40&&y<=130)
                  { x=240;
                    y=390;
                  }
                  if(x>=v3-40&&x<=v3+40&&y>=100&&y<=180||x>=v3-40&&x<=v3+40&&y>=210&&y<=280||x>=v4-40&&x<=v4+40&&y>=100&&y<=180||x>=v4-40&&x<=v4+40&&y>=210&&y<=280)
                  { x=240;
                    y=390;
                  }
                  Thread.sleep(6);
                }
                if(f==13)
                { setBackground(Color.RED);
                  g.setColor(Color.white);
                  Font fobj=new Font("Arial",Font.ITALIC,24);
                  g.setFont(fobj);
                  g.drawString("GREAT JOB! GAME OVER",80,200);
                }
                if(f!=13)
                { g.setColor(Color.black);
                  if(c<=3700)
                  { g.fillRect(x,y,40,40);
                    g.setColor(Color.white);
                    g.fillRect(x+3,y+3,34,34);
                    g.setColor(Color.black);
                    g.fillOval(x+8+e1,y+10+e2,7,7);
                    g.fillOval(x+24+e1,y+10+e2,7,7);
                  }
                  if(c>3700)
                  { g.fillRect(x,y,40,40);
                    g.setColor(Color.white);
                    g.fillRect(x+3,y+3,34,34);
                    g.setColor(Color.black);
                    g.fillOval(x+10+e1,y+12+e2,4,3);
                    g.fillOval(x+26+e1,y+12+e2,4,3);
                  }
                  if(c==4000)
                  c=0;
                  c++;
                }
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
          k1=true;
          if(k==39)
          k3=true;
          if(k==38)
          k2=true;
          if(k==40)
          k4=true;
          if(k1==true)
          { bx=x;
            if(z==0)
            { x=x-4;
              e1=-3;
            }
            else if(z==1)
            { x=x+4;
              e1=3;
            }
          }
          if(k3==true)
          { bx=x;
            if(z==0)
            { x=x+4;
              e1=3;
            }
            else if(z==1)
            { x=x-4;
              e1=-3;
            }
          }
          if(k2==true)
          { by=y;
            if(z==0)
            { y=y-4;
              e2=-3;
            }
            else if(z==1)
            { y=y+4;
              e2=3;
            }
          }
          if(k4==true)
          { by=y;
            if(z==0)
            { y=y+4;
              e2=3;
            }
            else if(z==1)
            { y=y-4;
              e2=-3;
            }
          }
          repaint();
        }
        public void keyReleased(KeyEvent ke)
        { k=ke.getKeyCode();
          if(k==37)
          { k1=false;
            e1=0;
          }
          if(k==39)
          { k3=false;
            e1=0;
          }
          if(k==38)
          { k2=false;
            e2=0;
          }
          if(k==40)
          { k4=false;
            e2=0;
          }
          repaint();
        }
        public void keyTyped(KeyEvent ke)
        {}
        public void paint(Graphics g)
        { super.paint(g);
          setSize(500,450);
        }
}
