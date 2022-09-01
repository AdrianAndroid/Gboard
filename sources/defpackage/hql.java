package defpackage;

import android.os.IBinder;

/* compiled from: PG */
/* renamed from: hql  reason: default package */
/* loaded from: classes.dex */
public final class hql implements hqu {
    private final jaq a;

    public hql(jaq jaqVar) {
        this.a = jaqVar;
    }

    @Override // defpackage.hqu
    public final boolean a(IBinder iBinder) {
        jaq jaqVar = this.a;
        return iBinder != null ? jaqVar.c.shouldOfferSwitchingToNextInputMethod(iBinder) : jaqVar.g() || jaqVar.l("com.google.");
    }

    @Override // defpackage.hqu
    public final boolean b(IBinder iBinder) {
        return iBinder != null && this.a.c.switchToNextInputMethod(iBinder, false);
    }
}
