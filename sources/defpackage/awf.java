package defpackage;

import java.lang.ref.ReferenceQueue;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* renamed from: awf  reason: default package */
/* loaded from: classes.dex */
public final class awf {
    final Map a = new HashMap();
    public final ReferenceQueue b = new ReferenceQueue();
    public volatile boolean c;
    public volatile awd d;

    public awf() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new ayn(1));
        newSingleThreadExecutor.execute(new att(this, 4));
    }

    public final synchronized axb a(auw auwVar) {
        awe aweVar = (awe) this.a.get(auwVar);
        if (aweVar == null) {
            return null;
        }
        axb axbVar = (axb) aweVar.get();
        if (axbVar == null) {
            c(aweVar);
        }
        return axbVar;
    }

    public final synchronized void b(auw auwVar, axb axbVar) {
        awe aweVar = (awe) this.a.put(auwVar, new awe(auwVar, axbVar, this.b));
        if (aweVar != null) {
            aweVar.a();
        }
    }

    public final void c(awe aweVar) {
        synchronized (this) {
            this.a.remove(aweVar.a);
            if (aweVar.b) {
                axh axhVar = aweVar.c;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void d(auw auwVar) {
        awe aweVar = (awe) this.a.remove(auwVar);
        if (aweVar != null) {
            aweVar.a();
        }
    }
}
