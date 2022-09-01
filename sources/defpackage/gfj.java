package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* renamed from: gfj  reason: default package */
/* loaded from: classes.dex */
public final class gfj extends bkf implements IInterface {
    public gfj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.usagereporting.internal.IUsageReportingService");
    }

    public final void e(gdo gdoVar, gfi gfiVar) {
        Parcel a = a();
        bkh.f(a, gdoVar);
        bkh.f(a, gfiVar);
        hI(4, a);
    }
}
