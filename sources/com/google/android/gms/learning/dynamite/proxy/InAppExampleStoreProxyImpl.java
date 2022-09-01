package com.google.android.gms.learning.dynamite.proxy;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class InAppExampleStoreProxyImpl extends fzw {
    public Context a;
    public fzu b;
    public lgh e;
    private jnk f;
    private fwo g;
    private fwe h;
    public final Object c = new Object();
    public final List d = new ArrayList();
    private final IBinder i = new fxu(this);

    private final void c(job jobVar, String str) {
        fwo fwoVar = this.g;
        nfh t = mfx.h.t();
        nfh t2 = mfz.c.t();
        nfh t3 = mgb.c.t();
        if (t3.c) {
            t3.cD();
            t3.c = false;
        }
        mgb mgbVar = (mgb) t3.b;
        str.getClass();
        mgbVar.a |= 1;
        mgbVar.b = str;
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        mfz mfzVar = (mfz) t2.b;
        mgb mgbVar2 = (mgb) t3.cz();
        mgbVar2.getClass();
        mfzVar.b = mgbVar2;
        mfzVar.a |= 1;
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mfx mfxVar = (mfx) t.b;
        mfz mfzVar2 = (mfz) t2.cz();
        mfzVar2.getClass();
        mfxVar.f = mfzVar2;
        mfxVar.a |= 4096;
        this.g.i(8, fwoVar.a((mfx) t.cz()), jobVar.a());
        this.g.b();
    }

    public final void b(job jobVar, String str) {
        this.g.e(jobVar);
        if (this.h.aF()) {
            c(jobVar, str);
        }
    }

    @Override // defpackage.fzx
    public void init(ftm ftmVar, fzu fzuVar) {
        Context context = (Context) ftl.c(ftmVar);
        this.a = context;
        this.b = fzuVar;
        kju.f(context);
        fxf.a();
        jnk b = jnk.b(this.a.getApplicationContext());
        this.f = b;
        this.g = (fwo) b.c(fwo.class);
        this.h = (fwe) this.f.c(fwe.class);
        this.e = ldt.a;
    }

    @Override // defpackage.fzx
    public IBinder onBind(Intent intent) {
        return this.i;
    }

    @Override // defpackage.fzx
    public void onDestroy() {
        synchronized (this.c) {
            if (!this.d.isEmpty()) {
                int size = this.d.size();
                Log.w("brella.InAppExStPrxImpl", size + " orphaned iterators, cleaning them up");
                this.g.e(job.IN_APP_EXAMPLE_STORE_PROXY_ORPHANED_ITERATOR);
                if (this.h.aF()) {
                    for (fxl fxlVar : this.d) {
                        c(job.IN_APP_EXAMPLE_STORE_PROXY_ORPHANED_ITERATOR, fxlVar.a);
                    }
                }
            }
            while (!this.d.isEmpty()) {
                ((fxl) this.d.get(0)).b();
            }
        }
        this.g.d(jnx.IN_APP_EXAMPLE_STORE_PROXY_DESTROY);
        jnk jnkVar = this.f;
        if (jnkVar != null) {
            jnkVar.close();
            this.f = null;
        }
    }

    @Override // defpackage.fzx
    public void onRebind(Intent intent) {
    }

    @Override // defpackage.fzx
    public void onTrimMemory(int i) {
    }

    @Override // defpackage.fzx
    public boolean onUnbind(Intent intent) {
        return false;
    }
}
