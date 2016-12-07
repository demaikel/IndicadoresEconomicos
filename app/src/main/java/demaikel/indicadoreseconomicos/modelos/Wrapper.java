package demaikel.indicadoreseconomicos.modelos;

/**
 * Created by Michael on 06-12-2016.
 */

public class Wrapper {

    private String version, autor, fecha;
    private Indicator uf, dolar, ipc;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Indicator getUf() {
        return uf;
    }

    public void setUf(Indicator uf) {
        this.uf = uf;
    }

    public Indicator getDolar() {
        return dolar;
    }

    public void setDolar(Indicator dolar) {
        this.dolar = dolar;
    }

    public Indicator getIpc() {
        return ipc;
    }

    public void setIpc(Indicator ipc) {
        this.ipc = ipc;
    }
}
