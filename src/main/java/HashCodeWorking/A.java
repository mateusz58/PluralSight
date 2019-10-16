package HashCodeWorking;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
class B {
    @Override
    public int hashCode() {
        return 0;
    }
}
class BHashCodeDefault {
}
class A {
    int a;
    public A(int a) {
        this.a = a;
    }
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof A)) {
            return false;
        }
        A o1 = (A) o;
        return Integer.compare(a, o1.a) == 0;
    }
    @Override
    public int hashCode() {
        return Objects.hash(a);
    }
}

class HashTest {
    public static void main(String[] args) {
        Set<B> set1 = new HashSet<>();
        B B1 = new B();
        B B2 = new B();
        B B3 = new B();
        set1.add(B1);
        set1.add(B2);
        set1.add(B3);
        System.out.println(set1.size());
        Set<BHashCodeDefault> set2 = new HashSet<>();
        BHashCodeDefault BHashCodeDefault1 = new BHashCodeDefault();
        BHashCodeDefault BHashCodeDefault2 = new BHashCodeDefault();
        BHashCodeDefault BHashCodeDefault3 = new BHashCodeDefault();
        set2.add(BHashCodeDefault1);
        set2.add(BHashCodeDefault2);
        set2.add(BHashCodeDefault3);
        System.out.println(set2.size());
        Set<A> set3 = new HashSet<>();
        A a1 = new A(1);
        A a2 = new A(1);
        A a3 = new A(1);
        set3.add(a1);
        set3.add(a2);
        set3.add(a3);
        System.out.println(set3.size());
    }
}
