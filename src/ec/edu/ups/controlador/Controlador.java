/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Paul Idrovo
 */
public class Controlador<tipoObjeto> {

    List<tipoObjeto> listDatos;
    tipoObjeto obj;
    int codigo;
    
    public Controlador() {
        this.listDatos = new ArrayList<>();
        codigo = 0;
    }

    public tipoObjeto getObj() {
        return obj;
    }

    public void setObj(tipoObjeto obj) {
        this.obj = obj;
    }

    public List<tipoObjeto> getListDatos() {
        return listDatos;
    }

    public void setListDatos(List<tipoObjeto> listDatos) {
        this.listDatos = listDatos;
    }
    
    
    public void create(tipoObjeto dato) {
        listDatos.add(dato);
        this.codigo ++;
    }

    public tipoObjeto read(tipoObjeto objeto) {
        obj=(tipoObjeto) this.listDatos.stream().filter(Var1 -> Var1.equals(objeto)).findFirst();
        return obj;
    }

    public void update(tipoObjeto dato) {
        for (int i = 0; i < listDatos.size(); i++) {
            if(listDatos.get(i).equals(dato)){
                obj=dato;
                listDatos.set(i, dato);
            }
        }
    }
    public void delete(tipoObjeto dato) {
        listDatos.remove(dato);
    }
    public int codigoTelefono(){
        return (codigo+1);
    }
}
