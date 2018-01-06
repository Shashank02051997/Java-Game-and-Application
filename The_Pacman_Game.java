//The Pacman Game
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*<applet code="The_Pacman_Game" width=600 height=600>
</applet>*/
public class The_Pacman_Game extends JApplet implements KeyListener
{       int a[][]=new int[31][28];
        int b[][]=new int[30][27];
        int m1[][]=new int[31][28];
        int x1,y1,x2,y2,i1,i,j,p1=28,q1=10,e1,e2,t,k,c;
        private JPanel panel;
        public void init()
        { addKeyListener(this);
          requestFocus();
          for(i=0;i<30;i++)
          { for(j=0;j<27;j++)
            { if(i==0&&j==13||i==1&&j==13||i==2&&j==2||i==2&&j==3||i==2&&j==4||i==2&&j==7||i==2&&j==8||i==2&&j==9||i==2&&j==10||i==2&&j==13||i==2&&j==16||i==2&&j==17||i==2&&j==18||i==2&&j==19||i==2&&j==22||
                 i==2&&j==23||i==2&&j==24||i==3&&j==2||i==3&&j==3||i==3&&j==4||i==3&&j==7||i==3&&j==8||i==3&&j==9||i==3&&j==10||i==3&&j==13||i==3&&j==16||i==3&&j==17||i==3&&j==18||i==3&&j==19||
                 i==3&&j==22||i==3&&j==23||i==3&&j==24||i==6&&j==2||i==6&&j==3||i==6&&j==4||i==6&&j==7||i==6&&j==10||i==6&&j==11||i==6&&j==12||i==6&&j==13||i==6&&j==14||i==6&&j==15||i==6&&j==16||
                 i==6&&j==19||i==6&&j==22||i==6&&j==23||i==6&&j==24||i==7&&j==7||i==7&&j==13||i==7&&j==19||i==8&&j==7||i==8&&j==13||i==8&&j==19||i==9&&j==1||i==9&&j==2||i==9&&j==3||i==9&&j==4||
                 i==9&&j==7||i==9&&j==8||i==9&&j==9||i==9&&j==10||i==9&&j==13||i==9&&j==16||i==9&&j==17||i==9&&j==18||i==9&&j==19||i==9&&j==22||i==9&&j==23||i==9&&j==24||i==9&&j==25||i==10&&j==1||
                 i==10&&j==2||i==10&&j==3||i==10&&j==4||i==10&&j==7||i==10&&j==19||i==10&&j==22||i==10&&j==23||i==10&&j==24||i==10&&j==25||i==11&&j==1||i==11&&j==2||i==11&&j==3||i==11&&j==4||i==11&&j==7||
                 i==11&&j==19||i==11&&j==22||i==11&&j==23||i==11&&j==24||i==11&&j==25||i==12&&j==1||i==12&&j==2||i==12&&j==3||i==12&&j==4||i==12&&j==7||i==12&&j==19||i==12&&j==22||i==12&&j==23||i==12&&j==24||
                 i==12&&j==25||i==15&&j==1||i==15&&j==2||i==15&&j==3||i==15&&j==4||i==15&&j==7||i==15&&j==19||i==15&&j==22||i==15&&j==23||i==15&&j==24||i==15&&j==25||i==16&&j==1||i==16&&j==2||i==16&&j==3||
                 i==16&&j==4||i==16&&j==7||i==16&&j==19||i==16&&j==22||i==16&&j==23||i==16&&j==24||i==16&&j==25||i==17&&j==1||i==17&&j==2||i==17&&j==3||i==17&&j==4||i==17&&j==7||i==17&&j==19||i==17&&j==22||
                 i==17&&j==23||i==17&&j==24||i==17&&j==25||i==18&&j==1||i==18&&j==2||i==18&&j==3||i==18&&j==4||i==18&&j==7||i==18&&j==10||i==18&&j==11||i==18&&j==12||i==18&&j==13||i==18&&j==14||i==18&&j==15||
                 i==18&&j==16||i==18&&j==19||i==18&&j==22||i==18&&j==23||i==18&&j==24||i==18&&j==25||i==19&&j==13||i==20&&j==13||i==21&&j==2||i==21&&j==3||i==21&&j==4||i==21&&j==7||i==21&&j==8||i==21&&j==9||
                 i==21&&j==10||i==21&&j==13||i==21&&j==16||i==21&&j==17||i==21&&j==18||i==21&&j==19||i==21&&j==22||i==21&&j==23||i==21&&j==24||i==22&&j==4||i==22&&j==22||i==23&&j==4||i==23&&j==22||i==24&&j==1||
                 i==24&&j==4||i==24&&j==7||i==24&&j==10||i==24&&j==11||i==24&&j==12||i==24&&j==13||i==24&&j==14||i==24&&j==15||i==24&&j==16||i==24&&j==19||i==24&&j==22||i==24&&j==25||i==25&&j==7||i==25&&j==13||
                 i==25&&j==19||i==26&&j==7||i==26&&j==13||i==26&&j==19||i==27&&j==2||i==27&&j==3||i==27&&j==4||i==27&&j==5||i==27&&j==6||i==27&&j==7||i==27&&j==8||i==27&&j==9||i==27&&j==10||i==27&&j==13||
                 i==27&&j==16||i==27&&j==17||i==27&&j==18||i==27&&j==19||i==27&&j==20||i==27&&j==21||i==27&&j==22||i==27&&j==23||i==27&&j==24)
              a[i][j]=2;
              else
              a[i][j]=1;
            }
          }
          a[28][10]=0;
          m1[0][5]=3;
          panel = new JPanel()
          { protected void paintComponent(Graphics g)
            { try
              { super.paintComponent(g);
               Color cobj=new Color(255,153,0);
             if(k==39)
             { if(q1==26)
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
             { if(p1==29)
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
             x1=40;
             y1=40;
             for(i=0;i<30;i++)
             { for(j=0;j<27;j++)
               { if(a[i][j]==0)
                 { g.setColor(cobj);
                   g.fillOval(x1,y1,20,20);
                   if(k==39)
                   { if(c%2==0)
                     { g.setColor(Color.WHITE);
                       g.fillArc(x1,y1,20,20,315,90);
                     }
                     else
                     { g.setColor(Color.WHITE);
                       g.fillArc(x1,y1,20,20,345,30);
                     }
                   }
                   else if(k==37)
                   { if(c%2==0)
                     { g.setColor(Color.WHITE);
                       g.fillArc(x1,y1,20,20,135,90);
                     }
                     else
                     { g.setColor(Color.WHITE);
                       g.fillArc(x1,y1,20,20,160,30);
                     }
                   }
                   else if(k==38)
                   { if(c%2==0)
                     { g.setColor(Color.WHITE);
                       g.fillArc(x1,y1,20,20,45,90);
                     }
                     else
                     { g.setColor(Color.WHITE);
                       g.fillArc(x1,y1,20,20,75,30);
                     }
                   }
                   else if(k==40)
                   { if(c%2==0)
                     { g.setColor(Color.WHITE);
                       g.fillArc(x1,y1,20,20,225,90);
                     }
                     else
                     { g.setColor(Color.WHITE);
                       g.fillArc(x1,y1,20,20,250,30);
                     }
                   }
                 }
                 else if(a[i][j]==1)
                 { g.setColor(Color.WHITE);
                   g.fillRect(x1,y1,20,20);
                 }
                 else if(a[i][j]==2)
                 { g.setColor(Color.GRAY);
                   g.fillRect(x1,y1,20,20);
                 }
                 x1=x1+20;
               }
               y1=y1+20;
               x1=40;
             }
             c++;
             g.setColor(Color.GRAY);
             g.drawRect(30,30,560,620);
             g.drawRect(40,40,540,600);
             //Shortest path algorithm
             b[p1][q1]=10;
             for(i1=0;i1<55;i1++)
             { for(i=0;i<30;i++)
               { for(j=0;j<27;j++)
                 { if(b[i][j]==10+i1)
                   { if(i!=0)
                     { if(a[i-1][j]==1&&b[i-1][j]==0)
                       b[i-1][j]=11+i1;
                     }
                     if(i!=29)
                     { if(a[i+1][j]==1&&b[i+1][j]==0)
                       b[i+1][j]=11+i1;
                     }
                     if(j!=26)
                     { if(a[i][j+1]==1&&b[i][j+1]==0)
                       b[i][j+1]=11+i1;
                     }
                     if(j!=0)
                     { if(a[i][j-1]==1&&b[i][j-1]==0)
                       b[i][j-1]=11+i1;
                     }
                   }
                 }
               }
             }
             x2=40;
             y2=40;
             for(i=0;i<30;i++)
             { for(j=0;j<27;j++)
               { if(m1[i][j]==3)
                 { g.setColor(Color.CYAN);
                   g.fillOval(x2,y2,20,20);
                   if(i!=0&&b[i-1][j]!=0)
                   { if(b[i][j]>b[i-1][j])
                     { t=m1[i][j];
                       m1[i][j]=m1[i-1][j];
                       m1[i-1][j]=t;
                       i=31;
                       j=28;
                       break;
                     }
                   }
                   if(i!=29&&b[i+1][j]!=0)
                   { if(b[i][j]>b[i+1][j])
                     { t=m1[i][j];
                       m1[i][j]=m1[i+1][j];
                       m1[i+1][j]=t;
                       i=31;
                       j=28;
                       break;
                     }
                   }
                   if(j!=26&&b[i][j+1]!=0)
                   { if(b[i][j]>b[i][j+1])
                     { t=m1[i][j];
                       m1[i][j]=m1[i][j+1];
                       m1[i][j+1]=t;
                       i=31;
                       j=28;
                       break;
                     }
                   }
                   if(j!=0&&b[i][j-1]!=0)
                   { if(b[i][j]>b[i][j-1])
                     { t=m1[i][j];
                       m1[i][j]=m1[i][j-1];
                       m1[i][j-1]=t;
                       i=31;
                       j=28;
                       break;
                     }
                   }
                 }
                 x2=x2+20;
               }
               y2=y2+20;
               x2=40;
             }
             for(i=0;i<30;i++)
             { for(j=0;j<27;j++)
               b[i][j]=0;
             }
             Thread.sleep(500);
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
        {  super.paint(g);
           setSize(600,660);
        }
}
