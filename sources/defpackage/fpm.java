package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* renamed from: fpm  reason: default package */
/* loaded from: classes.dex */
public final class fpm extends bkf implements fpo {
    public fpm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.api.internal.IStatusCallback");
    }

    @Override // defpackage.fpo
    public final void b(Status status) {
        Parcel a = a();
        bkh.d(a, status);
        hJ(1, a);
    }
}
