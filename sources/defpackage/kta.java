package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.Window;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: PG */
/* renamed from: kta  reason: default package */
/* loaded from: classes.dex */
public final class kta extends ksu {
    private final Boolean a;
    private final abc b;
    private Window c;
    private boolean d;

    public kta(View view, abc abcVar) {
        ColorStateList m;
        this.b = abcVar;
        kxe kxeVar = BottomSheetBehavior.v(view).c;
        if (kxeVar != null) {
            m = kxeVar.a.d;
        } else {
            m = aad.m(view);
        }
        if (m != null) {
            this.a = Boolean.valueOf(kxc.j(m.getDefaultColor()));
        } else if (view.getBackground() instanceof ColorDrawable) {
            this.a = Boolean.valueOf(kxc.j(((ColorDrawable) view.getBackground()).getColor()));
        } else {
            this.a = null;
        }
    }

    private final void e(View view) {
        if (view.getTop() < this.b.d()) {
            Window window = this.c;
            if (window != null) {
                Boolean bool = this.a;
                kvj.d(window, bool == null ? this.d : bool.booleanValue());
            }
            view.setPadding(view.getPaddingLeft(), this.b.d() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
        } else if (view.getTop() == 0) {
        } else {
            Window window2 = this.c;
            if (window2 != null) {
                kvj.d(window2, this.d);
            }
            view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
        }
    }

    @Override // defpackage.ksu
    public final void a(View view) {
        e(view);
    }

    @Override // defpackage.ksu
    public final void b(View view, int i) {
        e(view);
    }

    @Override // defpackage.ksu
    public final void c(View view) {
        e(view);
    }

    public final void d(Window window) {
        if (this.c == window) {
            return;
        }
        this.c = window;
        if (window == null) {
            return;
        }
        this.d = ((uc) tw.e(window, window.getDecorView()).a).f();
    }
}
