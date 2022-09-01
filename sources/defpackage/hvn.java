package defpackage;

import android.content.res.Configuration;

/* compiled from: PG */
/* renamed from: hvn  reason: default package */
/* loaded from: classes.dex */
final class hvn extends irm {
    final /* synthetic */ hvp a;

    public hvn(hvp hvpVar) {
        this.a = hvpVar;
    }

    @Override // defpackage.irm
    protected final void b(Configuration configuration, Configuration configuration2) {
        if (configuration2 == null || configuration.orientation != configuration2.orientation) {
            this.a.g();
            hvk hvkVar = this.a.k;
            if (hvkVar == null) {
                return;
            }
            hvkVar.f();
        }
    }

    @Override // defpackage.irm
    public final void d(String str) {
        hvk hvkVar;
        hvp hvpVar = this.a;
        if (hvpVar.m.equals(str)) {
            return;
        }
        hvpVar.m = str;
        hvpVar.n = hyq.m(hvpVar.m);
        hvpVar.f.g(hvpVar.n);
        hvpVar.g.g(hvpVar.n);
        int i = hvpVar.b;
        hvpVar.e();
        if (i != hvpVar.b || (hvkVar = hvpVar.k) == null) {
            return;
        }
        hvkVar.f();
    }
}
