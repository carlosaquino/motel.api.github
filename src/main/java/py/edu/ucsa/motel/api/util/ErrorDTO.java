package py.edu.ucsa.motel.api.util;


public class ErrorDTO {

    private String mensajeError;

    public ErrorDTO(String mensajeError){
        this.mensajeError = mensajeError;
    }

    public String getMensajeError() {
        return mensajeError;
    }

}
