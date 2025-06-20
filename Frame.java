import javax.swing.*;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;



public class  Frame extends JFrame implements ActionListener, MouseListener{
    JTextField  textField,userField,passField;
    JLabel userlabel,text, passlabel;
	JLabel imgx,imgb,imgc,imgd,imgt;
	JPanel panel;
    Font myfont ;
	JButton loginbtn, exitbtn;
	ImageIcon img;

    public Frame(){
        super("Undergrad Student Career P@th");
        this.setSize(1600,1400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
			
		panel = new JPanel();
		panel.setLayout(null);

       myfont = new Font("Cambria",Font.PLAIN,20);

	   text = new JLabel("Name  : ");
	   text.setForeground(Color.white);
	   text.setBounds(620,170,70,25);
	  
	   text.setFont(myfont);
	   panel.add(text);

	   textField = new JTextField();
	   textField.setBounds(740,170,100,30);
	   
	   panel.add(textField);






        userlabel = new JLabel("User email : ");
		userlabel.setForeground(Color.white);
		userlabel.setBounds(620,205,150,30);
		
	    userlabel.setFont(myfont);
		
		panel.add(userlabel);

       userField= new JTextField();
		userField.setBounds(740,210,100,30);
		panel.add(userField);

        passlabel = new JLabel("Password : ");
		passlabel.setForeground(Color.white);
		passlabel.setBounds(620,245,100,30);
		passlabel.setFont(myfont);
		
		panel.add(passlabel);
		
		passField = new JPasswordField();
		passField.setBounds(740,250,100,30);
	    panel.add(passField);


		loginbtn= new JButton("LOG IN ");
		loginbtn.setBounds(640,295,100,25);
		loginbtn.setFont(myfont);
		  loginbtn.addActionListener(this);
		  loginbtn.addMouseListener(this);
		loginbtn.setForeground(Color.blue);
		panel.add(loginbtn);

		exitbtn = new JButton("EXIT ");
		exitbtn.setBounds(780,295,100,25);
		exitbtn.setFont(myfont);
		exitbtn.addActionListener(this);
		 exitbtn.addMouseListener(this);
		exitbtn.setForeground(Color.blue);
		panel.add(exitbtn);

		img = new ImageIcon(("AIUB.jpg"));
		imgx= new JLabel(img);
		imgx.setBounds(1,1,770,400);
		panel.add(imgx); 
		
		
		
		img = new ImageIcon("AIUB2.jpg");
        imgb = new JLabel(img);
        imgb.setBounds(1,400, 770, 400);
        panel.add(imgb);
		
		
		img = new ImageIcon("AIUB3.jpg");
        imgc = new JLabel(img);
        imgc.setBounds(770,1, 770, 400);
        panel.add(imgc);
		
		
		img = new ImageIcon("AIUB4.jpg");
        imgd = new JLabel(img);
        imgd.setBounds(770,400, 770, 400);
        panel.add(imgd);
		
		
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
    if (e.getSource() == loginbtn) {
        try {
            String name = textField.getText();
            String email = userField.getText();
            String pass = new String(passField.getText());

            if (name.isEmpty() || email.isEmpty() || pass.isEmpty()) {
                throw new Exception("Empty fields");
            }

            if (name.equals("a") && email.equals("a") && pass.equals("a")) {
                JOptionPane.showMessageDialog(this, "Login successful!");
				new Frame2().setVisible(true);
                this.setVisible(false);
                
            } else {
                JOptionPane.showMessageDialog(this, "Incorrect credentials", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Please fill in all fields", "Input Error", JOptionPane.WARNING_MESSAGE);
        }
    } else if (e.getSource() == exitbtn) {
        System.exit(0);
    }
}

	

 }