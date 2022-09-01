package defpackage;

import android.content.Context;

/* compiled from: PG */
/* renamed from: eov  reason: default package */
/* loaded from: classes.dex */
public final class eov {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/splitprompt/SplitPromptTooltip");
    public final Context b;
    public final eom c;
    public final idk d;
    public long e;

    public eov(Context context, eom eomVar) {
        ieh j = ieh.j();
        this.b = context;
        this.c = eomVar;
        this.d = j;
    }

    public final void a(eoq eoqVar) {
        hkp.b("DUP_KEY_PREFERENCE_BANNER", false);
        if (eoqVar != null) {
            this.d.e(eoqVar, Integer.valueOf(eot.a(this.b)));
        }
    }
}
