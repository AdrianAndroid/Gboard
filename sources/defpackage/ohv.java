package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ohv  reason: default package */
/* loaded from: classes2.dex */
public final class ohv implements nuo {
    private static final ThreadLocal a = new ThreadLocal();
    private final nhf b;
    private final ngz c;

    public ohv(ngz ngzVar) {
        this.c = ngzVar;
        this.b = ngzVar.I();
    }

    @Override // defpackage.nuo
    public final /* bridge */ /* synthetic */ InputStream a(Object obj) {
        return new ohu((ngz) obj, this.b);
    }

    @Override // defpackage.nuo
    public final /* bridge */ /* synthetic */ Object b(InputStream inputStream) {
        byte[] bArr;
        if (inputStream instanceof ohu) {
            ohu ohuVar = (ohu) inputStream;
            if (ohuVar.b == this.b) {
                try {
                    ngz ngzVar = ohuVar.a;
                    if (ngzVar != null) {
                        return ngzVar;
                    }
                    throw new IllegalStateException("message not available");
                } catch (IllegalStateException unused) {
                }
            }
        }
        try {
            ner nerVar = null;
            if (inputStream instanceof nts) {
                int available = inputStream.available();
                if (available > 0 && available <= 4194304) {
                    ThreadLocal threadLocal = a;
                    Reference reference = (Reference) threadLocal.get();
                    if (reference == null || (bArr = (byte[]) reference.get()) == null || bArr.length < available) {
                        bArr = new byte[available];
                        threadLocal.set(new WeakReference(bArr));
                    }
                    int i = available;
                    while (i > 0) {
                        int read = inputStream.read(bArr, available - i, i);
                        if (read == -1) {
                            break;
                        }
                        i -= read;
                    }
                    if (i != 0) {
                        throw new RuntimeException("size inaccurate: " + available + " != " + (available - i));
                    }
                    nerVar = ner.J(bArr, available);
                } else if (available == 0) {
                    return this.c;
                }
            }
            if (nerVar == null) {
                nerVar = ner.H(inputStream);
            }
            nerVar.c = Integer.MAX_VALUE;
            try {
                Object f = this.b.f(nerVar, ohw.a);
                try {
                    nerVar.z(0);
                    return f;
                } catch (ngd e) {
                    throw e;
                }
            } catch (ngd e2) {
                throw nvu.k.f("Invalid protobuf byte sequence").e(e2).h();
            }
        } catch (IOException e3) {
            throw new RuntimeException(e3);
        }
    }
}
