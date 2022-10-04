
package br.com.roisidoro.controleremotouniversal;

import java.util.Scanner;

public class ControleRemoto {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Televisor tv = new Televisor();
        SetTopBox decodificador = new SetTopBox();
        
        System.out.println("Qual deseja utilizar:\n1 - Televisor\n2 - SetTopBoX");
        byte escolhaEquipamento = sc.nextByte();
                   
        while (escolhaEquipamento != 1 && escolhaEquipamento != 2){
            System.out.println("\nEscolha inválida. Digite novamente!\n"
                    + "Qual deseja utilizar:\n1 - Televisor\n2 - SetTopBoX");
            byte valorNovo = sc.nextByte();
            escolhaEquipamento = valorNovo;
        }

        if (escolhaEquipamento == 1){
            System.out.println("\nTelevisor conectado!\n\n" + tv);
            
        }else
            System.out.println("\nSetTopBox conectado!\n\n" + decodificador);


        System.out.println("\nMENU\n1 - Canal +\n2 - Canal -\n3 - Volume +\n4 - Volume -\n5 - Desconectar");
        byte menu = sc.nextByte();
        
        if (escolhaEquipamento == 1){
            do{
                while (menu < 1 || menu > 5){
                    System.out.println("\nEscolha inválida. Digite novamente!"
                            + "\n"
                            + "MENU\n1 - Canal +\n2 - Canal -\n3 - Volume +\n4 - Volume -\n5 - Desconectar");
                    byte valorNovoMenu = sc.nextByte();
                    menu = valorNovoMenu;
                }

                if(menu == 1){
                    tv.aumentarCanal();
                    System.out.println(tv);
                    System.out.println("\nMENU\n1 - Canal +\n2 - Canal -\n3 - Volume +\n4 - Volume -\n5 - Desconectar");
                    menu = sc.nextByte();
                }

                if (menu == 2) {
                    tv.diminuirCanal();
                    System.out.println(tv);
                    System.out.println("\nMENU\n1 - Canal +\n2 - Canal -\n3 - Volume +\n4 - Volume -\n5 - Desconectar");
                    menu = sc.nextByte();
                }
                if (menu == 3) {
                    tv.aumentarVolume();
                    System.out.println(tv);
                    System.out.println("\nMENU\n1 - Canal +\n2 - Canal -\n3 - Volume +\n4 - Volume -\n5 - Desconectar");
                    menu = sc.nextByte();
                }
                if (menu == 4) {
                    tv.diminuirVolume();
                    System.out.println(tv);
                    System.out.println("\nMENU\n1 - Canal +\n2 - Canal -\n3 - Volume +\n4 - Volume -\n5 - Desconectar");
                    menu = sc.nextByte();
                }

            }while (menu != 5);
        
        }else{
            do{
                while (menu < 1 || menu > 5){
                    System.out.println("\nEscolha inválida. Digite novamente!"
                            + "\n"
                            + "MENU\n1 - Canal +\n2 - Canal -\n3 - Volume +\n4 - Volume -\n5 - Desconectar");
                    byte valorNovoMenu = sc.nextByte();
                    menu = valorNovoMenu;
                }

                if(menu == 1){
                    decodificador.aumentarCanal();
                    System.out.println(decodificador);
                    System.out.println("\nMENU\n1 - Canal +\n2 - Canal -\n3 - Volume +\n4 - Volume -\n5 - Desconectar");
                    menu = sc.nextByte();
                }

                if (menu == 2) {
                    decodificador.diminuirCanal();
                    System.out.println(decodificador);
                    System.out.println("\nMENU\n1 - Canal +\n2 - Canal -\n3 - Volume +\n4 - Volume -\n5 - Desconectar");
                    menu = sc.nextByte();
                }
                if (menu == 3) {
                    decodificador.aumentarVolume();
                    System.out.println(decodificador);
                    System.out.println("\nMENU\n1 - Canal +\n2 - Canal -\n3 - Volume +\n4 - Volume -\n5 - Desconectar");
                    menu = sc.nextByte();
                }
                if (menu == 4) {
                    decodificador.diminuirVolume();
                    System.out.println(decodificador);
                    System.out.println("\nMENU\n1 - Canal +\n2 - Canal -\n3 - Volume +\n4 - Volume -\n5 - Desconectar");
                    menu = sc.nextByte();
                }

            }while (menu != 5);
        }
        
        System.out.println("\nAparelho desconectado!");
    }
    
}
