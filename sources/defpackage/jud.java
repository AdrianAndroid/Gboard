package defpackage;

import java.util.Map;

/* compiled from: PG */
/* renamed from: jud  reason: default package */
/* loaded from: classes.dex */
public final class jud implements jst {
    public final Map a;
    public llp b = juc.o;
    public byte[] c;
    public boolean d;

    public jud(Map map) {
        this.a = map;
    }

    @Override // defpackage.jst
    public final /* bridge */ /* synthetic */ jst a() {
        jtq.o(this.d);
        return new jud(jue.h(this.a));
    }

    public final jue b() {
        return new jue(llw.k(this.a), this.b, this.c);
    }

    public final void c(jua juaVar) {
        jtq.o(this.d);
        String i = juaVar.a.i();
        if (this.a.containsKey(i)) {
            throw new IllegalArgumentException("A pack has already been added named ".concat(i));
        }
        this.a.put(juaVar.a.i(), juaVar.a());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!this.d) {
            for (Map.Entry entry : this.a.entrySet()) {
                ((jua) entry.getValue()).close();
            }
        }
        this.d = true;
    }
}
