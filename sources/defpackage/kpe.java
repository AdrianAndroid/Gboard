package defpackage;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* renamed from: kpe  reason: default package */
/* loaded from: classes.dex */
public class kpe extends FilterInputStream implements InputStreamRetargetInterface {
    public kpe(InputStream inputStream) {
        super(inputStream);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return this.in.read(bArr);
    }

    @Override // j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }
}
