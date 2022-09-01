package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* renamed from: cyi  reason: default package */
/* loaded from: classes.dex */
public abstract class cyi implements cyu {
    public static cyh i() {
        cxs cxsVar = new cxs();
        String str = (String) cyj.o.c();
        if (str != null) {
            cxsVar.a = str;
            cxsVar.c(-1L);
            cxsVar.b = 4;
            return cxsVar;
        }
        throw new NullPointerException("Null baseUrl");
    }

    @Override // defpackage.cyw
    public abstract long a();

    @Override // defpackage.cyu
    public /* bridge */ /* synthetic */ cyt b() {
        throw null;
    }

    public abstract lfb c();

    public abstract lfb d();

    public abstract lfb e();

    public abstract lfb f();

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
        return iil.e;
    }

    @Override // defpackage.cyw
    public final llw p() {
        cyx a = cyy.a(true);
        a.b("component", d());
        a.b("q", f());
        a.b("collection", c());
        a.b("pos", e());
        return a.l();
    }
}
