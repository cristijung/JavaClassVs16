package JavaClass.ParteI.Aula01;

//classe com variáveis primitivas
public class TiposDeDados {

    //variáveis primitivas
    public byte varByte = 126; //8 bits
    public short varShort = (short) 325678; //16 bits
    public int varInt = 1226; // 32 bits
    public long varLong = 9223372036854775807L; // 64 bits
    public float varFloat = 3.14f;  //float
    public double varDouble = 3.78;

    public char varChar = 'A';
    public  boolean varBoolean = true;

    //variáveis/atributos de referência
    public String varString = "Olá Mundo!!!"; // do tipo String é uma classe
    public Integer varInteger = 42; // do tipo Integer é uma classe --> classe wrapper para int

    //exibindo valores e concatenando
   public void exibirValores() {
       System.out.println("Variável byte: " + varByte);
       System.out.println("Variável short: " + varShort);
       System.out.println("Variável int: " + varInt);
       System.out.println("Variável String: " + varString);
    }
}
