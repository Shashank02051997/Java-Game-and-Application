//Reach to Destination
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*<applet code="Reach_to_Destination" width=358 height=380>
</applet>*/
public class Reach_to_Destination extends JApplet implements KeyListener
{       int x=180,y=360,f=0;
        int a[]=new int[9];
        int b[]=new int[9];
        private JPanel panel;
        public void init()
        { addKeyListener(this);
          requestFocus();
          a[0]=300;
          b[0]=320;
          a[1]=100;
          b[1]=280;
          a[2]=321;
          b[2]=240;
          a[3]=80;
          b[3]=200;
          a[4]=261;
          b[4]=160;
          a[5]=150;
          b[5]=120;
          a[6]=240;
          b[6]=80;
          a[7]=20;
          b[7]=40;
          panel = new JPanel()
          { protected void paintComponent(Graphics g)
            { super.paintComponent(g);
              try
              { if(f==1)
                g.drawString("GAME OVER",120,180);
                else if(f==2)
                g.drawString("YOU WIN",120,180);
                else
                { setBackground(Color.CYAN);
                  g.setColor(Color.BLUE);
                  g.fillOval(x,y,10,10);
                  g.setColor(Color.RED);
                  g.fillRect(a[0],b[0]+10,40,5);
                  g.fillRect(a[1],b[1]+10,40,5);
                  g.fillRect(a[2],b[2]+10,40,5);
                  g.fillRect(a[3],b[3]+10,40,5);
                  g.fillRect(a[4],b[4]+10,40,5);
                  g.fillRect(a[5],b[5]+10,40,5);
                  g.fillRect(a[6],b[6]+10,40,5);
                  g.fillRect(a[7],b[7]+10,40,5);
                  if(x>=a[0]-5&&x<=a[0]+40&&y==b[0])
                  { x=x-1;
                    if(x<=1)
                    x=2;
                    repaint();
                    Thread.sleep(50);
                  }
                  else if(x>=a[1]-5&&x<=a[1]+40&&y==b[1])
                  { x=x+2;
                    if(x>=350)
                    x=348;
                    repaint();
                    Thread.sleep(50);
                  }
                  else if(x>=a[2]-5&&x<=a[2]+40&&y==b[2])
                  { x=x+3;
                    if(x>=351)
                    x=348;
                    repaint();
                    Thread.sleep(50);
                  }
                  else if(x>=a[3]-5&&x<=a[3]+40&&y==b[3])
                  { x=x-1;
                    if(x<=1)
                    x=2;
                    repaint();
                    Thread.sleep(50);
                  }
                  else if(x>=a[4]-5&&x<=a[4]+40&&y==b[4])
                  { x=x-3;
                    if(x<=0)
                    x=3;
                    repaint();
                    Thread.sleep(50);
                  }
                  else if(x>=a[5]-5&&x<=a[5]+40&&y==b[5])
                  { x=x+2;
                    if(x>=350)
                    x=348;
                    repaint();
                    Thread.sleep(50);
                  }
                  else if(x>=a[6]-5&&x<=a[6]+40&&y==b[6])
                  { x=x-2;
                    if(x<=0)
                    x=2;
                    repaint();
                    Thread.sleep(50);
                  }
                  else if(x>=a[7]-5&&x<=a[7]+40&&y==b[7])
                  { x=x+1;
                    if(x>=350)
                    x=349;
                    repaint();
                    Thread.sleep(50);
                  }
                  else if(y==360)
                  repaint();
                  else if(y==0)
                  f=2;
                  else
                  f=1;
                  a[0]=a[0]-1;
                  a[1]=a[1]+2;
                  a[2]=a[2]+3;
                  a[3]=a[3]-1;
                  a[4]=a[4]-3;
                  a[5]=a[5]+2;
                  a[6]=a[6]-2;
                  a[7]=a[7]+1;
                  if(a[0]==-40)
                  a[0]=360;
                  if(a[1]==360)
                  a[1]=-40;
                  if(a[2]==360)
                  a[2]=-39;
                  if(a[3]==-40)
                  a[3]=360;
                  if(a[4]==-39)
                  a[4]=360;
                  if(a[5]==360)
                  a[5]=-40;
                  if(a[6]==-40)
                  a[6]=360;
                  if(a[7]==360)
                  a[7]=-40;
                  Thread.sleep(50);
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
        { int k=ke.getKeyCode();
          if(k==37)
          { x=x-1;
            if(x<=1)
            x=2;
          }
          else if(k==38)
          { y=y-40;
            if(y==-40)
            y=0;
          }
          else if(k==39)
          { x=x+1;
            if(x>=350)
            x=348;
          }
          else if(k==40)
          { y=y+40;
            if(y==400)
            y=360;
          }
          repaint();
        }
        public void keyReleased(KeyEvent ke)
        {}
        public void keyTyped(KeyEvent ke)
        {}
        public void paint(Graphics g)
        { setSize(358,380);
          super.paint(g);
        }
}
