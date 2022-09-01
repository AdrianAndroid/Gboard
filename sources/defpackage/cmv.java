package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.inputmethod.keyboard.impl.KeyboardViewHolder;
import com.google.android.libraries.inputmethod.widgets.SoftKeyView;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* renamed from: cmv  reason: default package */
/* loaded from: classes.dex */
public final class cmv implements cnc {
    private static final ltg j = ltg.j("com/google/android/apps/inputmethod/libs/expression/emojify/impl/EmojifyIconHolderManager");
    public boolean c;
    public final View.OnClickListener d;
    public ViewGroup e;
    public SoftKeyView f;
    public View g;
    public KeyboardViewHolder h;
    public int i;
    private final imn k;
    private final hwu n;
    public final AtomicBoolean a = new AtomicBoolean(false);
    private final AtomicInteger l = new AtomicInteger(-1);
    public final cmt b = new cmt();
    private final jdp m = new cgm(this, 2);

    public cmv(View.OnClickListener onClickListener) {
        cmu cmuVar = new cmu(this);
        this.n = cmuVar;
        hsk b = hsx.b();
        imn imnVar = null;
        if (b == null) {
            ((ltd) ((ltd) j.c()).k("com/google/android/apps/inputmethod/libs/expression/emojify/impl/EmojifyIconHolderManager", "getPopupViewManager", 168, "EmojifyIconHolderManager.java")).t("InputMethodService is null");
        } else {
            imn aa = b.aa();
            if (aa == null) {
                ((ltd) ((ltd) j.c()).k("com/google/android/apps/inputmethod/libs/expression/emojify/impl/EmojifyIconHolderManager", "getPopupViewManager", 173, "EmojifyIconHolderManager.java")).t("popupViewManager is null");
            } else {
                imnVar = aa;
            }
        }
        this.k = imnVar;
        this.d = new dbg(onClickListener, 0);
        hsx.c().a(ice.HEADER, cmuVar);
    }

    @Override // defpackage.cnc
    public final cmt a() {
        return this.b;
    }

    @Override // defpackage.cnc
    public final void b() {
        this.c = false;
        e();
        hsx.c().l(ice.HEADER, this.n);
    }

    @Override // defpackage.cnc
    public final void c(Runnable runnable) {
        this.c = true;
        if (g()) {
            this.b.a();
            runnable.run();
        }
    }

    @Override // defpackage.cnc
    public final boolean d() {
        this.c = false;
        if (f()) {
            this.b.a();
            return true;
        }
        return false;
    }

    public final void e() {
        f();
        if (this.f != null) {
            this.f = null;
        }
        View view = this.g;
        if (view != null) {
            view.setOnClickListener(null);
            this.g = null;
        }
        this.b.b();
    }

    public final boolean f() {
        imn imnVar;
        View view;
        if (!this.a.get() || (imnVar = this.k) == null || (view = this.g) == null || !imnVar.f(view)) {
            return false;
        }
        this.k.d(this.g, null, false);
        SoftKeyView softKeyView = this.f;
        if (softKeyView != null) {
            softKeyView.g(this.m);
            if (this.l.get() != -1) {
                this.f.setImportantForAccessibility(this.l.get());
                this.l.set(-1);
            }
        }
        this.a.set(false);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g() {
        /*
            r12 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r12.a
            boolean r0 = r0.get()
            r1 = 0
            if (r0 != 0) goto L9f
            imn r0 = r12.k
            if (r0 == 0) goto L9f
            android.view.View r0 = r12.g
            if (r0 == 0) goto L9f
            com.google.android.libraries.inputmethod.keyboard.impl.KeyboardViewHolder r0 = r12.h
            if (r0 == 0) goto L9f
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L1d
            goto L9f
        L1d:
            android.view.ViewGroup r0 = r12.e
            if (r0 == 0) goto L29
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L28
            goto L29
        L28:
            return r1
        L29:
            com.google.android.libraries.inputmethod.widgets.SoftKeyView r0 = r12.f
            r2 = 2
            r3 = 8
            r4 = 3
            if (r0 == 0) goto L42
            int r0 = r0.getVisibility()
            if (r0 == r3) goto L42
            com.google.android.libraries.inputmethod.widgets.SoftKeyView r0 = r12.f
            jdp r3 = r12.m
            r0.f(r3)
            com.google.android.libraries.inputmethod.widgets.SoftKeyView r0 = r12.f
            r7 = r0
            goto L61
        L42:
            com.google.android.libraries.inputmethod.keyboard.impl.KeyboardViewHolder r0 = r12.h
            r5 = 0
            if (r0 == 0) goto L60
            int r0 = r0.getVisibility()
            if (r0 == r3) goto L60
            com.google.android.libraries.inputmethod.keyboard.impl.KeyboardViewHolder r0 = r12.h
            android.content.Context r3 = r0.getContext()
            r4 = 2130968862(0x7f04011e, float:1.754639E38)
            int r3 = defpackage.jbt.e(r3, r4)
            int r3 = r3 / r2
            r4 = 9
            r7 = r0
            r10 = r3
            goto L62
        L60:
            r7 = r5
        L61:
            r10 = 0
        L62:
            if (r7 != 0) goto L65
            return r1
        L65:
            com.google.android.libraries.inputmethod.keyboard.impl.KeyboardViewHolder r0 = r12.h
            if (r7 != r0) goto L6c
            int r0 = r12.i
            goto L6d
        L6c:
            r0 = 0
        L6d:
            android.view.View r3 = r12.g
            int r5 = r3.getPaddingTop()
            android.view.View r6 = r12.g
            int r6 = r6.getPaddingBottom()
            r3.setPaddingRelative(r1, r5, r0, r6)
            imn r5 = r12.k
            android.view.View r6 = r12.g
            r8 = r4 | 1584(0x630, float:2.22E-42)
            r9 = 0
            r11 = 0
            r5.e(r6, r7, r8, r9, r10, r11)
            java.util.concurrent.atomic.AtomicBoolean r0 = r12.a
            r1 = 1
            r0.set(r1)
            com.google.android.libraries.inputmethod.widgets.SoftKeyView r0 = r12.f
            if (r0 == 0) goto L9f
            java.util.concurrent.atomic.AtomicInteger r3 = r12.l
            int r0 = r0.getImportantForAccessibility()
            r3.set(r0)
            com.google.android.libraries.inputmethod.widgets.SoftKeyView r0 = r12.f
            r0.setImportantForAccessibility(r2)
        L9f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmv.g():boolean");
    }
}
