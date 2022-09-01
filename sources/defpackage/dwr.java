package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dwr  reason: default package */
/* loaded from: classes.dex */
public final class dwr {
    private static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/nga/impl/ui/UiUtils");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(bki bkiVar) {
        String str = bkiVar.a;
        if (str.isEmpty()) {
            return;
        }
        hsk b = hsx.b();
        if (b == null) {
            ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/nga/impl/ui/UiUtils", "maybeMakeAccessibilityAnnouncement", 36, "UiUtils.java")).t("InputMethodService is null");
            return;
        }
        gqc O = b.O();
        if (bkiVar.b) {
            O.g(str);
        } else {
            O.f(str);
        }
    }
}
