package defpackage;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import java.util.List;

/* compiled from: PG */
/* renamed from: gyj  reason: default package */
/* loaded from: classes.dex */
public abstract class gyj implements ijs {
    private final ContentObserver c;
    public final Context d;
    public final lug e;
    protected final ino f;
    protected final ijt g;
    protected final Handler h;
    public volatile boolean j;
    public gyh k;
    private boolean m;
    public final List i = lre.A();
    private final inm l = new fdo(this, 5);
    private final Runnable n = new gyf(this);
    private final Uri a = f();
    private final boolean b = x();

    static {
        lug lugVar = hin.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public gyj(Context context, String str) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.h = handler;
        this.c = new gye(this, handler);
        this.e = lug.i(str);
        this.d = context;
        this.f = ino.M(context);
        this.g = ijt.e(context);
    }

    @Override // defpackage.ijs
    public final synchronized void a(String str, boolean z) {
        if (this.f.an(str, c())) {
            w(z);
        }
    }

    @Override // defpackage.ijs
    public final /* synthetic */ void b() {
    }

    public abstract int c();

    protected abstract Uri f();

    public abstract ido g();

    public abstract ids h();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void j();

    /* JADX INFO: Access modifiers changed from: protected */
    public synchronized void k(int i, int i2) {
    }

    protected abstract void l(boolean z);

    protected synchronized boolean n(Cursor cursor) {
        return true;
    }

    protected abstract String[] o();

    /* JADX WARN: Removed duplicated region for block: B:27:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public defpackage.gyi p(android.content.Context r17, java.util.List r18, defpackage.gxe r19) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gyj.p(android.content.Context, java.util.List, gxe):gyi");
    }

    public final void q() {
        int c = c();
        ijt ijtVar = this.g;
        if (ijtVar.d.containsKey(ijtVar.c.p(c))) {
            this.j = this.g.n(c);
            this.g.l(c, this);
        } else {
            this.j = this.f.aj(c);
            this.f.X(this.l, c);
        }
        v();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public synchronized void r() {
        ((luc) ((luc) this.e.b()).k("com/google/android/libraries/inputmethod/contentdata/AbstractContentDataManager", "onImportAborted", 409, "AbstractContentDataManager.java")).t("onImportAborted()");
    }

    public final synchronized void s(gyg gygVar) {
        if (gygVar == null) {
            return;
        }
        if (!this.i.contains(gygVar)) {
            this.i.add(gygVar);
            j();
        } else if (!y()) {
        } else {
            j();
        }
    }

    public final void t() {
        ((luc) ((luc) this.e.b()).k("com/google/android/libraries/inputmethod/contentdata/AbstractContentDataManager", "startImportContentTask", 235, "AbstractContentDataManager.java")).t("startImportContentTask()");
        gyc.b.hP(this.n);
    }

    public final synchronized void u(gyg gygVar) {
        this.i.remove(gygVar);
    }

    protected final void v() {
        if (!this.j) {
            if (!jbt.I(this.d, this.c)) {
                return;
            }
            this.m = false;
        } else if (this.m || !jbt.H(this.d, this.a, this.b, this.c)) {
        } else {
            this.m = true;
        }
    }

    public final void w(boolean z) {
        if (z != this.j) {
            this.j = z;
            v();
            l(this.j);
        }
    }

    protected boolean x() {
        return false;
    }

    protected synchronized boolean y() {
        return false;
    }
}
