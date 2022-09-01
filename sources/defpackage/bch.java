package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.io.File;

/* compiled from: PG */
/* renamed from: bch  reason: default package */
/* loaded from: classes.dex */
public final class bch implements avc {
    private final /* synthetic */ int a;

    public bch(int i) {
        this.a = i;
    }

    @Override // defpackage.avc
    public final /* synthetic */ boolean b(Object obj, ava avaVar) {
        int i = this.a;
        if (i == 0) {
            Drawable drawable = (Drawable) obj;
            return true;
        } else if (i != 1) {
            File file = (File) obj;
            return true;
        } else {
            Bitmap bitmap = (Bitmap) obj;
            return true;
        }
    }

    @Override // defpackage.avc
    public final /* synthetic */ axh a(Object obj, int i, int i2, ava avaVar) {
        int i3 = this.a;
        if (i3 != 0) {
            if (i3 == 1) {
                return new bcc((Bitmap) obj, 1);
            }
            return new baj((File) obj);
        }
        return bcf.g((Drawable) obj);
    }
}
