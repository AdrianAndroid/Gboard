package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.PowerManager;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dk  reason: default package */
/* loaded from: classes.dex */
public final class dk extends dm {
    public final PowerManager a;
    final /* synthetic */ dr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dk(dr drVar, Context context) {
        super(drVar);
        this.b = drVar;
        this.a = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    @Override // defpackage.dm
    public final IntentFilter a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
        return intentFilter;
    }

    @Override // defpackage.dm
    public final void b() {
        this.b.Q();
    }
}
