package com.google.android.apps.inputmethod.libs.pinyin;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public class PinyinKeyboardLayoutHandler extends AbstractPinyinKeyboardLayoutHandler {
    public PinyinKeyboardLayoutHandler(Context context, igy igyVar) {
        super(context, igyVar);
    }

    @Override // com.google.android.apps.inputmethod.libs.gestureui.AbstractKeyboardLayoutHandler
    public final dfq a(ibi ibiVar) {
        return new dxy(ibiVar, this.c);
    }
}
