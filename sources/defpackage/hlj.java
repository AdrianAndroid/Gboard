package defpackage;

import android.os.Handler;
import android.os.SystemClock;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.EditorInfo;
import j$.util.Objects;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: hlj  reason: default package */
/* loaded from: classes.dex */
public class hlj {
    private static final hhl a = hhq.h("app_completion_attribution", "");
    private boolean d;
    public final hli e;
    protected final hls f;
    public boolean g;
    public hln h;
    public CompletionInfo[] i;
    public hlh j;
    public String k;
    public long l;
    public long m;
    public int n;
    public boolean o;
    private final Handler b = new Handler();
    private final Runnable c = new gxd(this, 9);
    private final iqe p = iqe.e(a, 3);

    public hlj(hli hliVar, hls hlsVar) {
        this.e = hliVar;
        this.f = hlsVar;
    }

    private final void a() {
        this.g = false;
        this.h = null;
        this.b.removeCallbacks(this.c);
        this.d = false;
        this.j = null;
        this.i = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(hln hlnVar) {
        this.f.hX(Integer.MAX_VALUE, Integer.MAX_VALUE, hlnVar.a, false);
    }

    public void d() {
        a();
        this.k = null;
    }

    public boolean f() {
        return false;
    }

    public final void g(hln hlnVar) {
        b(hlnVar);
        this.e.d();
    }

    public final void h(EditorInfo editorInfo) {
        a();
        String m = ham.m(editorInfo);
        if (true != this.p.j(m)) {
            m = null;
        }
        this.k = m;
        this.l = SystemClock.elapsedRealtime();
        this.n = 0;
        l();
    }

    public final void i(CompletionInfo[] completionInfoArr) {
        this.i = completionInfoArr;
        this.h = null;
        this.g = completionInfoArr != null && completionInfoArr.length > 0;
        this.m = SystemClock.elapsedRealtime() - this.l;
        if (this.g) {
            this.b.removeCallbacks(this.c);
            this.d = false;
            k(new hlh(completionInfoArr, this.k, this.o, this.n, this.m, f()));
        } else if (this.d) {
        } else {
            this.b.postDelayed(this.c, 1000L);
            this.d = true;
        }
    }

    public final void j(int i) {
        ArrayList A = lre.A();
        hlh hlhVar = this.j;
        hln hlnVar = null;
        if (hlhVar != null) {
            while (A.size() < i && hlhVar.hasNext()) {
                hln next = hlhVar.next();
                if (next != null) {
                    A.add(next);
                    if (hlnVar == null && Objects.equals(this.h, next)) {
                        hlnVar = next;
                    }
                }
            }
            this.f.l(A, hlnVar, hlhVar.hasNext());
            return;
        }
        this.f.l(A, null, false);
    }

    public final void k(hlh hlhVar) {
        if (this.j != hlhVar) {
            this.j = hlhVar;
            this.f.hY(hlhVar.hasNext());
        }
    }

    public final void l() {
        boolean z = true;
        hqk hT = this.f.hT(1, 1, 0);
        if (hT != null && hT.b.length() != 0) {
            z = false;
        }
        this.o = z;
    }

    public final void m() {
        if (this.g) {
            this.b.removeCallbacks(this.c);
            this.b.postDelayed(this.c, 1000L);
            this.d = true;
        }
    }
}
