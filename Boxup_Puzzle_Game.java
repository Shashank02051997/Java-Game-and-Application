//Boxup Puzzle Game
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code="vyon91" width=330 height=550>
</applet>*/
public class Boxup_Puzzle_Game extends Applet implements KeyListener
{       int k,x,y,rx,ry,r1x,r1y,i,j,t,t1,p,q,e,e1,l;
        int m[][]=new int[3][3];
        int a[]=new int[4];
        int b[][]=new int[3][3];
        int a1[]=new int[4];
        int b1[][]=new int[3][3];
        public void init()
        { addKeyListener(this);
          requestFocus();
          p=1;
          q=1;
          m[p][q]=1;
          a[0]=0;a[1]=1;a[2]=1;a[3]=1;
          b[1][0]=2;
          a1[0]=1;a1[1]=1;a1[2]=1;a1[3]=0;
          b1[1][2]=3;
        }
        public void keyPressed(KeyEvent ke)
        { k=ke.getKeyCode();
          if(k==37)
          { if(q-1!=-1)
            { if(b[p][q-1]==0&&e==0&&b1[p][q-1]==0&&e1==0)
              { t=m[p][q];
                m[p][q]=m[p][q-1];
                m[p][q-1]=t;
                q=q-1;
                e=0;
                e1=0;
              }
              else if(b[p][q-1]==2&&e1==0||b1[p][q-1]==3&&e==0)
              { if(b[p][q-1]==2)
                { if(a[1]==0)
                  { t=m[p][q];
                    m[p][q]=m[p][q-1];
                    m[p][q-1]=t;
                    q=q-1;
                    e=1;
                  }
                  else
                  e=0;
                }
                else if(b1[p][q-1]==3)
                { if(a1[1]==0)
                  { t1=m[p][q];
                    m[p][q]=m[p][q-1];
                    m[p][q-1]=t1;
                    q=q-1;
                    e1=1;
                  }
                  else
                  e1=0;
                }
              }
              else if(e==1||e1==1)
              { if(e==1)
                { if(a[3]==0)
                  { t=m[p][q];
                    m[p][q]=m[p][q-1];
                    m[p][q-1]=t;
                    q=q-1;
                    e=0;
                  }
                  else
                  { if(b1[p][q-1]==0)
                    { t=m[p][q];
                      m[p][q]=m[p][q-1];
                      m[p][q-1]=t;
                      q=q-1;
                      q=q+1;
                      t=b[p][q];
                      b[p][q]=b[p][q-1];
                      b[p][q-1]=t;
                      q=q-1;
                    }
                    else if(b1[p][q-1]!=0&&a1[1]==0)
                    { t=m[p][q];
                      m[p][q]=m[p][q-1];
                      m[p][q-1]=t;
                      q=q-1;
                      q=q+1;
                      t=b[p][q];
                      b[p][q]=b[p][q-1];
                      b[p][q-1]=t;
                      q=q-1;
                    }
                  }
                }
                if(e1==1)
                { if(a1[3]==0&&b[p][q-1]==0)
                  { t1=m[p][q];
                    m[p][q]=m[p][q-1];
                    m[p][q-1]=t1;
                    q=q-1;
                    e1=0;
                  }
                  else if(a1[3]!=0&&b[p][q-1]==0)
                  { t1=m[p][q];
                    m[p][q]=m[p][q-1];
                    m[p][q-1]=t1;
                    q=q-1;
                    q=q+1;
                    t1=b1[p][q];
                    b1[p][q]=b1[p][q-1];
                    b1[p][q-1]=t1;
                    q=q-1;
                  }
                }
              }
            }
          }
          else if(k==38)
          { if(p-1!=-1)
            { if(b[p-1][q]==0&&e==0&&b1[p-1][q]==0&&e1==0)
              { t=m[p][q];
                m[p][q]=m[p-1][q];
                m[p-1][q]=t;
                p=p-1;
                e=0;
                e1=0;
              }
              else if(b[p-1][q]==2&&e1==0||b1[p-1][q]==3&&e==0)
              { if(b[p-1][q]==2)
                { if(a[2]==0)
                  { t=m[p][q];
                    m[p][q]=m[p-1][q];
                    m[p-1][q]=t;
                    p=p-1;
                    e=1;
                  }
                  else
                  e=0;
                }
                else if(b1[p-1][q]==3)
                { if(a1[2]==0)
                  { t1=m[p][q];
                    m[p][q]=m[p-1][q];
                    m[p-1][q]=t1;
                    p=p-1;
                    e1=0;
                  }
                  else
                  e1=0;
                }
              }
              else if(e==1||e1==1)
              { if(e==1)
                { if(a[0]==0)
                  { t=m[p][q];
                    m[p][q]=m[p-1][q];
                    m[p-1][q]=t;
                    p=p-1;
                    e=0;
                  }
                  else
                  { if(b1[p-1][q]==0)
                    { t=m[p][q];
                      m[p][q]=m[p-1][q];
                      m[p-1][q]=t;
                      p=p-1;
                      p=p+1;
                      t=b[p][q];
                      b[p][q]=b[p-1][q];
                      b[p-1][q]=t;
                      p=p-1;
                    }
                    else if(b1[p-1][q]!=0&&a1[2]==0)
                    { t=m[p][q];
                      m[p][q]=m[p-1][q];
                      m[p-1][q]=t;
                      p=p-1;
                      p=p+1;
                      t=b[p][q];
                      b[p][q]=b[p-1][q];
                      b[p-1][q]=t;
                      p=p-1;
                    }
                  }
                }
                if(e1==1)
                { if(a1[0]==0&&b[p-1][q]==0)
                  { t1=m[p][q];
                    m[p][q]=m[p-1][q];
                    m[p-1][q]=t1;
                    p=p-1;
                    e1=0;
                  }
                  else if(a1[0]!=0&&b[p-1][q]==0)
                  { t1=m[p][q];
                    m[p][q]=m[p-1][q];
                    m[p-1][q]=t1;
                    p=p-1;
                    p=p+1;
                    t1=b1[p][q];
                    b1[p][q]=b1[p-1][q];
                    b1[p-1][q]=t1;
                    p=p-1;
                  }
                }
              }
            }
          }
          else if(k==39)
          { if(q+1!=3)
            { if(b[p][q+1]==0&&e==0&&b1[p][q+1]==0&&e1==0)
              { t=m[p][q];
                m[p][q]=m[p][q+1];
                m[p][q+1]=t;
                q=q+1;
                e=0;
                e1=0;
              }
              else if(b[p][q+1]==2&&e1==0||b1[p][q+1]==3&&e==0)
              { if(b[p][q+1]==2)
                { if(a[3]==0)
                  { t=m[p][q];
                    m[p][q]=m[p][q+1];
                    m[p][q+1]=t;
                    q=q+1;
                    e=1;
                  }
                  else
                  e=0;
                }
                else if(b1[p][q+1]==3)
                { if(a1[3]==0)
                  { t1=m[p][q];
                    m[p][q]=m[p][q+1];
                    m[p][q+1]=t1;
                    q=q+1;
                    e1=1;
                  }
                  else
                  e1=0;
                }
              }
              else if(e==1||e1==1)
              { if(e==1)
                { if(a[1]==0)
                  { t=m[p][q];
                    m[p][q]=m[p][q+1];
                    m[p][q+1]=t;
                    q=q+1;
                    e=0;
                  }
                  else
                  { if(b1[p][q+1]==0)
                    { t=m[p][q];
                      m[p][q]=m[p][q+1];
                      m[p][q+1]=t;
                      q=q+1;
                      q=q-1;
                      t=b[p][q];
                      b[p][q]=b[p][q+1];
                      b[p][q+1]=t;
                      q=q+1;
                    }
                    else if(b1[p][q+1]!=0&&a1[3]==0)
                    { t=m[p][q];
                      m[p][q]=m[p][q+1];
                      m[p][q+1]=t;
                      q=q+1;
                      q=q-1;
                      t=b[p][q];
                      b[p][q]=b[p][q+1];
                      b[p][q+1]=t;
                      q=q+1;
                    }
                  }
                }
                if(e1==1)
                { if(a1[1]==0&&b[p][q+1]==0)
                  { t1=m[p][q];
                    m[p][q]=m[p][q+1];
                    m[p][q+1]=t1;
                    q=q+1;
                    e1=0;
                  }
                  else if(a1[1]!=0&&b[p][q+1]==0)
                  { t1=m[p][q];
                    m[p][q]=m[p][q+1];
                    m[p][q+1]=t1;
                    q=q+1;
                    q=q-1;
                    t1=b1[p][q];
                    b1[p][q]=b1[p][q+1];
                    b1[p][q+1]=t1;
                    q=q+1;
                  }
                }
              }
            }
          }
          else if(k==40)
          { if(p+1!=3)
            { if(b[p+1][q]==0&&e==0&&b1[p+1][q]==0&&e1==0)
              { t=m[p][q];
                m[p][q]=m[p+1][q];
                m[p+1][q]=t;
                p=p+1;
                e=0;
                e1=0;
              }
              else if(b[p+1][q]==2&&e1==0||b1[p+1][q]==3&&e==0)
              { if(b[p+1][q]==2)
                { if(a[0]==0)
                  { t=m[p][q];
                    m[p][q]=m[p+1][q];
                    m[p+1][q]=t;
                    p=p+1;
                    e=1;
                  }
                  else
                  e=0;
                }
                else if(b1[p+1][q]==3)
                { if(a1[0]==0)
                  { t1=m[p][q];
                    m[p][q]=m[p+1][q];
                    m[p+1][q]=t1;
                    p=p+1;
                    e1=1;
                  }
                  else
                  e1=0;
                }
              }
              else if(e==1||e1==1)
              { if(e==1)
                { if(a[2]==0)
                  { t=m[p][q];
                    m[p][q]=m[p+1][q];
                    m[p+1][q]=t;
                    p=p+1;
                    e=0;
                  }
                  else
                  { if(b1[p+1][q]==0)
                    { t=m[p][q];
                      m[p][q]=m[p+1][q];
                      m[p+1][q]=t;
                      p=p+1;
                      p=p-1;
                      t=b[p][q];
                      b[p][q]=b[p+1][q];
                      b[p+1][q]=t;
                      p=p+1;
                    }
                    else if(b1[p+1][q]!=0&&a1[0]==0)
                    { t=m[p][q];
                      m[p][q]=m[p+1][q];
                      m[p+1][q]=t;
                      p=p+1;
                      p=p-1;
                      t=b[p][q];
                      b[p][q]=b[p+1][q];
                      b[p+1][q]=t;
                      p=p+1;
                    }
                  }
                }
                if(e1==1)
                { if(a1[2]==0&&b[p+1][q]==0)
                  { t1=m[p][q];
                    m[p][q]=m[p+1][q];
                    m[p+1][q]=t1;
                    p=p+1;
                    e1=0;
                  }
                  else if(a1[2]!=0&&b[p+1][q]==0)
                  { t1=m[p][q];
                    m[p][q]=m[p+1][q];
                    m[p+1][q]=t1;
                    p=p+1;
                    p=p-1;
                    t1=b1[p][q];
                    b1[p][q]=b1[p+1][q];
                    b1[p+1][q]=t1;
                    p=p+1;
                  }
                }
              }
            }
          }
          repaint();
        }
        public void keyReleased(KeyEvent ke)
        {}
        public void keyTyped(KeyEvent ke)
        {}
        public void paint(Graphics g)
        { try
          { setSize(500,500);
            g.drawRect(10,10,480,480);
            g.setColor(Color.gray);
            g.drawLine(170,10,170,490);
            g.drawLine(330,10,330,490);
            g.drawLine(10,170,490,170);
            g.drawLine(10,330,490,330);
            rx=30;
            ry=30;
            r1x=20;
            r1y=20;
            for(i=0;i<3;i++)
            { for(j=0;j<3;j++)
              { if(b[i][j]==2)
                { g.setColor(Color.red);
                  if(a[0]==1)
                  g.fillRect(rx,ry,120,10);
                  if(a[1]==1)
                  g.fillRect(rx+110,ry,10,120);
                  if(a[2]==1)
                  g.fillRect(rx,ry+110,120,10);
                  if(a[3]==1)
                  g.fillRect(rx,ry,10,120);
                }
                if(b1[i][j]==3)
                { g.setColor(Color.blue);
                  if(a1[0]==1)
                  g.fillRect(r1x,r1y,140,10);
                  if(a1[1]==1)
                  g.fillRect(r1x+130,r1y,10,140);
                  if(a1[2]==1)
                  g.fillRect(r1x,r1y+130,140,10);
                  if(a1[3]==1)
                  g.fillRect(r1x,r1y,10,140);
                }
                rx=rx+160;
                r1x=r1x+160;
              }
              ry=ry+160;
              rx=30;
              r1y=r1y+160;
              r1x=20;
            }
            x=65;
            y=65;
            for(i=0;i<3;i++)
            { for(j=0;j<3;j++)
              { if(m[i][j]==1)
                { g.setColor(Color.black);
                  g.fillRect(x,y,40,40);
                  i=3;
                  j=3;
                }
                x=x+160;
              }
              y=y+160;
              x=65;
            }
            for(i=0;i<3;i++)
            { for(j=0;j<3;j++)
              { if(b[i][j]+b1[i][j]==5)
                { e=0;e1=0;
                  for(i=0;i<3;i++)
                  { for(j=0;j<3;j++)
                    { m[i][j]=0;
                      b[i][j]=0;
                      b1[i][j]=0;
                    }
                  }
                  for(i=0;i<4;i++)
                  { a[i]=0;
                    a1[i]=0;
                  }
                  l++;
                  if(l==1)
                  { p=1;
                    q=1;
                    m[p][q]=1;
                    a[0]=1;a[1]=1;a[2]=1;a[3]=0;
                    b[1][2]=2;
                    a1[0]=0;a1[1]=1;a1[2]=1;a1[3]=1;
                    b1[1][0]=3;
                  }
                  /*else if(l==2)
                  {

                  }*/
                  repaint();
                }
              }
            }
            showStatus("  LEVEL="+(l+1));
          }
          catch(Exception e)
          {}
        }
}