package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.accesspoint.impl.AccessPointDragPopupView;
import com.google.android.libraries.inputmethod.widgets.SoftKeyView;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;

/* compiled from: PG */
/* renamed from: grg  reason: default package */
/* loaded from: classes.dex */
public final class grg {
    public int a;
    public AccessPointDragPopupView b;
    public jdc c;
    public int d;
    private final grf e;
    private final imn g;
    private SoftKeyboardView h;
    private gqu[] i;
    private gqu j;
    private gck l;
    private final Rect f = new Rect();
    private final jdc k = new gre(this);

    public grg(grf grfVar, imn imnVar) {
        this.e = grfVar;
        this.g = imnVar;
    }

    private final void e() {
        imn imnVar;
        f(null);
        AccessPointDragPopupView accessPointDragPopupView = this.b;
        if (accessPointDragPopupView != null && (imnVar = this.g) != null && imnVar.f(accessPointDragPopupView)) {
            View view = this.b.e;
            if (view != null) {
                view.setVisibility(8);
            }
            this.g.c(this.b, null, true);
        }
        this.b = null;
    }

    private final void f(AccessPointDragPopupView accessPointDragPopupView) {
        gqu[] gquVarArr = this.i;
        if (gquVarArr != null) {
            for (gqu gquVar : gquVarArr) {
                gquVar.h(accessPointDragPopupView);
            }
        }
    }

    public final void a() {
        gqu gquVar = this.j;
        if (gquVar != null) {
            gquVar.d();
        }
        gck gckVar = this.l;
        if (gckVar != null) {
            ((gti) gckVar.d).a();
            ((gsv) gckVar.b).a();
            ((View) gckVar.e).setVisibility(0);
        }
        e();
    }

    public final void b(float f, float f2) {
        AccessPointDragPopupView accessPointDragPopupView;
        Rect rect;
        int length;
        imn imnVar = this.g;
        if (imnVar == null || !imnVar.f(this.b) || this.h == null || (accessPointDragPopupView = this.b) == null) {
            return;
        }
        Rect rect2 = this.f;
        if (accessPointDragPopupView.c == null || accessPointDragPopupView.e == null) {
            rect = new Rect();
        } else {
            if (!accessPointDragPopupView.j) {
                accessPointDragPopupView.k = f;
                accessPointDragPopupView.l = f2;
                accessPointDragPopupView.b(f, f2);
                accessPointDragPopupView.j = true;
            } else {
                accessPointDragPopupView.b(f, f2);
            }
            jdy.i(accessPointDragPopupView.c, null, accessPointDragPopupView.d);
            rect = accessPointDragPopupView.d;
        }
        rect2.set(rect);
        Rect rect3 = this.f;
        gqu[] gquVarArr = this.i;
        gck gckVar = this.l;
        if (gquVarArr == null || (length = gquVarArr.length) == 0 || gckVar == null) {
            return;
        }
        gqu gquVar = this.j;
        if (gquVar == null || !gquVar.f(rect3)) {
            gqu gquVar2 = this.j;
            int i = 0;
            if (gquVar2 != null) {
                gquVar2.d();
                this.j = null;
            }
            while (true) {
                if (i < length) {
                    gqu gquVar3 = gquVarArr[i];
                    if (gquVar3 != gquVar2 && gquVar3.f(rect3)) {
                        this.j = gquVar3;
                        break;
                    }
                    i++;
                } else {
                    break;
                }
            }
        }
        if (this.j == null || gquVar != null) {
            return;
        }
        gti gtiVar = (gti) gckVar.d;
        if (gtiVar.a.getVisibility() == 8) {
            return;
        }
        if (!gtiVar.d) {
            gtiVar.a.setVisibility(8);
            return;
        }
        gtiVar.a.setVisibility(8);
        gtiVar.b.b(new ein(gtiVar, 9));
    }

