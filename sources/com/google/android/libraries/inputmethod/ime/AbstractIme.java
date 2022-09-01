package com.google.android.libraries.inputmethod.ime;

import android.content.Context;
import android.content.res.Resources;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.EditorInfo;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class AbstractIme implements hlp {
    private static final lug a = hin.a;
    public final ifn C;
    public final Context D;
    public final hls E;
    public final iav F;
    public final ino G;
    public final boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    private boolean b;

    public AbstractIme(Context context, iav iavVar, hls hlsVar) {
        this(context, iavVar, hlsVar, null);
    }

    @Override // defpackage.hlp
    public boolean I() {
        return false;
    }

    protected boolean J(EditorInfo editorInfo) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean L(EditorInfo editorInfo) {
        return !this.I && irs.d() && ham.ao(editorInfo);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean N(EditorInfo editorInfo) {
        return ham.at(editorInfo);
    }

    protected boolean O(boolean z) {
        return false;
    }

    protected boolean P(boolean z) {
        return false;
    }

    protected boolean Q(boolean z) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final idk V() {
        return this.E.hO();
    }

    @Override // defpackage.hlp
    public void W(int i) {
    }

    @Override // defpackage.hlp
    public final boolean X() {
        return this.F.k;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void Y(iay iayVar) {
        hls hlsVar = this.E;
        hfd d = hfd.d(iayVar);
        d.g = 0;
        hlsVar.O(d);
    }

    @Override // defpackage.hlp
    public void a(long j, long j2) {
        this.P = (137438953472L & j2) != 0;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
    }

    @Override // defpackage.hlp
    public void gS(hln hlnVar) {
    }

    @Override // defpackage.hlp
    public void gT(CompletionInfo[] completionInfoArr) {
    }

    @Override // defpackage.hlp
    public void gU(hln hlnVar, int i) {
    }

    @Override // defpackage.hlp
    public void gV(hln hlnVar, boolean z) {
    }

    @Override // defpackage.hlp
    public void gY(hln hlnVar, boolean z) {
    }

    protected boolean gZ(EditorInfo editorInfo) {
        return ham.am(editorInfo);
    }

    @Override // defpackage.hlp
    public int gg() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.hlp
    public void i(EditorInfo editorInfo, boolean z) {
        ((luc) ((luc) a.b()).k("com/google/android/libraries/inputmethod/ime/AbstractIme", "onActivate", 86, "AbstractIme.java")).K("%s.onActivate() : EditorInfo = %s, IncognitoMode = %b, DeviceLocked = %s", getClass().getSimpleName(), ham.l(editorInfo), Boolean.valueOf(z), Boolean.valueOf(!irs.d()));
        this.I = z;
        this.J = N(editorInfo);
        boolean J = J(editorInfo);
        this.b = J;
        this.K = Q(J);
        this.L = P(this.b);
        this.M = O(this.b);
        this.N = L(editorInfo);
        this.O = gZ(editorInfo);
    }

    @Override // defpackage.hlp
    public void j() {
        ((luc) ((luc) a.b()).k("com/google/android/libraries/inputmethod/ime/AbstractIme", "onDeactivate", 207, "AbstractIme.java")).w("%s.onDeactivate()", getClass().getSimpleName());
        if (((Boolean) ifn.e.c()).booleanValue()) {
            ifn ifnVar = this.C;
            ifnVar.q.set(0);
            ifnVar.f.set(0);
            ifnVar.g.set(0);
            ifnVar.h.set(0);
            ifnVar.i.set(0);
            ifnVar.s.set(0);
            ifnVar.j.set(0);
            ifnVar.k.set(0);
            ifnVar.l.set(0);
            ifnVar.m.set(0);
            ifnVar.r.set(0);
            ifnVar.t.set(0);
            ifnVar.v = 0L;
            ifnVar.w = false;
            ifnVar.u.set(0);
        }
    }

    @Override // defpackage.hlp
    public void l(ibz ibzVar, boolean z) {
    }

    @Override // defpackage.hlp
    public void p(hqe hqeVar, int i, int i2, int i3, int i4) {
        int i5 = i2 + i3 + i;
        if (hqeVar == hqe.IME || i5 <= 0) {
            return;
        }
        this.E.hW();
        gX();
    }

    public AbstractIme(Context context, iav iavVar, hls hlsVar, byte[] bArr) {
        ifn ifnVar;
        int i;
        int i2;
        this.D = context;
        this.F = iavVar;
        this.E = hlsVar;
        this.G = ino.M(context);
        this.H = iavVar.q.d(R.id.f54870_resource_name_obfuscated_res_0x7f0b01cf, false);
        Resources resources = context.getResources();
        if (resources != null) {
            ifnVar = new ifn(resources.getInteger(R.integer.f132880_resource_name_obfuscated_res_0x7f0c0142), resources.getInteger(R.integer.f132890_resource_name_obfuscated_res_0x7f0c0143), resources.getInteger(R.integer.f132900_resource_name_obfuscated_res_0x7f0c0144), context);
        } else {
            ifnVar = new ifn(0, 0, 0, context);
        }
        this.C = ifnVar;
        int i3 = ifnVar.n;
        if (i3 <= 0 || (i = ifnVar.o) <= 0 || (i2 = ifnVar.p) <= 0 || i3 >= i || i >= i2) {
            ((ltd) ifn.a.a(hip.a).k("com/google/android/libraries/inputmethod/metricstracker/TypingMetricsTracker", "initialize", 167, "TypingMetricsTracker.java")).J("Invalid threshold: %s, %s, %s", Integer.valueOf(ifnVar.n), Integer.valueOf(ifnVar.o), Integer.valueOf(ifnVar.p));
            return;
        }
        if (!ifnVar.y.al("pref_key_disable_typing_slowness_report_by_user", false, false)) {
            hhq.p(ifnVar, ifn.b, ifn.c);
            ifnVar.y.Y(ifnVar, "pref_key_disable_typing_slowness_report_by_user");
        }
        ifnVar.e();
    }
}
