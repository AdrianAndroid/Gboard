package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* compiled from: PG */
/* renamed from: kzm  reason: default package */
/* loaded from: classes.dex */
final class kzm extends kzg {
    final /* synthetic */ IBinder b;
    final /* synthetic */ kzo c;

    public kzm(kzo kzoVar, IBinder iBinder) {
        this.c = kzoVar;
        this.b = iBinder;
    }

    @Override // defpackage.kzg
    public final void b() {
        lbk lbkVar;
        kzp kzpVar = this.c.a;
        IBinder iBinder = this.b;
        if (iBinder == null) {
            lbkVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.splitinstall.protocol.ISplitInstallService");
            lbkVar = queryLocalInterface instanceof lbk ? (lbk) queryLocalInterface : new lbk(iBinder);
        }
        kzpVar.k = lbkVar;
        kzp kzpVar2 = this.c.a;
        kzpVar2.l.g("linkToDeath", new Object[0]);
        try {
            ((bkf) kzpVar2.k).a.linkToDeath(kzpVar2.i, 0);
        } catch (RemoteException e) {
            kzpVar2.l.f(e, "linkToDeath failed", new Object[0]);
        }
        this.c.a.f = false;
        for (Runnable runnable : this.c.a.c) {
            runnable.run();
        }
        this.c.a.c.clear();
    }
}
