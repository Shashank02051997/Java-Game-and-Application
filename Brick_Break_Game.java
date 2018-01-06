//Brick Break Game
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*<applet code="Brick_Break_Game" width=410 height=360>
</applet>*/
public class Brick_Break_Game extends JApplet implements KeyListener
{       int x=300,y=482,k,x1=315,y1=470,a,b,c,d,a1,b1,e=0,f=-1,z=0;
        int br[]={1,1,1,1,1,1,1,1,1,1,1,1};
        int bw[]={50,50,50,50,50,50,50,50,50,50,50,50};
        int bh[]={15,15,15,15,15,15,15,15,15,15,15,15};
        private JPanel panel;
        public void init()
        { addKeyListener(this);
          requestFocus();
          panel = new JPanel()
          { protected void paintComponent(Graphics g)
            { super.paintComponent(g);
              try
             { Font fobj = new Font("Arial", Font.BOLD, 40);
            g.setFont(fobj);
            if(f==1)
            { setBackground(Color.WHITE);
              g.setColor(Color.ORANGE);
              g.drawString("GAME OVER",180,250);
            }
            if(f==-1)
            { setBackground(Color.LIGHT_GRAY);
              g.setColor(Color.GREEN);
              g.fillRect(x,y,50,8);
              g.setColor(Color.RED);
              g.fillRect(120,250,bw[0],bh[0]);
              g.fillRect(180,250,bw[1],bh[1]);
              g.fillRect(240,250,bw[2],bh[2]);
              g.fillRect(300,250,bw[3],bh[3]);
              g.fillRect(360,250,bw[4],bh[4]);
              g.fillRect(420,250,bw[5],bh[5]);
              g.fillRect(180,230,bw[6],bh[6]);
              g.fillRect(240,230,bw[7],bh[7]);
              g.fillRect(300,230,bw[8],bh[8]);
              g.fillRect(360,230,bw[9],bh[9]);
              g.fillRect(240,210,bw[10],bh[10]);
              g.fillRect(300,210,bw[11],bh[11]);
              g.setColor(Color.BLUE);
              g.fillOval(x1,y1,12,12);
            }
           if(f==0)
           { if (k == 37)
            { x=x-15;
              k=-1;
            }
            else if(k==39)
            { x=x+15;
              k=-1;
            }
            if(x>=550)
            x=550;
            else if(x<=0)
            x=0;
            if(x1>=120&&x1<=170&&y1>=250&&y1<=275)
            {   if(br[0]==1)
                { bh[0]=0;
                  bw[0]=0;
                  e=1;
                  br[0]=0;
                }
            }
            else if(x1>=180&&x1<=230&&y1>=250&&y1<=275)
            {   if(br[1]==1)
                { bh[1]=0;
                  bw[1]=0;
                  e=1;
                  br[1]=0;
                }
            }
            else if(x1>=240&&x1<=290&&y1>=250&&y1<=275)
            {   if(br[2]==1)
                { bh[2]=0;
                  bw[2]=0;
                  e=1;
                  br[2]=0;
                }
            }
            else if(x1>=300&&x1<=350&&y1>=250&&y1<=275)
            {   if(br[3]==1)
                { bh[3]=0;
                  bw[3]=0;
                  e=1;
                  br[3]=0;
                }
            }
            else if(x1>=360&&x1<=410&&y1>=250&&y1<=275)
            {   if(br[4]==1)
                { bh[4]=0;
                  bw[4]=0;
                  e=1;
                  br[4]=0;
                }
            }
            else if(x1>=420&&x1<=470&&y1>=250&&y1<=275)
            {   if(br[5]==1)
                { bh[5]=0;
                  bw[5]=0;
                  e=1;
                  br[5]=0;
                }
            }
            else if(x1>=180&&x1<=230&&y1>=230&&y1<=255)
            {   if(br[6]==1)
                { bh[6]=0;
                  bw[6]=0;
                  e=1;
                  br[6]=0;
                }
            }
            else if(x1>=240&&x1<=290&&y1>=230&&y1<=255)
            {   if(br[7]==1)
                { bh[7]=0;
                  bw[7]=0;
                  e=1;
                  br[7]=0;
                }
            }
            else if(x1>=300&&x1<=350&&y1>=230&&y1<=255)
            {   if(br[8]==1)
                { bh[8]=0;
                  bw[8]=0;
                  e=1;
                  br[8]=0;
                }
            }
            else if(x1>=360&&x1<=410&&y1>=230&&y1<=255)
            {   if(br[9]==1)
                { bh[9]=0;
                  bw[9]=0;
                  e=1;
                  br[9]=0;
                }
            }
            else if(x1>=240&&x1<=290&&y1>=210&&y1<=235)
            {   if(br[10]==1)
                { bh[10]=0;
                  bw[10]=0;
                  e=1;
                  br[10]=0;
                }
            }
            else if(x1>=300&&x1<=350&&y1>=210&&y1<=235)
            {   if(br[11]==1)
                { bh[11]=0;
                  bw[11]=0;
                  e=1;
                  br[11]=0;
                }
            }
            if(e==1)
            { if(a==0&&b==0&&c==0&&d==0)
              { a1=5;
                b1=-5;
                a=1;
              }
              else if(a==1&&b==0&&c==0&&d==0)
              { a1=-5;
                b1=-5;
                b=1;
              }
              else if(a==1&&b==1&&c==1&&d==1)
              { a1=5;
                b1=-5;
                b=0;
                c=0;
                d=0;
              }
              else if(a==1&&b==1&&c==1&&d==0)
              { a1=-5;
                b1=-5;
                c=0;
              }
              else if(a==1&&b==1&&c==1&&d==0)
              { a1=-5;
                b1=-5;
                b=1;
                c=0;
              }
              else if(a==1&&b==0&&c==1&&d==1)
              { a1=5;
                b1=-5;
                c=0;
              }
              e=0;
            }
            g.setColor(Color.GREEN);
            g.fillRect(x,y,50,8);
            g.setColor(Color.RED);
            g.fillRect(120,250,bw[0],bh[0]);
            g.fillRect(180,250,bw[1],bh[1]);
            g.fillRect(240,250,bw[2],bh[2]);
            g.fillRect(300,250,bw[3],bh[3]);
            g.fillRect(360,250,bw[4],bh[4]);
            g.fillRect(420,250,bw[5],bh[5]);
            g.fillRect(180,230,bw[6],bh[6]);
            g.fillRect(240,230,bw[7],bh[7]);
            g.fillRect(300,230,bw[8],bh[8]);
            g.fillRect(360,230,bw[9],bh[9]);
            g.fillRect(240,210,bw[10],bh[10]);
            g.fillRect(300,210,bw[11],bh[11]);
            g.setColor(Color.BLUE);
            g.fillOval(x1,y1,12,12);
            if(y1==470)
              { if(a==0&&b==0&&c==0&&d==0&&y==y1+12&&x1>=x&&x1<=x+50)
                { a1=5;
                  b1=-5;
                  a=1;
                }
                else if(a==1&&b==0&&c==0&&d==0&&y==y1+12&&x1>=x&&x1<=x+50)
                { a1=-5;
                  b1=-5;
                  b=1;
                }
                else if(a==1&&b==1&&c==1&&d==1&&y==y1+12&&x1>=x&&x1<=x+50)
                { a1=5;
                  b1=-5;
                  b=0;
                  c=0;
                  d=0;
                }
                else if(a==1&&b==1&&c==1&&d==0&&y==y1+12&&x1>=x&&x1<=x+50)
                { a1=-5;
                  b1=-5;
                  b=0;
                  c=0;
                }
                else if(a==1&&b==0&&c==1&&d==1&&y==y1+12&&x1>=x&&x1<=x+50)
                { a1=5;
                  b1=-5;
                  c=0;
                  d=0;
                }
                else
                f=1;
              }
              else if(x1==580)
              { if(a==1&&b==0&&c==0&&d==0)
                { a1=-5;
                  b1=-5;
                  b=1;
                }
                else if(a==1&&b==1&&c==1&&d==1)
                { a1=-5;
                  b1=5;
                  d=0;
                  b=0;
                  c=0;
                }
                else if(a==1&&b==0&&c==1&&d==1)
                { a1=-5;
                  b1=5;
                  d=0;
                  c=0;
                }
                else if(a==1&&b==0&&c==0&&d==1)
                { a1=-5;
                  b1=-5;
                  d=0;
                }
              }
              else if(y1==0)
              { if(a==1&&b==1&&c==0&&d==0)
                { a1=-5;
                  b1=5;
                  c=1;
                }
                else if(a==1&&b==1&&c==0&&d==1)
                { a1=5;
                  b1=5;
                  c=1;
                }
                else if(a==1&&b==0&&c==0&&d==1)
                { a1=5;
                  b1=5;
                  c=1;
                }
                else if(a==1&&b==0&&c==0&&d==0)
                { a1=5;
                  b1=5;
                  c=1;
                  d=1;
                }
              }
              else if(x1==0)
              { if(a==1&&b==1&&c==1&&d==0)
                { a1=5;
                  b1=5;
                  a=0;
                  b=0;
                  c=0;
                }
                else if(a==1&&b==1&&c==0&&d==0)
                { a1=5;
                  b1=-5;
                  d=1;
                }
                else if(a==1&&b==0&&c==1&&d==0)
                { a1=-5;
                  b1=5;
                  b=1;
                  d=1;
                }
                else if(a==1&&b==0&&c==0&&d==0)
                { a1=5;
                  b1=-5;
                  d=1;
                }
              }
            x1=x1+a1;
            y1=y1+b1;
            Thread.sleep(30);
            repaint();
           }
          }
          catch(Exception e)
          {}
            }
          };
          add(panel);
        }
        public void keyPressed(KeyEvent ke)
        { k=ke.getKeyCode();
          if(z==0)
          { if (k==32)
            { f=0;
              z=1;
            }
          }
          repaint();
        }
        public void keyReleased(KeyEvent ke)
        {}
        public void keyTyped(KeyEvent ke)
        {}
        public void paint(Graphics g)
        { super.paint(g);
          setSize(600,500);
        }
}

