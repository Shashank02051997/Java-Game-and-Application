//Swan
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*<applet code="Swan" width=450 height=400>
</applet>*/
public class Swan extends JApplet
{       private JPanel panel;
        public void init()
        { panel = new JPanel()
          { protected void paintComponent(Graphics g)
            { super.paintComponent(g);
              setBackground(Color.white);
              try
              { Font fobj=new Font("Chiller",Font.BOLD,22);
                g.setFont(fobj);
                g.drawString("Made By - SHASHANK SINGHAL",180,380);
                Color c1=new Color(173,240,255);
                g.setColor(c1);
                g.fillOval(98+20,52,280,265);
                Color c2=new Color(93,198,222);
                g.setColor(c2);
                g.fillOval(249-90,201-120,205,210);
                Color c3=new Color(46,131,150);
                g.setColor(c3);
                g.fillOval(261-80,247-50,169,81);
                Color c4=new Color(147,179,186);
                g.setColor(c4);
                int t1x[]={149,137,165};
                int t1y[]={119,148,130};
                g.fillPolygon(t1x,t1y,3);
                Color c5=new Color(112,138,143);
                g.setColor(c5);
                int t2x[]={159,137,165};
                int t2y[]={127,148,130};
                g.fillPolygon(t2x,t2y,3);
                Color c6=new Color(206,217,219);
                g.setColor(c6);
                int q1x[]={158,174,161,144};
                int q1y[]={103,101,135,120};
                g.fillPolygon(q1x,q1y,4);
                Color c7=new Color(184,194,196);
                g.setColor(c7);
                int q2x[]={158,174,161,144};
                int q2y[]={107,101,135,120};
                g.fillPolygon(q2x,q2y,4);
                Color c8=new Color(148,171,176);
                g.setColor(c8);
                int q3x[]={193,166,164,169};
                int q3y[]={99,105,117,127};
                g.fillPolygon(q3x,q3y,4);
                Color c9=new Color(232,244,247);
                g.setColor(c9);
                int q4x[]={210,193,171,190};
                int q4y[]={150,99,100,133};
                g.fillPolygon(q4x,q4y,4);
                Color c10=new Color(187,230,240);
                g.setColor(c10);
                int q5x[]={206,185,171,189};
                int q5y[]={213,99,102,136};
                g.fillPolygon(q5x,q5y,4);
                Color c11=new Color(250,254,255);
                g.setColor(c11);
                int q6x[]={174,174,161,144};
                int q6y[]={100,121,135,120};
                g.fillPolygon(q6x,q6y,4);
                Color c12=new Color(233,234,237);
                g.setColor(c12);
                int q7x[]={174,175,159,148};
                int q7y[]={116,123,134,124};
                g.fillPolygon(q7x,q7y,4);
                Color c13=new Color(222,248,255);
                g.setColor(c13);
                int q8x[]={177,211,207,191};
                int q8y[]={229,208,142,132};
                g.fillPolygon(q8x,q8y,4);
                Color c14=new Color(186,223,232);
                g.setColor(c14);
                int q9x[]={186,196,207,203};
                int q9y[]={202,195,144,139};
                g.fillPolygon(q9x,q9y,4);
                Color c15=new Color(136,213,227);
                g.setColor(c15);
                int q10x[]={194,188,244,221};
                int q10y[]={241,197,160,240};
                g.fillPolygon(q10x,q10y,4);
                Color c16=new Color(103,179,191);
                g.setColor(c16);
                int q11x[]={213,214,244,221};
                int q11y[]={237,195,160,240};
                g.fillPolygon(q11x,q11y,4);
                Color c17=new Color(235,251,255);
                g.setColor(c17);
                int q12x[]={176,216,208,197};
                int q12y[]={229,248,143,174};
                g.fillPolygon(q12x,q12y,4);
                Color c18=new Color(162,217,232);
                g.setColor(c18);
                int q13x[]={217,216,207,205};
                int q13y[]={253,248,140,174};
                g.fillPolygon(q13x,q13y,4);
                Color c19=new Color(210,241,247);
                g.setColor(c19);
                int q14x[]={212,175,270,231};
                int q14y[]={239,228,162,244};
                g.fillPolygon(q14x,q14y,4);
                Color c20=new Color(160,213,222);
                g.setColor(c20);
                int q15x[]={214,213,270,231};
                int q15y[]={229,228,162,244};
                g.fillPolygon(q15x,q15y,4);
                Color c21=new Color(240,252,255);
                g.setColor(c21);
                int q16x[]={193,213,257,221};
                int q16y[]={232,197,159,240};
                g.fillPolygon(q16x,q16y,4);
                Color c22=new Color(178,224,237);
                g.setColor(c22);
                int q17x[]={208,213,257,221};
                int q17y[]={236,229,159,240};
                g.fillPolygon(q17x,q17y,4);
                Color c23=new Color(219,244,255);
                g.setColor(c23);
                int q18x[]={217,255,311,178};
                int q18y[]={255,253,209,229};
                g.fillPolygon(q18x,q18y,4);
                Color c24=new Color(223,228,230);
                g.setColor(c24);
                int q19x[]={211,253,267,177};
                int q19y[]={256,254,244,228};
                g.fillPolygon(q19x,q19y,4);
                Color c25=new Color(198,220,230);
                g.setColor(c25);
                int q20x[]={308,219,275,309};
                int q20y[]={154,225,234,210};
                g.fillPolygon(q20x,q20y,4);
                Color c26=new Color(148,208,222);
                g.setColor(c26);
                int q21x[]={319,274,270,309};
                int q21y[]={194,218,240,211};
                g.fillPolygon(q21x,q21y,4);
                Color c27=new Color(234,246,252);
                g.setColor(c27);
                int q22x[]={321,224,284,268};
                int q22y[]={157,224,214,242};
                g.fillPolygon(q22x,q22y,4);
                Color c28=new Color(163,194,207);
                g.setColor(c28);
                int q23x[]={323,270,284,268};
                int q23y[]={156,224,214,242};
                g.fillPolygon(q23x,q23y,4);
                Color c29=new Color(245,253,255);
                g.setColor(c29);
                int q24x[]={288,224,268,273};
                int q24y[]={148,224,199,215};
                g.fillPolygon(q24x,q24y,4);
              }
              catch(Exception e)
              {}
            }
          };
          add(panel);
        }
        public void paint(Graphics g)
        { super.paint(g);
          setSize(450,400);
        }
}
