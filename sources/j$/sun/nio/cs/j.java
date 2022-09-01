package j$.sun.nio.cs;

import java.nio.charset.Charset;

/* loaded from: classes3.dex */
final class j extends s {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Charset charset, int i) {
        super(charset, 0, true);
        if (i != 1) {
            if (i != 2) {
                return;
            } else {
                super(charset, 1, false);
                return;
            }
        }
        super(charset, 0, false);
    }
}
