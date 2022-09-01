package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* renamed from: fzp  reason: default package */
/* loaded from: classes.dex */
public final class fzp extends bkf implements fzr {
    public fzp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.learning.internal.IExampleStoreQueryCallbackV2");
    }

    @Override // defpackage.fzr
    public final void e(Status status, long j) {
        Parcel a = a();
        bkh.d(a, status);
        a.writeLong(j);
        hI(3, a);
    }

    @Override // defpackage.fzr
    public final void f(fzo fzoVar, long j) {
        Parcel a = a();
        bkh.f(a, fzoVar);
        a.writeLong(j);
        hI(2, a);
    }
}
