/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package defence.system.Observer;

/**
 *
 * @author User
 */
public interface Observable {
    void addObserver(Observer observer);
    void notifyAreaState(boolean isSelected);
    void notifyPositionState(int value);
    void sendMessage(String message);
}
