/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domain;

import interfaces.ICanalNotificacion;

/**
 *
 * @author PC
 */
public class Main {
    public static void main(String[] args){
        ICanalNotificacion movil = new NotificacionMovil();
        ICanalNotificacion correo = new CorreoElectronico();
        
        SistemaNotificaciones snc = new SistemaNotificaciones(correo);
        SistemaNotificaciones snm = new SistemaNotificaciones(movil);
        
        snc.enviar(true);
        snm.enviar(true);
    
    }
}
