package com.google.android.libraries.inputmethod.cache.module;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class AutoDirectoryCleanerModule$DirectoryAutoCleanerTaskRunner implements isc {
    public final Context a;
    mko b;

    public AutoDirectoryCleanerModule$DirectoryAutoCleanerTaskRunner(Context context) {
        this.a = context;
    }

    @Override // defpackage.isc
    public final isb a(jls jlsVar) {
        mko mkoVar = this.b;
        if (mkoVar != null) {
            mkoVar.cancel(true);
        }
        this.b = null;
        return isb.FINISHED;
    }

    @Override // defpackage.isc
    public final mko b(jls jlsVar) {
        mko hQ = gxo.b(19).hQ(new evl(this, 10));
        this.b = hQ;
        return hQ;
    }
}
