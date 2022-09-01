package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: djz  reason: default package */
/* loaded from: classes.dex */
final class djz implements jqk {
    private static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/hmm/superpacks/DictionarySlicingStrategy");
    private final bys b;

    public djz(bys bysVar) {
        this.b = bysVar;
    }

    @Override // defpackage.jqk
    public final /* synthetic */ void a() {
    }

    @Override // defpackage.jqk
    public final jqj b(jqm jqmVar, jsq jsqVar) {
        int i;
        ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/hmm/superpacks/DictionarySlicingStrategy", "getSlices", 78, "DictionarySlicingStrategy.java")).w("getSlices(): %s", jqmVar);
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        llp b = hqr.b();
        int size = b.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(((hqt) b.get(i2)).i().q());
        }
        for (Locale locale : arrayList.isEmpty() ? Collections.emptyList() : Collections.unmodifiableList(arrayList)) {
            hashSet.add(locale.toString());
        }
        jqi e = jqj.e();
        boolean a2 = this.b.a();
        for (juc jucVar : jqmVar.i()) {
            String b2 = jucVar.n().b("locale", "");
            int f = jucVar.n().f("version");
            int a3 = div.c().a(b2);
            int b3 = div.c().b(b2);
            if (hashSet.contains(b2) && f > b3) {
                if (!a2 || a3 != 0) {
                    i = 0;
                } else {
                    i = 1;
                    a3 = 0;
                }
                juf g = jug.g();
                g.f(jucVar);
                g.d(a3 == 0 ? 2 : 0);
                g.g(i);
                e.c(g.a());
            }
        }
        jqj a4 = e.a();
        ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/hmm/superpacks/DictionarySlicingStrategy", "getSlices", 108, "DictionarySlicingStrategy.java")).w("getSlices(): result %s", a4);
        return a4;
    }

    public final String toString() {
        return "DictSlicingStrategy";
    }
}
