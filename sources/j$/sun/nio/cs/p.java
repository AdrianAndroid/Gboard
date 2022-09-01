package j$.sun.nio.cs;

import java.nio.Buffer;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;

/* loaded from: classes3.dex */
public final class p extends q {
    public static final p a = new p();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p() {
        super("UTF-8", new String[]{"UTF8", "unicode-1-1-utf-8"});
        int i = d.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void a(Buffer buffer, int i, Buffer buffer2, int i2) {
        buffer.position(i - buffer.arrayOffset());
        buffer2.position(i2 - buffer2.arrayOffset());
    }

    @Override // java.nio.charset.Charset
    public final CharsetDecoder newDecoder() {
        return new n(this);
    }

    @Override // java.nio.charset.Charset
    public final CharsetEncoder newEncoder() {
        return new o(this);
    }
}
