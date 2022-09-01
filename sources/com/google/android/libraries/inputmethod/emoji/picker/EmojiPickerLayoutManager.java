package com.google.android.libraries.inputmethod.emoji.picker;

import android.support.v7.widget.GridLayoutManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public class EmojiPickerLayoutManager extends GridLayoutManager {
    public boolean G = true;

    public EmojiPickerLayoutManager(int i) {
        super(i, 1);
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.ly
    public final boolean ae() {
        return this.G && super.ae();
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.ly
    public final boolean af() {
        return this.G && super.af();
    }
}
