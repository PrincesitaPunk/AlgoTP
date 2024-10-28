//copio codigo con lo agregado

private void generarTodo() {
    int ancho = getWidth();
    int alto = getHeight();

    int xNaveAliada = 0;
    int yNaveAliada = alto ;
    int xPortal = ancho / 2;
    int yPortal = 3 * alto / 5;
    int yNaveEnemiga = 4 * alto / 5;
    
    NaveDeAtaque naveAliada = new NaveDeAtaque();
    agregar(naveAliada, xNaveAliada, yNaveAliada);
    agregar(new portal2(), ancho-15, alto-6);
    agregar(new portal(), ancho-2, alto-2);
    for (int i = 0; i <alto; i++){
     agregar(new muro(),ancho/2 , alto-1-i);
    
    }


public class muro extends ActorBase {
    /**
     * {@value #COMBUSTIBLE_CONTENIDO}
     */
    private static final int COMBUSTIBLE_CONTENIDO = 100;

    private double ESCALA_X = 0.9;
    private double ESCALA_Y = 0.9;

    /**
     * Establece la imagen con la escala definida
     */
    @Override
    protected void actualizarImagen() {
        int tamCelda = getWorld().getCellSize();
        GreenfootImage image = getImage();
        image.scale((int) (tamCelda * ESCALA_X), (int) (tamCelda * ESCALA_Y));
        setImage(image);
    }

    /**
     * post: el Item desaparece del mundo
     * 
     * @return la cantidad de combustible que el Item proporciona
     */
    public int serRecogido() {
        getWorld().removeObject(this);
        Greenfoot.delay(20);
        return COMBUSTIBLE_CONTENIDO;
    }
}
