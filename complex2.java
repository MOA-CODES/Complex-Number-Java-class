public class complex2 {
    //NOTE IM JUST WORKING WITH INT AND THE ASSUMPTION OF GREATEST POWER OF I POSSIBLE TO BE I^2
    private int real; private int i;
    private String imaginary; private String result;

    public int getReal() {
        return real;
    }

    public  String getImaginary(){
        return imaginary;
    }

    public void setReal(int x){
        real = x;
    }

    public void setImaginary(int x){
        i = x;
        imaginary = i+"i";
    }

    public String Caddition(int r, int img){
        result = ""+(real + r)+"+"+(i+img)+"i";
        return result;
    }

    public String Csubtraction(int r, int img){
        result = ""+(real - r)+"+"+(i-img)+"i";
        return result;
    }

    public String Cmultiplication(int r, int img){
        int x = real * r; //real
        int x2 = real * img; //imaginary

        int y = i * r; //imaginary 
        int y2 = i * img*(-1); //just working with i^2

        setReal(x); setImaginary(x2);

        return  Caddition(y2, y);
    }

    public String Cdivision(int r, int img){

        return "not implemented yet";
    }
}
