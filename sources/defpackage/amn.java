package defpackage;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;

/* compiled from: PG */
/* renamed from: amn  reason: default package */
/* loaded from: classes.dex */
public final class amn extends asj {
    final /* synthetic */ opu a;

    public amn(opu opuVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = opuVar;
    }

    @Override // defpackage.asj
    public final Object a() {
        return new PorterDuffColorFilter(((esg) this.a.a).a.getDefaultColor(), PorterDuff.Mode.SRC_IN);
    }
}
