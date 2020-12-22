/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

public class PenjualEntity extends MahasiswaAbstractEntity {

    public PenjualEntity(String nama, String password) {
        super(nama, password);
    }
  
@Override
public String getNama(){
    return nama;
}
 
}
