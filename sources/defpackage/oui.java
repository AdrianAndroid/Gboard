package defpackage;

import java.io.OutputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: oui  reason: default package */
/* loaded from: classes2.dex */
public abstract class oui extends oqj {
    ovr c;
    long d;
    OutputStream e;
    boolean f;

    @Override // defpackage.oqj
    public long a() {
        return this.d;
    }

    public oqi c(oqi oqiVar) {
        return oqiVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(ous ousVar, long j) {
        this.c = ousVar.a();
        this.d = j;
        this.e = new ouh(this, j, ousVar);
    }
}
