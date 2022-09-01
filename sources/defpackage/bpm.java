package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.v7.widget.AppCompatTextView;
import android.text.TextUtils;
import android.view.View;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.widgets.SoftKeyView;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: bpm  reason: default package */
/* loaded from: classes.dex */
public final class bpm implements hfh {
    private static final lug a = hin.a;
    private static final llw b = llw.m("hi_XA", "HG", "hi_XT", "HT");
    private final Context c;
    private final hsz d;
    private final hqy e;
    private CharSequence f;
    private SoftKeyView g;
    private final CharSequence h;
    private final boolean i;
    private bpr j;

    public bpm(Context context, iav iavVar, hsz hszVar, jav javVar, CharSequence charSequence, boolean z) {
        hqy y = hrx.y(context);
        this.c = context;
        this.d = hszVar;
        this.e = y;
        if (charSequence != null && context.getString(R.string.f156330_resource_name_obfuscated_res_0x7f14042d).contentEquals(charSequence)) {
            ibw ibwVar = iavVar.f;
            int i = ibwVar.d;
            if (i != 0) {
                charSequence = context.getString(i);
            } else {
                String str = ibwVar.c;
                if (TextUtils.isEmpty(str)) {
                    charSequence = null;
                } else {
                    TypedArray obtainTypedArray = context.getResources().obtainTypedArray(R.array.f1210_resource_name_obfuscated_res_0x7f030013);
                    qo qoVar = new qo();
                    try {
                        int length = obtainTypedArray.length();
                        for (int i2 = 0; i2 < length; i2 += 2) {
                            String string = obtainTypedArray.getString(i2);
                            int resourceId = obtainTypedArray.getResourceId(i2 + 1, 0);
                            if (string != null) {
                                qoVar.put(string, Integer.valueOf(resourceId));
                            }
                        }
                        obtainTypedArray.recycle();
                        Integer num = (Integer) qoVar.get(str);
                        charSequence = num != null ? context.getString(num.intValue()) : str.toUpperCase(Locale.US);
                    } catch (Throwable th) {
                        obtainTypedArray.recycle();
                        throw th;
                    }
                }
            }
        }
        this.h = charSequence;
        this.i = z;
        hqt m = hszVar.m();
        if (m == null) {
            this.f = "";
            return;
        }
        jav h = m.h();
        if (jaj.b.equals(javVar)) {
            javVar = jav.f("zz");
        } else if (jaj.a.equals(javVar)) {
            javVar = h;
        }
        this.f = a(context, javVar.q());
    }

