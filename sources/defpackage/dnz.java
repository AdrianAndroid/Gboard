package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.view.inputmethod.EditorInfo;

/* compiled from: PG */
/* renamed from: dnz  reason: default package */
/* loaded from: classes.dex */
public final class dnz extends hlj {
    public static final hhl a = hhq.h("app_completion_whitelist", "");
    public static final hhl b = hhq.h("app_completion_commit_completion_whitelist", "");
    public static final hhl c = hhq.h("scrollable_suggestions_app_whitelist", "");
    public boolean d;
    private final iqe p = iqe.e(b, 3);
    private final iqe q = iqe.e(a, 3);
    private final iqe r = iqe.e(c, 3);
    private boolean s;
    private boolean t;
    private final Context u;
    private int v;
    private int w;
    private int x;
    private int y;

    public dnz(Context context, hli hliVar, hls hlsVar) {
        super(hliVar, hlsVar);
        this.u = context;
    }

    public final void a(EditorInfo editorInfo) {
        super.h(editorInfo);
        boolean G = ham.G(editorInfo);
        boolean z = true;
        this.d = !G && ham.z(this.q, editorInfo);
        this.s = !G && ham.z(this.p, editorInfo);
        if (ham.m(editorInfo) == null || !this.r.j(ham.m(editorInfo)) || gqa.a(this.u).g) {
            z = false;
        }
        this.t = z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.hlj
    public final void b(hln hlnVar) {
        if (!this.d) {
            return;
        }
        if (!this.s) {
            super.b(hlnVar);
            return;
        }
        Object obj = hlnVar.j;
        if (!(obj instanceof hlg)) {
            return;
        }
        this.f.hU(((hlg) obj).a);
    }

    public final void c(hfd hfdVar) {
        hln hlnVar;
        if (this.g) {
            int i = hfdVar.b[0].c;
            if ((i != 62 && i != 23 && i != 66) || (hlnVar = this.h) == null) {
                return;
            }
            super.g(hlnVar);
            this.h = null;
        }
    }

    @Override // defpackage.hlj
    public final void d() {
        super.d();
        this.s = false;
        this.d = false;
        this.v = -1;
        this.x = -1;
        this.w = -1;
        this.y = -1;
    }

    public final void e(hqe hqeVar, int i, int i2, int i3, int i4) {
        this.l = SystemClock.elapsedRealtime();
        this.n = i2 + i3 + i;
        super.l();
        boolean z = true;
        if (this.v == i && this.w == i2 && this.x == i3 && this.y == i4) {
            z = false;
        }
        if (hqeVar != hqe.IME && z && this.g) {
            m();
        }
        this.v = i;
        this.w = i2;
        this.x = i3;
        this.y = i4;
    }

    @Override // defpackage.hlj
    public final boolean f() {
        return this.t && this.o;
    }
}
