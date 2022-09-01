package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: jue  reason: default package */
/* loaded from: classes.dex */
public final class jue implements jst {
    public final llw a;
    private final AtomicBoolean b = new AtomicBoolean(false);
    private final llp c;
    private final byte[] d;
    private llp e;

    public jue(llw llwVar, llp llpVar, byte[] bArr) {
        this.a = h(llwVar);
        this.c = llpVar;
        this.d = bArr;
    }

    public static jud e() {
        return new jud(new HashMap());
    }

    public static jue f() {
        return g(null);
    }

    public static jue g(byte[] bArr) {
        return new jue(lrq.b, llp.q(), bArr);
    }

    public static llw h(Map map) {
        lls h = llw.h();
        for (Map.Entry entry : map.entrySet()) {
            h.a((String) entry.getKey(), ((jst) entry.getValue()).a());
        }
        return h.l();
    }

    @Override // defpackage.jst
    public final /* bridge */ /* synthetic */ jst a() {
        jtq.o(this.b.get());
        return new jue(this.a, this.c, this.d);
    }

    public final int b() {
        return ((lrq) this.a).d;
    }

    public final synchronized jtr c() {
        Collection i = i();
        if (i.isEmpty()) {
            return null;
        }
        return ((juc) lre.an(i)).e();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.b.getAndSet(true)) {
            return;
        }
        for (String str : j()) {
            jua juaVar = (jua) this.a.get(str);
            if (juaVar != null) {
                juaVar.close();
            }
        }
    }

    public final jua d(String str) {
        jtq.o(this.b.get());
        jua juaVar = (jua) this.a.get(str);
        if (juaVar != null) {
            return juaVar;
        }
        throw new IllegalArgumentException("Pack is not in this set: ".concat(String.valueOf(str)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jue)) {
            return false;
        }
        jue jueVar = (jue) obj;
        return lre.z(this.a, jueVar.a) && Arrays.equals(this.d, jueVar.d);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final synchronized Collection i() {
        llp llpVar = this.e;
        if (llpVar != null) {
            return llpVar;
        }
        if (this.a.isEmpty()) {
            this.e = llp.q();
        } else {
            llk e = llp.e();
            lsz it = this.a.values().iterator();
            while (it.hasNext()) {
                e.h(((jua) it.next()).a);
            }
            this.e = e.g();
        }
        return this.e;
    }

    public final Set j() {
        return Collections.unmodifiableSet(this.a.keySet());
    }

    public final boolean k() {
        return this.a.isEmpty();
    }

    public final String toString() {
        lfa T = jdg.T("");
        T.b("superpack", c());
        T.h("metadata", this.d != null);
        T.b("packs", lex.c(',').f(this.a.values()));
        return T.toString();
    }
}
