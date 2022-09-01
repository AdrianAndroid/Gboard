package defpackage;

import android.content.Context;
import android.util.Printer;
import android.view.inputmethod.EditorInfo;
import com.google.android.apps.inputmethod.libs.expression.extension.IBitmojiExtension;
import com.google.android.apps.inputmethod.libs.expression.extension.IGifKeyboardExtension;
import com.google.android.apps.inputmethod.libs.expression.extension.IStickerExtension;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
/* renamed from: cuz  reason: default package */
/* loaded from: classes.dex */
public final class cuz implements gzv {
    public static final cuz a = new cuz();
    private final ConcurrentMap b = new ConcurrentHashMap();

    public cuz() {
        gzt.a.a(this);
    }

    public static boolean f(Context context, Class cls) {
        return igr.d(context).c(cls) != null;
    }

    public static llp m() {
        hqt b = hqp.b();
        if (b == null) {
            return llp.r(Locale.getDefault());
        }
        llk e = llp.e();
        e.h(b.i().q());
        lsz it = b.k().iterator();
        while (it.hasNext()) {
            e.h(((jav) it.next()).q());
        }
        return e.g();
    }

    private final void n(String str, boolean z) {
        this.b.put(str, Boolean.valueOf(z));
    }

    public final boolean a(Context context, boolean z) {
        if (!z || !fhr.w(context)) {
            return false;
        }
        if (!jam.H(context)) {
            long longValue = ((Long) cvb.e.c()).longValue();
            if (longValue != -1 && ino.K(context, null).I("pref_key_install_bitmoji_card_impressions") >= longValue) {
                return false;
            }
        }
        return f(context, IBitmojiExtension.class);
    }

    public final boolean b(Context context) {
        return ((long) jam.f(context, "com.bitstrips.imoji")) < ((Long) cvb.a.c()).longValue();
    }

    public final boolean c(Context context) {
        return j(context, cvb.b);
    }

    public final boolean d(Context context, EditorInfo editorInfo) {
        if (!((Boolean) cvb.f.c()).booleanValue()) {
            return true;
        }
        return ham.P(editorInfo) && !ham.ak(context, editorInfo) && !ham.V(editorInfo) && !ham.ad(editorInfo) && !ham.G(editorInfo);
    }

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        ArrayList B = lre.B(this.b.entrySet());
        Collections.sort(B, xr.g);
        int size = B.size();
        for (int i = 0; i < size; i++) {
            Map.Entry entry = (Map.Entry) B.get(i);
            String valueOf = String.valueOf(entry.getValue());
            printer.println(((String) entry.getKey()) + " = " + valueOf);
        }
    }

    public final boolean e(Context context) {
        return fhr.w(context) && f(context, IGifKeyboardExtension.class);
    }

    public final boolean g(Context context, boolean z) {
        return z && fhr.w(context) && f(context, IStickerExtension.class);
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "DevFeatureConfig";
    }

    public final boolean h() {
        boolean y = jam.y();
        n("isRunningInTestHarness", y);
        if (!y) {
            boolean a2 = irz.b.a();
            n("isUserSetupComplete", a2);
            if (!a2) {
                return false;
            }
        }
        boolean b = jai.b.b();
        n("isUserUnlocked", b);
        return b;
    }

    public final boolean i(Context context) {
        String b = gzq.b(context, true);
        return ((Boolean) cvb.h.c()).booleanValue() && ("tablet".equals(b) || "tablet_large".equals(b) || "tablet_huge".equals(b) || ((Boolean) cvb.i.c()).booleanValue());
    }

    public final boolean j(Context context, hhl hhlVar) {
        return !jam.r(context) && ((Boolean) hhlVar.c()).booleanValue();
    }

    public final boolean k(Context context) {
        return l(h(), e(context));
    }

    public final boolean l(boolean z, boolean z2) {
        return z && z2;
    }
}
