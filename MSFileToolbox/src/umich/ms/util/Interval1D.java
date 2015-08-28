package umich.ms.util;

import java.util.Objects;

/**
 * A generic 1D line segment (interval). To be used with {@link IntervalST}.
 * @author Dmitry Avtonomov
 * @param <V> data type to be used for ends of the interval
 * @see IntervalST
 */
public class Interval1D<V extends Comparable<V>> implements Comparable<Interval1D<V>> {
    public final V lo;  // left endpoint
    public final V hi;  // right endpoint
    private int hashCode;

    /**
     * Precondition: {@code left <= right}
     * @param left
     * @param right
     */
    public Interval1D(V left, V right) {
        if (left == null || right == null)
            throw new IllegalArgumentException("Illegal interval: nulls not allowed");
        if (left.compareTo(right) > 0)
            throw new IllegalArgumentException("Illegal interval: left < right");
        this.lo = left;
        this.hi = right;
    }

    /**
     * Does this interval intersect that one?
     * @param other
     * @return true, if intervals share at least one point
     */
    public boolean intersects(Interval1D<V> other) {
        if (other.hi.compareTo(this.lo) < 0) return false;
        if (this.hi.compareTo(other.lo) < 0) return false;

        return true;
    }

    /** 
     * Does this interval contain a point?
     * @param x
     * @return 
     */
    public boolean contains(V x) {
        return (lo.compareTo(x) <= 0) && (x.compareTo(hi) <= 0);
    }

    @Override
    public int compareTo(Interval1D<V> other) {
        if      (this.lo.compareTo(other.lo) < 0) return -1;
        else if (this.lo.compareTo(other.lo) > 0) return +1;
        else if (this.hi.compareTo(other.hi) < 0) return -1;
        else if (this.hi.compareTo(other.hi) > 0) return +1;
        else return 0;
    }

    @Override
    public String toString() {
        return "[" + lo + ", " + hi + "]";
    }

    public V getLo() {
        return lo;
    }

    public V getHi() {
        return hi;
    }

    @Override
    public int hashCode() {
        if (hashCode == 0) {
            int hash = 7;
            hash = 41 * hash + Objects.hashCode(this.lo);
            hash = 41 * hash + Objects.hashCode(this.hi);
            hashCode = hash;
        }
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Interval1D<?> other = (Interval1D<?>) obj;
        if (!Objects.equals(this.lo, other.lo)) {
            return false;
        }
        if (!Objects.equals(this.hi, other.hi)) {
            return false;
        }
        return true;
    }



    // test client
    public static void main(String[] args) {
        Interval1D<Integer> a = new Interval1D<>(15, 20);
        Interval1D<Integer> b = new Interval1D<>(25, 30);
        Interval1D<Integer> c = new Interval1D<>(10, 40);
        Interval1D<Integer> d = new Interval1D<>(40, 50);

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        System.out.println("b intersects a = " + b.intersects(a));
        System.out.println("a intersects b = " + a.intersects(b));
        System.out.println("a intersects c = " + a.intersects(c));
        System.out.println("a intersects d = " + a.intersects(d));
        System.out.println("b intersects c = " + b.intersects(c));
        System.out.println("b intersects d = " + b.intersects(d));
        System.out.println("c intersects d = " + c.intersects(d));

    }

}
