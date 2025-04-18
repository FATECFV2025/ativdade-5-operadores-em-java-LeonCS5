public class OperadoresAritimeticos {
    //operador de adicao | Soma dois números e retorna o resultado
    public float adicao(float a, float b) {
        return a + b;
    }
    //operador de subtracao | Subtrai o segundo número do primeiro
    public float subtracao(float a, float b) {
        return a - b;
    }
    //operador de multiplicacao | Multiplica dois números
    public float multiplicacao(float a, float b) {
        return a * b;
    }
    //operador de divisao | Divide o primeiro número pelo segundo
    public float divisao(float a, float b) {
        return a / b;
    }
    //operador de modulo | Retorna o resto da divisão entre dois números
    public float resto(float a, float b){
        return a % b;
    }

    //operador de adicao composta | Soma um valor ao número e atualiza a variável
    public float adicaoComposta(float a, float b) {
        return a += b;
    }

    //operador de subtracao composta | Subtrai um valor do número e atualiza a variável
    public float subtracaoComposta(float a, float b) {
        return a -= b;
    }

    //operador de multiplicacao composta | Multiplica o número por um valor e atualiza a variável
    public float multiplicacaoComposta(float a, float b) {
        return a *= b;
    }

    //operador de divisao composta | Divide o número por um valor e atualiza a variável
    public float divisaoComposta(float a, float b) {
        return a /= b;
    }

    //operador de modulo composto | Calcula o resto da divisão e atualiza a variável
    public float restoComposto(float a, float b) {
        return a %= b;
    }


}

