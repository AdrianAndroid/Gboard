package defpackage;

import java.io.Closeable;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: byx  reason: default package */
/* loaded from: classes.dex */
public final class byx implements Closeable {
    private final jud a = jue.e();
    private final HashMap b = new HashMap();

    public final byy a() {
        return new byy(this.a.b(), llw.k(this.b));
    }

    public final void b(byz byzVar) {
        this.a.c(byzVar.a);
    }

    public final void c(byy byyVar) {
        jud judVar = this.a;
        byy byyVar2 = byy.a;
        jue jueVar = byyVar.c;
        jtq.o(judVar.d);
        lsz it = jueVar.a.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!judVar.a.containsKey(entry.getKey())) {
                judVar.c((jua) entry.getValue());
            }
        }
        this.b.putAll(byyVar.b);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
