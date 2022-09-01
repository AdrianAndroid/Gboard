package j$.sun.nio.cs;

import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;

/* loaded from: classes3.dex */
public final class l extends q {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l() {
        super("UTF-16BE", new String[]{"UTF_16BE", "ISO-10646-UCS-2", "X-UTF-16BE", "UnicodeBigUnmarked"});
        int i = d.a;
    }

    @Override // java.nio.charset.Charset
    public final CharsetDecoder newDecoder() {
        return new i(this, 1);
    }

    @Override // java.nio.charset.Charset
    public final CharsetEncoder newEncoder() {
        return new j(this, 1);
    }
}
