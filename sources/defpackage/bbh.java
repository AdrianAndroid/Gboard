package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.security.MessageDigest;

/* compiled from: PG */
/* renamed from: bbh  reason: default package */
/* loaded from: classes.dex */
public final class bbh implements ave {
    private final ave b;
    private final boolean c;

    public bbh(ave aveVar, boolean z) {
        this.b = aveVar;
        this.c = z;
    }

    @Override // defpackage.auw
    public final void a(MessageDigest messageDigest) {
        this.b.a(messageDigest);
    }

    @Override // defpackage.ave
    public final axh b(Context context, axh axhVar, int i, int i2) {
        axp axpVar = atb.b(context).a;
        Drawable drawable = (Drawable) axhVar.c();
        axh a = bbg.a(axpVar, drawable, i, i2);
        if (a != null) {
            axh b = this.b.b(context, a, i, i2);
            if (!b.equals(a)) {
                return bbn.f(context.getResources(), b);
            }
            b.e();
            return axhVar;
        } else if (!this.c) {
            return axhVar;
        } else {
            String valueOf = String.valueOf(drawable);
            throw new IllegalArgumentException("Unable to convert " + valueOf + " to a Bitmap");
        }
    }

    @Override // defpackage.auw
    public final boolean equals(Object obj) {
        if (obj instanceof bbh) {
            return this.b.equals(((bbh) obj).b);
        }
        return false;
    }

    @Override // defpackage.auw
    public final int hashCode() {
        return this.b.hashCode();
    }
}
