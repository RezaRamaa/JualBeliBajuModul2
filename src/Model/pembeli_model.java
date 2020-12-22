/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import Entity.pembeliEntity;
import java.util.ArrayList;
public class pembeli_model implements ModelInterfaces {
    private ArrayList<pembeliEntity> pembeliEntityArrayList;
    public pembeli_model()
    {
        pembeliEntityArrayList = new ArrayList<pembeliEntity>();
    }
    public void insertpembeli(pembeliEntity pembeli)
    {
       this.pembeliEntityArrayList.add(pembeli);
    }
    @Override
    public void view()
    {
        for (pembeliEntity pembeli : pembeliEntityArrayList)
        {
            System.out.print(pembeli.getNama());
            System.out.println();
        }
    }
    public int cekData(String nama, String password){
        int loop = 0;
        for(pembeliEntity pembeli : pembeliEntityArrayList){
            if(pembeli.getNama().equals(nama)){
                break;
            }else{
                loop++;
            }
        }
        return loop;
    }
}
