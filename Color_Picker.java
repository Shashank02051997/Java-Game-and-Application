//Color Picker
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code="vyon102" width=500 height=450>
 </applet>
 */
public class Color_Picker extends Applet implements MouseListener
{ int i,j,k,z=0,y=0,x=0,a,x1,y1,r1,g1,b1,r2,g2,b2,x2,y2,h;
  TextField red,green,blue;
  public void init()
  { addMouseListener(this);
    r1=0;
    b1=0;
    g1=0;
    red=new TextField();
    green=new TextField();
    blue=new TextField();
    add(red);add(green);add(blue);
    setLayout(null);
    red.setBounds(360,100,80,25);
    green.setBounds(360,150,80,25);
    blue.setBounds(360,200,80,25);
  }
  public void mouseClicked(MouseEvent me)
  { x1=me.getX();
    y1=me.getY();
    z=1;
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
  { setSize(500,450);
    Font f=new Font("Arial",Font.BOLD,14);
    g.setFont(f);
    g.drawString("PICK YOUR COLOR",70,25);
    g.drawString("RED",300,120);
    g.drawString("GREEN",300,170);
    g.drawString("BLUE",300,220);
    g.setColor(Color.GRAY);
    g.fillRect(10,40,260,380);
    g.setColor(Color.WHITE);
    g.fillRect(15,45,250,370);
    for(i=0;i<256;i+=51)
    { for(j=0;j<256;j+=51)
      { for(k=0;k<256;k+=51)
        { Color c=new Color(i,j,k);
          g.setColor(Color.BLACK);
          g.fillRect(x+22,y+52,15,15);
          g.setColor(c);
          g.fillRect(x+21,y+51,15,15);
          if(k==255)
          { if(a==1)
            { x=-20;
              y=y+20;
              a=-1;
            }
            a++;
          }
          x=x+20;
        }
      }
    }
    x=0;y=0;
    r1=0;g1=0;b1=0;
    x2=22;y2=52;
    if(z==1)
    { for(i=0;i<18;i++)
      { if(i==3||i==6||i==9||i==12||i==15)
        { r1=r1+51;
          g1=0;
        }
        for(j=0;j<12;j++)
        { if(x1>=x2&&x1<=x2+15&&y1>=y2&&y1<=y2+15)
          { r2=r1;
            g2=g1;
            b2=b1;
            i=18;
            j=12;
            h=1;
            break;
          }
          else
          h=0;
          b1=b1+51;
          if(j==5||j==11)
          { b1=0;
            g1=g1+51;
          }
          x2=x2+20;
          if(j==11)
          { x2=22;
            y2=y2+20;
          }
        }
      }
    }
    z=0;
    if(h==1)
    { Color c2 = new Color(r2, g2, b2);
      g.setColor(Color.WHITE);
      g.fillRect(x2,y2,15,15);
      g.setColor(c2);
      g.fillRect(x2-1,y2-1,15,15);
    }
    g.setColor(Color.BLACK);
    g.drawString("YOU CHOOSE",350,280);
    Color c1=new Color(r2,g2,b2);
    g.setColor(c1);
    g.fillRect(350,300,90,90);
    red.setText(""+r2);
    green.setText(""+g2);
    blue.setText(""+b2);
    red.setEditable(false);
    green.setEditable(false);
    blue.setEditable(false);
    showStatus(" RED="+r2+" GREEN="+g2+" BLUE="+b2);
  }
}