import java.awt.*;
import java.awt.event.*;
public class UserLogin {
    Frame app=new Frame("TextField 组件");
    Label lblName=new Label("UserName:");
    static TextField txtName=new TextField();
    Label lblPass=new Label("password:");
    static TextField txtPass=new TextField();
    public  UserLogin(){
        app.setSize(300,150);
        app.setLayout(null);
        lblName.setBounds(60,50,70,20);
        txtName.setBounds(135,50,100,20);
        txtName.addKeyListener(new keyHandler());
        txtName.addFocusListener(new focusHandler());
        lblPass.setBounds(60,90,70,20);
        txtPass.setBounds(135,90,100,20);
        txtPass.setEchoChar('*');
        txtPass.addKeyListener(new keyHandler());
        txtPass.addFocusListener(new focusHandler());
        app.add(lblName);app.add(txtName);
        app.add(lblPass);app.add(txtPass);
        app.setLocation(200,100);
        app.setVisible(true);
        MyWindowListener mw = new MyWindowListener();
        app.addWindowListener(mw);
    }
    public static void main (String[]args){
        UserLogin tft=new UserLogin();
    }
}
class keyHandler implements KeyListener{
    public void keyPressed(KeyEvent e){
        Object ob=e.getSource();
        if((ob==UserLogin.txtName)&&(e.getKeyCode()==10)){
            System.out.println(UserLogin.txtName.getText());
        }
        else if((ob==UserLogin.txtPass)&&e.getKeyCode()==10){
            System.out.println(UserLogin.txtPass.getText());
        }
    }
    public void keyReleased(KeyEvent e){

    }
    public void keyTyped(KeyEvent e){

    }
}
class focusHandler implements FocusListener{
    @Override
    public void focusGained(FocusEvent e) {

    }

    @Override
    public void focusLost(FocusEvent e) {
        Object ob=e.getCause();
        if(ob==UserLogin.txtName){
            System.out.println(UserLogin.txtName.getText());
        }
        else if(ob==UserLogin.txtPass){
            System.out.println(UserLogin.txtPass.getText());
        }
    }
}
class MyWindowListener extends WindowAdapter{
    public void windowClosing(WindowEvent e){
        Window window=e.getWindow();
        window.setVisible(false);
        window.dispose();
    }
}
