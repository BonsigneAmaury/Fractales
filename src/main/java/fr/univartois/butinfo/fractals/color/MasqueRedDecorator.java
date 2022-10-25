package fr.univartois.butinfo.fractals.color;

import java.awt.*;

public class MasqueRedDecorator extends ColorDecorator{

    public MasqueRedDecorator(Color color) {
        super(color);
    }
    @Override
    public Color getColor(int nbIteration) {
        return this.getColor();
    }
    @Override
    public Color masque() {
        return new Color(this.getColor().getRed(),0,0);
    }

}