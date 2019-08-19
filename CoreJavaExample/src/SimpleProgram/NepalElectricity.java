/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SimpleProgram;

/**
 *
 * @author indra
 */
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.*;
public class NepalElectricity implements ActionListener {
    JFrame frame;
   JLabel jlCurrentUnit, jlOldUnit, jlTotalUnit, jlResult, jlResultApp;
   JTextField jtfCurrentUnit, jtfOldUnit, jtfTotalUnit;
   JButton jbCalculation;
   
   public NepalElectricity(){
       frame= new JFrame("Nepal Electricity Authority");
       frame.setSize(225,200);
       frame.setLayout(null);
       
       jlCurrentUnit= new JLabel("Current Unit");
       jlCurrentUnit.setBounds(10,10,100,30);
       frame.add(jlCurrentUnit);
       
       jtfCurrentUnit= new JTextField();
       jtfCurrentUnit.setBounds(110,10,100,30);
       frame.add(jtfCurrentUnit);
       
       jlOldUnit= new JLabel("Old Unit");
       jlOldUnit.setBounds(10,50,100,30);
       frame.add(jlOldUnit);
       
       jtfOldUnit= new JTextField();
       jtfOldUnit.setBounds(110,50,100,30);
       frame.add(jtfOldUnit);
       
       jbCalculation= new JButton("Calculation");
       jbCalculation.setBounds(40,90,150,30);
       frame.add(jbCalculation);
       jbCalculation.addActionListener(this);
       jbCalculation.setActionCommand("Calculate");
       
       jlTotalUnit= new JLabel("Total Unit");
       jlTotalUnit.setBounds(10,130,100,30);
       frame.add(jlTotalUnit);
       
       jtfTotalUnit= new JTextField();
       jtfTotalUnit.setBounds(110,130,100,30);
       frame.add(jtfTotalUnit);
       
       jlResult= new JLabel("Total Amount:");
       jlResult.setBounds(10,170,100,30);
       frame.add(jlResult);
       
       jlResultApp= new JLabel(".......");
       jlResultApp.setBounds(110,170,100,30);
       frame.add(jlResultApp);       
       
       frame.setVisible(true);
   }
   
   public void calculation(){
       double basic, addi, result;
       int CurrentUnit = Integer.parseInt(jtfCurrentUnit.getText());
       int OldUnit = Integer.parseInt(jtfOldUnit.getText());
       int unit = CurrentUnit - OldUnit;
       jtfTotalUnit.setText(String.valueOf(unit)+" units");
       if(unit<=20){
           result= unit*4;
           jlResultApp.setText("RS. "+String.valueOf(result)+" Only");
           System.out.println("Current Unit         : "+CurrentUnit+" units");
           System.out.println("Old Unit             : "+OldUnit+" units");
           System.out.println("Consumed Unit        : "+unit+" units");
           System.out.println("Total Amount         : RS. "+result+" Only. (rs. 4*(20 unit))");
       }
       
       if(unit>20 && unit<=30){
           basic= 80;
           addi= ((unit-20)*7.50);
           result= basic+addi;
           jlResultApp.setText("RS. "+String.valueOf(result)+" Only");
           System.out.println("Current Unit         : "+CurrentUnit+" units");
           System.out.println("Old Unit             : "+OldUnit+" units");
           System.out.println("Consumed Unit        : "+unit+" units");
           System.out.println("Basic Amount         : RS. "+basic+" Only (rs. 4*(20 unit))");
           System.out.println("Additional Amount    : RS. "+addi+" Only (rs. 7.50*("+(unit-20)+"unit))");
           System.out.println("Total Amount         : RS. "+result+" Only.");
       }
       
       if(unit>30 && unit<=50){
           result= unit*7.50;
           jlResultApp.setText("RS. "+String.valueOf(result)+" Only");
           System.out.println("Current Unit         : "+CurrentUnit+" units");
           System.out.println("Old Unit             : "+OldUnit+" units");
           System.out.println("Consumed Unit        : "+unit+" units");
           System.out.println("Total Amount         : RS. "+result+" Only. (rs. 7.5*("+unit+" unit))");
       }
       
       if(unit>50 && unit<=150){
           basic= 50*7.50;
           addi= ((unit-50)*8.60);
           result= basic+addi;
           jlResultApp.setText("RS. "+String.valueOf(result)+" Only");
           System.out.println("Current Unit         : "+CurrentUnit+" units");
           System.out.println("Old Unit             : "+OldUnit+" units");
           System.out.println("Consumed Unit        : "+unit+" units");
           System.out.println("Basic Amount         : RS. "+basic+" Only (rs. 7.50*(50 unit))");
           System.out.println("Additional Amount    : RS. "+addi+" Only (rs. 8.60*("+(unit-50)+" unit))");
           System.out.println("Total Amount         : RS. "+result+" Only.");
       }
       
       if(unit>150 && unit<=250){
           basic= 150*8.60;
           addi= ((unit-150)*9.50);
           result= basic+addi;
           jlResultApp.setText("RS. "+String.valueOf(result)+" Only");
           System.out.println("Current Unit         : "+CurrentUnit+" units");
           System.out.println("Old Unit             : "+OldUnit+" units");
           System.out.println("Consumed Unit        : "+unit+" units");
           System.out.println("Basic Amount         : RS. "+basic+" Only (rs. 8.60*(150 unit))");
           System.out.println("Additional Amount    : RS. "+addi+" Only (rs. 9.50*("+(unit-150)+" unit)");
           System.out.println("Total Amount         : RS. "+result+" Only.");
       }
       
       if(unit>250){
           basic= 250*9.50;
           addi= ((unit-250)*11);
           result= basic+addi;
           jlResultApp.setText("RS. "+String.valueOf(result)+" Only");
           System.out.println("Current Unit         : "+CurrentUnit+" units");
           System.out.println("Old Unit             : "+OldUnit+" units");
           System.out.println("Consumed Unit        : "+unit+" units");
           System.out.println("Basic Amount         : RS. "+basic+" Only (rs. 9.50*(250 unit))");
           System.out.println("Additional Amount    : RS. "+addi+" Only (rs. 11*("+(unit-250)+" unit)");
           System.out.println("Total Amount         : RS. "+result+" Only.");
       }
   }
   public void actionPerformed(ActionEvent NEA){
       if(NEA.getActionCommand()=="Calculate"){
           calculation();
       }
   }
   
   public static void main(String[] args){
       new NepalElectricity();
   }
}
