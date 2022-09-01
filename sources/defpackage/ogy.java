package defpackage;

import java.security.Provider;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* compiled from: PG */
/* renamed from: ogy  reason: default package */
/* loaded from: classes2.dex */
final class ogy extends ohb {
    private final int d;
    private final mnl e;
    private final mnl f;
    private final mnl g;
    private final mnl h;

    public ogy(mnl mnlVar, mnl mnlVar2, mnl mnlVar3, mnl mnlVar4, Provider provider, int i, byte[] bArr, byte[] bArr2) {
        super(provider);
        this.e = mnlVar;
        this.f = mnlVar2;
        this.g = mnlVar3;
        this.h = mnlVar4;
        this.d = i;
    }

    @Override // defpackage.ohb
    public final String a(SSLSocket sSLSocket) {
        byte[] bArr;
        if (this.g.f(sSLSocket) && (bArr = (byte[]) this.g.e(sSLSocket, new Object[0])) != null) {
            return new String(bArr, ohe.b);
        }
        return null;
    }

    @Override // defpackage.ohb
    public final void b(SSLSocket sSLSocket, String str, List list) {
        if (str != null) {
            this.e.g(sSLSocket, true);
            this.f.g(sSLSocket, str);
        }
        if (this.h.f(sSLSocket)) {
            this.h.e(sSLSocket, e(list));
        }
    }

    @Override // defpackage.ohb
    public final int c() {
        return this.d;
    }
}
