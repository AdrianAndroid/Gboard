package defpackage;

import android.content.Context;
import android.text.TextUtils;

/* compiled from: PG */
/* renamed from: eot  reason: default package */
/* loaded from: classes.dex */
public final class eot {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(Context context) {
        return ino.M(context).b("total_split_banner_display_time", 0);
    }

    public static void b(Context context) {
        ino.M(context).f("disable_split_prompt_module", true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean c(Context context) {
        return ((long) a(context)) >= ((Long) eop.d.c()).longValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean d(Context context) {
        return ino.M(context).al("show_split_confirmation_toast", false, false);
    }

    public static eod e(juc jucVar) {
        eod[] values;
        String b = jucVar.n().b("type", eod.GRAMMAR_CHECKER_MODEL.d);
        for (eod eodVar : eod.values()) {
            if (TextUtils.equals(b, eodVar.d)) {
                return eodVar;
            }
        }
        return eod.UNKNOWN;
    }

    public static jav f(juc jucVar) {
        String b = jucVar.n().b("locale", "");
        if (TextUtils.isEmpty(b)) {
            return null;
        }
        return jav.e(b);
    }

    public static boolean g(eod eodVar) {
        eod eodVar2 = eod.UNKNOWN;
        int ordinal = eodVar.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return ((Boolean) enl.a.c()).booleanValue();
            }
            return false;
        }
        return ((Boolean) eng.o.c()).booleanValue();
    }

    public static int h(eod eodVar) {
        return eodVar == eod.SPELL_CHECKER_MODEL ? 2 : 1;
    }

    public static final env j(boolean z, hqk hqkVar, int i, int i2, String[] strArr, int i3, int i4, int i5) {
        return new env(z, hqkVar, i, i2, strArr == null ? new String[0] : strArr, i5, i3, i4);
    }
}
