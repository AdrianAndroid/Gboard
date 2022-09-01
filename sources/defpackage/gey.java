package defpackage;

import android.os.Parcel;

/* compiled from: PG */
/* renamed from: gey  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class gey implements fpz {
    public static final /* synthetic */ gey a = new gey(1);
    private final /* synthetic */ int b;

    public /* synthetic */ gey(int i) {
        this.b = i;
    }

    @Override // defpackage.fpz
    public final void a(Object obj, Object obj2) {
        if (this.b == 0) {
            gez gezVar = new gez((fxa) obj2, null);
            gfj gfjVar = (gfj) ((gfn) obj).w();
            Parcel a2 = gfjVar.a();
            bkh.f(a2, gezVar);
            gfjVar.hI(2, a2);
            return;
        }
        gdo gdoVar = new gdo((fxa) obj2, 0, null);
        gdp gdpVar = (gdp) ((gdq) obj).w();
        Parcel a3 = gdpVar.a();
        bkh.f(a3, gdoVar);
        gdpVar.hJ(1, a3);
    }
}
