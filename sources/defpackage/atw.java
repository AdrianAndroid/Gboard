package defpackage;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.File;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* renamed from: atw  reason: default package */
/* loaded from: classes.dex */
public class atw implements ComponentCallbacks2, bdj {
    private static final beu e;
    private static final beu f;
    private static final beu g = (beu) ((beu) beu.c(awt.b).J(atk.LOW)).S();
    protected final atb a;
    protected final Context b;
    final bdi c;
    public final CopyOnWriteArrayList d;
    private final bdq h;
    private final bdp i;
    private final bec j = new bec();
    private final Runnable k;
    private final bda l;
    private beu m;

    static {
        beu b = beu.b(Bitmap.class);
        b.V();
        e = b;
        beu b2 = beu.b(bck.class);
        b2.V();
        f = b2;
    }

    public atw(atb atbVar, bdi bdiVar, bdp bdpVar, Context context) {
        bda bdkVar;
        bdq bdqVar = new bdq();
        cz czVar = atbVar.f;
        att attVar = new att(this, 0);
        this.k = attVar;
        this.a = atbVar;
        this.c = bdiVar;
        this.i = bdpVar;
        this.h = bdqVar;
        this.b = context;
        Context applicationContext = context.getApplicationContext();
        atv atvVar = new atv(this, bdqVar);
        if (uv.a(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0) {
            bdkVar = new bdb(applicationContext, atvVar);
        } else {
            bdkVar = new bdk();
        }
        this.l = bdkVar;
        if (bgj.n()) {
            bgj.k(attVar);
        } else {
            bdiVar.a(this);
        }
        bdiVar.a(bdkVar);
        this.d = new CopyOnWriteArrayList(atbVar.b.c);
        r(atbVar.b.a());
        synchronized (atbVar.e) {
            if (atbVar.e.contains(this)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            atbVar.e.add(this);
        }
    }

    public ats a(Class cls) {
        return new ats(this.a, this, cls, this.b);
    }

    public ats b() {
        return a(Bitmap.class).n(e);
    }

    public ats c() {
        return a(Drawable.class);
    }

    public ats d() {
        return a(bck.class).n(f);
    }

    public ats e(Object obj) {
        return f().i(obj);
    }

    public ats f() {
        return a(File.class).n(g);
    }

    public ats g(Uri uri) {
        return c().f(uri);
    }

    public ats h(Integer num) {
        return c().h(num);
    }

    public ats i(Object obj) {
        return c().i(obj);
    }

    public ats j(String str) {
        return c().j(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized beu k() {
        return this.m;
    }

    public final void l(bfh bfhVar) {
        if (bfhVar == null) {
            return;
        }
        boolean t = t(bfhVar);
        bep d = bfhVar.d();
        if (t) {
            return;
        }
        atb atbVar = this.a;
        synchronized (atbVar.e) {
            for (atw atwVar : atbVar.e) {
                if (atwVar.t(bfhVar)) {
                    return;
                }
            }
            if (d == null) {
                return;
            }
            bfhVar.h(null);
            d.c();
        }
    }

    @Override // defpackage.bdj
    public final synchronized void m() {
        this.j.m();
        for (bfh bfhVar : bgj.h(this.j.a)) {
            l(bfhVar);
        }
        this.j.a.clear();
        bdq bdqVar = this.h;
        for (bep bepVar : bgj.h(bdqVar.a)) {
            bdqVar.a(bepVar);
        }
        bdqVar.b.clear();
        this.c.e(this);
        this.c.e(this.l);
        bgj.g().removeCallbacks(this.k);
        atb atbVar = this.a;
        synchronized (atbVar.e) {
            if (!atbVar.e.contains(this)) {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
            atbVar.e.remove(this);
        }
    }

    @Override // defpackage.bdj
    public final synchronized void n() {
        q();
        this.j.n();
    }

    @Override // defpackage.bdj
    public final synchronized void o() {
        p();
        this.j.o();
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
    }

    public final synchronized void p() {
        bdq bdqVar = this.h;
        bdqVar.c = true;
        for (bep bepVar : bgj.h(bdqVar.a)) {
            if (bepVar.n()) {
                bepVar.f();
                bdqVar.b.add(bepVar);
            }
        }
    }

    public final synchronized void q() {
        bdq bdqVar = this.h;
        bdqVar.c = false;
        for (bep bepVar : bgj.h(bdqVar.a)) {
            if (!bepVar.l() && !bepVar.n()) {
                bepVar.b();
            }
        }
        bdqVar.b.clear();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public synchronized void r(beu beuVar) {
        this.m = (beu) ((beu) beuVar.clone()).t();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void s(bfh bfhVar, bep bepVar) {
        this.j.a.add(bfhVar);
        bdq bdqVar = this.h;
        bdqVar.a.add(bepVar);
        if (!bdqVar.c) {
            bepVar.b();
            return;
        }
        bepVar.c();
        bdqVar.b.add(bepVar);
    }

    final synchronized boolean t(bfh bfhVar) {
        bep d = bfhVar.d();
        if (d == null) {
            return true;
        }
        if (!this.h.a(d)) {
            return false;
        }
        this.j.a.remove(bfhVar);
        bfhVar.h(null);
        return true;
    }

    public final synchronized String toString() {
        String obj;
        String valueOf;
        String valueOf2;
        obj = super.toString();
        valueOf = String.valueOf(this.h);
        valueOf2 = String.valueOf(this.i);
        return obj + "{tracker=" + valueOf + ", treeNode=" + valueOf2 + "}";
    }
}
