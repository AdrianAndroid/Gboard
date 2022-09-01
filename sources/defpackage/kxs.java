package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;

/* compiled from: PG */
/* renamed from: kxs  reason: default package */
/* loaded from: classes.dex */
abstract class kxs {
    static final Matrix c = new Matrix();
    final Matrix d = new Matrix();

    public abstract void a(Matrix matrix, kwx kwxVar, int i, Canvas canvas);

    public final void c(kwx kwxVar, int i, Canvas canvas) {
        a(c, kwxVar, i, canvas);
    }
}
