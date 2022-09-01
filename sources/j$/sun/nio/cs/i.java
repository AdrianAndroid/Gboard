package j$.sun.nio.cs;

import java.nio.charset.Charset;

/* loaded from: classes3.dex */
final class i extends r {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Charset charset, int i) {
        super(charset, 0);
        if (i != 1) {
            if (i != 2) {
                return;
            } else {
                super(charset, 2);
                return;
            }
        }
        super(charset, 1);
    }
}
