//The Line Zen game
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*<applet code="The_Line_Zen_game" width=400 height=400>
 </applet>
 */
public class The_Line_Zen_game extends JApplet implements MouseListener,MouseMotionListener
{        int bx,by,i,x,y,c,x1,y1,f,f1;
         int d1[]={1,1,1,1,1,1,1,1,1,1,
                  1,1,1,1,1,1,1,1,1,1,
                  1,1,1,1,1,1,1,1,1,1,
                  0,0,0,1,1,1,1,0,0,0,
                  0,0,0,1,0,0,1,0,0,0,
                  0,0,0,1,1,1,1,0,0,0,
                  0,1,1,1,1,1,1,1,1,0,
                  0,0,0,0,1,1,0,0,0,0,
                  0,0,0,0,1,1,0,0,0,0,
                  0,0,0,0,1,1,0,0,0,0,
                  0,0,0,0,1,1,1,0,0,0,
                  0,0,0,0,0,1,1,1,0,0,
                  0,0,0,0,0,0,1,1,1,0,
                  0,0,0,0,0,0,0,1,1,0,
                  0,0,0,0,0,0,0,1,1,0,
                  0,0,0,0,0,0,0,1,1,0,
                  0,0,0,0,1,1,1,1,1,0,
                  0,0,0,0,1,1,1,1,1,0,
                  0,0,0,0,1,1,1,1,1,0,
                  0,0,0,0,1,1,0,0,0,0,
                  0,0,0,0,1,1,0,0,0,0,
                  0,0,0,0,1,1,0,0,0,0,
                  0,0,0,1,1,1,0,0,0,0,
                  0,0,1,1,1,0,0,0,0,0,
                  0,1,1,1,0,0,0,0,0,0,
                  0,1,1,0,0,0,0,0,0,0,
                  0,1,1,1,0,0,0,0,0,0,
                  0,1,1,1,1,0,0,0,0,0,
                  0,0,0,1,1,1,0,0,0,0,
                  0,0,0,0,1,1,0,0,0,0,
                  0,0,0,0,1,1,0,0,0,0,
                  0,0,0,0,1,1,0,0,0,0,
                  0,0,0,0,1,1,0,0,0,0,
                  0,0,0,0,1,1,0,0,0,0,
                  0,0,0,0,1,1,0,0,0,0,
                  0,0,0,0,1,1,0,0,0,0,
                  0,0,0,0,1,1,0,0,0,0,
                  0,0,0,0,1,1,0,0,0,0,
                  0,0,0,0,1,1,0,0,0,0,
                  0,0,0,0,1,1,0,0,0,0,
                  0,0,0,0,1,1,0,0,0,0,
                  1,1,1,1,1,1,1,1,1,1,
                  1,1,1,1,1,1,1,1,1,1,
                  1,1,1,1,1,1,1,1,1,1,
                  1,1,1,1,1,1,1,1,1,1,
                  1,1,1,1,1,1,1,1,1,1,
                  1,1,1,1,1,1,1,1,1,1,
                  1,1,1,1,1,1,1,1,1,1,
                  1,1,1,1,1,1,1,1,1,1};
         int d2[]={1,1,1,1,1,1,1,1,1,1,
                   1,1,1,1,1,1,1,1,1,1,
                   1,1,1,1,1,1,1,1,1,1,
                   1,1,1,1,1,1,1,1,1,1,
                   0,0,1,1,0,0,1,1,1,0,
                   0,0,0,1,1,1,1,1,0,0,
                   0,0,0,1,1,1,1,0,0,0,
                   0,0,0,0,1,1,0,0,0,0,
                   0,0,0,0,1,1,0,0,0,0,
                   0,0,0,0,1,1,0,0,0,0,
                   0,0,0,0,1,1,1,0,0,0,
                   0,0,0,0,0,1,1,1,0,0,
                   0,0,0,0,0,0,1,1,1,0,
                   0,0,0,0,0,0,0,1,1,0,
                   0,0,0,0,0,0,0,1,1,0,
                   0,0,0,0,0,0,0,1,1,0,
                   0,0,0,0,1,1,1,1,1,0,
                   0,0,0,0,1,1,1,0,1,0,
                   0,0,0,0,1,1,1,1,1,0,
                   0,0,0,0,1,1,0,0,0,0,
                   0,0,0,0,1,1,0,0,0,0,
                   0,0,0,0,1,1,1,0,0,0,
                   0,0,0,1,1,1,1,1,1,0,
                   0,0,1,1,1,0,1,1,1,1,
                   0,1,1,1,1,0,1,0,1,1,
                   0,1,1,0,1,1,1,0,0,1,
                   0,1,1,1,0,0,1,0,0,1,
                   0,1,1,1,1,0,1,0,0,1,
                   0,0,0,1,1,1,1,0,1,1,
                   0,0,0,1,1,1,1,0,1,1,
                   0,0,0,1,1,1,1,1,1,1,
                   0,0,0,1,1,1,1,1,1,0,
                   0,0,0,1,1,1,1,0,0,0,
                   0,0,0,0,1,1,0,0,0,0,
                   0,0,0,0,1,1,0,0,0,0,
                   0,0,0,0,1,1,0,0,0,0,
                   0,0,0,0,1,1,0,0,0,0,
                   0,0,0,0,1,1,0,0,0,0,
                   0,0,0,0,1,1,0,0,0,0,
                   0,0,0,0,1,1,0,0,0,0,
                   0,0,0,0,1,1,0,0,0,0,
                   0,0,0,0,1,1,0,0,0,0,
                   0,0,0,0,1,1,0,0,0,0,
                   1,1,1,1,1,1,1,1,1,1,
                   1,1,1,1,1,1,1,1,1,1,
                   1,1,1,1,1,1,1,1,1,1};
         int d3[]={1,1,1,1,1,1,1,1,1,1,
                   1,1,1,1,1,1,1,1,1,1,
                   1,1,1,1,1,1,1,1,1,1,
                   1,1,1,1,1,1,1,1,1,1,
                   0,0,0,1,1,1,1,0,0,0,
                   0,0,0,1,0,0,1,0,0,0,
                   0,1,1,1,1,1,1,0,0,0,
                   0,1,1,1,1,1,1,1,1,0,
                   0,1,0,1,1,1,0,0,0,0,
                   0,1,0,1,1,1,0,0,0,0,
                   0,1,0,1,1,1,0,0,0,0,
                   0,1,0,1,1,1,1,0,0,0,
                   0,1,0,0,0,1,1,1,0,0,
                   0,1,0,0,0,1,1,1,1,0,
                   0,1,0,0,0,1,0,1,1,0,
                   0,1,0,0,0,1,0,1,1,0,
                   0,1,0,0,0,1,0,1,1,0,
                   0,1,0,0,0,1,1,1,1,0,
                   0,1,1,0,0,1,1,1,1,0,
                   0,1,1,1,0,1,1,1,1,0,
                   0,0,1,1,0,1,0,0,0,0,
                   0,0,0,1,0,1,0,0,0,0,
                   0,1,0,1,0,1,0,0,0,0,
                   0,1,0,1,0,1,0,0,0,0,
                   0,1,0,1,0,1,0,0,0,0,
                   0,1,0,1,0,1,0,0,0,0,
                   0,1,0,1,0,1,0,0,0,0,
                   0,1,1,1,1,1,0,0,0,0,
                   0,1,1,1,1,1,0,0,0,0,
                   0,1,0,0,0,1,0,0,0,0,
                   0,1,0,0,0,1,0,0,0,0,
                   0,1,0,0,0,1,0,0,0,0,
                   0,1,0,0,1,1,0,0,0,0,
                   0,1,0,1,1,1,0,0,0,0,
                   0,1,1,1,1,0,0,0,0,0,
                   0,1,1,1,0,0,0,0,0,0,
                   0,1,1,0,1,1,0,0,0,0,
                   0,1,1,0,1,1,0,0,0,0,
                   0,1,1,0,1,1,0,0,0,0,
                   0,1,1,1,1,1,0,0,0,0,
                   0,0,1,1,1,1,0,0,0,0,
                   0,0,0,0,1,1,0,0,0,0,
                   0,0,0,0,1,1,0,0,0,0,
                   0,0,0,0,1,1,0,0,0,0,
                   1,1,1,1,1,1,1,1,1,1,
                   1,1,1,1,1,1,1,1,1,1,
                   1,1,1,1,1,1,1,1,1,1};
         private JPanel panel;
         public void init()
         { addMouseListener(this);
           addMouseMotionListener(this);
           bx=200;
           by=300;
           panel = new JPanel()
           { protected void paintComponent(Graphics g)
             { try
               { super.paintComponent(g);
                 Font fobj=new Font("Arial",Font.ITALIC,24);
                 Color cobj1=new Color(247,217,126);
                 Color cobj2=new Color(255,0,81);
                 Color cobj3=new Color(7,157,171);
                 if(f==0)
                 { x=0;
                   y=-1600+c;
                   for(i=0;i<d1.length;i++)
                   { if(i%10==0&&i!=0)
                     { x=0;
                       y=y+40;
                     }
                     if(d1[i]==0)
                     { if(bx>=x&&bx<=x+40&&by>=y&&by<=y+40||bx+10>=x&&bx+10<=x+40&&by>=y&&by<=y+40)
                       f=1;
                       g.setColor(cobj1);
                       g.fillRect(x,y,40,40);
                     }
                     else if(d1[i]==1)
                     { g.setColor(cobj2);
                       g.fillRect(x,y,40,40);
                     }
                     x=x+40;
                   }
                   c=c+10;
                   g.setColor(cobj3);
                   g.fillOval(bx,by,18,18);
                   Thread.sleep(100);
                   repaint();
                 }
                 else if(f==1)
                 { x=0;
                   y=-1600+c;
                   for(i=0;i<d1.length;i++)
                   { if(i%10==0&&i!=0)
                     { x=0;
                       y=y+40;
                     }
                     if(d1[i]==0)
                     { if(bx>=x&&bx<=x+40&&by>=y&&by<=y+40||bx+10>=x&&bx+10<=x+40&&by>=y&&by<=y+40)
                       f=1;
                       g.setColor(cobj1);
                       g.fillRect(x,y,40,40);
                     }
                     else if(d1[i]==1)
                     { g.setColor(cobj2);
                       g.fillRect(x,y,40,40);
                     }
                     x=x+40;
                   }
                   g.setColor(cobj3);
                   g.fillOval(bx,by,18,18);
                   g.setFont(fobj);
                   g.setColor(Color.black);
                   g.drawString("GAME OVER",150,200);
                 }
                 if(f==2)
                 { x=0;
                   y=-1600+c;
                   for(i=0;i<d2.length;i++)
                   { if(i%10==0&&i!=0)
                     { x=0;
                       y=y+40;
                     }
                     if(d2[i]==0)
                     { if(bx>=x&&bx<=x+40&&by>=y&&by<=y+40||bx+10>=x&&bx+10<=x+40&&by>=y&&by<=y+40)
                       f=3;
                       g.setColor(cobj1);
                       g.fillRect(x,y,40,40);
                     }
                     else if(d2[i]==1)
                     { g.setColor(cobj2);
                       g.fillRect(x,y,40,40);
                     }
                     x=x+40;
                   }
                   c=c+10;
                   g.setColor(cobj3);
                   g.fillOval(bx,by,18,18);
                   Thread.sleep(100);
                   repaint();
                 }
                 else if(f==3)
                 { x=0;
                   y=-1600+c;
                   for(i=0;i<d2.length;i++)
                   { if(i%10==0&&i!=0)
                     { x=0;
                      y=y+40;
                     }
                     if(d2[i]==0)
                     { if(bx>=x&&bx<=x+40&&by>=y&&by<=y+40||bx+10>=x&&bx+10<=x+40&&by>=y&&by<=y+40)
                       f=3;
                       g.setColor(cobj1);
                       g.fillRect(x,y,40,40);
                     }
                     else if(d2[i]==1)
                     { g.setColor(cobj2);
                       g.fillRect(x,y,40,40);
                     }
                     x=x+40;
                   }
                   g.setColor(cobj3);
                   g.fillOval(bx,by,18,18);
                   g.setFont(fobj);
                   g.setColor(Color.black);
                   g.drawString("GAME OVER",150,200);
                 }
                 if(f==4)
                 { x=0;
                   y=-1600+c;
                   for(i=0;i<d3.length;i++)
                   { if(i%10==0&&i!=0)
                     { x=0;
                       y=y+40;
                     }
                     if(d3[i]==0)
                     { if(bx>=x&&bx<=x+40&&by>=y&&by<=y+40||bx+10>=x&&bx+10<=x+40&&by>=y&&by<=y+40)
                       f=5;
                       g.setColor(cobj1);
                       g.fillRect(x,y,40,40);
                     }
                     else if(d3[i]==1)
                     { g.setColor(cobj2);
                       g.fillRect(x,y,40,40);
                     }
                     x=x+40;
                   }
                   c=c+10;
                   g.setColor(cobj3);
                   g.fillOval(bx,by,18,18);
                   Thread.sleep(100);
                   repaint();
                  }
                  else if(f==5)
                  { x=0;
                    y=-1600+c;
                    for(i=0;i<d3.length;i++)
                    { if(i%10==0&&i!=0)
                      { x=0;
                        y=y+40;
                      }
                      if(d3[i]==0)
                      { if(bx>=x&&bx<=x+40&&by>=y&&by<=y+40||bx+10>=x&&bx+10<=x+40&&by>=y&&by<=y+40)
                        f=5;
                        g.setColor(cobj1);
                        g.fillRect(x,y,40,40);
                      }
                      else if(d3[i]==1)
                      { g.setColor(cobj2);
                        g.fillRect(x,y,40,40);
                      }
                      x=x+40;
                    }
                    g.setColor(cobj3);
                    g.fillOval(bx,by,18,18);
                    g.setFont(fobj);
                    g.setColor(Color.black);
                    g.drawString("GAME OVER",150,200);
                  }
                  if(y>2200)
                  { f1=f1+2;
                    f=f1;
                    c=0;
                    Thread.sleep(2000);
                  }
                  if(f1==6)
                  { g.setColor(Color.black);
                    g.setFont(fobj);
                    g.drawString("YOU WIN ! CLEAR ALL LEVELS",50,200);
                    f1=4;
                  }
                  showStatus("LEVEL="+f1/2);
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
         {}
         public void mouseReleased(MouseEvent me)
         {}
         public void mouseMoved(MouseEvent me)
         {}
         public void mouseDragged(MouseEvent me)
         { if(f!=1&&f!=3&&f!=5)
           { bx=me.getX();
             repaint();
           }
         }
         public void paint(Graphics g)
         { setSize(400,400);
           super.paint(g);
         }
}