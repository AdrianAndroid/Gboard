package defpackage;

import com.google.android.libraries.inputmethod.widgets.SoftKeyView;

/* compiled from: PG */
/* renamed from: bpu  reason: default package */
/* loaded from: classes.dex */
public final class bpu implements hfh {
    private static final ltg c = ltg.j("com/google/android/apps/inputmethod/latin/keyboard/MorseBufferDecorator");
    private static final llw d;
    public SoftKeyView a;
    public bpv b;
    private final gqc e;

    static {
        lls i = llw.i(20);
        i.a(".", "Period");
        i.a(",", "Comma");
        i.a("'", "Apostrophe");
        i.a("/", "Slash");
        i.a("&", "Ampersand");
        i.a("_", "Underscore");
        i.a("\"", "Quote");
        i.a("@", "At sign");
        i.a("*", "Asterisk");
        i.a("\\", "Backslash");
        i.a("%", "Percent");
        i.a("#", "Pound");
        i.a("|", "Vertical bar");
        i.a("^", "Caret");
        i.a("`", "Backquote");
        i.a("$", "Dollar sign");
        i.a("{", "Left curly bracket");
        i.a("}", "Right curly bracket");
        i.a("<", "Left angle bracket");
        i.a(">", "Right angle bracket");
        d = i.l();
    }

    public bpu(gqc gqcVar) {
        this.e = gqcVar;
    }

    private static String a(hln hlnVar) {
        CharSequence charSequence;
        if (hlnVar == null || (charSequence = hlnVar.a) == null) {
            return null;
        }
        return charSequence.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0094  */
    @Override // defpackage.hfh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(defpackage.hfd r8) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bpu.c(hfd):boolean");
    }
}
