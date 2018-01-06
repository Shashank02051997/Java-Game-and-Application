//Paint
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
/*<applet code="vyon90" width=800 height=600>
</applet>*/
public class Paint extends Applet implements MouseListener,MouseMotionListener,ItemListener,ActionListener
{       int i,line,k,k1,k2,k3,q,a,b,ac,bc,cc,x1,y1;
        int w[]=new int[1000];
        int x[]=new int[1000];
        int y[]=new int[1000];
        int z[]=new int[1000];
        int l[]=new int[1000];
        int r[]=new int[1000];
        int o[]=new int[1000];
        int t[]=new int[1000];
        int fr[]=new int[1000];
        int fl[]=new int[1000];
        int fo[]=new int[1000];
        int ft[]=new int[1000];
        int dr[]=new int[1000];
        int dl[]=new int[1000];
        int dov[]=new int[1000];
        int dt[]=new int[1000];
        int wr[]=new int[1000];
        int wl[]=new int[1000];
        int wo[]=new int[1000];
        int wt[]=new int[1000];
        int lwc[]=new int[1000];
        int rr[]=new int[1000];
        int gr[]=new int[1000];
        int br[]=new int[1000];
        int c11[]=new int[75];
        int c22[]=new int[75];
        int c33[]=new int[75];
        Choice shape,line_width;
        Checkbox c1,c2;
        String s,s1,lw;
        public void init()
        { addMouseListener(this);
          addMouseMotionListener(this);
          i=0;
          k1=420;
          shape=new Choice();
          shape.addItem("Line");
          shape.addItem("Rectangle");
          shape.addItem("Oval");
          shape.addItem("Triangle");
          line_width=new Choice();
          line_width.addItem("0");
          line_width.addItem("3");
          line_width.addItem("6");
          line_width.addItem("9");
          line_width.addItem("12");
          line_width.addItem("15");
          line_width.addItem("18");
          Button b1=new Button("Clear");
          Button b2=new Button("Undo");
          c1=new Checkbox("Filled");
          c2=new Checkbox("Dashed");
          add(c1);
          add(c2);
          add(shape);
          add(line_width);
          add(b1);
          add(b2);
          b1.addActionListener(this);
          b2.addActionListener(this);
          c1.addItemListener(this);
          c2.addItemListener(this);
          shape.addItemListener(this);
          line_width.addItemListener(this);
          for(q=0;q<73;q++)
          { Random rd=new Random();
            c11[q]=rd.nextInt(255);
            c22[q]=rd.nextInt(255);
            c33[q]=rd.nextInt(255);
          }
        }
        public void mouseClicked(MouseEvent me)
        { a=me.getX();
          b=me.getY();
          x1=0;
          for(k3=1;k3<25;k3++)
          { if(b>=10&&b<=22)
            { if(a>=420+x1&&a<=432+x1)
              { ac=c11[k3];
                bc=c22[k3];
                cc=c33[k3];
                break;
              }
              x1=x1+15;
            }
            if(b>=25&&b<=37)
            { if(a>=420+x1&&a<=432+x1)
              { ac=c11[k3+24];
                bc=c22[k3+24];
                cc=c33[k3+24];
                break;
              }
              x1=x1+15;
            }
            if(b>=40&&b<=52)
            { if(a>=420+x1&&a<=432+x1)
              { ac=c11[k3+48];
                bc=c22[k3+48];
                cc=c33[k3+48];
                break;
              }
              x1=x1+15;
            }
          }
          repaint();
        }
        public void mouseEntered(MouseEvent me)
        {}
        public void mouseExited(MouseEvent me)
        {}
        public void mousePressed(MouseEvent me)
        { w[i]=me.getX();
          x[i]=me.getY();
        }
        public void mouseReleased(MouseEvent me)
        { i++;
        }
        public void mouseMoved(MouseEvent me)
        {}
        public void mouseDragged(MouseEvent me)
        { y[i]=me.getX();
          z[i]=me.getY();
          repaint();
        }
        public void itemStateChanged(ItemEvent ie)
        { repaint();
          i++;
        }
        public void actionPerformed(ActionEvent ae)
        { s1=ae.getActionCommand();
          if(s1.equals("Undo"))
          { w[i-1]=0;
            x[i-1]=0;
            y[i-1]=0;
            z[i-1]=0;
            r[i-1]=0;
            o[i-1]=0;
            l[i-1]=0;
            t[i-1]=0;
            fr[i-1]=0;
            fo[i-1]=0;
            fl[i-1]=0;
            ft[i-1]=0;
            dr[i-1]=0;
            dov[i-1]=0;
            dl[i-1]=0;
            dt[i-1]=0;
            wr[i-1]=0;
            wo[i-1]=0;
            wl[i-1]=0;
            wt[i-1]=0;
            lwc[i-1]=0;
            i--;
          }
          else if(s1.equals("Clear"))
          { for(i=0;i<1000;i++)
            { w[i]=0;
              x[i]=0;
              y[i]=0;
              z[i]=0;
              r[i]=0;
              o[i]=0;
              l[i]=0;
              t[i]=0;
              fr[i]=0;
              fo[i]=0;
              fl[i]=0;
              ft[i]=0;
              dr[i]=0;
              dov[i]=0;
              dl[i]=0;
              dt[i]=0;
              wr[i]=0;
              wo[i]=0;
              wl[i]=0;
              wt[i]=0;
              lwc[i]=0;
            }
            i=0;
          }
          s1="";
          repaint();
        }
        public void paint(Graphics g)
        { setSize(800,600);
          FlowLayout fobj=new FlowLayout(FlowLayout.LEFT,10,10);
          setLayout(fobj);
          Graphics2D g2 = (Graphics2D) g;
          s=shape.getSelectedItem();
          lw=line_width.getSelectedItem();
          line=Integer.parseInt(lw);
          lwc[i]=line;
          if(s=="Rectangle")
          { if(c1.getState()==true)
            fr[i]=1;
            else if(line_width.getSelectedItem()!="0")
            wr[i]=1;
            else if(c2.getState()==true)
            dr[i]=1;
            else
            r[i]=1;
            rr[i]=ac;
            gr[i]=bc;
            br[i]=cc;
          }
          else if(s=="Line")
          { if(c1.getState()==true)
            fl[i]=1;
            else if(line_width.getSelectedItem()!="0")
            wl[i]=1;
            else if(c2.getState()==true)
            dl[i]=1;
            else
            l[i]=1;
            rr[i]=ac;
            gr[i]=bc;
            br[i]=cc;
          }
          else if(s=="Oval")
          { if(c1.getState()==true)
            fo[i]=1;
            else if(line_width.getSelectedItem()!="0")
            wo[i]=1;
            else if(c2.getState()==true)
            dov[i]=1;
            else
            o[i]=1;
            rr[i]=ac;
            gr[i]=bc;
            br[i]=cc;
          }
          else if(s=="Triangle")
          { if(c1.getState()==true)
            ft[i]=1;
            else if(line_width.getSelectedItem()!="0")
            wt[i]=1;
            else if(c2.getState()==true)
            dt[i]=1;
            else
            t[i]=1;
            rr[i]=ac;
            gr[i]=bc;
            br[i]=cc;
          }
          for(int j=0;j<1000;j++)
          {  Color cobj=new Color(rr[j],gr[j],br[j]);
             g.setColor(cobj);
             if(r[j]==1)
             { g2.setStroke(new BasicStroke(0));
               if(y[j]-w[j]>0&&z[j]-x[j]>0)
               g.drawRect(w[j],x[j],y[j]-w[j],z[j]-x[j]);
               else if(w[j]-y[j]>0&&x[j]-z[j]>0)
               g.drawRect(y[j],z[j],w[j]-y[j],x[j]-z[j]);
               else if(w[j]-y[j]>0&&z[j]-x[j]>0)
               g.drawRect(y[j],x[j],w[j]-y[j],z[j]-x[j]);
               else if(y[j]-w[j]>0&&x[j]-z[j]>0)
               g.drawRect(w[j],z[j],y[j]-w[j],x[j]-z[j]);
             }
             if(fr[j]==1)
             { if(y[j]-w[j]>0&&z[j]-x[j]>0)
               g.fillRect(w[j],x[j],y[j]-w[j],z[j]-x[j]);
               else if(w[j]-y[j]>0&&x[j]-z[j]>0)
               g.fillRect(y[j],z[j],w[j]-y[j],x[j]-z[j]);
               else if(w[j]-y[j]>0&&z[j]-x[j]>0)
               g.fillRect(y[j],x[j],w[j]-y[j],z[j]-x[j]);
               else if(y[j]-w[j]>0&&x[j]-z[j]>0)
               g.fillRect(w[j],z[j],y[j]-w[j],x[j]-z[j]);
             }
             if(dr[j]==1)
             { Stroke dashed = new BasicStroke(0, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[]{9}, 0);
               g2.setStroke(dashed);
               if(y[j]-w[j]>0&&z[j]-x[j]>0)
               g.drawRect(w[j],x[j],y[j]-w[j],z[j]-x[j]);
               else if(w[j]-y[j]>0&&x[j]-z[j]>0)
               g.drawRect(y[j],z[j],w[j]-y[j],x[j]-z[j]);
               else if(w[j]-y[j]>0&&z[j]-x[j]>0)
               g.drawRect(y[j],x[j],w[j]-y[j],z[j]-x[j]);
               else if(y[j]-w[j]>0&&x[j]-z[j]>0)
               g.drawRect(w[j],z[j],y[j]-w[j],x[j]-z[j]);
             }
             if(wr[j]==1)
             { g2.setStroke(new BasicStroke(lwc[j]));
               if(y[j]-w[j]>0&&z[j]-x[j]>0)
               g.drawRect(w[j],x[j],y[j]-w[j],z[j]-x[j]);
               else if(w[j]-y[j]>0&&x[j]-z[j]>0)
               g.drawRect(y[j],z[j],w[j]-y[j],x[j]-z[j]);
               else if(w[j]-y[j]>0&&z[j]-x[j]>0)
               g.drawRect(y[j],x[j],w[j]-y[j],z[j]-x[j]);
               else if(y[j]-w[j]>0&&x[j]-z[j]>0)
               g.drawRect(w[j],z[j],y[j]-w[j],x[j]-z[j]);
             }
          }
          for(int j=0;j<1000;j++)
          { Color cobj=new Color(rr[j],gr[j],br[j]);
            g.setColor(cobj);
            if(l[j]==1)
            { g2.setStroke(new BasicStroke(0));
              g.drawLine(w[j],x[j],y[j],z[j]);
            }
            if(fl[j]==1)
            g.drawLine(w[j],x[j],y[j],z[j]);
            if(dl[j]==1)
            { Stroke dashed = new BasicStroke(0, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[]{9}, 0);
              g2.setStroke(dashed);
              g.drawLine(w[j],x[j],y[j],z[j]);
            }
            if(wl[j]==1)
            { g2.setStroke(new BasicStroke(lwc[j]));
              g.drawLine(w[j],x[j],y[j],z[j]);
            }
          }
          for(int j=0;j<1000;j++)
          { Color cobj=new Color(rr[j],gr[j],br[j]);
            g.setColor(cobj);
            if(o[j]==1)
            { g2.setStroke(new BasicStroke(0));
              if(y[j]-w[j]>0&&z[j]-x[j]>0)
              g.drawOval(w[j],x[j],y[j]-w[j],z[j]-x[j]);
              else if(w[j]-y[j]>0&&x[j]-z[j]>0)
              g.drawOval(y[j],z[j],w[j]-y[j],x[j]-z[j]);
              else if(w[j]-y[j]>0&&z[j]-x[j]>0)
              g.drawOval(y[j],x[j],w[j]-y[j],z[j]-x[j]);
              else if(y[j]-w[j]>0&&x[j]-z[j]>0)
              g.drawOval(w[j],z[j],y[j]-w[j],x[j]-z[j]);
            }
            if(fo[j]==1)
            { if(y[j]-w[j]>0&&z[j]-x[j]>0)
              g.fillOval(w[j],x[j],y[j]-w[j],z[j]-x[j]);
              else if(w[j]-y[j]>0&&x[j]-z[j]>0)
              g.fillOval(y[j],z[j],w[j]-y[j],x[j]-z[j]);
              else if(w[j]-y[j]>0&&z[j]-x[j]>0)
              g.fillOval(y[j],x[j],w[j]-y[j],z[j]-x[j]);
              else if(y[j]-w[j]>0&&x[j]-z[j]>0)
              g.fillOval(w[j],z[j],y[j]-w[j],x[j]-z[j]);
            }
            if(dov[j]==1)
            { Stroke dashed = new BasicStroke(0, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[]{9}, 0);
              g2.setStroke(dashed);
              if(y[j]-w[j]>0&&z[j]-x[j]>0)
              g.drawOval(w[j],x[j],y[j]-w[j],z[j]-x[j]);
              else if(w[j]-y[j]>0&&x[j]-z[j]>0)
              g.drawOval(y[j],z[j],w[j]-y[j],x[j]-z[j]);
              else if(w[j]-y[j]>0&&z[j]-x[j]>0)
              g.drawOval(y[j],x[j],w[j]-y[j],z[j]-x[j]);
              else if(y[j]-w[j]>0&&x[j]-z[j]>0)
              g.drawOval(w[j],z[j],y[j]-w[j],x[j]-z[j]);
            }
            if(wo[j]==1)
            { g2.setStroke(new BasicStroke(lwc[j]));
              if(y[j]-w[j]>0&&z[j]-x[j]>0)
              g.drawOval(w[j],x[j],y[j]-w[j],z[j]-x[j]);
              else if(w[j]-y[j]>0&&x[j]-z[j]>0)
              g.drawOval(y[j],z[j],w[j]-y[j],x[j]-z[j]);
              else if(w[j]-y[j]>0&&z[j]-x[j]>0)
              g.drawOval(y[j],x[j],w[j]-y[j],z[j]-x[j]);
              else if(y[j]-w[j]>0&&x[j]-z[j]>0)
              g.drawOval(w[j],z[j],y[j]-w[j],x[j]-z[j]);
            }
          }
          for(int j=0;j<1000;j++)
          {  Color cobj=new Color(rr[j],gr[j],br[j]);
             g.setColor(cobj);
             if(t[j]==1)
             { g2.setStroke(new BasicStroke(0));
               if(y[j]-w[j]>0&&z[j]-x[j]>0)
               { int t1[]={w[j]+(y[j]-w[j])/2,w[j],y[j]};
                 int t2[]={x[j],z[j],z[j]};
                 g.drawPolygon(t1,t2,3);
                }
               else if(w[j]-y[j]>0&&x[j]-z[j]>0)
               { int t1[]={w[j],y[j],y[j]+(w[j]-y[j])/2};
                 int t2[]={x[j],x[j],z[j]};
                 g.drawPolygon(t1,t2,3);
               }
               else if(w[j]-y[j]>0&&z[j]-x[j]>0)
               { int t1[]={w[j]-(w[j]-y[j])/2,w[j],y[j]};
                 int t2[]={x[j],z[j],z[j]};
                 g.drawPolygon(t1,t2,3);
               }
               else if(y[j]-w[j]>0&&x[j]-z[j]>0)
               { int t1[]={w[j],y[j]-(y[j]-w[j])/2,y[j]};
                 int t2[]={x[j],z[j],x[j]};
                 g.drawPolygon(t1,t2,3);
               }
             }
             if(ft[j]==1)
             { if(y[j]-w[j]>0&&z[j]-x[j]>0)
               { int t1[]={w[j]+(y[j]-w[j])/2,w[j],y[j]};
                 int t2[]={x[j],z[j],z[j]};
                 g.fillPolygon(t1,t2,3);
                }
               else if(w[j]-y[j]>0&&x[j]-z[j]>0)
               { int t1[]={w[j],y[j],y[j]+(w[j]-y[j])/2};
                 int t2[]={x[j],x[j],z[j]};
                 g.fillPolygon(t1,t2,3);
               }
               else if(w[j]-y[j]>0&&z[j]-x[j]>0)
               { int t1[]={w[j]-(w[j]-y[j])/2,w[j],y[j]};
                 int t2[]={x[j],z[j],z[j]};
                 g.fillPolygon(t1,t2,3);
               }
               else if(y[j]-w[j]>0&&x[j]-z[j]>0)
               { int t1[]={w[j],y[j]-(y[j]-w[j])/2,y[j]};
                 int t2[]={x[j],z[j],x[j]};
                 g.fillPolygon(t1,t2,3);
               }
             }
             if(dt[j]==1)
             { Stroke dashed = new BasicStroke(0, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[]{9}, 0);
               g2.setStroke(dashed);
               if(y[j]-w[j]>0&&z[j]-x[j]>0)
               { int t1[]={w[j]+(y[j]-w[j])/2,w[j],y[j]};
                 int t2[]={x[j],z[j],z[j]};
                 g.drawPolygon(t1,t2,3);
                }
               else if(w[j]-y[j]>0&&x[j]-z[j]>0)
               { int t1[]={w[j],y[j],y[j]+(w[j]-y[j])/2};
                 int t2[]={x[j],x[j],z[j]};
                 g.drawPolygon(t1,t2,3);
               }
               else if(w[j]-y[j]>0&&z[j]-x[j]>0)
               { int t1[]={w[j]-(w[j]-y[j])/2,w[j],y[j]};
                 int t2[]={x[j],z[j],z[j]};
                 g.drawPolygon(t1,t2,3);
               }
               else if(y[j]-w[j]>0&&x[j]-z[j]>0)
               { int t1[]={w[j],y[j]-(y[j]-w[j])/2,y[j]};
                 int t2[]={x[j],z[j],x[j]};
                 g.drawPolygon(t1,t2,3);
               }
             }
             if(wt[j]==1)
             { g2.setStroke(new BasicStroke(lwc[j]));
               if(y[j]-w[j]>0&&z[j]-x[j]>0)
               { int t1[]={w[j]+(y[j]-w[j])/2,w[j],y[j]};
                 int t2[]={x[j],z[j],z[j]};
                 g.drawPolygon(t1,t2,3);
                }
               else if(w[j]-y[j]>0&&x[j]-z[j]>0)
               { int t1[]={w[j],y[j],y[j]+(w[j]-y[j])/2};
                 int t2[]={x[j],x[j],z[j]};
                 g.drawPolygon(t1,t2,3);
               }
               else if(w[j]-y[j]>0&&z[j]-x[j]>0)
               { int t1[]={w[j]-(w[j]-y[j])/2,w[j],y[j]};
                 int t2[]={x[j],z[j],z[j]};
                 g.drawPolygon(t1,t2,3);
               }
               else if(y[j]-w[j]>0&&x[j]-z[j]>0)
               { int t1[]={w[j],y[j]-(y[j]-w[j])/2,y[j]};
                 int t2[]={x[j],z[j],x[j]};
                 g.drawPolygon(t1,t2,3);
               }
             }
          }
          g.setColor(Color.WHITE);
          g.fillRect(0,0,800,70);
          for(k=0;k<24;k++)
          { Color cobj1=new Color(c11[k],c22[k],c33[k]);
            g.setColor(cobj1);
            k2=10;
            g.fillRect(k1,k2,12,12);
            k1=420+15*k;
          }
          for(k=24;k<48;k++)
          { Color cobj1=new Color(c11[k],c22[k],c33[k]);
            g.setColor(cobj1);
            k2=25;
            g.fillRect(k1,k2,12,12);
            k1=420+15*(k-24);
          }
          for(k=48;k<72;k++)
          { Color cobj1=new Color(c11[k],c22[k],c33[k]);
            g.setColor(cobj1);
            k2=40;
            g.fillRect(k1,k2,12,12);
            k1=420+15*(k-48);
          }
         showStatus(" k3="+k3);
        }
}

