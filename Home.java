import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home {
    public static class ChooseTable {
        private JPanel panel1;
        private JButton depotButton;
        private JButton donorButton;
        private JButton seekerButton;
        private JButton bloodPacketButton;
        private JButton xButton;
    public ChooseTable() {
        xButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
    }

    public static class DepotTable {
        private JButton xButton;
        private JScrollBar scrollBar1;
        private JTable table1;

        public DepotTable() {
        xButton.addActionListener(new ActionListener() {
        });
    }
    }

    public static class DonorTable {
        private JButton xButton;
        private JScrollBar scrollBar1;
        private JTable table1;

        public DonorTable() {
        xButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
    }

    public static class SeekerTable {
        private JButton xButton;
        private JScrollBar scrollBar1;
        private JTable table1;
    }

    public static class BloodPacket {
        private JButton xButton;
        private JScrollBar scrollBar1;
        private JTable table1;

        public BloodPacket() {
        xButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
    }

    public static class Login {
    }
}
