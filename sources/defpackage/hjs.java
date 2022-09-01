package defpackage;

import android.graphics.Bitmap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: hjs  reason: default package */
/* loaded from: classes.dex */
final class hjs extends axx {
    public final AtomicBoolean a = new AtomicBoolean(true);

    public hjs(int i) {
        super(i);
    }

    @Override // defpackage.axx, defpackage.axp
    public final synchronized void d(Bitmap bitmap) {
        if (this.a.get()) {
            super.d(bitmap);
        } else {
            bitmap.recycle();
        }
    }
}
