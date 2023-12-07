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
public class SistemaNotificaciones {

    private ICanalNotificacion canalNotificaciones;

    public SistemaNotificaciones(ICanalNotificacion canalNotificaciones) {
        this.canalNotificaciones = canalNotificaciones;
    }

    public ICanalNotificacion getCanalNotificaciones() {
        return canalNotificaciones;
    }

    public void setCanalNotificaciones(ICanalNotificacion canalNotificaciones) {
        this.canalNotificaciones = canalNotificaciones;
    }
    
    
    public void enviar(boolean enviar){
        
        canalNotificaciones.enviarNotificacion();
            
    }


}
