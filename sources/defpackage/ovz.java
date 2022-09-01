package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;

/* compiled from: PG */
/* renamed from: ovz  reason: default package */
/* loaded from: classes2.dex */
final class ovz implements owa {
    private final Charset a;
    private final boolean b;

    public ovz(Charset charset, boolean z) {
        this.a = charset;
        this.b = z;
    }

    @Override // defpackage.owa
    public final String a(byte[] bArr) {
        CharsetDecoder replaceWith;
        if (!this.b) {
            replaceWith = this.a.newDecoder().onMalformedInput(CodingErrorAction.REPORT).onUnmappableCharacter(CodingErrorAction.REPORT);
        } else {
            replaceWith = this.a.newDecoder().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE).replaceWith("?");
        }
        return replaceWith.decode(ByteBuffer.wrap(bArr)).toString();
    }
}
