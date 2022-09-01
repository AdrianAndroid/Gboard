package defpackage;

import android.util.Property;
import android.view.View;

/* compiled from: PG */
/* renamed from: kud  reason: default package */
/* loaded from: classes.dex */
final class kud extends Property {
    public kud(Class cls) {
        super(cls, "paddingEnd");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return Float.valueOf(aad.j((View) obj));
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        View view = (View) obj;
        aad.W(view, aad.k(view), view.getPaddingTop(), ((Float) obj2).intValue(), view.getPaddingBottom());
    }
}
