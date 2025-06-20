import javax.swing.*;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Job extends JFrame implements ActionListener, MouseListener {
    JPanel panel;
    ImageIcon img ; 
    Font myFont;
    JButton done,back;
   JLabel company, salary,location , skillsRequired, askingExperience;
   JTextField tCompany,tSalary,tLocation,tSkillsRequired,tAskingExperience;

    public Job() {

        super("JOb");

        this.setSize(1600,1400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		panel = new JPanel();
		panel.setLayout(null);myFont = new Font("Cambria",Font.PLAIN,20);
		  ImageIcon image = new ImageIcon("title.jpg");
		this.setIconImage(image.getImage());	
    
    company = new JLabel("Company Name : ");
    company.setFont(myFont);
    company.setBounds(500,200,150,35);
    panel.add(company);

    tCompany = new JTextField();
    tCompany.setBounds(670,200,500,30);
    panel.add(tCompany);

    salary = new JLabel("Salary : ");
    salary.setFont(myFont);
    salary.setBounds(500,240,100,35);
    panel.add(salary);

    tSalary = new JTextField();
    tSalary.setBounds(670, 240, 500,30);
    panel.add(tSalary);

    location= new JLabel("Location : ");
    location.setFont(myFont);
    location.setBounds(500,280,100,35);
    panel.add(location);

    tLocation= new JTextField();
    tLocation.setBounds(670,280,500,30);
    panel.add(tLocation);


    skillsRequired = new JLabel("Skills Required :");
    skillsRequired.setFont(myFont);
    skillsRequired.setBounds(500,320,150,35);
    panel.add( skillsRequired);

    tSkillsRequired = new JTextField();
    tSkillsRequired.setBounds(670,320,500,30);
    panel.add( tSkillsRequired);

    askingExperience = new JLabel("Experience :");
    askingExperience.setFont(myFont);
    askingExperience.setBounds(500,360,120,35);
    panel.add(askingExperience);

    tAskingExperience = new JTextField();
    tAskingExperience.setBounds(670,360,500,30);
    panel.add(tAskingExperience);

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


    



    
		
		this.add(panel);
	}
	public void mouseClicked(MouseEvent e) {}


public void mousePressed(MouseEvent e) {}


public void mouseReleased(MouseEvent e) {}


public void mouseEntered(MouseEvent e) {}


public void mouseExited(MouseEvent e) {}
public void actionPerformed(ActionEvent e){
  if (e.getSource()== done){
    String companyString = tCompany.getText();
    String salaryString = tSalary.getText(); 
    String locationString = tLocation.getText();
    String skillsRequiredString = tSkillsRequired.getText();
    String askingExperienceString = tAskingExperience.getText();

    try {
           
            FileWriter writer = new FileWriter("job.txt");

            
             writer.write("Company name is :"+ companyString+"."+ "\n");
             writer.write("Salary is :"+ salaryString+"."+"\n");
             writer.write("Location of the company :"+ locationString+"."+"\n");
             writer.write("Skills for this job :"+ skillsRequiredString+"."+"\n");
             writer.write("Experience they are asking for :"+askingExperienceString+"."+"\n");

            
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