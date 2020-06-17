package ec.edu.ups.controlador;

import ec.edu.ups.dao.TelefonoDao;
import ec.edu.ups.dao.UsuarioDao;
import ec.edu.ups.idao.ITelefono;
import ec.edu.ups.idao.IUsuario;
import ec.edu.ups.modelo.Telefono;
import ec.edu.ups.modelo.Usuario;
import java.util.List;

/**
 * Clase ControladorUsuario.
 *
 * Esta clase manejara toda la informacion del usuario y ademas tendra acceso a
 * la lista de usuarios registrados que le pertenece a UsuarioDao, esto se debe
 * a que el cosntructor recibe al usuarioDao. Ademas podra hacer uso de los
 * telefonos disponibles en Telefono Dao
 *
 * @author Paul Idrovo
 */
public class ControladorUsuario {

    private IUsuario usuarioDao;
    private ITelefono telefonoDao;
    private Telefono telefono;
    private Usuario usuario;

    public ControladorUsuario() {
    }

    /**
     * Constructor ControladorUsuario con valores iniciales. Este constrcutor
     * recibe la vista de Usuairo, el UsuarioDao y el telefonoDao.
     *
     * @see UsuarioDao
     * @see TelefonoDao
     *
     * @param usuarioDao - objeto tipo UsuarioDao
     * @param telefonoDao - objeto tipo TelefonoDao
     */
    public ControladorUsuario(UsuarioDao usuarioDao, TelefonoDao telefonoDao) {
        this.usuarioDao = usuarioDao;
        this.telefonoDao = telefonoDao;
    }

    /**
     * Metodo Registrar.
     *
     * Este metodo nos ayuda a registrar un usuario, para ello con la
     * vistaUsuario pedimos los datos para armar nuestro usuaario a registrar,
     * de ahi UsuarioDao mediante el metodo registrarUsuario se encarga de
     * guardar dentro del map que tenemos disponible.
     *
     * @see UsuarioDao
     */
    public void registrar(String cedula, String nombre, String apellido, String correo, String contrasena) {
        Usuario registroUsuario = new Usuario(cedula, nombre, apellido, correo, contrasena);
        usuarioDao.create(registroUsuario);
    }

    /**
     * Metodo inicoSesion.
     *
     * Este metodo se encarga de pedir las credenciales mendiate la vistaUsuario
     * que tiene el metodo iniciarSesionUsuario, este nos devolvera el
     * credencial la misma que es la key del map, esta esta formada del correo y
     * contraseña. Luego por el UsuarioDao comprobamos si existe y este nos va a
     * retornar todo el Usuario, si es null significa que el Usuario no existe o
     * no estan correctas sus credenciales
     *
     * @return usuario - objeto tipo Usuario
     * @see VistaUsuario
     * @see UsuarioDao
     */
    //llama al DAO para Iniciar sesion
    public Usuario inicioSesion(String credenciales) {
        usuario = usuarioDao.read(credenciales);
        if (usuario != null) {
            return usuario;
        }
        return null;
    }

    /**
     * Metodo agregarTelefono.
     *
     * Este metodo se encarga de asignar un telefono a un Usuario, para ello
     * recibe el codigo del telefono a ingresar, luego mediante TelefonoDao y su
     * metodo read, extraemos el telefono de la lista principal apra agregarlo a
     * Usuario con su metodo agregar usuario, posteriormente actualizamos el
     * UsuarioDao con el nuevo Usuario.
     *
     * @param codigo - tipo int
     * @see TelefonoDao
     * @see Usuario
     * @see UsuarioDao
     */
    public void agregarTelefono(int codigo, String numero, String tipo, String operadora) {
        telefono = new Telefono(codigo, numero, tipo, operadora);
        telefonoDao.create(telefono);
        usuario.agregarTelefono(telefono);
        usuarioDao.update(usuario);
    }

    /**
     * Metodo actualizarTelefono.
     *
     * Recibe un dato tipo int que es el codigo del telfono, con este buscamos
     * dentro del TelefonoDao, luego actualizamos la lista del usuario con el
     * metodo actualizarTelefono
     *
     * @param codigo
     */
    public void actualizarTelefono(int codigo, String numero, String tipo, String operadora) {
        telefono = new Telefono(codigo, numero, tipo, operadora);
        usuario.actualizarTelefono(telefono);
        telefonoDao.update(telefono);
        usuarioDao.update(usuario);
    }

    /**
     * Metodo eliminarTelefono.
     *
     * Este metodo se encarga de eliminar el telefono de la lista del usuario
     * que inicio sesion.
     *
     * @param codigo
     */
    public void eliminarTelefono(int codigo) {
        usuario.eliminarTelefono(codigo);
        usuarioDao.update(usuario);
        telefonoDao.delete(codigo);
    }

    /**
     * Metodo verTelefonoCodigo.
     *
     * Este metodo nos imprime el telefono del usuario al cual le pasamos un
     * codigo posteriormente.
     *
     */
    public Usuario verTelefonoCodigo() {
        return usuario;
    }

    /**
     * Metodo verTelefonos.
     *
     * Este metodo se encarga de imprimir todos los telefnos que contine este
     * Usuario.
     *
     */
    public List<Telefono> verTelefonos() {
        return usuario.getDirectorio();
    }

    /**
     * Metodo verTelefonoCorreo.
     *
     * Este metodo imprime los contactos que pertenescan al usuario que
     * validamos unicamente con el correo
     */
    public List<Telefono> verTelefonosGeneralUsuario(String credencial, String tipo) {
        if(tipo.equals("CEDULA")){
            usuario=usuarioDao.telefonosCedula(credencial);
        }else{
            usuario = usuarioDao.telefonosCorreo(credencial);
        }
        if (usuario != null) {
            return usuario.getDirectorio();
        }
        return null;
    }
    

    /**
     * Metodo verUsuario.
     *
     * Este metodo nos imprime los datos del Usuario
     */
    public Usuario verUsuario() {
        return usuario;
    }

}
