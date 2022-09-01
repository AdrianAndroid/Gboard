package defpackage;

import android.content.Context;
import android.util.AttributeSet;

/* compiled from: PG */
/* renamed from: hzw  reason: default package */
/* loaded from: classes.dex */
public final class hzw extends hzu {
    public hzw(Boolean bool) {
        super(bool);
    }

    @Override // defpackage.hzu
    protected final /* synthetic */ Object a(Context context, String str, lfy lfyVar) {
        return Boolean.valueOf(str);
    }

    @Override // defpackage.hzu, defpackage.hzv
    public final void b(Context context, AttributeSet attributeSet, int i, String str, lfy lfyVar) {
        this.a = Boolean.valueOf(attributeSet.getAttributeBooleanValue(i, ((Boolean) this.b).booleanValue()));
    }
}
