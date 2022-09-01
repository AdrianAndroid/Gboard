package com.google.android.apps.inputmethod.libs.pinyin;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.inputmethod.libs.gestureui.AbstractGestureMotionEventHandler;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.widgets.SoftKeyView;

/* compiled from: PG */
/* loaded from: classes.dex */
public class Pinyin9KeyGestureHandler extends AbstractGestureMotionEventHandler {
    public Pinyin9KeyGestureHandler(Context context, igy igyVar) {
        super(context, igyVar, 250, 0.4f, 0.1f, 3.0f);
    }

    @Override // com.google.android.apps.inputmethod.libs.gestureui.AbstractGestureMotionEventHandler
    protected final int a() {
        jde jdeVar = this.g;
        return Math.max(jdeVar.h, jdeVar.i);
    }

    @Override // com.google.android.apps.inputmethod.libs.gestureui.AbstractGestureMotionEventHandler
    protected final int b() {
        jde jdeVar = this.g;
        return Math.min(jdeVar.h, jdeVar.i);
    }

    @Override // com.google.android.apps.inputmethod.libs.gestureui.AbstractGestureMotionEventHandler
    public final ViewGroup d(View view) {
        if (view == null) {
            return null;
        }
        return (ViewGroup) view.findViewById(R.id.f129300_resource_name_obfuscated_res_0x7f0b2150);
    }

    @Override // com.google.android.apps.inputmethod.libs.gestureui.AbstractGestureMotionEventHandler
    protected final boolean p(SoftKeyView softKeyView) {
        int i;
        iay e = softKeyView.e();
        return e != null && e.d == iax.DECODE && (i = e.c) >= 9 && i <= 16;
    }
}
