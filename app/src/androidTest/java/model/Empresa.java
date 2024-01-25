package model;

public class Empresa {
    private long id;
    private String nombre;
    private int facturacion;
    private long sector_id;

    public Empresa(long id, String nombre, int facturacion, long sector_id) {
        this.id = id;
        this.nombre = nombre;
        this.facturacion = facturacion;
        this.sector_id = sector_id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFacturacion() {
        return facturacion;
    }

    public void setFacturacion(int facturacion) {
        this.facturacion = facturacion;
    }

    public long getSector_id() {
        return sector_id;
    }

    public void setSector_id(long sector_id) {
        this.sector_id = sector_id;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", facturacion=" + facturacion +
                ", sector_id=" + sector_id +
                '}';
    }
}
