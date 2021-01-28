
    import java.awt.FlowLayout;
    import java.awt.*;
    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;
    import javax.swing.JButton;
    import javax.swing.JLabel;
    import javax.swing.*;
    public class Search extends JFrame implements ActionListener{
    JButton button1 ,button2 , button3 , button4 ; 
    JLabel labe1 ;
    
    
    public Search(){
            this.setTitle("Game Store ");
            this.setSize(450,250 );
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setVisible(true);
            this.setResizable(false);

            this.setLayout(null);


            button1=new JButton("First Q ");
            button2=new JButton("second Q ");
            button3=new JButton("third Q");
            button4=new JButton("Back");
            labe1= new JLabel("Select any query you want to update");

           
            this.add(button1);
            this.add(button2 );
            this.add(button3 );
            this.add(button4 );
            this.add(labe1);
        
            labe1.setBounds(100, 50, 200, 50 );
           
            button1.setBounds(10,150,80,50);
            button2.setBounds(160,150,120,50);
            button3.setBounds(330,150,80,50);
            button4.setBounds(10,10,80,30);
            
           
            button1.addActionListener( this);
            button2.addActionListener( this);
            button3.addActionListener( this);
            button4.addActionListener( this);
    }
     public void actionPerformed(ActionEvent a){
            DBConnect mo = new DBConnect();
            
            if(a.getSource()== button1){
                        mo.getData("UPDATE EMPLOYEE SET Tel = 0506423452 where Fname = 'Faisal'");
                       new SearchFQ();
                      
            } else{ if(a.getSource()== button2){
                            mo.getData(" UPDATE EMPLOYEE SET Salary = 13000 where Fname = 'Adel'");
                         new SearchSQ();
                      } else {
                               if(a.getSource()== button3){
                                    mo.getData(" UPDATE GAME_PLATFORMS SET Gplatform = 'PC' where Gname = 'Halo 5:Guardians'");
                                     new SearchThQ();
                               }
                               if(a.getSource()==button4){
                                    dispose();
                               }
                            }
                }
     }
}

    

