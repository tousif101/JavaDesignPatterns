package Prototype;

import org.apache.commons.lang3.SerializationUtils;

import java.io.Serializable;

class Point
{
    public int x, y;

    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public Point deepCopy(){
        Point point1 = new Point(this.x,this.y);
        return point1;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

class Line implements Serializable
{
    public Point start, end;

    public Line(Point start, Point end)
    {
        this.start = start;
        this.end = end;
    }

    @Override
    public String toString() {
        return "Line{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }

    public Line deepCopy()
    {
        Point point1 = new Point(this.start.x,this.start.y);
        Point point2 = new Point(this.end.x,this.end.y);
        Line line = new Line(point1,point2);
        return line;
    }
}


//TODO: Push to github
class Demo{
    public static void main(String[] args) {
        Point point1 = new Point(3,5);
        Point point2 = new Point(3,7);
        Line line = new Line(point1,point2);

        Line line1 = line.deepCopy();

        line1.start.x =5;

        System.out.println(line);
        System.out.println(line1);


    }
}