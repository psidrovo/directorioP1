
package ec.edu.ups.dao;

import ec.edu.ups.idao.ITelefono;
import ec.edu.ups.modelo.Telefono;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Paul Idrovo
 */
public class TelefonoDao implements ITelefono{
    
    private Map<Integer,Telefono> mapaTelefono;
    int ultimoCodigo;
    public TelefonoDao() {
        mapaTelefono=new HashMap<Integer,Telefono>();
        ultimoCodigo=0;
    }

    @Override
    public void create(Telefono telefono) {
        mapaTelefono.put(telefono.getCodigo(), telefono);
        ultimoCodigo=telefono.getCodigo();
    }

    @Override
    public Telefono read(int codigo) {
        Telefono tf = mapaTelefono.get(codigo);
        return tf;
    }

    @Override
    public void update(Telefono telefono) {
        mapaTelefono.put(telefono.getCodigo(), telefono);
    }

    @Override
    public void delete(int codigo) {
        mapaTelefono.remove(codigo);
    }

    @Override
    public List<Telefono> todosTelefonos() {
        List<Telefono> lista = new ArrayList<>();
        Iterator it = mapaTelefono.values().iterator();
        while(it.hasNext()){
            lista.add((Telefono) it.next());
        }
        return lista;
    }

    @Override
    public int getCodigoActual() {
        return ultimoCodigo;
    }
}
