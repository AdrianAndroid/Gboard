package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* renamed from: fxq  reason: default package */
/* loaded from: classes.dex */
public final class fxq extends bkf implements fxs {
    public fxq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.learning.dynamite.proxy.IExampleStoreChunkingQueryCallback");
    }

    @Override // defpackage.fxs
    public final void e(Status status, long j, long j2) {
        Parcel a = a();
        bkh.d(a, status);
        a.writeLong(j);
        a.writeLong(j2);
        hI(3, a);
    }

    @Override // defpackage.fxs
    public final void f(fxm fxmVar, long j, long j2) {
        Parcel a = a();
        bkh.f(a, fxmVar);
        a.writeLong(j);
        a.writeLong(j2);
        hI(2, a);
    }
}
