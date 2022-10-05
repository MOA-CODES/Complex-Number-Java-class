public class complex4{
    private double realPart;    private double realPartT;

    private double imaginaryPart;    private double imaginaryPartT;


    public static void main(String [] args) {
        complex4 elv1 = new complex4();
        elv1.setReal(6);elv1.setImaginary(9);

        complex4 elv2 = new complex4();
        elv2.setReal(3);elv2.setImaginary(-4);

        System.out.println(elv1.divideBy(elv2));

    }

    public void setReal( double theRealPart){
        realPart = theRealPart;

    }
    public void setImaginary(double theImaginaryPart){
        imaginaryPart = theImaginaryPart; 
    }

    public double getReal(){

        return realPart;

    }
    public double getImaginary(){
        return imaginaryPart;

    }

    public double absoluteValue(){
        return 0.0;

    }
    public String add (complex4 theComplexNumber ){
        realPartT = realPart + theComplexNumber.getReal();
        imaginaryPartT = imaginaryPart + theComplexNumber.imaginaryPart;


        return realPartT+"+"+imaginaryPartT+"i";

    }
    public String subtract (complex4 theComplexNumber ){
        realPartT = realPart - theComplexNumber.getReal();
        imaginaryPartT = imaginaryPart - theComplexNumber.imaginaryPart;


        return realPartT+"+"+imaginaryPartT+"i";
    }
    public String multiplyBy (complex4 theComplexNumber ){
        double x = realPart * theComplexNumber.realPart;//real
        double x2 = realPart * theComplexNumber.imaginaryPart;//imaginary

        double y = imaginaryPart * theComplexNumber.realPart;//imaginary 
        double y2 = imaginaryPart * theComplexNumber.imaginaryPart * (-1);//just working with i^2

        realPart = x; imaginaryPart = x2;
        theComplexNumber.realPart = y2; theComplexNumber.imaginaryPart = y; 

        return add(theComplexNumber);

    }
    public String divideBy(complex4 theComplexNumber ){
        double dimg;
        double denominator = (theComplexNumber.realPart*theComplexNumber.realPart)+
        (theComplexNumber.imaginaryPart*theComplexNumber.imaginaryPart);


        if(theComplexNumber.imaginaryPart<0.0){
            dimg = -1*(theComplexNumber.imaginaryPart);
            theComplexNumber.imaginaryPart = dimg;
        }else{
            dimg = -(theComplexNumber.imaginaryPart);
            theComplexNumber.imaginaryPart = dimg;
        }

        
        multiplyBy(theComplexNumber);
        // double nr= rr; double di = ri;

        return "("+realPartT+"+"+imaginaryPartT+"i)/"+denominator+"";
    }
    
}