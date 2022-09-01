package defpackage;

import android.content.Context;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: cfn  reason: default package */
/* loaded from: classes.dex */
public final class cfn {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/delightklpdownloader/DelightKLPDownloader");
    public final hyy b;
    public final mkr c;
    public final gzc d;
    public final Context e;
    public final hzl f;

    public cfn(Context context, hyy hyyVar, mkr mkrVar, gzc gzcVar) {
        this.e = context;
        this.b = hyyVar;
        this.c = mkrVar;
        this.d = gzcVar;
        this.f = new hzl(hyyVar, mkrVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(Locale locale) {
        return String.format("%s_manifest_%s__%s", "__KLP", "delight", locale.toLanguageTag());
    }

    public static String b(Locale locale) {
        return String.format("%s_%s__%s", "__KLP", "delight", locale.toLanguageTag());
    }
}
