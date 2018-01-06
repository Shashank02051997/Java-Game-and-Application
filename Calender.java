//Calender
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*<APPLET Code="vyon119" Width=500 Height=400>
</APPLET>*/
public class Calender extends Applet implements ItemListener
{ int m,y,i,j,k,l,y1,p,q,r,f,s,d,x2,y2;
  String mon,yr;
  List month,year;
  public void init()
  { mon="1";
    yr="1995";
    y1=-5;
    month=new List();
    year=new List();
    month.add("1");month.add("2");month.add("3");month.add("4");month.add("5");month.add("6");month.add("7");month.add("8");
    month.add("9");month.add("10");month.add("11");month.add("12");
    year.add("1995");year.add("1996");year.add("1997");year.add("1998");year.add("1999");year.add("2000");year.add("2001");
    year.add("2002");year.add("2003");year.add("2004");year.add("2005");year.add("2006");year.add("2007");year.add("2008");
    year.add("2009");year.add("2010");year.add("2011");year.add("2012");year.add("2013");year.add("2014");year.add("2015");
    year.add("2016");year.add("2017");year.add("2018");year.add("2019");year.add("2020");year.add("2021");year.add("2022");
    year.add("2023");year.add("2024");year.add("2025");year.add("2026");year.add("2027");year.add("2028");year.add("2029");
    year.add("2030");year.add("2031");year.add("2032");year.add("2033");year.add("2034");year.add("2035");year.add("2036");
    year.add("2037");year.add("2038");year.add("2039");year.add("2040");year.add("2041");year.add("2042");year.add("2043");
    year.add("2044");year.add("2045");year.add("2046");year.add("2047");year.add("2048");year.add("2049");year.add("2050");
    year.add("2051");year.add("2052");year.add("2053");year.add("2054");year.add("2055");year.add("2056");year.add("2057");
    year.add("2058");year.add("2059");year.add("2060");year.add("2061");year.add("2062");year.add("2063");year.add("2064");
    year.add("2065");year.add("2066");year.add("2067");year.add("2068");year.add("2069");year.add("2070");year.add("2071");
    add(month);
    add(year);
    month.addItemListener(this);
    year.addItemListener(this);
  }
  public void itemStateChanged(ItemEvent ie)
  { x2=170;
    y2=120;
    m=0;y=0;i=0;j=0;k=0;l=0;y1=0;p=0;q=0;r=0;f=0;s=0;d=0;
    repaint();
  }
  public void paint(Graphics g)
  {   try
      { setSize(500,400);
        setLayout(null);
        x2=170;
        y2=120;
        month.setBounds(10,130,100,70);
        year.setBounds(10,240,100,70);
        if(month.getSelectedItem()!=null)
        mon=month.getSelectedItem();
        if(year.getSelectedItem()!=null)
        yr=year.getSelectedItem();
        m=Integer.parseInt(mon);
        y=Integer.parseInt(yr);
        Font fobj=new Font("Jokerman",Font.BOLD,24);
        g.setFont(fobj);
        for(l=1990;l<y;l++)
        y1++;
        if(y%4==0)
	s=1;
	if(m==1)
	{ g.drawString("JANUARY  "+y,230,30);
          q=1+365*y1;
	  r=32+365*y1;
	}
	if(m==2)
	{ g.drawString("FEBUARY  "+y,230,30);
          q=32+365*y1;
	  r=60+365*y1;
	}
	if(m==3)
	{ g.drawString("MARCH  "+y,230,30);
	  q=60+365*y1;
	  r=91+365*y1;
	}
	if(m==4)
	{ g.drawString("APRIL  "+y,230,30);
	  q=91+365*y1;
	  r=121+365*y1;
	}
	if(m==5)
	{ g.drawString("MAY  "+y,230,30);
	  q=121+365*y1;
	  r=152+365*y1;
	}
	if(m==6)
	{ g.drawString("JUNE  "+y,230,30);
	  q=152+365*y1;
	  r=182+365*y1;
	}
	if(m==7)
	{ g.drawString("JULY  "+y,230,30);
          q=182+365*y1;
	  r=213+365*y1;
	}
	if(m==8)
	{ g.drawString("AUGUST  "+y,230,30);
	  q=213+365*y1;
	  r=244+365*y1;
	}
	if(m==9)
	{ g.drawString("SEPTEMBER  "+y,230,30);
	  q=244+365*y1;
	  r=274+365*y1;
	}
	if(m==10)
	{ g.drawString("OCTOBER  "+y,230,30);
	  q=274+365*y1;
	  r=305+365*y1;
	}
	if(m==11)
	{ g.drawString("NOVEMBER  "+y,230,30);
	  q=305+365*y1;
	  r=335+365*y1;
	}
	if(m==12)
	{ g.drawString("DECEMBER  "+y,230,30);
	  q=335+365*y1;
	  r=366+365*y1;
	}
	if(q>=1&&q<=789)
	f=0;
	if(q>=790&&q<=2249)
	f=1;
	if(q>=2250&&q<=3709)
	f=2;
	if(q>=3710&&q<=5169)
	f=3;
	if(q>=5170&&q<=6629)
	f=4;
	if(q>=6630&&q<=8089)
	f=5;
	if(q>=8090&&q<=9549)
	f=6;
	if(q>=9550&&q<=11009)
	f=7;
	if(q>=11010&&q<=12469)
	f=8;
	if(q>=12470&&q<=13929)
	f=9;
	if(q>=13930&&q<=15389)
	f=10;
	if(q>=15390&&q<=16849)
	f=11;
	if(q>=16850&&q<=18309)
	f=12;
	if(q>=18310&&q<=19769)
	f=13;
	if(q>=19770&&q<=21229)
	f=14;
	if(q>=21230&&q<=22689)
	f=15;
	if(q>=22670&&q<=24149)
	f=16;
	if(q>=24150&&q<=25609)
	f=17;
	if(q>=25610&&q<=27069)
	f=18;
	if(q>=27070&&q<=28529)
	f=19;
	if(q>=28530&&q<=29989)
	f=20;
	if(q>=29990&&q<=31449)
	f=21;
	if(q>=31450&&q<=32909)
	f=22;
	if(q>=32910&&q<=34369)
	f=23;
	q=q+f;
	r=r+f;
	if(q%7-1==0)
	p=q;
	if(q%7-2==0)
	p=q-1;
	if(q%7-3==0)
	p=q-2;
	if(q%7-4==0)
	p=q-3;
	if(q%7-5==0)
	p=q-4;
	if(q%7-6==0)
	p=q-5;
	if(q%7==0)
	p=q-6;
        Font fobj1=new Font("Jokerman",Font.BOLD,18);
        g.setFont(fobj1);
        g.drawString("MON TUE WED THRU FRI SAT SUN",155,80);
        g.drawString("MONTH",10,120);
        g.drawString("YEAR",10,230);
        for(i=1;i<=6;i++)
	{ for(j=1;j<=7;j++)
	  { if(m==1)
	    { if(0<p&&p<q)
              g.drawString("",x2,y2);
	      if(q<=p&&p<r)
              { d=p-q+1;
                g.drawString(""+d,x2,y2);
              }
	    }
	    if(m==2)
	    { if(0<p&&p<q)
	      g.drawString("",x2,y2);
	      if(q<=p&&p<r+s)
	      { d=p-q+1;
                g.drawString(""+d,x2,y2);
              }
	    }
	    if(m==3)
	    { if(0<p&&p<q)
	      g.drawString("",x2,y2);
	      if(q<=p&&p<r)
	      { d=p-q+1;
                g.drawString(""+d,x2,y2);
              }
	    }
	    if(m==4)
	    { if(0<p&&p<q)
	      g.drawString("",x2,y2);
	      if(q<=p&&p<r)
	      { d=p-q+1;
                g.drawString(""+d,x2,y2);
              }
	    }
	    if(m==5)
	    { if(0<p&&p<q)
	      g.drawString("",x2,y2);
	      if(q<=p&&p<r)
	      { d=p-q+1;
                g.drawString(""+d,x2,y2);
              }
	    }
	    if(m==6)
	    { if(0<p&&p<q)
	      g.drawString("",x2,y2);
	      if(q<=p&&p<r)
	      { d=p-q+1;
                g.drawString(""+d,x2,y2);
              }
	    }
	    if(m==7)
	    { if(0<p&&p<q)
	      g.drawString("",x2,y2);
	      if(q<=p&&p<r)
	      { d=p-q+1;
                g.drawString(""+d,x2,y2);
              }
	    }
	    if(m==8)
	    { if(0<p&&p<q)
	      g.drawString("",x2,y2);
	      if(q<=p&&p<r)
	      { d=p-q+1;
                g.drawString(""+d,x2,y2);
              }
	    }
	    if(m==9)
	    { if(0<p&&p<q)
	      g.drawString("",x2,y2);
	      if(q<=p&&p<r)
	      { d=p-q+1;
                g.drawString(""+d,x2,y2);
              }
	    }
	    if(m==10)
	    { if(0<p&&p<q)
	      g.drawString("",x2,y2);
	      if(q<=p&&p<r)
	      { d=p-q+1;
                g.drawString(""+d,x2,y2);
              }
	    }
	    if(m==11)
	    { if(0<p&&p<q)
	      g.drawString("",x2,y2);
	      if(q<=p&&p<r)
	      { d=p-q+1;
                g.drawString(""+d,x2,y2);
              }
	    }
	    if(m==12)
	    { if(0<p&&p<q)
	      g.drawString("",x2,y2);
	      if(q<=p&&p<r)
	      { d=p-q+1;
                g.drawString(""+d,x2,y2);
              }
	    }
	    p++;
            x2=x2+50;
	  }
          x2=170;
          y2=y2+50;
	}
      }
      catch(Exception e)
      {}
  }
}

       