package defpackage;

import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: bzv  reason: default package */
/* loaded from: classes.dex */
public final class bzv {
    public final cfd c;
    private final gzg e;
    public String a = "";
    public String b = "";
    public volatile llw d = lrq.b;

    public bzv(cfd cfdVar) {
        cal calVar = new cal(this, 1);
        this.e = calVar;
        this.c = cfdVar;
        gzc.b.e("delight_apps", calVar);
        gxo.a(10).execute(new bqj(this, 16));
    }

    public final gzf a(Locale locale, String str) {
        List<gzf> list = (List) this.d.get(locale.toLanguageTag());
        if (list == null || list.isEmpty()) {
            return null;
        }
        iqe g = iqe.g("");
        for (gzf gzfVar : list) {
            g.h(gzfVar.h);
            if (g.j(str)) {
                return gzfVar;
            }
        }
        return null;
    }
}
