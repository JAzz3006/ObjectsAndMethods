public class Arithmetic {
    private float a1;
    private float a2;

    public Arithmetic(){}

    public Arithmetic (float a1, float a2){
      //  this();
        this.a1 = a1;
        this.a2 = a2;
    }

    public float getSum(){
        return a1 + a2;
    }

    public float getDiff(){
        return a1 - a2;
    }

    public float getMult(){
        return a1 * a2;
    }

    public float getDiv(){
        if (a2 == 0){
            System.out.println("Zero division! No result");
            return 0;
        };

        return a1 / a2;
    }

    public float getA1() {
        return a1;
    }

    public void setA1(float a1) {
        this.a1 = a1;
    }

    public float getA2() {
        return a2;
    }

    public void setA2(int a2) {
        this.a2 = a2;
    }
}
