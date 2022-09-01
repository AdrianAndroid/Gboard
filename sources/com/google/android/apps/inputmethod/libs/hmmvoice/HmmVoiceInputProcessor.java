package com.google.android.apps.inputmethod.libs.hmmvoice;

import android.content.Context;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
public class HmmVoiceInputProcessor implements hnj, jbw {
    private static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/hmmvoice/HmmVoiceInputProcessor");
    private jby b;
    private String c;
    protected Context e;
    private boolean f;
    private gwv h;
    private boolean d = false;
    private int g = 0;

    private final void a(jbx jbxVar) {
        this.b.e(jbxVar);
    }

    @Override // defpackage.hnj
    public void ad(Context context, gwv gwvVar, iav iavVar) {
        this.e = context;
        this.f = iavVar.h;
        fbu fbuVar = new fbu(context, iavVar, this, new oxd(1));
        this.h = gwvVar;
        this.b = fbuVar;
    }

    @Override // defpackage.hnj
    public final boolean ar(hfd hfdVar) {
        iay iayVar = hfdVar.b[0];
        return iayVar.e != null || this.b.h(iayVar.c);
    }

    @Override // defpackage.jbw
    public final /* synthetic */ jbu b() {
        return jbu.a;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.b.b();
    }

    protected String d(String str) {
        return str;
    }

    public void e() {
        a(jbx.KEYBOARD_CHANGE);
    }

    @Override // defpackage.jbw
    public final void m() {
    }

    @Override // defpackage.jbw
    public final void q() {
        this.c = null;
        gwv gwvVar = this.h;
        if (gwvVar != null) {
            gwvVar.b(hnl.c(this));
            this.h.b(hnl.k("", this));
            this.h.b(hnl.l(this.g, 0, "", this));
            this.h.b(hnl.e(this));
        }
        fbr.c(this.d, false);
        this.g = 0;
    }

    @Override // defpackage.jbw
    public final /* synthetic */ void r() {
        lre.aK(this);
    }

    @Override // defpackage.jbw
    public final void s() {
        gwv gwvVar = this.h;
        if (gwvVar != null) {
            gwvVar.b(hnl.g(this));
        }
        boolean booleanValue = ((Boolean) fbh.f.c()).booleanValue();
        this.d = booleanValue;
        fbr.c(booleanValue, false);
        this.g = 0;
    }

    @Override // defpackage.jbw
    public final void t() {
        String str;
        if (this.h != null && (str = this.c) != null) {
            if (!str.isEmpty()) {
                if (!this.f) {
                    this.h.b(hnl.c(this));
                    this.h.b(hnl.k("", this));
                }
                this.h.b(hnl.j(this.c, 1, this));
                if (!this.f) {
                    this.h.b(hnl.e(this));
                }
            }
            this.c = null;
        }
        this.g = 0;
    }

    @Override // defpackage.jbw
    public final /* synthetic */ void u(bnq bnqVar) {
        lre.aL(this, bnqVar);
    }

    @Override // defpackage.jbw
    public final void v(bnq bnqVar, jbv jbvVar) {
        String str;
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (bns bnsVar : bnqVar.a) {
            if (!bnsVar.b.isEmpty()) {
                if (!bnsVar.c) {
                    sb.append(bnsVar.b);
                } else {
                    sb2.append(bnsVar.b);
                }
            }
        }
        this.c = d(sb.toString());
        String d = d(sb2.toString());
        boolean z = !TextUtils.isEmpty(this.c) || !this.f;
        boolean z2 = !TextUtils.isEmpty(d);
        gwv gwvVar = this.h;
        if (gwvVar != null) {
            if (z && z2) {
                gwvVar.b(hnl.c(this));
            }
            if (z2) {
                this.h.b(hnl.j(d, 1, this));
            }
            if (z) {
                this.h.b(hnl.k(this.c, this));
            }
            if (z && z2) {
                this.h.b(hnl.e(this));
            }
        }
        int length = this.g + sb2.length();
        this.g = length;
        if (length > 0 || ((str = this.c) != null && str.length() > 0)) {
            fbr.c(this.d, true);
        }
    }

    @Override // defpackage.hnj
    public final boolean fo(hnl hnlVar) {
        int i = hnlVar.A;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 1) {
                EditorInfo editorInfo = hnlVar.b;
                if (editorInfo == null) {
                    ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/hmmvoice/HmmVoiceInputProcessor", "doProcess", 69, "HmmVoiceInputProcessor.java")).t("Failed to process message due to missing EditorInfo field");
                } else {
                    this.b.a(editorInfo, hnlVar.c);
                }
                return false;
            } else if (i2 == 2) {
                e();
                return false;
            } else if (i2 == 3) {
                hfd hfdVar = hnlVar.j;
                return hfdVar != null && this.b.f(hfdVar);
            } else if (i2 == 16) {
                if (hnlVar.f != hqe.IME) {
                    a(jbx.SELECTION_CHANGE);
                }
                return false;
            } else if (i2 == 18) {
                this.c = null;
                a(jbx.ABORT_COMPOSING);
                return false;
            } else if (i2 != 24) {
                return false;
            } else {
                this.b.c();
                return false;
            }
        }
        throw null;
    }
}
