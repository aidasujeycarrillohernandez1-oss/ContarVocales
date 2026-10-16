/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contarvocales;

/**
 *
 * @author aidas
 */
public class ContarVocales 
{
    public int ContarVocales (String texto)
    {
        //Validacion de nulos
        if(texto==null)
        {
            return 0;
        }
        if(texto.isEmpty())
        {
            return 0;
        }
        return ContarVocalesAuxiliar(texto,0);
    }
    //Metodo privado recursivo
    private int ContarVocalesAuxiliar(String s ,int indice)
    {
        //caso base:llegamos al final de la cadena
        if(indice>= s.length())
        {
            return 0;
        }
        //verificacion si es vocal
        char c = s.charAt(indice);
        int esVocal = 0;
         if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' ||c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') 
         {
             esVocal = 1;
         }
         // recursivo: lo actual + lo que venga del resto
        return esVocal + ContarVocalesAuxiliar(s, indice + 1);
    }
    public static void main(String[] args) {
        
    }
}

       
    

