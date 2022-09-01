package defpackage;

import java.util.Set;

/* compiled from: PG */
/* renamed from: dhd  reason: default package */
/* loaded from: classes.dex */
public final class dhd {
    private static final ltg b = ltg.j("com/google/android/apps/inputmethod/libs/handwriting/superpacks/HandwritingLstmMappingParser");
    public static final dhd a = new dhd();

    protected dhd() {
    }

    public static boolean b(dhu dhuVar) {
        return !dhuVar.b.isEmpty() && !dhuVar.c.isEmpty();
    }

    public final void a(dhu dhuVar, Set set, Set set2) {
        if (b(dhuVar)) {
            set.add(dhuVar.b);
            set.add(dhuVar.c);
            if (dhuVar.d.isEmpty()) {
                return;
            }
            set2.add(dhuVar.d);
            return;
        }
        ((ltd) ((ltd) b.c()).k("com/google/android/apps/inputmethod/libs/handwriting/superpacks/HandwritingLstmMappingParser", "getRelevantPackNames", 36, "HandwritingLstmMappingParser.java")).t("getRelevantPackNames(): invalid pack mapping.");
    }
}
