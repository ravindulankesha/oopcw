package coursework;

import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

class MyActionListener implements ActionListener {
    JFrame frame;
    MyActionListener(JFrame f) {
        frame = f;
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Putting a driver with his statistics")) {
            try {
                Formula1ChampionshipManager.menu("P");
            } catch (IOException | ClassNotFoundException ioException) {
                ioException.printStackTrace();
            }
        }
        if(e.getActionCommand().equals("Viewing the drivers with statistics")){
            try {
                Formula1ChampionshipManager.menu("V");
            } catch (IOException | ClassNotFoundException ioException) {
                ioException.printStackTrace();
            }
        }
        if (e.getActionCommand().equals("Create new driver")) {
            try {
                Formula1ChampionshipManager.menu("C");
            } catch (IOException | ClassNotFoundException ioException) {
                ioException.printStackTrace();
            }
        }
        if (e.getActionCommand().equals("Change a driver's team")) {
            try {
                Formula1ChampionshipManager.menu("T");
            } catch (IOException | ClassNotFoundException ioException) {
                ioException.printStackTrace();
            }
        }
        if (e.getActionCommand().equals("Delete a driver")) {
            try {
                Formula1ChampionshipManager.menu("D");
            } catch (IOException | ClassNotFoundException ioException) {
                ioException.printStackTrace();
            }
        }
        if (e.getActionCommand().equals("View statistics of a single driver")) {
            try {
                Formula1ChampionshipManager.menu("S");
            } catch (IOException | ClassNotFoundException ioException) {
                ioException.printStackTrace();
            }
        }
        if (e.getActionCommand().equals("View the descending driver table")) {
            try {
                Formula1ChampionshipManager.menu("K");
            } catch (IOException | ClassNotFoundException ioException) {
                ioException.printStackTrace();
            }
        }
        if (e.getActionCommand().equals("Add a completed race")) {
            try {
                Formula1ChampionshipManager.menu("A");
            } catch (IOException | ClassNotFoundException ioException) {
                ioException.printStackTrace();
            }
        }
        if (e.getActionCommand().equals("Save information to a file")) {
            try {
                Formula1ChampionshipManager.menu("I");
            } catch (IOException | ClassNotFoundException ioException) {
                ioException.printStackTrace();
            }
        }
        if (e.getActionCommand().equals("Load from previous state")) {
            try {
                Formula1ChampionshipManager.menu("J");
            } catch (IOException | ClassNotFoundException ioException) {
                ioException.printStackTrace();
            }
        }
        if (e.getActionCommand().equals("View the ascending driver table")) {
            try {
                Formula1ChampionshipManager.menu("Q");
            } catch (IOException | ClassNotFoundException ioException) {
                ioException.printStackTrace();
            }
        }
        if (e.getActionCommand().equals("Sort by most first positions")) {
            try {
                Formula1ChampionshipManager.menu("O");
            } catch (IOException | ClassNotFoundException ioException) {
                ioException.printStackTrace();
            }
        }
        if (e.getActionCommand().equals("Generate random race")) {
            try {
                Formula1ChampionshipManager.menu("Z");
            } catch (IOException | ClassNotFoundException ioException) {
                ioException.printStackTrace();
            }
        }
        if (e.getActionCommand().equals("Stop")) {
            try {
                Formula1ChampionshipManager.menu("F");
            } catch (IOException | ClassNotFoundException ioException) {
                ioException.printStackTrace();
            }
        }
    }
}

public class GraphicalInterface{
    protected static ArrayList<Formula1Driver> drivers;

    public static void main(String[] args) {
        drivers =new ArrayList<>();
        JFrame frame=new JFrame("Formula1 menu");
        JButton button1= new JButton("Putting a driver with his statistics");
        JButton button2= new JButton("Viewing the drivers with statistics");
        JButton button3= new JButton("Create new driver");
        JButton button4= new JButton("Change a driver's team");
        JButton button5= new JButton("Delete a driver");
        JButton button6= new JButton("View statistics of a single driver");
        JButton button7= new JButton("View the descending driver table");
        JButton button8= new JButton("Add a completed race");
        JButton button9= new JButton("Save information to a file");
        JButton button10= new JButton("Load from previous state");
        JButton button11= new JButton("View the ascending driver table");
        JButton button12= new JButton("Sort by most first positions");
        JButton button13= new JButton("Generate random race");
        JButton button14= new JButton("Stop");
        JPanel panel1=new JPanel();
        frame.setContentPane(panel1);
        panel1.add(button1);
        panel1.add(button2);
        panel1.add(button3);
        panel1.add(button4);
        panel1.add(button5);
        panel1.add(button6);
        panel1.add(button7);
        panel1.add(button8);
        panel1.add(button9);
        panel1.add(button10);
        panel1.add(button11);
        panel1.add(button12);
        panel1.add(button13);
        panel1.add(button14);
        button1.addActionListener(new MyActionListener(frame));
        button2.addActionListener(new MyActionListener(frame));
        button3.addActionListener(new MyActionListener(frame));
        button4.addActionListener(new MyActionListener(frame));
        button5.addActionListener(new MyActionListener(frame));
        button6.addActionListener(new MyActionListener(frame));
        button7.addActionListener(new MyActionListener(frame));
        button8.addActionListener(new MyActionListener(frame));
        button9.addActionListener(new MyActionListener(frame));
        button10.addActionListener(new MyActionListener(frame));
        button11.addActionListener(new MyActionListener(frame));
        button12.addActionListener(new MyActionListener(frame));
        button13.addActionListener(new MyActionListener(frame));
        button14.addActionListener(new MyActionListener(frame));
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
