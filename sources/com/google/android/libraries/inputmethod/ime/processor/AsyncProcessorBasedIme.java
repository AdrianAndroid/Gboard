package com.google.android.libraries.inputmethod.ime.processor;

import android.content.Context;
import com.google.android.libraries.inputmethod.ime.async.AbstractAsyncIme;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AsyncProcessorBasedIme extends AbstractAsyncIme {
    private ProcessorBasedIme a;

    public AsyncProcessorBasedIme(Context context, iav iavVar, hls hlsVar) {
        super(context, iavVar, hlsVar);
    }

    @Override // com.google.android.libraries.inputmethod.ime.async.AbstractAsyncIme
    public final hlp b(Context context, iav iavVar, hls hlsVar) {
        if (this.a == null) {
            this.a = new ProcessorBasedIme(context, iavVar, hlsVar);
        }
        return this.a;
    }

    @Override // com.google.android.libraries.inputmethod.ime.async.AbstractAsyncIme
    public final hna c() {
        return this.a;
    }
}
