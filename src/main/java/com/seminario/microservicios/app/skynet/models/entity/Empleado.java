package com.seminario.microservicios.app.skynet.models.entity;

import com.fasterxml.jackson.annotation.*;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "empleados")
/*@JsonIdentityInfo(
        generator = ObjectIdGenerators.StringIdGenerator.class,
        property = "id"
)*/
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombres", length = 64)
    private String nombres;

    @Column(name = "apellidos", length = 64)
    private String apellidos;

    @Column(name = "direccion", length = 64)
    private String direccion;

    @Column(name = "telefono", length = 16)
    private String telefono;

    @Column(name = "cui", length = 16)
    private String cui;

    //@JsonBackReference(value = "employee-movement")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @ManyToOne
    //@JoinColumn(name = "supervisor")
    private Empleado supervisor;

    //@JsonManagedReference(value = "employee-movement")
    //@JsonIgnore
    //@OneToMany(mappedBy = "supervisor", fetch = FetchType.LAZY, orphanRemoval = true)
    //private List<Empleado> empleados;

    //@JsonManagedReference(value = "usuario-movimiento")
    //@JsonIgnore
    //@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true, mappedBy = "empleado")
    //private Usuario usuario;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCui() {
        return cui;
    }

    public void setCui(String cui) {
        this.cui = cui;
    }

    public Empleado getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Empleado supervisor) {
        this.supervisor = supervisor;
    }

   // public List<Empleado> getEmpleados() {
        //return empleados;
    //}

   // public void setEmpleados(List<Empleado> empleados) {

     //   this.empleados.clear();
       // empleados.forEach(this::addEmpleado);
    //}



    //public Empleado() {
      //  this.empleados = new ArrayList<>();
    //}

   // public void addEmpleado(Empleado empleado) {
     //   this.empleados.add(empleado);
        //empleado.setSupervisor(this);
    //}

    //public void removeEmpleado(Empleado empleado){
      //  this.empleados.remove(empleado);
        //empleado.setSupervisor(null);
    //}

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }

        if(!(obj instanceof Empleado)){
            return false;
        }

        Empleado e = (Empleado) obj;
        return this.id != null && this.id.equals(e.getId());
    }
}
