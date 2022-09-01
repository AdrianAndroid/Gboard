package defpackage;

import android.graphics.Rect;
import com.google.android.libraries.inputmethod.accesspoint.impl.AccessPointDragPopupView;

/* compiled from: PG */
/* renamed from: gtm  reason: default package */
/* loaded from: classes.dex */
public final class gtm implements gqu {
    private final gqy a;
    private int b = -1;

    public gtm(gqy gqyVar) {
        this.a = gqyVar;
    }

    @Override // defpackage.gqu
    public final int a() {
        return this.b;
    }

    @Override // defpackage.gqu
    public final gqi b(gqh gqhVar, int i) {
        return this.a.p(gqhVar, i);
    }

    @Override // defpackage.gqu
    public final gqy c() {
        return this.a;
    }

    @Override // defpackage.gqu
    public final void d() {
        this.b = -1;
    }

    @Override // defpackage.gqu
    public final void e(boolean z) {
    }

    @Override // defpackage.gqu
    public final boolean f(Rect rect) {
        if (this.a.l().contains(rect.centerX(), rect.centerY())) {
            this.b = this.a.i();
            return true;
        }
        this.b = -1;
        return false;
    }

    @Override // defpackage.gqu
    public final boolean g(gqh gqhVar, int i) {
        return this.a.w(gqhVar, i);
    }

    @Override // defpackage.gqu
    public final void h(AccessPointDragPopupView accessPointDragPopupView) {
    }
}
