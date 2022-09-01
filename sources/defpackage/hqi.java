package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: hqi  reason: default package */
/* loaded from: classes.dex */
public class hqi implements ijj {
    private volatile hpy a;
    private volatile hpy b;

    protected void a(hpy hpyVar) {
        throw null;
    }

    protected void b(hpy hpyVar) {
    }

    protected void c() {
    }

    public final void f(Executor executor) {
        ijl.b().h(this, hqj.class, executor);
    }

    @Override // defpackage.ijj
    public final /* bridge */ /* synthetic */ void fd(ijg ijgVar) {
        hqj hqjVar = (hqj) ijgVar;
        hpy hpyVar = hqjVar.a;
        if (hpyVar != this.a) {
            this.a = hpyVar;
            if (hpyVar != null) {
                if (!hpyVar.h()) {
                    c();
                } else {
                    a(hpyVar);
                }
            }
        }
        hpy hpyVar2 = hqjVar.b;
        if (hpyVar2 != this.b) {
            this.b = hpyVar2;
            if (hpyVar2 == null || !hpyVar2.h()) {
                return;
            }
            b(hpyVar2);
        }
    }

    @Override // defpackage.ijj
    public final /* synthetic */ void fe(Class cls) {
    }

    public final void g(Executor executor) {
        ijl.b().c(this, hqj.class, executor);
    }

    public final void h() {
        ijl.b().d(this, hqj.class);
    }
}
