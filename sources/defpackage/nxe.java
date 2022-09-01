package defpackage;

import android.os.IBinder;
import android.os.RemoteException;

/* compiled from: PG */
/* renamed from: nxe  reason: default package */
/* loaded from: classes2.dex */
final class nxe extends nxf {
    public nxe(IBinder iBinder) {
        super(iBinder);
    }

    @Override // defpackage.nxf
    public final void a(int i, nxj nxjVar) {
        if (c(i, nxjVar.b())) {
            return;
        }
        throw new RemoteException("BinderProxy#transact(" + i + ", FLAG_ONEWAY) returned false");
    }
}
