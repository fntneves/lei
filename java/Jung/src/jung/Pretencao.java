/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jung;

/**
 *
 * @author Bruno
 */
public class Pretencao {
    int data;
    String origem;
    String destino;
    String nMecanografico;
    
    public Pretencao(int data, String origem, String destino,String nMecanografico){
        this.data=data;
        this.origem=origem;
        this.destino=destino;
        this.nMecanografico=nMecanografico;
    }
    
    /*GET's*/
    String getOrigem(){return this.origem;}
    String getDestino(){return this.destino;}
    int getData(){return this.data;}
    String getMecanografico(){return this.nMecanografico;}
    
   /* Boolean equals(Pretencao a, Pretencao b){
       return (a.data == b.data && a.destino==b.destino &&  a.origem==b.origem); 
    }
    */
    /* SET'S */
    
    void setOrigem(String origem){this.origem=origem;}
    void setDestion(String destino){this.destino=destino;}
    void setData(int data){this.data=data;}
    void setMecanografico(String mecanografico){this.nMecanografico=mecanografico;}
    
}