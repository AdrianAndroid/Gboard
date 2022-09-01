package defpackage;

import android.util.Property;
import android.view.View;

/* compiled from: PG */
/* renamed from: gta  reason: default package */
/* loaded from: classes.dex */
final class gta extends Property {
    public gta(Class cls) {
        super(cls, "scale");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return Float.valueOf(((View) obj).getScaleX());
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        View view = (View) obj;
        Float f = (Float) obj2;
        view.setScaleX(f.floatValue());
        view.setScaleY(f.floatValue());
    }
}
