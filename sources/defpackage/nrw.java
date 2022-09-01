package defpackage;

import java.io.OutputStream;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* renamed from: nrw  reason: default package */
/* loaded from: classes2.dex */
public final class nrw {
    public Object a;
    public Object b;

    public nrw() {
    }

    public nrw(nry nryVar) {
        this.a = nryVar;
    }

    public final nry a() {
        if (this.b != null) {
            Object obj = this.a;
            nry nryVar = nry.a;
            for (Map.Entry entry : ((nry) obj).b.entrySet()) {
                if (!((IdentityHashMap) this.b).containsKey(entry.getKey())) {
                    ((IdentityHashMap) this.b).put((nrx) entry.getKey(), entry.getValue());
                }
            }
            this.a = new nry((IdentityHashMap) this.b);
            this.b = null;
        }
        return (nry) this.a;
    }

    public final void b(nrx nrxVar, Object obj) {
        if (this.b == null) {
            this.b = new IdentityHashMap(1);
        }
        ((IdentityHashMap) this.b).put(nrxVar, obj);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.Map, java.lang.Object] */
    public final lbt c() {
        e(Collections.unmodifiableMap(d()));
        if (this.b == null) {
            throw new IllegalStateException("Missing required properties: splitInstallErrorCodeByModule");
        }
        return new lbt((Integer) this.a, this.b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    public final Map d() {
        ?? r0 = this.b;
        if (r0 != 0) {
            return r0;
        }
        throw new IllegalStateException("Property \"splitInstallErrorCodeByModule\" has not been set");
    }

    public final void e(Map map) {
        if (map != null) {
            this.b = map;
            return;
        }
        throw new NullPointerException("Null splitInstallErrorCodeByModule");
    }

    public final void f(List list) {
        OutputStream outputStream = (OutputStream) lre.ac(list);
        if (outputStream instanceof kpc) {
            this.a = (kpc) outputStream;
            this.b = (OutputStream) list.get(0);
        }
    }

    public final void g() {
        if (this.a == null) {
            throw new kpa("Cannot sync underlying stream");
        }
        ((OutputStream) this.b).flush();
        ((kpc) this.a).a.getFD().sync();
    }
}