    static String a(Context context, Locale locale) {
        Resources resources = context.getResources();
        String[] stringArray = resources.getStringArray(R.array.f1630_resource_name_obfuscated_res_0x7f030042);
        int binarySearch = Arrays.binarySearch(stringArray, locale.toString());
        if (binarySearch >= 0) {
            String[] stringArray2 = resources.getStringArray(R.array.f1640_resource_name_obfuscated_res_0x7f030043);
            if (stringArray2.length != stringArray.length) {
                ((luc) ((luc) a.c()).k("com/google/android/apps/inputmethod/latin/keyboard/LatinKeyboardSpacebarDecorator", "getFirstCapitalizedLocaleLanguage", 300, "LatinKeyboardSpacebarDecorator.java")).t("Wrong length of localized_customized_locale_names!");
                return "";
            }
            return jgd.i(stringArray2[binarySearch]);
        }
        return jbs.p(locale.getDisplayLanguage(locale));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005d, code lost:
        if (android.text.TextUtils.equals(r1.j, r0.j) != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.CharSequence e() {
        /*
            r4 = this;
            java.lang.CharSequence r0 = r4.h
            if (r0 != 0) goto L6
            java.lang.CharSequence r0 = r4.f
        L6:
            r4.f = r0
            hsz r0 = r4.d
            hqt r0 = r0.m()
            if (r0 != 0) goto L11
            goto L5f
        L11:
            android.content.Context r0 = r4.c
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131034115(0x7f050003, float:1.7678738E38)
            boolean r0 = r0.getBoolean(r1)
            if (r0 == 0) goto L21
            goto L62
        L21:
            hqy r0 = r4.e
            boolean r0 = r0.o()
            if (r0 != 0) goto L62
            hsz r0 = r4.d
            hqt r0 = r0.m()
            if (r0 == 0) goto L62
            jav r0 = r0.i()
            android.content.Context r1 = r4.c
            jav r1 = defpackage.jav.c(r1)
            java.lang.String r2 = r1.g
            java.lang.String r3 = r0.g
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            if (r2 == 0) goto L62
            java.lang.String r2 = r0.j
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L5f
            java.lang.String r2 = r1.j
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L5f
            java.lang.String r1 = r1.j
            java.lang.String r0 = r0.j
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto L62
        L5f:
            java.lang.String r0 = ""
            goto L64
        L62:
            java.lang.CharSequence r0 = r4.f
        L64:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bpm.e():java.lang.CharSequence");
    }

    private final void f() {
        SoftKeyView softKeyView = this.g;
        if (softKeyView == null || !this.i) {
            return;
        }
        bpr bprVar = this.j;
        if (bprVar != null) {
            bprVar.e.setText(e());
            return;
        }
        softKeyView.m(R.id.f65200_resource_name_obfuscated_res_0x7f0b0745, e());
    }

    public final void b(Object obj, View view) {
        if (view == null) {
            return;
        }
        SoftKeyView softKeyView = (SoftKeyView) view.findViewById(R.id.key_pos_space);
        this.g = softKeyView;
        if (softKeyView != null) {
            AppCompatTextView appCompatTextView = (AppCompatTextView) softKeyView.findViewById(R.id.f65200_resource_name_obfuscated_res_0x7f0b0745);
            View findViewById = this.g.findViewById(R.id.f56210_resource_name_obfuscated_res_0x7f0b0265);
            if (appCompatTextView != null && findViewById != null && obj != htg.a) {
                this.j = new bpr(appCompatTextView, findViewById);
            }
        }
        f();
        bpr bprVar = this.j;
        if (bprVar == null) {
            return;
        }
        Context context = bprVar.f.getContext();
        ino M = ino.M(context);
        if (!((Boolean) bpr.a.c()).booleanValue() || System.currentTimeMillis() - M.I("branding_last_shown") <= ((Long) bpr.b.c()).longValue()) {
            bprVar.a();
            return;
        }
        bprVar.f.setAlpha(0.0f);
        bprVar.f.setVisibility(0);
        bprVar.e.setVisibility(4);
        M.i("branding_last_shown", System.currentTimeMillis());
        Animator loadAnimator = AnimatorInflater.loadAnimator(context, R.animator.f920_resource_name_obfuscated_res_0x7f020046);
        loadAnimator.setTarget(bprVar.f);
        loadAnimator.addListener(new bpp(bprVar));
        loadAnimator.start();
        bprVar.g = loadAnimator;
    }

    @Override // defpackage.hfh
    public final boolean c(hfd hfdVar) {
        iay f = hfdVar.f();
        if (f == null || f.c != -10065) {
            return false;
        }
        List<Locale> list = (List) hfdVar.b[0].e;
        String str = "";
        if (list == null) {
            ((luc) a.a(hip.a).k("com/google/android/apps/inputmethod/latin/keyboard/LatinKeyboardSpacebarDecorator", "consumeEvent", 316, "LatinKeyboardSpacebarDecorator.java")).t("consumeEvent: Illegal argument: locales is null");
            this.f = str;
        } else if (list.isEmpty()) {
            this.f = str;
        } else if (list.size() != 1) {
            if (list.size() <= 1) {
                ((luc) a.a(hip.a).k("com/google/android/apps/inputmethod/latin/keyboard/LatinKeyboardSpacebarDecorator", "getMultiLanguageLabel", 342, "LatinKeyboardSpacebarDecorator.java")).w("getMultiLanguageLabel: Illegal argument: %s", list);
            } else {
                StringBuilder sb = new StringBuilder();
                for (Locale locale : list) {
                    if (sb.length() > 0) {
                        sb.append(" • ");
                    }
                    String str2 = (String) b.get(locale.toString());
                    if (str2 == null) {
                        String language = locale.getLanguage();
                        str2 = ((String) jav.b.getOrDefault(language, language)).toUpperCase(locale);
                    }
                    sb.append(str2);
                }
                str = sb.toString();
            }
            this.f = str;
        } else {
            this.f = a(this.c, (Locale) list.get(0));
        }
        f();
        return true;
    }

    public final void d() {
        bpr bprVar = this.j;
        if (bprVar != null) {
            bprVar.a();
        }
        this.j = null;
        this.g = null;
    }
}
