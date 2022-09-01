package defpackage;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;

/* compiled from: PG */
/* renamed from: fqz  reason: default package */
/* loaded from: classes.dex */
public final class fqz extends frw {
    public static final Parcelable.Creator CREATOR = new fmq(13);
    public static final Scope[] a = new Scope[0];
    public static final fmv[] b = new fmv[0];
    public final int c;
    public final int d;
    public final int e;
    public String f;
    public IBinder g;
    public Scope[] h;
    public Bundle i;
    public Account j;
    public fmv[] k;
    public fmv[] l;
    public boolean m;
    public int n;
    public boolean o;
    public String p;

    public fqz(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, fmv[] fmvVarArr, fmv[] fmvVarArr2, boolean z, int i4, boolean z2, String str2) {
        scopeArr = scopeArr == null ? a : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        fmvVarArr = fmvVarArr == null ? b : fmvVarArr;
        fmvVarArr2 = fmvVarArr2 == null ? b : fmvVarArr2;
        this.c = i;
        this.d = i2;
        this.e = i3;
        if ("com.google.android.gms".equals(str)) {
            this.f = "com.google.android.gms";
        } else {
            this.f = str;
        }
        if (i < 2) {
            Account account2 = null;
            if (iBinder != null) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                frg frgVar = queryLocalInterface instanceof frg ? (frg) queryLocalInterface : new frg(iBinder);
                if (frgVar != null) {
                    long clearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        try {
                            Parcel hG = frgVar.hG(2, frgVar.a());
                            Account account3 = (Account) bkh.a(hG, Account.CREATOR);
                            hG.recycle();
                            Binder.restoreCallingIdentity(clearCallingIdentity);
                            account2 = account3;
                        } catch (RemoteException unused) {
                            Log.w("AccountAccessor", "Remote account accessor probably died");
                            Binder.restoreCallingIdentity(clearCallingIdentity);
                        }
                    } catch (Throwable th) {
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                        throw th;
                    }
                }
            }
            this.j = account2;
        } else {
            this.g = iBinder;
            this.j = account;
        }
        this.h = scopeArr;
        this.i = bundle;
        this.k = fmvVarArr;
        this.l = fmvVarArr2;
        this.m = z;
        this.n = i4;
        this.o = z2;
        this.p = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fmq.a(this, parcel, i);
    }
}
