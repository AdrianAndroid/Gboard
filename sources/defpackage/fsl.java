package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* renamed from: fsl  reason: default package */
/* loaded from: classes.dex */
public final class fsl extends frw {
    public static final Parcelable.Creator CREATOR = new fmq(19);
    public final Bundle a;

    public fsl() {
        String str;
        Bundle bundle = new Bundle();
        this.a = bundle;
        bundle.putInt("clientVersion", fmx.b);
        try {
            str = System.getProperty("os.arch");
        } catch (Exception unused) {
            str = "?";
        }
        this.a.putString("appArchitecture", str);
    }

    public final int a() {
        return this.a.getInt("timeoutMs", (int) nqa.a.a().a());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int C = fyb.C(parcel);
        fyb.K(parcel, 2, this.a);
        fyb.E(parcel, C);
    }

    public fsl(Bundle bundle) {
        new Bundle();
        this.a = bundle;
    }
}
