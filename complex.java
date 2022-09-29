public class complex{
    //NOTE IM  WORKING WITH THE ASSUMPTION OF GREATEST POWER OF I POSSIBLE TO BE I^2
    //AND WITH THE ASSUMPTION THAT THE USER WILL NOT PROVIDE 0 FOR REAL OR IMAGINARY(CURRENTLY VALUES WILL BE CORRECT JUST WRONG PLACEMENT OF I)
    private double real;private double real2; //real number
    private double i;private double i2; //number that should be imaginary
    private String imaginary; private String imaginary2; //concatenated value of i with i
    private String result;
    private double rr; //temporary holder for result real
    private double ri;  //temporary holder for result imaginary

    public complex(double RealValue, double ImaginaryValue){
        real = RealValue;
        i = ImaginaryValue;
        imaginary = i + "i";
    }

    public double getReal() {
        return real2;
    }

    public String getImaginary(){
        return imaginary2;
    }

    public void setReal(double x){
        real2 = x;
    }

    public void setImaginary(double x){
        i2 = x;
        imaginary2 = i+"i";
    }

    public String Caddition(){
        rr=(real + real2); ri=(i+i2);
        result = ""+rr+"+"+ri+"i";
        return result;
    }

    public String Csubtraction(){
        rr=(real - real2); ri=(i - i2);
        result = ""+rr+"+"+ri+"i";
        return result;
    }

    public String Cmultiplication(){
        double x = real * real2; //real
        double x2 = real * i2; //imaginary

        double y = i * real2; //imaginary 
        double y2 = i * i2*(-1); //just working with i^2

        real=(x); i=(x2);
        real2=(y2); i2 = (y);
        return  Caddition();
    }
    public String Cdivision(){
        double dimg;
        double denominator = (real2*real2)+(i2*i2);


        if(i2<0.0){
            dimg = -1*(i2);
        }else{
            dimg = -i2;
        }

        i2 = dimg;
        Cmultiplication();
        double nr= rr; double di = ri;

        return "("+nr+"+"+di+"i)"+denominator+"";
    }

}

    