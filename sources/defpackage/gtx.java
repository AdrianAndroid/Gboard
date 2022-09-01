package defpackage;

import android.content.res.Configuration;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: gtx  reason: default package */
/* loaded from: classes.dex */
public final class gtx extends irm {
    final /* synthetic */ Runnable a;

    public gtx(Runnable runnable) {
        this.a = runnable;
    }

    @Override // defpackage.irm
    protected final void b(Configuration configuration, Configuration configuration2) {
        this.a.run();
    }
}
