package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ezl  reason: default package */
/* loaded from: classes.dex */
public final class ezl extends ezk {
    public String h;

    public ezl(Context context) {
        super(context);
        this.d = "auto";
    }

    private final void n() {
        this.h = null;
    }

    @Override // defpackage.ezj
    public final String b() {
        return "auto";
    }

    @Override // defpackage.ezk, defpackage.ezj
    public final String c() {
        if (!ezn.e(this.d) || TextUtils.isEmpty(this.h)) {
            return super.c();
        }
        String m = m();
        String h = h(m, this.c);
        if (!TextUtils.isEmpty(h)) {
            return h;
        }
        String b = ezz.b(m);
        if (TextUtils.isEmpty(b)) {
            ((ltd) ((ltd) ezn.a.d()).k("com/google/android/apps/inputmethod/libs/translate/TranslateLanguage$SourceLanguage", "getDisplayName", 478, "TranslateLanguage.java")).w("Unknown detected language code(%s)", this.h);
            return "????";
        }
        String h2 = h(b, this.c);
        return !TextUtils.isEmpty(h2) ? h2 : jay.b(b, this.c);
    }

    @Override // defpackage.ezk, defpackage.ezj
    public final void e(Map map) {
        super.e(map);
        n();
    }

    @Override // defpackage.ezk, defpackage.ezj
    public final boolean f(String str) {
        if (!ezn.e(str)) {
            n();
        }
        return super.f(str);
    }

    @Override // defpackage.ezk
    protected final String g(String str) {
        return ezz.b(str);
    }

    public final String m() {
        return !ezn.e(this.d) ? this.d : TextUtils.isEmpty(this.h) ? "auto" : this.h;
    }
}
