package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* renamed from: fzj  reason: default package */
/* loaded from: classes.dex */
public final class fzj extends bkf implements fzl {
    public fzj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.learning.internal.IExampleStoreIteratorCallbackV2");
    }

    @Override // defpackage.fzl
    public final void b(Status status, long j) {
        Parcel a = a();
        bkh.d(a, status);
        a.writeLong(j);
        hI(3, a);
    }

    @Override // defpackage.fzl
    public final void c(ftm ftmVar, ftm ftmVar2, long j) {
        Parcel a = a();
        bkh.f(a, ftmVar);
        bkh.f(a, ftmVar2);
        a.writeLong(j);
        hI(2, a);
    }
}
