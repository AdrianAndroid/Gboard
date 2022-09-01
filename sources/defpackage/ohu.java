package defpackage;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* renamed from: ohu  reason: default package */
/* loaded from: classes2.dex */
public final class ohu extends InputStream implements InputStreamRetargetInterface, nts {
    public ngz a;
    public final nhf b;
    public ByteArrayInputStream c;

    public ohu(ngz ngzVar, nhf nhfVar) {
        this.a = ngzVar;
        this.b = nhfVar;
    }

    @Override // java.io.InputStream
    public final int available() {
        ngz ngzVar = this.a;
        if (ngzVar != null) {
            return ngzVar.s();
        }
        ByteArrayInputStream byteArrayInputStream = this.c;
        if (byteArrayInputStream == null) {
            return 0;
        }
        return byteArrayInputStream.available();
    }

    @Override // java.io.InputStream
    public final int read() {
        ngz ngzVar = this.a;
        if (ngzVar != null) {
            this.c = new ByteArrayInputStream(ngzVar.q());
            this.a = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read();
        }
        return -1;
    }

    @Override // j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        ngz ngzVar = this.a;
        if (ngzVar != null) {
            int s = ngzVar.s();
            if (s == 0) {
                this.a = null;
                this.c = null;
                return -1;
            } else if (i2 >= s) {
                Cnew ak = Cnew.ak(bArr, i, s);
                this.a.ii(ak);
                ak.al();
                this.a = null;
                this.c = null;
                return s;
            } else {
                this.c = new ByteArrayInputStream(this.a.q());
                this.a = null;
            }
        }
        ByteArrayInputStream byteArrayInputStream = this.c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read(bArr, i, i2);
        }
        return -1;
    }
}
