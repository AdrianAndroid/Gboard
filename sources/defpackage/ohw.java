package defpackage;

import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* renamed from: ohw  reason: default package */
/* loaded from: classes2.dex */
public final class ohw {
    static volatile nfb a = nfb.a();

    public static long a(InputStream inputStream, OutputStream outputStream) {
        jdg.Q(outputStream, "outputStream cannot be null!");
        byte[] bArr = new byte[8192];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += read;
        }
    }

    public static nuo b(ngz ngzVar) {
        return new ohv(ngzVar);
    }
}
