package defpackage;

import android.graphics.Bitmap;
import java.io.IOException;

/* compiled from: PG */
/* renamed from: bbq  reason: default package */
/* loaded from: classes.dex */
final class bbq implements bbd {
    private final bbp a;
    private final bfz b;

    public bbq(bbp bbpVar, bfz bfzVar) {
        this.a = bbpVar;
        this.b = bfzVar;
    }

    @Override // defpackage.bbd
    public final void a(axp axpVar, Bitmap bitmap) {
        IOException iOException = this.b.c;
        if (iOException != null) {
            if (bitmap != null) {
                axpVar.d(bitmap);
            }
            throw iOException;
        }
    }

    @Override // defpackage.bbd
    public final void b() {
        this.a.a();
    }
}
