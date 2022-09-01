package defpackage;

import android.text.TextUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: byc  reason: default package */
/* loaded from: classes.dex */
public final class byc implements jqk {
    private static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/crank/modelmanager/CrankSlicingStrategy");
    private final llp b;

    public byc(llp llpVar) {
        this.b = llpVar;
    }

    @Override // defpackage.jqk
    public final /* synthetic */ void a() {
    }

    @Override // defpackage.jqk
    public final jqj b(jqm jqmVar, jsq jsqVar) {
        int i;
        HashSet hashSet = new HashSet();
        llp llpVar = this.b;
        int size = llpVar.size();
        int i2 = 0;
        while (i2 < size) {
            Locale locale = (Locale) llpVar.get(i2);
            Iterator it = jqmVar.i().iterator();
            while (true) {
                i = i2 + 1;
                if (it.hasNext()) {
                    juc jucVar = (juc) it.next();
                    String b = jucVar.n().b("locale", "");
                    if (TextUtils.isEmpty(b)) {
                        ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/crank/modelmanager/CrankSlicingStrategy", "getSlices", 47, "CrankSlicingStrategy.java")).t("getSlices() : Could not get packLocaleStr from manifest");
                    } else if (jay.h(jay.f(b), locale)) {
                        hashSet.add(jug.h(jucVar));
                    }
                }
            }
            i2 = i;
        }
        jqi e = jqj.e();
        e.b().j(hashSet);
        return e.a();
    }
}
