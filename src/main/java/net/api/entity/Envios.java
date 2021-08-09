
package net.api.entity;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Informatica
 */

@Entity
@Table(name = "Pedidos")
public class Envios {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)        
    private Integer id;
    private String CODIGOCLIENTE;
    private String NOMBRECLIENTE;
    private String FECHAPEDIDO;
    private String FECHAENTREGA;
    private String VENDEDOR;
    private String MONEDA;
    private String CODIGOARTICULO;
    private String DESCRIPCIONARTICULO;
    private String CANTIDAD;
    private String UNITARIO;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCODIGOCLIENTE() {
        return CODIGOCLIENTE;
    }

    public void setCODIGOCLIENTE(String CODIGOCLIENTE) {
        this.CODIGOCLIENTE = CODIGOCLIENTE;
    }

    public String getNOMBRECLIENTE() {
        return NOMBRECLIENTE;
    }

    public void setNOMBRECLIENTE(String NOMBRECLIENTE) {
        this.NOMBRECLIENTE = NOMBRECLIENTE;
    }

    public String getFECHAPEDIDO() {
        return FECHAPEDIDO;
    }

    public void setFECHAPEDIDO(String FECHAPEDIDO) {
        this.FECHAPEDIDO = FECHAPEDIDO;
    }

    public String getFECHAENTREGA() {
        return FECHAENTREGA;
    }

    public void setFECHAENTREGA(String FECHAENTREGA) {
        this.FECHAENTREGA = FECHAENTREGA;
    }

    public String getVENDEDOR() {
        return VENDEDOR;
    }

    public void setVENDEDOR(String VENDEDOR) {
        this.VENDEDOR = VENDEDOR;
    }

    public String getMONEDA() {
        return MONEDA;
    }

    public void setMONEDA(String MONEDA) {
        this.MONEDA = MONEDA;
    }

    public String getCODIGOARTICULO() {
        return CODIGOARTICULO;
    }

    public void setCODIGOARTICULO(String CODIGOARTICULO) {
        this.CODIGOARTICULO = CODIGOARTICULO;
    }

    public String getDESCRIPCIONARTICULO() {
        return DESCRIPCIONARTICULO;
    }

    public void setDESCRIPCIONARTICULO(String DESCRIPCIONARTICULO) {
        this.DESCRIPCIONARTICULO = DESCRIPCIONARTICULO;
    }

    public String getCANTIDAD() {
        return CANTIDAD;
    }

    public void setCANTIDAD(String CANTIDAD) {
        this.CANTIDAD = CANTIDAD;
    }

    public String getUNITARIO() {
        return UNITARIO;
    }

    public void setUNITARIO(String UNITARIO) {
        this.UNITARIO = UNITARIO;
    }
    

    
    
    
}
