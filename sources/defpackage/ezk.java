package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* renamed from: ezk  reason: default package */
/* loaded from: classes.dex */
public abstract class ezk implements ezj {
    protected final Context a;
    protected Locale c;
    public String d;
    protected final eyw e = new eyw();
    protected final Map f = new LinkedHashMap();
    protected Locale b = Locale.ENGLISH;
    protected Boolean g = true;

    /* JADX INFO: Access modifiers changed from: protected */
    public ezk(Context context) {
        this.a = context;
    }

    @Override // defpackage.ezj
    public final String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (this.f.containsKey(str)) {
            return str;
        }
        String g = g(str);
        if (!this.f.containsKey(g)) {
            return null;
        }
        return g;
    }

    @Override // defpackage.ezj
    public String c() {
        String h = h(this.d, this.c);
        return !TextUtils.isEmpty(h) ? h : "????";
    }

    @Override // defpackage.ezj
    public final List d() {
        return this.e.d();
    }

    @Override // defpackage.ezj
    public void e(Map map) {
        if (map == null || map.isEmpty()) {
            ((ltd) ((ltd) ezn.a.d()).k("com/google/android/apps/inputmethod/libs/translate/TranslateLanguage$LanguageBase", "updateAllLanguageList", 349, "TranslateLanguage.java")).t("Empty translate language list.");
            return;
        }
        this.f.clear();
        this.f.putAll(map);
        this.g = false;
        if (f(this.d) || f(b())) {
            return;
        }
        f((String) map.keySet().iterator().next());
    }

    @Override // defpackage.ezj
    public boolean f(String str) {
        String a = a(str);
        if (TextUtils.isEmpty(a)) {
            ((ltd) ((ltd) ezn.a.c()).k("com/google/android/apps/inputmethod/libs/translate/TranslateLanguage$LanguageBase", "selectLanguage", 298, "TranslateLanguage.java")).w("Failed to select language(%s)", str);
            return false;
        }
        this.d = a;
        this.e.f(a);
        return true;
    }

    protected abstract String g(String str);

    /* JADX INFO: Access modifiers changed from: protected */
    public final String h(String str, Locale locale) {
        if ("auto".equals(str)) {
            return ezz.h(this.a, locale);
        }
        return jay.b(str, locale);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void i(int i, int i2, int i3) {
        ino M = ino.M(this.a);
        String y = M.y(i3);
        if (!TextUtils.isEmpty(y)) {
            this.f.clear();
            for (String str : lfy.g(",").i(y)) {
                String h = h(str, this.b);
                if (!TextUtils.isEmpty(h)) {
                    this.f.put(str, h);
                }
            }
        }
        String y2 = M.y(i2);
        if (!TextUtils.isEmpty(y2)) {
            String[] split = y2.split(",");
            this.e.e();
            if (split != null && (r8 = split.length) > 0) {
                while (true) {
                    int length = length - 1;
                    if (length < 0) {
                        break;
                    }
                    this.e.f(split[length]);
                }
                this.e.h();
            }
        }
        String y3 = M.y(i);
        if (!TextUtils.isEmpty(y3)) {
            f(y3);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void j(int i, int i2, int i3) {
        ino M = ino.M(this.a);
        if (!this.f.isEmpty()) {
            M.u(i3, TextUtils.join(",", this.f.keySet()));
        }
        if (!this.e.g()) {
            M.u(i2, TextUtils.join(",", this.e.d()));
        }
        if (!TextUtils.isEmpty(this.d)) {
            M.u(i, this.d);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void k(Locale locale) {
        if (locale == null || TextUtils.isEmpty(locale.getLanguage())) {
            ((ltd) ((ltd) ezn.a.d()).k("com/google/android/apps/inputmethod/libs/translate/TranslateLanguage$LanguageBase", "setLocale", 280, "TranslateLanguage.java")).w("Failed to setLocale(%s)", locale);
            return;
        }
        if (!jay.g(locale, this.b)) {
            this.g = true;
        }
        this.b = locale;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean l() {
        return this.g.booleanValue() || this.f.isEmpty();
    }
}
