package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.PowerManager;
import android.provider.Settings;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.LocaleSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.view.inputmethod.EditorInfo;
import android.widget.TextView;
import com.google.android.inputmethod.latin.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: gqa  reason: default package */
/* loaded from: classes.dex */
public final class gqa {
    private static volatile gqa q;
    public final AccessibilityManager c;
    public final Context d;
    public volatile boolean e;
    public volatile boolean f;
    public volatile boolean g;
    public final lgb h;
    public EditorInfo i;
    public View j;
    public hqt k;
    private final ino s;
    private volatile boolean t;
    private final lgb u;
    private mko v;
    private mko w;
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/accessibility/AccessibilityUtils");
    private static final hhl m = hhq.a("enable_screen_reader_lift_to_type", true);
    private static final hhl n = hhq.f("screen_reader_min_version_for_lift_to_type", 60105832);
    public static final hhl b = hhq.a("enable_screen_reader_announce", false);
    private static final View.AccessibilityDelegate o = new gpy();
    private static final View.OnHoverListener p = new btz(4);
    private final mks r = gyc.b;
    public final Set l = Collections.newSetFromMap(new WeakHashMap(4));
    private final hqo x = new gpz(this);

    public gqa(Context context) {
        mko mkoVar = mkk.a;
        this.v = mkoVar;
        this.w = mkoVar;
        this.d = context;
        this.s = ino.M(context);
        this.c = (AccessibilityManager) context.getSystemService("accessibility");
        this.h = jdg.n(new etm(context, 10));
        this.u = jdg.n(new etm(context, 11));
    }

    private final void A(CharSequence charSequence, int i, int i2) {
        if (!this.g || !((PowerManager) this.u.a()).isScreenOn() || TextUtils.isEmpty(charSequence)) {
            return;
        }
        if (i != 0) {
            this.v.cancel(false);
            this.w.cancel(false);
        }
        this.w = this.r.a(new ov(this, i, d(charSequence), 7), i2, TimeUnit.MILLISECONDS);
    }

