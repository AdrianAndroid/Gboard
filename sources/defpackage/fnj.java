package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;

/* compiled from: PG */
/* renamed from: fnj  reason: default package */
/* loaded from: classes.dex */
public final class fnj extends frw {
    public static final Parcelable.Creator CREATOR = new fmq(6);
    public final String a;
    public final boolean b;
    public final boolean c;
    private final fri d;

    public fnj(String str, IBinder iBinder, boolean z, boolean z2) {
        frj frhVar;
        this.a = str;
        fnd fndVar = null;
        if (iBinder != null) {
            try {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
                if (queryLocalInterface instanceof frj) {
                    frhVar = (frj) queryLocalInterface;
                } else {
                    frhVar = new frh(iBinder);
                }
                ftm f = frhVar.f();
                byte[] bArr = f == null ? null : (byte[]) ftl.c(f);
                if (bArr != null) {
                    fndVar = new fnd(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e);
            }
        }
        this.d = fndVar;
        this.b = z;
        this.c = z2;
    }

    public fnj(String str, fri friVar, boolean z, boolean z2) {
        this.a = str;
        this.d = friVar;
        this.b = z;
        this.c = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int C = fyb.C(parcel);
        fyb.S(parcel, 1, this.a);
        fri friVar = this.d;
        if (friVar == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            friVar = null;
        }
        fyb.N(parcel, 2, friVar);
        fyb.F(parcel, 3, this.b);
        fyb.F(parcel, 4, this.c);
        fyb.E(parcel, C);
    }
}
