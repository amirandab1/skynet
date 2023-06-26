package com.seminario.microservicios.app.skynet.models.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "estados")
public class Estado extends BaseEntity implements Serializable {
    @JsonBackReference(value = "estado-movimiento")
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true, mappedBy = "estado")
    private List<DetalleVisita> detalleVisitas;

    public List<DetalleVisita> getDetalleVisitas() {
        return detalleVisitas;
    }

    public void setDetalleVisitas(List<DetalleVisita> detalleVisitas) {
        this.detalleVisitas = detalleVisitas;
    }
}
