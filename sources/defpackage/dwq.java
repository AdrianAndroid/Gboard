package defpackage;

import android.content.Context;
import android.view.View;

/* compiled from: PG */
/* renamed from: dwq  reason: default package */
/* loaded from: classes.dex */
public final class dwq extends dvk {
    public final Context a;
    public dwj b;
    public View c;
    private final hky d;
    private hlf e;
    private Runnable f;

    public dwq(Context context, hky hkyVar) {
        this.a = context;
        this.d = hkyVar;
    }

    public final void a() {
        Runnable runnable = this.f;
        this.b = null;
        this.f = null;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // defpackage.dwk
    public final void j() {
        hlf hlfVar;
        if (this.b == null || (hlfVar = this.e) == null) {
            return;
        }
        hkp.b(hlfVar.a, true);
        a();
    }

    @Override // defpackage.dwk
    public final boolean k(dwj dwjVar, Runnable runnable) {
        if (dwjVar == this.b) {
            return true;
        }
        j();
        this.b = dwjVar;
        this.f = runnable;
        hky hkyVar = this.d;
        hkyVar.s(dwjVar.a());
        hkyVar.m(((Long) dwjVar.b().map(dwn.a).orElse(0L)).longValue());
        hkyVar.a = new cfs(this, 2);
        hkyVar.j = new dvd(this, 8);
        hkyVar.k = new dwo(this, 0);
        hkyVar.i = new dys(this, 1);
        hlf a = hkyVar.a();
        this.e = a;
        hkq.b(a);
        return true;
    }
}
