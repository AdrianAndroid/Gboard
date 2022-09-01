package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: jcb  reason: default package */
/* loaded from: classes.dex */
public abstract class jcb implements ijj {
    public abstract void a(boolean z);

    public final void d(Executor executor) {
        ijl.b().h(this, jcc.class, executor);
    }

    public final void e() {
        ijl.b().d(this, jcc.class);
    }

    @Override // defpackage.ijj
    public final /* bridge */ /* synthetic */ void fd(ijg ijgVar) {
        jcc jccVar = (jcc) ijgVar;
        int i = jccVar.a;
        a(jccVar.b);
    }

    @Override // defpackage.ijj
    public final /* synthetic */ void fe(Class cls) {
    }
}
