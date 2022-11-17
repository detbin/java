package clases;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Principal extends JFrame {

    private Voice voice;
    JTextArea ta;

    public Principal() {

        System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");

        JPanel pprincipal=new JPanel(new BorderLayout());

        JPanel ptexto=new JPanel();
        ta=new JTextArea(15,30);
        ta.setText("Thank you for visiting My Java Zone");
        ptexto.add(ta);

        pprincipal.add(ptexto,BorderLayout.CENTER);

        JPanel pboton=new JPanel();
        JButton b=new JButton("Leer");
        b.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                leerTexto(ta.getText());
            }
        });

        pboton.add(b);

        pprincipal.add(pboton,BorderLayout.SOUTH);

        add(pprincipal);

        setVisible(true);
        setBounds(0,0,400,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void leerTexto(String mensaje){
        VoiceManager voiceManager = VoiceManager.getInstance();
        voice = voiceManager.getVoice("kevin16");
        voice.allocate();
        if (voice == null) {
            JOptionPane.showMessageDialog(null, "Error no se encontro la voz indicada.");
            System.exit(0);
        }
        voice.speak(mensaje);
        voice.deallocate();
    }

    public static void main(String[] args) {

        new Principal();
    }
}