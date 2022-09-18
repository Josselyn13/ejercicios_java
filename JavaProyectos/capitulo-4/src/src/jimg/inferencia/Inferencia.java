package src.jimg.inferencia;

import java.security.cert.CertificateNotYetValidException;

public class Inferencia {
    public static void main(String[] args) {
        var numero = 3.3;
        var palabra = "casa";

        System.out.println("La variable palabra es de tipo " + palabra.getClass().getSimpleName());


        var certificateNotYetValidException = new CertificateNotYetValidException();
        var propoerty = System.getProperty("os.name");
    }
}
