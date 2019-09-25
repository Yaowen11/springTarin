package spittr.data;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author z
 */
@Component
public class SpitterRepositoryDemo implements SpitterRepository {
    private List<Spitter> spitters;

    public SpitterRepositoryDemo() {
        this.spitters = new ArrayList<>();
    }

    @Override
    public Spitter save(Spitter spitter) {
        spitters.add(spitter);
        return spitter;
    }

    @Override
    public Spitter findByUsername(String username) {
        for (Spitter spitter: spitters) {
            if (username.equals(spitter.getUsername())) {
                return spitter;
            }
        }
        return null;
    }
}
