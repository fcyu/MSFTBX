package umich.ms.util;

import org.apache.commons.pool2.ObjectPool;
import org.apache.commons.pool2.PooledObjectFactory;
import org.apache.commons.pool2.impl.SoftReferenceObjectPool;

/**
 * A singleton pool of {@link ByteArrayHolder}s. Use it only when you need a
 * relatively large byte array, <b>AND DON'T FORGET TO RETURN OBJECTS TO THE POOL</b>
 * Created by dmitriya on 2015-02-25.
 */
public class PooledByteArrayHolders {
    protected ByteArrayHolderFactory factory;
    private final ByteArrayHolderPool pool;
    protected int defaultSize = 8192;

    private PooledByteArrayHolders() {
        factory = new ByteArrayHolderFactory(defaultSize);
        pool = new ByteArrayHolderPool(factory);
    }

    public static PooledByteArrayHolders getInstance() {
        return Holder.INSTANCE;
    }

    private static class Holder {
        private static final PooledByteArrayHolders INSTANCE = new PooledByteArrayHolders();
    }

    /**
     * You should be very careful about this one.
     * @param factory
     */
    public synchronized void setFactory(ByteArrayHolderFactory factory) {
        this.factory = factory;
    }

    public ObjectPool<ByteArrayHolder> getPool() {
        return pool;
    }


    /**
     * This class was only created for debugging purposes.
     */
    private static class ByteArrayHolderPool extends SoftReferenceObjectPool<ByteArrayHolder> {
//        IdentityHashMap<ByteArrayHolder, String> bahMap = new IdentityHashMap<>();
//        private static volatile int count = 0;
        /**
         * Create a <code>SoftReferenceObjectPool</code> with the specified factory.
         *
         * @param factory object factory to use.
         */
        public ByteArrayHolderPool(PooledObjectFactory<ByteArrayHolder> factory) {
            super(factory);
        }

        @Override
        public synchronized ByteArrayHolder borrowObject() throws Exception {
            ByteArrayHolder bah = super.borrowObject();

//            if (count > 100) {
//                System.out.printf("********* Something is not right, over 100 objects were borrowed from the pool %s\n",
//                        System.identityHashCode(this));
//            }

//            String s = bahMap.get(bah);
//            if (s == null) {
//                s = Integer.toString(++count);
//                bahMap.put(bah, s);
//            }
//            System.out.printf("========= Pool: %s ===> Borrowed BAH[%s]. BAH size: %d, Total BAHs in Pool: %d\n",
//                    System.identityHashCode(this), s, bah.getCapacity(), this.getNumActive() + getNumIdle());
            return bah;
        }
    }
}
