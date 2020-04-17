package frc.libs.math;

public class UnitConversions {
    public static double rpmToRadsPerSec(double rpm) {
        return rpm * 2.0 * Math.PI / 60.0;
    }

    public static double radsPerSecToRpm(double radsPerSec) {
        return radsPerSec * 60.0 / (2.0 * Math.PI);
    }

    public static double inchesToMetres(double inches) {
        return inches * 0.0254;
    }

    public static double metresToInches(double meters) {
        return meters / 0.0254;
    }

    public static double feetToMetres(double feet) {
        return inchesToMetres(feet * 12.0);
    }

    public static double metresToFeet(double meters) {
        return metresToInches(meters) / 12.0;
    }

    public static double degreesToRadians(double degrees) {
        return Math.toRadians(degrees);
    }

    public static double radiansToDegrees(double radians) {
        return Math.toDegrees(radians);
    }
}