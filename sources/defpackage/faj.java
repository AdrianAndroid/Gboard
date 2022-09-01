package defpackage;

import android.text.TextUtils;
import java.util.Locale;
import java.util.Set;

/* compiled from: PG */
/* renamed from: faj  reason: default package */
/* loaded from: classes.dex */
public final class faj implements hho {
    private static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/voiceime/S3LanguagesHelper");
    private volatile Set b;
    private volatile Set c;

    public faj() {
        hhq.p(this, fbh.j, fbh.n);
        e();
    }

    private static Set d(String str) {
        if (TextUtils.isEmpty(str)) {
            ((ltd) ((ltd) a.c()).k("com/google/android/apps/inputmethod/libs/voiceime/S3LanguagesHelper", "parseStringTokens", 76, "S3LanguagesHelper.java")).t("s3 string tokens are empty.");
            return lrr.a;
        }
        String replace = str.replace("\n", "");
        lfy b = lfy.c(',').h().b();
        qq qqVar = new qq();
        for (String str2 : b.i(replace)) {
            qqVar.add(str2.toLowerCase(Locale.ROOT));
        }
        return qqVar;
    }

    private final void e() {
        this.b = d((String) fbh.j.c());
        this.c = d((String) fbh.n.c());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b(jav javVar) {
        return javVar != null && this.b.contains(javVar.n.toLowerCase(Locale.ROOT));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c(jav javVar) {
        return (javVar == null || javVar.g == null || !this.c.contains(javVar.g.toLowerCase(Locale.ROOT))) ? false : true;
    }

    @Override // defpackage.hho
    public final void gW(Set set) {
        e();
    }
}
