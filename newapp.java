import java.applet.Applet;
import java.awt.*;
import java.awt.Color;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*<applet code="newapp" width=400 height=400></applet>*/
public class newapp extends Applet implements ActionListener{
   // public void paint(Graphics g)
    //{
     //   g.drawString("hello...........",100,100);
    //}
    int i=0;
    Button b1;
    Label q;
  TextField t;
    public void init(){
   q= new Label();
  
   add(q);
    q.setSize(400,400);
  t=new TextField(15);
  add(t);
  b1=new Button("click");
  b1.setBackground(Color.red);
  b1.addActionListener(this);
   add(b1);
}
public void actionPerformed(ActionEvent e)
{
    if(e.getSource()==b1)
    {
    
     // i=i+1;
     i++;
       String k=Integer.toString(i);
      t.setText(k);
      q.setText(k);
    }
}
}