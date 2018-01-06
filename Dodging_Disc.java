//Dodging Disc
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;
/*<applet code="Dodging_Disc" width=320 height=320>
</applet>*/
public class Dodging_Disc extends JApplet implements KeyListener,MouseListener
{       int x,y,x2,y2,x3=100,y3=100,x4=380,y4=100,i,j,c=0,d=0,s=0,s1=0,r1=1,k,k1=0,f=0;
        private JPanel panel;
        public void init()
        { addKeyListener(this);
          addMouseListener(this);
          requestFocus();
          panel = new JPanel()
          { protected void paintComponent(Graphics g)
            { super.paintComponent(g);
              try
              { if(f==0)
                { x3=x3+c;
                  y3=y3+d;
                }
                if(x3<100)
                x3=100;
                if(y3<100)
                y3=100;
                if(x3>180)
                x3=180;
                if(y3>180)
                y3=180;
                Color c1=new Color(255,25,140);
                Color c2=new Color(255,255,255);
                Color c3=new Color(170,153,172);
                Color c4=new Color(255,121,188);
                Font fobj1=new Font("Arial",Font.BOLD,14);
                g.setColor(Color.BLACK);
                g.fillRect(86,66,149,169);
                g.setColor(c1);
                g.fillRect(88,68,145,165);
                g.setColor(c2);
                g.drawRect(90,70,140,160);
                g.setColor(c3);
                g.drawLine(91,90,229,90);
                g.setColor(c2);
                g.fillRect(95,95,130,130);
                g.setColor(c3);
                g.fillRect(96,96,128,128);
                g.setColor(Color.BLACK);
                g.fillRect(98,98,124,124);
                g.setColor(c2);
                g.drawLine(91,91,229,91);
                g.setColor(c1);
                g.fillRect(100,100,120,120);
                g.setColor(c4);
                g.fillRect(140,100,40,40);
                g.fillRect(100,140,40,40);
                g.fillRect(180,140,40,40);
                g.fillRect(140,180,40,40);
                g.setColor(c2);
                g.setFont(fobj1);
                g.drawString("DODGE BALL",115,85);
                g.setColor(Color.BLUE);
                g.fillOval(x3+5,y3+5,30,30);
                if(x3==x4&&y3==y4||x4>x3&&x4<x3+30&&y3==y4||x4<x3&&x4+30>x3&&y3==y4||y4>y3&&y4<y3+30&&x3==x4||y4<y3&&y4+30>y3&&x3==x4)
                { f=1;
                  Font fobj=new Font("Arial",Font.BOLD,15);
                  g.setFont(fobj);
                  g.setColor(Color.BLUE);
                  g.drawString("GAME OVER",120,280);
                  g.setColor(Color.MAGENTA);
                  g.fillRect(150,290,20,20);
                  g.setColor(Color.WHITE);
                  g.drawLine(165,295,165,305);
                  g.drawLine(165,305,155,305);
                  g.drawLine(155,305,155,300);
                  g.drawLine(155,300,152,303);
                  g.drawLine(155,300,157,303);
                  if(x>=150&&x<=170&&y>=290&&y<=310)
                  { f=0;
                    x3=100;y3=100;x4=380;y4=100;c=0;d=0;s=0;s1=0;r1=1;k=41;k1=0;f=0;
                    x=10;
                    y=10;
                    repaint();
                  }
                  else
                  f=1;
                }
                if(f==0)
                { g.setColor(Color.GREEN);
                  g.fillOval(x4+5,y4+5,30,30);
                  if(r1==1||r1==2||r1==3)
                  { if(x4==-60)
                    { if(k1==0)
                      { Random r=new Random();
                        r1=1+r.nextInt(12);
                      }
                      if(r1==1)
                      { y4=100;
                        x4=380;
                        k1=0;
                        s1++;
                      }
                      else if(r1==2)
                      { y4=140;
                        x4=380;
                        k1=0;
                        s1++;
                      }
                      else if(r1==3)
                      { y4=180;
                        x4=380;
                        k1=0;
                        s1++;
                      }
                      else if(r1==4||r1==5||r1==6)
                      { x4=380;
                        k1=1;
                      }
                      else if(r1==7||r1==8||r1==9)
                      { y4=-60;
                        k1=1;
                      }
                      else if(r1==10||r1==11||r1==12)
                      { y4=380;
                        k1=1;
                      }
                    }
                    else
                    x4=x4-s;
                  }
                  else if(r1==4||r1==5||r1==6)
                  { if(x4==380)
                    { if(k1==0)
                      { Random r=new Random();
                        r1=1+r.nextInt(12);
                      }
                      if(r1==4)
                      { y4=100;
                        x4=-60;
                        k1=0;
                        s1++;
                      }
                      else if(r1==5)
                      { y4=140;
                        x4=-60;
                        k1=0;
                        s1++;
                      }
                      else if(r1==6)
                      { y4=180;
                        x4=-60;
                        k1=0;
                        s1++;
                      }
                      else if(r1==1||r1==2||r1==3)
                      { x4=-60;
                        k1=1;
                      }
                      else if(r1==7||r1==8||r1==9)
                      { y4=-60;
                        k1=1;
                      }
                      else if(r1==10||r1==11||r1==12)
                      { y4=380;
                        k1=1;
                      }
                    }
                    else
                    x4=x4+s;
                  }
                  if(r1==7||r1==8||r1==9)
                  { if(y4==-60)
                    { if(k1==0)
                      { Random r=new Random();
                        r1=1+r.nextInt(12);
                      }
                      if(r1==7)
                      { y4=380;
                        x4=100;
                        k1=0;
                        s1++;
                      }
                      else if(r1==8)
                      { y4=380;
                        x4=140;
                        k1=0;
                        s1++;
                      }
                      else if(r1==9)
                      { y4=380;
                        x4=180;
                        k1=0;
                        s1++;
                      }
                      else if(r1==4||r1==5||r1==6)
                      { x4=380;
                        k1=1;
                      }
                      else if(r1==1||r1==2||r1==3)
                      { x4=-60;
                        k1=1;
                      }
                      else if(r1==10||r1==11||r1==12)
                      { y4=380;
                        k1=1;
                      }
                    }
                    else
                    y4=y4-s;
                  }
                  else if(r1==10||r1==11||r1==12)
                  { if(y4==380)
                    { if(k1==0)
                      { Random r=new Random();
                        r1=1+r.nextInt(12);
                      }
                      if(r1==10)
                      { y4=-60;
                        x4=100;
                        k1=0;
                        s1++;
                      }
                      else if(r1==11)
                      { y4=-60;
                        x4=140;
                        k1=0;
                        s1++;
                      }
                      else if(r1==12)
                      { y4=-60;
                        x4=180;
                        k1=0;
                        s1++;
                      }
                      else if(r1==4||r1==5||r1==6)
                      { x4=380;
                        k1=1;
                      }
                      else if(r1==7||r1==8||r1==9)
                      { y4=-60;
                        k1=1;
                      }
                      else if(r1==1||r1==2||r1==3)
                      { x4=-60;
                        k1=1;
                      }
                    }
                    else
                    y4=y4+s;
                  }
                  Thread.sleep(47);
                  showStatus("           SCORE="+(s1*10));
                  c=0;
                  d=0;
                  repaint();
                }
              } 
              catch(Exception e)
              {}
            }
          };
          add(panel);
        }
        public void mouseClicked(MouseEvent me)
        {}
        public void mouseEntered(MouseEvent me)
        {}
        public void mouseExited(MouseEvent me)
        {}
        public void mousePressed(MouseEvent me)
        { x=me.getX();
          y=me.getY();
          repaint();
        }
        public void mouseReleased(MouseEvent me)
        {}
        public void keyPressed(KeyEvent ke)
        { k=ke.getKeyCode();
          if(k==37)
          { c=-40;
            d=0;
          }
          else if(k==38)
          { c=0;
            d=-40;
          }
          else if(k==39)
          { c=40;
            d=0;
          }
          else if(k==40)
          { c=0;
            d=40;
          }
          else if(k==32)
          { s=20;
            c=0;
            d=0;
            x=10;
            y=10;
          }
          repaint();
        }
        public void keyReleased(KeyEvent ke)
        {}
        public void keyTyped(KeyEvent ke)
        {}
        public void paint(Graphics g)
        { super.paint(g);
          setSize(320,320);
        }
}

