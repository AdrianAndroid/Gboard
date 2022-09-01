package com.google.android.apps.inputmethod.libs.hmm;

import android.content.Context;
import android.text.TextUtils;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.EditorInfo;
import com.google.android.libraries.inputmethod.ime.AbstractIme;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class AbstractHmmIme extends AbstractIme implements dji, hna, dig, hli {
    protected final hlj a;
    protected volatile djh b;
    protected boolean c;
    private Iterator d;

    public AbstractHmmIme(Context context, iav iavVar, hls hlsVar) {
        super(context, iavVar, hlsVar);
        b().B(this);
        this.a = new hlj(this, hlsVar);
    }

    private final void q() {
        gvt.a(this.b);
        this.b = null;
    }

    @Override // defpackage.dji
    public final void H(int i, int i2) {
    }

    @Override // defpackage.dig
    public final void K() {
    }

    @Override // defpackage.dji
    public final long ae(String[] strArr) {
        return 0L;
    }

    @Override // defpackage.dji
    public final String ag(String str) {
        return str;
    }

    protected abstract dij b();

    protected abstract djh c();

    @Override // com.google.android.libraries.inputmethod.ime.AbstractIme, java.lang.AutoCloseable
    public final void close() {
        q();
    }

    @Override // defpackage.hli
    public final void d() {
        if (!this.a.g && this.d != null) {
            this.d = null;
        }
        if (!TextUtils.isEmpty(null)) {
            this.E.hV(null, false, 1);
        }
        boolean z = this.c;
        boolean z2 = !TextUtils.isEmpty("");
        this.c = z2;
        if (z2 || z) {
            this.E.g("", 1);
        }
        g();
    }

    @Override // defpackage.dji
    public final djf f() {
        return null;
    }

    protected final void g() {
        if (this.b != null) {
            this.b.t();
        }
        this.c = false;
        this.d = null;
    }

    @Override // com.google.android.libraries.inputmethod.ime.AbstractIme, defpackage.hlp
    public final void gT(CompletionInfo[] completionInfoArr) {
        if ((!this.H || !this.J) && !this.P) {
            return;
        }
        this.a.i(completionInfoArr);
    }

    @Override // defpackage.hlp
    public final void gX() {
        if (m()) {
            V().e(dja.COMPOSING_ABORTED, new Object[0]);
        }
        g();
    }

    @Override // com.google.android.libraries.inputmethod.ime.AbstractIme, defpackage.hlp
    public final void i(EditorInfo editorInfo, boolean z) {
        super.i(editorInfo, z);
        q();
        this.b = c();
        if (this.b != null) {
            this.b.w(this);
        }
        this.a.h(editorInfo);
    }

    @Override // com.google.android.libraries.inputmethod.ime.AbstractIme, defpackage.hlp
    public final void j() {
        super.j();
        this.a.d();
        q();
        b().D(this);
    }

    @Override // defpackage.hli
    public final void k() {
        Iterator it = null;
        if (m()) {
            if (this.b != null) {
                it = this.b.f();
            }
            this.d = it;
            this.E.hY(true);
            return;
        }
        this.d = null;
        this.E.hY(false);
    }

    @Override // defpackage.hna
    public final boolean m() {
        return this.b != null && this.b.E();
    }

    @Override // defpackage.hna
    public final boolean n(hfd hfdVar, hfd hfdVar2) {
        int i = hfdVar.b[0].c;
        int i2 = hfdVar2.b[0].c;
        if (i == -10028) {
            return i2 == -10028 || i2 == -10029;
        }
        return false;
    }

    @Override // defpackage.hna
    public final boolean o(hfd hfdVar) {
        iay iayVar = hfdVar.b[0];
        int i = iayVar.c;
        return iayVar.e != null || i == -10064 || i == 67 || i == 62 || i == 66;
    }

    @Override // defpackage.hlp
    public final void w(int i) {
        hlj hljVar = this.a;
        if (hljVar.g) {
            hljVar.j(i);
            return;
        }
        ArrayList A = lre.A();
        hln hlnVar = null;
        if (this.d != null) {
            while (A.size() < i && this.d.hasNext()) {
                hln next = ((diw) this.d).next();
                A.add(next);
                if (next.e == hlm.APP_COMPLETION) {
                    if (hlnVar == null && jdg.W(this.a.h, next)) {
                        hlnVar = next;
                    }
                } else {
                    if (hlnVar == null && next.e == hlm.RAW) {
                        hlnVar = next;
                    }
                    if (hlnVar == null && this.b != null && this.b.E() && this.b.D(next)) {
                        hlnVar = next;
                    }
                }
            }
            this.E.l(A, hlnVar, this.d.hasNext());
            return;
        }
        this.E.l(A, null, false);
    }

    @Override // defpackage.dji
    public final String x(String str) {
        return str;
    }

    @Override // defpackage.dji
    public final String y(String str, String[] strArr) {
        return str;
    }
}
