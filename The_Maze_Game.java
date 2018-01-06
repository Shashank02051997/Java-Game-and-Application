//The Maze Game
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*<applet code="The_Maze_Game" width=470 height=470>
</applet>*/
public class The_Maze_Game extends JApplet implements KeyListener
{       int a[][]=new int[20][20];
        int x1,y1,x2,y2,i,j,p1=9,q1=0,e1,e2,t,f=0;
        private JPanel panel;
        public void init()
        { addKeyListener(this);
          requestFocus();
          for(i=0;i<20;i++)
          { for(j=0;j<20;j++)
            { if(i==1&&j==1||i==1&&j==2||i==1&&j==3||i==1&&j==5||i==1&&j==6||i==1&&j==7||i==1&&j==8||i==1&&j==9||i==1&&j==10||i==1&&j==11||i==1&&j==12||i==1&&j==13||i==1&&j==14||i==1&&j==18||
                 i==2&&j==1||i==2&&j==3||i==2&&j==6||i==2&&j==9||i==2&&j==14||i==2&&j==18||i==3&&j==1||i==3&&j==3||i==3&&j==4||i==3&&j==5||i==3&&j==6||i==3&&j==9||i==3&&j==11||i==3&&j==12||
                 i==3&&j==14||i==3&&j==15||i==3&&j==16||i==3&&j==17||i==3&&j==18||i==4&&j==1||i==4&&j==5||i==4&&j==8||i==4&&j==9||i==4&&j==10||i==4&&j==11||i==4&&j==14||i==4&&j==18||i==5&&j==5||
                 i==5&&j==8||i==5&&j==14||i==5&&j==15||i==5&&j==16||i==5&&j==18||i==6&&j==2||i==6&&j==3||i==6&&j==4||i==6&&j==5||i==6&&j==8||i==6&&j==12||i==6&&j==13||i==6&&j==16||i==7&&j==2||
                 i==7&&j==7||i==7&&j==8||i==7&&j==9||i==7&&j==10||i==7&&j==11||i==7&&j==12||i==7&&j==16||i==7&&j==18||i==7&&j==19||i==8&&j==2||i==8&&j==6||i==8&&j==14||i==8&&j==15||i==8&&j==16||
                 i==8&&j==18||i==9&&j==0||i==9&&j==1||i==9&&j==2||i==9&&j==3||i==9&&j==4||i==9&&j==6||i==9&&j==7||i==9&&j==8||i==9&&j==9||i==9&&j==10||i==9&&j==11||i==9&&j==14||i==9&&j==18||
                 i==10&&j==4||i==10&&j==6||i==10&&j==12||i==10&&j==14||i==10&&j==18||i==11&&j==1||i==11&&j==3||i==11&&j==4||i==11&&j==6||i==11&&j==7||i==11&&j==8||i==11&&j==9||i==11&&j==10||i==11&&j==12||
                 i==11&&j==14||i==11&&j==18||i==12&&j==1||i==12&&j==3||i==12&&j==6||i==12&&j==12||i==12&&j==14||i==12&&j==15||i==12&&j==16||i==12&&j==17||i==12&&j==18||i==13&&j==1||i==13&&j==3||i==13&&j==6||
                 i==13&&j==9||i==13&&j==10||i==13&&j==11||i==13&&j==12||i==14&&j==1||i==14&&j==2||i==14&&j==3||i==14&&j==5||i==14&&j==6||i==14&&j==9||i==14&&j==16||i==14&&j==17||i==14&&j==18||i==15&&j==2||
                 i==15&&j==9||i==15&&j==10||i==15&&j==11||i==15&&j==12||i==15&&j==13||i==15&&j==14||i==15&&j==16||i==15&&j==18||i==16&&j==2||i==16&&j==3||i==16&&j==4||i==16&&j==5||i==16&&j==6||i==16&&j==7||
                 i==16&&j==8||i==16&&j==9||i==16&&j==12||i==16&&j==14||i==16&&j==15||i==16&&j==16||i==16&&j==18||i==17&&j==2||i==17&&j==12||i==18&&j==1||i==18&&j==2||i==18&&j==4||i==18&&j==5||i==18&&j==6||
                 i==18&&j==7||i==18&&j==8||i==18&&j==9||i==18&&j==10||i==18&&j==11||i==18&&j==12||i==18&&j==13||i==18&&j==14||i==18&&j==15||i==18&&j==16||i==18&&j==17||i==18&&j==18)
              a[i][j]=1;
              else
              a[i][j]=2;
            }
          }
          a[9][0]=0;
          panel = new JPanel()
          { protected void paintComponent(Graphics g)
            { super.paintComponent(g);
              Color cobj=new Color(153,253,170);
              Font fobj=new Font("Arial",Font.BOLD,24);
              if(f==0)
              { x1 = 40;
                y1=40;
                for(i=0;i<20;i++)
                { for(j=0;j<20;j++)
                  { if(a[i][j]==0)
                    { g.setColor(cobj);
                      g.fillRect(x1, y1, 20, 20);
                    }
                    else if(a[i][j]==1)
                    { g.setColor(Color.WHITE);
                      g.fillRect(x1, y1, 20, 20);
                    }
                    else if(a[i][j]==2)
                    { g.setColor(Color.GRAY);
                      g.fillRect(x1, y1, 20, 20);
                    }
                    x1=x1+20;
                  }
                  y1=y1+20;
                  x1=40;
                }
              }
              if(a[7][19]==0)
              { f=1;
                g.setFont(fobj);
                g.setColor(Color.MAGENTA);
                g.drawString("YOU WIN",200,250);
                repaint();
              }
            }
          };
          add(panel);
        }
        public void keyPressed(KeyEvent ke)
        { int k=ke.getKeyCode();
          if(k==39)
          { if(q1==19)
            e1=0;
            else
            e1=-1;
            if(a[p1][q1-e1]==1)
            { t=a[p1][q1];
              a[p1][q1]=a[p1][q1-e1];
              a[p1][q1-e1]=t;
              q1=q1-e1;
            }
          }
          else if(k==40)
          { if(p1==19)
            e2=0;
            else
            e2=-1;
            if(a[p1-e2][q1]==1)
            { t=a[p1][q1];
              a[p1][q1]=a[p1-e2][q1];
              a[p1-e2][q1]=t;
              p1=p1-e2;
            }
          }
          else if(k==37)
          { if(q1==0)
            e1=0;
            else
            e1=1;
            if(a[p1][q1-e1]==1)
            { t=a[p1][q1];
              a[p1][q1]=a[p1][q1-e1];
              a[p1][q1-e1]=t;
              q1=q1-e1;
            }
          }
          else if(k==38)
          { if(p1==0)
            e2=0;
            else
            e2=1;
            if(a[p1-e2][q1]==1)
            { t=a[p1][q1];
              a[p1][q1]=a[p1-e2][q1];
              a[p1-e2][q1]=t;
              p1=p1-e2;
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
          setSize(470,470);
        }
}
