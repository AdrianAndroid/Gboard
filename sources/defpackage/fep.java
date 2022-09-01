package defpackage;

import java.util.List;

/* compiled from: PG */
/* renamed from: fep  reason: default package */
/* loaded from: classes.dex */
public final class fep implements jqk {
    private static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/SpeechPackSlicingStrategy");
    private final bys b;

    public fep(bys bysVar) {
        this.b = bysVar;
    }

    @Override // defpackage.jqk
    public final /* synthetic */ void a() {
    }

    @Override // defpackage.jqk
    public final jqj b(jqm jqmVar, jsq jsqVar) {
        int i;
        List<jav> c = jsqVar.c("LANGUAGE_TAGS");
        if (hgw.f(c)) {
            ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/SpeechPackSlicingStrategy", "getSlices", 45, "SpeechPackSlicingStrategy.java")).t("getSlices() : Received null or empty languageTags.");
            return jqj.d;
        }
        ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/SpeechPackSlicingStrategy", "getSlices", 50, "SpeechPackSlicingStrategy.java")).aa(jsqVar.e("FORCE_UPDATES", false), c);
        jqi e = jqj.e();
        for (jav javVar : c) {
            juc b = feq.b(jqmVar.i(), javVar);
            juf g = jug.g();
            g.f(b);
            int i2 = 2;
            int i3 = 1;
            if (jsqVar.e("FORCE_UPDATES", false)) {
                i = 1;
            } else {
                i = (!jsqVar.e("FOREGROUND", false) || !this.b.a()) ? 2 : 1;
                i2 = true != jsqVar.e("WIFI_ONLY", true) ? 2 : 1;
                if (true == jsqVar.e("CHARGING_ONLY", true)) {
                    g.g(i);
                    g.d(i2);
                    g.c(i3);
                    e.c(g.a());
                }
            }
            i3 = 2;
            g.g(i);
            g.d(i2);
            g.c(i3);
            e.c(g.a());
        }
        jqj a2 = e.a();
        ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/SpeechPackSlicingStrategy", "getSlices", 64, "SpeechPackSlicingStrategy.java")).w("getSlices(): slicing result: %s", a2);
        return a2;
    }

    public final String toString() {
        return "SpeechPackStrategy";
    }
}
