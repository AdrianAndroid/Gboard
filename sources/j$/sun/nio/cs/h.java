package j$.sun.nio.cs;

import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;

/* loaded from: classes3.dex */
public final class h extends Charset {
    public static final /* synthetic */ int a = 0;

    static {
        new h();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h() {
        super("US-ASCII", new String[]{"iso-ir-6", "ANSI_X3.4-1986", "ISO_646.irv:1991", "ASCII", "ISO646-US", "us", "IBM367", "cp367", "csASCII", "default", "646", "iso_646.irv:1983", "ANSI_X3.4-1968", "ascii7"});
        int i = d.a;
    }

    @Override // java.nio.charset.Charset
    public final boolean contains(Charset charset) {
        return charset instanceof h;
    }

    @Override // java.nio.charset.Charset
    public final CharsetDecoder newDecoder() {
        return new f(this);
    }

    @Override // java.nio.charset.Charset
    public final CharsetEncoder newEncoder() {
        return new g(this);
    }
}
