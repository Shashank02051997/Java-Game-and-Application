//Snices Game
//Having some bugs
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;
/*<applet code="Snices_Game" width=500 height=500>
 </applet>
 */
public class Snices_Game extends JApplet implements KeyListener
{       int k,i,j,x,y,s1x,s1y,k1,s2x,s2y,k2,f,rand,rand1,c;
        int s1[][]=new int[100][100];
        int s2[][]=new int[100][100];
        private JPanel panel;
        public void init()
        { addKeyListener(this);
          requestFocus();
          for(i=0;i<100;i++)
          { for(j=0;j<100;j++)
            { s1[i][j]=0;
              s2[i][j]=0;
            }
          }
          c=30;
          s1x=45;
          s1y=20;
          s2x=45;
          s2y=55;
          s1[s1x][s1y]=1;
          s2[s2x][s2y]=2;
          panel = new JPanel()
          { protected void paintComponent(Graphics g)
            { try
              { super.paintComponent(g);
                setBackground(Color.BLACK);
                if(f==0)
                { if(k1==37&&k==39)
                  k=k1;
                  else if(k1==39&&k==37)
                  k=k1;
                  else if(k1==38&&k==40)
                  k=k1;
                  else if(k1==40&&k==38)
                  k=k1;
                  if(k==37)
                  { s1y=s1y-1;
                    if(s1y==-1)
                    f=1;
                    else if(s1[s1x][s1y]==0&&s2[s1x][s1y]!=2)
                    s1[s1x][s1y]=1;
                    else if(s1[s1x][s1y]==1||s2[s1x][s1y]==2)
                    f=1;
                    k1=k;
                  }
                  else if(k==39)
                  { s1y=s1y+1;
                    if(s1y==100)
                    f=1;
                    else if(s1[s1x][s1y]==0&&s2[s1x][s1y]!=2)
                    s1[s1x][s1y]=1;
                    else if(s1[s1x][s1y]==1||s2[s1x][s1y]==2)
                    f=1;
                    k1=k;
                  }
                  else if(k==38)
                  { s1x=s1x-1;
                    if(s1x==-1)
                    f=1;
                    else if(s1[s1x][s1y]==0&&s2[s1x][s1y]!=2)
                    s1[s1x][s1y]=1;
                    else if(s1[s1x][s1y]==1||s2[s1x][s1y]==2)
                    f=1;
                    k1=k;
                  }
                  else if(k==40)
                  { s1x=s1x+1;
                    if(s1x==100)
                    f=1;
                    else if(s1[s1x][s1y]==0&&s2[s1x][s1y]!=2)
                    s1[s1x][s1y]=1;
                    else if(s1[s1x][s1y]==1||s2[s1x][s1y]==2)
                    f=1;
                    k1=k;
                  }
                  if(k==37||k==38||k==39||k==40)
                  { for(i=0;i<10;i++)
                    { if(c==30||c==rand1)
                      { Random r=new Random();
                        rand=37+r.nextInt(4);
                        if(k2==37&&rand==37||k2==38&&rand==38||k2==39&&rand==39||k2==40&&rand==40)
                        i=0;
                        else if(k2==37&&rand==39||k2==39&&rand==37||k2==38&&rand==40||k2==40&&rand==38)
                        i=0;
                        else
                        { i=10;
                          c=0;
                          Random r1=new Random();
                          rand1=15+r1.nextInt(16);
                        }
                      }
                    }
                    k2=rand;
                  }
                  if(k2==37)
                  { if(s2[s2x][s2y-1]==2||s1[s2x][s2y-1]==1||s2y-1==0)
                    { if(s2[s2x+1][s2y]==0&&s1[s2x+1][s2y]!=1)
                      { s2[s2x+1][s2y]=2;
                        s2x=s2x+1;
                      }
                      else if(s2[s2x-1][s2y]==0&&s1[s2x-1][s2y]!=1)
                      { s2[s2x-1][s2y]=2;
                        s2x=s2x-1;
                      }
                      else if(s2[s2x][s2y+1]==0)
                      { s2[s2x][s2y+1]=2;
                        s2y=s2y+1;
                      }
                      else
                      f=1;
                    }
                    else if(s2[s2x][s2y-1]==0&&s1[s2x][s2y-1]!=1)
                    { s2[s2x][s2y-1]=2;
                      s2y=s2y-1;
                    }
                  }
                  else if(k2==39)
                  { if(s2[s2x][s2y+1]==2||s1[s2x][s2y+1]==1||s2y+1==99)
                    { if(s2[s2x+1][s2y]==0&&s1[s2x+1][s2y]!=1)
                      { s2[s2x+1][s2y]=2;
                        s2x=s2x+1;
                      }
                      else if(s2[s2x-1][s2y]==0&&s1[s2x-1][s2y]!=1)
                      { s2[s2x-1][s2y]=2;
                        s2x=s2x-1;
                      }
                      else if(s2[s2x][s2y-1]==0)
                      { s2[s2x][s2y-1]=2;
                        s2y=s2y-1;
                      }
                      else
                      f=1;
                    }
                    else if(s2[s2x][s2y+1]==0&&s1[s2x][s2y+1]!=1)
                    { s2[s2x][s2y+1]=2;
                      s2y=s2y+1;
                    }
                  }
                  else if(k2==38)
                  { if(s2[s2x-1][s2y]==2||s1[s2x-1][s2y]==1||s2x-1==0)
                    { if(s2[s2x][s2y+1]==0&&s1[s2x][s2y+1]!=1)
                      { s2[s2x][s2y+1]=2;
                        s2y=s2y+1;
                      }
                      else if(s2[s2x][s2y-1]==0&&s1[s2x][s2y-1]!=1)
                      { s2[s2x][s2y-1]=2;
                        s2y=s2y-1;
                      }
                      else if(s2[s2x+1][s2y]==0)
                      { s2[s2x+1][s2y]=2;
                        s2x=s2x+1;
                      }
                      else
                      f=1;
                    }
                    else if(s2[s2x-1][s2y]==0&&s1[s2x-1][s2y]!=1)
                    { s2[s2x-1][s2y]=2;
                      s2x=s2x-1;
                    }
                  }
                  else if(k2==40)
                  { if(s2[s2x+1][s2y]==2||s1[s2x+1][s2y]==1||s2x+1==99)
                    { if(s2[s2x][s2y+1]==0&&s1[s2x][s2y+1]!=1)
                      { s2[s2x][s2y+1]=2;
                        s2y=s2y+1;
                      }
                      else if(s2[s2x][s2y-1]==0&&s1[s2x][s2y-1]!=1)
                      { s2[s2x][s2y-1]=2;
                        s2y=s2y-1;
                      }
                      else if(s2[s2x-1][s2y]==0)
                      { s2[s2x-1][s2y]=2;
                        s2x=s2x-1;
                      }
                      else
                      f=1;
                    }
                    else if(s2[s2x+1][s2y]==0&&s1[s2x+1][s2y]!=1)
                    { s2[s2x+1][s2y]=2;
                      s2x=s2x+1;
                    }
                  }
                }
                x=0;
                y=0;
                for(i=0;i<100;i++)
                { for(j=0;j<100;j++)
                  { if(s1[i][j]==1)
                    { g.setColor(Color.BLUE);
                      g.fillRect(x,y,5,5);
                    }
                    if(s2[i][j]==2)
                    { g.setColor(Color.RED);
                      g.fillRect(x,y,5,5);
                    }
                    x=x+5;
                  }
                  x=0;
                  y=y+5;
                }
                if(f==1)
                { g.setColor(Color.WHITE);
                  Font fobj=new Font("Arial",Font.BOLD,24);
                  g.setFont(fobj);
                  g.drawString("GAME OVER",200,250);
                }
                if(k==37||k==38||k==39||k==40)
                c++;
                Thread.sleep(30);
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
          repaint();
        }
        public void keyReleased(KeyEvent ke)
        {}
        public void keyTyped(KeyEvent ke)
        {}
        public void paint(Graphics g)
        { setSize(500,500);
          super.paint(g);
        }
}