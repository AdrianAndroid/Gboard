package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* renamed from: jji  reason: default package */
/* loaded from: classes.dex */
public final class jji {
    public Uri a;
    public String b;
    public jjh c;
    public int d;
    public llp e;
    public lfb f;
    public byte g;

    public jji() {
    }

    public jji(byte[] bArr) {
        this.f = ldu.a;
    }

    public final void a(jjh jjhVar) {
        if (jjhVar != null) {
            this.c = jjhVar;
            return;
        }
        throw new NullPointerException("Null downloadConstraints");
    }

    public final void b(llp llpVar) {
        if (llpVar != null) {
            this.e = llpVar;
            return;
        }
        throw new NullPointerException("Null extraHttpHeaders");
    }

    public final void c(int i) {
        this.d = i;
        this.g = (byte) 1;
    }
}
