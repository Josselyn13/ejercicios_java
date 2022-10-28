package src.jimg.banco;

public class CuentaBancaria {
    //No hay método main porque no será la clase de entrada del programa
    String titular;

    //Se cambia el string por tipo de cuenta del enum, en todos los casos en los que los hemos aplicado
//    String tipoDeCuenta;
    TipoDeCuenta tipoDeCuenta;
    double saldo;

    //creamos constantes, públicas y estáticas para llamarlas de fuera de la clase sin necesidad de crear un objeto, se comentaron al crear un archivo enum
//    public static final String TIPO_AHORRO = "ahorro";
//    public static final String TIPO_NOMINA = "nómina";

    final double COMISION = 1.2;


    //Añadiremos los constructores, uno con parámetros, otro vacío y otro con dos parámetros
    //de aquí (String t, TipoDeCuenta tipo, double s), a qué hace referencia t? o s? para hacerlo más claro se usa this, pues los parámetros de entrada tienen preferencia (si le cambiamos string t a titular)
    CuentaBancaria(String titular, TipoDeCuenta tipo, double saldo){
        this.titular = titular;
        this.tipoDeCuenta = tipo;
        this.saldo = saldo;
    }
//vamos a ver como jalar del primer constructor sirva a los otros dos
    CuentaBancaria(String titular, double saldo){
        this(titular, TipoDeCuenta.AHORRO, saldo);
     //   this.titular = titular;
    //    tipoDeCuenta = TIPO_AHORRO; se cambia a TipodeCuenta.AHORRO
     //   this.tipoDeCuenta = TipoDeCuenta.AHORRO;
     //   this.saldo = saldo;
    }

    CuentaBancaria(){
        this("", TipoDeCuenta.AHORRO,0);
     //   tipoDeCuenta = TipoDeCuenta.AHORRO;
    }


    //Declaramos los métodos que no devuelven nada
    void sacarDinero(double cantidad){
        if (cantidad < 0){
            return;
        }
        //Se comentó al quitár las constantes
 //       double comision = 0.0;
 //       if(tipoDeCuenta.equals(TIPO_AHORRO)){
 //           comision = COMISION;
  //      }
        double comision = calcularComision();
        saldo -= cantidad;
        saldo -= comision;
    }
    double calcularComision(){
        switch (tipoDeCuenta){
            case AHORRO:
                return COMISION;
            case NOMINA:
                return 0;
            default:
                return 0;
        }
    }



    void ingresaDinero(double cantidad){
        if (cantidad < 0){
            return;
        }
        saldo += cantidad;
    }
    void cambiarTipoDeCuenta(TipoDeCuenta nuevoTipo){
        tipoDeCuenta = nuevoTipo;
    }

    //Método que sí devuelve valores
    double obtenerSaldo(){
        return saldo;
    }

}
