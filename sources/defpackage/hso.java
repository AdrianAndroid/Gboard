package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.IBinder;
import android.util.Printer;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodSubtype;

/* compiled from: PG */
/* renamed from: hso  reason: default package */
/* loaded from: classes.dex */
public final class hso implements AutoCloseable, hsk {
    public volatile hsk a;
    private final hsw b;

    public hso() {
        hsm hsmVar = new hsm(this);
        this.b = hsmVar;
        hsmVar.e(mjl.a);
    }

    @Override // defpackage.hsk
    public final Context C() {
        hsk hskVar = this.a;
        if (hskVar != null) {
            return (Context) hskVar;
        }
        throw new IllegalStateException("No context when service is unavailable");
    }

    @Override // defpackage.hsk
    public final /* synthetic */ Context D() {
        throw null;
    }

    @Override // defpackage.hsk
    public final Configuration E() {
        throw null;
    }

    @Override // defpackage.hsk, defpackage.hfq
    public final IBinder F() {
        throw null;
    }

    @Override // defpackage.hsk, defpackage.hoy, defpackage.hfq
    public final View G() {
        throw null;
    }

    @Override // defpackage.hsk
    public final View H() {
        hsk hskVar = this.a;
        if (hskVar == null) {
            return null;
        }
        return hskVar.H();
    }

    @Override // defpackage.hsk
    public final View I() {
        throw null;
    }

    @Override // defpackage.hsk
    public final ViewGroup L(ice iceVar) {
        throw null;
    }

    @Override // defpackage.hsk, defpackage.hfq
    public final EditorInfo M() {
        throw null;
    }

    @Override // defpackage.hsk, defpackage.hoy, defpackage.hfq
    public final EditorInfo N() {
        hsk hskVar = this.a;
        return hskVar == null ? ham.a : hskVar.N();
    }

    @Override // defpackage.hsk, defpackage.hoy, defpackage.hfq
    public final gqc O() {
        hsk hskVar = this.a;
        return hskVar == null ? gqc.b : hskVar.O();
    }

    @Override // defpackage.hsk
    public final /* synthetic */ hox P() {
        throw null;
    }

    @Override // defpackage.hsk
    public final hpl Q() {
        throw null;
    }

    @Override // defpackage.hsk, defpackage.hoy, defpackage.hvo
    public final htc U() {
        throw null;
    }

    @Override // defpackage.hsk, defpackage.hoy, defpackage.hfq
    public final hww V() {
        hsk hskVar = this.a;
        return hskVar == null ? hww.a : hskVar.V();
    }

    public final boolean a(hfd hfdVar) {
        hsk hskVar = this.a;
        if (hskVar == null) {
            return false;
        }
        hskVar.at(hfdVar);
        return true;
    }

    @Override // defpackage.inf, defpackage.hoy
    public final void aC(ins insVar) {
        throw null;
    }

    @Override // defpackage.inf
    public final void aE() {
        throw null;
    }

    @Override // defpackage.gzb
    public final /* synthetic */ void aM(gza gzaVar) {
        throw null;
    }

    @Override // defpackage.gzb
    public final /* synthetic */ void aO(gza gzaVar) {
    }

    @Override // defpackage.hsk
    public final /* synthetic */ void aP(ibz ibzVar, hov hovVar) {
    }

    @Override // defpackage.hsk, defpackage.hoy, defpackage.hfq
    public final imn aa() {
        hsk hskVar = this.a;
        if (hskVar == null) {
            return null;
        }
        return hskVar.aa();
    }

    @Override // defpackage.gzb
    public final /* synthetic */ void af(gza gzaVar) {
        throw null;
    }

    @Override // defpackage.hsk, defpackage.hfq
    public final void an(CharSequence charSequence) {
        throw null;
    }

    @Override // defpackage.hsk, defpackage.hfq
    public final void aq() {
        throw null;
    }

    @Override // defpackage.hsk, defpackage.hoy, defpackage.hfq
    public final void at(hfd hfdVar) {
        hsk hskVar = this.a;
        if (hskVar != null) {
            hskVar.at(hfdVar);
        }
    }

    @Override // defpackage.hsk
    public final /* synthetic */ void au(Printer printer, boolean z) {
    }

    @Override // defpackage.hsk, defpackage.hfq
    public final void av() {
        throw null;
    }

    @Override // defpackage.hsk, defpackage.hoy
    public final void az() {
        throw null;
    }

    @Override // defpackage.hsk
    public final boolean bR(aqq aqqVar) {
        throw null;
    }

    @Override // defpackage.hsk
    public final void bS(opu opuVar) {
        throw null;
    }

    @Override // defpackage.hsk
    public final void bb(hwp hwpVar) {
        throw null;
    }

    @Override // defpackage.hsk
    public final void be(boolean z, ice iceVar) {
        hsk hskVar = this.a;
        if (hskVar != null) {
            hskVar.be(z, iceVar);
        }
    }

    @Override // defpackage.hsk
    public final void bf(gzr gzrVar) {
        hsk hskVar = this.a;
        if (hskVar != null) {
            hskVar.bf(gzrVar);
        }
    }

    @Override // defpackage.hsk
    public final void bh(hsl hslVar) {
        throw null;
    }

    @Override // defpackage.hsk
    public final /* synthetic */ void bk() {
    }

    @Override // defpackage.hsk, defpackage.hfq
    public final void br(hpu hpuVar, boolean z) {
        hsk hskVar = this.a;
        if (hskVar != null) {
            hskVar.br(hpuVar, false);
        }
    }

    @Override // defpackage.hsk
    public final boolean bv() {
        throw null;
    }

    @Override // defpackage.hsk
    public final /* synthetic */ boolean by() {
        throw null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.b.f();
        this.a = null;
    }

    @Override // defpackage.hsk
    public final Context getApplicationContext() {
        hsk hskVar = this.a;
        return hskVar != null ? hskVar.getApplicationContext() : guw.a();
    }

    @Override // defpackage.hsk
    public final Dialog getWindow() {
        throw null;
    }

    @Override // defpackage.hsk
    public final boolean isFullscreenMode() {
        hsk hskVar = this.a;
        return hskVar != null && hskVar.isFullscreenMode();
    }

    @Override // defpackage.hsk
    public final void onDisplayCompletions(CompletionInfo[] completionInfoArr) {
        throw null;
    }

    @Override // defpackage.hsk
    public final void switchInputMethod(String str) {
        throw null;
    }

    @Override // defpackage.hsk
    public final void switchInputMethod(String str, InputMethodSubtype inputMethodSubtype) {
        throw null;
    }

    @Override // defpackage.hsk, defpackage.hoy, defpackage.hfq
    public final int y() {
        hsk hskVar = this.a;
        return hskVar != null ? hskVar.y() : hyq.f();
    }
}
