/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yagamipaul.timetracker.listeners;

import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeSelectionModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author JeanPaul
 */
public class TimeTrackerTreeSelectionListener implements TreeSelectionListener {

    private static final Logger LOG = LoggerFactory.getLogger(TimeTrackerTreeSelectionListener.class.getName());

    @Override
    public void valueChanged(TreeSelectionEvent e) {

        JTree tree = (JTree) e.getSource();

        TreeSelectionModel selection = tree.getSelectionModel();

        Object userObject = ((DefaultMutableTreeNode) selection.getSelectionPath().getLastPathComponent())
                .getUserObject();

        LOG.debug("Selected element {}", userObject);

    }

}
