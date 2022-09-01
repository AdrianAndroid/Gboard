package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.TextAttribute;
import java.util.List;

/* compiled from: PG */
/* renamed from: gxa  reason: default package */
/* loaded from: classes.dex */
public abstract class gxa extends hlv {
    private static final ltg g = ltg.j("com/google/android/libraries/inputmethod/composingtextrecomposer/ComposingTextRecomposer");
    protected final Context a;
    protected int b;
    protected int c;
    public Runnable d;
    public TextAttribute e;
    private CharSequence h;

    public gxa(Context context, hls hlsVar) {
        super(hlsVar);
        this.a = context;
    }

    private final void z(CharSequence charSequence, int i, int i2) {
        q();
        if (TextUtils.isEmpty(charSequence)) {
            u();
        } else if (i < 0 || i2 < 0 || i + i2 != charSequence.length()) {
            ((ltd) ((ltd) g.d()).k("com/google/android/libraries/inputmethod/composingtextrecomposer/ComposingTextRecomposer", "updateLastComposingText", 184, "ComposingTextRecomposer.java")).J("Invalid beforeLength (%d) or afterLength (%d) with textLength (%d)", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(charSequence.length()));
            u();
        } else {
            this.h = charSequence;
            this.b = i;
            this.c = i2;
        }
    }

    @Override // defpackage.hlv, defpackage.hlq
    public final void f(int i, int i2, CharSequence charSequence) {
        z(charSequence, i, i2);
        super.f(i, i2, k(charSequence));
    }

    @Override // defpackage.hlv, defpackage.hlq
    public final void g(CharSequence charSequence, int i) {
        int i2 = 0;
        int length = charSequence == null ? 0 : charSequence.length();
        int i3 = i > 0 ? 0 : length;
        if (i > 0) {
            i2 = length;
        }
        z(charSequence, i2, i3);
        v(charSequence, i);
    }

    @Override // defpackage.hlv, defpackage.hlq
    public final void hU(CompletionInfo completionInfo) {
        u();
        super.hU(completionInfo);
    }

    @Override // defpackage.hlv, defpackage.hlq
    public final void hV(CharSequence charSequence, boolean z, int i) {
        u();
        super.hV(charSequence, z, i);
    }

    @Override // defpackage.hlv, defpackage.hlq
    public final void hW() {
        u();
        super.hW();
    }

    @Override // defpackage.hlv, defpackage.hlq
    public final void hX(int i, int i2, CharSequence charSequence, boolean z) {
        if (z) {
            z(charSequence, charSequence == null ? 0 : charSequence.length(), 0);
        }
        super.hX(i, i2, charSequence, z);
    }

    @Override // defpackage.hlv, defpackage.hlq
    public final void hY(boolean z) {
        r();
        super.hY(z);
        if (!z) {
            s(null, null);
        }
    }

    @Override // defpackage.hlv, defpackage.hlq
    public final void hu(int i, int i2, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, CharSequence charSequence5) {
        z(TextUtils.concat(charSequence4, charSequence5), i, i2);
        super.hu(i, i2, charSequence, charSequence2, charSequence3, charSequence4, charSequence5);
    }

    protected abstract CharSequence k(CharSequence charSequence);

    @Override // defpackage.hlv, defpackage.hlq
    public final void l(List list, hln hlnVar, boolean z) {
        super.l(list, hlnVar, z);
        s(list, hlnVar);
    }

    protected abstract void m();

    public final void p() {
        if (w()) {
            m();
            CharSequence charSequence = this.h;
            int i = this.b;
            int i2 = this.c;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            int i3 = 0;
            if (i == 0 || i2 == 0) {
                if (i > 0) {
                    i3 = 1;
                }
                v(charSequence, i3);
                return;
            }
            x();
            v(charSequence, 0);
            M(i, i);
            D();
        }
    }

    protected abstract void q();

    protected void r() {
    }

    protected abstract void s(List list, hln hlnVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public final void t(long j) {
        Runnable runnable = this.d;
        if (runnable != null) {
            kki.k(runnable);
            this.d = null;
        }
        if (j == 0) {
            p();
            return;
        }
        fqa fqaVar = new fqa(this, 20);
        this.d = fqaVar;
        kki.i(fqaVar, j);
    }

    public void u() {
        this.h = null;
        this.b = 0;
        this.c = 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void v(CharSequence charSequence, int i) {
        CharSequence k = k(charSequence);
        if (this.e == null || !li.f()) {
            super.g(k, i);
        } else {
            super.S(k, i, this.e);
        }
    }

    protected abstract boolean w();
}
