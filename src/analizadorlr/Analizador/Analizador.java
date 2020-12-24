
package analizadorlr.Analizador;

import java.util.*;

import javax.swing.JOptionPane;

import analizadorlr.Home;
import analizadorlr.Resultados;

public class Analizador {
   
    String errores;
    Resultados resultados;
    Home home;

    public Analizador(Home h){
        home=h;
    }

    public void Analiza(String cad) {
       errores="";
        for (int i = 0; i < 100; i++) {
            System.out.println(" ");
        }
        Lexico lx = new Lexico(cad, this);
        Sintactico st = new Sintactico(this);
        boolean ban = true;
        while (ban) {
            Token token = lx.getToken();
            if (token != null) {
                String res = st.analizaS(token);
                if(res.toUpperCase().startsWith("ERROR"))
                   errores+=res+"\n";
                //System.out.println(token.token+" "+res);
                if (token.token.equals("$") || res.toUpperCase().startsWith("ERROR"))
                    ban = false;
            }
        }
        System.out.println(errores);
        if(!errores.isEmpty())
           resultados = new Resultados(errores,home);
        else
           JOptionPane.showMessageDialog(null , "Cadena válida");
    }
}
