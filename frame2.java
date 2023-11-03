import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class frame2 extends App
{
    JTextArea echipe=new JTextArea();
    
    
    frame2(){
JFrame frame2=new JFrame();
frame2.setSize(new Dimension(400,500));
frame2.setTitle("proiect 2");
JPanel panel2=new JPanel();

echipe.setBounds(10,30,40,80);
panel2.add(echipe);

frame2.setSize(300,300);  
        frame2.setLayout(null);  
        frame2.setVisible(false);


    


    }

    public frame2(JTextArea echipe)
    {


    }
    



}