/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;


public class GerenteDeJanelas {
    
    private static JDesktopPane jDesktopPane;
    
    public GerenteDeJanelas(JDesktopPane jDesktopPane){
        GerenteDeJanelas.jDesktopPane = jDesktopPane;
    }
    
    public void abrirJanelas(JInternalFrame jInternalFrame){
        try {
            if(jInternalFrame.isVisible()){
                jInternalFrame.toFront();
                jInternalFrame.requestFocusInWindow();
            }else if(jInternalFrame.isVisible() == false){
                jDesktopPane.add(jInternalFrame);
                jInternalFrame.setVisible(true);
            }
        } catch (Exception e) {
            System.out.println("Já existe uma janela em execução!");
        }
    }
    
}
