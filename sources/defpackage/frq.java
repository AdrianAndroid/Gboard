package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* compiled from: PG */
/* renamed from: frq  reason: default package */
/* loaded from: classes.dex */
public final class frq extends frw {
    public static final Parcelable.Creator CREATOR = new fmq(15);
    final int a;
    public final Account b;
    public final int c;
    public final GoogleSignInAccount d;

    public frq(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.a = i;
        this.b = account;
        this.c = i2;
        this.d = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int C = fyb.C(parcel);
        fyb.I(parcel, 1, this.a);
        fyb.R(parcel, 2, this.b, i);
        fyb.I(parcel, 3, this.c);
        fyb.R(parcel, 4, this.d, i);
        fyb.E(parcel, C);
    }
}
