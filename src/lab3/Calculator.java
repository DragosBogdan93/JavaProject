package lab3;

public class Calculator {
    private int distance;
    private int hr;
    private int min;
    private int sec;

    public int getDistance() {
        return distance;
    }
    public void setDistance(int distance) {
        this.distance = distance;
    }
    public int getHr () {
        return hr;
    }
    public void  setHr(int hr) {
        this.hr = hr;
    }
    public int getMin() {
        return min;
    }
    public void setMin(int min) {
        this.min = min;
    }
    public int getSec() {
        return sec;
    }
    public void setSec(int sec) {
        this.sec = sec;
    }

    public int sum(int first, int second) {
        int sum = first + second;
        return sum;
    }
    public int substract(int first, int second) {
        int substract = first - second;
        return substract;
    }
    public int multiplication(int first, int second) {
        int multiplication = first * second;
        return multiplication;
    }
    public float multiplication1(float first, float second) {
        float multiplication1 = first * second;
        return multiplication1;
    }
    public float division(float first, float second) {
        float division = first / second;
        return division;
    }
    public int mod(int first, int second) {
        int mod = first % second;
        return mod;
    }
    public float equation(float first, float second, float third) {
        float equation = first + second - third;
        return equation;
    }
    public int equation1(int first, int second, int third) {
        int equation1 = first + second + third;
        return equation1;
    }
    public float gradeFahrenheit(int first) {
        int gradeFahrenheit = substract(first, 32);
        return multiplication1(division(5, 9), gradeFahrenheit);
    }
    public float distanceInch(float first) {
        float distanceInch = first;
        float paraMeter = (float) 39.370;
        float distanceMeter = division(distanceInch, paraMeter);
        return distanceMeter;
    }
    public float mps() {
        float timeSeconds = (multiplication1(hr, 3600) + multiplication1(min, 60) + sec);
        float mps = division(distance, timeSeconds);
        return mps;
    }
    public float kph() {
        float timeSeconds = (multiplication1(hr, 3600) + multiplication1(min, 60) + sec);
        float kph = division(division(distance, 1000.0f), division(timeSeconds, 3600.0f));
        return kph;
    }
    public float mph() {
        float timeSeconds = (multiplication1(hr, 3600) + multiplication1(min, 60) + sec);
        float kph = division(division(distance, 1000.0f), division(timeSeconds, 3600.0f));
        float mph = division(kph, 1.609f);
        return mph;
    }
}
