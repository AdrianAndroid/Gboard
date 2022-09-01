package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* renamed from: cze  reason: default package */
/* loaded from: classes.dex */
public abstract class cze implements cyu {
    static final String g = cys.a(cys.PNG_TRANSPARENT, cys.GIF_TINY_TRANSPARENT, cys.GIF_TRANSPARENT);

    public static czd i() {
        cxw cxwVar = new cxw();
        String str = (String) cyj.h.c();
        if (str != null) {
            cxwVar.a = str;
            String str2 = (String) cyj.a.c();
            if (str2 != null) {
                cxwVar.c = str2;
                fhr.z(cxwVar);
                cxwVar.d = 4;
                return cxwVar;
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

    public abstract String e();

    public abstract String f();

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
        return iil.k;
    }

    @Override // defpackage.cyw
    public final llw p() {
        cyx a = cyy.a(true);
        a.d("q", f());
        a.d("contentfilter", e());
        a.d("searchfilter", "sticker");
        a.b("anon_id", c());
        a.b("pos", d());
        a.d("media_filter", g);
        a.e(cyy.b());
        return a.l();
    }
}
