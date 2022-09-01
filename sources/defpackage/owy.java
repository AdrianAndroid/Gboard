package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import org.chromium.net.UrlRequest;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: owy  reason: default package */
/* loaded from: classes2.dex */
public final class owy {
    final oxk a;
    final Executor b;
    final Executor c;
    final /* synthetic */ oxa d;

    public owy(oxa oxaVar, UrlRequest.Callback callback, Executor executor) {
        this.d = oxaVar;
        this.a = new oxk(callback);
        if (oxaVar.h) {
            this.b = executor;
            this.c = null;
            return;
        }
        this.b = new oxd(executor, 0);
        this.c = executor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(oxb oxbVar) {
        try {
            this.b.execute(new owt(this.d, oxbVar, 4));
        } catch (RejectedExecutionException e) {
            this.d.e(new owk("Exception posting task to executor", e));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        a(new owq(this, 7));
    }
}