    public static gqa a(Context context) {
        gqa gqaVar = q;
        if (gqaVar == null) {
            synchronized (gqa.class) {
                gqaVar = q;
                if (gqaVar == null) {
                    gqaVar = new gqa(context.getApplicationContext());
                    gqaVar.u();
                    gqaVar.c.addAccessibilityStateChangeListener(new AccessibilityManager.AccessibilityStateChangeListener() { // from class: gpw
                        @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
                        public final void onAccessibilityStateChanged(boolean z) {
                            gqa gqaVar2 = gqa.this;
                            gqaVar2.u();
                            gqaVar2.z(3);
                        }
                    });
                    gqaVar.c.addTouchExplorationStateChangeListener(new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: gpx
                        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
                        public final void onTouchExplorationStateChanged(boolean z) {
                            gqa.this.e = z;
                        }
                    });
                    gqaVar.x.e(gyc.a);
                    q = gqaVar;
                }
            }
        }
        return gqaVar;
    }

    public static CharSequence b(Context context, CharSequence charSequence) {
        return c(gwc.h(context), charSequence);
    }

    public static CharSequence c(Locale locale, CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence) || locale == null) {
            return charSequence;
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new LocaleSpan(locale), 0, spannableString.length(), 33);
        return spannableString;
    }

    public static void q(View view, CharSequence charSequence) {
        view.setContentDescription(b(view.getContext(), charSequence));
    }

    public static void r(TextView textView, int i) {
        textView.setText(i);
        q(textView, textView.getText());
    }

    public static void s(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        q(textView, charSequence);
    }

    public static void v(View view) {
        w(view, gwc.h(view.getContext()));
    }

    public static void w(View view, Locale locale) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                w(viewGroup.getChildAt(i), locale);
            }
            return;
        }
        CharSequence contentDescription = view.getContentDescription();
        if (TextUtils.isEmpty(contentDescription) && (view instanceof TextView)) {
            contentDescription = ((TextView) view).getText();
        }
        if (TextUtils.isEmpty(contentDescription)) {
            return;
        }
        view.setContentDescription(c(locale, contentDescription));
    }

    public static final void y(View view) {
        view.setAccessibilityDelegate(o);
        view.setOnHoverListener(p);
    }

    public final CharSequence d(CharSequence charSequence) {
        hqt hqtVar = this.k;
        return c(hqtVar != null ? hqtVar.q() : null, charSequence);
    }

    public final String e(int i, Object... objArr) {
        hqt hqtVar = this.k;
        return (hqtVar != null ? hqtVar.a() : this.d).getString(i, objArr);
    }

    public final void f(CharSequence charSequence) {
        A(charSequence, 1, 0);
    }

    public final void g(int i, Object... objArr) {
        if (this.g) {
            f(e(i, objArr));
        }
    }

    public final void h(int i) {
        if (this.g) {
            A(e(i, new Object[0]), 0, 0);
        }
    }

    public final void i(CharSequence charSequence) {
        A(charSequence, 0, 0);
    }

    public final void j(int i) {
        k(e(i, new Object[0]));
    }

    public final void k(CharSequence charSequence) {
        A(charSequence, 2, 0);
    }

    public final void l(int i) {
        m(e(i, new Object[0]));
    }

    public final void m(CharSequence charSequence) {
        A(charSequence, 1, 1000);
    }

    public final void n(int i, int... iArr) {
        if (!this.g) {
            return;
        }
        Object[] objArr = new Object[1];
        for (int i2 = 0; i2 <= 0; i2++) {
            objArr[i2] = e(iArr[i2], new Object[0]);
        }
        f(e(i, objArr));
    }

    public final void o(View view) {
        if (!this.g || view == null) {
            return;
        }
        view.sendAccessibilityEvent(128);
    }

    public final void p(AccessibilityManager.AccessibilityStateChangeListener accessibilityStateChangeListener) {
        synchronized (this.l) {
            this.l.add(accessibilityStateChangeListener);
        }
    }

    public final void t(EditorInfo editorInfo, View view) {
        u();
        this.i = editorInfo;
        this.j = view;
    }

    public final void u() {
        boolean z;
        ArrayList arrayList;
        ResolveInfo resolveInfo;
        boolean z2 = this.f;
        this.f = this.c.isEnabled();
        boolean z3 = true;
        this.e = this.f && this.c.isTouchExplorationEnabled();
        this.g = this.f && this.f && !this.c.getEnabledAccessibilityServiceList(1).isEmpty();
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = this.c.getEnabledAccessibilityServiceList(1);
        if (enabledAccessibilityServiceList != null && !enabledAccessibilityServiceList.isEmpty()) {
            Iterator<AccessibilityServiceInfo> it = enabledAccessibilityServiceList.iterator();
            while (true) {
                if (!it.hasNext() || (resolveInfo = it.next().getResolveInfo()) == null) {
                    break;
                }
                String str = resolveInfo.serviceInfo.packageName;
                try {
                    ApplicationInfo applicationInfo = this.d.getPackageManager().getApplicationInfo(str, 128);
                    PackageInfo packageInfo = this.d.getPackageManager().getPackageInfo(str, 0);
                    Bundle bundle = applicationInfo.metaData;
                    if (bundle != null && bundle.getBoolean("support_lift_to_type")) {
                        if (packageInfo.versionCode >= ((Long) n.c()).longValue()) {
                            z = true;
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
        }
        z = false;
        this.t = z;
        if (Settings.Secure.getInt(this.d.getContentResolver(), "high_text_contrast_enabled", 0) == 0) {
            z3 = false;
        }
        float f = Settings.System.getFloat(this.d.getContentResolver(), "font_scale", 1.0f);
        this.s.q(R.string.f160270_resource_name_obfuscated_res_0x7f140638, this.g);
        this.s.q(R.string.f160260_resource_name_obfuscated_res_0x7f140637, z3);
        this.s.r(R.string.f160250_resource_name_obfuscated_res_0x7f140636, f);
        if (z2 != this.f) {
            synchronized (this.l) {
                arrayList = new ArrayList(this.l);
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((AccessibilityManager.AccessibilityStateChangeListener) arrayList.get(i)).onAccessibilityStateChanged(this.f);
            }
        }
    }

    public final boolean x() {
        return ((Boolean) m.c()).booleanValue() && this.e && this.t;
    }

    public final void z(int i) {
        if (!this.f || this.g || i <= 0) {
            return;
        }
        this.v = this.r.a(new dob(this, i, 7), 500L, TimeUnit.MILLISECONDS);
    }
}
