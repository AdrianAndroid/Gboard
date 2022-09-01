package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* renamed from: fnh  reason: default package */
/* loaded from: classes.dex */
public final class fnh extends frw {
    public static final Parcelable.Creator CREATOR = new fmq(4);
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    private final Context e;

    /* JADX WARN: Type inference failed for: r0v4, types: [ftm, android.os.IBinder] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int C = fyb.C(parcel);
        fyb.S(parcel, 1, this.a);
        fyb.F(parcel, 2, this.b);
        fyb.F(parcel, 3, this.c);
        fyb.N(parcel, 4, ftl.b(this.e));
        fyb.F(parcel, 5, this.d);
        fyb.E(parcel, C);
    }

    public fnh(String str, boolean z, boolean z2, IBinder iBinder, boolean z3) {
        ftm ftkVar;
        this.a = str;
        this.b = z;
        this.c = z2;
        if (iBinder == null) {
            ftkVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            ftkVar = queryLocalInterface instanceof ftm ? (ftm) queryLocalInterface : new ftk(iBinder);
        }
        this.e = (Context) ftl.c(ftkVar);
        this.d = z3;
    }
}
