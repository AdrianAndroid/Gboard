package defpackage;

import com.google.android.apps.inputmethod.libs.delight5.Delight5Facilitator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* renamed from: cee  reason: default package */
/* loaded from: classes.dex */
public final class cee implements gyg {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/delight5/personaldictionary/PersonalDictionaryDataHandler");
    private static final lmz b = lmz.t("ja", "ko", "zh");
    private static final lmz c = lmz.r("handwriting");
    private final Map d = new HashMap();
    private final Set e = new HashSet();
    private final ceg f;

    public cee(ceg cegVar) {
        this.f = cegVar;
    }

    @Override // defpackage.gyg
    public final void b() {
        this.d.clear();
        this.e.clear();
    }

    @Override // defpackage.gyg
    public final void c() {
        ceg cegVar = this.f;
        boolean z = false;
        for (Map.Entry entry : this.d.entrySet()) {
            Locale locale = (Locale) entry.getKey();
            ced cedVar = (ced) entry.getValue();
            z |= new cef(cedVar).b(cegVar.c, cegVar.a(locale));
            cegVar.d.put(locale, cedVar.a);
        }
        if (z) {
            Delight5Facilitator delight5Facilitator = cegVar.c;
            delight5Facilitator.h.c(cegVar.b(delight5Facilitator.n()));
        }
        this.d.clear();
        this.e.clear();
    }

    @Override // defpackage.gyg
    public final void d(Object[] objArr) {
        ced cedVar;
        String e = gyo.e(objArr);
        jav javVar = jav.d;
        try {
            javVar = jav.e(e);
        } catch (RuntimeException e2) {
            ((ltd) ((ltd) ((ltd) a.d()).i(e2)).k("com/google/android/apps/inputmethod/libs/delight5/personaldictionary/PersonalDictionaryDataHandler", "handleOneRecord", (char) 136, "PersonalDictionaryDataHandler.java")).s();
        }
        if (!jav.d.equals(javVar)) {
            jav i = javVar.i(this.e);
            if (i == null) {
                return;
            }
            cedVar = (ced) this.d.get(i.q());
        } else {
            cedVar = null;
        }
        String m = gyo.m(objArr);
        if (m == null || m.length() > 256) {
            return;
        }
        if (cedVar != null) {
            cedVar.b(m);
        } else {
            for (ced cedVar2 : this.d.values()) {
                cedVar2.b(m);
            }
        }
        String i2 = gyo.i(objArr);
        if (i2 == null || i2.length() > 256) {
            return;
        }
        if (cedVar != null) {
            cedVar.a(i2, m);
            return;
        }
        for (ced cedVar3 : this.d.values()) {
            cedVar3.a(i2, m);
        }
    }

    @Override // defpackage.gyg
    public final void g() {
        this.e.clear();
        llp b2 = hqr.b();
        int size = b2.size();
        for (int i = 0; i < size; i++) {
            hqt hqtVar = (hqt) b2.get(i);
            if (!b.contains(hqtVar.h().g) && !c.contains(hqtVar.p())) {
                this.e.add(hqtVar.h());
            }
        }
        ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/delight5/personaldictionary/PersonalDictionaryDataHandler", "beginProcess", 111, "PersonalDictionaryDataHandler.java")).w("LanguageTags = %s", this.e);
        this.d.clear();
        for (jav javVar : this.e) {
            Locale q = javVar.q();
            if (!Locale.ROOT.equals(q)) {
                this.d.put(q, new ced(q));
            }
        }
    }
}
