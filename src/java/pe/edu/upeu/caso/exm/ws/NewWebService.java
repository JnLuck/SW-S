/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.caso.exm.ws;

import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import pe.edu.upeu.caso.exm.dao.UsuarioDao;
import pe.edu.upeu.caso.exm.daolmpl.UsuarioDaoImpl;
import pe.edu.upeu.caso.exm.model.Usuario;

/**
 *
 * @author Jhoselyn
 */
@WebService(serviceName = "NewWebService")
public class NewWebService {
private UsuarioDao dao = new UsuarioDaoImpl();
    /**
     * This is a sample web service operation
     */
    
    @WebMethod(operationName = "delete")
    public int eliminar(@WebParam(name = "idusuario") int idusuario) {
        return dao.delete(idusuario);
    }
    
    @WebMethod(operationName = "read")
    public Usuario read(@WebParam(name = "idusuario") int idusuario) {
        return dao.read(idusuario);
    }
    
    @WebMethod(operationName = "readAll")
    public List<Usuario>readAll(){
        return dao.readAll();
    }
}
