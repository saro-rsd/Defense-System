/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package defence.system.Observer;

/**
 *
 * @author User
 */
public interface Observer {
    void changeStatus(boolean isAreaClear);
    void changePosition(int positionValue);
    void receiveMessage(String message);
}
