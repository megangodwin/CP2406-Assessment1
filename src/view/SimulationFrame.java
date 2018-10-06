package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimulationFrame extends JFrame {

    JMenuBar menuBar;

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

        JMenuItem importConfig = new JMenuItem("Import Config");
        JMenuItem viewConfig = new JMenuItem("View Config");
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

//        ButtonGroup group = new ButtonGroup();
//        group.add(importConfig);
//        group.add(viewConfig);

        mainFrame.getContentPane();

        setVisible(true);
    }



}
