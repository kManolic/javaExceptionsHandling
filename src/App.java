import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Exception.ZbrojManjiOdDesetException;

public class App {
    // Throws potiskuje greške, tj on ga ne obrađuje
    public static void main(String[] args) throws IOException 
    {
        int i, j, k;
        int [] a = new int [4];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        i = 4;
        j = 2;
        
        try 
        {
            j = Integer.parseInt(br.readLine()); // checked exception
            k = i+j;
            if (k < 10)
            {
                throw new ZbrojManjiOdDesetException("Zbroj brojeva mora biti minimalno 10"); // throw nam služi za explicitno bacanje exceptiona sto nam jos može služiti da imamo svoje custom exceptione
            }
            k = i/j;
            System.out.println(k);  // unchecked exception
            for (int b = 0; b < a.length;b++) // unchecked error
            {
                a[b] = b +1;
            }
            br.close();
        }
        catch (IOException exception)
        {
            System.out.println("IO greška");
        } 
        catch (ArithmeticException ae) // runtime exception
        {
            System.out.println("Dijeljenje sa nulom nije dozvoljeno");
        }
        catch (IndexOutOfBoundsException ie) // greška ako je index polja van granica npr u for(int b = 0; b <= a.length;b++) 
        {
            System.out.println("Index je veći od dozvoljenog");
        }
        catch (Exception e) // default exception koji može handlati sve exceptionse jer je to klasa od koje naljeđuju svi exceptionsi
        {
            System.out.println("Ups! Došlo je do pogreške");
        }
        // finally blok se izvršava svai put na kraju try catch-a
        finally 
        {   
            br.close();
            System.out.println("Ov je ispis na kraju svega");
        }
        

        
        
    }
}
