public class OperadoresLogicos {
    //Operador para verdade absoluta | Retorna verdadeiro se ambas as condições forem verdadeiras
    public boolean eLogico(boolean a, boolean b) {
        return a && b;
    }

    //Operador para uma verdade | Retorna verdadeiro se pelo menos uma condição for verdadeira
    public boolean ouLogico(boolean a, boolean b) {
        return a || b;
    }
    //Operador para verdade absoluta | Retorna verdadeiro se ambas as condições forem verdadeiras
    public boolean eLogico1(boolean a, boolean b) {
        return a & b;
    }

    //Operador para uma verdade | Retorna verdadeiro se pelo menos uma condição for verdadeira
    public boolean ouLogico1(boolean a, boolean b) {
        return a | b;
    }


    //Operador para Inverter o valor lógico da condição
    public boolean naoLogico(boolean a) {
        return !a;
    }
}
