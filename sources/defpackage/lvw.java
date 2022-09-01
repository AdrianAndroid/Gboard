package defpackage;

import android.net.Uri;
import com.google.common.flogger.backend.google.GooglePlatform;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.logging.Level;

/* compiled from: PG */
/* renamed from: lvw  reason: default package */
/* loaded from: classes.dex */
public class lvw {
    public static mko A(final mko mkoVar, final Callable callable, final Executor executor) {
        jdg.u(callable);
        jdg.u(executor);
        final mld e = mld.e();
        mkoVar.d(new Runnable() { // from class: jng
            @Override // java.lang.Runnable
            public final void run() {
                final mld mldVar = mld.this;
                Callable callable2 = callable;
                final mko mkoVar2 = mkoVar;
                Executor executor2 = executor;
                if (mldVar.isCancelled()) {
                    return;
                }
                try {
                    final mko mkoVar3 = (mko) callable2.call();
                    if (mkoVar3 != null) {
                        mkoVar3.d(new Runnable() { // from class: jnh
                            @Override // java.lang.Runnable
                            public final void run() {
                                mko mkoVar4 = mko.this;
                                mld mldVar2 = mldVar;
                                mko mkoVar5 = mkoVar2;
                                try {
                                    kcu.S(mkoVar4);
                                } catch (ExecutionException e2) {
                                    mldVar2.n(e2.getCause());
                                } catch (Throwable th) {
                                    mldVar2.n(th);
                                }
                                mldVar2.p(mkoVar5);
                            }
                        }, executor2);
                    } else {
                        mldVar.p(mkoVar2);
                    }
                } catch (Exception e2) {
                    mldVar.n(e2);
                }
            }
        }, executor);
        return e;
    }

    public static void B(jig jigVar) {
        String str = jigVar.c;
        int i = jigVar.e;
        long j = jigVar.q;
        String str2 = jigVar.r;
    }

    public static Uri C(Uri uri) {
        String uri2 = uri.toString();
        return Uri.parse(uri2.substring(0, uri2.lastIndexOf("_")));
    }

    public static String D(String str, String str2) {
        return str + "_" + str2;
    }

    public static lvw F(lwm lwmVar) {
        return new lvw();
    }

    public static int b(Level level) {
        int intValue = level.intValue();
        if (intValue >= Level.SEVERE.intValue()) {
            return 6;
        }
        if (intValue >= Level.WARNING.intValue()) {
            return 5;
        }
        if (intValue >= Level.INFO.intValue()) {
            return 4;
        }
        return intValue >= Level.FINE.intValue() ? 3 : 2;
    }

    public static String c(String str) {
        if (str.length() > 23) {
            int i = -1;
            for (int length = str.length() - 1; length >= 0; length--) {
                char charAt = str.charAt(length);
                if (charAt == '.' || charAt == '$') {
                    i = length;
                    break;
                }
            }
            str = str.substring(i + 1);
        }
        String concat = "".concat(String.valueOf(str));
        return concat.substring(0, Math.min(concat.length(), 23));
    }

