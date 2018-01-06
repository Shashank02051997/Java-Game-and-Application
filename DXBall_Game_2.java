//DXBall Game 2
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*<applet code="DXBall_Game_2" width=325 height=460>
</applet>*/
public class DXBall_Game_2 extends JApplet implements KeyListener
{       int e=0,e1=0,z=0,sp=20,s=0,f=0,f1=0,f2=0,f3=0,q=0,x,y,x1,y1,x2,y2,x3,y3,k,a1=0,b1=0,a2=0,b2=0,a3=0,b3=0,a=2,b=0,c=0,d=0,a4=2,b4=0,c4=0,d4=0,a5=2,b5=0,c5=0,d5=0;
        private JPanel panel;
        public void init()
        { addKeyListener(this);
          requestFocus();
          x=173;
          y=208;
          x1=-20;
          y1=10;
          x2=-20;
          y2=10;
          x3=203;
          y3=448;
          panel = new JPanel()
          { protected void paintComponent(Graphics g)
            { super.paintComponent(g);
              try
          { showStatus("         SCORE= "+s);
            Font fobj=new Font("Arial",Font.BOLD,25);
            Font fobj1=new Font("Arial",Font.BOLD,80);
            if(e1==1)
            { g.setColor(Color.ORANGE);
              g.setFont(fobj);
              g.drawString("GAME OVER",100,200);
            }
            else if(e1==0)
            { Color cobj=new Color(10,131,231);
              setBackground(cobj);
              g.setColor(Color.BLACK);
              g.fillOval(x+3,y+3,15,15);
              g.fillOval(x1+3,y1+3,15,15);
              g.fillOval(x2+3,y2+3,15,15);
              g.setColor(Color.WHITE);
              g.fillOval(x,y,15,15);
              g.setColor(Color.MAGENTA);
              g.fillOval(x1,y1,15,15);
              g.setColor(Color.RED);
              g.fillOval(x2,y2,15,15);
              g.setColor(Color.BLACK);
              g.fillRoundRect(x3+2,y3+2,80,5,5,5);
              g.setColor(Color.GREEN);
              g.fillRoundRect(x3,y3,80,5,5,5);
              if(z==0)
              { g.setColor(Color.GRAY);
                g.setFont(fobj1);
                g.drawString("2",150,120);
                g.setFont(fobj);
                g.setColor(Color.PINK);
                g.drawString("DXBALL GAME",70,100);
              }
              Thread.sleep(sp);
              if(y==433)
              { if(a==0&&b==0&&c==0&&d==0&&y3==y+15&&x+5>=x3&&x<=x3+80)
                { a1=5;
                  b1=-5;
                  a=1;
                }
                else if(a==1&&b==0&&c==0&&d==0&&y3==y+15&&x+5>=x3&&x<=x3+80)
                { a1=-5;
                  b1=-5;
                  b=1;
                }
                else if(a==1&&b==1&&c==1&&d==1&&y3==y+15&&x+5>=x3&&x<=x3+80)
                { a1=5;
                  b1=-5;
                  b=0;
                  c=0;
                  d=0;
                }
                else if(a==1&&b==1&&c==1&&d==0&&y3==y+15&&x+5>=x3&&x<=x3+80)
                { a1=5;
                  b1=-5;
                  b=0;
                  c=0;
                  d=0;
                }
                else if(a==1&&b==0&&c==0&&d==1&&y3==y+15&&x+5>=x3&&x<=x3+80)
                { a1=5;
                  b1=-5;
                  b=0;
                  c=0;
                  d=0;
                }
                else
                { a=2;
                  x=-20;
                  y=10;
                  a1=0;
                  b1=0;
                  f1=1;
                }
              }
              else if(x==303)
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
                else if(a==1&&b==1&&c==0&&d==1)
                { a1=-5;
                  b1=-5;
                  d=0;
                }
                else if(a==0&&b==0&&c==0&&d==0)
                { a1=-5;
                  b1=5;
                  a=1;
                }
              }
              else if(y==3)
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
                else if(a==1&&b==0&&c==0&&d==0)
                { a1=5;
                  b1=5;
                  c=1;
                  d=1;
                }
              }
              else if(x==3)
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
                  b1=5;
                  d=1;
                }
              }
              if(y1==433)
              { if(a4==0&&b4==0&&c4==0&&d4==0&&y3==y1+15&&x1+5>=x3&&x1<=x3+80)
                { a2=5;
                  b2=-5;
                  a4=1;
                }
                else if(a4==1&&b4==0&&c4==0&&d4==0&&y3==y1+15&&x1+5>=x3&&x1<=x3+80)
              { a2=-5;
                b2=-5;
                b4=1;
              }
              else if(a4==1&&b4==1&&c4==1&&d4==1&&y3==y1+15&&x1+5>=x3&&x1<=x3+80)
              { a2=5;
                b2=-5;
                b4=0;
                c4=0;
                d4=0;
              }
              else if(a4==1&&b4==1&&c4==1&&d4==0&&y3==y1+15&&x1+5>=x3&&x1<=x3+80)
              { a2=5;
                b2=-5;
                b4=0;
                c4=0;
                d4=0;
              }
              else if(a4==1&&b4==0&&c4==0&&d4==1&&y3==y1+15&&x1+5>=x3&&x1<=x3+80)
              { a2=5;
                b2=-5;
                b4=0;
                c4=0;
                d4=0;
              }
              else
              { a4=2;
                x1=-20;
                y1=10;
                a2=0;
                b2=0;
                f2=1;
              }
            }
            else if(x1==303)
            { if(a4==1&&b4==0&&c4==0&&d4==0)
              { a2=-5;
                b2=-5;
                b4=1;
              }
              else if(a4==1&&b4==1&&c4==1&&d4==1)
              { a2=-5;
                b2=5;
                d4=0;
                b4=0;
                c4=0;
              }
              else if(a4==1&&b4==0&&c4==1&&d4==1)
              { a2=-5;
                b2=5;
                d4=0;
                c4=0;
              }
              else if(a4==1&&b4==0&&c4==0&&d4==1)
              { a2=-5;
                b2=-5;
                d4=0;
              }
              else if(a4==1&&b4==1&&c4==0&&d4==1)
              { a2=-5;
                b2=-5;
                d4=0;
              }
              else if(a4==0&&b4==0&&c4==0&&d4==0)
              { a2=-5;
                b2=5;
                a4=1;
              }
            }
            else if(y1==3)
            { if(a4==1&&b4==1&&c4==0&&d4==0)
              { a2=-5;
                b2=5;
                c4=1;
              }
              else if(a4==1&&b4==1&&c4==0&&d4==1)
              { a2=5;
                b2=5;
                c4=1;
              }
              else if(a4==1&&b4==0&&c4==0&&d4==0)
              { a2=5;
                b2=5;
                c4=1;
                d4=1;
              }
            }
            else if(x1==3)
            { if(a4==1&&b4==1&&c4==1&&d4==0)
              { a2=5;
                b2=5;
                a4=0;
                b4=0;
                c4=0;
              }
              else if(a4==1&&b4==1&&c4==0&&d4==0)
              { a2=5;
                b2=-5;
                d4=1;
              }
              else if(a4==1&&b4==0&&c4==1&&d4==0)
              { a2=-5;
                b2=5;
                b4=1;
                d4=1;
              }
              else if(a4==1&&b4==0&&c4==0&&d4==0)
              { a2=5;
                b2=5;
                d4=1;
              }
            }
            if(y2==433)
            { if(a5==0&&b5==0&&c5==0&&d5==0&&y3==y2+15&&x2+5>=x3&&x2<=x3+80)
              { a3=5;
                b3=-5;
                a5=1;
              }
              else if(a5==1&&b5==0&&c5==0&&d5==0&&y3==y2+15&&x2+5>=x3&&x2<=x3+80)
              { a3=-5;
                b3=-5;
                b5=1;
              }
              else if(a5==1&&b5==1&&c5==1&&d5==1&&y3==y2+15&&x2+5>=x3&&x2<=x3+80)
              { a3=5;
                b3=-5;
                b5=0;
                c5=0;
                d5=0;
              }
              else if(a5==1&&b5==1&&c5==1&&d5==0&&y3==y2+15&&x2+5>=x3&&x2<=x3+80)
              { a3=5;
                b3=-5;
                b5=0;
                c5=0;
                d5=0;
              }
              else if(a5==1&&b5==0&&c5==0&&d5==1&&y3==y2+15&&x2+5>=x3&&x2<=x3+80)
              { a3=5;
                b3=-5;
                b5=0;
                c5=0;
                d5=0;
              }
              else
              { a5=2;
                x2=-20;
                y2=10;
                a3=0;
                b3=0;
                f3=1;
              }
            }
            else if(x2==303)
            { if(a5==1&&b5==0&&c5==0&&d5==0)
              { a3=-5;
                b3=-5;
                b5=1;
              }
              else if(a5==1&&b5==1&&c5==1&&d5==1)
              { a3=-5;
                b3=5;
                d5=0;
                b5=0;
                c5=0;
              }
              else if(a5==1&&b5==0&&c5==1&&d5==1)
              { a3=-5;
                b3=5;
                d5=0;
                c5=0;
              }
              else if(a5==1&&b5==0&&c5==0&&d5==1)
              { a3=-5;
                b3=-5;
                d5=0;
              }
              else if(a5==1&&b5==1&&c5==0&&d5==1)
              { a3=-5;
                b3=-5;
                d5=0;
              }
              else if(a5==0&&b5==0&&c5==0&&d5==0)
              { a3=-5;
                b3=5;
                a5=1;
              }
            }
            else if(y2==3)
            { if(a5==1&&b5==1&&c5==0&&d5==0)
              { a3=-5;
                b3=5;
                c5=1;
              }
              else if(a5==1&&b5==1&&c5==0&&d5==1)
              { a3=5;
                b3=5;
                c5=1;
              }
              else if(a5==1&&b5==0&&c5==0&&d5==0)
              { a3=5;
                b3=5;
                c5=1;
                d5=1;
              }
            }
            else if(x2==3)
            { if(a5==1&&b5==1&&c5==1&&d5==0)
              { a3=5;
                b3=5;
                a5=0;
                b5=0;
                c5=0;
              }
              else if(a5==1&&b5==1&&c5==0&&d5==0)
              { a3=5;
                b3=-5;
                d5=1;
              }
              else if(a5==1&&b5==0&&c5==1&&d5==0)
              { a3=-5;
                b3=5;
                b5=1;
                d5=1;
              }
              else if(a5==1&&b5==0&&c5==0&&d5==0)
              { a3=5;
                b3=5;
                d5=1;
              }
            }
            x=x+a1;
            y=y+b1;
            x1=x1+a2;
            y1=y1+b2;
            x2=x2+a3;
            y2=y2+b3;
            if(x3==3&&k==39)
            x3=x3+e;
            else if(x3==243&&k==37)
            x3=x3+e;
            else if(x3>3&&x3<243)
            x3=x3+e;
            if(z>0)
            { q++;
            }
            if(q==500||q==1000||q==1300||q==2300||q==2700||q==3000||q==3400||q==3500||q==5000)
            sp=sp-2;
            if(q==1800)
            { sp=20;
              x=173;
              y=208;
              x1=83;
              y1=78;
              a=1;b=1;c=0;d=0;
              a1=-5;b1=-5;
              a4=1;b4=1;c4=0;d4=1;
              a2=5;b2=-5;
              f1=0;
              Thread.sleep(5000);
            }
            if(q==3200)
            { sp=20;
              x=173;
              y=208;
              x1=83;
              y1=78;
              a=1;b=1;c=0;d=0;
              a1=-5;b1=-5;
              a4=1;b4=1;c4=0;d4=1;
              a2=5;b2=-5;
              x2=208;y2=243;
              a5=0;
              a3=5;b3=5;
              f1=0;f2=0;
              Thread.sleep(5000);
            }
            f=f1+f2+f3;
            if(q>0&&q<1800)
            { if(f==0)
              s=s+1;
              else if(f==1)
              e1=1;
            }
            if(q>1800&&q<3200)
            { if(f==0)
              s=s+2;
              else if(f==1)
              s=s+1;
              else if(f==2)
              e1=1;
            }
            if(q>3200)
            { if(f==0)
              s=s+3;
              else if(f==1)
              s=s+2;
              else if(f==2)
              s=s+1;
              else if(f==3)
              e1=1;
            }
            repaint();}
          }
          catch(Exception e)
          {}
            }
          };
          add(panel);
        }                  
        public void keyPressed(KeyEvent ke)
        { k=ke.getKeyCode();
          if(k==38&&z==0)
          { a=1;
            b=1;
            q=0;
            s=0;
            a1=-5;
            b1=-5;
            z++;
          }
          if(k==37&&z>0&&e1==0)
          e=-5;
          if(k==39&&z>0&&e1==0)
          e=5;
          repaint();
        }
        public void keyReleased(KeyEvent ke)
        {}
        public void keyTyped(KeyEvent ke)
        {}
        public void paint(Graphics g)
        { super.paint(g);
          setSize(325,460);
        }
}

