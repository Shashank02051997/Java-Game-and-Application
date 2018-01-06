//Flappy Bird Game
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;
/*<applet code="Flappy_Bird_Game" width=400 height=400>
</applet>*/
public class Flappy_Bird_Game extends JApplet implements KeyListener
{ int k,x1,y1,x2,y2,x3,y3,x4,y4,x5,y5,x6,y6,s,c,f;
  private JPanel panel;
  public void init()
  { addKeyListener(this);
    requestFocus();
    x1=500;
    x2=670;
    x3=840;
    x4=1010;
    x5=1180;
    x6=250;
    y6=250;
    Random r=new Random();
    y2=-150+r.nextInt(300);
    y3=-150+r.nextInt(300);
    y4=-150+r.nextInt(300);
    y5=-150+r.nextInt(300);
    panel = new JPanel()
    { protected void paintComponent(Graphics g)
      { super.paintComponent(g);
        try
        { g.setColor(Color.GRAY);
          g.fillRect(0,450,800,50);
          Color cobj=new Color(163,255,255);
          setBackground(cobj);
          g.setColor(Color.BLACK);
          g.fillRect(x1-1,-1,17,201+y1);
          g.fillRect(x1-1,300+y1,17,151-y1);
          g.fillRect(x2-1,0,17,201+y2);
          g.fillRect(x2-1,300+y2,17,151-y2);
          g.fillRect(x3-1,0,17,201+y3);
          g.fillRect(x3-1,300+y3,17,151-y3);
          g.fillRect(x4-1,0,17,201+y4);
          g.fillRect(x4-1,300+y4,17,151-y4);
          g.fillRect(x5-1,0,17,201+y5);
          g.fillRect(x5-1,300+y5,17,151-y5);
          g.setColor(Color.GREEN);
          g.fillRect(x1,0,15,200+y1);
          g.setColor(Color.BLACK);
          g.fillRect(x1-11,199+y1,37,12);
          g.setColor(Color.GREEN);
          g.fillRect(x1-10,200+y1,35,10);
          g.setColor(Color.BLACK);
          g.fillRect(x1-11,288+y1,37,12);
          g.setColor(Color.GREEN);
          g.fillRect(x1-10,289+y1,35,10);
          g.fillRect(x1,300+y1,15,150-y1);
          g.fillRect(x2,0,15,200+y2);
          g.setColor(Color.BLACK);
          g.fillRect(x2-11,199+y2,37,12);
          g.setColor(Color.GREEN);
          g.fillRect(x2-10,200+y2,35,10);
          g.setColor(Color.BLACK);
          g.fillRect(x2-11,288+y2,37,12);
          g.setColor(Color.GREEN);
          g.fillRect(x2-10,289+y2,35,10);
          g.fillRect(x2,300+y2,15,150-y2);
          g.fillRect(x3,0,15,200+y3);
          g.setColor(Color.BLACK);
          g.fillRect(x3-11,199+y3,37,12);
          g.setColor(Color.GREEN);
          g.fillRect(x3-10,200+y3,35,10);
          g.setColor(Color.BLACK);
          g.fillRect(x3-11,288+y3,37,12);
          g.setColor(Color.GREEN);
          g.fillRect(x3-10,289+y3,35,10);
          g.fillRect(x3,300+y3,15,150-y3);
          g.fillRect(x4,0,15,200+y4);
          g.setColor(Color.BLACK);
          g.fillRect(x4-11,199+y4,37,12);
          g.setColor(Color.GREEN);
          g.fillRect(x4-10,200+y4,35,10);
          g.setColor(Color.BLACK);
          g.fillRect(x4-11,288+y4,37,12);
          g.setColor(Color.GREEN);
          g.fillRect(x4-10,289+y4,35,10);
          g.fillRect(x4,300+y4,15,150-y4);
          g.fillRect(x5,0,15,200+y5);
          g.setColor(Color.BLACK);
          g.fillRect(x5-11,199+y5,37,12);
          g.setColor(Color.GREEN);
          g.fillRect(x5-10,200+y5,35,10);
          g.setColor(Color.BLACK);
          g.fillRect(x5-11,288+y5,37,12);
          g.setColor(Color.GREEN);
          g.fillRect(x5-10,289+y5,35,10);
          g.fillRect(x5,300+y5,15,150-y5);
          if(c==1&&f==0)
          { x1=x1-1;
            if(x1==-15)
            { x1=820;
              Random r=new Random();
              y1=-150+r.nextInt(300);
            }
            x2=x2-1;
            if(x2==-15)
            { x2=820;
              Random r=new Random();
              y2=-150+r.nextInt(300);
            }
            x3=x3-1;
            if(x3==-15)
            { x3=820;
              Random r=new Random();
              y3=-150+r.nextInt(300);
            }
            x4=x4-1;
            if(x4==-15)
            { x4=820;
              Random r=new Random();
              y4=-150+r.nextInt(300);
            }
            x5=x5-1;
            if(x5==-15)
            { x5=820;
              Random r=new Random();
              y5=-150+r.nextInt(300);
            }
            y6=y6+1;
            s++;
          }
          g.setColor(Color.BLACK);
          g.fillOval(x6-1,y6-1,17,17);
          g.setColor(Color.ORANGE);
          g.fillOval(x6,y6,15,15);
          g.setColor(Color.BLACK);
          g.fillOval(x6+6,y6-1,10,10);
          g.setColor(Color.WHITE);
          g.fillOval(x6+7,y6,8,8);
          g.setColor(Color.BLACK);
          g.fillOval(x6-5,y6+6,10,6);
          g.setColor(Color.WHITE);
          g.fillOval(x6-4,y6+7,8,4);
          g.setColor(Color.BLACK);
          g.fillOval(x6+10,y6+2,3,3);
          g.setColor(Color.RED);
          g.fillOval(x6+8,y6+9,11,4);
          if(x6>=x1&&x6<=x1+15&&y6>=0&&y6<=200+y1||x6>=x2&&x6<=x2+15&&y6>=0&&y6<=200+y2||x6>=x3&&x6<=x3+15&&y6>=0&&y6<=200+y3||x6>=x4&&x6<=x4+15&&y6>=0&&y6<=200+y4||x6>=x5&&x6<=x5+15&&y6>=0&&y6<=200+y5)
          f=1;
          if(x6>=x1&&x6<=x1+15&&y6>=300+y1&&y6<=450-y1||x6>=x2&&x6<=x2+15&&y6>=300+y2&&y6<=450-y2||x6>=x3&&x6<=x3+15&&y6>=300+y3&&y6<=450-y3||x6>=x4&&x6<=x4+15&&y6>=300+y4&&y6<=450-y4||x6>=x5&&x6<=x5+15&&y6>=300+y5&&y6<=450-y5)
          f=1;
          if(f==1)
          { Font fobj=new Font("Arial",Font.BOLD,24);
            g.setFont(fobj);
            g.setColor(Color.MAGENTA);
            g.drawString("GAME OVER",370,250);
          }
          Thread.sleep(10);
          repaint();
          showStatus("SCORE="+s/10);
        }
        catch(Exception e)
        {}
      }
    };
    add(panel);
  }
  public void keyTyped(KeyEvent ke)
  {}
  public void keyPressed(KeyEvent ke)
  {}
  public void keyReleased(KeyEvent ke)
  { k=ke.getKeyCode();
    if(k==38&&f==0)
    { y6=y6-50;
      k=40;
      c=1;
    }
  }
  public void paint(Graphics g)
  { super.paint(g);
    setSize(800,500);
  }
}

