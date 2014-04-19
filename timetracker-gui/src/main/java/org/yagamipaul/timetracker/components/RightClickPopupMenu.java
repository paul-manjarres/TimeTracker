/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.yagamipaul.timetracker.components;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreeNode;

/**
 *
 * @author JeanPaul
 */
public class RightClickPopupMenu extends JPopupMenu {
    
    private JTree tree;
    
    private DefaultMutableTreeNode selectedNode;
    

    final private JMenuItem addMenuItem;
    
    final private JMenuItem deleteMenuItem;
    
    final private JMenuItem disableMenuItem;
    
    
    
    public RightClickPopupMenu() {
        
        this.addMenuItem = new JMenuItem("Agregar");
        this.addMenuItem.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                
                e.getSource();
                
                DefaultMutableTreeNode newNode = new DefaultMutableTreeNode("Child");  
                
            
                selectedNode.add(newNode);
                   
                
                
                
            }
        });
        
        
        
        this.deleteMenuItem = new JMenuItem("Eliminar");
        this.disableMenuItem = new JMenuItem("Deshabilitar");        
        
    }
    
    
    public void init(){
        this.add(this.addMenuItem);
        this.add(this.deleteMenuItem);
        this.add(this.disableMenuItem);        
    }

    public JTree getTree() {
        return tree;
    }

    public void setTree(JTree tree) {
        this.tree = tree;
    }

    public DefaultMutableTreeNode getSelectedNode() {
        return selectedNode;
    }

    public void setSelectedNode(DefaultMutableTreeNode selectedNode) {
        this.selectedNode = selectedNode;
    }

  
    
    
    
    
    
    
    
    
}
