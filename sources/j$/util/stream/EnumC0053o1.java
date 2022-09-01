package j$.util.stream;

import j$.util.Map;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX WARN: Init of enum DISTINCT can be incorrect */
/* JADX WARN: Init of enum ORDERED can be incorrect */
/* JADX WARN: Init of enum SHORT_CIRCUIT can be incorrect */
/* JADX WARN: Init of enum SIZED can be incorrect */
/* JADX WARN: Init of enum SORTED can be incorrect */
/* renamed from: j$.util.stream.o1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC0053o1 {
    DISTINCT(0, r2),
    SORTED(1, r6),
    ORDERED(2, r8),
    SIZED(3, r11),
    SHORT_CIRCUIT(12, r14);
    
    static final int f;
    static final int g;
    static final int h;
    private static final int i;
    private static final int j;
    private static final int k;
    static final int l;
    static final int m;
    static final int n;
    static final int o;
    static final int p;
    static final int q;
    static final int r;
    static final int s;
    private final Map a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;

    static {
        EnumC0050n1 enumC0050n1 = EnumC0050n1.SPLITERATOR;
        C0047m1 f2 = f(enumC0050n1);
        EnumC0050n1 enumC0050n12 = EnumC0050n1.STREAM;
        f2.a(enumC0050n12);
        EnumC0050n1 enumC0050n13 = EnumC0050n1.OP;
        f2.a.put(enumC0050n13, 3);
        C0047m1 f3 = f(enumC0050n1);
        f3.a(enumC0050n12);
        f3.a.put(enumC0050n13, 3);
        C0047m1 f4 = f(enumC0050n1);
        f4.a(enumC0050n12);
        Map map = f4.a;
        map.put(enumC0050n13, 3);
        EnumC0050n1 enumC0050n14 = EnumC0050n1.TERMINAL_OP;
        map.put(enumC0050n14, 2);
        EnumC0050n1 enumC0050n15 = EnumC0050n1.UPSTREAM_TERMINAL_OP;
        map.put(enumC0050n15, 2);
        C0047m1 f5 = f(enumC0050n1);
        f5.a(enumC0050n12);
        f5.a.put(enumC0050n13, 2);
        f(enumC0050n13).a(enumC0050n14);
        f = b(enumC0050n1);
        g = b(enumC0050n12);
        h = b(enumC0050n13);
        b(enumC0050n14);
        b(enumC0050n15);
        int i2 = 0;
        for (EnumC0053o1 enumC0053o1 : values()) {
            i2 |= enumC0053o1.e;
        }
        i = i2;
        int i3 = g;
        j = i3;
        int i4 = i3 << 1;
        k = i4;
        l = i3 | i4;
        EnumC0053o1 enumC0053o12 = DISTINCT;
        m = enumC0053o12.c;
        n = enumC0053o12.d;
        EnumC0053o1 enumC0053o13 = SORTED;
        int i5 = enumC0053o13.c;
        o = enumC0053o13.d;
        EnumC0053o1 enumC0053o14 = ORDERED;
        int i6 = enumC0053o14.c;
        p = enumC0053o14.d;
        EnumC0053o1 enumC0053o15 = SIZED;
        q = enumC0053o15.c;
        r = enumC0053o15.d;
        s = SHORT_CIRCUIT.c;
    }

    EnumC0053o1(int i2, C0047m1 c0047m1) {
        EnumC0050n1[] values = EnumC0050n1.values();
        int length = values.length;
        int i3 = 0;
        while (true) {
            Map map = c0047m1.a;
            if (i3 < length) {
                Map.EL.a(map, values[i3], 0);
                i3++;
            } else {
                this.a = map;
                int i4 = i2 * 2;
                this.b = i4;
                this.c = 1 << i4;
                this.d = 2 << i4;
                this.e = 3 << i4;
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i2, int i3) {
        return i2 | (i3 & (i2 == 0 ? i : ((((j & i2) << 1) | i2) | ((k & i2) >> 1)) ^ (-1)));
    }

    private static int b(EnumC0050n1 enumC0050n1) {
        EnumC0053o1[] values;
        int i2 = 0;
        for (EnumC0053o1 enumC0053o1 : values()) {
            i2 |= ((Integer) enumC0053o1.a.get(enumC0050n1)).intValue() << enumC0053o1.b;
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(j$.util.r rVar) {
        int characteristics = rVar.characteristics();
        int i2 = characteristics & 4;
        int i3 = f;
        return (i2 == 0 || rVar.getComparator() == null) ? characteristics & i3 : characteristics & i3 & (-5);
    }

    private static C0047m1 f(EnumC0050n1 enumC0050n1) {
        C0047m1 c0047m1 = new C0047m1(new EnumMap(EnumC0050n1.class));
        c0047m1.a(enumC0050n1);
        return c0047m1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int g(int i2) {
        return i2 & ((i2 ^ (-1)) >> 1) & j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean d(int i2) {
        return (i2 & this.e) == this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean e(int i2) {
        int i3 = this.e;
        return (i2 & i3) == i3;
    }
}
