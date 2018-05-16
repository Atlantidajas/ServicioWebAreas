
package com.calculararea;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para areaCircuferencia complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="areaCircuferencia"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="radioCircunferencia" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "areaCircuferencia", propOrder = {
    "radioCircunferencia"
})
public class AreaCircuferencia {

    protected double radioCircunferencia;

    /**
     * Obtiene el valor de la propiedad radioCircunferencia.
     * 
     */
    public double getRadioCircunferencia() {
        return radioCircunferencia;
    }

    /**
     * Define el valor de la propiedad radioCircunferencia.
     * 
     */
    public void setRadioCircunferencia(double value) {
        this.radioCircunferencia = value;
    }

}
