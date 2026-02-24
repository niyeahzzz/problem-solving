import java.util.function.bifunction;
public class lastdigitsum{
    public static void main(string[] args){
        bifunction<integer,integer,integer>sumlastdigits=
        (a,b) ->(a%10)+(b%10);
        System.out.println("sum of digits:" + sumlastdigit.apply(123,456))
        
    }
}

