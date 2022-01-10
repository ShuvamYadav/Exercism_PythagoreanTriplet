import java.util.*;

class PythagoreanTriplet {
    static ArrayList<PythagoreanTriplet> result;
    int a,b,c;
    static int factors;
    PythagoreanTriplet(int a, int b, int c) {
        this.a = a;
        this.b= b;
        this.c= c;
    }
    PythagoreanTriplet(){
        result= new ArrayList<PythagoreanTriplet>();
    }
    static PythagoreanTriplet makeTripletsList(){
        return new PythagoreanTriplet();
    }
    public PythagoreanTriplet withFactorsLessThanOrEqualTo(int num){
        factors=num;
        return this;
    }
    public PythagoreanTriplet thatSumTo(int sum) {
        for (int i = 1; i <= sum; i++) {
            for (int j = i + 1; j <= sum - i; j++) {
                int k = sum - i - j;
                if (i+j+k == sum && (k*k == (i*i)+(j*j))) {
                    result.add(new PythagoreanTriplet(i,j,k));
                }
            }
        }
        return this;
    }
    public List<PythagoreanTriplet> build(){
        return result;
    }
    @Override
    public boolean equals(Object o) {
        PythagoreanTriplet ob= (PythagoreanTriplet) o;
        if(this.a==ob.a&&this.b==ob.b&&this.c==ob.c)
            return true;
        return false;
    }
}