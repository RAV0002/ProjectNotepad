package com.mynotepad.mynotepad;

import javafx.scene.control.ScrollBar;

public class Controller {

//    ========================================== File Menu Option ==========================================
    public void OnCloseMenuItemClick(){
        System.out.println("<MENU ITEM - Close>");
        System.exit(0);
    }
    public void OnNewMenuItemClick(){
        System.out.println("<MENU ITEM - New>");
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