package defpackage;

import android.util.Property;
import android.view.View;

/* compiled from: PG */
/* renamed from: kub  reason: default package */
/* loaded from: classes.dex */
final class kub extends Property {
    public kub(Class cls) {
        super(cls, "height");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return Float.valueOf(((View) obj).getLayoutParams().height);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        View view = (View) obj;
        view.getLayoutParams().height = ((Float) obj2).intValue();
        view.requestLayout();
    }
}
