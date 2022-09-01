package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: PG */
/* renamed from: fjp  reason: default package */
/* loaded from: classes.dex */
public final class fjp extends bkf implements fjr {
    public fjp(IBinder iBinder) {
        super(iBinder, "com.google.android.enterprise.connectedapps.ICrossProfileCallback");
    }

    @Override // defpackage.fjr
    public final void e(long j, int i, byte[] bArr) {
        Parcel a = a();
        a.writeLong(j);
        a.writeInt(i);
        a.writeByteArray(bArr);
        hI(4, a);
    }

    @Override // defpackage.fjr
    public final void f(long j, int i, int i2, byte[] bArr) {
        Parcel a = a();
        a.writeLong(j);
        a.writeInt(i);
        a.writeInt(i2);
        a.writeByteArray(bArr);
        hI(1, a);
    }

    @Override // defpackage.fjr
    public final void g(long j, int i, byte[] bArr) {
        Parcel a = a();
        a.writeLong(j);
        a.writeInt(i);
        a.writeInt(0);
        a.writeByteArray(bArr);
        hI(3, a);
    }

    @Override // defpackage.fjr
    public final void h(long j, Bundle bundle) {
        Parcel a = a();
        a.writeLong(j);
        a.writeInt(0);
        bkh.d(a, bundle);
        hI(2, a);
    }
}
