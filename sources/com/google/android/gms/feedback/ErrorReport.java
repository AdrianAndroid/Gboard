package com.google.android.gms.feedback;

import android.app.ApplicationErrorReport;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.io.File;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ErrorReport extends frw implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new fuo(1);
    public String A;
    public String B;
    public String C;
    public Bundle D;
    public boolean E;
    public int F;
    public int G;
    public boolean H;
    public String I;
    public String J;
    public int K;
    public String L;
    public String M;
    public String N;
    public String O;
    public String P;
    @Deprecated
    public String Q;
    public String R;
    public BitmapTeleporter S;
    public String T;
    public fun[] U;
    public String[] V;
    public boolean W;
    public String X;
    public fuq Y;
    public fup Z;
    public ApplicationErrorReport a;
    @Deprecated
    public String aa;
    public boolean ab;
    public Bundle ac;
    public List ad;
    public boolean ae;
    public Bitmap af;
    public String ag;
    public List ah;
    public int ai;
    public int aj;
    public String[] ak;
    public String[] al;
    public String[] am;
    public boolean an;
    public boolean ao;
    public String b;
    public int c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public int k;
    public String l;
    public String m;
    public String n;
    public String o;
    public String p;
    public String[] q;
    public String[] r;
    public String[] s;
    public String t;
    public String u;
    public byte[] v;
    public int w;
    public int x;
    public int y;
    public int z;

    public ErrorReport() {
        this.a = new ApplicationErrorReport();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int C = fyb.C(parcel);
        fyb.R(parcel, 2, this.a, i);
        fyb.S(parcel, 3, this.b);
        fyb.I(parcel, 4, this.c);
        fyb.S(parcel, 5, this.d);
        fyb.S(parcel, 6, this.e);
        fyb.S(parcel, 7, this.f);
        fyb.S(parcel, 8, this.g);
        fyb.S(parcel, 9, this.h);
        fyb.S(parcel, 10, this.i);
        fyb.S(parcel, 11, this.j);
        fyb.I(parcel, 12, this.k);
        fyb.S(parcel, 13, this.l);
        fyb.S(parcel, 14, this.m);
        fyb.S(parcel, 15, this.n);
        fyb.S(parcel, 16, this.o);
        fyb.S(parcel, 17, this.p);
        fyb.T(parcel, 18, this.q);
        fyb.T(parcel, 19, this.r);
        fyb.T(parcel, 20, this.s);
        fyb.S(parcel, 21, this.t);
        fyb.S(parcel, 22, this.u);
        fyb.L(parcel, 23, this.v);
        fyb.I(parcel, 24, this.w);
        fyb.I(parcel, 25, this.x);
        fyb.I(parcel, 26, this.y);
        fyb.I(parcel, 27, this.z);
        fyb.S(parcel, 28, this.A);
        fyb.S(parcel, 29, this.B);
        fyb.S(parcel, 30, this.C);
        fyb.K(parcel, 31, this.D);
        fyb.F(parcel, 32, this.E);
        fyb.I(parcel, 33, this.F);
        fyb.I(parcel, 34, this.G);
        fyb.F(parcel, 35, this.H);
        fyb.S(parcel, 36, this.I);
        fyb.S(parcel, 37, this.J);
        fyb.I(parcel, 38, this.K);
        fyb.S(parcel, 39, this.L);
        fyb.S(parcel, 40, this.M);
        fyb.S(parcel, 41, this.N);
        fyb.S(parcel, 42, this.O);
        fyb.S(parcel, 43, this.P);
        fyb.S(parcel, 44, this.Q);
        fyb.S(parcel, 45, this.R);
        fyb.R(parcel, 46, this.S, i);
        fyb.S(parcel, 47, this.T);
        fyb.V(parcel, 48, this.U, i);
        fyb.T(parcel, 49, this.V);
        fyb.F(parcel, 50, this.W);
        fyb.S(parcel, 51, this.X);
        fyb.R(parcel, 52, this.Y, i);
        fyb.R(parcel, 53, this.Z, i);
        fyb.S(parcel, 54, this.aa);
        fyb.F(parcel, 55, this.ab);
        fyb.K(parcel, 56, this.ac);
        fyb.W(parcel, 57, this.ad);
        fyb.F(parcel, 58, this.ae);
        fyb.R(parcel, 59, this.af, i);
        fyb.S(parcel, 60, this.ag);
        fyb.U(parcel, 61, this.ah);
        fyb.I(parcel, 62, this.ai);
        fyb.I(parcel, 63, this.aj);
        fyb.T(parcel, 64, this.ak);
        fyb.T(parcel, 65, this.al);
        fyb.T(parcel, 66, this.am);
        fyb.F(parcel, 67, this.an);
        fyb.F(parcel, 68, this.ao);
        fyb.E(parcel, C);
    }

    public ErrorReport(ApplicationErrorReport applicationErrorReport, String str, int i, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i2, String str9, String str10, String str11, String str12, String str13, String[] strArr, String[] strArr2, String[] strArr3, String str14, String str15, byte[] bArr, int i3, int i4, int i5, int i6, String str16, String str17, String str18, Bundle bundle, boolean z, int i7, int i8, boolean z2, String str19, String str20, int i9, String str21, String str22, String str23, String str24, String str25, String str26, String str27, BitmapTeleporter bitmapTeleporter, String str28, fun[] funVarArr, String[] strArr4, boolean z3, String str29, fuq fuqVar, fup fupVar, String str30, boolean z4, Bundle bundle2, List list, boolean z5, Bitmap bitmap, String str31, List list2, int i10, int i11, String[] strArr5, String[] strArr6, String[] strArr7, boolean z6, boolean z7) {
        new ApplicationErrorReport();
        this.a = applicationErrorReport;
        this.b = str;
        this.c = i;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = i2;
        this.l = str9;
        this.m = str10;
        this.n = str11;
        this.o = str12;
        this.p = str13;
        this.q = strArr;
        this.r = strArr2;
        this.s = strArr3;
        this.t = str14;
        this.u = str15;
        this.v = bArr;
        this.w = i3;
        this.x = i4;
        this.y = i5;
        this.z = i6;
        this.A = str16;
        this.B = str17;
        this.C = str18;
        this.D = bundle;
        this.E = z;
        this.F = i7;
        this.G = i8;
        this.H = z2;
        this.I = str19;
        this.J = str20;
        this.K = i9;
        this.L = str21;
        this.M = str22;
        this.N = str23;
        this.O = str24;
        this.P = str25;
        this.Q = str26;
        this.R = str27;
        this.S = bitmapTeleporter;
        this.T = str28;
        this.U = funVarArr;
        this.V = strArr4;
        this.W = z3;
        this.X = str29;
        this.Y = fuqVar;
        this.Z = fupVar;
        this.aa = str30;
        this.ab = z4;
        this.ac = bundle2;
        this.ad = list;
        this.ae = z5;
        this.af = bitmap;
        this.ag = str31;
        this.ah = list2;
        this.ai = i10;
        this.aj = i11;
        this.ak = strArr5;
        this.al = strArr6;
        this.am = strArr7;
        this.an = z6;
        this.ao = z7;
    }

    public ErrorReport(ful fulVar, File file) {
        this.a = new ApplicationErrorReport();
        Bundle bundle = fulVar.b;
        if (bundle != null && !bundle.isEmpty()) {
            this.D = fulVar.b;
        }
        if (!TextUtils.isEmpty(fulVar.a)) {
            this.B = fulVar.a;
        }
        if (!TextUtils.isEmpty(fulVar.c)) {
            this.b = fulVar.c;
        }
        ApplicationErrorReport.CrashInfo crashInfo = fulVar.d.crashInfo;
        if (crashInfo != null) {
            this.M = crashInfo.throwMethodName;
            this.K = crashInfo.throwLineNumber;
            this.L = crashInfo.throwClassName;
            this.N = crashInfo.stackTrace;
            this.I = crashInfo.exceptionClassName;
            this.O = crashInfo.exceptionMessage;
            this.J = crashInfo.throwFileName;
        }
        fuq fuqVar = fulVar.j;
        if (fuqVar != null) {
            this.Y = fuqVar;
        }
        if (!TextUtils.isEmpty(fulVar.e)) {
            this.P = fulVar.e;
        }
        String str = fulVar.g;
        if (!TextUtils.isEmpty(str)) {
            this.a.packageName = str;
        }
        if (!TextUtils.isEmpty(fulVar.n)) {
            this.ag = fulVar.n;
        }
        Bitmap bitmap = fulVar.m;
        if (bitmap != null) {
            this.af = bitmap;
        }
        if (file != null) {
            this.S = fulVar.f;
            List<fun> list = fulVar.h;
            if (list != null && !list.isEmpty()) {
                for (fun funVar : list) {
                    funVar.e = file;
                }
                this.U = (fun[]) list.toArray(new fun[0]);
            }
        }
        fup fupVar = fulVar.k;
        if (fupVar != null) {
            this.Z = fupVar;
        }
        this.W = fulVar.i;
        this.ae = fulVar.l;
        this.E = fulVar.o;
        this.an = fulVar.q;
    }
}
