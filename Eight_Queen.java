//Eight Queen
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*<applet code="Eight_Queen" width=370 height=360>
</applet>*/
public class Eight_Queen extends JApplet implements KeyListener
{       int x=20,y=20,x1,a=0,b=0,x2=20,y2=20,k,l,c=0;
        int x3[]=new int[8];
        int y3[]=new int[8];
        private JPanel panel;
        public void init()
        { addKeyListener(this);
          requestFocus();
          x1=x;
          panel = new JPanel()
          { protected void paintComponent(Graphics g)
            { super.paintComponent(g);
              g.setColor(Color.MAGENTA);
              Font f=new Font("Arial",Font.BOLD,14);
              g.setFont(f);
              g.drawString("EIGHT QUEEN",150,15);
              x=20;
              y=20;
              for(int i=1;i<9;i++)
              { for(int j=1;j<5;j++)
                { if(i%2==0)
                  { g.setColor(Color.BLACK);
                    g.fillRect(x,y,40,40);
                    x=x+40;
                    g.setColor(Color.RED);
                    g.fillRect(x,y,40,40);
                    x=x+40;
                  }
                  else
                  { g.setColor(Color.RED);
                    g.fillRect(x,y,40,40);
                    x=x+40;
                    g.setColor(Color.BLACK);
                    g.fillRect(x,y,40,40);
                    x=x+40;
                  }
                }
                y=y+40;
                x=x1;
              }
              x2=x2+a;
              y2=y2+b;
              if(x2<20)
              x2=20;
              if(y2<20)
              y2=20;
              if(x2>300)
              x2=300;
              if(y2>300)
              y2=300;
              g.setColor(Color.BLUE);
              g.fillRect(x2,y2,40,40);
              if(k==32)
              { g.setColor(Color.GREEN);
                Font f1=new Font("Arial",Font.BOLD,27);
                g.setFont(f1);
                g.drawString("Q",x2+12,y2+25);
                x3[c]=x2+12;
                y3[c]=y2+25;
                c++;
              }
              for(l=0;l<c-1;l++)
              { if(y3[l]==y3[c-1]&&c>=2)
                { g.setColor(Color.ORANGE);
                  g.fillRect(x2,y2,40,40);
                  c--;
                }
                else if(x3[l]==x3[c-1]&&c>=2)
                { g.setColor(Color.ORANGE);
                  g.fillRect(x2,y2,40,40);
                  c--;
                }
                else if((x3[c-1]-x3[l])==(y3[c-1]-y3[l])&&c>=2)
                { g.setColor(Color.ORANGE);
                  g.fillRect(x2,y2,40,40);
                  c--;
                }
                else if((x3[c-1]-x3[l])==-(y3[c-1]-y3[l])&&c>=2)
                { g.setColor(Color.ORANGE);
                  g.fillRect(x2,y2,40,40);
                  c--;
                }
              }
              for(l=0;l<c;l++)
              { g.setColor(Color.GREEN);
                Font f1=new Font("Arial",Font.BOLD,27);
                g.setFont(f1);
                g.drawString("Q",x3[l],y3[l]);
              }
            }
          };
          add(panel);
        }
        public void keyPressed(KeyEvent ke)
        { k=ke.getKeyCode();
          if(k==37)
          { a=-40;
            b=0;
          }
          else if(k==38)
          { a=0;
            b=-40;
          }
          else if(k==39)
          { a=40;
            b=0;
          }
          else if(k==40)
          { a=0;
            b=40;
          }
          else if(k==32)
          { a=0;
            b=0;
          }
          repaint();
        }
        public void keyReleased(KeyEvent ke)
        {}
        public void keyTyped(KeyEvent ke)
        {}
        public void paint(Graphics g)
        { super.paint(g);
          setSize(370,360);
        }
}