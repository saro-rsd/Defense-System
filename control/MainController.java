/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package defence.system.control;

import defence.system.view.MainControllerUI;

public class MainController {

    private static MainController mainController;
    private static UnitManager unitManager = UnitManager.getInstance();
    

    public static MainController getInstance() {
        if (mainController == null) {
            mainController = new MainController();
        }
        return mainController;
    }

    
    public void updateAreaState(boolean isAreaClear) {
        unitManager.notifyAreaState(isAreaClear);
    }
    
    public void updatePosition(int value){
        unitManager.notifyPositionState(value);
    }
    
    public void sendMessage(String message){
        unitManager.sendMessage(message);
    }
    
    public void sendMessage(String user, String message){
        MainControllerUI.getInstance().receiveMessage(user, message);
    }
    
}
