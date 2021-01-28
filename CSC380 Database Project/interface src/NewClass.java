
    import java.awt.FlowLayout;
    import java.awt.*;
    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;
    import javax.swing.*;


    public class NewClass extends JFrame implements ActionListener {
    
        JButton button1 ,button2 , button3 ;
        JLabel labe1 ;
    
  
    public NewClass(){
            this.setTitle("Game Store");
            this.setSize(450,250 );
           
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setVisible(true);
            this.setResizable(false);

            this.setLayout(null);
             

            button1=new JButton("Add");
            
            button2=new JButton("Delet");
            
            button3=new JButton("Update");

            labe1= new JLabel("Game Store");
//            JPanel p = new ImageBackground();
           
            this.add(button1);
            this.add(button2 );
            this.add(button3 );
            this.add(labe1);
//            this.add(p);
           // blanck
            labe1.setBounds(150, 50, 100, 50 );
            button1.setBounds(10,150,80,50);
            button2.setBounds(160,150,80,50);
            button3.setBounds(310,150,80,50);
//            p.setBounds(0,0, 1024, 768);
             button1.addActionListener(this);
             button2.addActionListener( this);
             button3.addActionListener(this);
             
    }
        public void actionPerformed(ActionEvent a){
            
                 if(a.getSource()== button1){
                 // button1.setText("lll");
                    new Add();

                 }
                 if(a.getSource()== button2){
                        new Delet();
                    }
                 if(a.getSource()==button3){
                            new Search();
                  }
            
        }
    
    public static void main(String args[] ){
        new NewClass() ;
    //    new DBConnect().getData();
        
    }
    
    
    
}