    public final void d(Context context, SoftKeyboardView softKeyboardView, gck gckVar, gqu... gquVarArr) {
        float centerX;
        float centerY;
        if (this.h != null) {
            c(null);
        }
        if (softKeyboardView.getWindowToken() == null) {
            return;
        }
        this.h = softKeyboardView;
        this.c = softKeyboardView.e;
        this.l = gckVar;
        this.i = gquVarArr;
        this.j = null;
        boolean o = jam.o();
        gck gckVar2 = this.l;
        if (gckVar2 != null) {
            gti gtiVar = (gti) gckVar2.d;
            if (o != gtiVar.d) {
                gtiVar.d = o;
                if (!o) {
                    gtiVar.a();
                }
            }
            gsv gsvVar = (gsv) gckVar2.b;
            if (gsvVar.j != o) {
                gsvVar.j = o;
                if (!o) {
                    gsvVar.a();
                }
            }
        }
        gqu[] gquVarArr2 = this.i;
        if (gquVarArr2 != null) {
            for (gqu gquVar : gquVarArr2) {
                gquVar.e(o);
            }
        }
        MotionEvent motionEvent = gqa.a(softKeyboardView.getContext()).e ? softKeyboardView.r : softKeyboardView.q;
        Object obj = gckVar.e;
        if (motionEvent != null) {
            int actionIndex = motionEvent.getActionIndex();
            this.d = actionIndex;
            centerX = motionEvent.getX(actionIndex);
            centerY = motionEvent.getY(this.d);
        } else {
            this.d = -1;
            jdy.i((View) obj, softKeyboardView, this.f);
            centerX = this.f.centerX();
            centerY = this.f.centerY();
        }
        softKeyboardView.j(this.k);
        if (this.g.f(this.b)) {
            e();
        }
        float[] fArr = {centerX, centerY};
        jdy.d(fArr, softKeyboardView, null);
        AccessPointDragPopupView accessPointDragPopupView = (AccessPointDragPopupView) this.g.b(context, this.a);
        this.b = accessPointDragPopupView;
        float f = fArr[0];
        float f2 = fArr[1];
        if (accessPointDragPopupView.c != null && accessPointDragPopupView.e != null) {
            ViewGroup.LayoutParams layoutParams = accessPointDragPopupView.getLayoutParams();
            Context context2 = accessPointDragPopupView.getContext();
            int f3 = gvv.f(context2);
            int d = gvv.d(context2);
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(f3, d);
            } else {
                layoutParams.height = d;
                layoutParams.width = f3;
            }
            accessPointDragPopupView.setLayoutParams(layoutParams);
            accessPointDragPopupView.k = -1.0f;
            accessPointDragPopupView.l = -1.0f;
            View view = accessPointDragPopupView.c;
            if (view instanceof ImageView) {
                ImageView imageView = (ImageView) view;
                ImageView imageView2 = (ImageView) ((View) obj).findViewById(R.id.f56210_resource_name_obfuscated_res_0x7f0b0265);
                if (imageView2 != null) {
                    imageView.setImageDrawable(imageView2.getDrawable());
                    ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
                    if (layoutParams2 != null) {
                        imageView.measure(layoutParams2.width > 0 ? View.MeasureSpec.makeMeasureSpec(layoutParams2.width, 1073741824) : 0, layoutParams2.height > 0 ? View.MeasureSpec.makeMeasureSpec(layoutParams2.height, 1073741824) : 0);
                    }
                }
            } else if (view instanceof SoftKeyView) {
                SoftKeyView softKeyView = (SoftKeyView) view;
                ict ictVar = ((SoftKeyView) obj).b;
                if (ictVar != null) {
                    ico d2 = ict.d();
                    d2.j(ictVar);
                    d2.h();
                    softKeyView.n(d2.c());
                    ViewGroup.LayoutParams layoutParams3 = softKeyView.getLayoutParams();
                    if (layoutParams3 != null) {
                        View view2 = (View) obj;
                        layoutParams3.width = view2.getMeasuredWidth();
                        layoutParams3.height = view2.getMeasuredHeight();
                        softKeyView.measure(View.MeasureSpec.makeMeasureSpec(layoutParams3.width, 1073741824), View.MeasureSpec.makeMeasureSpec(layoutParams3.height, 1073741824));
                    }
                } else {
                    softKeyView.n(null);
                }
            }
            View view3 = accessPointDragPopupView.e;
            if (view3 != null) {
                View view4 = (View) obj;
                view3.setScaleX(jdy.a(view4));
                accessPointDragPopupView.e.setScaleY(jdy.b(view4));
            }
            int measuredWidth = accessPointDragPopupView.c.getMeasuredWidth();
            int measuredHeight = accessPointDragPopupView.c.getMeasuredHeight();
            accessPointDragPopupView.j = false;
            int i = (int) (f - (measuredWidth / 2.0f));
            accessPointDragPopupView.f = i;
            int i2 = (int) (f2 - (measuredHeight * 0.75f));
            accessPointDragPopupView.g = i2;
            accessPointDragPopupView.h = i;
            accessPointDragPopupView.i = i2;
            accessPointDragPopupView.e.setVisibility(0);
            accessPointDragPopupView.a(accessPointDragPopupView.h, accessPointDragPopupView.i);
        }
        this.g.e(this.b, softKeyboardView, 0, 0, 0, null);
        ((View) gckVar.e).setVisibility(4);
        f(this.b);
        b(centerX, centerY);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x01e7  */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, gqy] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, gqy] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, gqy] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, gqy] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, gqy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(android.view.MotionEvent r19) {
        /*
            Method dump skipped, instructions count: 518
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.grg.c(android.view.MotionEvent):void");
    }
}
