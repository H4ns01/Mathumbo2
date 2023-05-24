/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.*;
import java.awt.*;

public class semafro extends JFrame {

    public semafro() {
        super("Desenho de Semáforo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(200, 400);
        setLocationRelativeTo(null);
    }

    public void paint(Graphics g) {
        super.paint(g);

        // Desenhar o retângulo do semáforo
        g.setColor(Color.GRAY);
        g.fillRect(50, 50, 100, 300);

        // Desenhar os círculos representando as luzes do semáforo
        g.setColor(Color.RED);
        g.fillOval(60, 60, 80, 80);

        g.setColor(Color.YELLOW);
        g.fillOval(60, 160, 80, 80);

        g.setColor(Color.GREEN);
        g.fillOval(60, 260, 80, 80);
        
        
        g.setColor(Color.blue);
        g.fillOval(400, 90, 100,60);
        
    }

    public static void main(String[] args) {
        semafro semafor = new semafro();
        semafor.setVisible(true);
    }
}
