package com.google.android.libraries.inputmethod.ime.processor;

import android.content.Context;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class AbstractAutoSpaceProcessor implements hnj, hnh, hnk {
    private ino a;
    private hlr b;
    private hlt c;
    private boolean d;
    private boolean e;
    private boolean f;
    private int g;
    private final StringBuilder h = new StringBuilder();
    private boolean i;
    private boolean j;
    private gwv k;

    private final void j() {
        this.i = false;
        this.j = false;
        this.h.setLength(0);
    }

    private final void k() {
        if (this.j) {
            j();
        }
    }

    private final void l() {
        if (this.i) {
            j();
        }
    }

    @Override // defpackage.hnj
    public void ad(Context context, gwv gwvVar, iav iavVar) {
        this.a = ino.M(context);
        this.k = gwvVar;
        boolean z = iavVar.h;
        this.d = z;
        this.e = iavVar.q.d(R.id.f54770_resource_name_obfuscated_res_0x7f0b01c5, !z);
    }

    @Override // defpackage.hnj
    public final boolean ar(hfd hfdVar) {
        return false;
    }

    protected abstract boolean b(int i);

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean c(EditorInfo editorInfo, ino inoVar) {
        return ham.Y(editorInfo) && ham.al(editorInfo);
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
    }

    protected abstract boolean d(int i);

    protected boolean e() {
        return this.e;
    }

    @Override // defpackage.hnh
    public final void fl(hlr hlrVar) {
        this.b = hlrVar;
    }

    @Override // defpackage.hnk
    public final void fm(hlt hltVar) {
        this.c = hltVar;
    }

    @Override // defpackage.hnk
    public final void fn(ifn ifnVar) {
    }

    protected boolean g() {
        return !this.e;
    }

    @Override // defpackage.hnj
    public final boolean fo(hnl hnlVar) {
        int i = hnlVar.A;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 1) {
                this.f = c(hnlVar.b, this.a);
                j();
                return false;
            } else if (i2 == 10) {
                CharSequence charSequence = hnlVar.p;
                int i3 = hnlVar.B;
                if (!this.f || TextUtils.isEmpty(charSequence) || i3 == 1) {
                    j();
                } else {
                    if (this.b != null && this.j && !TextUtils.isEmpty(charSequence) && d(Character.codePointAt(charSequence, 0))) {
                        int i4 = this.d ? this.g : 0;
                        CharSequence j = this.b.j(this.h.length() + i4);
                        if (j.subSequence(0, j.length() - i4).toString().contentEquals(this.h) && this.k != null) {
                            k();
                            this.k.b(hnl.j(" ", 1, this));
                            if (i3 == 3 || TextUtils.isEmpty(charSequence) || !b(Character.codePointBefore(charSequence, charSequence.length()))) {
                                j();
                            } else {
                                this.i = g();
                                this.j = e();
                                this.h.append(charSequence);
                            }
                        }
                    }
                    k();
                    if (i3 == 3) {
                    }
                    j();
                }
                return false;
            } else if (i2 == 16) {
                hqe hqeVar = hnlVar.f;
                this.g = hnlVar.g + hnlVar.h;
                if (this.f && hqeVar != hqe.IME) {
                    j();
                }
                return false;
            } else if (i2 == 24) {
                j();
                return false;
            } else if (i2 == 3) {
                hfd hfdVar = hnlVar.j;
                if (hfdVar != null && this.f && (this.i || this.j)) {
                    iay iayVar = hfdVar.b[0];
                    if ((iayVar.e instanceof CharSequence) && iayVar.d != null && (iaz.i(iayVar.c) || iayVar.c > 0)) {
                        j();
                    }
                }
                return false;
            } else if (i2 != 4) {
                return false;
            } else {
                CharSequence charSequence2 = hnlVar.p;
                if (this.f && !this.e && !TextUtils.isEmpty(charSequence2)) {
                    if (this.b != null && this.i) {
                        if (this.b.j(this.h.length()).toString().contentEquals(this.h)) {
                            l();
                            gwv gwvVar = this.k;
                            if (gwvVar != null) {
                                gwvVar.b(hnl.j(" ", 1, this));
                            }
                            hlt hltVar = this.c;
                            if (hltVar != null) {
                                hltVar.hO().e(hlw.SPACE_INSERTED_BEFORE_NEXT_COMPOSING, new Object[0]);
                            }
                        }
                    }
                    l();
                }
                return false;
            }
        }
        throw null;
    }
}
