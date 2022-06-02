package com.example.task1a;

import javafx.scene.Group;
import javafx.scene.paint.Color;

public class Rectangle
{
    private Point uPoint;
    private double width;
    private double height;


    public Rectangle()
    {
        this(new Point(), 1, 1);
    }

    public Rectangle(Point uPoint, double width, double height)
    {
        setUPoint(uPoint);
        setHeight(height);
        setWidth(width);
    }

    public Rectangle(Rectangle rec)
    {
        this(rec.uPoint, rec.width, rec.height);
    }

    public Point getUPoint()
    {
        return new Point(uPoint);
    }

    public void setUPoint(Point uPoint)
    {
        if (uPoint != null)
        {
            this.uPoint = new Point(uPoint);
        } else
        {
            this.uPoint = new Point();
        }
    }

    public double getWidth()
    {
        return width;
    }

    public void setWidth(double width)
    {
        if (width > 0)
        {
            this.width = width;
        } else
        {
            this.width = 1;
        }
    }

    public double getHeight()
    {
        return height;
    }

    public void setHeight(double height)
    {
        if (height > 0)
        {
            this.height = height;
        } else
        {
            this.height = 1;
        }
    }

    public void draw(Group pane)
    {
        double x = uPoint.getCoordinates()[0];
        double y = uPoint.getCoordinates()[0];
        javafx.scene.shape.Rectangle rectangle = new javafx.scene.shape.Rectangle(x ,y, width, height);
        rectangle.setStroke(Color.BLACK);
        rectangle.setFill(null);
        pane.getChildren().add(rectangle);
    }

    @Override
    public String toString()
    {
        return String.format("Point: %s, width : %.2f, height: %.2f", uPoint.toString(), width, height);
    }
}
