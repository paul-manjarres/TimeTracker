/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.yagamipaul.timetracker.components;

import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

/**
 *
 * @author JeanPaul
 */
public class RightClickPopupMenu extends JPopupMenu {

    private JMenuItem addMenuItem;
    
    private JMenuItem deleteMenuItem;
    
    private JMenuItem disableMenuItem;
    
    
    
    public RightClickPopupMenu() {
        
        this.addMenuItem = new JMenuItem("Agregar");
        this.deleteMenuItem = new JMenuItem("Eliminar");
        this.disableMenuItem = new JMenuItem("Deshabilitar");        
        
    }
    
    
    public void init(){
        this.add(this.addMenuItem);
        this.add(this.deleteMenuItem);
        this.add(this.disableMenuItem);        
    }
    
    
    
    
    
    
}
