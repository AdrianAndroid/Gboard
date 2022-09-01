package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.inputmethod.latin.R;
import java.io.File;

/* compiled from: PG */
/* renamed from: dhs  reason: default package */
/* loaded from: classes.dex */
public final class dhs implements jty {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/handwriting/superpacks/LocalFileFetcher");
    public final jan b;
    public final File c;
    private final String d;
    private final kcq e;

    public dhs(Context context, jan janVar, String str, mkr mkrVar) {
        String x = jbt.x(context, R.string.f175290_resource_name_obfuscated_res_0x7f140c5f);
        String str2 = x == null ? "" : x;
        this.b = janVar;
        if (!TextUtils.isEmpty(x) && janVar.g(new File(x))) {
            this.c = new File(new File(str2), "handwriting_recognition_offline");
        } else {
            this.c = new File(new File("/system/usr/share/ime/google/hwr_lms/"), "handwriting_recognition_offline");
        }
        this.d = str;
        this.e = kcq.g(mkrVar);
    }

    @Override // defpackage.jty
    public final jtv a(juc jucVar) {
        jucVar.o();
        jtr e = jucVar.e();
        if ((!jucVar.j().equals("manifests") || e == null || !TextUtils.equals(e.b(), this.d)) && !jucVar.j().equals(this.d)) {
            return null;
        }
        if (jucVar.k() == null) {
            return jtv.c();
        }
        return jtv.b(jucVar);
    }

    @Override // defpackage.jrs
    public final mko b(jsr jsrVar) {
        return this.e.d(jsrVar);
    }

    @Override // defpackage.jty
    public final mko c(juc jucVar, jtw jtwVar, File file) {
        jucVar.o();
        if (!this.b.g(this.c)) {
            ((ltd) ((ltd) a.c()).k("com/google/android/apps/inputmethod/libs/handwriting/superpacks/LocalFileFetcher", "fetch", 77, "LocalFileFetcher.java")).G("%s subdirectory of %s does not exist", "handwriting_recognition_offline", this.c.getAbsolutePath());
            return kcu.J(new IllegalArgumentException(String.valueOf(this.c.getAbsolutePath()).concat(" does not exist.")));
        }
        return this.e.e(jucVar.o(), new jwe(this, jucVar, file, 1));
    }

    @Override // defpackage.jsj
    public final String d() {
        return "LocalFileFetcher";
    }
}
