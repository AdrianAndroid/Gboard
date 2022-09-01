package defpackage;

import android.graphics.Matrix;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: kuh  reason: default package */
/* loaded from: classes.dex */
public final class kuh extends krv {
    final /* synthetic */ kup a;

    public kuh(kup kupVar) {
        this.a = kupVar;
    }

    @Override // defpackage.krv
    public final Matrix a(float f, Matrix matrix, Matrix matrix2) {
        this.a.y = f;
        return super.evaluate(f, matrix, matrix2);
    }

    @Override // defpackage.krv, android.animation.TypeEvaluator
    public final /* bridge */ /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
        return evaluate(f, (Matrix) obj, (Matrix) obj2);
    }
}
