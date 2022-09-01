package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: rj  reason: default package */
/* loaded from: classes2.dex */
public final class rj {
    public Object a;
    public rn b;
    public ro c = new ro();
    public boolean d;

    public final void a(Runnable runnable, Executor executor) {
        ro roVar = this.c;
        if (roVar != null) {
            roVar.d(runnable, executor);
        }
    }

    public final void b() {
        this.a = null;
        this.b = null;
        this.c = null;
    }

    public final void c(Object obj) {
        this.d = true;
        rn rnVar = this.b;
        if (rnVar == null || !rnVar.b.f(obj)) {
            return;
        }
        b();
    }

    public final void d(Throwable th) {
        this.d = true;
        rn rnVar = this.b;
        if (rnVar == null || !rnVar.a(th)) {
            return;
        }
        b();
    }

    protected final void finalize() {
        ro roVar;
        rn rnVar = this.b;
        if (rnVar != null && !rnVar.isDone()) {
            StringBuilder sb = new StringBuilder("The completer object was garbage collected - this future would otherwise never complete. The tag was: ");
            Object obj = this.a;
            sb.append(obj);
            rnVar.a(new rk("The completer object was garbage collected - this future would otherwise never complete. The tag was: ".concat(String.valueOf(obj))));
        }
        if (this.d || (roVar = this.c) == null) {
            return;
        }
        roVar.f(null);
    }
}
