import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Frame2 extends JFrame implements ActionListener, MouseListener {
    JPanel panel;
    ImageIcon img ; 
    Font myFont;
    JButton label1,label2,label3,label4,label5;

    public Frame2() {

        super("Welcome");

        this.setSize(1600,1400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		panel = new JPanel();
		panel.setLayout(null);
		myFont = new Font("Cambria",Font.PLAIN,20);
     

       label1 = new JButton("Higher Studies ");
       label1.setBounds(180, 150,200,200);	
       label1.setFont(myFont);
	  label1.addActionListener(this);
		 label1.addMouseListener(this);
	   label1.setForeground(Color.blue);
       panel.add(label1);  
       
       label2 = new JButton("SKILL Set ");
       label2.setBounds(420, 150,200,200);	
       label2.setFont(myFont);
	   label2.addActionListener(this);
		 label2.addMouseListener(this);
	   label2.setForeground(Color.blue);
       panel.add(label2);   
        

       label3 = new JButton("UNI Courses ");
       label3.setBounds(660, 150,200,200);	
       label3.setFont(myFont);
	   label3.addActionListener(this);
		 label3.addMouseListener(this);
	   label3.setForeground(Color.blue);
       panel.add(label3);   
       
       label4 = new JButton("JOB ");
       label4.setBounds(900, 150,200,200);	
       label4.setFont(myFont);
	   label4.addActionListener(this);
		 label4.addMouseListener(this);
	   label4.setForeground(Color.blue);
       panel.add(label4);   



        label5 = new JButton("Exit ");
       label5.setBounds(180, 400,900,30);	
       label5.setFont(myFont);
	   label5.addActionListener(this);
		 label5.addMouseListener(this);
	   label5.setForeground(Color.blue);
       panel.add(label5); 

        ImageIcon image = new ImageIcon("title.jpg");
		this.setIconImage(image.getImage());	   
       
	   
	   this.add(panel);

    }
	
public void mouseClicked(MouseEvent e) {}


public void mousePressed(MouseEvent e) {}


public void mouseReleased(MouseEvent e) {}


public void mouseEntered(MouseEvent e) {}


public void mouseExited(MouseEvent e) {}



 public void actionPerformed(ActionEvent e) {
	 if(e.getSource() == label1){
		 new HigherStudies().setVisible(true);
		 this.setVisible(false);
	 }
	 
	 else if (e.getSource() == label2){
		 new SkillSet().setVisible(true);
		 this.setVisible(false);
	 }
	 else if (e.getSource() == label3){
		 new UniCourses().setVisible(true);
		 this.setVisible(false);
	 }
	 
	 else if (e.getSource() == label4){
		 new Job().setVisible(true);
		 this.setVisible(false);
	 
	 
	 
   }
   
   else if (e.getSource() == label5){
	   System.exit(0);
   }
} }
