package defpackage;

import android.content.Context;
import java.util.concurrent.ExecutorService;
import java.util.regex.Pattern;

/* compiled from: PG */
/* renamed from: eol  reason: default package */
/* loaded from: classes.dex */
public final class eol {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/spellchecker/superpacks/SpellCheckerSuperpacksManager");
    public static final Pattern b = Pattern.compile("_([0-9]+).json");
    private static eol g;
    public final bze d;
    public final ExecutorService e;
    public volatile boolean f = false;
    public final String c = "spell_checker";

    public eol(ExecutorService executorService, bze bzeVar) {
        this.e = executorService;
        this.d = bzeVar;
    }

    public static synchronized eol a(Context context) {
        eol eolVar;
        synchronized (eol.class) {
            if (g == null) {
                g = new eol(gxo.a(10), bzd.a(context));
            }
            eolVar = g;
        }
        return eolVar;
    }

    public final void b() {
        synchronized (this) {
            if (!this.f) {
                bze bzeVar = this.d;
                bzt a2 = bzu.a(this.c);
                a2.e = 300;
                a2.f = 300;
                bzeVar.i(a2.a());
                this.f = true;
            }
        }
    }
}
