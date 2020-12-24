
package analizadorlr.Analizador;

import java.util.HashMap;
import java.util.Map;

public class Tablas {
    private Map<String, Map<String, String>> tabla = new HashMap<String, Map<String, String>>();
    private Map<String, String> errores = new HashMap<String, String>();

    public String getError(String s) {
        return errores.get(s);
    }

    public Map<String, Map<String, String>> getTable() {
        errores.clear();
        tabla.clear();
        /*  BASE PARA ELEMENTO DE TABLA
        Map<String, String> id = new HashMap<String, String>();
        id.put("I0", "");
        id.put("I1", "");
        id.put("I2", "");
        id.put("I3", "");
        id.put("I4", "");
        id.put("I5", "");
        id.put("I6", "");
        id.put("I7", "");
        id.put("I8", "");
        id.put("I9", "");
        id.put("I10", "");
        id.put("I11", "");
        id.put("I12", "");
        id.put("I13", "");
        id.put("I14", "");
        id.put("I15", "");
        id.put("I16", "");
        id.put("I17", "");
        id.put("I18", "");
        id.put("I19", "");
        id.put("I20", "");
        id.put("I21", "");
        id.put("I22", "");
        id.put("I23", "");
        id.put("I24", "");
        id.put("I25", "");
        id.put("I26", "");
        id.put("I27", "");
        id.put("I28", "");
        id.put("I29", "");
        id.put("I30", "");
        id.put("I31", "");
        tabla.put("id", id);
        */

        Map<String, String> id = new HashMap<String, String>();
        id.put("I0", "I7");
        id.put("I1", "");
        id.put("I2", "I8");
        id.put("I3", "");
        id.put("I4", "P3");
        id.put("I5", "P4");
        id.put("I6", "P5");
        id.put("I7", "E6");
        id.put("I8", "E3");
        id.put("I9", "I17");
        id.put("I10", "");
        id.put("I11", "I18");
        id.put("I12", "I7");
        id.put("I13", "");
        id.put("I14", "");
        id.put("I15", "");
        id.put("I16", "I17");
        id.put("I17", "E7");
        id.put("I18", "E3");
        id.put("I19", "");
        id.put("I20", "E11");
        id.put("I21", "I17");
        id.put("I22", "I17");
        id.put("I23", "I17");
        id.put("I24", "I17");
        id.put("I25", "");
        id.put("I26", "");
        id.put("I27", "");
        id.put("I28", "");
        id.put("I29", "");
        id.put("I30", "");
        id.put("I31", "");
        tabla.put("id", id);


        Map<String, String> pint = new HashMap<String, String>();
        pint.put("I0", "I4");
        pint.put("I1", "");
        pint.put("I2", "");
        pint.put("I3", "");
        pint.put("I4", "");
        pint.put("I5", "E2");
        pint.put("I6", "E2");
        pint.put("I7", "E6");
        pint.put("I8", "E5");
        pint.put("I9", "E2");
        pint.put("I10", "");
        pint.put("I11", "E4");
        pint.put("I12", "I4");
        pint.put("I13", "");
        pint.put("I14", "");
        pint.put("I15", "");
        pint.put("I16", "");
        pint.put("I17", "E5");
        pint.put("I18", "E5");
        pint.put("I19", "");
        pint.put("I20", "E11");
        pint.put("I21", "E2");
        pint.put("I22", "E2");
        pint.put("I23", "E2");
        pint.put("I24", "E2");
        pint.put("I25", "");
        pint.put("I26", "");
        pint.put("I27", "");
        pint.put("I28", "");
        pint.put("I29", "");
        pint.put("I30", "");
        pint.put("I31", "");
        tabla.put("int", pint);


        Map<String, String> pfloat = new HashMap<String, String>();
        pfloat.put("I0", "I5");
        pfloat.put("I1", "");
        pfloat.put("I2", "");
        pfloat.put("I3", "");
        pfloat.put("I4", "");
        pfloat.put("I5", "E2");
        pfloat.put("I6", "E2");
        pfloat.put("I7", "E6");
        pfloat.put("I8", "E5");
        pfloat.put("I9", "E2");
        pfloat.put("I10", "");
        pfloat.put("I11", "E4");
        pfloat.put("I12", "I5");
        pfloat.put("I13", "");
        pfloat.put("I14", "");
        pfloat.put("I15", "");
        pfloat.put("I16", "");
        pfloat.put("I17", "E5");
        pfloat.put("I18", "E5");
        pfloat.put("I19", "");
        pfloat.put("I20", "E11");
        pfloat.put("I21", "E2");
        pfloat.put("I22", "E2");
        pfloat.put("I23", "E2");
        pfloat.put("I24", "E2");
        pfloat.put("I25", "");
        pfloat.put("I26", "");
        pfloat.put("I27", "");
        pfloat.put("I28", "");
        pfloat.put("I29", "");
        pfloat.put("I30", "");
        pfloat.put("I31", "");
        tabla.put("float", pfloat);


        Map<String, String> pchar = new HashMap<String, String>();
        pchar.put("I0", "I6");
        pchar.put("I1", "");
        pchar.put("I2", "");
        pchar.put("I3", "");
        pchar.put("I4", "");
        pchar.put("I5", "E2");
        pchar.put("I6", "E2");
        pchar.put("I7", "E6");
        pchar.put("I8", "E5");
        pchar.put("I9", "E2");
        pchar.put("I10", "");
        pchar.put("I11", "E4");
        pchar.put("I12", "I6");
        pchar.put("I13", "");
        pchar.put("I14", "");
        pchar.put("I15", "");
        pchar.put("I16", "");
        pchar.put("I17", "E5");
        pchar.put("I18", "E5");
        pchar.put("I19", "");
        pchar.put("I20", "E11");
        pchar.put("I21", "E2");
        pchar.put("I22", "E2");
        pchar.put("I23", "E2");
        pchar.put("I24", "E2");
        pchar.put("I25", "");
        pchar.put("I26", "");
        pchar.put("I27", "");
        pchar.put("I28", "");
        pchar.put("I29", "");
        pchar.put("I30", "");
        pchar.put("I31", "");
        tabla.put("char", pchar);


        Map<String, String> igual = new HashMap<String, String>();
        igual.put("I0", "E1");
        igual.put("I1", "");
        igual.put("I2", "");
        igual.put("I3", "");
        igual.put("I4", "E2");
        igual.put("I5", "E2");
        igual.put("I6", "E2");
        igual.put("I7", "I9");
        igual.put("I8", "E5");
        igual.put("I9", "");
        igual.put("I10", "");
        igual.put("I11", "E4");
        igual.put("I12", "");
        igual.put("I13", "");
        igual.put("I14", "");
        igual.put("I15", "");
        igual.put("I16", "");
        igual.put("I17", "E5");
        igual.put("I18", "E5");
        igual.put("I19", "");
        igual.put("I20", "");
        igual.put("I21", "E2");
        igual.put("I22", "E2");
        igual.put("I23", "E2");
        igual.put("I24", "E2");
        igual.put("I25", "");
        igual.put("I26", "");
        igual.put("I27", "");
        igual.put("I28", "");
        igual.put("I29", "");
        igual.put("I30", "");
        igual.put("I31", "");
        tabla.put("=", igual);


        Map<String, String> coma = new HashMap<String, String>();
        coma.put("I0", "E1");
        coma.put("I1", "");
        coma.put("I2", "");
        coma.put("I3", "");
        coma.put("I4", "E2");
        coma.put("I5", "E2");
        coma.put("I6", "E2");
        coma.put("I7", "E6");
        coma.put("I8", "I11");
        coma.put("I9", "E2");
        coma.put("I10", "");
        coma.put("I11", "E4");
        coma.put("I12", "");
        coma.put("I13", "");
        coma.put("I14", "");
        coma.put("I15", "");
        coma.put("I16", "");
        coma.put("I17", "E5");
        coma.put("I18", "I11");
        coma.put("I19", "");
        coma.put("I20", "");
        coma.put("I21", "E2");
        coma.put("I22", "E2");
        coma.put("I23", "E2");
        coma.put("I24", "E2");
        coma.put("I25", "");
        coma.put("I26", "");
        coma.put("I27", "");
        coma.put("I28", "");
        coma.put("I29", "");
        coma.put("I30", "");
        coma.put("I31", "");
        tabla.put(",", coma);


        Map<String, String> punyco = new HashMap<String, String>();
        punyco.put("I0", "E1");
        punyco.put("I1", "");
        punyco.put("I2", "");
        punyco.put("I3", "");
        punyco.put("I4", "E2");
        punyco.put("I5", "E2");
        punyco.put("I6", "E2");
        punyco.put("I7", "E6");
        punyco.put("I8", "I12");
        punyco.put("I9", "E2");
        punyco.put("I10", "");
        punyco.put("I11", "E4");
        punyco.put("I12", "");
        punyco.put("I13", "I20");
        punyco.put("I14", "P11");
        punyco.put("I15", "P14");
        punyco.put("I16", "");
        punyco.put("I17", "P16");
        punyco.put("I18", "I12");
        punyco.put("I19", "");
        punyco.put("I20", "");
        punyco.put("I21", "E2");
        punyco.put("I22", "E2");
        punyco.put("I23", "E2");
        punyco.put("I24", "E2");
        punyco.put("I25", "E8");
        punyco.put("I26", "");
        punyco.put("I27", "P9");
        punyco.put("I28", "P10");
        punyco.put("I29", "P12");
        punyco.put("I30", "P13");
        punyco.put("I31", "P15");
        tabla.put(";", punyco);


        Map<String, String> mas = new HashMap<String, String>();
        mas.put("I0", "E1");
        mas.put("I1", "");
        mas.put("I2", "");
        mas.put("I3", "");
        mas.put("I4", "E2");
        mas.put("I5", "E2");
        mas.put("I6", "E2");
        mas.put("I7", "E6");
        mas.put("I8", "E5");
        mas.put("I9", "E2");
        mas.put("I10", "");
        mas.put("I11", "E4");
        mas.put("I12", "");
        mas.put("I13", "I21");
        mas.put("I14", "P11");
        mas.put("I15", "P14");
        mas.put("I16", "");
        mas.put("I17", "P16");
        mas.put("I18", "E5");
        mas.put("I19", "");
        mas.put("I20", "");
        mas.put("I21", "E2");
        mas.put("I22", "E2");
        mas.put("I23", "E2");
        mas.put("I24", "E2");
        mas.put("I25", "I21");
        mas.put("I26", "");
        mas.put("I27", "P9");
        mas.put("I28", "P10");
        mas.put("I29", "P12");
        mas.put("I30", "P13");
        mas.put("I31", "P15");
        tabla.put("+", mas);


        Map<String, String> menos = new HashMap<String, String>();
        menos.put("I0", "E1");
        menos.put("I1", "");
        menos.put("I2", "");
        menos.put("I3", "");
        menos.put("I4", "E2");
        menos.put("I5", "E2");
        menos.put("I6", "E2");
        menos.put("I7", "E6");
        menos.put("I8", "E5");
        menos.put("I9", "E2");
        menos.put("I10", "");
        menos.put("I11", "E4");
        menos.put("I12", "");
        menos.put("I13", "I22");
        menos.put("I14", "P11");
        menos.put("I15", "P14");
        menos.put("I16", "");
        menos.put("I17", "P16");
        menos.put("I18", "E5");
        menos.put("I19", "");
        menos.put("I20", "");
        menos.put("I21", "E2");
        menos.put("I22", "E2");
        menos.put("I23", "E2");
        menos.put("I24", "E2");
        menos.put("I25", "I22");
        menos.put("I26", "");
        menos.put("I27", "P9");
        menos.put("I28", "P10");
        menos.put("I29", "P12");
        menos.put("I30", "P13");
        menos.put("I31", "P15");
        tabla.put("-", menos);


        Map<String, String> por = new HashMap<String, String>();
        por.put("I0", "E1");
        por.put("I1", "");
        por.put("I2", "");
        por.put("I3", "");
        por.put("I4", "E2");
        por.put("I5", "E2");
        por.put("I6", "E2");
        por.put("I7", "E6");
        por.put("I8", "E5");
        por.put("I9", "E2");
        por.put("I10", "");
        por.put("I11", "E4");
        por.put("I12", "");
        por.put("I13", "");
        por.put("I14", "I23");
        por.put("I15", "P14");
        por.put("I16", "");
        por.put("I17", "P16");
        por.put("I18", "E5");
        por.put("I19", "");
        por.put("I20", "");
        por.put("I21", "E2");
        por.put("I22", "E2");
        por.put("I23", "E2");
        por.put("I24", "E2");
        por.put("I25", "");
        por.put("I26", "");
        por.put("I27", "I23");
        por.put("I28", "I23");
        por.put("I29", "P12");
        por.put("I30", "P13");
        por.put("I31", "P15");
        tabla.put("*", por);


        Map<String, String> entre = new HashMap<String, String>();
        entre.put("I0", "E1");
        entre.put("I1", "");
        entre.put("I2", "");
        entre.put("I3", "");
        entre.put("I4", "E2");
        entre.put("I5", "E2");
        entre.put("I6", "E2");
        entre.put("I7", "E6");
        entre.put("I8", "E5");
        entre.put("I9", "E2");
        entre.put("I10", "");
        entre.put("I11", "E4");
        entre.put("I12", "");
        entre.put("I13", "");
        entre.put("I14", "I24");
        entre.put("I15", "P14");
        entre.put("I16", "");
        entre.put("I17", "P16");
        entre.put("I18", "E5");
        entre.put("I19", "");
        entre.put("I20", "");
        entre.put("I21", "E2");
        entre.put("I22", "E2");
        entre.put("I23", "E2");
        entre.put("I24", "E2");
        entre.put("I25", "");
        entre.put("I26", "");
        entre.put("I27", "I24");
        entre.put("I28", "I24");
        entre.put("I29", "P12");
        entre.put("I30", "P13");
        entre.put("I31", "P15");
        tabla.put("/", entre);


        Map<String, String> parabr = new HashMap<String, String>();
        parabr.put("I0", "E1");
        parabr.put("I1", "");
        parabr.put("I2", "");
        parabr.put("I3", "");
        parabr.put("I4", "E2");
        parabr.put("I5", "E2");
        parabr.put("I6", "E2");
        parabr.put("I7", "E6");
        parabr.put("I8", "E5");
        parabr.put("I9", "I16");
        parabr.put("I10", "");
        parabr.put("I11", "E4");
        parabr.put("I12", "");
        parabr.put("I13", "");
        parabr.put("I14", "");
        parabr.put("I15", "");
        parabr.put("I16", "I16");
        parabr.put("I17", "E7");
        parabr.put("I18", "E5");
        parabr.put("I19", "");
        parabr.put("I20", "");
        parabr.put("I21", "I16");
        parabr.put("I22", "I16");
        parabr.put("I23", "I16");
        parabr.put("I24", "I16");
        parabr.put("I25", "");
        parabr.put("I26", "");
        parabr.put("I27", "");
        parabr.put("I28", "");
        parabr.put("I29", "");
        parabr.put("I30", "");
        parabr.put("I31", "");
        tabla.put("(", parabr);


        Map<String, String> parcie = new HashMap<String, String>();
        parcie.put("I0", "E1");
        parcie.put("I1", "");
        parcie.put("I2", "");
        parcie.put("I3", "");
        parcie.put("I4", "E2");
        parcie.put("I5", "E2");
        parcie.put("I6", "E2");
        parcie.put("I7", "E6");
        parcie.put("I8", "E5");
        parcie.put("I9", "E2");
        parcie.put("I10", "");
        parcie.put("I11", "E4");
        parcie.put("I12", "");
        parcie.put("I13", "E9");
        parcie.put("I14", "P11");
        parcie.put("I15", "P14");
        parcie.put("I16", "E2");
        parcie.put("I17", "P16");
        parcie.put("I18", "E5");
        parcie.put("I19", "");
        parcie.put("I20", "");
        parcie.put("I21", "E2");
        parcie.put("I22", "E2");
        parcie.put("I23", "E2");
        parcie.put("I24", "E2");
        parcie.put("I25", "I31");
        parcie.put("I26", "");
        parcie.put("I27", "P9");
        parcie.put("I28", "P10");
        parcie.put("I29", "P12");
        parcie.put("I30", "P13");
        parcie.put("I31", "P15");
        tabla.put(")", parcie);


        Map<String, String> pesos = new HashMap<String, String>();
        pesos.put("I0", "E1");
        pesos.put("I1", "P0");
        pesos.put("I2", "");
        pesos.put("I3", "P2");
        pesos.put("I4", "E2");
        pesos.put("I5", "E2");
        pesos.put("I6", "E2");
        pesos.put("I7", "E6");
        pesos.put("I8", "E5");
        pesos.put("I9", "E2");
        pesos.put("I10", "P1");
        pesos.put("I11", "E4");
        pesos.put("I12", "E10");
        pesos.put("I13", "");
        pesos.put("I14", "");
        pesos.put("I15", "");
        pesos.put("I16", "");
        pesos.put("I17", "E5");
        pesos.put("I18", "E5");
        pesos.put("I19", "P7");
        pesos.put("I20", "P8");
        pesos.put("I21", "E2");
        pesos.put("I22", "E2");
        pesos.put("I23", "E2");
        pesos.put("I24", "E2");
        pesos.put("I25", "");
        pesos.put("I26", "P6");
        pesos.put("I27", "");
        pesos.put("I28", "");
        pesos.put("I29", "");
        pesos.put("I30", "");
        pesos.put("I31", "");
        tabla.put("$", pesos);


        Map<String, String> P = new HashMap<String, String>();
        P.put("I0", "I1");
        P.put("I1", "");
        P.put("I2", "");
        P.put("I3", "");
        P.put("I4", "");
        P.put("I5", "");
        P.put("I6", "");
        P.put("I7", "");
        P.put("I8", "");
        P.put("I9", "");
        P.put("I10", "");
        P.put("I11", "");
        P.put("I12", "I19");
        P.put("I13", "");
        P.put("I14", "");
        P.put("I15", "");
        P.put("I16", "");
        P.put("I17", "");
        P.put("I18", "");
        P.put("I19", "");
        P.put("I20", "");
        P.put("I21", "");
        P.put("I22", "");
        P.put("I23", "");
        P.put("I24", "");
        P.put("I25", "");
        P.put("I26", "");
        P.put("I27", "");
        P.put("I28", "");
        P.put("I29", "");
        P.put("I30", "");
        P.put("I31", "");
        tabla.put("P", P);


        Map<String, String> tipo = new HashMap<String, String>();
        tipo.put("I0", "I2");
        tipo.put("I1", "");
        tipo.put("I2", "");
        tipo.put("I3", "");
        tipo.put("I4", "");
        tipo.put("I5", "");
        tipo.put("I6", "");
        tipo.put("I7", "");
        tipo.put("I8", "");
        tipo.put("I9", "");
        tipo.put("I10", "");
        tipo.put("I11", "");
        tipo.put("I12", "I2");
        tipo.put("I13", "");
        tipo.put("I14", "");
        tipo.put("I15", "");
        tipo.put("I16", "");
        tipo.put("I17", "");
        tipo.put("I18", "");
        tipo.put("I19", "");
        tipo.put("I20", "");
        tipo.put("I21", "");
        tipo.put("I22", "");
        tipo.put("I23", "");
        tipo.put("I24", "");
        tipo.put("I25", "");
        tipo.put("I26", "");
        tipo.put("I27", "");
        tipo.put("I28", "");
        tipo.put("I29", "");
        tipo.put("I30", "");
        tipo.put("I31", "");
        tabla.put("Tipo", tipo);


        Map<String, String> V = new HashMap<String, String>();
        V.put("I0", "");
        V.put("I1", "");
        V.put("I2", "");
        V.put("I3", "");
        V.put("I4", "");
        V.put("I5", "");
        V.put("I6", "");
        V.put("I7", "");
        V.put("I8", "I10");
        V.put("I9", "");
        V.put("I10", "");
        V.put("I11", "");
        V.put("I12", "");
        V.put("I13", "");
        V.put("I14", "");
        V.put("I15", "");
        V.put("I16", "");
        V.put("I17", "");
        V.put("I18", "I26");
        V.put("I19", "");
        V.put("I20", "");
        V.put("I21", "");
        V.put("I22", "");
        V.put("I23", "");
        V.put("I24", "");
        V.put("I25", "");
        V.put("I26", "");
        V.put("I27", "");
        V.put("I28", "");
        V.put("I29", "");
        V.put("I30", "");
        V.put("I31", "");
        tabla.put("V", V);


        Map<String, String> A = new HashMap<String, String>();
        A.put("I0", "I3");
        A.put("I1", "");
        A.put("I2", "");
        A.put("I3", "");
        A.put("I4", "");
        A.put("I5", "");
        A.put("I6", "");
        A.put("I7", "");
        A.put("I8", "");
        A.put("I9", "");
        A.put("I10", "");
        A.put("I11", "");
        A.put("I12", "I3");
        A.put("I13", "");
        A.put("I14", "");
        A.put("I15", "");
        A.put("I16", "");
        A.put("I17", "");
        A.put("I18", "");
        A.put("I19", "");
        A.put("I20", "");
        A.put("I21", "");
        A.put("I22", "");
        A.put("I23", "");
        A.put("I24", "");
        A.put("I25", "");
        A.put("I26", "");
        A.put("I27", "");
        A.put("I28", "");
        A.put("I29", "");
        A.put("I30", "");
        A.put("I31", "");
        tabla.put("A", A);


        Map<String, String> E = new HashMap<String, String>();
        E.put("I0", "");
        E.put("I1", "");
        E.put("I2", "");
        E.put("I3", "");
        E.put("I4", "");
        E.put("I5", "");
        E.put("I6", "");
        E.put("I7", "");
        E.put("I8", "");
        E.put("I9", "I13");
        E.put("I10", "");
        E.put("I11", "");
        E.put("I12", "");
        E.put("I13", "");
        E.put("I14", "");
        E.put("I15", "");
        E.put("I16", "I25");
        E.put("I17", "");
        E.put("I18", "");
        E.put("I19", "");
        E.put("I20", "");
        E.put("I21", "");
        E.put("I22", "");
        E.put("I23", "");
        E.put("I24", "");
        E.put("I25", "");
        E.put("I26", "");
        E.put("I27", "");
        E.put("I28", "");
        E.put("I29", "");
        E.put("I30", "");
        E.put("I31", "");
        tabla.put("E", E);


        Map<String, String> T = new HashMap<String, String>();
        T.put("I0", "");
        T.put("I1", "");
        T.put("I2", "");
        T.put("I3", "");
        T.put("I4", "");
        T.put("I5", "");
        T.put("I6", "");
        T.put("I7", "");
        T.put("I8", "");
        T.put("I9", "I14");
        T.put("I10", "");
        T.put("I11", "");
        T.put("I12", "");
        T.put("I13", "");
        T.put("I14", "");
        T.put("I15", "");
        T.put("I16", "I14");
        T.put("I17", "");
        T.put("I18", "");
        T.put("I19", "");
        T.put("I20", "");
        T.put("I21", "I27");
        T.put("I22", "I28");
        T.put("I23", "");
        T.put("I24", "");
        T.put("I25", "");
        T.put("I26", "");
        T.put("I27", "");
        T.put("I28", "");
        T.put("I29", "");
        T.put("I30", "");
        T.put("I31", "");
        tabla.put("T", T);


        Map<String, String> F = new HashMap<String, String>();
        F.put("I0", "");
        F.put("I1", "");
        F.put("I2", "");
        F.put("I3", "");
        F.put("I4", "");
        F.put("I5", "");
        F.put("I6", "");
        F.put("I7", "");
        F.put("I8", "");
        F.put("I9", "I15");
        F.put("I10", "");
        F.put("I11", "");
        F.put("I12", "");
        F.put("I13", "");
        F.put("I14", "");
        F.put("I15", "");
        F.put("I16", "I15");
        F.put("I17", "");
        F.put("I18", "");
        F.put("I19", "");
        F.put("I20", "");
        F.put("I21", "I15");
        F.put("I22", "I15");
        F.put("I23", "I29");
        F.put("I24", "I30");
        F.put("I25", "");
        F.put("I26", "");
        F.put("I27", "");
        F.put("I28", "");
        F.put("I29", "");
        F.put("I30", "");
        F.put("I31", "");
        tabla.put("F", F);

        
        Map<String, String> inicioPila = new HashMap<String, String>();
        inicioPila.put("inicio", "I0");
        tabla.put("inicio", inicioPila);

        Map<String, String> prod = new HashMap<String, String>();
        prod.put("P0", "P' P");
        prod.put("P1", "P Tipo id V");
        prod.put("P2", "P A");
        prod.put("P3", "Tipo int");
        prod.put("P4", "Tipo float");
        prod.put("P5", "Tipo char");
        prod.put("P6", "V , id V");
        prod.put("P7", "V ; P");
        prod.put("P8", "A id = E ;");
        prod.put("P9", "E E + T");
        prod.put("P10", "E E - T");
        prod.put("P11", "E T");
        prod.put("P12", "T T * F");
        prod.put("P13", "T T / F"); 
        prod.put("P14", "T F");
        prod.put("P15", "F ( E )");
        prod.put("P16", "F id");

        tabla.put("prod", prod);

        return tabla;
    }
}