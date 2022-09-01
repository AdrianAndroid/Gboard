package defpackage;

import android.support.v7.widget.AppCompatTextView;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.FrameLayout;
import com.google.android.inputmethod.latin.R;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: bui  reason: default package */
/* loaded from: classes.dex */
public final class bui {
    public final idk b;
    public final buh c = new buh(this);
    public FrameLayout d;
    public iou e;
    public hwv f;
    public llp g;
    public hqt h;
    public EditorInfo i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    private static final ltg n = ltg.j("com/google/android/apps/inputmethod/libs/clipboard/AutoPasteSuggestionHelper");
    public static final long a = TimeUnit.SECONDS.toMillis(1);

    public bui(idk idkVar) {
        this.b = idkVar;
    }

    public static void h(long j) {
        ino.L().t(R.string.f160530_resource_name_obfuscated_res_0x7f140652, j);
    }

    public static void i(llp llpVar) {
        ViewGroup L;
        View findViewById;
        hsk b = hsx.b();
        int width = (b == null || (L = b.L(ice.HEADER)) == null || (findViewById = L.findViewById(R.id.key_pos_proactive_suggestions)) == null) ? 0 : findViewById.getWidth();
        if (width == 0) {
            ((ltd) ((ltd) n.d()).k("com/google/android/apps/inputmethod/libs/clipboard/AutoPasteSuggestionHelper", "setMaxWidthOfChipTextView", 774, "AutoPasteSuggestionHelper.java")).t("Failed to get the width of the proactive suggestion view holder.");
            return;
        }
        int i = width / 3;
        int size = llpVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = (View) llpVar.get(i2);
            AppCompatTextView appCompatTextView = (AppCompatTextView) view.findViewById(R.id.f53370_resource_name_obfuscated_res_0x7f0b0116);
            if (appCompatTextView == null) {
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) view.findViewById(R.id.f53260_resource_name_obfuscated_res_0x7f0b010b);
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setMaxWidth(i);
                }
            } else {
                appCompatTextView.setMaxWidth(i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean j(String str, hpy hpyVar, hpy hpyVar2) {
        if (!hpyVar.f() || !str.contentEquals(hpyVar.b())) {
            if (hpyVar.b == hqe.OTHER && hpyVar.e > 0 && (hpyVar2 == null || TextUtils.equals(hpyVar2.c(), hpyVar.c()))) {
                String obj = hpyVar.d().toString();
                if (obj.endsWith(str) || str.endsWith(obj)) {
                    return true;
                }
            }
            return hpyVar2 != null && hpyVar2.b == hqe.OTHER && hpyVar.b == hqe.IME && !hpyVar2.e() && hpyVar.e() && hpyVar2.e == hpyVar.e;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean k(String str, hpy hpyVar, hpy hpyVar2) {
        if (hpyVar.b != hqe.OTHER || hpyVar2 == null || hpyVar.f() || hpyVar.e == 0 || !TextUtils.equals(hpyVar2.c(), hpyVar.c())) {
            return false;
        }
        String obj = hpyVar.d().toString();
        return obj.endsWith(str) || str.endsWith(obj);
    }

    public static final boolean m(llp llpVar) {
        return llpVar != null && ((buk) llpVar.get(0)).e < System.currentTimeMillis() - ((Long) bwv.b.c()).longValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0333  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean n() {
        /*
            Method dump skipped, instructions count: 1042
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bui.n():boolean");
    }

    public final void a(int i) {
        if (this.g != null) {
            this.b.e(bwa.CHIP_EVENT, Integer.valueOf(i));
        }
        this.g = null;
        this.j = false;
        this.l = false;
        b(true);
    }

    public final void b(boolean z) {
        this.m = false;
        this.f = null;
        iou iouVar = this.e;
        if (iouVar != null) {
            ioq.b(iouVar, z);
            this.e = null;
        }
        this.c.d();
    }

    public final void c(long j, boolean z) {
        this.b.g(z ? ddd.CLIPBOARD_AUTO_PASTE_TEXT_ITEM_PASTE_TIME : ddd.CLIPBOARD_AUTO_PASTE_IMAGE_ITEM_PASTE_TIME, System.currentTimeMillis() - j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d() {
        if (m(this.g)) {
            a(9);
        } else if (this.e == null) {
        } else {
            f(hwv.PREEMPTIVE_WITH_SUPPRESSION);
        }
    }

    public final void e() {
        if (!n()) {
            b(true);
        }
    }

    public final void f(hwv hwvVar) {
        iou iouVar = this.e;
        if (iouVar != null) {
            this.f = hwvVar;
            ior.b(iouVar, hwvVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(hqt hqtVar, EditorInfo editorInfo, boolean z) {
        this.d = new FrameLayout(hqtVar.a());
        this.h = hqtVar;
        this.i = editorInfo;
        this.k = z;
        n();
        this.c.g(mjl.a);
    }

    public final boolean l(llp llpVar) {
        if (!jdg.W(this.g, llpVar)) {
            return true;
        }
        if (!m(llpVar)) {
            return false;
        }
        this.b.e(bwa.CHIP_EVENT, 9);
        this.g = null;
        this.j = false;
        this.c.d();
        this.f = null;
        this.e = null;
        this.m = false;
        return true;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.g);
        String str = this.e == null ? "==" : "!=";
        return "AutoPasteSuggestionHelper{ clipItems = " + valueOf + ", proactiveSuggestions " + str + " null}";
    }
}
