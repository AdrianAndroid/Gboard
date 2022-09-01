package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* renamed from: jcn  reason: default package */
/* loaded from: classes.dex */
final class jcn implements TextUtils.EllipsizeCallback {
    final /* synthetic */ int[] a;

    public jcn(int[] iArr) {
        this.a = iArr;
    }

    @Override // android.text.TextUtils.EllipsizeCallback
    public final void ellipsized(int i, int i2) {
        int[] iArr = this.a;
        iArr[0] = i;
        iArr[1] = i2;
    }
}
