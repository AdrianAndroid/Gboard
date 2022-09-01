package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* renamed from: hcj  reason: default package */
/* loaded from: classes.dex */
public final class hcj {
    public llp a;
    public llp b;
    public byte c;
    public dxe d;
    private Optional e;
    private boolean f;

    public hcj(byte[] bArr) {
        this.e = Optional.empty();
    }

    public final hck a() {
        llp llpVar;
        if (this.c != 3 || (llpVar = this.b) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.b == null) {
                sb.append(" itemProviders");
            }
            if ((this.c & 1) == 0) {
                sb.append(" stickyVariantsEnabled");
            }
            if ((this.c & 2) == 0) {
                sb.append(" itemFetchingTimeoutMs");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new hck(this.a, this.d, llpVar, this.e, this.f, null, null, null);
    }

    public final void b(boolean z) {
        this.f = z;
        this.c = (byte) (this.c | 1);
    }

    public hcj() {
    }
}
