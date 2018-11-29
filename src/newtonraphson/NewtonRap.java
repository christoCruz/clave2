package newtonraphson;

public class NewtonRap {
    
    //se calcula la ecuacion del newton rapshon en caso que sea diferente de 0
    public double raiz(Ifuncion f, Ifuncion df, double x,double e, int n){
        double r=Double.NaN;
        int k=0;
        while(Math.abs(f.eval(x))>e && k<n)
        {
            x=x-f.eval(x)/df.eval(x);
            k++;
        }
        if(k<n)r=x;
        return r;
        
    }
    
}
