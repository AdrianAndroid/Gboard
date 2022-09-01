package j$.time.chrono;

import java.io.Serializable;

/* loaded from: classes3.dex */
public final class h extends a implements Serializable {
    public static final h a = new h();

    private h() {
    }

    public static boolean a(long j) {
        return (3 & j) == 0 && (j % 100 != 0 || j % 400 == 0);
    }
}
