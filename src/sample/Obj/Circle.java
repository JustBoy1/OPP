package sample.Obj;

import javafx.scene.canvas.Canvas;

public class Circle extends Figure {
    @Override
    public void Draw(Canvas canvas, double x1, double y1, double x2, double y2) {
        canvas.getGraphicsContext2D().strokeOval(x1,y1,Math.abs(x1-x2),Math.abs(y2-y1));
        //canvas.getGraphicsContext2D().fillOval(x1,y1,Math.abs(x1-x2),Math.abs(y2-y1));

    }
}
