/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package defence.system.control;

import defence.system.Observer.Observable;
import defence.system.Observer.Observer;

/**
 *
 * @author User
 */
public class UnitManager implements Observable {
    private static UnitManager unitManager;
    private Observer[] observerArray = new Observer[0];
    
    public static UnitManager getInstance(){
        if(unitManager==null){
            unitManager = new UnitManager();
        }
        return unitManager;
    }

    @Override
    public void addObserver(Observer observer) {
        extendArray();
        observerArray[observerArray.length - 1] = observer;
    }

    private void extendArray() {
        Observer[] tempArray = new Observer[observerArray.length + 1];

        for (int i = 0; i < observerArray.length; i++) {
            tempArray[i] = observerArray[i];
        }
        observerArray = tempArray;
    }
    
    @Override
    public void notifyAreaState(boolean isAreaClear) {
        for(Observer ob:observerArray){
            ob.changeStatus(isAreaClear);
        }
    }
    
    
    @Override
    public void notifyPositionState(int positionValue){
        for(Observer ob:observerArray){
            ob.changePosition(positionValue);
        }
    }
    
    @Override
    public void sendMessage(String message){
        for(Observer ob:observerArray){
            ob.receiveMessage(message);
        }
    }
    
    
}
