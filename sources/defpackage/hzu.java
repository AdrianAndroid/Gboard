package defpackage;

import android.content.Context;
import android.util.AttributeSet;

/* compiled from: PG */
/* renamed from: hzu  reason: default package */
/* loaded from: classes.dex */
public abstract class hzu implements hzv {
    protected Object a;
    protected Object b;

    public hzu(Object obj) {
        this.b = obj;
        this.a = obj;
    }

    protected abstract Object a(Context context, String str, lfy lfyVar);

    @Override // defpackage.hzv
    public void b(Context context, AttributeSet attributeSet, int i, String str, lfy lfyVar) {
        if (str == null) {
            str = attributeSet.getAttributeValue(i);
        }
        c(context, str, lfyVar);
    }

    @Override // defpackage.hzv
    public final void c(Context context, String str, lfy lfyVar) {
        Object a = a(context, str, lfyVar);
        if (a == null) {
            a = this.b;
        }
        this.a = a;
    }

    @Override // defpackage.hzv
    public final void d() {
        this.a = this.b;
    }

    @Override // defpackage.hzv
    public final void e(Context context, String str, lfy lfyVar) {
        Object a = a(context, str, lfyVar);
        if (a != null) {
            this.b = a;
        }
    }
}
