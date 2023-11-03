import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class App implements ActionListener {

public static int numar_max=9;
int i=0;
     ArrayList<String> echipa=new ArrayList<>(9);
    ArrayList<String>liga=new ArrayList<>(9);


int count=0;
 JFrame frame;
JButton buton1,buton2;
JTextField l=new JTextField(20);

JTextField k=new JTextField(20);
JTextArea lista_echipe=new JTextArea();
JLabel nume=new JLabel("");
JLabel liganume=new JLabel();
JLabel echipe=new JLabel("Lista echipe: 0");
JPanel panel=new JPanel();
JPanel panelul2=new JPanel();
StringBuffer lista=new StringBuffer();
JLabel league=new JLabel("");
JTextField numeliga=new JTextField(20);
     App()
    {
        Dimension fixed=new Dimension(50,90);
JFrame frame=new JFrame();
frame.setSize(new Dimension(400,500));
JButton buton1=new JButton("click to add team");
JButton buton2=new JButton("click to see number of teams in a league");
JLabel buton3=new JLabel("type name in first box and league for team in the second box");
JTextField numeliga=new JTextField(20);
JLabel league=new JLabel("");
//l.setText("type here for team name");
//k.setText("type here for league name");
buton1.addActionListener(this);
buton2.addActionListener(e-> {search(count);});
//buton2.addActionListener(this);


panelul2.setBounds(200,200,100,100);

panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));

panel.setLayout(new FlowLayout());
panelul2.setLayout(new BorderLayout());
panel.setSize(30,30);

panel.add(buton1);

panel.add(this.l);

panel.add(this.nume);
panel.add(k);

panel.add(buton3);
panel.add(lista_echipe);
panel.add(echipe);
panel.add(buton2);

panel.add(numeliga);
panel.add(league);
frame.add(panel);

panel.setMaximumSize(fixed);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

frame.setTitle("proiect 2");
//buton2.addActionListener(e->{});

frame.setVisible(true);
panel.setPreferredSize(fixed);
    
    }



    



public void actionPerformed(ActionEvent e)
{
   
String numeteam=l.getText();
String liganume=k.getText();

if (i<=numar_max)
{
echipa.add(numeteam);
liga.add(liganume);
nume.setText("team added. Write again for a new team");
this.liganume.setText("league added. Write again for a new league for a new team");

this.i++;

lista_echipe.append(numeteam+" din "+liganume+'\n');
//lista_echipe.append(tipar());
}
else
{
nume.setText("limita de echipe atinsa");
k.setText("limita de echipe atinsa");

}



echipe.setText(" | lista echipe "+ i );
}  
 







public void tipar()
{        for (int i=0;i<echipa.size();i++)
        {
        lista.append("Echipa ");
        lista.append(i);
        lista.append(":");
    
    lista.append(echipa.get(i));
    lista.append(" din ");
    lista.append(liga.get(i));
    lista.append( '\n');
    lista_echipe.append(lista.toString());
    
        }

}


public void search(int count)
{
     String liganume=numeliga.getText();
     
for (i=0;i<liga.size();i++)
{
if (liganume.equals(liga.get(i)))
{
    count++;
}

}
league.setText(count+ "");

}



    
    public static void main(String[] args) {
        
       
        new App();
       

        //frame2.buton2.addActionListener();
        //tipar(clasa.echipe);
        
    }
}




