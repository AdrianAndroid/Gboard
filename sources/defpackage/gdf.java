package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;

/* compiled from: PG */
/* renamed from: gdf  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class gdf implements fpz {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ gdf(Account account, String str, Bundle bundle, int i) {
        this.d = i;
        this.a = account;
        this.c = str;
        this.b = bundle;
    }

    public /* synthetic */ gdf(fnz fnzVar, fpt fptVar, gdo gdoVar, int i, byte[] bArr) {
        this.d = i;
        this.a = fnzVar;
        this.b = fptVar;
        this.c = gdoVar;
    }

    public /* synthetic */ gdf(String str, String str2, String str3, int i) {
        this.d = i;
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.os.Parcelable, java.lang.Object] */
    @Override // defpackage.fpz
    public final void a(Object obj, Object obj2) {
        int i = this.d;
        if (i == 0) {
            Object obj3 = this.a;
            Object obj4 = this.b;
            Object obj5 = this.c;
            gdo gdoVar = new gdo((fxa) obj2, 1, null, null);
            gdi gdiVar = (gdi) ((gdj) obj).w();
            Parcel a = gdiVar.a();
            bkh.f(a, gdoVar);
            a.writeString((String) obj3);
            a.writeString((String) obj4);
            a.writeString((String) obj5);
            gdiVar.hI(11, a);
        } else if (i == 1) {
            ?? r0 = this.a;
            Object obj6 = this.c;
            ?? r4 = this.b;
            flb flbVar = (flb) ((fkz) obj).w();
            fla flaVar = new fla((fxa) obj2, 0, null);
            Parcel a2 = flbVar.a();
            bkh.f(a2, flaVar);
            bkh.d(a2, r0);
            a2.writeString((String) obj6);
            bkh.d(a2, r4);
            flbVar.hI(1, a2);
        } else {
            Object obj7 = this.a;
            Object obj8 = this.b;
            Object obj9 = this.c;
            gdo gdoVar2 = new gdo((fpt) obj8, 2);
            ((gfn) obj).H((gdo) obj9, gdoVar2, new gfa((fnz) obj7, (fxa) obj2, gdoVar2, null, null));
        }
    }
}
