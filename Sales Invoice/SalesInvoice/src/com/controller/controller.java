
package com.controller;

import com.model.Invoice;
import com.view.InvoiceFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class controller implements ActionListener {
    
    private InvoiceFrame frame;
    private SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    
    public controller(InvoiceFrame frame) {
        this.frame = frame;
    }
    
    /* Switch case for the buttons  */
    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Save Files":
                saveFiles();
                break;
                
            case "Load Files":
                loadFiles();
                break;
                
            case "New Invoice":
                createNewInvoice();
                break;
                
            case "Delete Invoice":
                deleteInvoice();
                break;
                
            case "New Line":
                createNewLine();
                break;
                
            case "Delete Line":
                deleteLine();
                break;
        }
    }

    /*load files*/
    
    private void loadFiles() {
        JFileChooser fileChooser = new JFileChooser();
        try {
            int result = fileChooser.showOpenDialog(frame);
            if (result == JFileChooser.APPROVE_OPTION) {
                File headerFile = fileChooser.getSelectedFile();
                Path headerPath = Paths.get(headerFile.getAbsolutePath());
                List<String> headerLines = Files.readAllLines(headerPath);
                ArrayList<Invoice> invoiceHeaders = new ArrayList<>();
                for (String headerLine : headerLines) {
                    String[] arr = headerLine.split(",");
                    String str1 = arr[0];
                    String str2 = arr[1];
                    String str3 = arr[2];
                    int code = Integer.parseInt(str1);
                    Date invoiceDate = dateFormat.parse(str2);
                    Invoice header = new Invoice(code, str3, invoiceDate);
                    invoiceHeaders.add(header);
                }
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(frame, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(frame, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    /*create new invoices_ delete invoices_ create new line _ delete line _ save files */

    private void createNewInvoice() {
    }

    private void deleteInvoice() {
    }

    private void createNewLine() {
    }

    private void deleteLine() {
    }

    private void saveFiles() {
    }
    
}
