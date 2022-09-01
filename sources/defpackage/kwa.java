package defpackage;

import android.util.Property;

/* compiled from: PG */
/* renamed from: kwa  reason: default package */
/* loaded from: classes.dex */
final class kwa extends Property {
    public kwa(Class cls) {
        super(cls, "growFraction");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return Float.valueOf(((kwb) obj).c());
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        ((kwb) obj).e(((Float) obj2).floatValue());
    }
}
