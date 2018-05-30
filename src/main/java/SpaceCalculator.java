public class SpaceCalculator {

    private double ageInSeconds;


    public SpaceCalculator(double ageInSeconds) {
        this.ageInSeconds = ageInSeconds;
    }

    public double ageOnEarth(){
        double result = Math.floor(ageInSeconds / 31557600);
        return result;
    }

    public double ageOnMercury(){
        double result = Math.floor(ageInSeconds / (31557600 * 0.2408467));
        return result;
    }

    public double ageOnVenus(){
        double result = Math.floor(ageInSeconds / (31557600 * 0.61519726));
        return result;
    }

    public double ageOnMars(){
        double result = Math.floor(ageInSeconds / (31557600 * 1.8808158));
        return result;
    }

    public double ageOnJupiter(){
        double result = Math.floor(ageInSeconds / (31557600 * 11.862615));
        return result;
    }
}
