package com.fernando.javax;

import java.awt.Dimension;
import java.awt.HeadlessException;
import javax.swing.JFrame;

/**
 *
 * @author Fernando Ambrosio
 * @version v0.1.0
 * @since 08 de febrero del 2020
 */
public class Ventana extends JFrame{

    public Ventana(String title) throws HeadlessException {
        super(title);
        Dimension d = new Dimension(500, 500);
    }
    
    
}
