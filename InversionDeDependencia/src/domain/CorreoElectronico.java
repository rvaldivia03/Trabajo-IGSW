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
public class CorreoElectronico implements ICanalNotificacion {

    @Override
    public void enviarNotificacion() {
    
        System.out.println("Enviando esta notificacion a traves de GMail");
    }
    
    
    
}
