
package analizadorlr.Analizador;

import java.util.*;

public class Lexico {

    private List<Token> tokens = new ArrayList<Token>();
    private String prog = "";

    private int ind;

    private List<String> reservadas = new ArrayList<String>();
    // private final
    Analizador analizad;

    public Lexico(String programa, Analizador ana) {
        prog = programa;
        ind = 0;
        Listas();
        analizad = ana;
    }

    private String entra(char car) {
        String entra = "";
        if (car > 96 && car < 123)// a-z
            entra = "a";
        else if (car == 61)// operador igual
            entra = "b";
        else if (car == 44)// operador coma
            entra = "c";
        else if (car == 59)// operador punto y coma
            entra = "d";
        else if (car == 43)// operador más
            entra = "e";
        else if (car == 45)// operador menos
            entra = "f";
        else if (car == 42)// operador asterisco
            entra = "g";
        else if (car == 47)// operador cociente
            entra = "h";
        else if (car == 40)// operador abre paréntesis
            entra = "i";
        else if (car == 41)// operador cierra paréntesis
            entra = "j";
        else if (car == 36)// signo de pesos
            entra = "k";
        else if (car == 32)// espacio
            entra = "l";
        else if (car == 10)// salto
            entra = "m";
        else
            entra = "n";
        return entra;
    }

    public Token getToken() {
        int ini = ind;
        int fin = ind;
        int estado = 0;
        String token = "";
        Automata auto = new Automata();
        for (int i = ini; true; i++) {
            fin++;
            char car;
            String entra = "";
            if (i < prog.length()) {
                car = prog.charAt(i);
                entra = entra(car);
            } else {
                entra = "k";
                car = ' ';
            }
            //// System.out.println("Caracter: "+car);

            estado = auto.tablaT.get(entra)[estado];
            if (estado == -1) {
                // System.out.println("Error léxico carácter no válido: "+car);
                analizad.errores+="Error léxico (" + lineas(fin)+"), carácter no válido: \""+car+"\" \n";
                ind = fin+1;
                return null;
            }
            if (estado == 0)
                ini++;
            token = auto.acepta.get(estado);
            if (token != null) {
                String lex = "";
                switch (token) {
                    case "completo":
                        ind = fin;
                        lex = prog.substring(ini, fin);
                        return new Token(lex, lex, lineas(fin));
                    default:
                        ind = fin - 1;
                        lex = prog.substring(ini, fin - 1);
                        if (token.equals("id")) {
                            if (reservadas.contains(lex))
                                return new Token(lex, lex, lineas(fin - 1));
                        }

                        return new Token(token, lex, lineas(fin - 1));
                }

            }

            /*
             * acepta.put(100, "completo");// operadores y puntuación acepta.put(101,
             * "id");// id acepta.put(200, "$");// fin
             */
        }

    }

    private void Listas() {

        reservadas.add("int");
        reservadas.add("float");
        reservadas.add("char");

    }

    private int lineas(int fin) {
        int count = 1;
        for (int i = 0; i < fin - 1 && i < prog.length(); i++) {
            if (prog.charAt(i) == 10) {
                count++;

            }
        }
        return count;
    }

    public List<Token> getListaTokens() {
        return tokens;
    }

}

class Token {
    String token;
    String lexema;
    int linea;

    public Token(String token, String lexema, int linea) {
        this.token = token;
        this.lexema = lexema;
        this.linea = linea;
    }

    public String toString() {
        return token;
    }
}

class Automata {
    Map<String, int[]> tablaT = new HashMap<String, int[]>();
    Map<Integer, String> acepta = new HashMap<Integer, String>();
    // Map<Integer, String> error = new HashMap<Integer, String>();

    public Automata() {

        tablaT.put("a", new int[] { 1, 1 });
        tablaT.put("b", new int[] { 100, 101 });
        tablaT.put("c", new int[] { 100, 101 });
        tablaT.put("d", new int[] { 100, 101 });
        tablaT.put("e", new int[] { 100, 101 });
        tablaT.put("f", new int[] { 100, 101 });
        tablaT.put("g", new int[] { 100, 101 });
        tablaT.put("h", new int[] { 100, 101 });
        tablaT.put("i", new int[] { 100, 101 });
        tablaT.put("j", new int[] { 100, 101 });
        tablaT.put("k", new int[] { 200, 101 });
        tablaT.put("l", new int[] { 0, 101 });
        tablaT.put("m", new int[] { 0, 101 });
        tablaT.put("n", new int[] { -1, 101 });

        acepta.put(100, "completo");// operadores y puntuación
        acepta.put(101, "id");// id
        acepta.put(200, "$");// fin
    }

}
