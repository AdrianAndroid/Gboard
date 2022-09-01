package j$.sun.nio.cs;

import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;

/* loaded from: classes3.dex */
public final class c extends Charset {
    public static final c a = new c();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c() {
        super("ISO-8859-1", new String[]{"iso-ir-100", "ISO_8859-1", "latin1", "l1", "IBM819", "cp819", "csISOLatin1", "819", "IBM-819", "ISO8859_1", "ISO_8859-1:1987", "ISO_8859_1", "8859_1", "ISO8859-1"});
        int i = d.a;
    }

    @Override // java.nio.charset.Charset
    public final boolean contains(Charset charset) {
        return (charset instanceof h) || (charset instanceof c);
    }

    @Override // java.nio.charset.Charset
    public final CharsetDecoder newDecoder() {
        return new a(this);
    }

    @Override // java.nio.charset.Charset
    public final CharsetEncoder newEncoder() {
        return new b(this);
    }
}
