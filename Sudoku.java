//Sudoku
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;
/*<applet code="Sudoku" width=400 height=400>
</applet>*/
public class Sudoku extends JApplet implements KeyListener
{       int m[]=new int[9];
        int a[][]=new int[9][9];
        int b[][]=new int[9][9];
        int b1[][]=new int[9][9];
        int x1,y1,x2,y2,x3=20,y3=20,x4,y4,i,j,c=0,d=0,h,v=0,z=0;
        int r1,p1,q1;
        char ch;
        private JPanel panel;
        public void init()
        { addKeyListener(this);
          requestFocus();
          int k=0;
	  while(k<9)
          { int e=0;
            Random r=new Random();
            r1=1+r.nextInt(9);
            for(int l=0;l<k;l++)
            { if(m[l]==r1)
	      { k--;
		e=1;
	      }
	    }
	    if(e==0)
            m[k]=r1;
	    k++;
	  }
	  a[0][0]=a[1][6]=a[2][3]=a[3][1]=a[4][7]=a[5][4]=a[6][2]=a[7][8]=a[8][5]=m[8];
	  a[0][1]=a[1][7]=a[2][4]=a[3][0]=a[4][6]=a[5][3]=a[6][5]=a[7][2]=a[8][8]=m[7];
	  a[0][2]=a[1][8]=a[2][5]=a[3][3]=a[4][0]=a[5][6]=a[6][1]=a[7][7]=a[8][4]=m[6];
	  a[0][3]=a[1][0]=a[2][6]=a[3][2]=a[4][8]=a[5][5]=a[6][4]=a[7][1]=a[8][7]=m[5];
	  a[0][4]=a[1][1]=a[2][7]=a[3][5]=a[4][2]=a[5][8]=a[6][0]=a[7][6]=a[8][3]=m[4];
	  a[0][5]=a[1][2]=a[2][8]=a[3][4]=a[4][1]=a[5][7]=a[6][3]=a[7][0]=a[8][6]=m[3];
	  a[0][6]=a[1][3]=a[2][0]=a[3][8]=a[4][5]=a[5][2]=a[6][7]=a[7][4]=a[8][1]=m[2];
	  a[0][7]=a[1][4]=a[2][1]=a[3][6]=a[4][3]=a[5][0]=a[6][8]=a[7][5]=a[8][2]=m[1];
          a[0][8]=a[1][5]=a[2][2]=a[3][7]=a[4][4]=a[5][1]=a[6][6]=a[7][3]=a[8][0]=m[0];
          for(i=0;i<9;i++)
          { for(j=0;j<9;j++)
            b[i][j]=a[i][j];
          }
          for(i=0;i<35;i++)
          { Random p=new Random();
            p1=p.nextInt(9);
            Random q=new Random();
            q1=q.nextInt(9);
            a[p1][q1]=0;
          }
          for(i=0;i<9;i++)
          { for(j=0;j<9;j++)
            b1[i][j]=a[i][j];
          }
          panel = new JPanel()
          { protected void paintComponent(Graphics g)
            { super.paintComponent(g);
              Color cobj=new Color(192,192,192);
              Color cobj1=new Color(117,199,82);
              Color cobj2=new Color(27,103,29);
              Font fobj=new Font("Arial",Font.BOLD,18);
              if(v==1)
              { setBackground(Color.white);
                g.setColor(Color.YELLOW);
                g.fillOval(60,40,200,200);
                g.setColor(Color.BLACK);
                g.fillOval(95,105,30,30);
                g.fillOval(175,105,30,30);
                g.fillOval(90,150,120,60);
                g.setColor(Color.YELLOW);
                g.fillRect(90,150,120,30);
                g.fillOval(90,160,120,40);
                g.setFont(fobj);
                g.setColor(Color.BLACK);
                g.drawString("YOU WIN",280,120);
              }
              else
              { if(ch=='1')
                h=1;
                else if(ch=='2')
                h=2;
                else if(ch=='3')
                h=3;
                else if(ch=='4')
                h=4;
                else if(ch=='5')
                h=5;
                else if(ch=='6')
                h=6;
                else if(ch=='7')
                h=7;
                else if(ch=='8')
                h=8;
                else if(ch=='9')
                h=9;
                else if(ch=='0')
                h=0;
                for(i=0;i<9;i++)
                { for(j=0;j<9;j++)
                  { if(x3==x4&&y3==y4&&b1[i][j]==0)
                    { a[i][j]=h;
                      break;
                    }
                    else
                    x4=x4+40;
                  }
                  x4=20;
                  y4=y4+40;
                }
                x3=x3+c;
                y3=y3+d;
                if(x3<20)
                x3=20;
                if(y3<20)
                y3=20;
                if(x3>340)
                x3=340;
                if(y3>340)
                y3=340;
                g.setColor(cobj1);
                g.fillRect(0,0,400,400);
                g.setColor(Color.WHITE);
                g.setFont(fobj);
                g.drawString("SUDOKU",170,15);
                x1=40;
                y1=40;
                for(i=0;i<9;i++)
                { for(j=0;j<9;j++)
                  { if(b1[i][j]==0)
                    { g.setColor(cobj);
                      g.fillRect(x1-20,y1-20,40,40);
                    }
                    x1=x1+40;
                  }
                  y1=y1+40;
                  x1=40;
                }
                g.setColor(cobj2);
                g.fillRect(x3,y3,40,40);
                x1=40;
                y1=40;
                for(i=0;i<9;i++)
                { for(j=0;j<9;j++)
                  { if(a[i][j]==0)
                    { g.drawString("",x1,y1);
                    }
                    else
                    { g.setColor(Color.WHITE);
                      g.setFont(fobj);
                      g.drawString(""+a[i][j],x1,y1);
                    }
                    x1=x1+40;
                  }
                  y1=y1+40;
                  x1=40;
                }
                g.setColor(Color.WHITE);
                y1=20;
                y2=y1;
                for(i=1;i<11;i++)
                { g.drawLine(20,y1,380,y2);
                  y1=y1+40;
                  y2=y1;
                }
                x1=20;
                x2=20;
                for(i=1;i<11;i++)
                { g.drawLine(x1,20,x2,380);
                  x1=x1+40;
                  x2=x1;
                }
                z=0;
                for(i=0;i<9;i++)
                { for(j=0;j<9;j++)
                  { if(a[i][j]==b[i][j])
                    z++;
                    else
                    z=0;
                  }
                }
                if(z==81)
                { v=1;
                  repaint();
                }
              }
            }
          };
          add(panel);
        }
        public void keyPressed(KeyEvent ke)
        { int k=ke.getKeyCode();
          if(k==37)
          { c=-40;
            d=0;
            h=0;
            ch='0';
          }
          else if(k==38)
          { c=0;
            d=-40;
            h=0;
            ch='0';
          }
          else if(k==39)
          { c=40;
            d=0;
            h=0;
            ch='0';
          }
          else if(k==40)
          { c=0;
            d=40;
            h=0;
            ch='0';
          }
          repaint();
        }
        public void keyReleased(KeyEvent ke)
        {}
        public void keyTyped(KeyEvent ke)
        { ch=ke.getKeyChar();
          c=0;
          d=0;
          x4=20;
          y4=20;
          repaint();
        }
        public void paint(Graphics g)
        { super.paint(g);
          setSize(400,400);
        }
}
