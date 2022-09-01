package com.google.android.libraries.inputmethod.ime.processor;

import android.content.Context;
import android.view.inputmethod.EditorInfo;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public class BaseDecodeProcessor implements hnj, hnh, hnk, hni {
    protected Context o;
    protected iav p;
    protected hlr q;
    protected ino r;
    protected idk s;
    protected ifn t;
    public gwv u;

    /* JADX INFO: Access modifiers changed from: protected */
    public void I(hfd hfdVar) {
    }

    protected void J(ibz ibzVar, boolean z) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void M(hqe hqeVar, int i, int i2, int i3) {
        int i4 = i2 + i3 + i;
        if (hqeVar == hqe.IME || i4 <= 0) {
            return;
        }
        gwv gwvVar = this.u;
        if (gwvVar != null) {
            gwvVar.b(hnl.g(this));
        }
        ai();
    }

    protected boolean T(hln hlnVar) {
        return false;
    }

    protected boolean U(hln hlnVar, boolean z) {
        return false;
    }

    protected boolean V(hln hlnVar, boolean z) {
        return false;
    }

    protected void ac(long j) {
    }

    @Override // defpackage.hnj
    public void ad(Context context, gwv gwvVar, iav iavVar) {
        this.o = context;
        this.u = gwvVar;
        this.p = iavVar;
        this.r = ino.M(context);
    }

    protected void ai() {
    }

    public boolean ao() {
        return false;
    }

    protected boolean ap(int i) {
        return false;
    }

    protected boolean aq(boolean z) {
        return false;
    }

    @Override // defpackage.hnj
    public boolean ar(hfd hfdVar) {
        return false;
    }

    protected void at() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void au(long j, boolean z) {
        gwv gwvVar = this.u;
        if (gwvVar != null) {
            hnl i = hnl.i(15, this);
            i.w = j;
            i.x = z;
            gwvVar.b(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void av(boolean z) {
        gwv gwvVar = this.u;
        if (gwvVar != null) {
            gwvVar.b(hnl.h(z, this));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void aw(CharSequence charSequence, int i) {
        gwv gwvVar = this.u;
        if (gwvVar != null) {
            gwvVar.b(hnl.j(charSequence, i, this));
        }
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
    }

    @Override // defpackage.hnh
    public final void fl(hlr hlrVar) {
        this.q = hlrVar;
    }

    @Override // defpackage.hnk
    public final void fm(hlt hltVar) {
        this.s = hltVar.hO();
    }

    @Override // defpackage.hnk
    public final void fn(ifn ifnVar) {
        this.t = ifnVar;
    }

    protected void l(EditorInfo editorInfo, boolean z) {
    }

    protected void m() {
    }

    protected void n() {
    }

    protected boolean p(hfd hfdVar) {
        return false;
    }

    @Override // defpackage.hnj
    public final boolean fo(hnl hnlVar) {
        int i = hnlVar.A;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        switch (i2) {
            case 1:
                l(hnlVar.b, hnlVar.c);
                return false;
            case 2:
                J(hnlVar.d, hnlVar.e);
                return false;
            case 3:
                return p(hnlVar.j);
            case 4:
            case 6:
            case 8:
            case 10:
            case 11:
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
            case 17:
            case 19:
            case 21:
            case 22:
            default:
                return false;
            case 5:
                return aq(hnlVar.r);
            case 7:
                return ap(hnlVar.m);
            case 9:
                return U(hnlVar.k, hnlVar.l);
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return V(hnlVar.k, hnlVar.l);
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                I(hnlVar.j);
                return true;
            case 15:
                ac(hnlVar.n);
                return false;
            case 16:
                M(hnlVar.f, hnlVar.g, hnlVar.h, hnlVar.i);
                return false;
            case 18:
                ai();
                return true;
            case 20:
                return T(hnlVar.k);
            case 23:
                m();
                return false;
            case 24:
                n();
                return false;
            case 25:
                at();
                return false;
        }
    }
}
