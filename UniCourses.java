import javax.swing.*;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileWriter;
import java.io.IOException;


public class UniCourses extends JFrame implements ActionListener, MouseListener {
    JPanel panel;
    ImageIcon img ; 
     JButton done,back;
    Font myFont;
    JLabel doingNow, upcomingPlan;
    JTextField tDoingNow,tUpcomingPlan;

    public UniCourses() {

        super("Uni Courses");

        this.setSize(1600,1400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		panel = new JPanel();
		panel.setLayout(null);
		ImageIcon image = new ImageIcon("title.jpg");
		this.setIconImage(image.getImage());	
         myFont = new Font("Cambria",Font.PLAIN,20);


     doingNow= new JLabel("Current Courses : ");
    doingNow.setFont(myFont);
    doingNow.setBounds(500,200,200,35);
    panel.add(doingNow);

    tDoingNow = new JTextField();
    tDoingNow.setBounds(730,200,500,30);
    panel.add(tDoingNow);

    upcomingPlan = new JLabel("Upcoming Plan : ");
    upcomingPlan.setFont(myFont);
    upcomingPlan.setBounds(500,240,200,35);
    panel.add(upcomingPlan);

    tUpcomingPlan = new JTextField();
    tUpcomingPlan.setBounds(730, 240, 500,30);
    panel.add(tUpcomingPlan);

   done = new JButton("Done");
   done.setBounds(1250,240,100,70);
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

		
		this.add(panel);
	}
	public void mouseClicked(MouseEvent e) {}


public void mousePressed(MouseEvent e) {}


public void mouseReleased(MouseEvent e) {}


public void mouseEntered(MouseEvent e) {}


public void mouseExited(MouseEvent e) {}
public void actionPerformed(ActionEvent e){


     if (e.getSource()== done){
    String doingString = tDoingNow.getText();
    String upComingString = tUpcomingPlan.getText(); 
    

    try {
           
            FileWriter writer = new FileWriter("uniCourses.txt");

            
             writer.write("Currently doing courses :"+ doingString+"."+ "\n");
             writer.write("Next Semester  :"+ upComingString+"."+"\n");
            

            
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

  else{}

}
}