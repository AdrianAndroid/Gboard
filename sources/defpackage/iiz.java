package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: iiz  reason: default package */
/* loaded from: classes.dex */
abstract class iiz implements ijj {
    public final Class a;

    public iiz(Class cls) {
        this.a = cls;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String a() {
        return this.a.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(Executor executor) {
        ijl.b().c(this, this.a, executor);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e() {
        ijl.b().d(this, this.a);
    }

    @Override // defpackage.ijj
    public /* synthetic */ void fe(Class cls) {
        throw null;
    }
}
