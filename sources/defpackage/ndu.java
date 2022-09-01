package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: PG */
/* renamed from: ndu  reason: default package */
/* loaded from: classes2.dex */
public abstract class ndu implements ngz {
    public int cO = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final nhz r() {
        return new nhz();
    }

    public int m() {
        throw null;
    }

    @Override // defpackage.ngz
    public final nem n() {
        try {
            int s = s();
            nem nemVar = nem.b;
            byte[] bArr = new byte[s];
            Cnew ai = Cnew.ai(bArr);
            ii(ai);
            return ndb.R(ai, bArr);
        } catch (IOException e) {
            String name = getClass().getName();
            throw new RuntimeException("Serializing " + name + " to a ByteString threw an IOException (should never happen).", e);
        }
    }

    public void o(int i) {
        throw null;
    }

    @Override // defpackage.ngz
    public final void p(OutputStream outputStream) {
        Cnew aj = Cnew.aj(outputStream, Cnew.U(s()));
        ii(aj);
        net netVar = (net) aj;
        if (netVar.c > 0) {
            netVar.i();
        }
    }

    @Override // defpackage.ngz
    public final byte[] q() {
        try {
            byte[] bArr = new byte[s()];
            Cnew ai = Cnew.ai(bArr);
            ii(ai);
            ai.al();
            return bArr;
        } catch (IOException e) {
            String name = getClass().getName();
            throw new RuntimeException("Serializing " + name + " to a byte array threw an IOException (should never happen).", e);
        }
    }
}
