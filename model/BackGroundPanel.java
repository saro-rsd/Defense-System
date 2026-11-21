/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package defence.system.model;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author User
 */
public class BackGroundPanel extends JPanel{
    private Image background;
    public BackGroundPanel(){
         background = new ImageIcon(
            getClass().getResource("/defence.system.view.packages/images/background-image.png")
        ).getImage();
    }
    
    @Override
    protected void paintComponent(Graphics graphic) {

        super.paintComponent(graphic);

        graphic.drawImage(
            background,
            0,
            0,
            getWidth(),
            getHeight(),
            this
        );
    }
}
