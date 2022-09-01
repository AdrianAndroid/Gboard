package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.List;

/* compiled from: PG */
/* renamed from: kxm  reason: default package */
/* loaded from: classes.dex */
final class kxm extends kxs {
    final /* synthetic */ List a;
    final /* synthetic */ Matrix b;

    public kxm(List list, Matrix matrix) {
        this.a = list;
        this.b = matrix;
    }

    @Override // defpackage.kxs
    public final void a(Matrix matrix, kwx kwxVar, int i, Canvas canvas) {
        for (kxs kxsVar : this.a) {
            kxsVar.a(this.b, kwxVar, i, canvas);
        }
    }
}
