package defpackage;

import android.content.Context;
import android.text.TextUtils;

/* compiled from: PG */
/* renamed from: ikx  reason: default package */
/* loaded from: classes.dex */
final class ikx implements iku {
    private final /* synthetic */ int a;

    public ikx(int i) {
        this.a = i;
    }

    @Override // defpackage.iku
    public final long a(Context context, ika ikaVar, String str, String str2) {
        if (this.a == 0) {
            ikh ikhVar = new ikh();
            try {
                long b = ikhVar.b(new ika(ikaVar.a, str, str2, ikaVar.d));
                ikhVar.close();
                return b;
            } catch (Throwable th) {
                try {
                    ikhVar.close();
                } catch (Throwable th2) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                }
                throw th;
            }
        }
        ijz.d(context, ikaVar, str, str2);
        return -1L;
    }

    @Override // defpackage.iku
    public final void b(Context context, ika ikaVar) {
        if (this.a != 0) {
            if (TextUtils.isEmpty(ikaVar.b)) {
                return;
            }
            ijz.c(context, ikaVar.b, ikaVar.c);
        } else if (ikaVar.a == -1) {
        } else {
            ikh ikhVar = new ikh();
            try {
                ikhVar.e(ikaVar.a);
                ikhVar.close();
            } catch (Throwable th) {
                try {
                    ikhVar.close();
                } catch (Throwable th2) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                }
                throw th;
            }
        }
    }
}
