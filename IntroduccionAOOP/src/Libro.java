//Crear una clase Libro que contenga los siguientes atributos:
//        1. ISBN, Título, Autor, Número de páginas
//        Crear sus respectivos métodos get y set correspondientes para cada atributo. Crear el método toString()
//        para mostrar la información relativa al libro con el siguiente formato:
//        “El libro con ISBN creado por el autor tiene páginas”
//        Crear una aplicación que permita crear 2 objetos Libro (los valores que se quieran) y mostrarlos por
//        pantalla. Por último, indicar cuál de los 2 tiene más páginas.

public class Libro {
    private String isbn;
    private String titulo;
    private String autor;
    private int nroPaginas;

    public Libro(String isbn, String titulo, String autor, int nroPaginas){
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.nroPaginas = nroPaginas;
    }

    public String getIsbn(){
        return isbn;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public int getNroPaginas(){
        return nroPaginas;
    }

    public void setIsbn(String isbn){
        this.isbn = isbn;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public void setNroPaginas(int nroPaginas){
        this.nroPaginas = nroPaginas;
    }

    public String toString(){
        return "El libro " + this.titulo + " con ISBN " + this.isbn + " creado por el autor " + this.autor + " tiene " + this.nroPaginas +
                " " +
                "paginas";
    }
}
