package com.google.android.libraries.inputmethod.motioneventhandler;

import android.content.Context;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.widgets.SoftKeyView;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SpatialModelMotionEventHandler extends BasicMotionEventHandler {
    private ihd c;
    private final ArrayList d = lre.A();
    private final ArrayList e = lre.A();
    private final ArrayList f = lre.A();
    private final float g;

    public SpatialModelMotionEventHandler(Context context, igy igyVar) {
        super(context, igyVar);
        this.g = context.getResources().getFraction(R.fraction.f51430_resource_name_obfuscated_res_0x7f0a0004, 1, 1);
    }

    @Override // com.google.android.libraries.inputmethod.motioneventhandler.BasicMotionEventHandler, defpackage.ihf
    public final void i(ihj ihjVar, iah iahVar, iay iayVar, ict ictVar, boolean z, boolean z2, int i, boolean z3, long j) {
        float[] fArr;
        int[] iArr;
        int i2;
        int i3;
        if (iayVar != null) {
            if (z3) {
                super.i(ihjVar, iahVar, iayVar, ictVar, z, z2, i, true, j);
                return;
            }
            if (this.c == null) {
                this.c = new ihd(this.a);
            }
            this.d.clear();
            this.e.clear();
            ihd ihdVar = this.c;
            int i4 = (int) ihjVar.d;
            int i5 = (int) ihjVar.e;
            SoftKeyView softKeyView = ihjVar.m;
            ArrayList arrayList = this.d;
            ArrayList arrayList2 = this.e;
            float f = this.g;
            arrayList.add(softKeyView);
            int indexOfKey = ihdVar.a.a.indexOfKey(softKeyView.getId());
            if (indexOfKey < 0 || !ihd.c(softKeyView)) {
                arrayList2.add(Float.valueOf(1.0f));
            } else {
                float f2 = i4;
                float f3 = ihdVar.h * f2;
                float f4 = i5;
                float f5 = ihdVar.i * f4;
                arrayList2.add(Float.valueOf(ihdVar.b[indexOfKey].a(f3, f5)));
                ihdVar.e.clear();
                ihdVar.f.clear();
                ihdVar.d.clear();
                int[] iArr2 = ihdVar.c[indexOfKey];
                int length = iArr2.length;
                int i6 = 0;
                int i7 = 0;
                while (i6 < length) {
                    int i8 = iArr2[i6];
                    SoftKeyView softKeyView2 = (SoftKeyView) ihdVar.a.a.valueAt(i8);
                    if (ihd.c(softKeyView2)) {
                        jde jdeVar = ihdVar.a;
                        iArr = iArr2;
                        float f6 = jdeVar.b[i8];
                        int i9 = jdeVar.d[i8];
                        int i10 = i6;
                        float f7 = jdeVar.c[i8];
                        i2 = i10;
                        i3 = length;
                        if (ihd.a(f6, f6 + i9, f7, jdeVar.e[i8] + f7, f2, f4) < ihdVar.j) {
                            ihdVar.e.add(Integer.valueOf(i7));
                            ihdVar.d.add(softKeyView2);
                            ihdVar.f.add(Float.valueOf(ihdVar.b[i8].a(f3, f5)));
                            i7++;
                        }
                    } else {
                        iArr = iArr2;
                        i2 = i6;
                        i3 = length;
                    }
                    i6 = i2 + 1;
                    iArr2 = iArr;
                    length = i3;
                }
                Collections.sort(ihdVar.e, ihdVar.g);
                float floatValue = ((Float) arrayList2.get(0)).floatValue();
                if (f > 0.0f) {
                    float f8 = floatValue - f;
                    ArrayList arrayList3 = ihdVar.e;
                    int size = arrayList3.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        int intValue = ((Integer) arrayList3.get(i11)).intValue();
                        float floatValue2 = ((Float) ihdVar.f.get(intValue)).floatValue();
                        if (floatValue2 < f8) {
                            break;
                        }
                        arrayList.add((SoftKeyView) ihdVar.d.get(intValue));
                        arrayList2.add(Float.valueOf(floatValue2));
                    }
                } else {
                    ArrayList arrayList4 = ihdVar.e;
                    int size2 = arrayList4.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        int intValue2 = ((Integer) arrayList4.get(i12)).intValue();
                        arrayList.add((SoftKeyView) ihdVar.d.get(intValue2));
                        arrayList2.add((Float) ihdVar.f.get(intValue2));
                    }
                }
            }
            int i13 = 1;
            if (this.d.size() <= 1) {
                super.i(ihjVar, iahVar, iayVar, ictVar, z, z2, i, false, j);
                return;
            }
            this.l.m();
            ArrayList arrayList5 = this.d;
            this.f.clear();
            int size3 = arrayList5.size();
            for (int i14 = 0; i14 < size3; i14++) {
                this.f.add(((SoftKeyView) arrayList5.get(i14)).d(iah.PRESS).d());
            }
            ArrayList arrayList6 = this.f;
            ArrayList arrayList7 = this.e;
            if (BasicMotionEventHandler.r(iahVar)) {
                this.l.m();
            }
            igy igyVar = this.l;
            hfd b = hfd.b();
            b.i = j;
            b.a = iahVar;
            b.d = ihjVar.d();
            b.e = ihjVar.G();
            b.b = arrayList6.isEmpty() ? iay.b : (iay[]) arrayList6.toArray(new iay[arrayList6.size()]);
            if (arrayList7.isEmpty()) {
                fArr = gvw.c;
            } else {
                int size4 = arrayList7.size();
                float[] fArr2 = new float[size4];
                for (int i15 = 0; i15 < size4; i15++) {
                    fArr2[i15] = ((Float) arrayList7.get(i15)).floatValue();
                }
                fArr = fArr2;
            }
            b.f = fArr;
            b.g();
            b.l(ihjVar.d, ihjVar.e);
            b.n = ihjVar.f;
            b.g = x();
            igu iguVar = this.b;
            if (iguVar != null && iguVar.h) {
                i13 = 2;
            }
            b.p = i13;
            igyVar.n(b);
        }
    }

    @Override // com.google.android.libraries.inputmethod.motioneventhandler.BasicMotionEventHandler, com.google.android.libraries.inputmethod.motioneventhandler.AbstractMotionEventHandler, defpackage.igx
    public final void k(boolean z, int i, int i2, int i3, int i4) {
        ihd ihdVar;
        super.k(z, i, i2, i3, i4);
        if (!z || (ihdVar = this.c) == null) {
            return;
        }
        ihdVar.b();
    }

    @Override // com.google.android.libraries.inputmethod.motioneventhandler.BasicMotionEventHandler, com.google.android.libraries.inputmethod.motioneventhandler.AbstractMotionEventHandler, defpackage.igx
    public final void n(SoftKeyboardView softKeyboardView) {
        if (this.a != softKeyboardView) {
            this.c = null;
        }
        super.n(softKeyboardView);
    }
}
