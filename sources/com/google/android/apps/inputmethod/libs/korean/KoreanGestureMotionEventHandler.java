package com.google.android.apps.inputmethod.libs.korean;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.inputmethod.libs.gestureui.AbstractGestureMotionEventHandler;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.widgets.SoftKeyView;

/* compiled from: PG */
/* loaded from: classes.dex */
public class KoreanGestureMotionEventHandler extends AbstractGestureMotionEventHandler {
    private final inm j;
    private float m;

    public KoreanGestureMotionEventHandler(Context context, igy igyVar) {
        super(context, igyVar, 250);
        btf btfVar = new btf(this, 14);
        this.j = btfVar;
        ino M = ino.M(context);
        M.X(btfVar, R.string.f161560_resource_name_obfuscated_res_0x7f1406bd);
        t(M);
    }

    private final boolean u(SoftKeyView softKeyView, float f, float f2, iah iahVar) {
        return softKeyView.b.b(iahVar) != null && f / f2 < this.m;
    }

    @Override // com.google.android.apps.inputmethod.libs.gestureui.AbstractGestureMotionEventHandler
    protected final ViewGroup d(View view) {
        if (view == null) {
            return null;
        }
        return (ViewGroup) view;
    }

    @Override // com.google.android.apps.inputmethod.libs.gestureui.AbstractGestureMotionEventHandler
    protected final boolean p(SoftKeyView softKeyView) {
        Object obj;
        iay e = softKeyView.e();
        return e != null && e.d == iax.DECODE && (obj = e.e) != null && dzg.j(((String) obj).charAt(0));
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
            SoftKeyView softKeyView = (SoftKeyView) this.d.get(keyAt);
            float f = mwjVar2.d;
            float f2 = mwjVar2.e;
            float f3 = mwjVar.d;
            float f4 = mwjVar.e;
            if (softKeyView.b != null) {
                float abs = Math.abs(f - f3);
                float abs2 = Math.abs(f2 - f4);
                if (abs <= abs2) {
                    if (f4 > f2) {
                        if (u(softKeyView, abs, abs2, iah.SLIDE_UP)) {
                        }
                    } else if (u(softKeyView, abs, abs2, iah.SLIDE_DOWN)) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void t(ino inoVar) {
        this.m = (1.0f / inoVar.A(R.string.f161560_resource_name_obfuscated_res_0x7f1406bd, 1.0f)) * 0.75f;
    }
}
