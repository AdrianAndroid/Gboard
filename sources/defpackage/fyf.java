package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: PG */
/* renamed from: fyf  reason: default package */
/* loaded from: classes.dex */
public final class fyf extends bkf implements fyh {
    public fyf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.learning.dynamite.training.IInAppTrainingController");
    }

    @Override // defpackage.fyh
    public final void e() {
        hJ(3, a());
    }

    @Override // defpackage.fyh
    public final void f(String str, String str2, String str3, int i, boolean z, boolean z2, boolean z3, byte[] bArr, fyk fykVar) {
        Parcel a = a();
        a.writeString(str);
        a.writeString(str2);
        a.writeString(str3);
        a.writeInt(i);
        bkh.c(a, z);
        bkh.c(a, z2);
        bkh.c(a, z3);
        a.writeByteArray(bArr);
        bkh.f(a, fykVar);
        hJ(2, a);
    }

    @Override // defpackage.fyh
    public final void g(String str, String str2, String str3, String str4, boolean z, boolean z2, byte[] bArr, fyk fykVar) {
        Parcel a = a();
        a.writeString(str);
        a.writeString(str2);
        a.writeString(str3);
        a.writeString(str4);
        bkh.c(a, z);
        bkh.c(a, z2);
        a.writeByteArray(bArr);
        bkh.f(a, fykVar);
        hJ(5, a);
    }
}
