package defpackage;

import android.util.SparseIntArray;
import j$.util.Optional;

/* compiled from: PG */
/* renamed from: ita  reason: default package */
/* loaded from: classes.dex */
public final class ita {
    public Object a;
    public final Object b;

    public ita() {
        fmx fmxVar = fmx.a;
        throw null;
    }

    public ita(hls hlsVar) {
        this.b = hlsVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, hls] */
    private final void g() {
        if (((Boolean) hnb.a.c()).booleanValue()) {
            this.b.O(hfd.d(new iay(-10138, null, Boolean.valueOf(this.a != null))));
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.CharSequence, java.lang.Object] */
    public final Optional a() {
        if (this.a != null) {
            hlk a = hln.a();
            a.a = this.a;
            a.e = hlm.RESTORABLE_TEXT;
            return Optional.of(a.a());
        }
        return Optional.empty();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, hls] */
    public final void b(CharSequence charSequence, boolean z) {
        if (charSequence != null) {
            this.a = charSequence;
            g();
            this.b.hY(z);
        }
    }

    public final void c() {
        if (this.a != null) {
            this.a = null;
            g();
        }
    }

    public final boolean d() {
        return this.a != null;
    }

    public final void e() {
        ((SparseIntArray) this.b).clear();
    }

    public final int f(int i) {
        return ((SparseIntArray) this.b).get(i, -1);
    }

    public ita(fmy fmyVar) {
        this.b = new SparseIntArray();
        fyb.ax(fmyVar);
        this.a = fmyVar;
    }

    public ita(hhl hhlVar) {
        this.b = hhlVar;
        this.a = hhlVar.c();
    }
}
