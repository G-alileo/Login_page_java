import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.awt.print.*;

public class NotepadExample implements ActionListener {
    JFrame f;
    JMenuBar mb;
    JMenu file, edit, format, view, help;
    JMenuItem cut, copy, paste, selectAll, open, save, saveAs, exit, print, newFile, newWindow, wordWrap, font, zoom, statusbar, viewHelp, sendFeedback, aboutNotepad ;
    JMenuItem undo, delete;
    JTextArea ta;
    String currentFilePath;
    String lastText = "";

    NotepadExample() {
        f = new JFrame("Notepad Example");

        // Initialize menu items
        cut = new JMenuItem("Cut");
        copy = new JMenuItem("Copy");
        paste = new JMenuItem("Paste");
        selectAll = new JMenuItem("Select All");
        open = new JMenuItem("Open");
        save = new JMenuItem("Save");
        saveAs = new JMenuItem("Save As");
        exit = new JMenuItem("Exit");
        print = new JMenuItem("Print");
        newFile = new JMenuItem("New");
        newWindow = new JMenuItem("New Window");
        undo = new JMenuItem("Undo");
        delete = new JMenuItem("Delete");
        wordWrap = new JCheckBoxMenuItem("Word Wrap");
        font = new JMenuItem("Font");
        zoom = new JMenuItem("Zoom");
        statusbar = new JCheckBoxMenuItem("Status Bar");
        viewHelp = new JMenuItem("View Help");
        sendFeedback = new JMenuItem("Send Feedback");
        aboutNotepad = new JMenuItem("About Notepad");

        // Add action listeners
        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        selectAll.addActionListener(this);
        open.addActionListener(this);
        save.addActionListener(this);
        saveAs.addActionListener(this);
        exit.addActionListener(this);
        print.addActionListener(this);
        newFile.addActionListener(this);
        newWindow.addActionListener(this);
        undo.addActionListener(this);
        delete.addActionListener(this);
        wordWrap.addActionListener(this);
        font.addActionListener(this);
        zoom.addActionListener(this);
        statusbar.addActionListener(this);
        viewHelp.addActionListener(this);
        sendFeedback.addActionListener(this);
        aboutNotepad.addActionListener(this);

        // Initialize menus
        mb = new JMenuBar();
        file = new JMenu("File");
        edit = new JMenu("Edit");
        format = new JMenu("Format");
        view = new JMenu("View");
        help = new JMenu("Help");

        // Add menu items to File menu
        file.add(newFile);
        file.add(newWindow);
        file.addSeparator();
        file.add(open);
        file.add(save);
        file.add(saveAs);
        file.addSeparator();
        file.add(print);
        file.addSeparator();
        file.add(exit);

        // Add menu items to Edit menu
        edit.add(undo);
        edit.addSeparator();
        edit.add(cut);
        edit.add(copy);
        edit.add(paste);
        edit.add(delete);
        edit.addSeparator();
        edit.add(selectAll);

        // Add menu items to Format menu
        format.add(wordWrap);
        format.add(font);

        // Add menu items to View menu
        view.add(zoom);
        view.add(statusbar);

        // Add menu items to Help menu
        help.add(viewHelp);
        help.add(sendFeedback);
        help.addSeparator();
        help.add(aboutNotepad);

        // Add menus to menu bar
        mb.add(file);
        mb.add(edit);
        mb.add(format);
        mb.add(view);
        mb.add(help);

        // Initialize text area
        ta = new JTextArea();
        ta.setBounds(5, 5, 360, 320);

        // Save last text for undo
        ta.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            public void insertUpdate(javax.swing.event.DocumentEvent e) {
                saveLastText();
            }

            public void removeUpdate(javax.swing.event.DocumentEvent e) {
                saveLastText();
            }

            public void changedUpdate(javax.swing.event.DocumentEvent e) {
                saveLastText();
            }

            private void saveLastText() {
                lastText = ta.getText();
            }
        });

        // Set up frame
        f.setJMenuBar(mb);
        f.add(ta);
        f.setLayout(null);
        f.setSize(400, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cut)
            ta.cut();
        else if (e.getSource() == copy)
            ta.copy();
        else if (e.getSource() == paste)
            ta.paste();
        else if (e.getSource() == selectAll)
            ta.selectAll();
        else if (e.getSource() == open)
            openFile();
        else if (e.getSource() == save)
            saveFile(false);
        else if (e.getSource() == saveAs)
            saveFile(true);
        else if (e.getSource() == exit)
            System.exit(0);
        else if (e.getSource() == print)
            printFile();
        else if (e.getSource() == newFile)
            newFile();
        else if (e.getSource() == newWindow)
            newWindow();
        else if (e.getSource() == undo)
            undo();
        else if (e.getSource() == delete)
            ta.replaceSelection("");
    }

    private void openFile() {
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(f);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            currentFilePath = selectedFile.getAbsolutePath();
            try (BufferedReader reader = new BufferedReader(new FileReader(selectedFile))) {
                ta.read(reader, null);
                f.setTitle("Notepad - " + selectedFile.getName());
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(f, "Error opening file: " + ex.getMessage());
            }
        }
    }

    private void saveFile(boolean saveAs) {
        File fileToSave = null;
        if (saveAs || currentFilePath == null) {
            JFileChooser fileChooser = new JFileChooser();
            int result = fileChooser.showSaveDialog(f);
            if (result == JFileChooser.APPROVE_OPTION) {
                fileToSave = fileChooser.getSelectedFile();
                currentFilePath = fileToSave.getAbsolutePath();
            }
        } else {
            fileToSave = new File(currentFilePath);
        }

        if (fileToSave != null) {
            try (FileWriter writer = new FileWriter(fileToSave)) {
                ta.write(writer);
                f.setTitle("Notepad - " + fileToSave.getName());
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(f, "Error saving file: " + ex.getMessage());
            }
        }
    }

    private void printFile() {
        try {
            ta.print();
        } catch (PrinterException ex) {
            JOptionPane.showMessageDialog(f, "Error printing: " + ex.getMessage());
        }
    }

    private void newFile() {
        ta.setText("");
        currentFilePath = null;
        f.setTitle("Notepad Example");
    }

    private void newWindow() {
        new NotepadExample();
    }

    private void undo() {
        // Simple undo: revert to last text (not a full undo stack)
        String temp = ta.getText();
        ta.setText(lastText);
        lastText = temp;
    }

    public static void main(String[] args) {
        new NotepadExample();
    }
}