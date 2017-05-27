package Martes14;
import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener{
  JButton Terminar,sumar,Limpiar,restar,multi,dividir,boton0,boton1,boton2,boton3,boton4,boton5,boton6,boton7,boton8,boton9;
  
  JTextField TN1,TN2;
  JLabel Lresp, Ltitle, Ltext;
  double n1,n2,resp;
  
  
  public Formulario(){
      setLayout(null);
      setTitle("Calculadora V1.0.0"); //Nombre en la ventana
      agregarBoton();
      agregarCajasTexto();
    }
  
  public void agregarBoton(){ //Metodo para hacer los botones
      boton0 = new JButton("7");
      boton0.setBounds(320,150,50,50);//Posicion (X,Y,Ancho,Alto)
      add(boton0);
      boton0.addActionListener(this);
      
      boton1 = new JButton("8");
      boton1.setBounds(380,150,50,50);
      add(boton1);
      boton1.addActionListener(this);
      
      boton2 = new JButton("9");
      boton2.setBounds(440,150,50,50);
      add(boton2);
      boton2.addActionListener(this);
      
      boton3 = new JButton("4");
      boton3.setBounds(320,210,50,50);
      add(boton3);
      boton3.addActionListener(this);
      
      boton4 = new JButton("5");
      boton4.setBounds(380,210,50,50);
      add(boton4);
      boton4.addActionListener(this);
      
      boton5 = new JButton("6");
      boton5.setBounds(440,210,50,50);
      add(boton5);
      boton5.addActionListener(this);
      
      boton6 = new JButton("1");
      boton6.setBounds(320,270,50,50);
      add(boton6);
      boton6.addActionListener(this);
      
      boton7 = new JButton("2");
      boton7.setBounds(380,270,50,50);
      add(boton7);
      boton7.addActionListener(this);
      
      boton8 = new JButton("3");
      boton8.setBounds(440,270,50,50);
      add(boton8);
      boton8.addActionListener(this);
      
      boton9 = new JButton("0");
      boton9.setBounds(370,330,70,45);
      add(boton9);
      boton9.addActionListener(this);
      
      Terminar= new JButton("Salir");
      Terminar.setBounds(300,450,100,25);//Posicion (X,Y,Ancho,Alto)
      add(Terminar);
      Terminar.addActionListener(this);
      
      sumar= new JButton("Sumar");
      sumar.setBounds(150,190,100,25);
      add(sumar);
      sumar.addActionListener(this);
      
      restar= new JButton("Restar");
      restar.setBounds(150,250,100,25);
      add(restar);
      restar.addActionListener(this);
      multi= new JButton("Multiplicar");
      multi.setBounds(550,190,100,25);
      add(multi);
      multi.addActionListener(this);
      dividir= new JButton("Dividir");
      dividir.setBounds(550,250,100,25);
      add(dividir);
      dividir.addActionListener(this);
      
      Limpiar= new JButton("Limpiar");
      Limpiar.setBounds(420,450,100,25);//Posicion (X,Y,Ancho,Alto)
      add(Limpiar);
      Limpiar.addActionListener(this);
  }
  public void agregarCajasTexto(){ //Metodo para editar cajas de texto y labels
    TN1=new JTextField();
    TN1.setBounds(300,100,100,25); //(X,Y,Ancho,Alto)
    add(TN1);
    TN2=new JTextField();
    TN2.setBounds(420,100,100,25);
    add(TN2);
    Lresp=new JLabel("El Resultado es: ----------");
    Lresp.setBounds(200,400,400,25);
    add(Lresp);
    
    
    //Ltitle=new JLabel ("..:: Calculadora Basica ::..");//Para que coloque texto
    Ltitle=new JLabel ();//Agregar imagen en lugar de texto
    Ltitle.setIcon(new ImageIcon(getClass().getResource("imagen.png")));//Aqui se agrega el archivo
    Ltitle.setBounds(300,10,250,50);
    add(Ltitle);
    Ltext=new JLabel ("Digite dos numero y luego seleccione la opción que desea ejecutar");
    Ltext.setBounds (250,50,500,25);
    add(Ltext);
  }
  public void actionPerformed(ActionEvent ae){ //Metodo donde se configuran las acciones de cada boton
      
      if(ae.getSource()==Terminar){
          //System.out.println("Acaba de oprimir el Boton terminar");
          System.exit(0);
      }
      if(ae.getSource()==Limpiar){
        
        TN1.setText("");
        TN2.setText("");
        Lresp.setText("El Resultado es: ----------");
        
      }
      if(ae.getSource()==sumar){
          try{ //*Aqui se inicia la validacion de que se escriban numeros
          n1=Double.parseDouble(TN1.getText());
          n2=Double.parseDouble(TN2.getText());
          resp=n1+n2;
          Lresp.setText("El resultado de la suma es: "+resp);
          }catch(Exception e){ //*Validacion por si no escribe un numero
            JOptionPane.showMessageDialog(null,"            ¡ERROR!\n\n Digite un numero o elimine espacios añadidos.");
            TN1.requestFocus(); //*Aqui envia el cursor a escribir en la primera casilla
          }
      }
      if(ae.getSource()==restar){
          try{ //*Aqui se inicia la validacion de que se escriban numeros
          n1=Double.parseDouble(TN1.getText());
          n2=Double.parseDouble(TN2.getText());
          resp=n1-n2;
          Lresp.setText("El resultado de la resta es: "+resp);
          }catch(Exception e){ //*Validacion por si no escribe un numero
            JOptionPane.showMessageDialog(null,"            ¡ERROR!\n\n Digite un numero o elimine espacios añadidos.");
            TN1.requestFocus();
          }
      } 
      if(ae.getSource()==multi){
          try{ //*Aqui se inicia la validacion de que se escriban numeros
          n1=Double.parseDouble(TN1.getText());
          n2=Double.parseDouble(TN2.getText());
          resp=n1*n2;
          Lresp.setText("El resultado de la multiplicación es: "+resp);
          }catch(Exception e){ //*Validacion por si no escribe un numero
            JOptionPane.showMessageDialog(null,"             ¡ERROR!\n\n Digite un numero o elimine espacios añadidos.");
            TN1.requestFocus();
          }
      }
      if(ae.getSource()==dividir){
          try{ //*Aqui se inicia la validacion de que se escriban numeros
          n1=Double.parseDouble(TN1.getText());
          n2=Double.parseDouble(TN2.getText());
          resp=n1/n2;
          Lresp.setText("El resultado de la división es: "+resp);
          }catch(Exception e){ //*Validacion por si no escribe un numero
            JOptionPane.showMessageDialog(null,"              ¡ERROR!\n\n Digite un numero o elimine espacios añadidos.");
            TN1.requestFocus();
          }
      }
      
  }
  public static void main(String args[]){
      JFrame ventana=new Formulario();
      ventana.getContentPane().setBackground(Color.ORANGE); //Cambia el color de la ventana
      ventana.setSize(800, 550);
      ventana.setVisible(true);
      ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }    
}
