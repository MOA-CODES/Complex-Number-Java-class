public class complex3 {
    //NOTE IM  WORKING WITH THE ASSUMPTION OF GREATEST POWER OF I POSSIBLE TO BE I^2
    //AND WITH THE ASSUMPTION THAT THE USER WILL NOT PROVIDE 0 FOR REAL OR IMAGINARY(CURRENTLY VALUES WILL BE CORRECT JUST WRONG PLACEMENT OF I)
    private double real; //real number
    private double i; //number that should be imaginary
    private String imaginary; //concatenated value of i with i
    private String result;
    private double rr; //temporary holder for result real
    private double ri;  //temporary holder for result imaginary

    public double getReal() {
        return real;
    }

    public String getImaginary(){
        return imaginary;
    }

    public void setReal(double x){
        real = x;
    }

    public void setImaginary(double x){
        i = x;
        imaginary = i+"i";
    }

    public String Caddition(double r, double img){
        rr=(real + r); ri=(i+img);
        result = ""+rr+"+"+ri+"i";
        return result;
    }

    public String Csubtraction(double r, double img){
        rr=(real - r); ri=(i - img);
        result = ""+rr+"+"+ri+"i";
        return result;
    }

    public String Cmultiplication(double r, double img){
        double x = real * r; //real
        double x2 = real * img; //imaginary

        double y = i * r; //imaginary 
        double y2 = i * img*(-1); //just working with i^2

        setReal(x); setImaginary(x2);

        return  Caddition(y2, y);
    }

    public String Cdivision(double r, double img){
        double dimg;
        if(img<0.0){
            dimg = -1*(img);
        }else{
            dimg = -img;
        }

       Cmultiplication(r, dimg);
       double nr= rr; double di = ri;

       double denominator = (r*r)+(img*img);

        return "("+nr+"+"+di+"i)"+denominator+"";
    }
    
}
