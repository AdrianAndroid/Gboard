package defpackage;

import android.content.ComponentName;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: gcb  reason: default package */
/* loaded from: classes.dex */
public final class gcb extends gcq {
    final /* synthetic */ mld a;
    final /* synthetic */ gcf b;

    public gcb(gcf gcfVar, mld mldVar) {
        this.b = gcfVar;
        this.a = mldVar;
    }

    @Override // defpackage.gcq
    public final void a(ComponentName componentName) {
    }

    @Override // defpackage.gcq
    public final void b(IBinder iBinder) {
        Object fxtVar;
        mld mldVar = this.a;
        if (iBinder == null) {
            fxtVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.learning.dynamite.proxy.IExampleStoreProxy");
            fxtVar = queryLocalInterface instanceof fxv ? (fxv) queryLocalInterface : new fxt(iBinder);
        }
        mldVar.c(fxtVar);
        try {
            iBinder.linkToDeath(this.b.l, 0);
        } catch (RemoteException unused) {
            this.b.c.h("Could not link to death, process probably already died");
        }
    }
}
