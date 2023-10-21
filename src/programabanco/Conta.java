/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programabanco;

public class Conta {
    protected String tipo;
    private String dono;
    public int numConta;
    private float saldo;
    private boolean status;
    
    
    public void estadoAtual(){
        System.out.println("Tipo: " + getTipo());
        System.out.println("Dono: " + getDono());
        System.out.println("Número da Conta: " + getNumConta());
        System.out.println("Saldo: " + getSaldo());
        System.out.println("Status: " + getStatus());
    }

    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC") {
            this.setSaldo(50);
        } else if (t == "CP"){
            this.setSaldo(150);
        }
    System.out.println("Conta aberta com sucesso");
    } 
 
    public void fecharConta(){
        if (this.getSaldo() == 0){
            System.out.println("Conta Encerrada");
        } else if (this.getSaldo() > 0 || this.getSaldo() < 0) {
            System.out.println("Conta não pode ser encerrada!");
        } else {
            this.setStatus(false);
        }
        
    }
    
    public void depositar(float v){
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito realizado com sucesso na sua conta " + this.getDono() + "!");
        } else {
            System.out.println("Impossível depositar e uma conta fechada.");
        }
    
    }
    
    public void sacar(float v){
        if (this.getStatus()){
            if (this.getSaldo()>= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado com sucesso na sua conta " + this.getDono() + "!");
            } else {
                System.out.println("Saldo insuficiente!");
            }
        } else {
            System.out.println("Operação Impossível");
        }
    }
    
    public void pagarMensal(){
        int v = 0;
        if (this.getTipo() == "CC") {
            v = 12;
        } else if (this.getTipo() == "CP") {
            v = 20;
        }
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso!");
        } else {
            System.out.println("Impossível realizar operação de pagamento da mensalidade");
        }
    
    }
    
//CONSTRUTOR
    public Conta() {
        this.status = false;
        this.saldo = 0;
    }

//Get e Set
public String getTipo(){
        return this.tipo;
    }
    
    public void setTipo(String t){
        this.tipo = t;
    }
    
    public String getDono(){
        return this.dono;
    }
    
    public void setDono(String d){
        this.dono = d;
    }
    
    public int getNumConta(){
        return this.numConta;
    }
    
    public void setNumConta(int n){
        this.numConta = n;
    }
    
    public float getSaldo(){
        return this.saldo;
    }
    
    public void setSaldo(float s){
        this.saldo = s;
    }
    
    public boolean getStatus(){
        return this.status;
    }
    
    public void setStatus(boolean t){
        this.status = t;
    }    
}
