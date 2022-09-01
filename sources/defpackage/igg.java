package defpackage;

import java.util.List;

/* compiled from: PG */
/* renamed from: igg  reason: default package */
/* loaded from: classes.dex */
public final class igg {
    public final Class a;
    public final Class b;
    public final gqh c;
    public final igf d;
    public final iap e;
    public final igb f;
    public final hek g;

    public igg(ige igeVar) {
        this.a = igeVar.a;
        this.b = igeVar.b;
        this.d = igeVar.c;
        igc igcVar = igeVar.e;
        igb igbVar = null;
        this.g = igcVar != null ? new hek(igcVar) : null;
        iao iaoVar = igeVar.f;
        this.e = iaoVar != null ? iaoVar.b() : null;
        ify ifyVar = igeVar.g;
        this.f = ifyVar != null ? new igb(ifyVar) : igbVar;
        this.c = igeVar.d;
    }

    public static ige b(Class cls, Class cls2, igf igfVar) {
        return new ige(cls, cls2, igfVar);
    }

    public final int a() {
        igb igbVar = this.f;
        if (igbVar != null) {
            return igbVar.e;
        }
        return 0;
    }

    public final llp c() {
        igb igbVar = this.f;
        if (igbVar != null) {
            llk e = llp.e();
            for (iga igaVar : igbVar.n) {
                e.h(igaVar.a());
            }
            return e.g();
        }
        return llp.q();
    }

    public final llp d() {
        igb igbVar = this.f;
        if (igbVar != null) {
            llk e = llp.e();
            for (iga igaVar : igbVar.m) {
                e.h(igaVar.a());
            }
            return e.g();
        }
        return llp.q();
    }

    public final llw e() {
        igb igbVar = this.f;
        return igbVar != null ? igbVar.h : lrq.b;
    }

    public final String f() {
        igb igbVar = this.f;
        if (igbVar != null) {
            return igbVar.f;
        }
        return null;
    }

    public final List g() {
        igb igbVar = this.f;
        return igbVar != null ? igbVar.p : llp.q();
    }

    public final boolean h() {
        igb igbVar = this.f;
        return igbVar == null || igbVar.g;
    }

    public final String toString() {
        lfa S = jdg.S(this);
        S.b("interface", this.a.getSimpleName());
        S.b("class", this.b.getSimpleName());
        S.b("strategy", this.d);
        return S.toString();
    }
}
