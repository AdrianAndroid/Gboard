package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* renamed from: czg  reason: default package */
/* loaded from: classes.dex */
public abstract class czg implements cyu {
    @Override // defpackage.cyw
    public abstract long a();

    @Override // defpackage.cyu
    public /* bridge */ /* synthetic */ cyt b() {
        throw null;
    }

    public abstract lfb c();

    public abstract String d();

    @Override // defpackage.cyw
    public abstract String g();

    @Override // defpackage.cyw
    public abstract int h();

    @Override // defpackage.cyw
    public final /* synthetic */ Uri m() {
        return dip.q(this);
    }

    @Override // defpackage.cyw
    public final /* synthetic */ iih n() {
        return dip.r(this);
    }

    @Override // defpackage.cyw
    public final iil o() {
        return iil.d;
    }

    @Override // defpackage.cyw
    public final llw p() {
        cyx a = cyy.a(false);
        a.d("contentfilter", d());
        a.d("media_filter", "minimal");
        a.b("pos", c());
        a.e(cyy.b());
        return a.l();
    }
}
