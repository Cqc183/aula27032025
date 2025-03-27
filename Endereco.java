/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 202208878202
 */
public class Endereco {
    private String rua;
    
    public Endereco(String rua){
        this.rua = rua;
    }
    public String getRua(){
        return rua;
    }
    public void setRua(String rua){
        this.rua = rua;
    }
    @Override
    public String toString(){
        return "Endereco{rua = '" + rua + "'";
    }
    
}
