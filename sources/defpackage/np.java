package defpackage;

import android.support.v7.widget.SwitchCompat;
import android.util.Property;

/* compiled from: PG */
/* renamed from: np  reason: default package */
/* loaded from: classes2.dex */
public final class np extends Property {
    public np(Class cls) {
        super(cls, "thumbPos");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return Float.valueOf(((SwitchCompat) obj).a);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        ((SwitchCompat) obj).f(((Float) obj2).floatValue());
    }
}
