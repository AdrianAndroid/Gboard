package defpackage;

import android.content.res.Configuration;

/* compiled from: PG */
/* renamed from: dbb  reason: default package */
/* loaded from: classes.dex */
public final class dbb extends irm {
    final /* synthetic */ eqv a;

    public dbb(eqv eqvVar, byte[] bArr) {
        this.a = eqvVar;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.lang.Runnable] */
    @Override // defpackage.irm
    protected final void b(Configuration configuration, Configuration configuration2) {
        this.a.d.run();
    }
}
