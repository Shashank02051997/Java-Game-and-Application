//Talk it
import javax.speech.*;
import java.util.*;
import javax.speech.synthesis.*;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*<APPLET Code="Talk_it" Width=300 Height=400>
</APPLET>*/
public class Talk_it extends Applet implements ActionListener
{ String str,speaktext,voiceName;
  TextArea input;
  public void init()
  { setSize(300,400);
    input=new TextArea(20,35);
    Button b1=new Button("Speak now");
    add(input);add(b1) ;
    b1.addActionListener(this);
  }
  public void actionPerformed(ActionEvent ae)
  { str=ae.getActionCommand();
    if(str.equals("Speak now"))
    { dospeak(input.getText());
    }
  }
  public void dospeak(String speak)
  { speaktext=speak;
    try
    { System.setProperty("mbrola.base", "D:\\mbrola");
      SynthesizerModeDesc desc = new SynthesizerModeDesc(null,"general",  Locale.US,null,null);
      Synthesizer synthesizer =  Central.createSynthesizer(desc);
      synthesizer.allocate();
      synthesizer.resume();
      desc = (SynthesizerModeDesc)  synthesizer.getEngineModeDesc();
      Voice[] voices = desc.getVoices();
      Voice voice = null;
      for (int i=0; i<voices.length; i++)
      { if (voices[i].getName().equals("mbrola_us1"))
        { voice=voices[i];
          break;
        }
      }
      synthesizer.getSynthesizerProperties().setVoice(voice);
      System.out.print("Speaking : "+speaktext+"\n");
      synthesizer.speakPlainText(speaktext, null);
      synthesizer.waitEngineState(Synthesizer.QUEUE_EMPTY);
    }
    catch(Exception e)
    { String message = " missing speech.properties in " + System.getProperty("user.home") + "\n";
      System.out.println(""+e);
      System.out.println(message);
    }
  }
  /*public void paint(Graphics g)
  { Font fobj=new Font("Cambria",Font.BOLD,24);
    input.setFont(fobj);
  }*/
}