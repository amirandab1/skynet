package com.seminario.microservicios.app.skynet.models.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "servicios")
public class Servicio extends BaseEntity implements Serializable {



}
