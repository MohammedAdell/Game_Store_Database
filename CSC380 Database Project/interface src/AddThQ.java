
            import java.awt.FlowLayout;
            import java.awt.*;
            import java.awt.event.ActionEvent;
            import java.awt.event.ActionListener;
            import javax.swing.*;


            public class AddThQ extends JFrame implements ActionListener {

                JButton  button2 , button3 ;
                JLabel labe1,labe2 ;


            public AddThQ(){
                    this.setTitle("Game Store");
                    this.setSize(450,250 );

                    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    this.setVisible(true);
                    this.setResizable(false);
                    this.setLayout(null);




                    button2=new JButton("Done");

                    button3=new JButton("Back");

                    labe1= new JLabel("insert into BRANCH(ID , Tel , Location )");
                    labe2= new JLabel(" VALUES (33333 , 0555342 ,'Dammam' )");


                    this.add(button3 );
                    this.add(labe1);
                    this.add(labe2);

                    labe1.setBounds(70, 50, 250 , 30 );
                    labe2.setBounds(70, 80, 300 , 30 );
                    button3.setBounds(160,150,80,50);
                    button3.addActionListener(this);

            }
                public void actionPerformed(ActionEvent a){

                         if(a.getSource()== button3){
                             dispose();
                         }

                }


        }
