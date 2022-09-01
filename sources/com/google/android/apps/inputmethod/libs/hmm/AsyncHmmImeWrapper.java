package com.google.android.apps.inputmethod.libs.hmm;

import android.content.Context;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.ime.async.AbstractAsyncIme;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AsyncHmmImeWrapper extends AbstractAsyncIme {
    protected AbstractHmmIme a;

    public AsyncHmmImeWrapper(Context context, iav iavVar, hls hlsVar) {
        super(context, iavVar, hlsVar);
    }

    @Override // com.google.android.libraries.inputmethod.ime.async.AbstractAsyncIme
    public final hlp b(Context context, iav iavVar, hls hlsVar) {
        CharSequence c = iavVar.q.c(R.id.f54780_resource_name_obfuscated_res_0x7f0b01c6, null);
        if (c == null) {
            return null;
        }
        AbstractHmmIme abstractHmmIme = (AbstractHmmIme) hqs.b(context, c.toString(), iavVar, hlsVar);
        this.a = abstractHmmIme;
        return abstractHmmIme;
    }

    @Override // com.google.android.libraries.inputmethod.ime.async.AbstractAsyncIme
    public final hna c() {
        return this.a;
    }
}
