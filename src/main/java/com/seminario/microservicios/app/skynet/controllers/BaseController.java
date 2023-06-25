package com.seminario.microservicios.app.skynet.controllers;

import com.seminario.microservicios.app.skynet.models.entity.Cliente;
import com.seminario.microservicios.app.skynet.models.entity.Empleado;
import com.seminario.microservicios.app.skynet.models.entity.Servicio;
import com.seminario.microservicios.app.skynet.models.entity.Visita;
import com.seminario.microservicios.app.skynet.services.IClienteService;
import com.seminario.microservicios.app.skynet.services.IEmpleadoService;
import com.seminario.microservicios.app.skynet.services.IServicioService;
import com.seminario.microservicios.app.skynet.services.IVisitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api")
@CrossOrigin
public class BaseController {

    @Autowired
    private IEmpleadoService empleadoService;

    @Autowired
    private IClienteService clienteService;

    @Autowired
    private IVisitaService visitaService;

    @Autowired
    private IServicioService servicioService;

    /*-----------------------Controlador Empleado-----------------------------*/

    @GetMapping(value = "/empleados")
    public ResponseEntity<?> obtenerEmpleados(){
        return ResponseEntity.ok().body(empleadoService.findAll());
    }

    @GetMapping(value = "/empleado/{id}")
    public ResponseEntity<?> obtenerEmpleado(@PathVariable Long id){
        Optional<Empleado> e = empleadoService.findById(id);
        if(e.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(e.get());
    }

    @PostMapping(value = "/empleado/")
    public ResponseEntity<?> guardarEmpleado(@RequestBody Empleado empleado){
        Empleado empleadoDb = empleadoService.save(empleado);
        return ResponseEntity.status(HttpStatus.CREATED).body(empleadoDb);
    }

    @PutMapping(value = "/empleado/{id}")
    public ResponseEntity<?> actualizarEmpleado(@RequestBody Empleado empleado, @PathVariable Long id){
        Optional<Empleado> e = empleadoService.findById(id);
        if (e.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        Empleado empleadoDb = e.get();
        //empleadoDb.setNombres(empleado.getNombres());
        //empleadoDb.setApellidos(empleado.getApellidos());
        //empleadoDb.setDireccion(empleado.getDireccion());
        //empleadoDb.setTelefono(empleado.getTelefono());
        //empleadoDb.setCui(empleado.getCui());
        empleadoDb.setSupervisor(empleado.getSupervisor());

        return ResponseEntity.status(HttpStatus.CREATED).body(empleadoService.save(empleadoDb));
    }


    /*--------------------------------Controlador Cliente-------------------------*/

    @GetMapping(value = "/clientes")
    public ResponseEntity<?> obtenerClientes(){
        return ResponseEntity.ok().body(clienteService.findAll());
    }

    @GetMapping(value = "/cliente/{id}")
    public ResponseEntity<?> obtenerCliente(@PathVariable Long id){
        Optional<Cliente> c = clienteService.findById(id);
        if(c.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(c.get());
    }

    @PostMapping(value = "/cliente/")
    public ResponseEntity<?> guardarCliente(@RequestBody Cliente cliente){
        Cliente clienteDb = clienteService.save(cliente);
        return ResponseEntity.status(HttpStatus.CREATED).body(cliente);
    }

    @PutMapping(value = "/cliente/{id}")
    public ResponseEntity<?> actualizarCliente(@RequestBody Cliente cliente, @PathVariable Long id){
        Optional<Cliente> c = clienteService.findById(id);
        if (c.isEmpty()){
            return ResponseEntity.notFound().build();
        }

        Cliente clienteDb = c.get();
        clienteDb.setNombres(cliente.getNombres());
        clienteDb.setApellidos(cliente.getApellidos());
        clienteDb.setNombreEmpresa(cliente.getNombreEmpresa());
        clienteDb.setNit(cliente.getNit());
        clienteDb.setDireccion(cliente.getDireccion());
        clienteDb.setCui(cliente.getCui());
        clienteDb.setLatitud(cliente.getLatitud());
        clienteDb.setLongitud(cliente.getLongitud());
        //clienteDb.setVisitas(cliente.getVisitas());


        return ResponseEntity.status(HttpStatus.CREATED).body(clienteService.save(clienteDb));
    }

/*----------------------Controlador Visita------------------------*/

    @PostMapping(value = "/visita/")
    public ResponseEntity<?> crear(@RequestBody Iterable<Visita> visitas){
        Iterable<Visita> visitaDb = visitaService.saveAll(visitas);
        return ResponseEntity.status(HttpStatus.CREATED).body(visitaDb);
    }

    @GetMapping(value = "/empleado-visitas/{empleadoId}")
    public ResponseEntity<?> obtnerVisitaPorEmpleado(@PathVariable Long empleadoId){
        Iterable<Visita> visitas = visitaService.findEmpleadoByVisita(empleadoId);
        return ResponseEntity.ok(visitas);
    }

    @GetMapping(value = "/visitas")
    public ResponseEntity<?> obtenerVisitas(){
        return ResponseEntity.ok().body(visitaService.findAll());
    }


    /*-----------------------------Controlador Serivicios----------------------*/

    @GetMapping(value = "/servicios")
    public ResponseEntity<?> obtenerServicios(){
        return ResponseEntity.ok().body(servicioService.findAll());
    }

    @PostMapping(value = "/servicio/")
    public ResponseEntity<?> crearServicio(@RequestBody Servicio servicio){
        Servicio servicioDb = servicioService.save(servicio);

        return ResponseEntity.status(HttpStatus.CREATED).body(servicioDb);
    }





}


