package MainUI;


import java.awt.event.ActionEvent;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainUI extends JFrame {

    private final String FRAME_TITLE="����â";
    private int[] FRAME_SIZE={700,600};
    private int FRAME_LOC_X = 500;
    private int FRAME_LOC_Y=100;

    public MainUI(){
        setSize(FRAME_SIZE[0],FRAME_SIZE[1]);
        setTitle(FRAME_TITLE);
        setLocation(FRAME_LOC_X,FRAME_LOC_Y);

        JButton OmokBt = new JButton("����");
        JButton ChesstBt = new JButton("ü��");

        OmokBt.setBounds(130,180,100,45);
        ChesstBt.setBounds(130,250,100,45);

        //--------------------------------------------------------------------------------------------//

        JLabel background = new JLabel(new ImageIcon(getClass().getResource("/res/MBG.png")));
        add(background);

        background.add(OmokBt);
        background.add(ChesstBt);

        setVisible(true);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        OmokBt.addActionListener((ActionEvent e) ->{
            System.out.println("����");
        });

        ChesstBt.addActionListener((ActionEvent e) ->{
            System.out.println("ü��");
            try {
                ProcessBuilder pb = new ProcessBuilder("java", "-cp", "bin", "Chess");
                pb.start();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });

    }

}

