package CircleCollection;

public class Circle
{
    private double x;
    private double y;
    private double radius;

    public Circle(double x, double y, double radius) throws Exception
    {
        if(radius < 0)
            throw new Exception("반지름이 0보다 작습니다.");

        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    // 두 원이 서로 접하면 true, 접하지 않으면 false 반환.
    public boolean reach(Circle other)
    {
        double distance = Math.sqrt(
                (other.x - this.x) * (other.x - this.x) + (other.y - this.y) * (other.y - this.y)
        );

        return distance <= this.radius + other.radius;
    }

    @Override
    public boolean equals(Object o)
    {
        if(this == o)
            return true;

        if(o == null || getClass() != o.getClass())
            return false;

        Circle circle = (Circle) o;

        return Double.compare(circle.x, x) == 0 &&
                Double.compare(circle.y, y)== 0 &&
                Double.compare(circle.radius, radius) == 0;
    }
}
