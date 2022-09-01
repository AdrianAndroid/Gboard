package defpackage;

import android.content.Context;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: cev  reason: default package */
/* loaded from: classes.dex */
public final class cev implements jqk {
    private static final lug a = lug.i("SuperDelight");
    private final Context b;
    private final bys c;

    public cev(Context context, bys bysVar) {
        this.b = context;
        this.c = bysVar;
    }

    @Override // defpackage.jqk
    public final /* synthetic */ void a() {
    }

    @Override // defpackage.jqk
    public final jqj b(jqm jqmVar, jsq jsqVar) {
        List<Locale> b = cej.b(jsqVar);
        jqi e = jqj.e();
        ((luc) ((luc) a.b()).k("com/google/android/apps/inputmethod/libs/delight5/superpacks/SuperDelightDownloadSlicingStrategy", "getSlices", 68, "SuperDelightDownloadSlicingStrategy.java")).w("DownloadSlicing#getSlices() : Locale = %s", b);
        if (b == null || b.isEmpty()) {
            return e.a();
        }
        HashMap hashMap = new HashMap();
        HashSet hashSet = new HashSet();
        for (Locale locale : b) {
            juc a2 = cej.a(this.b, locale, jqmVar.i(), true);
            if (a2 != null) {
                cbc cbcVar = (cbc) cbd.c.j().get(cei.g(a2));
                if (cei.f(a2).longValue() != (cbcVar != null ? cbcVar.b.intValue() : -1)) {
                    boolean a3 = this.c.a();
                    juf g = jug.g();
                    g.f(a2);
                    g.d(2);
                    g.g(a3 ? 1 : 0);
                    hashMap.put(locale, g.a());
                }
            }
        }
        for (jug jugVar : hashMap.values()) {
            if (hashSet.add(jugVar.f().i())) {
                e.c(jugVar);
            }
        }
        jqj a4 = e.a();
        ((luc) ((luc) a.b()).k("com/google/android/apps/inputmethod/libs/delight5/superpacks/SuperDelightDownloadSlicingStrategy", "getSlices", 125, "SuperDelightDownloadSlicingStrategy.java")).w("DownloadSlicing#getSlices(): result %s", a4);
        return a4;
    }

    public final String toString() {
        return "SuperDelightDownloadSlicingStrategy";
    }
}
