package com.google.android.gms.googlehelp;

import android.accounts.Account;
import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class GoogleHelp extends frw implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new fuw();
    boolean A;
    public boolean B;
    int C;
    String D;
    boolean E;
    String F;
    boolean G;
    ND4CSettings H;
    boolean I;
    List J;
    public fyb K;
    final int a;
    String b;
    Account c;
    Bundle d;
    String e;
    String f;
    Bitmap g;
    boolean h;
    boolean i;
    List j;
    @Deprecated
    Bundle k;
    @Deprecated
    Bitmap l;
    @Deprecated
    byte[] m;
    @Deprecated
    int n;
    @Deprecated
    int o;
    String p;
    public Uri q;
    List r;
    fuq s;
    List t;
    boolean u;
    public ErrorReport v;
    public TogglingData w;
    int x;
    PendingIntent y;
    public int z;

    public GoogleHelp(int i, String str, Account account, Bundle bundle, String str2, String str3, Bitmap bitmap, boolean z, boolean z2, List list, Bundle bundle2, Bitmap bitmap2, byte[] bArr, int i2, int i3, String str4, Uri uri, List list2, int i4, fuq fuqVar, List list3, boolean z3, ErrorReport errorReport, TogglingData togglingData, int i5, PendingIntent pendingIntent, int i6, boolean z4, boolean z5, int i7, String str5, boolean z6, String str6, boolean z7, ND4CSettings nD4CSettings, boolean z8, List list4) {
        this.v = new ErrorReport();
        if (!TextUtils.isEmpty(str)) {
            this.a = i;
            this.z = i6;
            this.A = z4;
            this.B = z5;
            this.C = i7;
            this.D = str5;
            this.b = str;
            this.c = account;
            this.d = bundle;
            this.e = str2;
            this.f = str3;
            this.g = bitmap;
            this.h = z;
            this.i = z2;
            this.E = z6;
            this.j = list;
            this.y = pendingIntent;
            this.k = bundle2;
            this.l = bitmap2;
            this.m = bArr;
            this.n = i2;
            this.o = i3;
            this.p = str4;
            this.q = uri;
            this.r = list2;
            if (i < 4) {
                fuq fuqVar2 = new fuq();
                fuqVar2.a = i4;
                this.s = fuqVar2;
            } else {
                this.s = fuqVar == null ? new fuq() : fuqVar;
            }
            this.t = list3;
            this.u = z3;
            this.v = errorReport;
            if (errorReport != null) {
                errorReport.X = "GoogleHelp";
            }
            this.w = togglingData;
            this.x = i5;
            this.F = str6;
            this.G = z7;
            this.H = nD4CSettings;
            this.I = z8;
            this.J = list4;
            return;
        }
        throw new IllegalStateException("Help requires a non-empty appContext");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int C = fyb.C(parcel);
        fyb.I(parcel, 1, this.a);
        fyb.S(parcel, 2, this.b);
        fyb.R(parcel, 3, this.c, i);
        fyb.K(parcel, 4, this.d);
        fyb.F(parcel, 5, this.h);
        fyb.F(parcel, 6, this.i);
        fyb.U(parcel, 7, this.j);
        fyb.K(parcel, 10, this.k);
        fyb.R(parcel, 11, this.l, i);
        fyb.S(parcel, 14, this.p);
        fyb.R(parcel, 15, this.q, i);
        fyb.W(parcel, 16, this.r);
        fyb.I(parcel, 17, 0);
        fyb.W(parcel, 18, this.t);
        fyb.L(parcel, 19, this.m);
        fyb.I(parcel, 20, this.n);
        fyb.I(parcel, 21, this.o);
        fyb.F(parcel, 22, this.u);
        fyb.R(parcel, 23, this.v, i);
        fyb.R(parcel, 25, this.s, i);
        fyb.S(parcel, 28, this.e);
        fyb.R(parcel, 31, this.w, i);
        fyb.I(parcel, 32, this.x);
        fyb.R(parcel, 33, this.y, i);
        fyb.S(parcel, 34, this.f);
        fyb.R(parcel, 35, this.g, i);
        fyb.I(parcel, 36, this.z);
        fyb.F(parcel, 37, this.A);
        fyb.F(parcel, 38, this.B);
        fyb.I(parcel, 39, this.C);
        fyb.S(parcel, 40, this.D);
        fyb.F(parcel, 41, this.E);
        fyb.S(parcel, 42, this.F);
        fyb.F(parcel, 43, this.G);
        fyb.R(parcel, 44, this.H, i);
        fyb.F(parcel, 45, this.I);
        fyb.W(parcel, 46, this.J);
        fyb.E(parcel, C);
    }
}
