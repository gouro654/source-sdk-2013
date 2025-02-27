public class Turtle { // Class name should start with an uppercase letter

    private double x, y;
    private double angle;

    // Constructor should have a closing parenthesis and initialize variables correctly
    public Turtle(double x0, double y0, double a0) {
        x = x0; // Initialize x with x0
        y = y0; // Initialize y with y0
        angle = a0; // Initialize angle with a0
    }

    // Method name should be 'void' instead of 'avoid'
    public void turnLeft(double delta) {
        angle += delta;
    }

    // Corrected method name and parameter name
    public void goForward(double step) {
        // Compute new position; move and draw a line to it.
        double oldX = x, oldY = y; // Corrected variable names
        x += step * Math.cos(Math.toRadians(angle)); // Corrected parentheses
        y += step * Math.sin(Math.toRadians(angle)); // Corrected parentheses
        StdDraw.line(oldX, oldY, x, y); // Corrected parentheses
    }

    public static void main(String[] args) {
        // Draw a regular polygon with n sides.
        int n = Integer.parseInt(args[0]);
        double angle = 360.0 / n;
        double step = Math.sin(Math.toRadians(angle / 2)); // Corrected parentheses
        Turtle turtle = new Turtle(0.5, 0.0, angle / 2); // Corrected parentheses
        for (int i = 0; i < n; i++) {
            turtle.goForward(step); // Corrected method name and parentheses
            turtle.turnLeft(angle);
        }
    }
}
