import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Calculator extends JFrame implements ActionListener, ItemListener {
    JTextField txtCal;
    JButton btnClr,btnModulo,btnCnl,btnDiv,btn7,btn8,btn9,btnMul,btn4,btn5,btn6,btnSub,btn1,btn2,btn3,btnAdd,btn00,btn0,btnDot,btnEql;
    JPanel p1,p2,p3,p4,p5,p6;
    double firstNumber,secondNumber,result;
    int check;

    public Calculator(){
        setLayout(new GridLayout(6,1,10,10));
        setSize(400,500);
        txtCal=new JTextField();
        btnClr=new JButton("Clear");
        btnModulo=new JButton("%");
        btnCnl=new JButton("cancel");
        btnDiv=new JButton("/");
        btn7=new JButton("7");
        btn8=new JButton("8");
        btn9=new JButton("9");
        btnMul=new JButton("*");
        btn4=new JButton("4");
        btn5=new JButton("5");
        btn6=new JButton("6");
        btnSub=new JButton("-");
        btn1=new JButton("1");
        btn2=new JButton("2");
        btn3=new JButton("3");
        btnAdd=new JButton("+");
        btn00=new JButton("00");
        btn0=new JButton("0");
        btnDot=new JButton(".");
        btnEql=new JButton("=");
        btnClr.addActionListener(this);
        btnModulo.addActionListener(this);
        btnCnl.addActionListener(this);
        btnDiv.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);
        btnMul.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btnSub.addActionListener(this);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btnAdd.addActionListener(this);
        btn00.addActionListener(this);
        btn0.addActionListener(this);
        btnDot.addActionListener(this);
        btnEql.addActionListener(this);
        p1=new JPanel();
        p2=new JPanel();
        p3=new JPanel();
        p4=new JPanel();
        p5=new JPanel();
        p6=new JPanel();
        p1.setLayout(new GridLayout(1,1,10,10));
        p2.setLayout(new GridLayout(1,4,10,10));
        p3.setLayout(new GridLayout(1,4,10,10));
        p4.setLayout(new GridLayout(1,4,10,10));
        p5.setLayout(new GridLayout(1,4,10,10));
        p6.setLayout(new GridLayout(1,4,10,10));
        addComp();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae)
    {
        String sg,s,s1;
        if(ae.getSource()==btn1){
            sg=txtCal.getText();
            s=sg+"1";
            txtCal.setText(s);
        }
        if(ae.getSource()==btn2){
            sg=txtCal.getText();
            s=sg+"2";
            txtCal.setText(s);
        }
        if(ae.getSource()==btn3){
            sg=txtCal.getText();
            s=sg+"3";
            txtCal.setText(s);
        }
        if(ae.getSource()==btn4){
            sg=txtCal.getText();
            s=sg+"4";
            txtCal.setText(s);
        }
        if(ae.getSource()==btn5){
            sg=txtCal.getText();
            s=sg+"5";
            txtCal.setText(s);
        }
        if(ae.getSource()==btn6){
            sg=txtCal.getText();
            s=sg+"6";
            txtCal.setText(s);
        }
        if(ae.getSource()==btn7){
            sg=txtCal.getText();
            s=sg+"7";
            txtCal.setText(s);
        }
        if(ae.getSource()==btn8){
            sg=txtCal.getText();
            s=sg+"8";
            txtCal.setText(s);
        }
        if(ae.getSource()==btn9){
            sg=txtCal.getText();
            s=sg+"9";
            txtCal.setText(s);
        }
        if(ae.getSource()==btn00){
            sg=txtCal.getText();
            s=sg+"00";
            txtCal.setText(s);
        }
        if(ae.getSource()==btn0){
            sg=txtCal.getText();
            s=sg+"0";
            txtCal.setText(s);
        }
        if(ae.getSource()==btnDot){
            sg=txtCal.getText();
            s=sg+".";
            txtCal.setText(s);
        }
        if(ae.getSource()==btnModulo){
            firstNumber=Double.parseDouble(txtCal.getText());
            s="%";
            txtCal.setText(s);
            check=5;
        }
        if(ae.getSource()==btnDiv){
            firstNumber=Double.parseDouble(txtCal.getText());
            s="/";
            txtCal.setText(s);
            check=4;
        }
        if(ae.getSource()==btnMul){
            firstNumber=Double.parseDouble(txtCal.getText());
            s="*";
            txtCal.setText(s);
            check=3;
        }
        if(ae.getSource()==btnSub){
            firstNumber=Double.parseDouble(txtCal.getText());
            s="-";
            txtCal.setText(s);
            check=2;
        }
        if(ae.getSource()==btnAdd){
            firstNumber=Double.parseDouble(txtCal.getText());
            s="+";
            txtCal.setText(s);
            check=1;
        }

        if(ae.getSource()==btnEql) {
            String str = txtCal.getText();
            str = str.substring(1);
            secondNumber = Double.parseDouble(str);
            switch (check) {
                case 1:
                    result = (firstNumber) + (secondNumber);
                    break;
                case 2:
                    result = (firstNumber) - (secondNumber);
                    break;
                case 3:
                    result= firstNumber * secondNumber;
                    break;
                case 4:
                    result = firstNumber / secondNumber;
                    break;
                case 5:
                    result = firstNumber % secondNumber;
                    break;
            }
            s="="+String.valueOf(result);
            txtCal.setText(s);
        }
        if(ae.getSource()==btnClr){
            firstNumber=0;
            secondNumber=0;
            result=0;
            s=" ";
            txtCal.setText(s);
            check=0;
        }
        if(ae.getSource()==btnCnl){
            sg=txtCal.getText();
            s=sg.substring(0,sg.length()-1);
            txtCal.setText(s);
        }
    }

    public void itemStateChanged(ItemEvent ie) {
    }
    private void addComp(){
        p1.add(txtCal);
        p2.add(btnClr);
        p2.add(btnModulo);
        p2.add(btnCnl);
        p2.add(btnDiv);
        p3.add(btn7);
        p3.add(btn8);
        p3.add(btn9);
        p3.add(btnMul);
        p4.add(btn4);
        p4.add(btn5);
        p4.add(btn6);
        p4.add(btnSub);
        p5.add(btn1);
        p5.add(btn2);
        p5.add(btn3);
        p5.add(btnAdd);
        p6.add(btn00);
        p6.add(btn0);
        p6.add(btnDot);
        p6.add(btnEql);
        this.add(p1);
        this.add(p2);
        this.add(p3);
        this.add(p4);
        this.add(p5);
        this.add(p6);
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
