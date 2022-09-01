package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* renamed from: cyl  reason: default package */
/* loaded from: classes.dex */
public abstract class cyl implements cyu {
    static final String j = cys.GIF_TINY.f;

    public static cyk l() {
        cxu cxuVar = new cxu();
        String str = (String) cyj.h.c();
        if (str != null) {
            cxuVar.a = str;
            String str2 = (String) cyj.a.c();
            if (str2 != null) {
                cxuVar.e = str2;
                fhr.z(cxuVar);
                return cxuVar.c(4);
            }
            throw new NullPointerException("Null contentFilterLevel");
        }
        throw new NullPointerException("Null baseUrl");
    }

    @Override // defpackage.cyw
    public final /* synthetic */ long a() {
        return -1L;
    }

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

    public abstract lfb i();

    public abstract String j();

    public abstract String k();

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
        return iil.j;
    }

    @Override // defpackage.cyw
    public final llw p() {
        cyx a = cyy.a(true);
        a.d("q", k());
        a.d("contentfilter", j());
        a.d("media_filter", j);
        a.b("ar_range", d());
        a.b("pos", i());
        a.b("limit", f());
        a.b("component", e());
        a.b("anon_id", c());
        a.e(cyy.b());
        return a.l();
    }
}
