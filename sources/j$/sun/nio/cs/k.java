package j$.sun.nio.cs;

import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;

/* loaded from: classes3.dex */
public final class k extends q {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k() {
        super("UTF-16", new String[]{"UTF_16", "utf16", "unicode", "UnicodeBig"});
        int i = d.a;
    }

    @Override // java.nio.charset.Charset
    public final CharsetDecoder newDecoder() {
        return new i(this, 0);
    }

    @Override // java.nio.charset.Charset
    public final CharsetEncoder newEncoder() {
        return new j(this, 0);
    }
}
