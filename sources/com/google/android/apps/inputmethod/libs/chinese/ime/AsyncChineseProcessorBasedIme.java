package com.google.android.apps.inputmethod.libs.chinese.ime;

import android.content.Context;
import com.google.android.libraries.inputmethod.ime.processor.AsyncProcessorBasedIme;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AsyncChineseProcessorBasedIme extends AsyncProcessorBasedIme {
    private boolean a;

    public AsyncChineseProcessorBasedIme(Context context, iav iavVar, hls hlsVar) {
        super(context, iavVar, hlsVar);
    }

    @Override // com.google.android.libraries.inputmethod.ime.async.AbstractAsyncIme, com.google.android.libraries.inputmethod.ime.AbstractIme, defpackage.hlp
    public final void a(long j, long j2) {
        if (this.a) {
            return;
        }
        this.a = true;
        if ((j ^ j2) != 1 || (j2 & 1) == 0 || !g()) {
            super.a(j, j2);
        } else {
            this.E.y(1L, false);
        }
        this.a = false;
    }
}
