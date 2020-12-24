
package analizadorlr.Analizador;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sintactico {
    Semantico semantico;
    private List<String> pila = new ArrayList<String>();
    private Map<String, Map<String, String>> tabla = new HashMap<String, Map<String, String>>();
    private Tablas obT;
    // private int contP = 0;
    // private boolean banInt, banFloat, banChar;
    private int opcTipo;
    // private String errores;
    private Analizador analizador;
    private boolean ban;

    public Sintactico(Analizador ana) {
        obT = new Tablas();
        tabla = obT.getTable();
        //// System.out.println(tabla+"");
        pila.add(tabla.get("inicio").get("inicio"));
        //// System.out.println(pila);
        semantico = new Semantico();
        opcTipo = 0;
        ban = true;
        analizador = ana;
    }

    public String analizaS(Token t) {

        Map<String, String> tab = tabla.get(t.token);
        if (tab == null) {
            return "Error sintáctico ("+t.linea+")";
        }
        while (true) {
            System.out.println(pila);
            String sima = pila.get(pila.size() - 1);
            /*
             * if (t.token.equals("(")) contP++; if (t.token.equals(")")) contP--;
             */
            String nt = tab.get(sima);
            // System.out.print(" " + nt);
            if (nt.equalsIgnoreCase("")) {
                return "Error sintáctico ("+t.linea+")";
            }
            if (nt.startsWith("I")) {
                // ********************* COMIENZA SEMÁNTICO ******************************
                // DECLARACIONES
                // || nt.equalsIgnoreCase("I11")
                // System.out.println(nt.equalsIgnoreCase("I2")+" "+nt);
                if ((nt.trim().equalsIgnoreCase("I8") || nt.trim().equalsIgnoreCase("I18"))
                        && t.token.trim().equalsIgnoreCase("id")) {
                    String err="";
                    switch (opcTipo) {
                        case 1: // ES INT
                            err=semantico.declara(t.lexema, "int", t.linea);
                            break;
                        case 2: // ES FLOAT
                            err=semantico.declara(t.lexema, "float", t.linea);
                            break;
                        case 3: // ES CHAR
                            err=semantico.declara(t.lexema, "char", t.linea);
                            break;
                    }
                    if(err.toUpperCase().startsWith("ERROR"))
                        analizador.errores += err + "\n";
                } else if (nt.equals("I12") && t.token.equalsIgnoreCase(";")) {
                    opcTipo = 0;
                }

                // ASIGNACIONES
                else if ((nt.equalsIgnoreCase("I17") || nt.equalsIgnoreCase("I7")) && t.token.equalsIgnoreCase("id")) { // I17
                                                                                                                        // evalua
                                                                                                                        // id
                    String err = semantico.addVar(t.lexema, t.linea);
                    if (err.startsWith("Error")) {
                        analizador.errores += err + "\n";
                        ban = false;
                    }

                }

                // ********************* TERMINA SEMÁNTICO ******************************
                pila.add(t.token);
                pila.add(nt);
                return "Concuerda";
            } else if (nt.startsWith("P")) {
                //System.out.println("\n PRODUCCION " + nt);
                if (nt.equals("P0")) {
                    return "ACEPTA";
                }

                Map<String, String> pro = tabla.get("prod");
                String produce[] = pro.get(nt).split(" ");
                for (int i = produce.length - 1; i > 0; i--) {
                    String n = pila.get(pila.size() - 2);
                    if (produce[i].equalsIgnoreCase(n)) {

                        pila.remove(pila.size() - 1);
                        pila.remove(pila.size() - 1);

                    } else {
                        return "Error sintáctico *** ("+t.linea+")";
                    }

                }
                // ********************* COMIENZA SEMÁNTICO ******************************
                // DECLARACIONES
                if (nt.equalsIgnoreCase("P3")) { // P3 reduce palabra reservada "int"
                    opcTipo = 1; // Se prepara para recibir declaraciones tipo int
                } else if (nt.equalsIgnoreCase("P4")) { // P4 reduce palabra reservada "float"
                    opcTipo = 2; // Se prepara para recibir declaraciones tipo float
                } else if (nt.equalsIgnoreCase("P5")) { // p5 reduce palabra reservada "char"
                    opcTipo = 3; // Se prepara para recibir declaraciones tipo char
                } else if (nt.equalsIgnoreCase("P8")) { // P8 A -> id = E ;
                    String err = "";
                    if (ban) {
                        err = semantico.reduce("=", t.linea);
                        if (err.toUpperCase().startsWith("ERROR")) {

                            analizador.errores += err + "\n";
                            ban = false;
                        }
                    }
                } else if (nt.equalsIgnoreCase("P9")) { // P9 E -> E + T
                    String err = "";
                    if (ban) {
                        err = semantico.reduce("+", t.linea);
                        if (err.toUpperCase().startsWith("ERROR")) {

                            analizador.errores += err + "\n";
                            ban = false;
                        }
                    }
                } else if (nt.equalsIgnoreCase("P10")) { // P9 E -> E - T
                    String err = "";
                    if (ban) {
                        err = semantico.reduce("-", t.linea);
                        if (err.toUpperCase().startsWith("ERROR")) {

                            analizador.errores += err + "\n";
                            ban = false;
                        }
                    }
                } else if (nt.equalsIgnoreCase("P12")) { // P12 T -> T * F
                    String err = "";
                    if (ban) {
                        err = semantico.reduce("*", t.linea);
                        if (err.toUpperCase().startsWith("ERROR")) {

                            analizador.errores += err + "\n";
                            ban = false;
                        }
                    }
                } else if (nt.equalsIgnoreCase("P13")) { // P13 T -> T / F
                    String err = "";
                    if (ban) {
                        err = semantico.reduce("/" ,t.linea);
                        if (err.toUpperCase().startsWith("ERROR")) {

                            analizador.errores += err + "\n";
                            ban = false;
                        }
                    }
                }
                // ********************* TERMINA SEMÁNTICO ******************************
                String estadoA = pila.get(pila.size() - 1);
                Map<String, String> colN = tabla.get(produce[0]);
                String estado = colN.get(estadoA);
                if (!estado.isEmpty()) {
                    pila.add(produce[0]);
                    pila.add(estado);
                } else {
                    return "Error sintáctico ("+t.linea+")";
                }
            } else if (nt.startsWith("E")) {
                switch (nt) {
                    case "E1":
                        return "Error sintáctico ("+t.linea+"), se esperaba un tipo de dato o identificador";
                    case "E2":
                        return "Error sintáctico ("+t.linea+"), se esperaba un identificador";
                    case "E3":
                        return "Error sintáctico ("+t.linea+"), para separar identificadores se necesita la coma";
                    case "E4":
                        return "Error sintáctico ("+t.linea+"), se esperaba un identificador";
                    case "E5":
                        return "Error sintáctico ("+t.linea+"), falta punto y coma";
                    case "E6":
                        return "Error sintáctico ("+t.linea+"), se esperaba una asignación (Falta un igual)";
                    case "E7":
                        return "Error sintáctico ("+t.linea+"), se esperaba un operador";
                    case "E8":
                        return "Error sintáctico ("+t.linea+"), falta cerrar paréntesis";
                    case "E9":
                        return "Error sintáctico ("+t.linea+"), paréntesis derecho desequilibrado";
                    case "E10":
                        return "Error sintáctico ("+t.linea+"), es obligatoria una asignación";
                    case "E11":
                        return "Error sintáctico ("+t.linea+"), las declaraciones van al inicio y solo puede haber una asignación";
                    default:
                        return "Error sintáctico desconocido ("+t.linea+")";

                }
            }

        }
    }
}
