package com.google.android.apps.inputmethod.libs.gestureui;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.MotionEvent;
import com.google.android.apps.inputmethod.libs.gestureui.AbstractKeyboardLayoutHandler;
import com.google.android.libraries.inputmethod.motioneventhandler.AbstractMotionEventHandler;
import com.google.android.libraries.inputmethod.widgets.SoftKeyView;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class AbstractKeyboardLayoutHandler extends AbstractMotionEventHandler {
    public SoftKeyboardView a;
    public iay b;

    public AbstractKeyboardLayoutHandler(Context context, igy igyVar) {
        super(context, igyVar);
    }

    public abstract dfq a(ibi ibiVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public final void b() {
        gyc.b.execute(new Runnable() { // from class: dfn
            @Override // java.lang.Runnable
            public final void run() {
                DisplayMetrics displayMetrics;
                AbstractKeyboardLayoutHandler abstractKeyboardLayoutHandler = AbstractKeyboardLayoutHandler.this;
                if (abstractKeyboardLayoutHandler.a != null) {
                    if (abstractKeyboardLayoutHandler.b == null) {
                        dfq a = abstractKeyboardLayoutHandler.a(abstractKeyboardLayoutHandler.l.i().h);
                        SoftKeyboardView softKeyboardView = abstractKeyboardLayoutHandler.a;
                        int a2 = abstractKeyboardLayoutHandler.l.a();
                        nfh t = mrm.p.t();
                        float height = softKeyboardView.getHeight();
                        if (t.c) {
                            t.cD();
                            t.c = false;
                        }
                        mrm mrmVar = (mrm) t.b;
                        mrmVar.a |= 8;
                        mrmVar.e = height;
                        float width = softKeyboardView.getWidth();
                        if (t.c) {
                            t.cD();
                            t.c = false;
                        }
                        mrm mrmVar2 = (mrm) t.b;
                        mrmVar2.a |= 4;
                        mrmVar2.d = width;
                        Context context = softKeyboardView.getContext();
                        float d = hwa.d(context, iau.SOFT, hwa.g(context));
                        if (t.c) {
                            t.cD();
                            t.c = false;
                        }
                        mrm mrmVar3 = (mrm) t.b;
                        int i = mrmVar3.a | 256;
                        mrmVar3.a = i;
                        mrmVar3.n = d;
                        mrmVar3.a = i | 512;
                        mrmVar3.o = a2;
                        Display display = softKeyboardView.getDisplay();
                        if (display != null) {
                            displayMetrics = new DisplayMetrics();
                            display.getRealMetrics(displayMetrics);
                        } else {
                            displayMetrics = softKeyboardView.getResources().getDisplayMetrics();
                        }
                        float f = displayMetrics.xdpi;
                        if (t.c) {
                            t.cD();
                            t.c = false;
                        }
                        mrm mrmVar4 = (mrm) t.b;
                        mrmVar4.a |= 16;
                        mrmVar4.i = f;
                        float f2 = displayMetrics.ydpi;
                        if (t.c) {
                            t.cD();
                            t.c = false;
                        }
                        mrm mrmVar5 = (mrm) t.b;
                        mrmVar5.a |= 32;
                        mrmVar5.j = f2;
                        jde f3 = softKeyboardView.f();
                        float f4 = f3.i;
                        if (t.c) {
                            t.cD();
                            t.c = false;
                        }
                        mrm mrmVar6 = (mrm) t.b;
                        int i2 = mrmVar6.a | 2;
                        mrmVar6.a = i2;
                        mrmVar6.c = f4;
                        int i3 = f3.h;
                        mrmVar6.a = i2 | 1;
                        mrmVar6.b = i3;
                        int size = f3.a.size();
                        ArrayList arrayList = new ArrayList(size * 3);
                        ArrayList arrayList2 = new ArrayList();
                        dfr dfrVar = new dfr();
                        for (int i4 = 0; i4 < size; i4++) {
                            dfrVar.a = 0;
                            dfrVar.b = 0.0f;
                            dfrVar.c = 0.0f;
                            dfrVar.d = 0.0f;
                            dfrVar.e = 0.0f;
                            dfrVar.f = 0;
                            dfrVar.g = null;
                            dfrVar.h = false;
                            dfrVar.a = f3.a.keyAt(i4);
                            dfrVar.b = f3.d[i4];
                            dfrVar.c = f3.e[i4];
                            dfrVar.d = f3.f[i4];
                            dfrVar.e = f3.g[i4];
                            a.a((SoftKeyView) f3.a.valueAt(i4), dfrVar, arrayList, arrayList2);
                        }
                        t.dQ(arrayList);
                        if (t.c) {
                            t.cD();
                            t.c = false;
                        }
                        mrm mrmVar7 = (mrm) t.b;
                        nga ngaVar = mrmVar7.m;
                        if (!ngaVar.c()) {
                            mrmVar7.m = nfm.H(ngaVar);
                        }
                        ndt.cs(arrayList2, mrmVar7.m);
                        abstractKeyboardLayoutHandler.b = new iay(-10044, null, (mrm) t.cz());
                    }
                    igy igyVar = abstractKeyboardLayoutHandler.l;
                    hfd b = hfd.b();
                    b.g = abstractKeyboardLayoutHandler.x();
                    b.j(abstractKeyboardLayoutHandler.b);
                    b.p = 0;
                    igyVar.n(b);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean c() {
        return this.l.p();
    }

    @Override // com.google.android.libraries.inputmethod.motioneventhandler.AbstractMotionEventHandler, defpackage.igx
    public final void e() {
        this.b = null;
        b();
    }

    @Override // defpackage.igx
    public final void h(MotionEvent motionEvent) {
    }

    @Override // com.google.android.libraries.inputmethod.motioneventhandler.AbstractMotionEventHandler, defpackage.igx
    public final void k(boolean z, int i, int i2, int i3, int i4) {
        if (z) {
            this.b = null;
            if (!c()) {
                return;
            }
            b();
        }
    }

    @Override // com.google.android.libraries.inputmethod.motioneventhandler.AbstractMotionEventHandler, defpackage.igx
    public final void n(SoftKeyboardView softKeyboardView) {
        this.a = softKeyboardView;
        this.b = null;
        if (c()) {
            b();
        }
    }
}
