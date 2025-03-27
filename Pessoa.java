/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 202208878202
 */
public class Pessoa implements Cloneable {
    private String nome;
    private String endereco;

   
    public Pessoa(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

  
    public Pessoa cloneDeep() {
        return new Pessoa(this.nome, this.endereco);
    }

    // Método toString
    @Override
    public String toString() {
        return "Pessoa{nome='" + nome + "', endereco='" + endereco + "'}";
    }

 
 
}
