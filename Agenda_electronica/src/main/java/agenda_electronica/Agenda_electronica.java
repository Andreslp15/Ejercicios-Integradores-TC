/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package agenda_electronica;

import agenda_electronica_igu.Pantalla;

/**
 *
 * @author andres-lopez
 * Se necesita un programa para gestionar los contactos de una agenda electronica.
 * 
 *  A).  En la agenda se debe permitir ingresar los siguientes datos: dni, nombre, apellido, direccion, telefono
 * y fecha de nacimiento ( cada uno en su correcto TextField ).
 * 
 *  B). Se necesita almacenar los datos de 10 personas. Para ello se propone la utilizacion de 1 vector para
 * almacenar los valores de cada uno de los campos (  teniendo en cuenta que pueden extir distintos 
 * tipos de datos ), donde cada indice indicara los datos de una persona determinada en cada uno de
 * los vectores. Por ejemplo:
 * 
 * Vector DNI: 22346
 * Vector Nombre: Andres
 * Vector  Apellido: Lopez
 * 
 * En este ejemplo el indice 0 corresponde los datos correspondientes  y lo mismo para los otros indices.
 */
public class Agenda_electronica {

    public static void main(String[] args) {
        Pantalla princ = new Pantalla ();
        princ.setVisible(true);
        princ.setLocationRelativeTo(null);
    }
}
