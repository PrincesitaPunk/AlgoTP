import greenfoot.*;

/**
 * Un Ceres es un obstáculo que puede ser destruido por una
 * {@link NaveDeAtaque}. Esto llevará una cierta cantidad de ataques
 */
public class Ceres extends Planetas implements Dañable {
    /**
     * {@value #TAMAÑO_MINIMO_DE_PLANETA}
     */
    protected static final int TAMAÑO_MINIMO_DE_PLANETA = 10;

    /**
     * {@value #TAMAÑO_MAXIMO_DE_PLANETA}
     */
    protected static final int TAMAÑO_MAXIMO_DE_PLANETA = 100;

    /**
     * Es el tamaño actual de los Ceres, que tiene relación directa con la cantidad
     * de ataques necesarios para eliminarlo
     */
    protected int tamaño;

    /**
     * Inicializa un Planeta con tamaño aleatorio entre 51 y 100 puntos
     */
    public Ceres() {
        this(51 + (int) (Math.random() * 50));
    }

    /**
     * Inicializa un Planeta con tamaño arbitrario, en el rango de 10 a
     * {@value #TAMAÑO_MAXIMO_DE_PLANETA} puntos
     * 
     * @param tamañoInicial
     */
    public Ceres(int tamañoInicial) {
        this.tamaño = Math.max(TAMAÑO_MINIMO_DE_PLANETA, Math.min(TAMAÑO_MAXIMO_DE_PLANETA, tamañoInicial));
    }

    /**
     * post: el Planeta reducirá su tamaño conforme la potencia del ataque. <br>
     * post: el Planeta será eliminado del tablero si su tamaño llega a 0. <br>
     * 
     * @see Dañable#recibirDañoDe(Atacante)
     */
    public void recibirDañoDe(Atacante atacante) {
        if (verificar == true){
            int daño = atacante.obtenerDaño();
            this.tamaño -= daño;
            actualizarImagen();
            Explosion.en(getWorld(), this.getX(), this.getY());
            if (this.tamaño <= 0) {
                getWorld().removeObject(this);
            }
        }
    }
    
    public void verificadorMsion(Mision mision){
        int palentasDestruidos;
        int vecesTeletransportado;
    
    
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void actualizarImagen() {
        int tamCelda = getWorld().getCellSize();
        int ancho = Math.max(30, (tamCelda * tamaño) / obtenerTamañoMaximo());
        GreenfootImage image = getImage();
        if (this.tamaño <= 0)
            image.setTransparency(0);
        image.scale(ancho, ancho);
        setImage(image);
        setRotation((int) (Math.random() * 360));
    }

    /**
     * {@value #TAMAÑO_MAXIMO_DE_PLANETA}
     * 
     * @return el tamaño máximo que puede tener un Ceres
     */
    protected int obtenerTamañoMaximo() {
        return TAMAÑO_MAXIMO_DE_PLANETA;
    }

    /**
     * {@link #tamaño}
     * 
     * @return el tamaño del Planeta
     */
    public int obtenerTamaño() {
        return this.tamaño;
    }
}
