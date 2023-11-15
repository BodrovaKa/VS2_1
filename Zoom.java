package plotter1;

public class Zoom {
    private double xRange;
    private double yRange;

    public Zoom(double xMin, double xMax, double yMin, double yMax) {
        this.xRange = xMax - xMin;
        this.yRange = yMax - yMin;
    }

    public void zoomIn() {
        double zoomFactor = 2.0;
        xRange /= zoomFactor;
        yRange /= zoomFactor;
    }

    public void zoomOut() {
        double zoomFactor = 2.0;
        xRange *= zoomFactor;
        yRange *= zoomFactor;
    }

    public double getXRange() {
        return xRange;
    }

    public double getYRange() {
        return yRange;
    }
}
