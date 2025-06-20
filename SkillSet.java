import javax.swing.*;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileWriter;
import java.io.IOException;


public class SkillSet extends JFrame implements ActionListener, MouseListener {
    JPanel panel;
    ImageIcon img ; 
    Font myFont;
    JButton done,back;
    JLabel skill, resources,book,job,requiredTime;
    JTextField tSkill,tResources,tBook,tJob,tRequiredTime;

    public SkillSet() {

        super("Skill Set");

        this.setSize(1600,1400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		panel = new JPanel();
		panel.setLayout(null);
    myFont = new Font("Cambria",Font.PLAIN,20);
		  ImageIcon image = new ImageIcon("title.jpg");
		this.setIconImage(image.getImage());	


    //
	skill = new JLabel("Skill : ");
    skill.setFont(myFont);
    skill.setBounds(500,200,150,35);
    panel.add(skill);

    tSkill = new JTextField();
    tSkill.setBounds(670,200,500,30);
    panel.add(tSkill);

    resources = new JLabel("Resources : ");
    resources.setFont(myFont);
    resources.setBounds(500,240,120,35);
    panel.add(resources);

    tResources = new JTextField();
    tResources.setBounds(670, 240, 500,30);
    panel.add(tResources);

    book= new JLabel("Book : ");
    book.setFont(myFont);
    book.setBounds(500,280,100,35);
    panel.add(book);

    tBook= new JTextField();
    tBook.setBounds(670,280,500,30);
    panel.add(tBook);


    job = new JLabel("Job  :");
    job.setFont(myFont);
    job.setBounds(500,320,150,35);
    panel.add( job);

    tJob = new JTextField();
    tJob.setBounds(670,320,500,30);
    panel.add( tJob);

    requiredTime = new JLabel("Time :");
    requiredTime.setFont(myFont);
    requiredTime.setBounds(500,360,120,35);
    panel.add(requiredTime);

    tRequiredTime = new JTextField();
    tRequiredTime.setBounds(670,360,500,30);
    panel.add(tRequiredTime);

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
    String skillString = tSkill.getText();
    String resourcesString = tResources.getText(); 
    String bookString = tBook.getText();
    String jobString = tJob.getText();
    String requiredTimeString = tRequiredTime.getText();

    try {
           
            FileWriter writer = new FileWriter("skillSet.txt");

            
             writer.write("Skill that I am planning to learn :"+ skillString+"."+ "\n");
             writer.write("Resources :"+ resourcesString+"."+"\n");
             writer.write("Books :"+ bookString+"."+"\n");
             writer.write("Available  :"+ jobString+"."+"\n");
             writer.write("Approxx time to learn it   :"+requiredTimeString+"."+"\n");

            
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
