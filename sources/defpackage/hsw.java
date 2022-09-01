package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: hsw  reason: default package */
/* loaded from: classes.dex */
public class hsw implements ijj {
    public void a(hsk hskVar) {
    }

    public void d() {
    }

    public final void e(Executor executor) {
        ijl.b().c(this, hsx.class, executor);
    }

    public final void f() {
        ijl.b().d(this, hsx.class);
    }

    @Override // defpackage.ijj
    public final /* bridge */ /* synthetic */ void fd(ijg ijgVar) {
        hsx hsxVar = (hsx) ijgVar;
        if (hsxVar.b == 1) {
            hsk hskVar = hsxVar.c;
            if (hskVar == null) {
                return;
            }
            a(hskVar);
            return;
        }
        d();
    }

    @Override // defpackage.ijj
    public final /* synthetic */ void fe(Class cls) {
    }
}
