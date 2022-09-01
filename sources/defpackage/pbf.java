package defpackage;

import java.util.concurrent.Future;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: pbf  reason: default package */
/* loaded from: classes2.dex */
public final class pbf implements ozu {
    final /* synthetic */ pbh a;
    private final Future b;

    public pbf(pbh pbhVar, Future future) {
        this.a = pbhVar;
        this.b = future;
    }

    @Override // defpackage.ozu
    public final void d() {
        if (this.a.get() != Thread.currentThread()) {
            this.b.cancel(true);
        } else {
            this.b.cancel(false);
        }
    }

    @Override // defpackage.ozu
    public final boolean e() {
        return this.b.isCancelled();
    }
}
