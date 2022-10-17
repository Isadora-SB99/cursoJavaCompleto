package br.com.cod3r.exerciciossb.controllers;

import org.springframework.web.bind.annotation.*;

// /calculadora/somar/10/20
    // /calculadora/subtrair?a=10&b=20

@RestController
@RequestMapping (path = "/calculadora")
public class CalculadoraController {

    @GetMapping(path = "/somar/{a}/{b}")
    public int somar(@PathVariable int a, @PathVariable int b){
        return a+b;
    }

    @GetMapping(path = "/subtrair")
    public int subtrair(@RequestParam(name = "a") int a, @RequestParam(name = "b") int b){
        return a-b;
    }


}
