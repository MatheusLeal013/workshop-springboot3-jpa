package com.educandoweb.course.resources;

import com.educandoweb.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // recurso web que é implementando por um controlador rest
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping // Indicar que esse metodo que responde uma requisição do tipo get do http
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "Maria", "maria@gmail.com", "9999999", "12345");
        return ResponseEntity.ok().body(u);
    }
}
