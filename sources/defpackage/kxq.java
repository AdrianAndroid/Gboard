package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;

/* compiled from: PG */
/* renamed from: kxq  reason: default package */
/* loaded from: classes.dex */
public final class kxq extends kxr {
    public float a;
    public float b;

    @Override // defpackage.kxr
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.g;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.a, this.b);
        path.transform(matrix);
    }
}
