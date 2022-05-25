package Exe2;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	     int menu=0;
	        Scanner ler = new Scanner(System.in);
	        System.out.println("--- Selecione uma das opções abaixo ---");
	        System.out.println("1- Cadastrar Utilitário");
	        System.out.println("2- Cadastrar Motocicleta");
	        System.out.println("3- Cadastrar Van");
	        System.out.println("4- Cadastrar Caminhão");
	        System.out.println("5- Sair");
	        
	        menu = ler.nextInt();
	        switch (menu) {
	            case 1:
	            	VeiculoUtilitario veiculoutilitario = new VeiculoUtilitario("4x4","OFF Road",2);
	            	System.out.println();
	                
	                break;

	            case 2:
	            	Motocicleta motocicleta = new Motocicleta(30,"Scooter");
	            	System.out.println();
	                break;
	                
	            case 3:
	            	Van van = new Van(20,3);
	            	System.out.println();
	                break;
	                
	            case 4:
	            	Caminhao caminhao = new Caminhao (1000,5);
	            	System.out.println();
	                break;

	            case 5:
	                System.out.println("SISTEMA ENCERRADO!");
	    	     
	                break;
	            default:
	            	System.out.println("ENTRAVA INVALIDA!");
	            	
	                break;
	        }
	    }
	}