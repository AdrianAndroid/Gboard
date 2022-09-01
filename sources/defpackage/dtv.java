package defpackage;

/* compiled from: PG */
/* renamed from: dtv  reason: default package */
/* loaded from: classes.dex */
public final class dtv implements dto {
    private static final ltg b = ltg.j("com/google/android/apps/inputmethod/libs/nga/impl/input/VoiceInputCallbackImeAdapter");
    private static final llw c;
    public final jbw a;

    static {
        lls h = llw.h();
        h.a(fho.DELETE_ALL, -10136);
        h.a(fho.DELETE_LAST_WORD, -10133);
        h.a(fho.DELETE_LAST_WORD_OR_PUNCTUATION, -10134);
        h.a(fho.DELETE_LAST_SENTENCE, -10135);
        h.a(fho.DELETE_SELECTION, 0);
        h.a(fho.UNDO, -10137);
        c = h.l();
    }

    public dtv(jbw jbwVar) {
        this.a = jbwVar;
    }

    @Override // defpackage.dto
    public final hpy a() {
        hpy c2 = hqj.c();
        if (c2 == null || c2.equals(hpy.a)) {
            hpy b2 = hqj.b();
            if (b2 != null && !b2.equals(hpy.a)) {
                return b2;
            }
            ((ltd) ((ltd) b.d()).k("com/google/android/apps/inputmethod/libs/nga/impl/input/VoiceInputCallbackImeAdapter", "getInputContext", 67, "VoiceInputCallbackImeAdapter.java")).t("No input context available");
            return hpy.a;
        }
        return c2;
    }

    @Override // defpackage.dto
    public final boolean b(fho fhoVar) {
        Integer num = (Integer) c.get(fhoVar);
        if (num != null) {
            return this.a.b().c.contains(num);
        }
        return true;
    }
}
