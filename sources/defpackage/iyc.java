package defpackage;

import android.content.Context;
import android.util.Printer;
import android.view.inputmethod.EditorInfo;
import java.util.Map;

/* compiled from: PG */
/* renamed from: iyc  reason: default package */
/* loaded from: classes.dex */
public final class iyc implements iyb {
    private final idk a = ieh.j();
    private long b;

    private final void d(ids idsVar, long j) {
        long j2 = this.b;
        if (j2 > 0) {
            long j3 = j - j2;
            if (j3 <= 0) {
                return;
            }
            this.a.g(idsVar, j3);
        }
    }

    private final void f() {
        this.b = 0L;
    }

    @Override // defpackage.hfh
    public final boolean c(hfd hfdVar) {
        if (hfdVar.p != 1) {
            if (hfdVar.d != 0) {
                f();
            }
            return false;
        }
        iay[] iayVarArr = hfdVar.b;
        if (iayVarArr != null && iayVarArr.length > 0) {
            if (iayVarArr[0].c != -10002 || hfdVar.i <= 0) {
                if (hfdVar.d != 0 && hfdVar.i > 0) {
                    d(iyd.TYPING_INTERVAL, hfdVar.i);
                    this.b = hfdVar.i;
                }
            } else {
                d(iyd.SELECT_CANDIDATE_INTERVAL, hfdVar.i);
                this.b = 0L;
            }
        }
        return false;
    }

    @Override // defpackage.gzv
    public final /* synthetic */ void dump(Printer printer, boolean z) {
    }

    @Override // defpackage.hfx
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.gzv
    public final /* synthetic */ String getDumpableTag() {
        return hqs.i(this);
    }

    @Override // defpackage.ifw
    public final void gm(Context context, igg iggVar) {
        f();
    }

    @Override // defpackage.ifw
    public final void gn() {
    }

    @Override // defpackage.hfx
    public final /* synthetic */ void h(ibz ibzVar) {
    }

    @Override // defpackage.hfx
    public final void i() {
    }

    @Override // defpackage.hfx
    public final /* synthetic */ void j(EditorInfo editorInfo, boolean z) {
    }

    @Override // defpackage.hfx
    public final /* synthetic */ void k(hfy hfyVar) {
    }

    @Override // defpackage.hfx
    public final boolean n(hqt hqtVar, EditorInfo editorInfo, boolean z, Map map, hfl hflVar) {
        f();
        return true;
    }

    @Override // defpackage.hfx
    public final boolean o() {
        return true;
    }

    @Override // defpackage.hfx
    public final /* synthetic */ boolean p() {
        return false;
    }

    @Override // defpackage.hfx
    public final /* synthetic */ void q() {
    }
}
