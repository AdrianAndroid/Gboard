package com.google.android.apps.inputmethod.libs.pinyin;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.inputmethod.libs.gestureui.AbstractGestureMotionEventHandler;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.widgets.SoftKeyView;

/* compiled from: PG */
/* loaded from: classes.dex */
public class PinyinGestureHandler extends AbstractGestureMotionEventHandler {
    private static final int[] j = new int[26];
    private float m;
    private final inm n;
    private float o = -1.0f;
    private float p = -1.0f;
    private float q = -1.0f;
    private float r;
    private float s;

    static {
        for (int i = 0; i < 26; i++) {
            j[i] = 0;
        }
        u(new int[]{45, 51, 33, 46, 48, 53, 49, 37, 43, 44, 29, 47, 32, 34, 35, 36, 38, 39, 40, 54, 52, 31, 50, 30, 42, 41}, 2);
        u(new int[]{45, 51, 33, 46, 48, 53, 49, 37, 43, 44, 29, 34, 35, 39, 50}, 1);
        u(new int[]{54, 52, 31, 50, 30, 42, 41}, 32);
        u(new int[]{45, 51, 33, 46, 48, 53, 49, 37, 43, 44}, 16);
        u(new int[]{45, 51, 33, 48, 53, 49, 37, 43, 29, 32, 34, 35, 36, 38, 39, 40, 54, 52, 31, 50, 30, 42, 41}, 4);
        u(new int[]{45, 51, 46, 48, 49, 37, 43, 44, 29, 47, 32, 34, 35, 36, 38, 39, 40, 54, 52, 31, 50, 30, 42, 41}, 8);
    }

    public PinyinGestureHandler(Context context, igy igyVar) {
        super(context, igyVar, 250);
        btf btfVar = new btf(this, 15);
        this.n = btfVar;
        ino M = ino.M(context);
        M.X(btfVar, R.string.f161560_resource_name_obfuscated_res_0x7f1406bd);
        t(M);
    }

    private static boolean C(SoftKeyView softKeyView, int i) {
        int i2 = softKeyView.b.b(iah.PRESS).d().c - 29;
        return i2 >= 0 && i2 < 26 && (j[i2] & i) > 0;
    }

    private static void u(int[] iArr, int i) {
        for (int i2 : iArr) {
            int i3 = i2 - 29;
            int[] iArr2 = j;
            iArr2[i3] = iArr2[i3] | i;
        }
    }

    private final boolean v(SoftKeyView softKeyView, float f, float f2, iah iahVar) {
        int i = iahVar == iah.SLIDE_UP ? 16 : 32;
        int i2 = iahVar == iah.SLIDE_UP ? 1 : 2;
        if (!C(softKeyView, i)) {
            if (softKeyView.b.b(iahVar) != null) {
                float f3 = f / f2;
                if (C(softKeyView, i2)) {
                    return f3 < this.r;
                } else if (f3 < this.s && f2 < this.q) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    private static boolean w(SoftKeyView softKeyView) {
        int i;
        iay e = softKeyView.e();
        return e != null && (i = e.c) >= 29 && i <= 54 && e.d == iax.DECODE;
    }

    @Override // com.google.android.apps.inputmethod.libs.gestureui.AbstractGestureMotionEventHandler
    public final ViewGroup d(View view) {
        if (view == null) {
            return null;
        }
        return (ViewGroup) view.findViewById(R.id.input_area);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.apps.inputmethod.libs.gestureui.AbstractGestureMotionEventHandler
    public final void f() {
        super.f();
        jde jdeVar = this.g;
        float f = jdeVar.h;
        this.o = 1.2f * f;
        this.p = f * 0.55f;
        float f2 = jdeVar.i;
        this.q = 1.5f * f2;
        this.m = f2 * 0.8f;
    }

    @Override // com.google.android.apps.inputmethod.libs.gestureui.AbstractGestureMotionEventHandler
    protected final boolean p(SoftKeyView softKeyView) {
        if ((this.l.b() & 3) != 0) {
            return false;
        }
        if (w(softKeyView)) {
            return true;
        }
        ict ictVar = softKeyView.b;
        return ictVar.b(iah.SLIDE_LEFT) == null && ictVar.b(iah.SLIDE_RIGHT) == null && ictVar.b(iah.SLIDE_UP) == null && ictVar.b(iah.SLIDE_DOWN) == null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.apps.inputmethod.libs.gestureui.AbstractGestureMotionEventHandler
    public final boolean s() {
        if (!super.s()) {
            return false;
        }
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            int keyAt = this.a.keyAt(i);
            if (r(keyAt)) {
                return true;
            }
            mwj mwjVar = (mwj) this.a.valueAt(i);
            mwj mwjVar2 = (mwj) this.b.get(keyAt);
            if (Math.abs(mwjVar2.d - mwjVar.d) > this.p || Math.abs(mwjVar2.e - mwjVar.e) > this.m) {
                SoftKeyView softKeyView = (SoftKeyView) this.d.get(keyAt);
                if (w(softKeyView)) {
                    float f = mwjVar2.d;
                    float f2 = mwjVar2.e;
                    float f3 = mwjVar.d;
                    float f4 = mwjVar.e;
                    if (softKeyView.b != null) {
                        float abs = Math.abs(f - f3);
                        float abs2 = Math.abs(f2 - f4);
                        if (abs > abs2) {
                            if (C(softKeyView, f > f3 ? 8 : 4)) {
                                if (abs < this.o) {
                                    continue;
                                }
                            }
                            if (f4 > f2) {
                                if (C(softKeyView, 16) && abs / abs2 < 1.3f) {
                                }
                            }
                            if (f4 < f2 && C(softKeyView, 32) && abs / abs2 < 1.3f) {
                            }
                        } else if (f4 > f2) {
                            if (!v(softKeyView, abs, abs2, iah.SLIDE_UP)) {
                            }
                        } else if (!v(softKeyView, abs, abs2, iah.SLIDE_DOWN)) {
                        }
                    }
                    return true;
                }
                continue;
            }
        }
        return false;
    }

    public final void t(ino inoVar) {
        float A = 1.0f / inoVar.A(R.string.f161560_resource_name_obfuscated_res_0x7f1406bd, 1.0f);
        this.r = 0.6f * A;
        this.s = A * 0.16f;
    }
}
