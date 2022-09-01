package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.inputmethod.accesspoint.impl.AccessPointDragPopupView;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: gtj  reason: default package */
/* loaded from: classes.dex */
public final class gtj implements gqu {
    public AccessPointDragPopupView a;
    private final gqy b;
    private final gtc d;
    private final boolean e;
    private int f = -1;
    private final gsz c = new gsz(new opu(this), null, null, null);

    public gtj(Context context, gqy gqyVar, boolean z) {
        this.b = gqyVar;
        this.d = new gtc(context, gqyVar);
        this.e = z;
    }

    private final void i() {
        int i = this.f;
        if (i >= 0) {
            this.c.b(i);
        }
        this.c.a();
        this.f = -1;
    }

    private final boolean j(int i, int i2) {
        return this.b.l().contains(i, i2);
    }

    @Override // defpackage.gqu
    public final int a() {
        return this.f;
    }

    @Override // defpackage.gqu
    public final gqi b(gqh gqhVar, int i) {
        i();
        gqi p = this.b.p(gqhVar, i);
        this.d.a(i);
        return p;
    }

    @Override // defpackage.gqu
    public final gqy c() {
        return this.b;
    }

    @Override // defpackage.gqu
    public final void d() {
        i();
        this.d.b();
    }

    @Override // defpackage.gqu
    public final boolean f(Rect rect) {
        View inflate;
        if (this.e || !this.b.v()) {
            grc q = this.b.q(rect);
            int i = q != null ? q.a : -1;
            int i2 = this.f;
            if (i != i2) {
                if (i2 >= 0) {
                    this.c.b(i2);
                }
                this.f = i;
                if (q != null && i >= 0) {
                    Point point = q.b;
                    AccessPointDragPopupView accessPointDragPopupView = this.a;
                    if (accessPointDragPopupView != null) {
                        int i3 = point.x;
                        int i4 = point.y;
                        View view = null;
                        if (accessPointDragPopupView.a != 0 && accessPointDragPopupView.c != null && accessPointDragPopupView.e != null) {
                            if (!accessPointDragPopupView.b.isEmpty()) {
                                inflate = (View) accessPointDragPopupView.b.pop();
                            } else {
                                inflate = LayoutInflater.from(accessPointDragPopupView.getContext()).inflate(accessPointDragPopupView.a, (ViewGroup) accessPointDragPopupView, false);
                            }
                            view = inflate;
                            int max = Math.max((int) (accessPointDragPopupView.c.getMeasuredWidth() * accessPointDragPopupView.e.getScaleX()), (int) (accessPointDragPopupView.c.getMeasuredHeight() * accessPointDragPopupView.e.getScaleY()));
                            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                            layoutParams.height = max;
                            layoutParams.width = max;
                            view.setLayoutParams(layoutParams);
                            float f = max / 2.0f;
                            view.setTranslationX(i3 - f);
                            view.setTranslationY(i4 - f);
                            view.setVisibility(4);
                            accessPointDragPopupView.addView(view, 0);
                        }
                        if (view != null) {
                            gsz gszVar = this.c;
                            if (gszVar.h && gszVar.d != i && gszVar.f != i) {
                                gszVar.c();
                                gszVar.d = i;
                                gszVar.e = view;
                                gszVar.i = gyc.b.a(new fqa(gszVar, 15), 200L, TimeUnit.MILLISECONDS);
                            }
                        }
                    }
                    gtc gtcVar = this.d;
                    gtcVar.a.u(this.f);
                    if (gtcVar.c) {
                        gtcVar.b.b(lfl.ALWAYS_TRUE);
                    }
                } else {
                    this.d.b();
                }
            }
            return this.f != -1 || j(rect.centerX(), rect.centerY());
        }
        this.f = -1;
        return j(rect.centerX(), rect.centerY());
    }

    @Override // defpackage.gqu
    public final boolean g(gqh gqhVar, int i) {
        i();
        boolean w = this.b.w(gqhVar, i);
        this.d.a(i);
        return w;
    }

    @Override // defpackage.gqu
    public final void h(AccessPointDragPopupView accessPointDragPopupView) {
        if (this.a == accessPointDragPopupView) {
            return;
        }
        i();
        this.a = accessPointDragPopupView;
    }

    @Override // defpackage.gqu
    public final void e(boolean z) {
        gsz gszVar = this.c;
        if (gszVar.h != z) {
            gszVar.h = z;
            if (!z) {
                gszVar.a();
            }
        }
        gtc gtcVar = this.d;
        if (gtcVar.c == z) {
            return;
        }
        gtcVar.c = z;
        if (z) {
            return;
        }
        gtcVar.b.a();
    }
}
