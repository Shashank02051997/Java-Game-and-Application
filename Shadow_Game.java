//Shadow Game
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;
/*<applet code="Shadow_Game" width=500 height=500>
</applet>*/
public class Shadow_Game extends JApplet implements MouseListener
{       int c,c1,c2,s,x1,x2,f;
        int tx[]={-10,500,500};
        int ty[]={500,200,500};
        int sx[]={315,355,398,355};
        int sy[]={230,285,259,200};
        private JPanel panel;
        public void init()
        { addMouseListener(this);
          x1=-15;
          x2=-320;
          panel = new JPanel()
          { protected void paintComponent(Graphics g)
            { try
              { super.paintComponent(g);
                if(f==0)
                { if(c%2==0)
                  { Color cobj1=new Color(205,205,205);
                    setBackground(cobj1);
                    g.setColor(Color.black);
                    g.fillPolygon(sx,sy,4);
                    g.setColor(Color.white);
                    g.fillPolygon(tx,ty,3);
                    g.fillOval(335,235,10,10);
                    g.fillOval(350,225,10,10);
                    g.setColor(Color.gray);
                    Font fobj=new Font("Arial",Font.BOLD,17);
                    g.setFont(fobj);
                    g.drawString("SCORE = "+s,250,15);
                  }
                  if(c%2==1)
                  { Color cobj2=new Color(55,55,55);
                    setBackground(cobj2);
                    g.setColor(Color.white);
                    g.fillPolygon(sx,sy,4);
                    g.setColor(Color.black);
                    g.fillPolygon(tx,ty,3);
                    g.fillOval(335,235,10,10);
                    g.fillOval(350,225,10,10);
                    g.setColor(Color.gray);
                    Font fobj=new Font("Arial",Font.BOLD,17);
                    g.setFont(fobj);
                    g.drawString("SCORE = "+s,250,15);
                  }
                  if(c1==0)
                  { g.setColor(Color.black);
                    g.fillRect(x1,0,15,500);
                  }
                  if(c1==1)
                  { g.setColor(Color.white);
                    g.fillRect(x1,0,15,500);
                  }
                  if(c2==0)
                  { g.setColor(Color.black);
                    g.fillRect(x2,0,15,500);
                  }
                  if(c2==1)
                  { g.setColor(Color.white);
                    g.fillRect(x2,0,15,500);
                  }
                  x1++;
                  x2++;
                  if(x1>510)
                  { x1=-155;
                    Random r=new Random();
                    c1=r.nextInt(2);
                    s++;
                  }
                  if(x2>510)
                  { x2=-155;
                    Random r=new Random();
                    c2=r.nextInt(2);
                    s++;
                  }
                  if(x1==320&&c1==0&&c%2==1)
                  { f=1;
                    Thread.sleep(2000);
                  }
                  if(x1==320&&c1==1&&c%2==0)
                  { f=1;
                    Thread.sleep(2000);
                  }
                  if(x2==320&&c2==0&&c%2==1)
                  { f=1;
                    Thread.sleep(2000);
                  }
                  if(x2==320&&c2==1&&c%2==0)
                  { f=1;
                    Thread.sleep(2000);
                  }
                  Thread.sleep(3);
                  repaint();
                }
                if(f==1)
                { setBackground(Color.gray);
                  Font fobj1=new Font("Arial",Font.BOLD,22);
                  g.setFont(fobj1);
                  g.setColor(Color.white);
                  g.drawString("GAME OVER",210,220);
                  g.drawString("SCORE = "+s,210,250);
                }
                //showStatus(" x1="+x1+" f="+f);
              }
              catch(Exception e)
              {}
            }
          };
          add(panel);
        }
        public void mouseClicked(MouseEvent me) 
        { c++;
          repaint();
        }
        public void mousePressed(MouseEvent me)
        {}
        public void mouseReleased(MouseEvent me)
        {}
        public void mouseEntered(MouseEvent me)
        {}
        public void mouseExited(MouseEvent me)
        {}
        public void paint(Graphics g)
        { setSize(500,500);
          super.paint(g);
        }
}