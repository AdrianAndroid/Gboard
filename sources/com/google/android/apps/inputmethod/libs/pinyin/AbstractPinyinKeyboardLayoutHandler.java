package com.google.android.apps.inputmethod.libs.pinyin;

import android.content.Context;
import com.google.android.apps.inputmethod.libs.gestureui.AbstractKeyboardLayoutHandler;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class AbstractPinyinKeyboardLayoutHandler extends AbstractKeyboardLayoutHandler {
    public long c = 0;

    public AbstractPinyinKeyboardLayoutHandler(Context context, igy igyVar) {
        super(context, igyVar);
    }

    @Override // com.google.android.libraries.inputmethod.motioneventhandler.AbstractMotionEventHandler, defpackage.igx
    public final void gP(long j, long j2) {
        long j3 = 0;
        if (((j ^ j2) & 288230376151711744L) == 0 || !c()) {
            return;
        }
        if ((j2 & 288230376151711744L) != 0) {
            j3 = 288230376151712256L;
        }
        this.c = j3;
        b();
    }
}
