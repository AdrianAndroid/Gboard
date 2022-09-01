package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: dud  reason: default package */
/* loaded from: classes.dex */
public final class dud {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/nga/impl/logging/PunctuationLogger");
    public static final lmz b = lmz.u(',', '!', '?', '.');
    private static final duc h = duc.a(hpy.a);
    public final AtomicReference e = new AtomicReference(h);
    public final AtomicBoolean f = new AtomicBoolean(false);
    public final idk g = ieh.j();
    public final mks d = gxo.c(11);
    public final hqi c = new dub(this);

    public static int a(CharSequence charSequence) {
        int i = 0;
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            if (b.contains(Character.valueOf(charSequence.charAt(i2)))) {
                i++;
            }
        }
        return i;
    }

    public final void b() {
        this.e.set(h);
    }
}
