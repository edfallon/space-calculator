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
}
