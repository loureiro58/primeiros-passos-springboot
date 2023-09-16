package dio.springboot;

import org.springframework.stereotype.Component;

@Component
public class Calculadora {
    public int somar(int numero, int numero1){
        return numero + numero1;
    }
}
