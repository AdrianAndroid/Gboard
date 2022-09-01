package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;

/* compiled from: PG */
/* renamed from: btc  reason: default package */
/* loaded from: classes.dex */
public final class btc extends btw {
    private int g = 0;

    public btc(Context context, boolean z) {
        super(context, z);
    }

    @Override // defpackage.btw, defpackage.djf
    public final CharSequence a() {
        SpannableStringBuilder spannableStringBuilder = this.b;
        spannableStringBuilder.setSpan(a, this.g, spannableStringBuilder.length(), 256);
        return this.b;
    }

    @Override // defpackage.btw
    protected final String b() {
        return "  ";
    }

    @Override // defpackage.btw, defpackage.djf
    public final void c(dje djeVar) {
        super.c(djeVar);
        if (this.c == 0) {
            this.g = this.b.length();
        }
    }

    @Override // defpackage.btw, defpackage.djf
    public final void d() {
        super.d();
        this.g = 0;
    }

    @Override // defpackage.btw
    protected final boolean e(int i, boolean z, int i2, boolean z2, djj djjVar, djj djjVar2) {
        if (this.b.length() > 0) {
            return !z || !z2;
        }
        return false;
    }

    @Override // defpackage.btw
    protected final boolean f(int i, int i2, djj djjVar, djj djjVar2) {
        return false;
    }
}
