package defpackage;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ijc  reason: default package */
/* loaded from: classes.dex */
public final class ijc extends ija {
    public final Set a = new HashSet();
    private final llw b;

    public ijc(boolean z, Runnable runnable, Runnable runnable2, iiy[] iiyVarArr) {
        super(z, runnable, runnable2);
        lls i = llw.i(iiyVarArr.length);
        for (iiy iiyVar : iiyVarArr) {
            Class<?> cls = iiyVar.getClass();
            i.a(cls, new ijb(this, cls));
        }
        this.b = i.l();
    }

    @Override // defpackage.ija
    public final synchronized void e(Executor executor) {
        super.a();
        Executor e = ijf.e(executor);
        lsz it = this.b.values().iterator();
        while (it.hasNext()) {
            ((ijb) it.next()).d(e);
        }
    }

    @Override // defpackage.ija
    public final synchronized void f() {
        super.f();
        lsz it = this.b.values().iterator();
        while (it.hasNext()) {
            ((ijb) it.next()).e();
        }
    }

    public final synchronized boolean g() {
        return this.a.size() == ((lrq) this.b).d;
    }
}
