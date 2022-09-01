package j$.util.concurrent;

import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public class ConcurrentHashMap<K, V> extends AbstractMap<K, V> implements java.util.concurrent.ConcurrentMap<K, V>, Serializable, ConcurrentMap<K, V> {
    static final int g = Runtime.getRuntime().availableProcessors();
    private static final j$.sun.misc.b h;
    private static final long i;
    private static final long j;
    private static final long k;
    private static final long l;
    private static final long m;
    private static final int n;
    private static final int o;
    private static final ObjectStreamField[] serialPersistentFields;
    private static final long serialVersionUID = 7249069246763182397L;
    volatile transient l[] a;
    private volatile transient l[] b;
    private volatile transient long baseCount;
    private volatile transient c[] c;
    private volatile transient int cellsBusy;
    private transient i d;
    private transient t e;
    private transient e f;
    private volatile transient int sizeCtl;
    private volatile transient int transferIndex;

    static {
        Class cls = Integer.TYPE;
        serialPersistentFields = new ObjectStreamField[]{new ObjectStreamField("segments", o[].class), new ObjectStreamField("segmentMask", cls), new ObjectStreamField("segmentShift", cls)};
        j$.sun.misc.b h2 = j$.sun.misc.b.h();
        h = h2;
        i = h2.j(ConcurrentHashMap.class, "sizeCtl");
        j = h2.j(ConcurrentHashMap.class, "transferIndex");
        k = h2.j(ConcurrentHashMap.class, "baseCount");
        l = h2.j(ConcurrentHashMap.class, "cellsBusy");
        m = h2.j(c.class, "value");
        n = h2.a(l[].class);
        int b = h2.b(l[].class);
        if (((b - 1) & b) == 0) {
            o = 31 - Integer.numberOfLeadingZeros(b);
            return;
        }
        throw new ExceptionInInitializerError("array index scale not a power of two");
    }

    public ConcurrentHashMap() {
    }

    public ConcurrentHashMap(int i2) {
        this(i2, 0.75f, 1);
    }

    public ConcurrentHashMap(int i2, float f, int i3) {
        if (f <= 0.0f || i2 < 0 || i3 <= 0) {
            throw new IllegalArgumentException();
        }
        double d = (i2 < i3 ? i3 : i2) / f;
        Double.isNaN(d);
        long j2 = (long) (d + 1.0d);
        this.sizeCtl = j2 >= 1073741824 ? 1073741824 : m((int) j2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:155:0x013b, code lost:
        if (r25.c != r7) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x013d, code lost:
        r25.c = (j$.util.concurrent.c[]) java.util.Arrays.copyOf(r7, r8 << 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001a, code lost:
        if (r1.d(r25, r3, r5, r14) == false) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:124:0x019b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00ba A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void a(long r26, int r28) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.a(long, int):void");
    }

    static final boolean b(l[] lVarArr, int i2, l lVar) {
        long j2 = i2 << o;
        return h.e(lVarArr, n + j2, lVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Class c(Object obj) {
        Type[] actualTypeArguments;
        if (obj instanceof Comparable) {
            Class<?> cls = obj.getClass();
            if (cls == String.class) {
                return cls;
            }
            Type[] genericInterfaces = cls.getGenericInterfaces();
            if (genericInterfaces == null) {
                return null;
            }
            for (Type type : genericInterfaces) {
                if (type instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) type;
                    if (parameterizedType.getRawType() == Comparable.class && (actualTypeArguments = parameterizedType.getActualTypeArguments()) != null && actualTypeArguments.length == 1 && actualTypeArguments[0] == cls) {
                        return cls;
                    }
                }
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int d(Class cls, Object obj, Object obj2) {
        if (obj2 == null || obj2.getClass() != cls) {
            return 0;
        }
        return ((Comparable) obj).compareTo(obj2);
    }

    private final l[] f() {
        while (true) {
            l[] lVarArr = this.a;
            if (lVarArr == null || lVarArr.length == 0) {
                int i2 = this.sizeCtl;
                if (i2 < 0) {
                    Thread.yield();
                } else if (h.c(this, i, i2, -1)) {
                    try {
                        l[] lVarArr2 = this.a;
                        if (lVarArr2 == null || lVarArr2.length == 0) {
                            int i3 = i2 > 0 ? i2 : 16;
                            l[] lVarArr3 = new l[i3];
                            this.a = lVarArr3;
                            i2 = i3 - (i3 >>> 2);
                            lVarArr2 = lVarArr3;
                        }
                        this.sizeCtl = i2;
                        return lVarArr2;
                    } catch (Throwable th) {
                        this.sizeCtl = i2;
                        throw th;
                    }
                }
            } else {
                return lVarArr;
            }
        }
    }

    static final void i(l[] lVarArr, int i2, l lVar) {
        h.l(lVarArr, (i2 << o) + n, lVar);
    }

    static final int j(int i2) {
        return (i2 ^ (i2 >>> 16)) & Integer.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final l l(l[] lVarArr, int i2) {
        return (l) h.g(lVarArr, (i2 << o) + n);
    }

    private static final int m(int i2) {
        int numberOfLeadingZeros = (-1) >>> Integer.numberOfLeadingZeros(i2 - 1);
        if (numberOfLeadingZeros < 0) {
            return 1;
        }
        if (numberOfLeadingZeros < 1073741824) {
            return 1 + numberOfLeadingZeros;
        }
        return 1073741824;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10, types: [j$.util.concurrent.l] */
    /* JADX WARN: Type inference failed for: r13v12, types: [j$.util.concurrent.l] */
    /* JADX WARN: Type inference failed for: r6v17, types: [j$.util.concurrent.l] */
    /* JADX WARN: Type inference failed for: r6v22, types: [j$.util.concurrent.l] */
    private final void n(l[] lVarArr, l[] lVarArr2) {
        int i2;
        int i3;
        l[] lVarArr3;
        ConcurrentHashMap<K, V> concurrentHashMap;
        l[] lVarArr4;
        int i4;
        int i5;
        int i6;
        g gVar;
        ConcurrentHashMap<K, V> concurrentHashMap2;
        int i7;
        l lVar;
        l lVar2;
        s sVar;
        int i8;
        ConcurrentHashMap<K, V> concurrentHashMap3 = this;
        int length = lVarArr.length;
        int i9 = g;
        if (i9 > 1) {
            i2 = (length >>> 3) / i9;
        } else {
            i2 = length;
        }
        if (i2 < 16) {
            i3 = 16;
        } else {
            i3 = i2;
        }
        if (lVarArr2 == null) {
            try {
                l[] lVarArr5 = new l[length << 1];
                concurrentHashMap3.b = lVarArr5;
                concurrentHashMap3.transferIndex = length;
                lVarArr3 = lVarArr5;
            } catch (Throwable unused) {
                concurrentHashMap3.sizeCtl = Integer.MAX_VALUE;
                return;
            }
        } else {
            lVarArr3 = lVarArr2;
        }
        int length2 = lVarArr3.length;
        g gVar2 = new g(lVarArr3);
        l[] lVarArr6 = lVarArr;
        ConcurrentHashMap<K, V> concurrentHashMap4 = concurrentHashMap3;
        int i10 = 0;
        int i11 = 0;
        boolean z = true;
        boolean z2 = false;
        while (true) {
            if (z) {
                int i12 = i10 - 1;
                if (i12 < i11 && !z2) {
                    int i13 = concurrentHashMap4.transferIndex;
                    if (i13 <= 0) {
                        concurrentHashMap = concurrentHashMap4;
                        lVarArr4 = lVarArr6;
                        i10 = -1;
                    } else {
                        j$.sun.misc.b bVar = h;
                        long j2 = j;
                        if (i13 > i3) {
                            i4 = i13 - i3;
                        } else {
                            i4 = 0;
                        }
                        concurrentHashMap = concurrentHashMap4;
                        lVarArr4 = lVarArr6;
                        int i14 = i11;
                        if (bVar.c(this, j2, i13, i4)) {
                            i10 = i13 - 1;
                            i11 = i4;
                        } else {
                            lVarArr6 = lVarArr4;
                            i10 = i12;
                            i11 = i14;
                            concurrentHashMap4 = concurrentHashMap;
                        }
                    }
                } else {
                    concurrentHashMap = concurrentHashMap4;
                    lVarArr4 = lVarArr6;
                    i10 = i12;
                    i11 = i11;
                }
                lVarArr6 = lVarArr4;
                concurrentHashMap4 = concurrentHashMap;
                z = false;
            } else {
                ConcurrentHashMap<K, V> concurrentHashMap5 = concurrentHashMap4;
                l[] lVarArr7 = lVarArr6;
                int i15 = i11;
                s sVar2 = null;
                if (i10 >= 0 && i10 < length && (i7 = i10 + length) < length2) {
                    l l2 = l(lVarArr7, i10);
                    if (l2 == null) {
                        z = b(lVarArr7, i10, gVar2);
                        i5 = i3;
                        gVar = gVar2;
                        lVarArr6 = lVarArr7;
                        concurrentHashMap4 = concurrentHashMap5;
                        i6 = length2;
                    } else {
                        int i16 = l2.a;
                        if (i16 == -1) {
                            concurrentHashMap2 = concurrentHashMap3;
                            i5 = i3;
                            gVar = gVar2;
                            lVarArr6 = lVarArr7;
                            concurrentHashMap4 = concurrentHashMap5;
                            z = true;
                            i6 = length2;
                        } else {
                            synchronized (l2) {
                                if (l(lVarArr7, i10) == l2) {
                                    if (i16 >= 0) {
                                        int i17 = i16 & length;
                                        s sVar3 = l2;
                                        for (s sVar4 = l2.d; sVar4 != null; sVar4 = sVar4.d) {
                                            int i18 = sVar4.a & length;
                                            if (i18 != i17) {
                                                sVar3 = sVar4;
                                                i17 = i18;
                                            }
                                        }
                                        if (i17 == 0) {
                                            sVar = sVar3;
                                        } else {
                                            sVar = null;
                                            sVar2 = sVar3;
                                        }
                                        l lVar3 = l2;
                                        while (lVar3 != sVar3) {
                                            int i19 = lVar3.a;
                                            s sVar5 = sVar3;
                                            Object obj = lVar3.b;
                                            int i20 = i3;
                                            Object obj2 = lVar3.c;
                                            if ((i19 & length) == 0) {
                                                i8 = length2;
                                                sVar = new l(i19, obj, obj2, sVar);
                                            } else {
                                                i8 = length2;
                                                sVar2 = new l(i19, obj, obj2, sVar2);
                                            }
                                            lVar3 = lVar3.d;
                                            sVar3 = sVar5;
                                            i3 = i20;
                                            length2 = i8;
                                        }
                                        i5 = i3;
                                        i6 = length2;
                                        i(lVarArr3, i10, sVar);
                                        i(lVarArr3, i7, sVar2);
                                        i(lVarArr7, i10, gVar2);
                                        gVar = gVar2;
                                    } else {
                                        i5 = i3;
                                        i6 = length2;
                                        if (l2 instanceof r) {
                                            r rVar = (r) l2;
                                            s sVar6 = null;
                                            s sVar7 = null;
                                            l lVar4 = rVar.f;
                                            int i21 = 0;
                                            int i22 = 0;
                                            s sVar8 = null;
                                            while (lVar4 != null) {
                                                r rVar2 = rVar;
                                                int i23 = lVar4.a;
                                                g gVar3 = gVar2;
                                                s sVar9 = new s(i23, lVar4.b, lVar4.c, null, null);
                                                if ((i23 & length) == 0) {
                                                    sVar9.h = sVar7;
                                                    if (sVar7 == null) {
                                                        sVar2 = sVar9;
                                                    } else {
                                                        sVar7.d = sVar9;
                                                    }
                                                    i21++;
                                                    sVar7 = sVar9;
                                                } else {
                                                    sVar9.h = sVar6;
                                                    if (sVar6 == null) {
                                                        sVar8 = sVar9;
                                                    } else {
                                                        sVar6.d = sVar9;
                                                    }
                                                    i22++;
                                                    sVar6 = sVar9;
                                                }
                                                lVar4 = lVar4.d;
                                                rVar = rVar2;
                                                gVar2 = gVar3;
                                            }
                                            r rVar3 = rVar;
                                            g gVar4 = gVar2;
                                            if (i21 <= 6) {
                                                lVar = q(sVar2);
                                            } else if (i22 != 0) {
                                                lVar = new r(sVar2);
                                            } else {
                                                lVar = rVar3;
                                            }
                                            if (i22 <= 6) {
                                                lVar2 = q(sVar8);
                                            } else if (i21 != 0) {
                                                lVar2 = new r(sVar8);
                                            } else {
                                                lVar2 = rVar3;
                                            }
                                            i(lVarArr3, i10, lVar);
                                            i(lVarArr3, i7, lVar2);
                                            gVar = gVar4;
                                            i(lVarArr, i10, gVar);
                                            lVarArr7 = lVarArr;
                                        }
                                    }
                                    z = true;
                                } else {
                                    i5 = i3;
                                    i6 = length2;
                                }
                                gVar = gVar2;
                            }
                            concurrentHashMap4 = this;
                            lVarArr6 = lVarArr7;
                        }
                    }
                    concurrentHashMap2 = this;
                } else {
                    i5 = i3;
                    i6 = length2;
                    gVar = gVar2;
                    if (z2) {
                        this.b = null;
                        this.a = lVarArr3;
                        this.sizeCtl = (length << 1) - (length >>> 1);
                        return;
                    }
                    concurrentHashMap2 = this;
                    j$.sun.misc.b bVar2 = h;
                    long j3 = i;
                    int i24 = concurrentHashMap2.sizeCtl;
                    int i25 = i10;
                    if (bVar2.c(this, j3, i24, i24 - 1)) {
                        if (i24 - 2 != ((Integer.numberOfLeadingZeros(length) | 32768) << 16)) {
                            return;
                        }
                        i10 = length;
                        concurrentHashMap4 = concurrentHashMap2;
                        lVarArr6 = lVarArr7;
                        z = true;
                        z2 = true;
                    } else {
                        concurrentHashMap4 = concurrentHashMap2;
                        i10 = i25;
                        lVarArr6 = lVarArr7;
                    }
                }
                gVar2 = gVar;
                concurrentHashMap3 = concurrentHashMap2;
                i11 = i15;
                i3 = i5;
                length2 = i6;
            }
        }
    }

    private final void o(l[] lVarArr, int i2) {
        int length = lVarArr.length;
        if (length < 64) {
            p(length << 1);
            return;
        }
        l l2 = l(lVarArr, i2);
        if (l2 == null || l2.a < 0) {
            return;
        }
        synchronized (l2) {
            if (l(lVarArr, i2) == l2) {
                s sVar = null;
                l lVar = l2;
                s sVar2 = null;
                while (lVar != null) {
                    s sVar3 = new s(lVar.a, lVar.b, lVar.c, null, null);
                    sVar3.h = sVar2;
                    if (sVar2 == null) {
                        sVar = sVar3;
                    } else {
                        sVar2.d = sVar3;
                    }
                    lVar = lVar.d;
                    sVar2 = sVar3;
                }
                i(lVarArr, i2, new r(sVar));
            }
        }
    }

    private final void p(int i2) {
        int m2;
        int i3;
        int length;
        if (i2 >= 536870912) {
            m2 = 1073741824;
        } else {
            m2 = m(i2 + (i2 >>> 1) + 1);
        }
        while (true) {
            int i4 = this.sizeCtl;
            if (i4 >= 0) {
                l[] lVarArr = this.a;
                if (lVarArr != null && (length = lVarArr.length) != 0) {
                    if (m2 > i4 && length < 1073741824) {
                        if (lVarArr == this.a && h.c(this, i, i4, ((Integer.numberOfLeadingZeros(length) | 32768) << 16) + 2)) {
                            n(lVarArr, null);
                        }
                    } else {
                        return;
                    }
                } else {
                    if (i4 > m2) {
                        i3 = i4;
                    } else {
                        i3 = m2;
                    }
                    if (h.c(this, i, i4, -1)) {
                        try {
                            if (this.a == lVarArr) {
                                this.a = new l[i3];
                                i4 = i3 - (i3 >>> 2);
                            }
                        } finally {
                            this.sizeCtl = i4;
                        }
                    } else {
                        continue;
                    }
                }
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [j$.util.concurrent.l] */
    static l q(s sVar) {
        l lVar = null;
        l lVar2 = null;
        for (s sVar2 = sVar; sVar2 != null; sVar2 = sVar2.d) {
            l lVar3 = new l(sVar2.a, sVar2.b, sVar2.c);
            if (lVar2 == null) {
                lVar = lVar3;
            } else {
                lVar2.d = lVar3;
            }
            lVar2 = lVar3;
        }
        return lVar;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        long j2;
        boolean z;
        boolean z2;
        Object obj;
        this.sizeCtl = -1;
        objectInputStream.defaultReadObject();
        long j3 = 0;
        long j4 = 0;
        l lVar = null;
        while (true) {
            Object readObject = objectInputStream.readObject();
            Object readObject2 = objectInputStream.readObject();
            j2 = 1;
            if (readObject == null || readObject2 == null) {
                break;
            }
            j4++;
            lVar = new l(j(readObject.hashCode()), readObject, readObject2, lVar);
        }
        if (j4 == 0) {
            this.sizeCtl = 0;
            return;
        }
        double d = ((float) j4) / 0.75f;
        Double.isNaN(d);
        Double.isNaN(d);
        long j5 = (long) (d + 1.0d);
        int m2 = j5 >= 1073741824 ? 1073741824 : m((int) j5);
        l[] lVarArr = new l[m2];
        int i2 = m2 - 1;
        while (lVar != null) {
            l lVar2 = lVar.d;
            int i3 = lVar.a;
            int i4 = i3 & i2;
            l l2 = l(lVarArr, i4);
            if (l2 == null) {
                z2 = true;
            } else {
                Object obj2 = lVar.b;
                if (l2.a >= 0) {
                    int i5 = 0;
                    for (l lVar3 = l2; lVar3 != null; lVar3 = lVar3.d) {
                        if (lVar3.a == i3 && ((obj = lVar3.b) == obj2 || (obj != null && obj2.equals(obj)))) {
                            z = false;
                            break;
                        }
                        i5++;
                    }
                    z = true;
                    if (!z || i5 < 8) {
                        z2 = z;
                    } else {
                        long j6 = j3 + 1;
                        lVar.d = l2;
                        l lVar4 = lVar;
                        s sVar = null;
                        s sVar2 = null;
                        while (lVar4 != null) {
                            long j7 = j6;
                            s sVar3 = new s(lVar4.a, lVar4.b, lVar4.c, null, null);
                            sVar3.h = sVar2;
                            if (sVar2 == null) {
                                sVar = sVar3;
                            } else {
                                sVar2.d = sVar3;
                            }
                            lVar4 = lVar4.d;
                            sVar2 = sVar3;
                            j6 = j7;
                        }
                        i(lVarArr, i4, new r(sVar));
                        j3 = j6;
                    }
                } else if (((r) l2).e(i3, obj2, lVar.c) == null) {
                    j3 += j2;
                }
                z2 = false;
            }
            j2 = 1;
            if (z2) {
                j3++;
                lVar.d = l2;
                i(lVarArr, i4, lVar);
            }
            lVar = lVar2;
        }
        this.a = lVarArr;
        this.sizeCtl = m2 - (m2 >>> 2);
        this.baseCount = j3;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        int i2 = 1;
        int i3 = 0;
        while (i2 < 16) {
            i3++;
            i2 <<= 1;
        }
        int i4 = 32 - i3;
        int i5 = i2 - 1;
        o[] oVarArr = new o[16];
        for (int i6 = 0; i6 < 16; i6++) {
            oVarArr[i6] = new o();
        }
        ObjectOutputStream.PutField putFields = objectOutputStream.putFields();
        putFields.put("segments", oVarArr);
        putFields.put("segmentShift", i4);
        putFields.put("segmentMask", i5);
        objectOutputStream.writeFields();
        l[] lVarArr = this.a;
        if (lVarArr != null) {
            q qVar = new q(lVarArr, lVarArr.length, 0, lVarArr.length);
            while (true) {
                l c = qVar.c();
                if (c == null) {
                    break;
                }
                objectOutputStream.writeObject(c.b);
                objectOutputStream.writeObject(c.c);
            }
        }
        objectOutputStream.writeObject(null);
        objectOutputStream.writeObject(null);
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public void clear() {
        l l2;
        l[] lVarArr = this.a;
        long j2 = 0;
        loop0: while (true) {
            int i2 = 0;
            while (lVarArr != null && i2 < lVarArr.length) {
                l2 = l(lVarArr, i2);
                if (l2 == null) {
                    i2++;
                } else {
                    int i3 = l2.a;
                    if (i3 == -1) {
                        break;
                    }
                    synchronized (l2) {
                        if (l(lVarArr, i2) == l2) {
                            for (l lVar = i3 >= 0 ? l2 : l2 instanceof r ? ((r) l2).f : null; lVar != null; lVar = lVar.d) {
                                j2--;
                            }
                            i(lVarArr, i2, null);
                            i2++;
                        }
                    }
                }
            }
            lVarArr = e(lVarArr, l2);
        }
        if (j2 != 0) {
            a(j2, -1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x010f, code lost:
        if (r3 == 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0111, code lost:
        a(r3, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0115, code lost:
        return r5;
     */
    @Override // j$.util.concurrent.ConcurrentMap, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object compute(java.lang.Object r14, j$.util.function.BiFunction r15) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.compute(java.lang.Object, j$.util.function.BiFunction):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f0, code lost:
        if (r5 == null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f2, code lost:
        a(1, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f7, code lost:
        return r5;
     */
    @Override // j$.util.concurrent.ConcurrentMap, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object computeIfAbsent(java.lang.Object r12, j$.util.function.Function r13) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.computeIfAbsent(java.lang.Object, j$.util.function.Function):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x00a9, code lost:
        throw new java.lang.IllegalStateException("Recursive update");
     */
    @Override // j$.util.concurrent.ConcurrentMap, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object computeIfPresent(java.lang.Object r14, j$.util.function.BiFunction r15) {
        /*
            Method dump skipped, instructions count: 191
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.computeIfPresent(java.lang.Object, j$.util.function.BiFunction):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public final boolean containsValue(Object obj) {
        if (obj != null) {
            l[] lVarArr = this.a;
            if (lVarArr != null) {
                q qVar = new q(lVarArr, lVarArr.length, 0, lVarArr.length);
                while (true) {
                    l c = qVar.c();
                    if (c == null) {
                        break;
                    }
                    Object obj2 = c.c;
                    if (obj2 == obj) {
                        return true;
                    }
                    if (obj2 != null && obj.equals(obj2)) {
                        return true;
                    }
                }
            }
            return false;
        }
        throw null;
    }

    final l[] e(l[] lVarArr, l lVar) {
        l[] lVarArr2;
        int i2;
        if ((lVar instanceof g) && (lVarArr2 = ((g) lVar).e) != null) {
            int numberOfLeadingZeros = Integer.numberOfLeadingZeros(lVarArr.length) | 32768;
            while (true) {
                if (lVarArr2 != this.b || this.a != lVarArr || (i2 = this.sizeCtl) >= 0 || (i2 >>> 16) != numberOfLeadingZeros || i2 == numberOfLeadingZeros + 1 || i2 == 65535 + numberOfLeadingZeros || this.transferIndex <= 0) {
                    break;
                } else if (h.c(this, i, i2, i2 + 1)) {
                    n(lVarArr, lVarArr2);
                    break;
                }
            }
            return lVarArr2;
        }
        return this.a;
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        e eVar = this.f;
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e(this);
        this.f = eVar2;
        return eVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public final boolean equals(Object obj) {
        V value;
        V v;
        if (obj != this) {
            if (!(obj instanceof Map)) {
                return false;
            }
            Map map = (Map) obj;
            l[] lVarArr = this.a;
            int length = lVarArr == null ? 0 : lVarArr.length;
            q qVar = new q(lVarArr, length, 0, length);
            while (true) {
                l c = qVar.c();
                if (c == null) {
                    for (Map.Entry<K, V> entry : map.entrySet()) {
                        K key = entry.getKey();
                        if (key == null || (value = entry.getValue()) == null || (v = get(key)) == null || (value != v && !value.equals(v))) {
                            return false;
                        }
                    }
                    return true;
                }
                Object obj2 = c.c;
                Object obj3 = map.get(c.b);
                if (obj3 == null || (obj3 != obj2 && !obj3.equals(obj2))) {
                    break;
                }
            }
            return false;
        }
        return true;
    }

    @Override // j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final void forEach(BiConsumer biConsumer) {
        if (biConsumer != null) {
            l[] lVarArr = this.a;
            if (lVarArr == null) {
                return;
            }
            q qVar = new q(lVarArr, lVarArr.length, 0, lVarArr.length);
            while (true) {
                l c = qVar.c();
                if (c == null) {
                    return;
                }
                biConsumer.accept(c.b, c.c);
            }
        } else {
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00b1, code lost:
        a(1, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00b6, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00a2, code lost:
        throw new java.lang.IllegalStateException("Recursive update");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(java.lang.Object r9, java.lang.Object r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 195
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.g(java.lang.Object, java.lang.Object, boolean):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x004d, code lost:
        return (V) r1.c;
     */
    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public V get(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r5.hashCode()
            int r0 = j(r0)
            j$.util.concurrent.l[] r1 = r4.a
            r2 = 0
            if (r1 == 0) goto L4e
            int r3 = r1.length
            if (r3 <= 0) goto L4e
            int r3 = r3 + (-1)
            r3 = r3 & r0
            j$.util.concurrent.l r1 = l(r1, r3)
            if (r1 == 0) goto L4e
            int r3 = r1.a
            if (r3 != r0) goto L2c
            java.lang.Object r3 = r1.b
            if (r3 == r5) goto L29
            if (r3 == 0) goto L37
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L37
        L29:
            java.lang.Object r5 = r1.c
            return r5
        L2c:
            if (r3 >= 0) goto L37
            j$.util.concurrent.l r5 = r1.a(r0, r5)
            if (r5 == 0) goto L36
            java.lang.Object r2 = r5.c
        L36:
            return r2
        L37:
            j$.util.concurrent.l r1 = r1.d
            if (r1 == 0) goto L4e
            int r3 = r1.a
            if (r3 != r0) goto L37
            java.lang.Object r3 = r1.b
            if (r3 == r5) goto L4b
            if (r3 == 0) goto L37
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L37
        L4b:
            java.lang.Object r5 = r1.c
            return r5
        L4e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        V v = get(obj);
        return v == null ? obj2 : v;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00a9, code lost:
        throw new java.lang.IllegalStateException("Recursive update");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(java.lang.Object r13, java.lang.Object r14, java.lang.Object r15) {
        /*
            r12 = this;
            int r0 = r13.hashCode()
            int r0 = j(r0)
            j$.util.concurrent.l[] r1 = r12.a
        La:
            r2 = 0
            if (r1 == 0) goto Lbb
            int r3 = r1.length
            if (r3 == 0) goto Lbb
            int r3 = r3 + (-1)
            r3 = r3 & r0
            j$.util.concurrent.l r4 = l(r1, r3)
            if (r4 != 0) goto L1b
            goto Lbb
        L1b:
            int r5 = r4.a
            r6 = -1
            if (r5 != r6) goto L25
            j$.util.concurrent.l[] r1 = r12.e(r1, r4)
            goto La
        L25:
            monitor-enter(r4)
            j$.util.concurrent.l r7 = l(r1, r3)     // Catch: java.lang.Throwable -> L9b
            if (r7 != r4) goto Laa
            r7 = 1
            if (r5 < 0) goto L67
            r8 = r2
            r5 = r4
        L31:
            int r9 = r5.a     // Catch: java.lang.Throwable -> L9b
            if (r9 != r0) goto L5e
            java.lang.Object r9 = r5.b     // Catch: java.lang.Throwable -> L9b
            if (r9 == r13) goto L41
            if (r9 == 0) goto L5e
            boolean r9 = r13.equals(r9)     // Catch: java.lang.Throwable -> L9b
            if (r9 == 0) goto L5e
        L41:
            java.lang.Object r9 = r5.c     // Catch: java.lang.Throwable -> L9b
            if (r15 == 0) goto L4f
            if (r15 == r9) goto L4f
            if (r9 == 0) goto Lab
            boolean r10 = r15.equals(r9)     // Catch: java.lang.Throwable -> L9b
            if (r10 == 0) goto Lab
        L4f:
            if (r14 == 0) goto L54
            r5.c = r14     // Catch: java.lang.Throwable -> L9b
            goto Lac
        L54:
            if (r8 == 0) goto L5b
            j$.util.concurrent.l r3 = r5.d     // Catch: java.lang.Throwable -> L9b
            r8.d = r3     // Catch: java.lang.Throwable -> L9b
            goto Lac
        L5b:
            j$.util.concurrent.l r5 = r5.d     // Catch: java.lang.Throwable -> L9b
            goto L97
        L5e:
            j$.util.concurrent.l r8 = r5.d     // Catch: java.lang.Throwable -> L9b
            if (r8 != 0) goto L63
            goto Lab
        L63:
            r11 = r8
            r8 = r5
            r5 = r11
            goto L31
        L67:
            boolean r5 = r4 instanceof j$.util.concurrent.r     // Catch: java.lang.Throwable -> L9b
            if (r5 == 0) goto L9d
            r5 = r4
            j$.util.concurrent.r r5 = (j$.util.concurrent.r) r5     // Catch: java.lang.Throwable -> L9b
            j$.util.concurrent.s r8 = r5.e     // Catch: java.lang.Throwable -> L9b
            if (r8 == 0) goto Lab
            j$.util.concurrent.s r8 = r8.b(r0, r13, r2)     // Catch: java.lang.Throwable -> L9b
            if (r8 == 0) goto Lab
            java.lang.Object r9 = r8.c     // Catch: java.lang.Throwable -> L9b
            if (r15 == 0) goto L86
            if (r15 == r9) goto L86
            if (r9 == 0) goto Lab
            boolean r10 = r15.equals(r9)     // Catch: java.lang.Throwable -> L9b
            if (r10 == 0) goto Lab
        L86:
            if (r14 == 0) goto L8b
            r8.c = r14     // Catch: java.lang.Throwable -> L9b
            goto Lac
        L8b:
            boolean r8 = r5.f(r8)     // Catch: java.lang.Throwable -> L9b
            if (r8 == 0) goto Lac
            j$.util.concurrent.s r5 = r5.f     // Catch: java.lang.Throwable -> L9b
            j$.util.concurrent.l r5 = q(r5)     // Catch: java.lang.Throwable -> L9b
        L97:
            i(r1, r3, r5)     // Catch: java.lang.Throwable -> L9b
            goto Lac
        L9b:
            r13 = move-exception
            goto Lb9
        L9d:
            boolean r3 = r4 instanceof j$.util.concurrent.m     // Catch: java.lang.Throwable -> L9b
            if (r3 != 0) goto La2
            goto Laa
        La2:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L9b
            java.lang.String r14 = "Recursive update"
            r13.<init>(r14)     // Catch: java.lang.Throwable -> L9b
            throw r13     // Catch: java.lang.Throwable -> L9b
        Laa:
            r7 = 0
        Lab:
            r9 = r2
        Lac:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L9b
            if (r7 == 0) goto La
            if (r9 == 0) goto Lbb
            if (r14 != 0) goto Lb8
            r13 = -1
            r12.a(r13, r6)
        Lb8:
            return r9
        Lb9:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L9b
            throw r13
        Lbb:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.h(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public final int hashCode() {
        l[] lVarArr = this.a;
        int i2 = 0;
        if (lVarArr != null) {
            q qVar = new q(lVarArr, lVarArr.length, 0, lVarArr.length);
            while (true) {
                l c = qVar.c();
                if (c == null) {
                    break;
                }
                i2 += c.c.hashCode() ^ c.b.hashCode();
            }
        }
        return i2;
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public boolean isEmpty() {
        return k() <= 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long k() {
        c[] cVarArr = this.c;
        long j2 = this.baseCount;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                if (cVar != null) {
                    j2 += cVar.value;
                }
            }
        }
        return j2;
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public Set<K> keySet() {
        i iVar = this.d;
        if (iVar != null) {
            return iVar;
        }
        i iVar2 = new i(this);
        this.d = iVar2;
        return iVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x00da, code lost:
        throw new java.lang.IllegalStateException("Recursive update");
     */
    @Override // j$.util.concurrent.ConcurrentMap, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object merge(java.lang.Object r18, java.lang.Object r19, j$.util.function.BiFunction r20) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.merge(java.lang.Object, java.lang.Object, j$.util.function.BiFunction):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public V put(K k2, V v) {
        return (V) g(k2, v, false);
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        p(map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            g(entry.getKey(), entry.getValue(), false);
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public V putIfAbsent(K k2, V v) {
        return (V) g(k2, v, true);
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public V remove(Object obj) {
        return (V) h(obj, null, null);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final boolean remove(Object obj, Object obj2) {
        if (obj != null) {
            return (obj2 == null || h(obj, null, obj2) == null) ? false : true;
        }
        throw null;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final Object replace(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            throw null;
        }
        return h(obj, obj2, null);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        if (obj == null || obj2 == null || obj3 == null) {
            throw null;
        }
        return h(obj, obj3, obj2) != null;
    }

    @Override // j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final void replaceAll(BiFunction biFunction) {
        if (biFunction != null) {
            l[] lVarArr = this.a;
            if (lVarArr == null) {
                return;
            }
            q qVar = new q(lVarArr, lVarArr.length, 0, lVarArr.length);
            while (true) {
                l c = qVar.c();
                if (c == null) {
                    return;
                }
                Object obj = c.c;
                Object obj2 = c.b;
                do {
                    Object apply = biFunction.apply(obj2, obj);
                    if (apply == null) {
                        throw null;
                    }
                    if (h(obj2, apply, obj) == null) {
                        obj = get(obj2);
                    }
                } while (obj != null);
            }
        } else {
            throw null;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public int size() {
        long k2 = k();
        if (k2 < 0) {
            return 0;
        }
        if (k2 <= 2147483647L) {
            return (int) k2;
        }
        return Integer.MAX_VALUE;
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        l[] lVarArr = this.a;
        int length = lVarArr == null ? 0 : lVarArr.length;
        q qVar = new q(lVarArr, length, 0, length);
        StringBuilder sb = new StringBuilder("{");
        l c = qVar.c();
        if (c != null) {
            while (true) {
                Object obj = c.b;
                Object obj2 = c.c;
                if (obj == this) {
                    obj = "(this Map)";
                }
                sb.append(obj);
                sb.append('=');
                if (obj2 == this) {
                    obj2 = "(this Map)";
                }
                sb.append(obj2);
                c = qVar.c();
                if (c == null) {
                    break;
                }
                sb.append(", ");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public Collection<V> values() {
        t tVar = this.e;
        if (tVar != null) {
            return tVar;
        }
        t tVar2 = new t(this);
        this.e = tVar2;
        return tVar2;
    }
}
