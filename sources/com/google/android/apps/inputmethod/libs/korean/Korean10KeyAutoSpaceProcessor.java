package com.google.android.apps.inputmethod.libs.korean;

import android.content.Context;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class Korean10KeyAutoSpaceProcessor implements hnj, hnh {
    private ino a;
    private hlr b;
    private boolean c;
    private boolean d;
    private final StringBuilder e = new StringBuilder();
    private gwv f;

    private final void b() {
        c();
        gwv gwvVar = this.f;
        if (gwvVar != null) {
            gwvVar.b(hnl.j(" ", 1, this));
        }
    }

    private final void c() {
        this.d = false;
        this.e.setLength(0);
    }

    @Override // defpackage.hnj
    public final void ad(Context context, gwv gwvVar, iav iavVar) {
        this.a = ino.M(context);
        this.f = gwvVar;
    }

    @Override // defpackage.hnj
    public final boolean ar(hfd hfdVar) {
        return false;
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
    }

    @Override // defpackage.hnh
    public final void fl(hlr hlrVar) {
        this.b = hlrVar;
    }

    @Override // defpackage.hnj
    public final boolean fo(hnl hnlVar) {
        int i = hnlVar.A;
        int i2 = i - 1;
        if (i != 0) {
            boolean z = true;
            if (i2 == 1) {
                EditorInfo editorInfo = hnlVar.b;
                ino inoVar = this.a;
                if (!ham.Y(editorInfo) || !ham.al(editorInfo) || !inoVar.x(R.string.f160380_resource_name_obfuscated_res_0x7f140643, true)) {
                    z = false;
                }
                this.c = z;
                c();
                return false;
            } else if (i2 == 10) {
                CharSequence charSequence = hnlVar.p;
                int i3 = hnlVar.B;
                if (!this.c || TextUtils.isEmpty(charSequence) || i3 == 1) {
                    c();
                } else {
                    if (i3 == 3 && !TextUtils.isEmpty(charSequence)) {
                        int codePointBefore = Character.codePointBefore(charSequence, charSequence.length());
                        if (dmf.b((char) codePointBefore) != 0 || ".,;:!?)\\]}]".contains(String.valueOf(Character.toChars(codePointBefore)))) {
                            this.e.append(charSequence);
                        }
                    }
                    c();
                }
                return false;
            } else if (i2 == 12) {
                if (hnlVar.l) {
                    if (hnlVar.k.e == hlm.PREDICTION) {
                        b();
                    }
                    this.d = true;
                }
                return false;
            } else if (i2 == 16) {
                hqe hqeVar = hnlVar.f;
                if (this.c && hqeVar != hqe.IME) {
                    c();
                }
                return false;
            } else if (i2 == 24) {
                c();
                return false;
            } else if (i2 == 3) {
                hfd hfdVar = hnlVar.j;
                if (this.c && !dzg.i(hfdVar.b[0])) {
                    c();
                }
                return false;
            } else if (i2 != 4) {
                return false;
            } else {
                CharSequence charSequence2 = hnlVar.p;
                if (this.c && !TextUtils.isEmpty(charSequence2)) {
                    if (this.d) {
                        if (this.b.j(this.e.length()).toString().contentEquals(this.e)) {
                            b();
                            ieh.j().e(hlw.SPACE_INSERTED_BEFORE_NEXT_COMPOSING, new Object[0]);
                        }
                    }
                    c();
                }
                return false;
            }
        }
        throw null;
    }
}
