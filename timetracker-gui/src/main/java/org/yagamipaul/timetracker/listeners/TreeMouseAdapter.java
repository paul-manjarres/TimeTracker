/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yagamipaul.timetracker.listeners;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeSelectionModel;
import org.yagamipaul.timetracker.components.RightClickPopupMenu;

/**
 *
 * @author JeanPaul
 */
public class TreeMouseAdapter extends MouseAdapter {

    @Override
    public void mouseClicked(MouseEvent e) {

        if (e.isMetaDown()) {
            int row = ((JTree) e.getSource()).getRowForLocation(e.getX(), e.getY());
            ((JTree) e.getSource()).setSelectionRow(row);
            this.showPopup(e);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.isPopupTrigger()) {
            this.showPopup(e);
        }

    }

    private void showPopup(MouseEvent e) {

        JTree tree = (JTree) e.getSource();
        TreeSelectionModel selection = tree.getSelectionModel();
        DefaultMutableTreeNode selectedNode= ((DefaultMutableTreeNode) selection.getSelectionPath().getLastPathComponent());
        
        
        RightClickPopupMenu popUp = new RightClickPopupMenu();
        popUp.setTree(tree);
        popUp.setSelectedNode(selectedNode);
        popUp.init();
        popUp.show((JTree) e.getSource(), e.getX(), e.getY());

    }

}