    public static lvl d() {
        try {
            try {
                try {
                    return (lvl) lvv.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (IllegalAccessException | InstantiationException | NoClassDefFoundError | NoSuchMethodException | InvocationTargetException unused) {
                    return (lvl) GooglePlatform.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                }
            } catch (IllegalAccessException | InstantiationException | NoClassDefFoundError | NoSuchMethodException | InvocationTargetException unused2) {
                return (lvl) lwi.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
        } catch (IllegalAccessException | InstantiationException | NoClassDefFoundError | NoSuchMethodException | InvocationTargetException unused3) {
            return null;
        }
    }

    public static void e(lth lthVar) {
        lxj.b(lthVar, "lazy arg");
    }

    public static int f(List list, leq leqVar, Object obj, Comparator comparator, lsj lsjVar, lsi lsiVar) {
        List H = lre.H(list, leqVar);
        jdg.u(lsjVar);
        jdg.u(lsiVar);
        if (!(H instanceof RandomAccess)) {
            H = lre.B(H);
        }
        int size = H.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            int compare = comparator.compare(obj, H.get(i2));
            if (compare < 0) {
                size = i2 - 1;
            } else if (compare <= 0) {
                H.subList(i, size + 1);
                int i3 = i2 - i;
                int ordinal = lsjVar.ordinal();
                if (ordinal == 0) {
                    return i + i3;
                }
                if (ordinal == 1) {
                    throw null;
                }
                if (ordinal == 2) {
                    throw null;
                }
                if (ordinal == 3) {
                    throw null;
                }
                if (ordinal == 4) {
                    throw null;
                }
                throw null;
            } else {
                i = i2 + 1;
            }
        }
        int ordinal2 = lsiVar.ordinal();
        if (ordinal2 != 0) {
            if (ordinal2 == 1) {
                return i;
            }
            if (ordinal2 != 2) {
                throw null;
            }
            return i ^ (-1);
        }
        return i - 1;
    }

    public static boolean g(Comparator comparator, Iterable iterable) {
        Comparator comparator2;
        jdg.u(comparator);
        jdg.u(iterable);
        if (iterable instanceof SortedSet) {
            comparator2 = ((SortedSet) iterable).comparator();
            if (comparator2 == null) {
                comparator2 = lrb.a;
            }
        } else if (!(iterable instanceof lsh)) {
            return false;
        } else {
            comparator2 = ((lsh) iterable).comparator();
        }
        return comparator.equals(comparator2);
    }

    public static int h(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i += next != null ? next.hashCode() : 0;
        }
        return i;
    }

    public static lsf i(Set set, Set set2) {
        jdg.Q(set, "set1");
        jdg.Q(set2, "set2");
        return new lsb(set, set2);
    }

    public static lsf j(Set set, Set set2) {
        jdg.Q(set, "set1");
        jdg.Q(set2, "set2");
        return new lrz(set, set2);
    }

    public static lsf k(Set set, Set set2) {
        jdg.Q(set, "set1");
        jdg.Q(set2, "set2");
        return new lrx(set, set2);
    }

    public static HashSet l() {
        return new HashSet();
    }

    public static HashSet m(int i) {
        return new HashSet(lre.l(i));
    }

    public static Set n() {
        return Collections.newSetFromMap(new ConcurrentHashMap());
    }

    public static TreeSet o(Iterable iterable) {
        TreeSet treeSet = new TreeSet();
        lre.af(treeSet, iterable);
        return treeSet;
    }

    public static boolean p(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static boolean q(Set set, Collection collection) {
        jdg.u(collection);
        if (collection instanceof lqx) {
            collection = ((lqx) collection).e();
        }
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            return r(set, collection.iterator());
        }
        Iterator it = set.iterator();
        jdg.u(collection);
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public static boolean r(Set set, Iterator it) {
        boolean z = false;
        while (it.hasNext()) {
            z |= set.remove(it.next());
        }
        return z;
    }

    public static void s(lqr lqrVar, ObjectInputStream objectInputStream, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            Collection b = lqrVar.b(objectInputStream.readObject());
            int readInt = objectInputStream.readInt();
            for (int i3 = 0; i3 < readInt; i3++) {
                b.add(objectInputStream.readObject());
            }
        }
    }

    public static void t(lqr lqrVar, ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(lqrVar.z().size());
        for (Map.Entry entry : lqrVar.z().entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(((Collection) entry.getValue()).size());
            for (Object obj : (Collection) entry.getValue()) {
                objectOutputStream.writeObject(obj);
            }
        }
    }

    public static kcl u(Class cls, String str) {
        try {
            return new kcl(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e) {
            throw new AssertionError(e);
        }
    }

    public static int v(int i) {
        if (i != 1) {
            return i - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static int w(int i) {
        if (i != 0) {
            if (i == 1) {
                return 3;
            }
            if (i == 2) {
                return 4;
            }
            if (i == 3) {
                return 5;
            }
            if (i == 4) {
                return 6;
            }
            return i != 5 ? 0 : 7;
        }
        return 2;
    }

    public static int x(int i) {
        if (i != 0) {
            if (i == 1) {
                return 3;
            }
            return i != 2 ? 0 : 4;
        }
        return 2;
    }

    public static int y(int i) {
        if (i != 1) {
            return i - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static int z(int i) {
        if (i != 0) {
            if (i == 1) {
                return 3;
            }
            if (i == 2) {
                return 4;
            }
            return i != 3 ? 0 : 5;
        }
        return 2;
    }

    public String a(lum lumVar, lvi lviVar) {
        throw null;
    }
}
