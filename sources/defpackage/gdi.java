package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* renamed from: gdi  reason: default package */
/* loaded from: classes.dex */
public final class gdi extends bkf implements IInterface {
    public gdi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.phenotype.internal.IPhenotypeService");
    }

    public final void e(gdo gdoVar, String str) {
        Parcel a = a();
        bkh.f(a, gdoVar);
        a.writeString(str);
        hI(5, a);
    }
}
