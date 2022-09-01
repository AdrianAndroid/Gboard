package defpackage;

import android.content.Context;

/* compiled from: PG */
/* renamed from: hzx  reason: default package */
/* loaded from: classes.dex */
public final class hzx extends hzu {
    private final Class c;

    public hzx(Class cls, Enum[] enumArr) {
        super(enumArr);
        this.c = cls;
    }

    @Override // defpackage.hzu
    protected final /* bridge */ /* synthetic */ Object a(Context context, String str, lfy lfyVar) {
        return jgd.s(str, lfyVar, this.c);
    }
}
