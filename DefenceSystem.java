/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package defence.system;

import defence.system.control.UnitManager;
import defence.system.view.*;

/**
 *
 * @author Welcome
 */
public class DefenceSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        UnitManager manager = UnitManager.getInstance();
        MainControllerUI controllerUI  = MainControllerUI.getInstance();
                
        HelicopterUI helicopter = new HelicopterUI();
        TankUI tank = new TankUI();
        SubMarineUI submarine = new SubMarineUI();
        
        manager.addObserver(helicopter);
        manager.addObserver(tank);
        manager.addObserver(submarine);
        
        helicopter.setVisible(true);
        tank.setVisible(true);
        submarine.setVisible(true);
        controllerUI.setVisible(true);

        controllerUI.setVisible(true);

    }

}
