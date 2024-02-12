package jogoMatematicaTrabajoEDD.src.main;

import java.util.Random;
/** La clase Calculos hace problemas matematicos para que el usuario los resuelva
 * 
 * @author Adrian
 */
public class Calculos {

    private int level;
    private int valor1;
    private int valor2;
    private int operation;

    private int result;

    /**
     * El metodo Calculos coge un valor y lo guarda en el atributo, tambien
     * genera un numero aleatoriamente
     *
     * @param level Le pasamos como parametro un numero entre el 0 y el 1
     */
    public Calculos(int level) {
        Random random = new Random();
        this.operation = random.nextInt(2);
        this.level = level;

        /**
         * If para que si el parametro level, que seria el nivel de dificultad, es 1, valor1 y valor2 sean un numero
         * entre el 0 y el 9, si no, un numero entre el 0 y el 99
         *
         */
        if (level == 1) {
            this.valor1 = random.nextInt(10);
            this.valor2 = random.nextInt(10);
        } else {
            this.valor1 = random.nextInt(100);
            this.valor2 = random.nextInt(100);
        }
    }

    /**
     * Recibe el numero de level(Nivel de dificultad)
     *
     * @return el numero de level(Nivel de dificultad)
     */
    public int getLevel() {
        return level;
    }

    /**
     * Recibe el numero de valor1
     *
     * @return el numero de valor1
     */
    public int getValor1() {
        return valor1;
    }

    /**
     * Recibe el numero de valor2
     *
     * @return el numero de valor2
     */
    public int getValor2() {
        return valor2;
    }

    /**
     * Recibe el valor de Operation
     *
     * @return el valor de Operation
     */
    public int getOperation() {
        return operation;
    }

    /**
     * Recibe el valor de Result
     *
     * @return el valor de Result
     */
    public int getResult() {
        return result;
    }
    /** Cadena que da valor a Operation
     * 
     * @return Mostrar los valores de valor1, valor2, Operation(opcao) y level(Dificultad)
     */
    public String toString() {
        String opcao;
        if (this.getOperation() == 0) {
            opcao = "somar";
        } else if (this.getOperation() == 1) {
            opcao = "subtrair";
        } else if (this.getOperation() == 2) {
            opcao = "multiplicar";
        } else {
            opcao = "opcão inválida";
        }

        return "valor 1: " + this.getValor1()
                + "\nValor2: " + this.getValor2()
                + "\nOperação: " + opcao
                + "\nDificuldade: " + this.getLevel();
    }
    /** Hace una operacion de suma y verifica si la respuesta es correcta
     * 
     * @param valor Respuesta del usuario
     * @return Verdadero si la respuesta es correcta, o Falso si la respuesta es incorrecta
     */
    public boolean somar(int valor) {
        this.result = this.getValor1() + this.getValor2();
        boolean acerto = false;

        if (valor == this.getResult()) {
            System.out.println("Resposta correta!");
            acerto = true;
        } else {
            System.out.println("Estude mais!");
        }
        System.out.println(this.getValor1() + " + " + this.getValor2() + " = " + this.getResult());
        return acerto;
    }
    /** Hace una operacion de resta y verifica si la respuesta es correcta
     * 
     * @param valor Respuesta del usuario
     * @return Verdadero si la respuesta es correcta, o Falso si la respuesta es incorrecta
     */
    public boolean subtrair(int valor) {
        this.result = this.getValor1() - this.getValor2();
        boolean acerto = false;

        if (valor == this.getResult()) {
            System.out.println("Resposta correta!");
            acerto = true;
        } else {
            System.out.println("Estude mais!");
        }
        System.out.println(this.getValor1() + " - " + this.getValor2() + " = " + this.getResult());
        return acerto;
    }
    /** Hace una operacion de multiplicacion y verifica si la respuesta es correcta
     * 
     * @param valor Respuesta del usuario
     * @return Verdadero si la respuesta es correcta, o Falso si la respuesta es incorrecta
     */
    public boolean multiplicar(int valor) {
        this.result = this.getValor1() * this.getValor2();
        boolean acerto = false;

        if (valor == this.getResult()) {
            System.out.println("Resposta correta!");
            acerto = true;
        } else {
            System.out.println("Estude mais!");
        }
        System.out.println(this.getValor1() + " * " + this.getValor2() + " = " + this.getResult());
        return acerto;
    }
}
