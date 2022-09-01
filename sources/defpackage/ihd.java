package defpackage;

import android.util.DisplayMetrics;
import android.view.Display;
import com.google.android.libraries.inputmethod.widgets.SoftKeyView;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;
import java.util.ArrayList;
import java.util.Comparator;

/* compiled from: PG */
/* renamed from: ihd  reason: default package */
/* loaded from: classes.dex */
public final class ihd {
    public final jde a;
    public final igw[] b;
    public final int[][] c;
    public final ArrayList d = lre.A();
    public final ArrayList e = lre.A();
    public final ArrayList f = lre.A();
    public final Comparator g = new ezy(this, 2);
    public float h;
    public float i;
    public int j;
    private final SoftKeyboardView k;

    static {
        lug lugVar = hin.a;
    }

    public ihd(SoftKeyboardView softKeyboardView) {
        this.k = softKeyboardView;
        jde f = softKeyboardView.f();
        this.a = f;
        int size = f.a.size();
        this.b = new igw[size];
        this.c = new int[size];
        b();
    }

    public static float a(float f, float f2, float f3, float f4, float f5, float f6) {
        if (f5 >= f) {
            f = f5 > f2 ? f2 : f5;
        }
        if (f6 >= f3) {
            f3 = f6 > f4 ? f4 : f6;
        }
        float f7 = f5 - f;
        float f8 = f6 - f3;
        return (f7 * f7) + (f8 * f8);
    }

    public static boolean c(SoftKeyView softKeyView) {
        ial c = softKeyView.c(iah.PRESS);
        return c != null && c.d().d == iax.DECODE;
    }

    public final void b() {
        DisplayMetrics displayMetrics;
        int i;
        float f;
        float f2;
        SoftKeyboardView softKeyboardView = this.k;
        Display display = softKeyboardView.getDisplay();
        if (display != null) {
            displayMetrics = new DisplayMetrics();
            display.getRealMetrics(displayMetrics);
        } else {
            displayMetrics = softKeyboardView.getResources().getDisplayMetrics();
        }
        this.h = 25.4f / displayMetrics.xdpi;
        this.i = 25.4f / displayMetrics.ydpi;
        jde jdeVar = this.a;
        int min = Math.min(jdeVar.h, jdeVar.i);
        this.j = min * min;
        int size = this.a.a.size();
        for (int i2 = 0; i2 < size; i2++) {
            igw[] igwVarArr = this.b;
            igw igwVar = igwVarArr[i2];
            if (igwVar == null) {
                igwVar = new igw();
                igwVarArr[i2] = igwVar;
            }
            jde jdeVar2 = this.a;
            int i3 = jdeVar2.d[i2];
            float f3 = this.h;
            float f4 = i3 * f3 * 1.5f;
            int i4 = jdeVar2.e[i2];
            float f5 = this.i;
            float f6 = i4 * f5 * 1.5f;
            float f7 = jdeVar2.f[i2];
            float f8 = jdeVar2.g[i2];
            float f9 = (0.0075f * f4 * f4) + 1.68f;
            igwVar.a = f7 * f3;
            igwVar.b = f8 * f5;
            igwVar.c = 1.0f / f9;
            igwVar.d = 1.0f / (((0.0108f * f6) * f6) + 1.33f);
            igwVar.e = (float) Math.log(1.0f / ((float) (Math.sqrt(f9 * f2) * 6.283185307179586d)));
        }
        int size2 = this.a.a.size();
        ArrayList arrayList = this.e;
        jde jdeVar3 = this.a;
        float[] fArr = jdeVar3.f;
        float[] fArr2 = jdeVar3.g;
        float f10 = this.j * 1.44f;
        for (int i5 = 0; i5 < size2; i5++) {
            jde jdeVar4 = this.a;
            float f11 = jdeVar4.b[i5];
            float f12 = f11 + jdeVar4.d[i5];
            float f13 = jdeVar4.c[i5];
            float f14 = jdeVar4.e[i5] + f13;
            arrayList.clear();
            int i6 = 0;
            while (i6 < size2) {
                if (i6 != i5) {
                    i = i6;
                    f = f13;
                    if (a(f11, f12, f13, f14, fArr[i6], fArr2[i6]) < f10) {
                        arrayList.add(Integer.valueOf(i));
                    }
                } else {
                    i = i6;
                    f = f13;
                }
                i6 = i + 1;
                f13 = f;
            }
            this.c[i5] = mhq.p(arrayList);
        }
    }
}
