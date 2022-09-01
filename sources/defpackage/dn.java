package defpackage;

import android.content.IntentFilter;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dn  reason: default package */
/* loaded from: classes.dex */
public final class dn extends dm {
    final /* synthetic */ dr a;
    public final fws b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dn(dr drVar, fws fwsVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        super(drVar);
        this.a = drVar;
        this.b = fwsVar;
    }

    @Override // defpackage.dm
    public final IntentFilter a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.TIME_SET");
        intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
        intentFilter.addAction("android.intent.action.TIME_TICK");
        return intentFilter;
    }

    @Override // defpackage.dm
    public final void b() {
        this.a.Q();
    }
}
