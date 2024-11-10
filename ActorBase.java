import greenfoot.*;

/**
 * Clase base para estandarizar los comportamientos de los actores de la Batalla
 * Espacial.
 */
public abstract class ActorBase extends Actor {
    /**
     * Es la imagen con la que inicializa el Actor
     */
    protected GreenfootImage imagenBase;

    /**
     * Punto de extensión para definir cómo debe actualizarse la imagen del Actor
     */
    protected abstract void actualizarImagen();

    /**
     * Captura las características del Actor al ser agregado al Mundo
     */
    @Override
    protected void addedToWorld(World world) {
        imagenBase = getImage();
        actualizarImagen();
    }
    
    /** 
     *Cuenta la cantidad de misiones completadas por el piloto para la destrucción de los planetas
     */
    private static int misionesCompletadas = 0;
    public static void incrementarMisiones() {
        misionesCompletadas++;
        // Verificar si se debe destruir un planeta
        
    }
}
