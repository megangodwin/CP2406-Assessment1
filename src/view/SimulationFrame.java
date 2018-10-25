package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;
import sim.SmartHouseSimulator;

import model.Room;


public class SimulationFrame extends JFrame implements ActionListener{

    JMenuBar menuBar;

//    HashMap<String, Room> rooms = new HashMap<String, Room>();
//    HashMap<String, Room>

    public SimulationFrame() {
        super("Smart House Simulator");
        setLayout(new BorderLayout());

        //initialise frame/window
        JFrame mainFrame = new JFrame();

        //initialise menu bar
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        //add file item and subsequent options (import and view config to menu bar
        JMenu file = new JMenu("File");
        menuBar.add(file);

        JMenuItem importConfig = new JMenuItem("Create Config");

        JMenuItem viewConfig = new JMenuItem("View Config");

        viewConfig.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ConfigFrame configWindow = new ConfigFrame();
                configWindow.pack();
                configWindow.setSize(600,400);
            }
        });

        file.add(importConfig);
        file.add(viewConfig);

        //add simulation functions to menu
        JMenu simulation = new JMenu("Simulation");
        menuBar.add(simulation);

        JMenuItem startSim = new JMenuItem("Start Simulation");
        JMenuItem stopSim = new JMenuItem("Stop Simulation");
        JMenuItem pauseSim = new JMenuItem("Pause Simulation");
        simulation.add(startSim);
        simulation.add(stopSim);
        simulation.add(pauseSim);

        mainFrame.getContentPane();

        setVisible(true);
    }

    public void setupConfigListener(ActionListener listener) {


    }


    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponents(graphics);

        graphics.setFont(new Font("Arial", Font.BOLD, 28));


        for (Room r : house.values()) {

        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

}
