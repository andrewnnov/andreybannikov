package ru.job4j.condition;

/**
 * @author andreybannikov(andrewnnov@yandex.ru)
 * @version 1.0
 * @since 0.1
 */

 public class Point {

   private int x;
   private int y;

   public Point(int x, int y){
     this.x = x;
     this.y = y;
   }

   public static void main(String[] args) {
     Point a = new Point(0, 1);
     Point b = new Point(2, 5);

     System.out.println("coordinates of point A (" + a.x + "," + a.y + ")");
     System.out.println("coordinates of point B (" + b.x + "," + b.y + ")");

     double result = a.distanceTo(b);
     System.out.println("Расстояние от точки А до точки B = " + result);
   }

  /**
   * Method Calculation distance between two points
   * @param that - coordinates point B
   * @return result of operation
   */

   public double distanceTo(Point that){

     return Math.sqrt(Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2));

   }


 }








