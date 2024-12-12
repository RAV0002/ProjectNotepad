package com.mynotepad.mynotepad;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ScrollBar;
import javafx.stage.Stage;

import java.awt.*;
import javafx.scene.control.MenuItem;
import java.io.IOException;

public class Controller {

    private Stage stage;
    private Scene scene;
    private Parent root;

//    ========================================== File Menu Option ==========================================
    public void OnExitMenuItemClick(){
        System.out.println("<MENU ITEM - Close>");
        System.exit(0);
    }
    public void OnNewMenuItemClick(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("addNote.fxml"));
        MenuItem menuItem = (MenuItem) event.getSource();
        Scene scene = menuItem.getParentPopup().getOwnerWindow().getScene();
        Stage stage = (Stage) scene.getWindow();

        stage.setScene(new Scene(root));
        stage.show();
        System.out.println("<MENU ITEM - New>");
    }
    public void OnCloseMenuItemClick(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("notes.fxml"));
        MenuItem menuItem = (MenuItem) event.getSource();
        Scene scene = menuItem.getParentPopup().getOwnerWindow().getScene();
        Stage stage = (Stage) scene.getWindow();

        stage.setScene(new Scene(root,703, 482));
        stage.show();
        System.out.println("<MENU ITEM - Close>");
    }

    public void OnSaveMenuItemClick(){
        System.out.println("<MENU ITEM - Save>");
    }
//    ========================================== Edit Menu Option ==========================================
    public void OnUndoMenuItemClick(){
        System.out.println("<MENU ITEM - Undo>");
    }
//    ========================================== Help Menu Option ==========================================
    public void OnAboutMenuItemClick(){
        System.out.println("<MENU ITEM - About>");
    }

}