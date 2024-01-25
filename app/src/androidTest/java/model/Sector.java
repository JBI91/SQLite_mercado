package model;

public class Sector {

    private long id;
    private String descripcion;

    public Sector(long id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Sector{" +
                "id=" + id +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
