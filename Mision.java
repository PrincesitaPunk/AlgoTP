/**
 * Define la característica básica de un Mision en la Batalla Espacial
 */
public interface Mision {
    /**
     * Establece la mision que un {@link Mision} efectúa
     * 
     * @return si lo completó o no
     */
    public boolean completarMision();
}
