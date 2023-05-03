package dev.vini2003.calculadora;

import dev.vini2003.calculadora.rmi.CalculadoraRemote;
import dev.vini2003.calculadora.rmi.CalculadoraRemoteImpl;

import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class RMIServer {
    public static void main(String[] args) {
        try {
            var nomeServico = "calculadora"; // Este é o nome do serviço a ser localizado
            var calculadora = new CalculadoraRemoteImpl(); // Cria o objeto a ser servido

            // Cria o stub dinamicamente do objeto a ser servido
            var stub = (CalculadoraRemote) UnicastRemoteObject.exportObject(calculadora, 0);

            // Referência para rmiregistry na porta 1099
            var registro = LocateRegistry.getRegistry(1099);
            registro.bind(nomeServico, stub); // Registra o stub no rmiregistry

            System.out.println("Servidor no ar. Nome do objeto servidor: 'calculadora'");
        } catch (Exception e) {
            System.out.println("Exceção: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
