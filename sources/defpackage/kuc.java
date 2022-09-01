package defpackage;

import android.util.Property;
import android.view.View;

/* compiled from: PG */
/* renamed from: kuc  reason: default package */
/* loaded from: classes.dex */
final class kuc extends Property {
    public kuc(Class cls) {
        super(cls, "paddingStart");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return Float.valueOf(aad.k((View) obj));
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        View view = (View) obj;
        aad.W(view, ((Float) obj2).intValue(), view.getPaddingTop(), aad.j(view), view.getPaddingBottom());
    }
}
