package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: PG */
/* renamed from: fjs  reason: default package */
/* loaded from: classes.dex */
public final class fjs extends bkf implements fju {
    public fjs(IBinder iBinder) {
        super(iBinder, "com.google.android.enterprise.connectedapps.ICrossProfileService");
    }

    @Override // defpackage.fju
    public final void e(long j, int i, int i2, byte[] bArr) {
        Parcel a = a();
        a.writeLong(j);
        a.writeInt(i);
        a.writeInt(i2);
        a.writeByteArray(bArr);
        hI(1, a);
    }

    @Override // defpackage.fju
    public final byte[] f(long j, int i, long j2, int i2, byte[] bArr, fjr fjrVar) {
        Parcel a = a();
        a.writeLong(j);
        a.writeInt(i);
        a.writeLong(j2);
        a.writeInt(i2);
        a.writeByteArray(bArr);
        bkh.f(a, fjrVar);
        Parcel hG = hG(3, a);
        byte[] createByteArray = hG.createByteArray();
        hG.recycle();
        return createByteArray;
    }

    @Override // defpackage.fju
    public final byte[] g(long j, int i) {
        Parcel a = a();
        a.writeLong(j);
        a.writeInt(i);
        Parcel hG = hG(4, a);
        byte[] createByteArray = hG.createByteArray();
        hG.recycle();
        return createByteArray;
    }

    @Override // defpackage.fju
    public final Bundle h(long j) {
        Parcel a = a();
        a.writeLong(j);
        a.writeInt(0);
        Parcel hG = hG(5, a);
        Bundle bundle = (Bundle) bkh.a(hG, Bundle.CREATOR);
        hG.recycle();
        return bundle;
    }

    @Override // defpackage.fju
    public final void i(long j, Bundle bundle) {
        Parcel a = a();
        a.writeLong(j);
        a.writeInt(0);
        bkh.d(a, bundle);
        hI(2, a);
    }
}
