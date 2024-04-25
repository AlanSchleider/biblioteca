package com.mycompany.bibliotecapoo;

import javax.swing.*;
import java.util.LinkedList;
import java.util.Scanner;

public class Biblioteca {
    private LinkedList<Libro> libros;
    public Biblioteca(){
        libros = new LinkedList<>();
    }
    public void registarLibro(Libro libro){
        libros.add(libro);
    }

    public void buscarLibro(String libro){
        for (int i = 0; i < libros.size(); i++){
            System.out.println(libro.get(i));
        }
    }

}
