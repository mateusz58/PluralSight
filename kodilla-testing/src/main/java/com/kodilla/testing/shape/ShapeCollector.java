package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ShapeCollector {

    private List<Shape>list=new ArrayList<>();
    public void addFigure(Shape shape){
        list.add(shape);}
    public void removeFigure(Shape shape){
        list.removeIf(s->s.equals(shape));}
    public Shape getFigure(int n){
        return list.get(n);
    }
    public void showFigures(){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).shapeName());
        }
    }

}
