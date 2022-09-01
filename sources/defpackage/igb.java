package defpackage;

import java.util.List;

/* compiled from: PG */
/* renamed from: igb  reason: default package */
/* loaded from: classes.dex */
public final class igb {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/module/InitializationDependencyDef");
    public static final lfy b = lfy.c(',').h().b();
    public static final iiy[] c = new iiy[0];
    public final iiy[] d;
    public final int e;
    public final String f;
    public final boolean g;
    public final llw h;
    public final int i;
    public final long j;
    public final long k;
    public final Class l;
    public final iga[] m;
    public final iga[] n;
    public final llp o;
    public final llp p;
    public final llp q;

    public igb(ify ifyVar) {
        this.d = ifyVar.a;
        this.e = ifyVar.b;
        this.f = ifyVar.c;
        this.g = ifyVar.d;
        try {
            this.h = ifyVar.e.l();
            this.i = ifyVar.f;
            this.j = ifyVar.g;
            this.k = ifyVar.h;
            this.l = ifyVar.i;
            List list = ifyVar.j;
            this.m = (iga[]) list.toArray(new iga[list.size()]);
            List list2 = ifyVar.k;
            this.n = (iga[]) list2.toArray(new iga[list2.size()]);
            this.o = llp.o(ifyVar.l);
            this.p = llp.o(ifyVar.m);
            this.q = llp.o(ifyVar.n);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Duplicate keys detected. Consider using a Predicate", e);
        }
    }

    public static ify a() {
        return new ify();
    }

    public static boolean b(hqt hqtVar, llp llpVar) {
        int size = llpVar.size();
        int i = 0;
        boolean z = false;
        for (int i2 = 0; i2 < size; i2++) {
            ifz ifzVar = (ifz) llpVar.get(i2);
            if (ifzVar.a) {
                if (!ifzVar.a(hqtVar)) {
                    return false;
                }
            } else {
                i++;
                z = z || ifzVar.a(hqtVar);
            }
        }
        return i == 0 || z;
    }
}
