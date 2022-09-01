package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: hzr  reason: default package */
/* loaded from: classes.dex */
public abstract class hzr implements ijj {
    public abstract void a(int i);

    public final void d(Executor executor) {
        ijl.b().h(this, hzs.class, executor);
    }

    public final void e() {
        ijl.b().d(this, hzs.class);
    }

    @Override // defpackage.ijj
    public final /* bridge */ /* synthetic */ void fd(ijg ijgVar) {
        a(((hzs) ijgVar).a);
    }

    @Override // defpackage.ijj
    public final /* synthetic */ void fe(Class cls) {
    }
}
