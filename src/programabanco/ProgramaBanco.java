/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programabanco;

public class ProgramaBanco {

    public static void main(String[] args) {
        Conta p1 = new Conta();
        p1.setNumConta(1111);
        p1.setDono("Jubileu");
        p1.abrirConta("CC");
        p1.sacar(5);
        p1.estadoAtual();
        
        Conta p2 = new Conta();
        p2.setNumConta (2222);
        p2.setDono("Cleusa");
        p2.abrirConta("CP");
        p2.depositar(2500);
        p2.estadoAtual();
        p2.fecharConta();
    }
    
}
