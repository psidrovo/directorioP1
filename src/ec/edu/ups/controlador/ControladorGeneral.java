/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Telefono;
import ec.edu.ups.modelo.Usuario;
import java.util.Optional;

/**
 *
 * @author Paul Idrovo
 */
public class ControladorGeneral {
    private Controlador controladorUsuarioGenerico;
    private Controlador controladorTelefonoGenerico;

    public ControladorGeneral(Controlador controladorUsuarioGenerico, Controlador controladorTelefonoGenerico) {
        this.controladorUsuarioGenerico = controladorUsuarioGenerico;
        this.controladorTelefonoGenerico = controladorTelefonoGenerico;
    }
    
    
    public void agregarTelefonoUsuario(Telefono telefono){
        var us = (Optional<Usuario>)controladorUsuarioGenerico.getObj();
        us.get().agregarTelefono(telefono);
        controladorTelefonoGenerico.create(telefono);
        controladorUsuarioGenerico.update(us);
    }
    
    public void actualizarTelefono(Telefono telefono){
        var us = (Optional<Usuario>)controladorUsuarioGenerico.getObj();
        us.get().actualizarTelefono(telefono);
        controladorTelefonoGenerico.update(telefono);
        controladorUsuarioGenerico.update(us);
    }
    public void eliminarTelefono(Telefono telefono){
        var us = (Optional<Usuario>)controladorUsuarioGenerico.getObj();
        us.get().eliminarTelefono(telefono.getCodigo());
        controladorTelefonoGenerico.delete(telefono);
        controladorUsuarioGenerico.update(us);
    }
}
