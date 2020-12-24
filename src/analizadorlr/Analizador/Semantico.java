package analizadorlr.Analizador;

import java.util.*;

public class Semantico {
    private List<String> pila = new ArrayList<String>();
    TablaDeSim tabla = new TablaDeSim();

    public Semantico() {
        LlenaReglas();
    }

    private Map<String, Map<String, String>> reglas = new HashMap<String, Map<String, String>>();

    public String reduce(String oper,int linea) {
        System.out.println("PILA SEMANTICA: " + pila);
        Map<String, String> regOp = reglas.get(oper);
        if (regOp != null) {
            // Penúltimo oper Último
            String ult = pila.get(pila.size() - 1);
            String pen = pila.get(pila.size() - 2);
            String res = regOp.get(pen + " " + ult);
            if (!res.isEmpty()) {
                pila.remove(pila.size() - 1);
                pila.remove(pila.size() - 1);
                pila.add(res);
                return "";
            }
            return "Error semántico ("+linea+"), tipos de datos no compatibles (" + pen + oper + ult + ")";
        }
        return "Error semántico ("+linea+"), operación incorrecta";
    }

    public String declara(String id, String tipo, int linea) {
        boolean add = tabla.addSimbolo(id, tipo, null, linea);
        if (add)
            return "";
        return "Error semántico ("+linea+"), ya hay una variable declarada como \"" + id+"\"";
    }

    public String addVar(String id,int linea) {
        String tipo = tabla.getTipo(id);
        if (!tipo.isEmpty()) {
            pila.add(tipo);
            return "";
        }
        return "Error semántico ("+linea+"), la variable \"" + id + "\" no fue declarada";
    }

    private void LlenaReglas() {
        Map<String, String> asigna = new HashMap<String, String>();
        asigna.put("int int", "int");
        asigna.put("int float", "");
        asigna.put("int char", "");
        asigna.put("float int", "float");
        asigna.put("float float", "float");
        asigna.put("float char", "");
        asigna.put("char int", "");
        asigna.put("char float", "");
        asigna.put("char char", "char");
        reglas.put("=", asigna);

        Map<String, String> div_mul = new HashMap<String, String>();
        div_mul.put("int int", "int");
        div_mul.put("int float", "float");
        div_mul.put("int char", "");
        div_mul.put("float int", "float");
        div_mul.put("float float", "float");
        div_mul.put("float char", "");
        div_mul.put("char int", "");
        div_mul.put("char float", "");
        div_mul.put("char char", "");
        reglas.put("/", div_mul);
        reglas.put("*", div_mul);

        Map<String, String> sum_res = new HashMap<String, String>();
        sum_res.put("int int", "int");
        sum_res.put("int float", "float");
        sum_res.put("int char", "");
        sum_res.put("float int", "float");
        sum_res.put("float float", "float");
        sum_res.put("float char", "");
        sum_res.put("char int", "");
        sum_res.put("char float", "");
        sum_res.put("char char", "");
        reglas.put("+", sum_res);
        reglas.put("-", sum_res);

    }

}
