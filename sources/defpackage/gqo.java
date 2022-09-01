package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: gqo  reason: default package */
/* loaded from: classes.dex */
public class gqo implements ijj {
    private boolean a;
    private boolean b;

    public void a(boolean z) {
        throw null;
    }

    public void d(boolean z) {
        throw null;
    }

    public void e(boolean z) {
    }

    public void f(boolean z) {
    }

    @Override // defpackage.ijj
    public final /* bridge */ /* synthetic */ void fd(ijg ijgVar) {
        gqp gqpVar = (gqp) ijgVar;
        boolean z = gqpVar.a;
        boolean z2 = gqpVar.b;
        boolean z3 = gqpVar.c;
        boolean z4 = this.a;
        boolean z5 = this.b;
        this.a = z;
        this.b = z2;
        if (z4 != z) {
            if (z) {
                d(z3);
            } else {
                a(z3);
            }
        }
        boolean z6 = this.b;
        boolean z7 = gqpVar.c;
        if (z5 == z6) {
            return;
        }
        if (z6) {
            f(z7);
        } else {
            e(z7);
        }
    }

    @Override // defpackage.ijj
    public final /* synthetic */ void fe(Class cls) {
    }

    public final void g(Executor executor) {
        ijl.b().c(this, gqp.class, executor);
    }

    public final void h() {
        ijl.b().d(this, gqp.class);
    }
}
