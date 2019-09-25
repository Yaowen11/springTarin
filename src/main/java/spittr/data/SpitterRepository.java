package spittr.data;


/**
 * @author z
 */
public interface SpitterRepository {
    /**
     *
     * @param spitter
     * @return
     */
    Spitter save(Spitter spitter);

    /**
     *
     * @param username
     * @return
     */
    Spitter findByUsername(String username);
}
