package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* renamed from: gaj  reason: default package */
/* loaded from: classes.dex */
public final class gaj extends bkf implements gal {
    public gaj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.learning.internal.training.IHttpUrlConnectionFactory");
    }

    @Override // defpackage.gal
    public final ftm b(String str) {
        ftm ftkVar;
        Parcel a = a();
        a.writeString(str);
        Parcel hG = hG(2, a);
        IBinder readStrongBinder = hG.readStrongBinder();
        if (readStrongBinder == null) {
            ftkVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            ftkVar = queryLocalInterface instanceof ftm ? (ftm) queryLocalInterface : new ftk(readStrongBinder);
        }
        hG.recycle();
        return ftkVar;
    }

    @Override // defpackage.gal
    public final void c(boolean z) {
        Parcel a = a();
        bkh.c(a, z);
        hI(6, a);
    }

    @Override // defpackage.gal
    public final boolean d() {
        Parcel hG = hG(3, a());
        boolean g = bkh.g(hG);
        hG.recycle();
        return g;
    }

    @Override // defpackage.gal
    public final boolean e() {
        Parcel hG = hG(1, a());
        boolean g = bkh.g(hG);
        hG.recycle();
        return g;
    }

    @Override // defpackage.gal
    public final boolean f() {
        Parcel hG = hG(4, a());
        boolean g = bkh.g(hG);
        hG.recycle();
        return g;
    }

    @Override // defpackage.gal
    public final boolean g() {
        Parcel hG = hG(5, a());
        boolean g = bkh.g(hG);
        hG.recycle();
        return g;
    }
}
