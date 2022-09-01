package defpackage;

import android.app.ApplicationErrorReport;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: ful  reason: default package */
/* loaded from: classes.dex */
public final class ful extends frw {
    public static final Parcelable.Creator CREATOR = new fum();
    public String a;
    public Bundle b;
    public String c;
    public ApplicationErrorReport d;
    public String e;
    public BitmapTeleporter f;
    public String g;
    public List h;
    public boolean i;
    public fuq j;
    public fup k;
    public boolean l;
    public Bitmap m;
    public String n;
    public boolean o;
    long p;
    public boolean q;
    public fyb r;

    public ful(ApplicationErrorReport applicationErrorReport) {
        this(null, null, null, applicationErrorReport, null, null, null, null, true, null, null, false, null, null, false, 0L, false);
    }

    public static ful a(List list) {
        ful fulVar = new ful(new ApplicationErrorReport());
        if (list != null) {
            fulVar.h = list;
        }
        return fulVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fum.a(this, parcel, i);
    }

    public ful(String str, Bundle bundle, String str2, ApplicationErrorReport applicationErrorReport, String str3, BitmapTeleporter bitmapTeleporter, String str4, List list, boolean z, fuq fuqVar, fup fupVar, boolean z2, Bitmap bitmap, String str5, boolean z3, long j, boolean z4) {
        this.a = str;
        this.b = bundle != null ? bundle : new Bundle();
        this.c = str2;
        this.d = applicationErrorReport != null ? applicationErrorReport : new ApplicationErrorReport();
        this.e = str3;
        this.f = bitmapTeleporter;
        this.g = str4;
        this.h = list != null ? list : new ArrayList();
        this.i = z;
        this.j = fuqVar;
        this.k = fupVar;
        this.l = z2;
        this.m = bitmap;
        this.n = str5;
        this.o = z3;
        this.p = j;
        this.q = z4;
    }
}
