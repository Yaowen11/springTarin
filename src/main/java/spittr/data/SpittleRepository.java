package spittr.data;

import java.util.List;

/**
 * @author z
 */
public interface SpittleRepository {
    /**
     * 按需查找
     * @param max
     * @param count
     * @return
     */
    List<Spittle> findSpittles(long max, int count);

    /**
     *
     * @param spittleId
     * @return
     */
    Spittle findOne(int spittleId);
}
