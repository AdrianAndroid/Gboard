package defpackage;

import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import java.util.Random;
import java.util.regex.Pattern;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dad  reason: default package */
/* loaded from: classes.dex */
public final class dad {
    private static final ltg d = ltg.j("com/google/android/apps/inputmethod/libs/expression/trainingcache/processor/ExpressionTrainingDataHelper");
    static final hhl a = hhq.f("fc2q_training_cache_logging_max_input_words", 100);
    public static final hhl b = hhq.h("federatedc2q_shared_urls_corpus_tag", "");
    public static final Pattern c = Pattern.compile("\\/stickers\\/(pack-[^\\/]+)\\/");
    private static final Random e = new Random();

    public static eeu a(oxo oxoVar, long j, String str, int i) {
        nfh t = eeu.g.t();
        long nextLong = e.nextLong();
        long abs = nextLong == Long.MIN_VALUE ? 0L : Math.abs(nextLong);
        if (t.c) {
            t.cD();
            t.c = false;
        }
        eeu eeuVar = (eeu) t.b;
        int i2 = eeuVar.a | 1;
        eeuVar.a = i2;
        eeuVar.b = abs;
        if (str != null) {
            i2 |= 8;
            eeuVar.a = i2;
            eeuVar.e = str;
        }
        oxoVar.getClass();
        eeuVar.c = oxoVar;
        int i3 = i2 | 2;
        eeuVar.a = i3;
        int i4 = i3 | 4;
        eeuVar.a = i4;
        eeuVar.d = j;
        eeuVar.a = i4 | 16;
        eeuVar.f = i;
        return (eeu) t.cz();
    }

    public static nfh b(long j, hso hsoVar) {
        String m;
        nfh t = oxr.b.t();
        t.eQ("conv2query/timestamp", mhb.l(j));
        EditorInfo N = hsoVar.N();
        if (N == null) {
            ((ltd) ((ltd) d.d()).k("com/google/android/apps/inputmethod/libs/expression/trainingcache/processor/ExpressionTrainingDataHelper", "getCurrentAppPackageName", 282, "ExpressionTrainingDataHelper.java")).t("Unable to obtain current editor info");
            m = "";
        } else {
            m = ham.m(N);
        }
        jav c2 = hqp.c();
        if (!TextUtils.isEmpty(m)) {
            t.eQ("conv2query/current_app", mhb.n(m));
        }
        if (c2 != null) {
            t.eQ("conv2query/input_language", mhb.n(c2.n));
        }
        String str = (String) b.c();
        if (!TextUtils.isEmpty(str)) {
            t.eQ("conv2query/corpus_tag", mhb.n(str));
        }
        return t;
    }
}
