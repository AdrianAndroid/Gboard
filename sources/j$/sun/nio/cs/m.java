package j$.sun.nio.cs;

import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;

/* loaded from: classes3.dex */
public final class m extends q {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m() {
        super("UTF-16LE", new String[]{"UTF_16LE", "X-UTF-16LE", "UnicodeLittleUnmarked"});
        int i = d.a;
    }

    @Override // java.nio.charset.Charset
    public final CharsetDecoder newDecoder() {
        return new i(this, 2);
    }

    @Override // java.nio.charset.Charset
    public final CharsetEncoder newEncoder() {
        return new j(this, 2);
    }
}
