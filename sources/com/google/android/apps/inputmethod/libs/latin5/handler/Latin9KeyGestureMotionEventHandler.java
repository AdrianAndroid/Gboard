package com.google.android.apps.inputmethod.libs.latin5.handler;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.widgets.SoftKeyView;

/* compiled from: PG */
/* loaded from: classes.dex */
public class Latin9KeyGestureMotionEventHandler extends LatinGestureMotionEventHandler {
    public Latin9KeyGestureMotionEventHandler(Context context, igy igyVar) {
        super(context, igyVar);
    }

    @Override // com.google.android.apps.inputmethod.libs.latin5.handler.LatinGestureMotionEventHandler, com.google.android.apps.inputmethod.libs.gestureui.AbstractGestureMotionEventHandler
    public final ViewGroup d(View view) {
        if (view == null) {
            return null;
        }
        return (ViewGroup) view.findViewById(R.id.f129300_resource_name_obfuscated_res_0x7f0b2150);
    }

    @Override // com.google.android.apps.inputmethod.libs.latin5.handler.LatinGestureMotionEventHandler, com.google.android.apps.inputmethod.libs.gestureui.AbstractGestureMotionEventHandler
    protected final boolean p(SoftKeyView softKeyView) {
        iay e;
        int i;
        return softKeyView.c(iah.DOWN) == null && (e = softKeyView.e()) != null && e.d == iax.DECODE && (i = e.c) >= 9 && i <= 16;
    }
}
