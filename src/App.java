import java.util.Vector;
import java.util.function.Function;

public class App {

    public static void main(String[] args) throws Exception {

        int x=2;
        int[] numeros = new int[11];
        Vector result = new Vector();

        for(int i=0;i<numeros.length;i++){
            result.add(i*x);
        }

        System.out.println("Tabela de multiplicação de"+ " "+x);
        System.out.println(result);
    }
}