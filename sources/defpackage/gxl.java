package defpackage;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: gxl  reason: default package */
/* loaded from: classes.dex */
public final class gxl extends mjy implements mkq {
    public volatile mkq a;

    public gxl(mko mkoVar, mkq mkqVar) {
        super(mkoVar);
        this.a = mkqVar;
        mkoVar.d(new gxd(this, 2), mjl.a);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.a.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.a.getDelay(timeUnit);
    }
}
