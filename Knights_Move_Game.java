//Knights Move Game
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;
/*<applet code="Knights_Move_Game" width=500 height=500>
 </applet>
 */
public class Knights_Move_Game extends JApplet implements MouseListener
{       int x,y,bx,by,hx,hy,i,j,p,q,p1,q1,c,c1,c2,e,f;
        int a[][]=new int[8][8];
        private JPanel panel;
        public void init()
        { Random r=new Random();
          x=40+r.nextInt(300);
          y=40+r.nextInt(300);
          bx=30;
          by=30;
          for(i=0;i<8;i++)
          { for(j=0;j<8;j++)
            { if(x>=bx&&x<=bx+50&&y>=by&&y<=by+50)
              { p1=i+2;
                q1=j+1;
                i=8;
                j=8;
              }
              bx=bx+53;
            }
            bx=30;
            by=by+53;
          }
          addMouseListener(this);
          panel = new JPanel()
          { protected void paintComponent(Graphics g)
            { try
              { super.paintComponent(g);
                setBackground(Color.white);
                Font fobj=new Font("Arial",Font.BOLD,24);
                Color cobj=new Color(255,255,0);
                Color cobj1=new Color(60,138,30);
                g.setColor(cobj);
                g.fillRect(20,20,450,450);
                g.setColor(cobj1);
                bx=30;
                by=30;
                for(i=0;i<8;i++)
                { for(j=0;j<8;j++)
                  { g.drawRect(bx,by,50,50);
                    by=by+53;
                  }
                  by=30;
                  bx=bx+53;
                }
                if(e==0||e%2==1)
                { bx=30;
                  by=30;
                  for(i=0;i<8;i++)
                  { for(j=0;j<8;j++)
                    { if(x>=bx&&x<=bx+50&&y>=by&&y<=by+50)
                      { p=i;
                        q=j;
                        if(a[p][q]==0&&(p1==p+2&&q1==q+1||p1==p+2&&q1==q-1||p1==p+1&&q1==q+2||p1==p+1&&q1==q-2||p1==p-1&&q1==q+2||p1==p-1&&q1==q-2||p1==p-2&&q1==q+1||p1==p-2&&q1==q-1))
                        { a[p][q]=1;
                          c=0;
                          p1=p;
                          q1=q;
                        }
                        else
                        c=1;
                        i=8;
                        j=8;
                      }
                      bx=bx+53;
                    }
                    bx=30;
                    by=by+53;
                  }
                }
                if(e%2==0&&e>0)
                { if(p1-2>=0&&p1-2<=7&&q1-1>=0&&q1-1<=7&&c2==0)
                  { if(a[p1-2][q1-1]==0)
                    { p=p1-2;
                      q=q1-1;
                      a[p][q]=1;
                      c2=1;
                    }
                  }
                  if(p1-2>=0&&p1-2<=7&&q1+1>=0&&q1+1<=7&&c2==0)
                  { if(a[p1-2][q1+1]==0)
                    { p=p1-2;
                      q=q1+1;
                      a[p][q]=1;
                      c2=1;
                    }
                  }
                  if(p1-1>=0&&p1-1<=7&&q1-2>=0&&q1-2<=7&&c2==0)
                  { if(a[p1-1][q1-2]==0)
                    { p=p1-1;
                      q=q1-2;
                      a[p][q]=1;
                      c2=1;
                    }
                  }
                  if(p1-1>=0&&p1-1<=7&&q1+2>=0&&q1+2<=7&&c2==0)
                  { if(a[p1-1][q1+2]==0)
                    { p=p1-1;
                      q=q1+2;
                      a[p][q]=1;
                      c2=1;
                    }
                  }
                  if(p1+1>=0&&p1+1<=7&&q1-2>=0&&q1-2<=7&&c2==0)
                  { if(a[p1+1][q1-2]==0)
                    { p=p1+1;
                      q=q1-2;
                      a[p][q]=1;
                      c2=1;
                    }
                  }
                  if(p1+1>=0&&p1+1<=7&&q1+2>=0&&q1+2<=7&&c2==0)
                  { if(a[p1+1][q1+2]==0)
                    { p=p1+1;
                      q=q1+2;
                      a[p][q]=1;
                      c2=1;
                    }
                  }
                  if(p1+2>=0&&p1+2<=7&&q1-1>=0&&q1-1<=7&&c2==0)
                  { if(a[p1+2][q1-1]==0)
                    { p=p1+2;
                      q=q1-1;
                      a[p][q]=1;
                      c2=1;
                    }
                  }
                  if(p1+2>=0&&p1+2<=7&&q1+1>=0&&q1+1<=7&&c2==0)
                  { if(a[p1+2][q1+1]==0)
                    { p=p1+2;
                      q=q1+1;
                      a[p][q]=1;
                      c2=1;
                    }
                  }
                  if(c2==0)
                  f=1;
                  p1=p;
                  q1=q;
                  c=0;
                }
                c2=0;
                hx=31;
                hy=31;
                for(i=0;i<8;i++)
                { for(j=0;j<8;j++)
                  { if(a[i][j]==1)
                    { g.setColor(Color.white);
                      g.fillRect(hx,hy,48,48);
                      g.setColor(Color.RED);
                      if(i==p&&j==q&&c==0)
                      { g.setFont(fobj);
                        g.drawString("H",hx+14,hy+34);
                      }
                      if(i==p1&&j==q1&&c==1)
                      { g.setFont(fobj);
                        g.drawString("H",hx+14,hy+34);
                      }
                    }
                    hx=hx+53;
                  }
                  hx=31;
                  hy=hy+53;
                }
                Thread.sleep(1000);
                if(e%2==1)
                { e++;
                  repaint();
                }
                if(f==1)
                { g.setFont(fobj);
                  g.drawString("YOU WIN THE GAME",200,200);
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
        public void mousePressed(MouseEvent me)
        { x=me.getX();
          y=me.getY();
          if(x>=30&&x<=450&&y>=30&&y<=450&&f==0)
          { bx=30;
            by=30;
            for(i=0;i<8;i++)
            { for(j=0;j<8;j++)
              { if(x>=bx&&x<=bx+50&&y>=by&&y<=by+50)
                { p=i;
                  q=j;
                  i=8;
                  j=8;
                  if(a[p][q]==0&&(p1==p+2&&q1==q+1||p1==p+2&&q1==q-1||p1==p+1&&q1==q+2||p1==p+1&&q1==q-2||p1==p-1&&q1==q+2||p1==p-1&&q1==q-2||p1==p-2&&q1==q+1||p1==p-2&&q1==q-1))
                  { e++;
                    repaint();
                  }
                }
                bx=bx+53;
              }
              bx=30;
              by=by+53;
            }
          }
        }
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