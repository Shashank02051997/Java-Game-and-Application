//DXBall Game
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*<applet code="DXBall_Game" width=410 height=350>
</applet>*/
public class DXBall_Game extends JApplet implements KeyListener
{       int x=238,y=333,k,a1=0,b1=0,a=2,b=0,c=0,d=0,x1=203,y1=333,e=0,z=0,s,f=0;
        private JPanel panel;
        public void init()
        { addKeyListener(this);
          requestFocus();
          y=326;
          panel = new JPanel()
          { protected void paintComponent(Graphics g)
            { super.paintComponent(g);
              try
             { showStatus("         SCORE = "+s);
            Color cobj=new Color(10,131,231);
            Font fobj=new Font("Arial",Font.BOLD,20);
            Font fobj1=new Font("Arial",Font.BOLD,25);
            setBackground(cobj);
            if(f==1)
            { setBackground(cobj);
              g.setColor(Color.WHITE);
              g.setFont(fobj);
              g.drawString("GAME OVER",130,170);
            }
            else
            { g.setColor(Color.WHITE);
              if(z==0)
              { g.setFont(fobj1);
                g.drawString("DXBALL GAME",110,100);
              }
              g.fillOval(x,y,5,5);
              g.fillRoundRect(x1,y1,80,5,5,5);
              Thread.sleep(15);
              if(y==333)
              { if(a==0&&b==0&&c==0&&d==0&&y1==y&&x>=x1&&x<=x1+80)
                { a1=5;
                  b1=-5;
                  a=1;
                }
                else if(a==1&&b==0&&c==0&&d==0&&y1==y&&x>=x1&&x<=x1+80)
                { a1=-5;
                  b1=-5;
                  b=1;
                }
                else if(a==1&&b==1&&c==1&&d==1&&x!=403&&y1==y&&x>=x1&&x<=x1+80)
                { a1=5;
                  b1=-5;
                  b=0;
                  c=0;
                  d=0;
                }
                else if(a==1&&b==1&&c==1&&d==1&&x==403&&y1==y&&x>=x1&&x<=x1+80)
                { a1=-5;
                  b1=-5;
                  c=0;
                  d=0;
                }
                else if(a==1&&b==1&&c==1&&d==0&&x==3&&y1==y&&x>=x1&&x<=x1+80)
                { a1=5;
                  b1=-5;
                  b=0;
                  c=0;
                  d=0;
                }
                else if(a==1&&b==1&&c==1&&d==0&&x!=3&&y1==y&&x>=x1&&x<=x1+80)
                { a1=-5;
                  b1=-5;
                  b=1;
                  c=0;
                }
                else
                f=1;
              }
              else if(x==403)
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
                else
                f=1;
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
                else
                f=1;
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
                else
                f=1;
              }
              if(z>0)
              s++;
              x=x+a1;
              y=y+b1;
              if(x1==3&&k==39)
              x1=x1+e;
              else if(x1==323&&k==37)
              x1=x1+e;
              else if(x1>3&&x1<323)
              { x1=x1+e;
                repaint();
              }
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
          if(k==38)
          { if(z==0)
            { a=0;
              z++;
              y=333;
            }
          }
          if(k==37)
          { if(z==0)
            { a=0;
              z++;
              e=-5;
              y=333;
            }
            else
            e=-5;
          }
          if(k==39)
          { if(z==0)
            { a=0;
              z++;
              e=-5;
              y=333;
            }
            else
            e=5;
          }
          repaint();
        }
        public void keyReleased(KeyEvent ke)
        {}
        public void keyTyped(KeyEvent ke)
        {}
        public void paint(Graphics g)
        { setSize(410,350);
          super.paint(g);
        }
}

