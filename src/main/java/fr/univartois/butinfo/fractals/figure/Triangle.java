package fr.univartois.butinfo.fractals.figure;

import fr.univartois.butinfo.fractals.complex.Complex;
import fr.univartois.butinfo.fractals.complex.IComplex;

import java.awt.*;

public class Triangle implements IFigure{
    private Color color;
    private IComplex posx;
    private IComplex posy;
    private IComplex posz;


    public Triangle(Color color, IComplex posx, IComplex posy, IComplex posz) {
        this.color = color;
        this.posx = posx;
        this.posy = posy;
        this.posz=posz;
    }


    @Override
    public String repr() {
        return "<polygon points='"+posx.getRealPart()+", "+posx.getImaginaryPart()+" "+posy.getRealPart()+", "+posy.getImaginaryPart()+" "+posz.getRealPart()+", "+posz.getImaginaryPart()+"'stroke ="+color+"/>";



    }
}
