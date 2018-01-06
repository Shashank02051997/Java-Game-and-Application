//Red Dungeon Game
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*<applet code="Red_Dungeon_Game" width=500 height=500>
</applet>*/
public class Red_Dungeon_Game extends JApplet implements KeyListener
{       int k,f,x,y,x1,y1,x2,y2,x3,y3,x4,y4,x5,y5,x6,y6,x7,y7,a,a1,v,i;
        int bx[]=new int[3];
        int by[]=new int[3];
        int a2[]=new int[3];
        int b[]=new int[3];
        int c[]=new int[3];
        int d[]=new int[3];
        int e[]=new int[3];
        int f1[]=new int[3];
        private JPanel panel;
        public void init()
        { addKeyListener(this);
          requestFocus();
          f=1;
          x=200;
          y=200;
          bx[0]=150;
          by[0]=390;
          bx[1]=290;
          by[1]=0;
          bx[2]=70;
          by[2]=200;
          a2[1]=1;
          b[1]=1;
          c[1]=0;
          d[1]=1;
          a2[2]=1;
          b[2]=1;
          c[2]=0;
          d[2]=0;
          panel = new JPanel()
          { protected void paintComponent(Graphics g)
            { super.paintComponent(g);
              setBackground(Color.red);
              try
              { if(f==1)
                { g.setColor(Color.white);
                  g.fillRect(50,0,300,350);
                  g.setColor(Color.black);
                  if(x>=50&&x<=350&&y>=-20&&y<=350)
                  { g.fillOval(x,y,13,13);
                    if(y==-19)
                    { f=2;
                      y=410;
                    }
                  }
                  else
                  { x=200;
                    y=200;
                  }
                }
                else if(f==2)
                { g.setColor(Color.white);
                  g.fillRect(100,100,150,350);
                  g.fillRect(0,10,250,100);
                  g.setColor(Color.black);
                  if(x>=100&&x<=250&&y>=100&&y<=450)
                  g.fillOval(x,y,13,13);
                  else if(x>=-20&&x<=250&&y>=10&&y<=110)
                  { g.fillOval(x,y,13,13);
                    if(x==-19)
                    { f=3;
                      x=410;
                      x1=90;
                      y1=170;
                    }
                  }
                  else
                  { x=200;
                    y=420;
                  }
                }
                else if(f==3)
                { g.setColor(Color.white);
                  g.fillRect(80,100,220,300);
                  g.fillRect(80,10,330,100);
                  g.setColor(Color.red);
                  g.fillRect(x1,y1,50,50);
                  g.setColor(Color.black);
                  if(x>=80&&x<=410&&y>=10&&y<=100)
                  g.fillOval(x,y,13,13);
                  else if(x>=80&&x<=310&&y>=100&&y<=410)
                  { g.fillOval(x,y,13,13);
                    if(y==404)
                    { f=4;
                      y=-10;
                      x1=90;
                      y1=100;
                      x2=90;
                      y2=200;
                      x3=90;
                      y3=320;
                    }
                  }
                  else
                  { x=410;
                    y=50;
                  }
                  if(x1==310)
                  x1=70;
                  if(x>=x1&&x<=x1+50&&y>=y1&&y<=y1+50)
                  { x=410;
                    y=50;
                  }
                  x1++;
                  Thread.sleep(5);
                }
                else if(f==4)
                { g.setColor(Color.white);
                  g.fillRect(80,0,220,400);
                  g.setColor(Color.red);
                  g.fillRect(x1,y1,50,50);
                  g.fillRect(x2,y2,50,50);
                  g.fillRect(x3,y3,50,50);
                  g.setColor(Color.black);
                  if(x>=80&&x<=290&&y>=-10&&y<=410)
                  { g.fillOval(x,y,13,13);
                    if(y==404)
                    { f=5;
                      y=-4;
                      x1=70;
                      y1=130;
                    }
                  }
                  else
                  { x=200;
                    y=-4;
                  }
                  if(x1>=310)
                  x1=70;
                  if(x2>=310)
                  x2=70;
                  if(x3>=310)
                  x3=70;
                  if(x>=x1&&x<=x1+50&&y>=y1&&y<=y1+50)
                  { x=200;
                    y=-4;
                  }
                  if(x>=x2&&x<=x2+50&&y>=y2&&y<=y2+50)
                  { x=200;
                    y=-4;
                  }
                  if(x>=x3&&x<=x3+50&&y>=y3&&y<=y3+50)
                  { x=200;
                    y=-4;
                  }
                  x1=x1+3;
                  x2=x2+2;
                  x3=x3+1;
                  Thread.sleep(13);
                }
                else if(f==5)
                { g.setColor(Color.white);
                  g.fillRect(80,0,220,400);
                  g.setColor(Color.yellow);
                  g.fillRect(80,130,220,190);
                  if(x>=80&&x<=310&&y>=130&&y<=310)
                  a=1;
                  else
                  a=0;
                  g.setColor(Color.red);
                  g.fillRect(x1,y1,50,190);
                  g.setColor(Color.black);
                  if(x>=80&&x<=290&&y>=-10&&y<=410)
                  { g.fillOval(x,y,13,13);
                    if(y==404)
                    { f=6;
                      y=-4;
                    }
                  }
                  else
                  { x=200;
                    y=-4;
                  }
                  if(x1==310)
                  x1=60;
                  if(x>=x1&&x<=x1+50&&y>=y1&&y<=y1+170)
                  { x=200;
                    y=-4;
                  }
                  x1++;
                  Thread.sleep(5);
                }
                else if(f==6)
                { g.setColor(Color.white);
                  g.fillRect(80,0,220,350);
                  g.fillRect(0,150,80,200);
                  g.setColor(Color.black);
                  if(x>=80&&x<=290&&y>=-10&&y<=350)
                  g.fillOval(x,y,13,13);
                  else if(x>=-20&&x<=80&&y>=150&&y<=350)
                  { g.fillOval(x,y,13,13);
                    if(x==-19)
                    { f=7;
                      x=410;
                    }
                  }
                  else
                  { x=200;
                    y=-4;
                  }
                }
                else if(f==7)
                { g.setColor(Color.white);
                  g.fillRect(250,150,150,200);
                  g.fillRect(0,150,150,200);
                  g.setColor(Color.blue);
                  g.fillRect(250,150,40,200);
                  g.fillRect(110,150,40,200);
                  if(x>=250&&x<=280)
                  x=125;
                  g.setColor(Color.black);
                  if(x>=250&&x<=410&&y>=150&&y<=350)
                  g.fillOval(x,y,13,13);
                  else if(x>=-20&&x<=150&&y>=150&&y<=350)
                  { g.fillOval(x,y,13,13);
                    if(x==-19)
                    { f=8;
                      x=410;
                    }
                  }
                  else
                  { x=410;
                    y=250;
                  }
                }
                else if(f==8)
                { a=2;
                  g.setColor(Color.gray);
                  g.fillRect(350,120,50,230);
                  g.fillRect(300,300,50,50);
                  g.fillRect(270,120,30,230);
                  g.fillRect(80,120,190,60);
                  g.fillRect(80,180,50,120);
                  g.fillRect(190,180,50,120);
                  g.fillRect(0,300,240,50);
                  g.setColor(Color.black);
                  if(x>=350&&x<=420&&y>=120&&y<=350)
                  g.fillOval(x,y,13,13);
                  else if(x>=300&&x<=350&&y>=300&&y<=350)
                  g.fillOval(x,y,13,13);
                  else if(x>=270&&x<=300&&y>=120&&y<=350)
                  g.fillOval(x,y,13,13);
                  else if(x>=80&&x<=270&&y>=120&&y<=180)
                  g.fillOval(x,y,13,13);
                  else if(x>=80&&x<=130&&y>=180&&y<=300)
                  g.fillOval(x,y,13,13);
                  else if(x>=190&&x<=240&&y>=180&&y<=300)
                  g.fillOval(x,y,13,13);
                  else if(x>=-20&&x<=240&&y>=300&&y<=350)
                  { g.fillOval(x,y,13,13);
                    if(x==-19)
                    { f=9;
                      x=410;
                      a=0;
                    }
                  }
                  else
                  { x=410;
                    y=250;
                  }
                }
                else if(f==9)
                { g.setColor(Color.white);
                  g.fillRect(0,150,400,200);
                  g.setColor(Color.blue);
                  g.fillRect(110,150,180,200);
                  g.setColor(Color.black);
                  if(y>=150&&y<=350)
                  g.fillOval(x,y,13,13);
                  else
                  { x=410;
                    y=250;
                  }
                  if(x>=110&&x<=230&&y>=150&&y<=350)
                  f=10;
                }
                else if(f==10)
                { g.setColor(Color.white);
                  g.fillRect(110,150,180,200);
                  g.setColor(Color.black);
                  if(x>=110&&x<=290&&y>=150&&y<=420)
                  { g.fillOval(x,y,13,13);
                    if(y==404)
                    { f=11;
                      y=-10;
                    }
                  }
                  else
                  { x=200;
                    y=200;
                  }
                }
                else if(f==11)
                { g.setColor(Color.white);
                  g.fillRect(100,0,200,250);
                  g.fillRect(100,300,200,100);
                  if(a1==0)
                  g.setColor(Color.gray);
                  if(a1==1)
                  g.setColor(Color.cyan);
                  g.fillRect(100,200,200,50);
                  g.fillRect(100,300,200,50);
                  g.setColor(Color.cyan);
                  g.fillRect(100,0,20,50);
                  g.setColor(Color.black);
                  if(x>=100&&x<=200&&y>=200&&y<=250&&a1==1)
                  y=325;
                  if(x>=100&&x<=290&&y>=-16&&y<=250)
                  g.fillOval(x,y,13,13);
                  else if(x>=100&&x<=290&&y>=300&&y<=410)
                  { g.fillOval(x,y,13,13);
                    if(y==403)
                    { f=12;
                      y=-10;
                      x1=170;
                      y1=70;
                      x2=270;
                      y2=110;
                      x3=70;
                      y3=160;
                      x4=140;
                      y4=220;
                      x5=100;
                      y5=290;
                      x6=210;
                      y6=340;
                      x7=70;
                      y7=370;
                    }
                  }
                  else
                  { x=200;
                    y=-10;
                  }
                  if(x>=100&&x<=110&&y>=0&&y<=50)
                  a1=1;
                }
                else if(f==12)
                { g.setColor(Color.white);
                  g.fillRect(70,0,260,410);
                  g.setColor(Color.red);
                  g.fillRect(x1,y1,30,30);
                  g.fillRect(x2,y2,30,30);
                  g.fillRect(x3,y3,40,40);
                  g.fillRect(x4,y4,50,50);
                  g.fillRect(x5,y5,60,60);
                  g.fillRect(x6,y6,40,40);
                  g.fillRect(x7,y7,30,30);
                  g.setColor(Color.black);
                  if(x>=70&&x<=320&&y>=-20&&y<=410)
                  { g.fillOval(x,y,13,13);
                    if(y==404)
                    { f=13;
                      y=-10;
                    }
                  }
                  else
                  { x=200;
                    y=-10;
                  }
                  if(x1>=330)
                  x1=60;
                  if(x2>=310)
                  x2=60;
                  if(x3>=330)
                  x3=60;
                  if(x4>=320)
                  x4=70;
                  if(x5>=310)
                  x5=70;
                  if(x6>=340)
                  x6=60;
                  if(x7>=310)
                  x7=70;
                  if(x>=x1&&x<=x1+30&&y>=y1&&y<=y1+30)
                  { x=200;
                    y=-4;
                  }
                  if(x>=x2&&x<=x2+30&&y>=y2&&y<=y2+30)
                  { x=200;
                    y=-4;
                  }
                  if(x>=x3&&x<=x3+40&&y>=y3&&y<=y3+40)
                  { x=200;
                    y=-4;
                  }
                  if(x>=x4&&x<=x4+50&&y>=y4&&y<=y4+50)
                  { x=200;
                    y=-4;
                  }
                  if(x>=x5&&x<=x5+60&&y>=y5&&y<=y5+60)
                  { x=200;
                    y=-4;
                  }
                  if(x>=x6&&x<=x6+40&&y>=y6&&y<=y6+40)
                  { x=200;
                    y=-4;
                  }
                  if(x>=x7&&x<=x7+30&&y>=y7&&y<=y7+30)
                  { x=200;
                    y=-4;
                  }
                  if(k==37||k==38||k==39||k==40)
                  { x1=x1+3;
                    x2=x2+2;
                    x3=x3+1;
                    x4=x4+3;
                    x5=x5+2;
                    x6=x6+1;
                    x7=x7+1;
                  }
                  k=32;
                  Thread.sleep(15);
                }
                else if(f==13)
                { g.setColor(Color.white);
                  g.fillRect(70,0,260,410);
                  g.setColor(Color.red);
                  g.setColor(Color.black);
                  if(x>=70&&x<=320&&y>=-20&&y<=410)
                  { g.fillOval(x,y,13,13);
                    if(y==404)
                    { f=14;
                      y=-10;
                    }
                  }
                  else
                  { x=200;
                    y=-10;
                  }
                  for(i=0;i<3;i++)
                  { g.setColor(Color.red);
                    g.fillOval(bx[i],by[i],30,30);
                    if(by[i]==390)
                    { if(a2[i]==0&&b[i]==0&&c[i]==0&&d[i]==0)
                      { e[i]=5;
                        f1[i]=-5;
                        a2[i]=1;
                      }
                      else if(a2[i]==1&&b[i]==0&&c[i]==0&&d[i]==0)
                      { e[i]=-5;
                        f1[i]=-5;
                        b[i]=1;
                      }
                      else if(a2[i]==1&&b[i]==1&&c[i]==1&&d[i]==1)
                      { e[i]=5;
                        f1[i]=-5;
                        b[i]=0;
                        c[i]=0;
                        d[i]=0;
                      }
                      else if(a2[i]==1&&b[i]==1&&c[i]==1&&d[i]==0)
                      { e[i]=-5;
                        f1[i]=-5;
                        c[i]=0;
                        d[i]=0;
                      }
                      else if(a2[i]==1&&b[i]==0&&c[i]==1&&d[i]==1)
                      { e[i]=5;
                        f1[i]=-5;
                        c[i]=0;
                        d[i]=0;
                      }
                    }
                    else if(bx[i]==310)
                    { if(a2[i]==1&&b[i]==0&&c[i]==0&&d[i]==0)
                      { e[i]=-5;
                        f1[i]=-5;
                        b[i]=1;
                      }
                      else if(a2[i]==1&&b[i]==1&&c[i]==1&&d[i]==1)
                      { e[i]=-5;
                        f1[i]=5;
                        d[i]=0;
                        b[i]=0;
                        c[i]=0;
                      }
                      else if(a2[i]==0&&b[i]==0&&c[i]==0&&d[i]==0)
                      { e[i]=-5;
                        f1[i]=5;
                        a2[i]=1;
                      }
                      else if(a2[i]==1&&b[i]==0&&c[i]==1&&d[i]==1)
                      { e[i]=-5;
                        f1[i]=5;
                        d[i]=0;
                        c[i]=0;
                      }
                      else if(a2[i]==1&&b[i]==0&&c[i]==0&&d[i]==1)
                      { e[i]=-5;
                        f1[i]=-5;
                        d[i]=0;
                      }
                      else if(a2[i]==1&&b[i]==1&&c[i]==0&&d[i]==1)
                      { e[i]=-5;
                        f1[i]=-5;
                        d[i]=0;
                      }
                    }
                    else if(by[i]==0)
                    { if(a2[i]==1&&b[i]==1&&c[i]==0&&d[i]==0)
                      { e[i]=-5;
                        f1[i]=5;
                        c[i]=1;
                      }
                      else if(a2[i]==1&&b[i]==1&&c[i]==0&&d[i]==1)
                      { e[i]=5;
                        f1[i]=5;
                        c[i]=1;
                      }
                      else if(a2[i]==1&&b[i]==0&&c[i]==0&&d[i]==0)
                      { e[i]=5;
                        f1[i]=5;
                        c[i]=1;
                        d[i]=1;
                      }
                    }
                    else if(bx[i]==70)
                    { if(a2[i]==1&&b[i]==1&&c[i]==1&&d[i]==0)
                      { e[i]=5;
                        f1[i]=5;
                        a2[i]=0;
                        b[i]=0;
                        c[i]=0;
                      }
                      else if(a2[i]==1&&b[i]==1&&c[i]==0&&d[i]==0)
                      { e[i]=5;
                        f1[i]=-5;
                        d[i]=1;
                      }
                      else if(a2[i]==1&&b[i]==0&&c[i]==1&&d[i]==0)
                      { e[i]=-5;
                        f1[i]=5;
                        b[i]=1;
                        d[i]=1;
                      }
                      else if(a2[i]==1&&b[i]==0&&c[i]==0&&d[i]==0)
                      { e[i]=5;
                        f1[i]=5;
                        a2[i]=0;
                      }
                    }
                    bx[i]=bx[i]+e[i];
                    by[i]=by[i]+f1[i];
                  }
                  if(x>=bx[0]&&x<=bx[0]+30&&y>=by[0]&&y<=by[0]+30)
                  { x=200;
                    y=-4;
                  }
                  if(x>=bx[1]&&x<=bx[1]+30&&y>=by[1]&&y<=by[1]+30)
                  { x=200;
                    y=-4;
                  }
                  if(x>=bx[2]&&x<=bx[2]+30&&y>=by[2]&&y<=by[2]+30)
                  { x=200;
                    y=-4;
                  }
                  Thread.sleep(20);
                }
                if(f==14)
                { g.setColor(Color.white);
                  Font fobj=new Font("Arial",Font.ITALIC,24);
                  g.setFont(fobj);
                  g.drawString("GREAT JOB! GAME OVER",60,200);
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
          if(a==0)
          v=3; 
          else if(a==1)
          v=6;
          else if(a==2)
          v=-3;
          if(k==37)
          x=x-v;
          else if(k==39)
          x=x+v;
          else if(k==38)
          y=y-v;
          else if(k==40)
          y=y+v;
          repaint();
        }
        public void keyReleased(KeyEvent ke)
        {}
        public void keyTyped(KeyEvent ke)
        {}
        public void paint(Graphics g)
        { super.paint(g);
          setSize(400,400);
        }
}
