package ru.job4j.condition;

public class Triangle {
    private Point ap;
    private Point bp;
    private Point cp;

    public Triangle(Point a, Point b, Point c) {
        this.ap = a;
        this.bp = b;
        this.cp = c;
    }

    /**
     * Метод вычисления периметра по длинам сторон.
     *
     * Формула.
     *
     * (a + b + c) / 2
     *
     * @param a расстояние между точками a и b
     * @param b расстояние между точками a и c
     * @param c расстояние между точками b и c
     * @return Периметр.
     */
    public double period(double a, double b, double c) {
        return (a + b + c) / 2;
    }

    /**
     * Метод должен вычислить площадь треугольника.
     *
     * Формула.
     *
     * √ p *(p - ab) * (p - ac) * (p - bc)
     *
     * где √ - корень квадратный, для извлечения корня использовать метод Math.sqrt().
     *
     * @return Вернуть площадь, если треугольник существует или -1.
     */
    public double area() {
        double result = -1;
        double a = ap.distance(bp);
        double b = ap.distance(cp);
        double c = bp.distance(cp);
        double p = this.period(a, b, c);
        if (this.exist(a, b, c)) {
            result = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
        return result;
    }

    /**
     * Метод проверяет можно ли построить треугольник с такими длинами сторон.
     *
     * Сумма двух сторон дожна быть больше третьей.
     *
     * @param ab Длина от точки a до b.
     * @param bc Длина от точки a до c.
     * @param bc Длина от точки b до c.
     * @return true если треугольник можно построить, иначе false.
     */
    public boolean exist(double ab, double ac, double bc) {
        return (((ab + ac) > bc) && ((ab + bc) > ac) && ((bc + ac) > ab));
    }
}
