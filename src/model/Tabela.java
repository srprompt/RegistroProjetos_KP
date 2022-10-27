/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Giovanni
 */
public class Tabela {
    
    
    public static void ordenaTabela(JTable table){
        TableRowSorter tableSorter = new TableRowSorter(table.getModel());
        table.setRowSorter(tableSorter);        
    }
    
    public static void buscaNaTabela(JTable table, JTextField text){
        TableRowSorter sorter = (TableRowSorter) table.getRowSorter();
        sorter.setRowFilter(javax.swing.RowFilter.regexFilter("(?i).*" + text.getText() + ".*"));
    }

}
