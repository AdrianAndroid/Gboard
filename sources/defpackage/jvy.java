package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: jvy  reason: default package */
/* loaded from: classes.dex */
public final class jvy implements juq {
    public static final jup a;
    public final Map b = new HashMap();

    static {
        juo i = jup.i();
        i.d(jsr.d("default", "default"));
        a = i.a();
    }

    public jvy() {
        int i = jur.a;
    }

    @Override // defpackage.juq
    public final jup a(jsr jsrVar) {
        jup jupVar;
        synchronized (this.b) {
            jvz jvzVar = (jvz) this.b.get(jsrVar);
            if (jvzVar == null) {
                juo i = jup.i();
                i.d(jsrVar);
                jupVar = i.a();
            } else {
                if (jvzVar.i == null) {
                    juo i2 = jup.i();
                    i2.c(jvzVar.e);
                    i2.e(jvzVar.d);
                    i2.d(jvzVar.a);
                    i2.b(jvzVar.c);
                    i2.f(jvzVar.b);
                    i2.b = jvzVar.f;
                    i2.g(jvzVar.h);
                    i2.a = jvzVar.g;
                    jvzVar.i = i2.a();
                }
                jupVar = jvzVar.i;
            }
        }
        return jupVar;
    }

    @Override // defpackage.juq
    public final void b(jsr jsrVar) {
        throw null;
    }

    @Override // defpackage.juq
    public final void c(jsr jsrVar, int i) {
        throw null;
    }
}
