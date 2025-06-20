import javax.swing.*;
import java.lang.*; 
import java.awt.*;
import java.awt.event.*;
import java.io.FileWriter;
import java.io.IOException;

public class HigherStudies extends JFrame implements ActionListener, MouseListener {
    JPanel panel;
	JLabel uniName,sub,level,country,cost;
	JTextField tuniName,tSub,tLevel,tCountry,tCost;
	JButton done,back;

    Font myFont;
    JButton label1,label2,label3,label4,label5;
	ImageIcon img ; 

    public HigherStudies() {

        super("Higher Studies");

        this.setSize(1600,1400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		panel = new JPanel();
		panel.setLayout(null);
		myFont = new Font("Cambria",Font.PLAIN,20);
		ImageIcon image = new ImageIcon("title.jpg");
		this.setIconImage(image.getImage());


		//
	uniName = new JLabel("University Name : ");
    uniName.setFont(myFont);
    uniName.setBounds(500,200,170,35);
    panel.add(uniName);

    tuniName = new JTextField();
    tuniName.setBounds(670,200,500,30);
    panel.add(tuniName);

    sub = new JLabel("Subject : ");
    sub.setFont(myFont);
    sub.setBounds(500,240,100,35);
    panel.add(sub);

    tSub = new JTextField();
    tSub.setBounds(670, 240, 500,30);
    panel.add(tSub);

    level= new JLabel("Level : ");
    level.setFont(myFont);
    level.setBounds(500,280,100,35);
    panel.add(level);

    tLevel= new JTextField();
    tLevel.setBounds(670,280,500,30);
    panel.add(tLevel);


    country = new JLabel("Country :");
    country.setFont(myFont);
    country.setBounds(500,320,150,35);
    panel.add( country);

    tCountry = new JTextField();
    tCountry.setBounds(670,320,500,30);
    panel.add( tCountry);

    cost = new JLabel("Cost :");
    cost.setFont(myFont);
    cost.setBounds(500,360,120,35);
    panel.add(cost);

    tCost = new JTextField();
    tCost.setBounds(670,360,500,30);
    panel.add(tCost);

   done = new JButton("Done");
   done.setBounds(1190,360,100,70);
   done.setFont(myFont);
   done.addActionListener(this);
   done.addMouseListener(this);
   panel.add(done);

  back= new JButton("Back");
   back.setBounds(500,100,100,70);
   back.setFont(myFont);
   back.addActionListener(this);
   back.addMouseListener(this);
   panel.add(back);

		//
		
		
		this.add(panel);
	}
	public void mouseClicked(MouseEvent e) {}


public void mousePressed(MouseEvent e) {}


public void mouseReleased(MouseEvent e) {}


public void mouseEntered(MouseEvent e) {}


public void mouseExited(MouseEvent e) {}


public void actionPerformed(ActionEvent e){
	if (e.getSource()== done){
    String uniString = tuniName.getText();
    String subString = tSub.getText(); 
    String levelString = tLevel.getText();
    String countryString = tCountry.getText();
    String costString = tCost.getText();

    try {
           
            FileWriter writer = new FileWriter("higherStudies.txt");

            
             writer.write("University name is :"+ uniString+"."+ "\n");
             writer.write("Subject for applying :"+ subString+"."+"\n");
             writer.write("Level for applying:"+ levelString+"."+"\n");
             writer.write("Country  :"+ countryString+"."+"\n");
             writer.write("Cost that u are gonna bear  :"+costString+"."+"\n");

            
            writer.close();

            System.out.println("File written successfully.");
        } catch (IOException ep) {
            System.out.println("An error occurred.");
            ep.printStackTrace();
        }



  
  }

  else {}

  if (e.getSource()==back){
    this.setVisible(false);
    new Frame2().setVisible(true);
  }

}



	
}