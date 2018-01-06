//Find Green balls Game
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;
/*<applet code="Find_Green_balls_Game" width=400 height=400>
 </applet>
 */
public class Find_Green_balls_Game extends JApplet implements KeyListener
{       int k,bx,by,rand1,rand2,a1,b1,i,l,f,c2;
        int a[]=new int[20];
        int b[]=new int[20];
        int c[]=new int[20];
        int c1[]=new int[20];
        int d[]=new int[20];
        int x[]=new int[20];
        int y[]=new int[20];
        int e[]=new int[20];
        int x1[]=new int[20];
        int y1[]=new int[20];
        double s,s1;
        boolean k1,k2,k3,k4;
        private JPanel panel;
        public void init()
        { addKeyListener(this);
          requestFocus();
          bx=200;
          by=200;
          x[0]=50;
          y[0]=100;
          x[1]=100;
          y[1]=100;
          x[2]=150;
          y[2]=100;
          x[3]=200;
          y[3]=100;
          x[4]=250;
          y[4]=100;
          x[5]=300;
          y[5]=100;
          x[6]=350;
          y[6]=100;
          x[7]=50;
          y[7]=300;
          x[8]=100;
          y[8]=300;
          x[9]=150;
          y[9]=300;
          x[10]=200;
          y[10]=300;
          x[11]=250;
          y[11]=300;
          x1[12]=300;
          y1[12]=300;
          l=12;
          panel = new JPanel()
          { protected void paintComponent(Graphics g)
            { try
              { super.paintComponent(g);
                Font fobj=new Font("Arial",Font.BOLD,16);
                setBackground(Color.black);
                g.setFont(fobj);
                if(f==0&&l!=0)
                { g.setColor(Color.gray);
                  g.fillOval(bx-70,by-70,155,155);
                  g.setColor(Color.pink);
                  g.fillOval(bx,by,15,15);
                  for(i=0;i<12;i++)
                  { s=(x[i]+7-bx-8)*(x[i]+7-bx-8)+(y[i]+7-by-8)*(y[i]+7-by-8)-78*78;
                    s1=(x[i]+7-bx-8)*(x[i]+7-bx-8)+(y[i]+7-by-8)*(y[i]+7-by-8)-48*48;
                    if(x[i]<-20)
                    x[i]=410;
                    else if(x[i]>410)
                    x[i]=-10;
                    else if(y[i]<-20)
                    y[i]=410;
                    else if(y[i]>410)
                    y[i]=-10;
                    if(c[i]==0&&s>0)
                    { Random r=new Random();
                      rand1=1+r.nextInt(3);
                      rand2=1+r.nextInt(3);
                      if(rand1==1&&rand2==1)
                      c[i]=-1;
                      if(rand1==1)
                      a[i]=0;
                      else if(rand1==2)
                      a[i]=1;
                      else if(rand1==3)
                      a[i]=-1;
                      if(rand2==1)
                      b[i]=0;
                      else if(rand2==2)
                      b[i]=1;
                      else if(rand2==3)
                      b[i]=-1;
                    }
                    else if(s<=0)
                    { if(e[i]==0)
                      { g.setColor(Color.green);
                        g.fillOval(x[i],y[i],15,15);
                      }
                      if(c1[i]==1)
                      { d[i]=Math.abs(x[i]-bx);
                        if(d[i]<=50)
                        { if(x[i]-bx<0)
                          a[i]=-1;
                          if(x[i]-bx>0)
                          a[i]=1;
                          if(x[i]-bx==0)
                          a[i]=0;
                          if(y[i]-by<0)
                          b[i]=-1;
                          if(y[i]-by>0)
                          b[i]=1;
                          if(y[i]-by==0)
                          b[i]=0;
                        }
                      }
                      if(c1[i]==0&&s1<=0)
                      { a[i]=-1*a[i];
                        b[i]=-1*b[i];
                        c1[i]=1;
                      }
                    }
                    else
                    { if(e[i]==0)
                      { g.setColor(Color.black);
                        g.fillOval(x[i],y[i],15,15);
                      }
                      c1[i]=0;
                    }
                    x[i]=x[i]+a[i];
                    y[i]=y[i]+b[i];
                    if(bx>=x[i]-7&&bx<=x[i]+15&&by>=y[i]-7&&by<=y[i]+15)
                    { e[i]=1;
                      l--;
                      x[i]=410;
                      y[i]=410;
                      c[i]=300;
                      c1[i]=2;
                    }
                  }
                  x1[0]=x1[0]+a1;
                  y1[0]=y1[0]+b1;
                  if(x1[0]<-20)
                  x1[0]=410;
                  else if(x1[0]>410)
                  x1[0]=-10;
                  else if(y1[0]<-20)
                  y1[0]=410;
                  else if(y1[0]>410)
                  y1[0]=-10;
                  s=(x1[0]+7-bx-8)*(x1[0]+7-bx-8)+(y1[0]+7-by-8)*(y1[0]+7-by-8)-78*78;
                  if(s>0)
                  { Random r=new Random();
                    rand1=1+r.nextInt(3);
                    rand2=1+r.nextInt(3);
                    if(c2==0)
                    { if(rand1==1)
                      a1=0;
                      else if(rand1==2)
                      a1=1;
                      else if(rand1==3)
                      a1=-1;
                      if(rand2==1)
                      b1=0;
                      else if(rand2==2)
                      b1=1;
                      else if(rand2==3)
                      b1=-1;
                    }
                    g.setColor(Color.black);
                    g.fillOval(x1[0],y1[0],15,15);
                  }
                  else if(s<=0)
                  { if(x1[0]-bx<0)
                    a1=1;
                    if(x1[0]-bx>0)
                    a1=-1;
                    if(x1[0]-bx==0)
                    a1=0;
                    if(y1[0]-by<0)
                    b1=1;
                    if(y1[0]-by>0)
                    b1=-1;
                    if(y1[0]-by==0)
                    b1=0;
                    g.setColor(Color.red);
                    g.fillOval(x1[0],y1[0],15,15);
                  }
                  if(bx>=x1[0]&&bx<=x1[0]+7&&by>=y1[0]&&by<=y1[0]+7)
                  f=1;
                  g.setColor(Color.MAGENTA);
                  g.drawString("Enemies left: "+l,260,20);
                  if(bx<=0)
                  bx=0;
                  else if(bx>=385)
                  bx=385;
                  else if(by<=0)
                  by=0;
                  else if(by>=385)
                  by=385;
                  for(i=0;i<12;i++)
                  { c[i]++;
                    if(c[i]==200)
                    c[i]=0;
                  }
                  c2++;
                  if(c2==200)
                  c2=0;
                }
                if(f==1)
                { g.setFont(fobj);
                  g.setColor(Color.MAGENTA);
                  g.drawString("GAME OVER",150,200);
                }
                if(l==0)
                { g.setFont(fobj);
                  g.setColor(Color.MAGENTA);
                  g.drawString("YOU WIN",150,200);
                }
                Thread.sleep(35);
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
          if(k==38)
          k2=true;
          if(k==39)
          k3=true;
          if(k==40)
          k4=true;
          if(k1==true)
          bx=bx-4;
          if(k2==true)
          by=by-4;
          if(k3==true)
          bx=bx+4;
          if(k4==true)
          by=by+4;
          repaint();
        }
        public void keyReleased(KeyEvent ke)
        { k=ke.getKeyCode();
          if(k==37)
          k1=false;
          if(k==38)
          k2=false;
          if(k==39)
          k3=false;
          if(k==40)
          k4=false;
          repaint();
        }
        public void keyTyped(KeyEvent ke)
        {}
        public void paint(Graphics g)
        { setSize(400,400);
          super.paint(g);
        }
}