package defpackage;

import android.content.Context;

/* compiled from: PG */
/* renamed from: fgk  reason: default package */
/* loaded from: classes.dex */
public final class fgk extends dkl {
    private static final String[] c = {"40key_without_english_setting_scheme", "40key_with_english_setting_scheme", "qwerty_without_english_setting_scheme", "qwerty_with_english_setting_scheme"};
    private static fgk d;

    protected fgk(Context context) {
        super(fgj.l(context));
    }

    public static fgk h(Context context) {
        fgk fgkVar;
        synchronized (fgk.class) {
            if (d == null) {
                d = new fgk(context);
                div.c().i(d, "zh_TW", "zh_TW");
            }
            fgkVar = d;
        }
        return fgkVar;
    }

    @Override // defpackage.dkl
    protected final String d() {
        return "gesture_data_scheme";
    }

    @Override // defpackage.dkl
    protected final String[] f() {
        return c;
    }
}
