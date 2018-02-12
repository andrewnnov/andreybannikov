package ru.job4j.condition;

/**
 * @author andreybannikov
 * @version $Id$
 * @since 0.1
 */
public class Triangle {

    private Point a;
    private Point b;
    private Point c;
    /**
     *
     * @param a
     * @param b
     * @param c
     */

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    /**
     * perimeter calculation
     * @param ab triangle side
     * @param ac triangle side
     * @param bc triangle side
     * @return perimeter
     */
    public double perimeterCalculation(double ab, double ac, double bc){
        return  ((this.a.distanceTo(this.b)) + (this.a.distanceTo(this.c)) + (this.b.distanceTo(this.c)))/2;
    }

    /**
     * area of triangle
     * @return area
     */
    public double area(){
        double rsl = -1;
        double ab = this.a.distanceTo(this.b);
        double ac = this.a.distanceTo(this.c);
        double bc = this.b.distanceTo(this.c);
        double p = this.perimeterCalculation(ab, ac, bc);
        if(this.exist(ab, ac, bc)){
            rsl = Math.sqrt(p*(p - ab)*(p - ac)*(p - bc));
        }
        return rsl;
    }

    /**
     * verification of the possibility of calculation
     * @param ab triangle side
     * @param ac triangle side
     * @param bc triangle side
     * @return true or false
     */
    private boolean exist(double ab, double ac, double bc){
        if(ab + bc <= ac || ab + ac <= bc || ac + bc <=  ab) {
            return false;
        }
        return true;
    }
}
