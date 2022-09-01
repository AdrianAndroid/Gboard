package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* renamed from: nwx  reason: default package */
/* loaded from: classes2.dex */
final class nwx {
    final InputStream a = null;
    final byte[] b;
    final int c;
    final boolean d;

    public nwx(byte[] bArr, int i, boolean z) {
        this.b = bArr;
        this.c = i;
        this.d = z;
    }

    public final String toString() {
        int i = this.c;
        String str = true != this.d ? "]" : "(last)]";
        return "TransactionData[" + i + "b array" + str;
    }
}
