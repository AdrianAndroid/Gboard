package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* compiled from: PG */
/* renamed from: fqo  reason: default package */
/* loaded from: classes.dex */
public final class fqo extends fqi {
    public final IBinder g;
    final /* synthetic */ fqq h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fqo(fqq fqqVar, int i, IBinder iBinder, Bundle bundle) {
        super(fqqVar, i, bundle);
        this.h = fqqVar;
        this.g = iBinder;
    }

    @Override // defpackage.fqi
    protected final void a(fmt fmtVar) {
        opu opuVar = this.h.q;
        if (opuVar != null) {
            opuVar.s(fmtVar);
        }
        System.currentTimeMillis();
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [fpb, java.lang.Object] */
    @Override // defpackage.fqi
    protected final boolean c() {
        try {
            IBinder iBinder = this.g;
            fyb.ax(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if (!this.h.c().equals(interfaceDescriptor)) {
                fqq fqqVar = this.h;
                Log.w("GmsClient", "service descriptor mismatch: " + fqqVar.c() + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface b = this.h.b(this.g);
            if (b == null || (!this.h.A(2, 4, b) && !this.h.A(3, 4, b))) {
                return false;
            }
            fqq fqqVar2 = this.h;
            fqqVar2.k = null;
            opu opuVar = fqqVar2.r;
            if (opuVar == null) {
                return true;
            }
            opuVar.a.b();
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
