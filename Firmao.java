import java.util.ArrayList;
import java.util.Scanner;

import kotlin.reflect.jvm.internal.calls.CallerImpl.FieldGetter.Static;



public class Firmao {

    private static ArrayList<Funcionario>funcionariosos = new ArrayList<Funcionario>();


    public String carro = "carrao";
    public static int numero = 3;
    public boolean vamoVe = true;

    public Firmao(String carro, int numero, boolean vamoVe) {
        this.carro = carro;
        this.numero = numero;
        this.vamoVe = vamoVe;
    }

    public String getCarro() {
        return this.carro;
    }

    public void setCarro(String carro) {
        this.carro = carro;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isVamoVe() {
        return this.vamoVe;
    }

    public boolean getVamoVe() {
        return this.vamoVe;
    }

    public void setVamoVe(boolean vamoVe) {
        this.vamoVe = vamoVe;
    }

    

    public static void ContatorBoolean(){
        int segundoNumero = 0;
        if (numero > segundoNumero ){
            System.out.println("printando");
        } 
    }

    public static void fazendoLooping(){
        String palavra = "palavra";
        for (int i = 0; i < numero; i++){

            System.out.println(palavra);
        }
        
    }

    public static void loopinNo3(){
        System.out.println("Escrevi numero 3");
    }

    public static String opcaoVerificar(){
        int opcao = 0;
        String opcaoInvalida = "recebe opcao invalida";
        System.out.println("selecione 1 para opcao para saber a diferença , 2 para outra");
        Scanner digita = new Scanner(System.in);
        int menu = Integer.parseInt(digita.nextLine());
        while (opcao <= 2 ) {
        if (menu == 1){
            
            System.out.println("digitado 1");
            opcao ++;
        }
        
    }
    return opcaoInvalida;
    }


    

    public static void main(String[] args) {
      
        Funcionario f1 = new Funcionario("Jorel", 5.5, 30, false, 20); // 5.5 * 30 = 1650
        funcionariosos.add(f1);
        
        boolean menu=true;

        while(menu){

            System.out.println("opçoes : 1 , 2 , 3 , 4");
            Scanner in = new Scanner(System.in);
            int menuSelecionado = Integer.parseInt(in.nextLine());

            switch(menuSelecionado){
                case 1 : fazendoLooping();
                break;
                case 2 : ContatorBoolean();
                break;
                case 3 : loopinNo3();
                break;
                case 4 : opcaoVerificar();
                break;
                default:
                System.out.println("Opção inválida.\n");

            }
            
        }

    }
    }

