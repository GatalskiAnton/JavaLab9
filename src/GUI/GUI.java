package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

import PriorityQueue.*;
import Reader.Reader;

public class GUI extends JFrame {

    private PriorityQueue queue;

    private JList list;

    private JButton openButton;
    private JButton addButton;
    private JButton clearButton;

    public GUI(String title) throws HeadlessException {
        super(title);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        createButton();
        addElements();
        addMouseEvent();
    }

    private void createButton() {
        openButton = new JButton("Open");
        addButton = new JButton("Add");
        clearButton = new JButton("Clear");
    }

    private void addElements() {
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        buttonPanel.add(clearButton);
        buttonPanel.add(addButton);
        buttonPanel.add(openButton);

        list = new JList();
        list.setBorder(BorderFactory.createTitledBorder("Elements"));

        setLayout(new BorderLayout());
        add(list, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
    }

    private void addMouseEvent() {
        MouseAdapter openAdapter = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JFileChooser fileChooser = new JFileChooser(".");
                int value = fileChooser.showDialog(null, "Select");
                if (value == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    queue = Reader.readElementsFromFile(selectedFile);

                    list.setModel(queue.toListModel());
                }
            }
        };

        MouseAdapter cleanAdapter = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                queue.clear();

                list.setModel(queue.toListModel());
            }
        };

        MouseAdapter addAdapter = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String info = JOptionPane.showInputDialog(GUI.this, "Input(priority element)");
                if (info == null)
                    return;

                if (queue == null || queue.isEmpty()) {
                    queue = new PriorityQueue();
                    queue.insert(new Pair<>(Integer.parseInt(info.split(" ")[0]), info.split(" ")[1]));
                } else {
                    queue.insert(new Pair<>(Integer.parseInt(info.split(" ")[0]), info.split(" ")[1]));
                }

                list.setModel(queue.toListModel());
            }
        };
        addButton.addMouseListener(addAdapter);
        openButton.addMouseListener(openAdapter);
        clearButton.addMouseListener(cleanAdapter);
    }
}
