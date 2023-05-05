package Pkges_Es03;


public class Biblioteca{

    static Libro[] libri =  new Libro[2];


    // public Biblioteca(Libro ibri){

    //     this.libri = new Libro[1000];
    // }

   
    public void AddLibro(Libro libro){

        for (int i = 0;  i < libri.length; i++){

            if (libri[i] == null){
                libri[i] = libro;
            } 
        }

    }

    static void StampaTuttiILibri(){
        
        for (int i = 0; i < libri.length; i++){

            libri[i].StampaTuttiILibri();
        
    }

    }

}
