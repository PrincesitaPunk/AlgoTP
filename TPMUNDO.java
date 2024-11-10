import greenfoot.*;

public class TPMUNDO extends MundoBase {
    
    /**
    *Se crea las dimensiones del escenario 
    */
    public TPMUNDO() {
        super(aleatorioEntre(10, 18), aleatorioEntre(8, 14));        
        generarTodo();
    }

    private static int aleatorioEntre(int desde, int hasta) {
        return desde + (int) (Math.random() * (hasta - desde));
    }
    
    @Override
    protected void generarPOIs() {
        int ancho = getWidth();
        int alto = getHeight();

        int xNaveAliada = ancho / 2;
        int yNaveAliada = 3 * alto / 5;
        
        marcarCelda(xNaveAliada, yNaveAliada, new Color(0, 0, 200, 150));
    }
    
    /**
    *Se crean los objetos iniciales dentro del escenario 
    */
    private void generarTodo() {
        int ancho = getWidth();
        int alto = getHeight();
    
        int xNaveAliada = ancho / 2;
        int yNaveAliada = 3 * alto / 5;
    
        NaveDeAtaque naveAliada = new NaveDeAtaque();
        agregar(naveAliada, xNaveAliada, yNaveAliada);
        agregar(new portal(), 9, 9);
        agregar(new portal(), 3, 3);
     
    
        int yNaveEnemiga = 4 * alto / 5;
        runner naveEnemiga = new runner(Direccion.NORTE);
        agregar(naveEnemiga, 15, yNaveEnemiga);
        
        naveAliada.setEnemigo(naveEnemiga); // AGREGADO PARA LA NAVE RUNNER
    
    }
}

