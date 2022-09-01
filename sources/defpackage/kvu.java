package defpackage;

import android.util.Property;

/* compiled from: PG */
/* renamed from: kvu  reason: default package */
/* loaded from: classes.dex */
final class kvu extends Property {
    public kvu(Class cls) {
        super(cls, "completeEndFraction");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        int[] iArr = kvv.a;
        return Float.valueOf(((kvv) obj).h);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        float floatValue = ((Float) obj2).floatValue();
        int[] iArr = kvv.a;
        ((kvv) obj).h = floatValue;
    }
}
