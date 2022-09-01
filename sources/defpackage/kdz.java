package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: kdz  reason: default package */
/* loaded from: classes.dex */
public final class kdz implements kdt {
    public final mks a;
    public final nox b;

    public kdz(kdr kdrVar, Context context, mks mksVar, nox noxVar, oiy oiyVar, oiy oiyVar2) {
        new AtomicBoolean(false);
        new IntentFilter("android.intent.action.BATTERY_CHANGED");
        kdrVar.a(mksVar, noxVar, oiyVar);
        this.a = mksVar;
        this.b = noxVar;
        jdg.n(new buf(this, context, 9));
        jdg.n(new ihp(oiyVar2, 12));
    }

    public final synchronized void a() {
        kdy kdyVar = (kdy) this.b.a();
    }

    @Override // defpackage.kdt
    public final void ad() {
        kcu.N(new joq(this, 3), this.a);
    }
}
